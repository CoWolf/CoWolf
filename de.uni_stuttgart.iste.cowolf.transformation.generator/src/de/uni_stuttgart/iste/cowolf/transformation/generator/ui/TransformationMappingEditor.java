package de.uni_stuttgart.iste.cowolf.transformation.generator.ui;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.xml.bind.JAXBException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.henshin.model.Parameter;
import org.eclipse.emf.henshin.model.Unit;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.part.EditorPart;
import org.sidiff.difference.rulebase.RecognitionRule;
import org.sidiff.difference.rulebase.RuleBase;
import org.sidiff.difference.rulebase.extension.IRuleBase;
import org.sidiff.difference.rulebase.util.RuleBaseUtil;

import de.uni_stuttgart.iste.cowolf.core.extensions.ExtensionHandler;
import de.uni_stuttgart.iste.cowolf.transformation.model.Mapping;
import de.uni_stuttgart.iste.cowolf.transformation.model.Mappings;
import de.uni_stuttgart.iste.cowolf.transformation.model.Param;
import de.uni_stuttgart.iste.cowolf.transformation.model.Params;
import de.uni_stuttgart.iste.cowolf.transformation.model.Rule;
import de.uni_stuttgart.iste.cowolf.transformation.model.util.XMLMappingLoader;

public class TransformationMappingEditor extends EditorPart {

	public TransformationMappingEditor() {
	}

	public static final String ID = "de.uni_stuttgart.iste.cowolf.transformation.generator.ui.TransformationMappingEditor";

	// private TransformationMappingEditorInput input;

	private boolean inputFileChanged;

	private IFile inputIFile;

	private Composite parent;

	private TreeViewer recognitionRulesTreeViewer;
	private TreeViewer transformationRulesTreeViewer;

	private TableViewer mappingsTableViewer;
	// private List<IFile> henshinTransformationRules;

	private IRuleBase[] registeredRulebases;

	// private List<TransformationMapping> transformationMappings = new
	// ArrayList<TransformationMapping>();

	private Composite topComposite;
	private Composite bottomComposite;

	private Mappings mappings;

	private RecognitionRule selectedRecognitionRule = null;
	private Unit selectedUnit = null;

	// private List<String> additionalRulebases = new ArrayList<String>();

	@Override
	public void doSave(IProgressMonitor monitor) {
		store(inputIFile.getLocation().toFile());
	}

	@Override
	public void doSaveAs() {

		FileDialog fileDialog = new FileDialog(parent.getShell());
		fileDialog
				.setText("Select where to store the Transformation Mapping file.");
		fileDialog.setFilterExtensions(new String[] { "*.transmap" });
		fileDialog
				.setFilterNames(new String[] { "Transformation Mapping File (*.transmap)" });
		String targetFile = fileDialog.open();
		store(new File(targetFile));

	}

