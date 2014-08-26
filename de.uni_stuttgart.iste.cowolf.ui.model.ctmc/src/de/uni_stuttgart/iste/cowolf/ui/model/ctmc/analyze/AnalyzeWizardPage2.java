package de.uni_stuttgart.iste.cowolf.ui.model.ctmc.analyze;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.viewers.IBaseLabelProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeNode;
import org.eclipse.jface.viewers.TreeNodeContentProvider;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.ui.dialogs.ContainerCheckedTreeViewer;

import de.uni_stuttgart.iste.cowolf.model.ctmc.CTMC;
import de.uni_stuttgart.iste.cowolf.model.ctmc.State;

public class AnalyzeWizardPage2 extends WizardPage {

	private Composite container;

	private Resource resource;

	private CheckboxTreeViewer chkList;

	private Button btnAbsorbing;

	private TreeNode labelNode;

	private TreeNode stateNode;

	protected AnalyzeWizardPage2(final String pageName, final Resource res) {
		super(pageName);
		this.resource = res;
		this.setTitle("Analyze a ctmc model");
		this.setDescription("Select properties to analyze.");
	}

	@Override
	public void createControl(final Composite parent) {
		this.container = new Composite(parent, SWT.NONE);
		this.setControl(this.container);
		this.container.setLayout(new GridLayout(1, false));

		this.chkList = new ContainerCheckedTreeViewer(this.container, SWT.NONE);
		this.chkList.getTree().setLayoutData(new GridData(GridData.FILL_BOTH));
		this.chkList.setContentProvider(new TreeNodeContentProvider());
		this.chkList.setLabelProvider(getLabelProvider());

		this.chkList.setInput(this.getTree());
		this.chkList.expandAll();

		this.chkList
				.addPostSelectionChangedListener(new ISelectionChangedListener() {

					@Override
					public void selectionChanged(SelectionChangedEvent event) {
						AnalyzeWizardPage2.this.getContainer().updateButtons();
					}
				});

		this.btnAbsorbing = new Button(this.container, SWT.CHECK);
		this.btnAbsorbing.setSelection(true);
		this.btnAbsorbing.setText("Include absorbing states");
		this.btnAbsorbing.addListener(SWT.Selection, new Listener() {

			@Override
			public void handleEvent(Event event) {
				AnalyzeWizardPage2.this.getContainer().updateButtons();
			}
		});
	}

	private TreeNode[] getTree() {
		this.labelNode = new TreeNode("Labels");

		this.stateNode = new TreeNode("States");
		if (resource == null || resource.getContents() == null
				|| resource.getContents().get(0) == null
				|| ((CTMC) resource.getContents().get(0)).getStates() == null) {
			return new TreeNode[] { labelNode, stateNode };
		}

		ArrayList<TreeNode> states = new ArrayList<TreeNode>(((CTMC) resource
				.getContents().get(0)).getStates().size());

		ArrayList<String> labelNames = new ArrayList<String>();
		for (State s : ((CTMC) resource.getContents().get(0)).getStates()) {
			if (s.getName() != null && !s.getName().isEmpty()) {
				TreeNode node = new TreeNode(s);
				node.setParent(stateNode);
				states.add(node);
			}
			for (de.uni_stuttgart.iste.cowolf.model.ctmc.Label l : s
					.getLabels()) {
				if (!labelNames.contains(l.getName())) {
					labelNames.add(l.getName());
				}
			}
		}

		ArrayList<TreeNode> labels = new ArrayList<TreeNode>(labelNames.size());

		for (String name : labelNames) {
			TreeNode node = new TreeNode(name);
			node.setParent(labelNode);
			labels.add(node);
		}

		labelNode.setChildren(labels.toArray(new TreeNode[0]));
		stateNode.setChildren(states.toArray(new TreeNode[0]));

		return new TreeNode[] { labelNode, stateNode };
	}

	private IBaseLabelProvider getLabelProvider() {
		// TODO Auto-generated method stub
		return new ILabelProvider() {

			@Override
			public void removeListener(ILabelProviderListener listener) {
				// TODO Auto-generated method stub

			}

			@Override
			public boolean isLabelProperty(Object element, String property) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void dispose() {
				// TODO Auto-generated method stub

			}

			@Override
			public void addListener(ILabelProviderListener listener) {
				// TODO Auto-generated method stub

			}

			@Override
			public String getText(Object element) {
				// TODO Auto-generated method stub
				if (!(element instanceof TreeNode)) {
					return null;
				}
				TreeNode node = (TreeNode) element;
				if (node.getValue() instanceof String) {
					return (String) node.getValue();
				} else if (node.getValue() instanceof State) {
					if (((State) node.getValue()).getName().isEmpty()) {
						return ((State) node.getValue()).getId();
					} else {
						return ((State) node.getValue()).getName();
					}
				}

				return null;
			}

			@Override
			public Image getImage(Object element) {
				// TODO Auto-generated method stub
				return null;
			}
		};

	}

	public void setProperties(final HashMap<String, Object> properties) {

		TreeSet<String> labels = new TreeSet<String>();
		TreeSet<String> states = new TreeSet<String>();

		for (Object obj : this.chkList.getCheckedElements()) {
			if (!(obj instanceof TreeNode)) {
				continue;
			}
			TreeNode node = (TreeNode) obj;
			if (node.getParent() == null) {
				continue;
			}

			if (node.getParent().equals(this.labelNode)) {
				labels.add((String) node.getValue());
			} else if (node.getParent().equals(this.stateNode)) {
				states.add(((State) node.getValue()).getId());
			}
		}

		properties.put("analyzeAbsorbing", this.btnAbsorbing.getSelection());
		properties.put("analyzeLabels", labels);
		properties.put("analyzeStates", states);
	}

	@Override
	public boolean isPageComplete() {
		this.setErrorMessage(null);
		if (chkList.getCheckedElements().length > 2) {
			return true;
		} else {
			// If less than three elements are selected, make sure that at least one proper state is selected (not a top level node).
			for (Object obj : this.chkList.getCheckedElements()) {
				if (!(obj instanceof TreeNode)) {
					continue;
				}
				TreeNode node = (TreeNode) obj;
				if (node.getParent() != null) {
					return true;
				}
			}
		}

		// If absorbing states are selected and at least one absorbing state exists, evaluation can be performed.
		if (btnAbsorbing.getSelection()) {
			if (resource != null
					&& resource.getContents() != null
					&& resource.getContents().get(0) != null
					&& ((CTMC) resource.getContents().get(0)).getStates() != null) {
				for (State state : ((CTMC) resource.getContents().get(0))
						.getStates()) {
					if (state.getOutgoing() == null
							|| state.getOutgoing().size() == 0) {
						return true;
					}
				}
			}
		}

		this.setErrorMessage("Please make at least one selection.");
		return false;
	}

}
