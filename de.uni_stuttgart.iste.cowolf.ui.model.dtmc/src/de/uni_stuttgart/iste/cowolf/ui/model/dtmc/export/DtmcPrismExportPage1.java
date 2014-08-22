package de.uni_stuttgart.iste.cowolf.ui.model.dtmc.export;


import java.io.File;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.ContainerCheckedTreeViewer;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;

public class DtmcPrismExportPage1 extends WizardPage {

	private Composite container;
	private Text txtPath;
	private IStructuredSelection selection;

	protected DtmcPrismExportPage1(String pageName, IWorkbench workbench, IStructuredSelection selection) {
		super(pageName);
		this.setDescription("Description");
		this.setTitle("Export DTMC model as PRISM model");
		this.selection = selection;
	}

	@Override
	public void createControl(Composite parent) {
		
		this.container = new Composite(parent, SWT.NONE);
		this.setControl(this.container);
		this.container.setLayout(new GridLayout(1, false));
		
		Group grpModelChooser = new Group(container, SWT.NONE);
		grpModelChooser.setText("Choose model for export:");
		grpModelChooser.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		GridLayout gl_grpModelChooser = new GridLayout(1, false);
		gl_grpModelChooser.horizontalSpacing = 10;
		gl_grpModelChooser.verticalSpacing = 10;
		gl_grpModelChooser.marginWidth = 10;
		gl_grpModelChooser.marginHeight = 10;
		grpModelChooser.setLayout(gl_grpModelChooser);
		ContainerCheckedTreeViewer tree = new ContainerCheckedTreeViewer(grpModelChooser);
		Tree tree_1 = tree.getTree();
		tree_1.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		tree.setContentProvider(new FileTreeContentProvider("dtmcemf", this.selection));
		tree.setLabelProvider(new FileTreeLabelProvider());
		tree.setInput("root"); // pass a non-null that will be ignored
		
		Group grpOutputPath = new Group(container, SWT.NONE);
		GridLayout gl_grpOutputPath = new GridLayout(3, false);
		gl_grpOutputPath.horizontalSpacing = 10;
		gl_grpOutputPath.marginWidth = 10;
		gl_grpOutputPath.verticalSpacing = 10;
		gl_grpOutputPath.marginHeight = 10;
		grpOutputPath.setLayout(gl_grpOutputPath);
		grpOutputPath.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		grpOutputPath.setText("Export properties:");
		
		Label lblOutput = new Label(grpOutputPath, SWT.NONE);
		lblOutput.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblOutput.setText("Destination:");
		
		txtPath = new Text(grpOutputPath, SWT.BORDER);
		txtPath.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Button btnBrowse = new Button(grpOutputPath, SWT.NONE);
		btnBrowse.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		btnBrowse.setText("Browse...");
		
		Button btnCleardirectory = new Button(grpOutputPath, SWT.CHECK);
		btnCleardirectory.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 3, 1));
		btnCleardirectory.setText("Clear directory before exporting");
		
		Button btnProjectstructure = new Button(grpOutputPath, SWT.CHECK);
		btnProjectstructure.setSelection(true);
		btnProjectstructure.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 3, 1));
		btnProjectstructure.setText("Use folder structure");
		
		Button btnOverwriteExistingFiles = new Button(grpOutputPath, SWT.CHECK);
		btnOverwriteExistingFiles.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 3, 1));
		btnOverwriteExistingFiles.setText("Overwrite existing files");
		
		Button btnExportPctlFile = new Button(grpOutputPath, SWT.CHECK);
		btnExportPctlFile.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 3, 1));
		btnExportPctlFile.setText("Export pctl file");
		
		tree.setCheckedElements(selection.toArray());
		
		
		tree.addCheckStateListener(new ICheckStateListener() {
			@Override
			public void checkStateChanged(CheckStateChangedEvent event) {
				setPageComplete();
			}
		});
		
		txtPath.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				setPageComplete();
			}
		});
		SelectionListener listener = new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				setPageComplete();
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				setPageComplete();
			}
		};
		btnCleardirectory.addSelectionListener(listener);
		btnExportPctlFile.addSelectionListener(listener);
		btnOverwriteExistingFiles.addSelectionListener(listener);
		btnProjectstructure.addSelectionListener(listener);
	}
	
	public void setPageComplete() {
		String path = this.txtPath.getText();
		File file = new File(path);
		if (txtPath.getText().isEmpty()) {
			this.setErrorMessage("Please specify a output path!");
			this.setPageComplete(false);
			return;
		}
		
		if (!file.exists()) {
			this.setErrorMessage("Destination path doesn't exists!");
			this.setPageComplete(false);
			return;
		}
		if (!file.isDirectory()) {
			this.setErrorMessage("Destination path is no directory!");
			this.setPageComplete(false);
			return;
		}
		if (!file.canWrite()) {
			this.setErrorMessage("You don't have rights to write to this path!");
			this.setPageComplete(false);
			return;
		}

		this.setErrorMessage(null);
		this.setPageComplete(true);
	}
}
