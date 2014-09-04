package de.uni_stuttgart.iste.cowolf.ui.transformation.wizard;

import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;

/**
 * This wizard allows the user to select the two models needed for the evolution
 * step as well as the model needed for the transformation.
 * 
 */
public class TransformationWizard extends Wizard {

    // First model for evolution.
    private IFile sourceFile;
    private List<IFile> targets;
    private IStructuredSelection selection;

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
     *s
     * @param sourceFile 
     * @param selection 
     */
    public TransformationWizard(IFile sourceFile, IStructuredSelection selection) {
        this.setWindowTitle("Co-Evolution Wizard");
        this.sourceFile = sourceFile;
        this.selection = selection;
    }

	@Override
    public void addPages() {
        this.page = new TransformationWizardPage(sourceFile, this.selection);
        this.addPage(this.page);
    }

    @Override
    public boolean performFinish() {
    	targets = page.getSelectedFiles();
    	this.sourceFile = page.getSourceFile();
        return true;
    }

    @Override
    public boolean canFinish() {
        return super.canFinish();
    }

    public boolean isAssociationSelected() {
        return this.isAssociationSelected;
    }

	public IFile getSourceModel() {
		return sourceFile;
	}
	
	public List<IFile> getTargets() {
		return targets;
	}
}
