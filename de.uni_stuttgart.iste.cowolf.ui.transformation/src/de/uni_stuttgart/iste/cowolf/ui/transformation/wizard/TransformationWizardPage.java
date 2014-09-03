package de.uni_stuttgart.iste.cowolf.ui.transformation.wizard;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Group;
import org.eclipse.ui.dialogs.ContainerCheckedTreeViewer;

import de.uni_stuttgart.iste.cowolf.model.AbstractModelManager;
import de.uni_stuttgart.iste.cowolf.model.ModelRegistry;
import de.uni_stuttgart.iste.cowolf.transformation.TransformationRegistry;
import de.uni_stuttgart.iste.cowolf.ui.model.export.FileTreeContentProvider;
import de.uni_stuttgart.iste.cowolf.ui.model.export.FileTreeLabelProvider;

import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;

/**
 * Transformation Wizard Page to select models for evolution step as well as the
 * transformation model.
 *
 */
public class TransformationWizardPage extends WizardPage {

    private ContainerCheckedTreeViewer tree;
    
    private final TransformationWizard wizard;
    private Text txtModel;
	private IFile source;

	/**
     * Page providing main content for wizard.
     *
     * @param wizard
     */
    protected TransformationWizardPage(TransformationWizard wizard, IFile selection) {
        super("Co-Evolution");
        this.setDescription("Co-Evolve.");
        this.setTitle("Co-Evolution.");
        this.wizard = wizard;
        this.source = selection;
    }

	@Override
	public void createControl(final Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		setControl(container);
		container.setLayout(new GridLayout(1, false));
		
		Group grpChooseSourceModel = new Group(container, SWT.NONE);
		grpChooseSourceModel.setLayout(new GridLayout(3, false));
		grpChooseSourceModel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		grpChooseSourceModel.setText("Choose source model");
		
		Label lblChoose = new Label(grpChooseSourceModel, SWT.NONE);
		lblChoose.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblChoose.setText("Choose:");
		
		txtModel = new Text(grpChooseSourceModel, SWT.BORDER);
		txtModel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		txtModel.setText(source.getProjectRelativePath().toOSString());
		
		Button btnBrowse = new Button(grpChooseSourceModel, SWT.NONE);
		btnBrowse.setText("Browse...");
		
		Group grpModelChooser = new Group(container, SWT.NONE);
		grpModelChooser.setText("Choose target models");
		grpModelChooser.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		GridLayout gl_grpModelChooser = new GridLayout(1, false);
		gl_grpModelChooser.horizontalSpacing = 10;
		gl_grpModelChooser.verticalSpacing = 10;
		gl_grpModelChooser.marginWidth = 10;
		gl_grpModelChooser.marginHeight = 10;
		grpModelChooser.setLayout(gl_grpModelChooser);
		tree = new ContainerCheckedTreeViewer(grpModelChooser);
		tree.addCheckStateListener(new ICheckStateListener() {
			@Override
			public void checkStateChanged(CheckStateChangedEvent event) {
				setPageComplete();
			}
		});
		tree.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				setPageComplete();
			}
		});
		Tree tree_1 = tree.getTree();
		GridData gd_tree_1 = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
		gd_tree_1.heightHint = 400;
		tree_1.setLayoutData(gd_tree_1);
		System.out.println("Project: " + this.source.getProject());
		FileTreeContentProvider provider = new FileTreeContentProvider(getFilteredExtensions());
		tree.setContentProvider(provider);
		tree.setLabelProvider(new FileTreeLabelProvider());
		tree.setInput("root"); // pass a non-null that will be ignored
		tree.addFilter(new ViewerFilter() {

			@Override
			public boolean select(Viewer viewer, Object parentElement,
					Object element) {
				if (element instanceof IResource && ((IResource) element).getProject().equals(source.getProject())) {
					return true;
				}
				return false;
			}
		});
		this.setPageComplete();
	}
	
	public String[] getFilteredExtensions() {
		
		AbstractModelManager modelManager = ModelRegistry.getInstance().getModelManager(wizard.getSourceModel());
		Set<Class<?>> classes = TransformationRegistry.getInstance().getTargetTransformations(modelManager.getManagedClass());
		System.out.println("Source Element:" + modelManager.getManagedClass());
		System.out.println("have " + classes.size() + " target possibilities");
		ModelRegistry rg = ModelRegistry.getInstance();
		List<String> extensions = new ArrayList<String>();
		for (Class<?> modelClass : classes) {
			
			extensions.add(rg.getModelManager(modelClass).getFileExtension());
			System.out.println("Class extension: " + rg.getModelManager(modelClass).getFileExtension());
		}
		return extensions.toArray(new String[0]);
	}
	
	public void setPageComplete() {
		if (this.tree.getCheckedElements().length == 0) {
			this.setErrorMessage("Please select at least one target model!");
			super.setPageComplete(false);
			return;
		}
		this.setErrorMessage(null);
		super.setPageComplete(true);
		return;
	}
	
	/**
	 * Returns the selected files for co evolution.
	 * @return List of models which should be target for coevolution.
	 */
	public List<IFile> getSelectedFiles() {
		ArrayList<IFile> files = new ArrayList<IFile> ();
		Object[] selected = this.tree.getCheckedElements();
		for (Object obj : selected) {
			if (obj instanceof IFile) {
				files.add((IFile) obj);
			}
		}
		return files;
	}
}
