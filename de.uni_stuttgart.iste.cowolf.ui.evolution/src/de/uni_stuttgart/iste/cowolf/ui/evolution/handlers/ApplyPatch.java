package de.uni_stuttgart.iste.cowolf.ui.evolution.handlers;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.gmt.modisco.xml.Attribute;
import org.eclipse.gmt.modisco.xml.Element;
import org.eclipse.gmt.modisco.xml.Node;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.sidiff.difference.asymmetric.AsymmetricDifference;
import org.sidiff.difference.asymmetric.facade.AsymmetricDiffFacade;
import org.sidiff.difference.matcher.IMatcher;
import org.sidiff.difference.matcher.util.MatcherUtil;
import org.sidiff.patching.PatchEngine;
import org.sidiff.patching.arguments.IArgumentManager;
import org.sidiff.patching.interrupt.IPatchInterruptHandler;
import org.sidiff.patching.transformation.ITransformationEngine;
import org.sidiff.patching.transformation.TransformationEngineUtil;
import org.sidiff.patching.ui.adapter.ModelAdapter;
import org.sidiff.patching.ui.adapter.ModelChangeHandler;
import org.sidiff.patching.ui.arguments.InteractiveArgumentManager;
import org.sidiff.patching.ui.arguments.InteractiveSymblArgumentManager;
import org.sidiff.patching.ui.handler.DialogPatchInterruptHandler;
import org.sidiff.patching.ui.view.OperationExplorerView;
import org.sidiff.patching.ui.view.ReportView;
import org.silift.common.util.access.EMFModelAccessEx;
import org.silift.common.util.emf.Scope;
import org.silift.common.util.file.ZipUtil;
import org.silift.patching.patch.Manifest;
import org.silift.patching.patch.Patch;
import org.silift.patching.settings.ExecutionMode;
import org.silift.patching.settings.PatchMode;
import org.silift.patching.settings.PatchingSettings;
import org.silift.patching.settings.PatchingSettings.ValidationMode;

import de.uni_stuttgart.iste.cowolf.core.ModelAssociation.Model;
import de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelAssociation;
import de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelAssociationFactory;

public class ApplyPatch extends AbstractHandler {
	
	public static final String ARCHIVE_URI_PREFIX = "archive:file:///";
	public static final String ARCHIVE_SEPERATOR = "!/";

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		final IWorkbenchWindow window = PlatformUI.getWorkbench()
                .getActiveWorkbenchWindow();

        IStructuredSelection selection = (IStructuredSelection) window
                .getSelectionService().getSelection();
        
        final IFile fileToOpen = (IFile) selection.getFirstElement();
        
        ModelAssociation ma = ModelAssociationFactory.eINSTANCE.getModelAssociation(fileToOpen.getProject());
        if (ma == null) {
        	return -1;
        }
        Model model = ma.getModelByPath(fileToOpen.getProjectRelativePath().toString());
        
        if (model == null) {
        	return -1;
        }
        
        FileDialog dialog = new FileDialog(window.getShell());
        dialog.setText("Select Patch File");
        dialog.setFilterExtensions(new String[] { "*.slp" });
        dialog.setFilterNames(new String[] { "CoWolf Model Patch (*.slp)" });
        
        String patchPath = dialog.open();
        if (patchPath == null) {
        	return -1;
        }
        
      //TODO own util class
		// Search asymmetric difference:
		URI uri_asymDiff = null;
		URI uri_manifest = null;
		for (String entry : ZipUtil.getEntries(patchPath)) {
			if (entry.endsWith(AsymmetricDiffFacade.ASYMMETRIC_DIFF_EXT)) {
				uri_asymDiff = URI.createURI(ARCHIVE_URI_PREFIX + patchPath + ARCHIVE_SEPERATOR + entry);
			}if(entry.endsWith("xml")){
				uri_manifest = URI.createURI(ARCHIVE_URI_PREFIX + patchPath + ARCHIVE_SEPERATOR + entry);
			}
		}
		// Load AsymmetricDifference
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource patchResource = resourceSet.getResource(uri_asymDiff, true);

		// Load Manifest
		Manifest manifest = loadManifest(uri_manifest);
		
		if (patchResource.getContents().size() == 0) {
			MessageDialog.openInformation(Display.getCurrent().getActiveShell(), "Error in patch model", "There is something wrong with this patch!");
			return null;
		}
		EObject root = patchResource.getContents().get(0);
		if (root instanceof AsymmetricDifference) {
			final AsymmetricDifference difference = (AsymmetricDifference) root;
			final Patch patch = new Patch(difference);
			
			PatchingSettings settings = new PatchingSettings();
			settings.setExecutionMode(ExecutionMode.INTERACTIVE);
			settings.setPatchMode(PatchMode.PATCHING);
			settings.setScope(Scope.RESOURCE);
			settings.setValidationMode(ValidationMode.NO_VALIDATION);
			
			Set<IMatcher> matchers = MatcherUtil.getAvailableMatchers(difference.getOriginModel(),
																	difference.getChangedModel());
			
			IMatcher matcher = null;
			for (IMatcher m : matchers) {
				if (m.getName().equals(manifest.getMatcherName())) {
					matcher = m;
					break;
				}
			}
			
			if (matcher == null) {
				MessageDialog.openError(
						PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
						"Patch Model Error", "Difference matcher '" + manifest.getMatcherName() + "' not found.");
				return -1;
			}
			
			settings.setMatcher(matcher);
			
			runPatch(fileToOpen, patch, settings);
			return 0;
		}
		else {
			MessageDialog.openError(
					PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
					"Patch Model Error","This is no patch model");
		}
        
