package de.uni_stuttgart.iste.cowolf.ui.model.ctmc.analyze;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.IBaseLabelProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TreeNode;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ControlAdapter;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.ScrollBar;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;

import de.uni_stuttgart.iste.cowolf.model.ctmc.CTMC;
import de.uni_stuttgart.iste.cowolf.model.ctmc.State;

public class AnalyzeWizardPage2 extends WizardPage {

	private Composite container;

	private Resource resource;

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
		this.container.setLayout(new GridLayout(3, false));

		TableViewer tableViewer = new TableViewer(container, SWT.CHECK | SWT.FULL_SELECTION);
		tableViewer.setContentProvider(ArrayContentProvider.getInstance());
		final Table table = tableViewer.getTable();
		GridData gd_t = new GridData(SWT.FILL, SWT.FILL, true, true, 3, 1);
		gd_t.widthHint = 554;
		table.setLayoutData(gd_t);
		table.setLinesVisible(true);

		final TableColumn column1 = new TableColumn(table, SWT.CENTER);
		column1.setResizable(false);
		column1.setText(" ");
		column1.setWidth(40);
		final TableColumn column2 = new TableColumn(table, SWT.LEFT);
		column2.setText("Name");
		column2.setWidth(180);
		final TableColumn column3 = new TableColumn(table, SWT.LEFT);
		column3.setResizable(false);
		column3.setText("Property");
		column3.setWidth(180);
		table.setHeaderVisible(true);

		container.addControlListener(new ControlAdapter() {
			@Override
			public void controlResized(ControlEvent e) {
				// TODO Auto-generated method stub
				super.controlResized(e);
				Rectangle area = container.getClientArea();
				Point size = table.computeSize(SWT.DEFAULT, SWT.DEFAULT);

				ScrollBar vBar = table.getVerticalBar();
				int width = area.width - table.computeTrim(0, 0, 0, 0).width
						- vBar.getSize().x;
				if (size.y > area.height + table.getHeaderHeight()) {
					// Subtract the scrollbar width from the total column width
					// if a vertical scrollbar will be required
					Point vBarSize = vBar.getSize();
					width -= vBarSize.x;
				}
				Point oldSize = table.getSize();
				if (oldSize.x > area.width) {
					// table is getting smaller so make the columns
					// smaller first and then resize the table to
					// match the client area width
					column3.setWidth(width - column1.getWidth()
							- column2.getWidth());
					
					table.setSize(area.width, area.height);
				} else {
					// table is getting bigger so make the table
					// bigger first and then make the columns wider
					// to match the client area width
					table.setSize(area.width, area.height);
					column3.setWidth(width - column1.getWidth()
							- column2.getWidth());
				}

			}
		});

		TableItem item1 = new TableItem(table, SWT.NONE);
		item1.setText(new String[] { null, "Tim" });
		TableItem item2 = new TableItem(table, SWT.NONE);
		item2.setText(new String[] { "", "Dave" });
		TableItem item3 = new TableItem(table, SWT.NONE);
		item3.setText(new String[] { "", "Johannes" });

		Button btnAdd = new Button(container, SWT.NONE);
		btnAdd.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, true, false,
				1, 1));
		btnAdd.setText("Add");

		Button btnEdit = new Button(container, SWT.NONE);
		btnEdit.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false,
				1, 1));
		btnEdit.setText("Edit");

		Button btnDelete = new Button(container, SWT.NONE);
		btnDelete.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false,
				false, 1, 1));
		btnDelete.setText("Delete");
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

		// for (Object obj : this.chkList.getCheckedElements()) {
		// if (!(obj instanceof TreeNode)) {
		// continue;
		// }
		// TreeNode node = (TreeNode) obj;
		// if (node.getParent() == null) {
		// continue;
		// }
		//
		// if (node.getParent().equals(this.labelNode)) {
		// labels.add((String) node.getValue());
		// } else if (node.getParent().equals(this.stateNode)) {
		// states.add(((State) node.getValue()).getId());
		// }
		// }

		// properties.put("analyzeAbsorbing", this.btnAbsorbing.getSelection());
		properties.put("analyzeLabels", labels);
		properties.put("analyzeStates", states);
	}

	@Override
	public boolean isPageComplete() {
		this.setErrorMessage(null);
		// if (chkList.getCheckedElements().length > 2) {
		// return true;
		// } else {
		// // If less than three elements are selected, make sure that at least
		// // one proper state is selected (not a top level node).
		// for (Object obj : this.chkList.getCheckedElements()) {
		// if (!(obj instanceof TreeNode)) {
		// continue;
		// }
		// TreeNode node = (TreeNode) obj;
		// if (node.getParent() != null) {
		// return true;
		// }
		// }
		// }

		// If absorbing states are selected and at least one absorbing state
		// exists, evaluation can be performed.
		// if (btnAbsorbing.getSelection()) {
		// if (resource != null
		// && resource.getContents() != null
		// && resource.getContents().get(0) != null
		// && ((CTMC) resource.getContents().get(0)).getStates() != null) {
		// for (State state : ((CTMC) resource.getContents().get(0))
		// .getStates()) {
		// if (state.getOutgoing() == null
		// || state.getOutgoing().size() == 0) {
		// return true;
		// }
		// }
		// }
		// }

		this.setErrorMessage("Please make at least one selection.");
		return false;
	}

}
