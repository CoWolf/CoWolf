package de.uni_stuttgart.iste.cowolf.ui.wizards;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URI;
import java.util.Set;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;
import org.sidiff.common.emf.exceptions.InvalidModelException;
import org.sidiff.difference.asymmetric.facade.AsymmetricDiffFacade;
import org.sidiff.difference.asymmetric.facade.util.Difference;
import org.sidiff.difference.lifting.facade.LiftingFacade;
import org.sidiff.difference.lifting.settings.LiftingSettings;
import org.sidiff.difference.matcher.IMatcher;
import org.sidiff.difference.symmetric.SymmetricDifference;
import org.silift.common.util.access.EMFModelAccessEx;
import org.silift.common.util.emf.EMFStorage;
import org.silift.common.util.emf.Scope;
import org.silift.common.util.ui.UIUtil;

import de.uni_stuttgart.iste.cowolf.ui.creationFunctions.CreationFunctions;
import de.uni_stuttgart.iste.cowolf.ui.externalizedStrings.Messages;

/**
 * this class holds the wizard for a new project
 *
 */
public class NewProjectWizard extends Wizard implements INewWizard,
		IExecutableExtension {

	private static final String PAGE_NAME = Messages.CustomNewProjectWizard_page_1_name;
	private static final String WIZARD_NAME = Messages.CustomNewProjectWizard_new_project_wizard_name;

	private WizardNewProjectCreationPage pageOne;
	private IConfigurationElement configurationElement;

	public NewProjectWizard() {
		setWindowTitle(WIZARD_NAME);
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean performFinish() {
		String name = pageOne.getProjectName();
		URI location = null;
		if (!pageOne.useDefaults()) {
			location = pageOne.getLocationURI();
		}
		CreationFunctions.createProject(name, location);

//		// now the wizard automatically opens the correct perspective
//		BasicNewProjectResourceWizard.updatePerspective(configurationElement);
//
//		Resource modelA = LiftingFacade.loadModel("E:\\1\\SA.ecore");
//		Resource modelB = LiftingFacade.loadModel("E:\\1\\Copy_of_SA.ecore");
//		String documentType = EMFModelAccessEx
//				.getCharacteristicDocumentType(modelA);
//
//		LiftingSettings settings = new LiftingSettings(documentType);
//
//		// Matcher: NamedElement Matcher (another one can be selected as well)
//		Set<IMatcher> matcher = LiftingFacade.getAvailableMatchers(modelA,
//				modelB);
//		for (IMatcher iMatcher : matcher) {
//			if (iMatcher.getKey().equals("NamedElement")) {
//				settings.setMatcher(iMatcher);
//			}
//		}
//
//		// Scope
//		settings.setScope(Scope.RESOURCE);
//
//		try {
//			Difference difference = AsymmetricDiffFacade.liftMeUp(modelA,
//					modelB, settings);
//
//			final String diffFileName = LiftingFacade
//					.generateDifferenceFileName(modelA, modelB, settings);
//			
//			final String diffPath = new File(pageOne.getLocationURI()) + File.separator
//					+ "differences";
//
//			AsymmetricDiffFacade.serializeDifference(difference, diffPath,
//					diffFileName);
//
//			final String diffSymmetricFilePath = diffPath + File.separator
//					+ diffFileName + "." + LiftingFacade.SYMMETRIC_DIFF_EXT;
//
//			// EMFStorage.uriToPath(difference.getSymmetric().eResource().getURI());
//
//			Display.getDefault().asyncExec(new Runnable() {
//				@Override
//				public void run() {
//					try {
//						UIUtil.openEditor(diffSymmetricFilePath);
//					} catch (OperationCanceledException e) {
//						e.printStackTrace();
//					} catch (FileNotFoundException e) {
//						e.printStackTrace();
//					}
//				}
//			});
//
//		} catch (InvalidModelException e) {
//			e.printStackTrace();
//		}

		return true;
	}

	@Override
	public void addPages() {
		super.addPages();

		pageOne = new WizardNewProjectCreationPage(PAGE_NAME);
		pageOne.setTitle(Messages.CustomNewProjectWizard_page_1_title);
		pageOne.setDescription(Messages.CustomNewProjectWizard_page_1_description);

		addPage(pageOne);
	}

	@Override
	public void setInitializationData(IConfigurationElement config,
			String propertyName, Object data) throws CoreException {
		configurationElement = config;
	}

}