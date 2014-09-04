package de.uni_stuttgart.iste.cowolf.ui.transformation.wizard;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
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

import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

/**
 * Transformation Wizard Page to select models for evolution step as well as the
 * transformation model.
 *
 */
public class TransformationWizardPage extends WizardPage {

    private ContainerCheckedTreeViewer tree;
	private IFile source;
	private Text txtModel;
	private IStructuredSelection selection;

	/**
     * Page providing main content for wizard.
     *
     * @param wizard
	 * @param selection2 
     */
    protected TransformationWizardPage(IFile source, IStructuredSelection selection) {
        super("Co-Evolution");
        this.setDescription("Co-Evolve.");
        this.setTitle("Co-Evolution.");
        this.source = source;
        this.selection = selection;
    }

	@Override
	public void createControl(final Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		setControl(container);
		GridLayout gl_container = new GridLayout(2, false);
		gl_container.verticalSpacing = 10;
		gl_container.horizontalSpacing = 10;
		container.setLayout(gl_container);
		
		Label lblSourceModel = new Label(container, SWT.NONE);
		GridData gd_lblSourceModel = new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1);
		gd_lblSourceModel.horizontalIndent = 10;
		lblSourceModel.setLayoutData(gd_lblSourceModel);
		lblSourceModel.setText("Source model:");
		
		txtModel = new Text(container, SWT.BORDER);
		txtModel.setEditable(false);
		txtModel.setText(this.source.getProjectRelativePath().toOSString());
		txtModel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Group grpModelChooser = new Group(container, SWT.NONE);
		grpModelChooser.setText("Choose target models");
		grpModelChooser.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
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
		gd_tree_1.widthHint = 307;
		gd_tree_1.heightHint = 400;
		tree_1.setLayoutData(gd_tree_1);
		FileTreeContentProvider provider = new FileTreeContentProvider(getFilteredExtensions());
		tree.setContentProvider(provider);
		tree.setLabelProvider(new ModelVersionTreeLabelProvider(this.source));
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
		tree.setCheckedElements(selection.toArray());
		tree.expandAll();
		this.setPageComplete();
	}
	
	public String[] getFilteredExtensions() {
		AbstractModelManager modelManager = ModelRegistry.getInstance().getModelManager(source.getFileExtension());
		Set<Class<?>> classes = TransformationRegistry.getInstance().getTargetTransformations(modelManager.getManagedClass());
		ModelRegistry rg = ModelRegistry.getInstance();
		List<String> extensions = new ArrayList<String>();
		for (Class<?> modelClass : classes) {
			
			extensions.add(rg.getModelManager(modelClass).getFileExtension());
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

	public IFile getSourceFile() {
		return this.source;
	}
}