        return null;
	}
	
	protected void runPatch(final IFile fileToOpen, final Patch patch, final PatchingSettings settings) {
		Job job = new Job("Patching Model") {
			private EditingDomain editingDomain;

			@Override
			protected IStatus run(IProgressMonitor monitor) {
				try {
					monitor.beginTask("Patching", 120);
					monitor.subTask("Opening editor for target resource");
					final AtomicReference<Resource> resourceResult = new AtomicReference<Resource>();
					Display.getDefault().syncExec(new Runnable() {
						@Override
						public void run() {
							try {
								
								IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
								
								IEditorPart editorPart = IDE.openEditor(page, fileToOpen);
								Resource resource = null;
								if (editorPart instanceof IEditingDomainProvider) {
									IEditingDomainProvider editor = (IEditingDomainProvider) editorPart;
									resource = editor.getEditingDomain().getResourceSet().getResources().get(0);
									editingDomain = editor.getEditingDomain();
								}
								resourceResult.set(resource);
								
							} catch (PartInitException e) {
								e.printStackTrace();
							} 
						}
					});
					
					monitor.worked(20);

					// Use interactive argument manager
					IArgumentManager argumentManager;
					if(settings.useSymbolicLinks()){
						argumentManager = new InteractiveSymblArgumentManager(settings.getSymbolicLinkHandler());
					}else{
						argumentManager = new InteractiveArgumentManager(settings.getMatcher());
					}
					argumentManager.setMinReliability(settings.getMinReliability());
					settings.setArgumentManager(argumentManager);
					
					// Find transformation engine (no other available right now)
					String documentType = null;
					if (EMFModelAccessEx.isProfiled(resourceResult.get())) {
						documentType = EMFModelAccessEx.getBaseDocumentType(resourceResult.get());
					} else {
						documentType = EMFModelAccessEx.getCharacteristicDocumentType(resourceResult.get());
					}
					ITransformationEngine transformationEngine = TransformationEngineUtil
							.getFirstTransformationEngine(documentType);
					if (transformationEngine == null) {
						MessageDialog.openError(Display.getCurrent().getActiveShell(),
								"No Transformator Service found!", "No suitable Transformator Service found!");
						return Status.CANCEL_STATUS;
					}
					settings.setTransformationEngine(transformationEngine);
					
					// Patch interrupt handler
					IPatchInterruptHandler patchInterruptHandler = new DialogPatchInterruptHandler();
					settings.setInterruptHandler(patchInterruptHandler);
					
					
					monitor.subTask("Initialize PatchEngine");			
					final PatchEngine patchEngine = new PatchEngine(patch.getDifference(), resourceResult.get(), settings);
	
					patchEngine.setPatchedEditingDomain(editingDomain);
					monitor.worked(60);

					monitor.subTask("Opening SiLift Perspective");
					final AtomicReference<OperationExplorerView> operationExplorerViewReference = new AtomicReference<OperationExplorerView>();
					final AtomicReference<ReportView> reportViewReference = new AtomicReference<ReportView>();
					Display.getDefault().syncExec(new Runnable() {

						@Override
						public void run() {
							try {
								//Activator.getDefault().getWorkbench().showPerspective(SiLiftPerspective.ID,  PlatformUI.getWorkbench().getActiveWorkbenchWindow()); 
								
								
								//Opening and setting operation explorer view
								OperationExplorerView operationExplorerView = (OperationExplorerView) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView(OperationExplorerView.ID);
								operationExplorerView.setPatchEngine(patchEngine);
								operationExplorerViewReference.set(operationExplorerView);
								
								//Opening and setting report view
								ReportView reportView = (ReportView) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView(ReportView.ID);
								reportView.setPatchReportManager(patchEngine.getPatchReportManager());
								reportViewReference.set(reportView);
								
							} catch (PartInitException e) {
								e.printStackTrace();
							}
						}
					});
					OperationExplorerView operationExplorerView = operationExplorerViewReference.get();
					ReportView reportView = reportViewReference.get();
					monitor.worked(20);

					// ModelChangeHandler works independent; PatchView is
					// interested in model changes
					monitor.subTask("Adding Modellistener");
					ModelAdapter adapter = new ModelAdapter(resourceResult.get());
					adapter.addListener(new ModelChangeHandler(argumentManager));
					adapter.addListener(operationExplorerView);
					monitor.worked(20);
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					monitor.done();
				}

				return Status.OK_STATUS;
			}
		};
		job.setUser(true);
		job.schedule();
	}
	
	/** loads the settings stored in the manifest.xml
	 * @param uri
	 * @return
	 */
	public Manifest loadManifest(URI uri){
		// Load Resource
		ResourceSet resourceSet_Manifest = new ResourceSetImpl();
		Resource manifestResource = resourceSet_Manifest.getResource(uri, true);
		
		Manifest manifest = new Manifest();
		// Search for setting nodes
		for (Iterator<EObject> iterator = manifestResource.getAllContents(); iterator.hasNext();) {
			EObject eObject = (EObject) iterator.next();
			if(eObject instanceof Element){
				Element elem = (Element)eObject;
				if(elem.getName().equals("setting")){
					for(Node node : elem.getChildren()){
						if(node instanceof Attribute){
							Attribute attr = (Attribute)node;
							if(attr.getName().equals("matcher")){
								manifest.setMatcherName(attr.getValue());
							}else if(attr.getName().equals("symboliclinkhandler")){
								manifest.setSymbolicLinkHandlerName(attr.getValue());
							}
						}
					}
				}
			}
		}
		return manifest;
	}

}
