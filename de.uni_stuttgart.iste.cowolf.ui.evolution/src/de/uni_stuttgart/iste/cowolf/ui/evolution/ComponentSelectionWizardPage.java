package de.uni_stuttgart.iste.cowolf.ui.evolution;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.ui.dialogs.WorkspaceResourceDialog;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

public class ComponentSelectionWizardPage extends WizardPage {
	/**
	 * First model to use for evolution.
	 */
	private Resource modelA;
	/**
	 * Second model to use for evolution.
	 */
	private Resource modelB;
	/**
	 * Radio button for first model.
	 */
	private Button modelAButton;
	/**
	 * Radio button for second model.
	 */
	private Button modelBButton;
	
	protected ComponentSelectionWizardPage(Resource modelA, Resource modelB) {
		super("Model Selection");
		this.setModels(modelA, modelB);
	}

	public void setModels(Resource modelA, Resource modelB) {
		this.modelA = modelA;
		this.modelB = modelB;
	}
	@Override
	public void createControl(final Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);
	    GridLayout layout = new GridLayout(3, false);
	    container.setLayout(layout);
	    this.modelAButton = new Button(container, SWT.RADIO);
	    this.modelAButton.setSelection(true);
	    Label labelA = new Label(container, SWT.NONE);
	    labelA.setText(this.modelToString(this.modelA));
	    Button modelAChooser = new Button(container, 0);
	    modelAChooser.setText("Browse ...");
	    modelAChooser.addSelectionListener(this.browseWorkspace(modelA, labelA, parent.getShell()));
	    new Label(container, SWT.NONE);
	    final Label arrow = new Label(container, SWT.NONE);
	    arrow.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
	    arrow.setFont(new Font(null, "Arial", 35 ,SWT.BOLD));
	    arrow.setAlignment(SWT.CENTER);
	    arrow.setText("\u2193");
	    new Label(container, SWT.NONE);
	    this.modelBButton = new Button(container, SWT.RADIO);
	    this.modelBButton.setSelection(false);
	    this.modelAButton.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(modelAButton.getSelection()) {
					arrow.setText("\u2193");
				}
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});
	    this.modelBButton.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(modelBButton.getSelection()) {
					arrow.setText("\u2191");
				}
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});
	    final Label labelB = new Label(container, SWT.NONE);
	    labelB.setText(this.modelToString(this.modelB));
	    Button modelBChooser = new Button(container, 0);
	    modelBChooser.setText("Browse ...");
	    modelBChooser.addSelectionListener(this.browseWorkspace(modelB, labelB, parent.getShell()));
	    this.setControl(container);
	    this.setPageComplete(true);
	}

	public boolean isFirstModelSelected() {
		return this.modelAButton.getSelection();
	}
	
	/**
	 * 
	 * @param model
	 * @return
	 */
	protected String modelToString(Resource model) {
		if (model != null) {
	    	IPath path = new Path(model.getURI().toString());
		    return path.toString();
	    }
		return "";
	}
	
	protected SelectionListener browseWorkspace(final Resource originalModel, final Label label, final Shell shell) {
		SelectionListener listener = new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {				
				IFile[] files = WorkspaceResourceDialog.openFileSelection(shell, "Choose model file", "Choose model file", true, null, null);
				if(files.length >= 1) {
					URI uri = URI.createPlatformResourceURI(files[0].getFullPath().toString(), true);
					Resource model = new ResourceSetImpl().createResource(uri);
					if(originalModel.equals(modelA)) {
						modelA = model;
					} else {
						modelB = model;
					}
					label.setText(modelToString(model));
				}
				
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// nothing to do
			}
		};
		return listener;
	}
	

}
