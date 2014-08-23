package de.uni_stuttgart.iste.cowolf.ui.model.dtmc.export;


import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
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
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Tree;

import de.uni_stuttgart.iste.cowolf.ui.model.dtmc.Activator;

public class DtmcPrismExportPage1 extends WizardPage {

	private Composite container;
	private Text txtPath;
	private IStructuredSelection selection;
	private Button btnExportPctlFile;
	private Button btnProjectstructure;
	private ContainerCheckedTreeViewer tree;
	private Button btnOverwriteExistingFiles;
	private IDialogSettings settings;
	
	protected DtmcPrismExportPage1(String pageName, IWorkbench workbench, IStructuredSelection selection, IDialogSettings settings) {
		super(pageName);
		this.setDescription("Description");
		this.setTitle("Export DTMC model as PRISM model");
		this.selection = selection;
		IDialogSettings pluginSettings = settings;
		if (pluginSettings.getSection(this.getClass().getName()) == null) {
			this.settings = pluginSettings.addNewSection(this.getClass().getName());
		} else {
			this.settings = pluginSettings.getSection(this.getClass().getName());
		}
	}

	
	@Override
	public void createControl(final Composite parent) {
		
		this.container = new Composite(parent, SWT.NONE);
		this.setControl(this.container);
		this.container.setLayout(new GridLayout(1, false));
		
		Group grpModelChooser = new Group(container, SWT.NONE);
		grpModelChooser.setText("Choose models for export:");
		grpModelChooser.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		GridLayout gl_grpModelChooser = new GridLayout(1, false);
		gl_grpModelChooser.horizontalSpacing = 10;
		gl_grpModelChooser.verticalSpacing = 10;
		gl_grpModelChooser.marginWidth = 10;
		gl_grpModelChooser.marginHeight = 10;
		grpModelChooser.setLayout(gl_grpModelChooser);
		tree = new ContainerCheckedTreeViewer(grpModelChooser);
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
		
		btnProjectstructure = new Button(grpOutputPath, SWT.CHECK);
		btnProjectstructure.setSelection(true);
		btnProjectstructure.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 3, 1));
		btnProjectstructure.setText("Use folder structure");
		
		btnOverwriteExistingFiles = new Button(grpOutputPath, SWT.CHECK);
		btnOverwriteExistingFiles.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 3, 1));
		btnOverwriteExistingFiles.setText("Overwrite existing file(s) without warning");
		
		btnExportPctlFile = new Button(grpOutputPath, SWT.CHECK);
		btnExportPctlFile.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 3, 1));
		btnExportPctlFile.setText("Export pctl file");
		
		tree.setCheckedElements(selection.toArray());
		
		
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
		
		txtPath.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				setPageComplete();
			}
		});
		
		btnBrowse.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				DirectoryDialog browser = new DirectoryDialog(parent.getShell());
				txtPath.setText(browser.open());
				setPageComplete();
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});
		SelectionListener listener = new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		};
		btnExportPctlFile.addSelectionListener(listener);
		btnOverwriteExistingFiles.addSelectionListener(listener);
		btnProjectstructure.addSelectionListener(listener);
		this.loadSettings();
		this.setPageComplete();
	}

	public void setPageComplete() {
		String path = this.txtPath.getText();
		File file = new File(path);
		
		if (this.tree.getCheckedElements().length == 0) {
			this.setErrorMessage("Please specify a model for export!");
			this.setPageComplete(false);
			return;
		}
		
		if (txtPath.getText().isEmpty()) {
			this.setErrorMessage("Please specify an output path!");
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
	
	public String getOutputPath() {
		return txtPath.getText();
	}
	
	public boolean getOverwritePermission() {
		return this.btnOverwriteExistingFiles.getSelection();
	}
	
	public boolean getUseProjectStructure() {
		return this.btnProjectstructure.getSelection();
	}
	
	public boolean isExportPctlEnabled() {
		return btnExportPctlFile.getSelection();
	}

	public void saveSettings() {
		if (this.settings == null) {
			return;
		}
		settings.put("output_path", this.txtPath.getText());
		settings.put("export_pctl", this.btnExportPctlFile.getSelection());
		settings.put("use_project_structure", this.btnProjectstructure.getSelection());
	}
	
	public void loadSettings() {
		if (settings == null) {
			return;
		}
		if (settings.get("output_path") != null) {
			this.txtPath.setText(settings.get("output_path"));		
		}
		if (settings.get("export_pctl") != null) {
			this.btnExportPctlFile.setSelection(settings.getBoolean("export_pctl"));
		}
		if (settings.get("use_project_structure") != null) {
			this.btnProjectstructure.setSelection(settings.getBoolean("user_project_structure"));
		}
	}
}
