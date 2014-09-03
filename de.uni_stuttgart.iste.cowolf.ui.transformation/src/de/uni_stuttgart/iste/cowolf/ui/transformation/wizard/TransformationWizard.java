package de.uni_stuttgart.iste.cowolf.ui.transformation.wizard;

import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.wizard.Wizard;

/**
 * This wizard allows the user to select the two models needed for the evolution
 * step as well as the model needed for the transformation.
 * 
 */
public class TransformationWizard extends Wizard {

    // First model for evolution.
    private Resource sourceModel;
    private IFile sourceFile;
    private List<IFile> targets;

    /**
     * Wizard page displaying contents of wizard.
     */
    private TransformationWizardPage page;

    /**
     * True if association between models should be saved.
     */
    private boolean isAssociationSelected = false;

    /**
     * Constructor setting both models.
     *
     * @param sourceModel
     * @param sourceFile 
     */
    public TransformationWizard(Resource sourceModel, IFile sourceFile) {
        this.setWindowTitle("Co-Evolution Wizard");
        this.sourceModel = sourceModel;
        this.sourceFile = sourceFile;
    }

	@Override
    public void addPages() {
        this.page = new TransformationWizardPage(this, sourceFile);
        this.addPage(this.page);
    }

    @Override
    public boolean performFinish() {
    	targets = page.getSelectedFiles();
        return true;
    }

    @Override
    public boolean canFinish() {
        return super.canFinish();
    }

    public boolean isAssociationSelected() {
        return this.isAssociationSelected;
    }

	public Resource getSourceModel() {
		return sourceModel;
	}
	
	public List<IFile> getTargets() {
		return targets;
	}
}
