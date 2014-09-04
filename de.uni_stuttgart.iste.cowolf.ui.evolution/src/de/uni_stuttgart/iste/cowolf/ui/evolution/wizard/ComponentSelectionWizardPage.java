package de.uni_stuttgart.iste.cowolf.ui.evolution.wizard;

import java.text.DateFormat;
import java.util.Date;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.graphics.Image;

import de.uni_stuttgart.iste.cowolf.core.ModelAssociation.Model;
import de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelVersion;

import org.eclipse.jface.dialogs.DialogPage;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.ICheckStateProvider;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

/**
 * This class provides the main wizard content for selecting model and evolution
 * direction.
 *
 * @author Michael Müller
 * @author Rene Trefft
 */
public class ComponentSelectionWizardPage extends WizardPage {

	private IFile source;
	private Model model;
	private Text text;
	private Object firstCheckedElement;
	private ModelVersionProvider baseSelection;
	private ModelVersionProvider targetSelection;

    /**
     * Page providing main content for wizard.
     *
     * @param wizard
     */
    protected ComponentSelectionWizardPage(ComponentSelectionWizard wizard, IFile sourceFile, Model model) {
        super("Model Evolution");
        this.setDescription("Compare two versions of a model with SiLift.");
        this.setTitle("Compare models with each other.");
        
        this.source = sourceFile;
        this.model = model;
    }

    @Override
    public void createControl(final Composite parent) {
    	Composite container = new Composite(parent, SWT.NULL);
		setControl(container);
		container.setLayout(new GridLayout(2, false));
		
		Label label = new Label(container, SWT.NONE);
		GridData gd_label = new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1);
		gd_label.horizontalIndent = 10;
		label.setLayoutData(gd_label);
		label.setText("Source model:");
		
		text = new Text(container, SWT.BORDER);
		text.setText((String) source.getFullPath().toOSString());
		text.setEditable(false);
		text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Group grpFirstmodelselection = new Group(container, SWT.NONE);
		grpFirstmodelselection.setLayout(new GridLayout(1, false));
		grpFirstmodelselection.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
		grpFirstmodelselection.setText("Select first model version:");
		
		Group grpSecondmodelselection = new Group(container, SWT.NONE);
		grpSecondmodelselection.setLayout(new GridLayout(1, false));
		grpSecondmodelselection.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
		grpSecondmodelselection.setText("Select second model version:");
		
		CheckboxTableViewer tableViewer1 = CheckboxTableViewer.newCheckList(grpFirstmodelselection, SWT.BORDER | SWT.V_SCROLL | SWT.CHECK | SWT.SINGLE);
		Table table1 = tableViewer1.getTable();
		table1.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		
		baseSelection = new ModelVersionProvider();
		tableViewer1.setContentProvider(baseSelection);
		tableViewer1.setLabelProvider(baseSelection);
		tableViewer1.setInput(model);
		tableViewer1.addCheckStateListener(baseSelection);
		tableViewer1.setCheckStateProvider(baseSelection);
		
		CheckboxTableViewer tableViewer2 = CheckboxTableViewer.newCheckList(grpSecondmodelselection, SWT.BORDER | SWT.V_SCROLL | SWT.CHECK | SWT.SINGLE);
		Table table2 = tableViewer2.getTable();
		table2.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		
		targetSelection = new ModelVersionProvider();
		tableViewer2.setContentProvider(targetSelection);
		tableViewer2.setLabelProvider(targetSelection);
		tableViewer2.setInput(model);
		tableViewer2.addCheckStateListener(targetSelection);
		tableViewer2.setCheckStateProvider(targetSelection);
		setPageComplete();
    }

    public ModelVersion getBaseVersion() {
    	return (ModelVersion) this.baseSelection.getCheckedElement();
    }

    public ModelVersion getTargetVersion() {
    	return (ModelVersion) this.targetSelection.getCheckedElement();
    }
    
    /**
     * Returns the string representation of a model file.
     * 
     * @param model
     *            model to get string of.
     * @return
     */
    protected String modelToString(IFile model) {
        if (model != null) {
            String returnString = model.getProject().getName();
            returnString += "/" + model.getProjectRelativePath().toString();
            return returnString;
        }
        return "";
    }
    
    public void setPageComplete() {
    	//ERRORS
    	if (this.baseSelection.getCheckedElement() == null) {
    		this.setErrorMessage("No base version is selected!");
    		this.setPageComplete(false);
    		return;
    	}

    	if (this.targetSelection.getCheckedElement() == null) {
    		this.setErrorMessage("No target version is selected!");
    		this.setPageComplete(false);
    		return;
    	}

    	//WARNINGS
    	if (this.targetSelection.getCheckedElement().equals(this.baseSelection.getCheckedElement())) {
    		this.setMessage("Base version and target version are the same!", DialogPage.WARNING);
    		return;
    	}
    	this.setErrorMessage(null);
    	this.setMessage(null);
		this.setPageComplete(true);
    }

    private class ModelVersionProvider extends LabelProvider implements ICheckStateListener, ICheckStateProvider, IStructuredContentProvider {
    	
    	@Override
		public void dispose() {
		}

		@Override
		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		}

		@Override
		public Object[] getElements(Object inputElement) {
			return model.getVersions().toArray();
		}
    	
    	@Override
    	public Image getImage(Object element) {
    		return super.getImage(element);
    	}
    	
    	@Override
    	public String getText(Object element) {
    		if (element instanceof ModelVersion) {
    			ModelVersion version = (ModelVersion) element;
    			Date date = new Date(version.getTimestamp());
    			DateFormat df = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT);
    			return df.format(date);
    		}
			return super.getText(element);
    	}

    	private Object checkedElement = null;
    	
		@Override
		public void checkStateChanged(CheckStateChangedEvent event) {
			CheckboxTableViewer source = (CheckboxTableViewer) event.getSource();
			if (!event.getChecked()) {
				if (event.getElement().equals(checkedElement)) {
					source.setChecked(checkedElement, false);
					checkedElement = null;
				}
				setPageComplete();
				return;
			}

			//Remove Checked state from old element
			if (checkedElement != null) {
				source.setChecked(checkedElement, false);			
			}

			//Checked new element
			checkedElement = event.getElement();
			source.setChecked(checkedElement, true);
			setPageComplete();
		}

		@Override
		public boolean isChecked(Object element) {
			if (element.equals(firstCheckedElement)) {
				return true;
			}
			return false;
		}

		@Override
		public boolean isGrayed(Object element) {
			return false;
		}
		
		public Object getCheckedElement() {
			return checkedElement;
		}
    }
}