	private void store(File targetFile) {

		Mappings mappings = new Mappings();

		for (TransformationMapping transformationMapping : transformationMappings) {

			Mapping mapping = new Mapping();
			// TODO via UI
			mapping.setPriority(1);
			String changeSetName = RecognitionRuleUtil
					.getChangeSetName(transformationMapping
							.getRecognitionRule());
			mapping.setDifference(changeSetName);
			Rule rule = new Rule();

			Unit unit = transformationMapping.getUnit();

			rule.setName(unit.getName());

			Params params = new Params();

			for (Parameter unitParameter : unit.getParameters()) {

				Param param = new Param();
				param.setName(unitParameter.getName());
				param.setPath(null);

				params.getParam().add(param);

			}

			mappings.getMapping().put(changeSetName, mapping);

		}

		try {
			XMLMappingLoader.storeMappings(mappings, targetFile);
		} catch (JAXBException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void init(IEditorSite site, IEditorInput input)
			throws PartInitException {

		if (!(input instanceof TransformationMappingEditorInput)) {
			throw new RuntimeException("Wrong input");
		}

		TransformationMappingEditorInput transformationMappingEditorInput = (TransformationMappingEditorInput) input;

		inputIFile = transformationMappingEditorInput.getFile();

		try {
			mappings = XMLMappingLoader.loadMapping(inputIFile.getLocation()
					.toFile());
		} catch (JAXBException e) {
			throw new RuntimeException(
					"File "
							+ transformationMappingEditorInput
									.getFormattedFilePath()
							+ " is not a valid Transformation Mapping file or does not exist.",
					e);
		}

		this.setSite(site);
		this.setInput(input);

	}

	@Override
	public boolean isDirty() {
		return this.inputFileChanged;
	}

	@Override
	public boolean isSaveAsAllowed() {
		return true;
	}

	@Override
	public void createPartControl(Composite parent) {

		this.parent = parent;

		FormToolkit toolkit = new FormToolkit(parent.getDisplay());

		ScrolledForm editorScrolledForm = toolkit.createScrolledForm(parent);

		// ToolBarManager manager = (ToolBarManager) form.getToolBarManager();
		toolkit.decorateFormHeading(editorScrolledForm.getForm());

		// IMenuService menuService = (IMenuService) this.getSite().getService(
		// IMenuService.class);
		// menuService.populateContributionManager(manager,
		// "popup:formsToolBar");
		// manager.update(true);

		editorScrolledForm.setText("CoWolf Transformation Mapping Editor");

		FillLayout editorLayout = new FillLayout(SWT.VERTICAL);
		editorLayout.spacing = 20;
		editorLayout.marginWidth = 10;
		editorLayout.marginHeight = 10;
		editorScrolledForm.getBody().setLayout(editorLayout);

		this.topComposite = toolkit.createComposite(editorScrolledForm
				.getBody());
		this.topComposite.setLayout(new FillLayout(SWT.HORIZONTAL));

		this.bottomComposite = toolkit.createComposite(editorScrolledForm
				.getBody());
		this.bottomComposite.setLayout(new FillLayout(SWT.HORIZONTAL));

		this.createRecognitionRulesSection(toolkit, editorScrolledForm);
		this.createTransformationRulesSection(toolkit, editorScrolledForm);
		this.createMappingsSection(toolkit, editorScrolledForm);

		// this.henshinTransformationRules = new ArrayList<IFile>();

	}

	private void createRecognitionRulesSection(FormToolkit toolkit,
			ScrolledForm form) {
		Section section1 = toolkit.createSection(this.topComposite,
				Section.DESCRIPTION | Section.TITLE_BAR);
		section1.setText("SiLift recognition rules");
		section1.setDescription("Define a recognition rule of a SiLift rulebase as source of the mapping.");

		Composite section1Composite = toolkit.createComposite(section1);
		section1Composite.setLayout(new GridLayout(1, false));

		Tree recognitionRulesTree = toolkit.createTree(section1Composite,
				SWT.H_SCROLL | SWT.V_SCROLL);
		recognitionRulesTreeViewer = new TreeViewer(recognitionRulesTree);

		recognitionRulesTreeViewer
				.setContentProvider(new SiLiftRecognitionRulesContentProvider());

		this.registeredRulebases = this
				.getRecognitionRulesTreeViewerInitialInput();

		recognitionRulesTreeViewer.setInput(this.registeredRulebases);
		recognitionRulesTreeViewer
				.setLabelProvider(new SiLiftRecognitionRulesLabelProvider());
		// recognitionRulesTreeViewer.expandAll();

		GridData recognitionRulesTreeGridData = new GridData(GridData.FILL_BOTH);
		recognitionRulesTree.setLayoutData(recognitionRulesTreeGridData);

		toolkit.paintBordersFor(section1Composite);

		// Button addRulebaseButton = toolkit.createButton(section1Composite,
		// "Add rulebases...", SWT.PUSH);
		//
		// GridData addRulebaseButtonGridData = new GridData(
		// GridData.VERTICAL_ALIGN_BEGINNING);
		// addRulebaseButton.setLayoutData(addRulebaseButtonGridData);

		section1.setClient(section1Composite);

	}

	private IRuleBase[] getRecognitionRulesTreeViewerInitialInput() {

		List<String> modelDocumentTypes = ExtensionHandler.getInstance()
				.getAllModelDocumentTypes();

		Set<IRuleBase> allRuleBases = new HashSet<IRuleBase>();

		// add only the SiLift rule bases for the evolution of the CoWolf models
		for (String modelDocumentType : modelDocumentTypes) {

			for (IRuleBase ruleBase : RuleBaseUtil
					.getAvailableRulebases(modelDocumentType)) {
				allRuleBases.add(ruleBase);
			}
		}

		return allRuleBases.toArray(new IRuleBase[allRuleBases.size()]);

	}

	private void createTransformationRulesSection(FormToolkit toolkit,
			ScrolledForm form) {

		Section section2 = toolkit.createSection(this.topComposite,
				Section.DESCRIPTION | Section.TITLE_BAR);
		section2.setDescription("Define a Henshin rule (unit) as target of the mapping.");
		section2.setText("Henshin Transformation Rules");

		Composite section2Composite = toolkit.createComposite(section2);
		section2Composite.setLayout(new GridLayout(1, false));

		Tree henshinRulesTree = toolkit.createTree(section2Composite,
				SWT.H_SCROLL | SWT.V_SCROLL);
		this.transformationRulesTreeViewer = new TreeViewer(henshinRulesTree);

		this.transformationRulesTreeViewer
				.setContentProvider(new TransformationRulesContentProvider());

		this.transformationRulesTreeViewer
				.setLabelProvider(new TransformationRulesLabelProvider());

		this.transformationRulesTreeViewer.setInput(this
				.getTransformationRulesTreeViewerInitialInput());

		GridData henshinRulesTreeGridData = new GridData(GridData.FILL_BOTH);
		henshinRulesTree.setLayoutData(henshinRulesTreeGridData);

		toolkit.paintBordersFor(section2Composite);

		// Button addDirButton = toolkit.createButton(section2Composite,
		// "Add directories...", SWT.PUSH);
		// GridData addDirButtonGridData = new GridData(
		// GridData.VERTICAL_ALIGN_BEGINNING);
		// addDirButton.setLayoutData(addDirButtonGridData);

		// addDirButton.addSelectionListener(this.browseWorkspace(this.parent
		// .getShell()));

		section2.setClient(section2Composite);

	}

	private IProject[] getTransformationRulesTreeViewerInitialInput() {
		return ResourcesPlugin.getWorkspace().getRoot().getProjects();
	}

	private void createMappingsSection(FormToolkit toolkit, ScrolledForm form) {

		Section section3 = toolkit.createSection(this.bottomComposite,
				Section.DESCRIPTION | Section.TITLE_BAR);
		section3.setDescription("This table contains the mappings you are defined.");
		section3.setText("Transformation Mappings");

		Composite section3Composite = toolkit.createComposite(section3);
		section3Composite.setLayout(new GridLayout(2, false));

		Table mappingsTable = toolkit.createTable(section3Composite,
				SWT.H_SCROLL | SWT.V_SCROLL | SWT.MULTI);
		this.mappingsTableViewer = new TableViewer(mappingsTable);

		mappingsTable.setHeaderVisible(true);
		mappingsTable.setLinesVisible(true);
		createTableViewerColumns(mappingsTableViewer);

		mappingsTableViewer
				.setContentProvider(new MappingTableContentProvider());
		mappingsTableViewer.setLabelProvider(new MappingTableLabelProvider());
		mappingsTableViewer.setInput(mappings.getMapping().values());

		GridData mappingsTableGridData = new GridData(GridData.FILL_BOTH);
		mappingsTable.setLayoutData(mappingsTableGridData);

		Composite section3ButtonsComposite = toolkit
				.createComposite(section3Composite);

		GridData section3ButtonsCompositeGridData = new GridData(
				GridData.FILL_VERTICAL);

		section3ButtonsComposite
				.setLayoutData(section3ButtonsCompositeGridData);

		section3ButtonsComposite.setLayout(new GridLayout(1, false));

		Button addMappingButton = toolkit.createButton(
				section3ButtonsComposite, "Add", SWT.PUSH);
		GridData addMappingButtonGridData = new GridData();
		// addMappingButtonGridData.verticalAlignment = GridData.BEGINNING;
		// addMappingButtonGridData.horizontalAlignment = GridData.END;
		// addMappingButtonGridData.grabExcessHorizontalSpace = true;
		addMappingButtonGridData.horizontalAlignment = GridData.FILL;

		addMappingButton.setLayoutData(addMappingButtonGridData);

		addMappingButton.addSelectionListener(addMappingSelection());

		Button deleteMappingButton = toolkit.createButton(
				section3ButtonsComposite, "Delete", SWT.PUSH);
		GridData deleteMappingButtonGridData = new GridData();
		// deleteMappingButtonGridData.horizontalAlignment = GridData.END;
		// deleteMappingButtonGridData.grabExcessHorizontalSpace = true;
		deleteMappingButtonGridData.horizontalAlignment = GridData.FILL;
		deleteMappingButton.setLayoutData(deleteMappingButtonGridData);
		deleteMappingButton.addSelectionListener(deleteMappingSelection());

		toolkit.paintBordersFor(section3Composite);
		section3.setClient(section3Composite);

		// toolkit.paintBordersFor(this.bottomComposite);
		// section3.setClient(this.bottomComposite);

	}

	private void createMappingsTableViewerColumns(TableViewer viewer) {
		TableViewerColumn colRecognitionRuleName = new TableViewerColumn(
				viewer, SWT.NONE);
		colRecognitionRuleName.getColumn().setText("Recognition Rule");
		colRecognitionRuleName.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {

				if (element instanceof Mapping) {

					return ((Mapping) element).getDifference();

				}

				return null;

			}
		});

		TableViewerColumn colTransformationRuleName = new TableViewerColumn(
				viewer, SWT.NONE);
		colTransformationRuleName.getColumn().setText("Transformation Rule");
		colTransformationRuleName.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {

				if (element instanceof Mapping) {

					return ((Mapping) element).getRule().getName();

				}

				return null;

			}
		});

	}

	private ISelectionChangedListener getRecognitionRulesTreeViewerSelectionChangedListener() {

		ISelectionChangedListener listener = new ISelectionChangedListener() {

			@Override
			public void selectionChanged(SelectionChangedEvent event) {

				IStructuredSelection selection = (IStructuredSelection) event
						.getSelection();

				boolean elementsSelected = false;

				Object nextObj;

				for (Iterator iterator = selection.iterator(); iterator
						.hasNext();) {

					nextObj = iterator.next();

					if (nextObj instanceof RecognitionRule) {
						selectedRecognitionRule = (RecognitionRule) nextObj;
					}

					elementsSelected = true;
				}

				if (!elementsSelected) {
					selectedRecognitionRule = null;
				}

			}

		};

		return listener;

	}

	private ISelectionChangedListener getTransformationRulesTreeViewerSelectionChangedListener() {

		ISelectionChangedListener listener = new ISelectionChangedListener() {

			@Override
			public void selectionChanged(SelectionChangedEvent event) {

				IStructuredSelection selection = (IStructuredSelection) event
						.getSelection();

				boolean elementsSelected = false;

				Object nextObj;

				for (Iterator iterator = selection.iterator(); iterator
						.hasNext();) {

					nextObj = iterator.next();

					if (nextObj instanceof Unit) {
						selectedUnit = (Unit) nextObj;
					}

					elementsSelected = true;
				}

				if (!elementsSelected) {
					selectedUnit = null;
				}

			}

		};

		return listener;

	}

	private SelectionListener getAddMappingSelectionListener() {

		SelectionListener listener = new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {

				if (recognitionRulesTreeViewer.getSelection() instanceof IStructuredSelection
						&& transformationRulesTreeViewer.getSelection() instanceof IStructuredSelection) {

					IStructuredSelection recognitionRulesSelection = (IStructuredSelection) recognitionRulesTreeViewer
							.getSelection();
					IStructuredSelection transformationRulesSelection = (IStructuredSelection) transformationRulesTreeViewer
							.getSelection();

					if (recognitionRulesSelection.size() == 1
							&& transformationRulesSelection.size() == 1) {

						Object selectedObj;
						Object selectedObj2;

						if ((selectedObj = recognitionRulesSelection.iterator()
								.next()) instanceof RecognitionRule
								&& (selectedObj2 = transformationRulesSelection
										.iterator().next()) instanceof Unit) {
							
							RecognitionRule selectedRecognitionRule = (RecognitionRule) selectedObj;
							Unit selectedTransformationRule = (Unit) selectedObj2;

							Mapping newMapping = new Mapping();
							// TODO via UI
							newMapping.setPriority(1);
							String changeSetName = RecognitionRuleUtil
									.getChangeSetName(selectedRecognitionRule);
							newMapping.setDifference(changeSetName);

							Rule rule = new Rule();
							rule.setName(selectedTransformationRule.getName());
							rule.setPath(selectedTransformationRule.eResource().getURI()
									.toString());
							Params params = new Params();
							for (Parameter unitParameter : selectedTransformationRule
									.getParameters()) {
								Param param = new Param();
								param.setName(unitParameter.getName());
								params.getParam().add(param);
							}

							mappings.getMapping()
									.put(changeSetName, newMapping);

							recognitionRulesTreeViewer
									.setSelection(StructuredSelection.EMPTY);
							transformationRulesTreeViewer
									.setSelection(StructuredSelection.EMPTY);

						}

					}

				}

			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {

			}

		};
		return listener;
	}

	private SelectionListener getDeleteMappingSelectionListener() {

		SelectionListener listener = new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {

				//mappingsTableViewer.getSelection()
				
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub

			}

		};
		return listener;
	}

	private SelectionListener getDeleteMappingSelection() {

		SelectionListener listener = new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {

			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub

			}

		};
		return listener;
	}

	// protected SelectionListener chooseRulebases(final Shell shell) {
	//
	// SelectionListener listener = new SelectionListener() {
	//
	// @Override
	// public void widgetSelected(SelectionEvent e) {
	//
	// List<ViewerFilter> filters = new ArrayList<ViewerFilter>();
	// filters.add(new WorkspaceResourceDialogFilter());
	// IFile[] rulebases = WorkspaceResourceDialog.openFileSelection(
	// shell, "Choose SiLift rulebases", null, true, null,
	// filters);
	//
	// StringBuilder invalidRulebasesTxt = new StringBuilder("");
	// StringBuilder alreadyAddedRulebasesTxt = new StringBuilder("");
	//
	// for (IFile rulebase : rulebases) {
	//
	// URI rulebasePluginURI = URI.createPlatformPluginURI(
	// rulebase.getFullPath().toString(), true);
	//
	// Resource rulebaseResource = null;
	//
	// try {
	// rulebaseResource = new ResourceSetImpl().getResource(
	// rulebasePluginURI, true);
	// } catch (Exception exc) {
	// exc.printStackTrace();
	// }
	//
	// if (rulebaseResource != null) {
	//
	// EList<EObject> contents = rulebaseResource
	// .getContents();
	//
	// if (contents != null) {
	//
	// EObject obj = contents.get(0);
	//
	// if ((obj != null) && (obj instanceof RuleBase)) {
	//
	// String ruleBaseName = ((RuleBase) obj)
	// .getName();
	//
	// if (!TransformationMappingEditor.this.registeredRulebases
	// .contains(ruleBaseName)
	// && !TransformationMappingEditor.this.additionalRulebases
	// .contains(ruleBaseName)) {
	// TransformationMappingEditor.this.additionalRulebases
	// .add(ruleBaseName);
	// hen
	//
	// }
	//
	// continue;
	// }
	//
	// }
	//
	// }
	//
	// invalidRulebasesTxt.append("<br />" + rulebasePluginURI);
	//
	// }
	//
	// if (invalidRulebasesTxt.length() > 0) {
	//
	// MessageDialog.openError(shell, "Adding Rulebases failed",
	// "The following rulebases are not existent or invalid:"
	// + invalidRulebasesTxt);
	// }
	//
	// }
	//
	// @Override
	// public void widgetDefaultSelected(SelectionEvent e) {
	// // nothing to do
	// }
	// };
	// return listener;
	// }

	@Override
	public void setFocus() {
		if (this.parent != null) {
			this.parent.setFocus();
		}
	}

}
