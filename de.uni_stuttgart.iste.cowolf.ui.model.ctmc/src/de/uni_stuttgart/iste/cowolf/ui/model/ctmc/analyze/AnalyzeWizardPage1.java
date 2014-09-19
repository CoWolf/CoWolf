package de.uni_stuttgart.iste.cowolf.ui.model.ctmc.analyze;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ControlAdapter;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;

import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Comment;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Fragment;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Rule;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Start;

public class AnalyzeWizardPage1 extends WizardPage {

	
	private final static Logger LOGGER = LoggerFactory
			.getLogger(AnalyzeWizardPage1.class);
	
	private Composite container;
	private Resource resource;
	Table table;
	TableViewer tableViewer;
	private List<Object[]> tableData;
	File clsFile;
	private XtextResource pctlRes;
	
	protected AnalyzeWizardPage1(final String pageName, final Resource res) {
		super(pageName);
		this.resource = res;
		this.setTitle("Analyze a ctmc model");
		this.setDescription("Select properties to analyze.");
		
		this.tableData = new LinkedList<>();

		loadPCTL();
	}

	private void loadPCTL() {
		IFile modelfile = ResourcesPlugin.getWorkspace().getRoot()
				.getFile(new Path(resource.getURI().toPlatformString(true)));

		IFile resultfile = ResourcesPlugin.getWorkspace().getRoot()
				.getFile(modelfile.getFullPath().addFileExtension("pctl"));

		clsFile = new File(resultfile.getLocationURI());

		ResourceSet resSet = new ResourceSetImpl();
		
		pctlRes = (XtextResource) resSet.getResource(URI.createPlatformResourceURI(resultfile.getFullPath().toString(), false), true);
		
		if (clsFile.exists()) {
			
			try {
				pctlRes.load(Collections.EMPTY_MAP);
			} catch (IOException e) {
				LOGGER.error("Could not load pctl file", e);
			}
			
			if (pctlRes.getContents().size() == 0 || !(pctlRes.getContents().get(0) instanceof Start)) {
				return;
			}
			
			readTableData();
		}
	}

	private void readTableData() {
		tableData.clear();
		Iterator<Fragment> it = ((Start)pctlRes.getContents().get(0)).getRule().iterator();

		Comment comment = null;
		while (it.hasNext()) {
			Fragment current = it.next();
			if (current instanceof Comment) {
				comment = (Comment) current;
			} else if (current instanceof Rule) {
				tableData.add(new Object[] {null, comment, (Rule) current});
				comment = null;
			}
		}
	}

	public void addTableItem(Comment key, Rule value) {
		tableData.add(new Object[] { null, key, value });

		tableViewer.setInput(tableData);
		tableViewer.refresh();
		if (key != null && !key.getComment().isEmpty()) {
			((Start) pctlRes.getContents().get(0)).getRule().add(key);
		}
		if (value != null) {
			((Start) pctlRes.getContents().get(0)).getRule().add(value);
		}
		
		save();
	}

	public void editTableItem(Integer index, Comment key, Rule value) {
		if (tableData.size() <= index) {
			return;
		}
		
		Start start = (Start) pctlRes.getContents().get(0);
		
		Set<Integer> selection = this.getCheckedItems();
		
		if (tableData.get(index)[1] == null) {
			if (!key.getComment().matches("^/*\\s*$")) {
				// Add comment.
				start.getRule().add(start.getRule().indexOf(tableData.get(index)[2]), key);
				tableData.get(index)[1] = key;
			}
		} else if (key.getComment().matches("^/*\\s*$")) {
			//remove comment.
			start.getRule().remove(tableData.get(index)[1]);
			tableData.get(index)[1] = null;
		} else {
			//update comment.
			((Comment) tableData.get(index)[1]).setComment(key.getComment());
		}
		
		int oldIndex = start.getRule().indexOf(tableData.get(index)[2]);
		ICompositeNode node = NodeModelUtils.getNode((EObject) tableData.get(index)[2]);
		pctlRes.update(node.getOffset(), node.getLength(), NodeModelUtils.getNode(value).getText().trim());
		
		save();
		
		start = (Start) pctlRes.getContents().get(0);
		
		tableData.get(index)[2] = start.getRule().get(oldIndex);
		
		this.readTableData();	
		
		tableViewer.setInput(tableData);
		
		tableViewer.refresh();
		table.redraw();
		this.setCheckedItems(selection);
	}

	private void setCheckedItems(Set<Integer> selection) {
		if (selection == null) {
			return;
		}
		
		for (int i : selection) {
			if (i < table.getItemCount()) {
				table.getItem(i).setChecked(true);
			}
		}
	}

	private Set<Integer> getCheckedItems() {
		Set<Integer> result = new TreeSet<>();
		for (int i=0; i<table.getItemCount();i++) {
			if (table.getItem(i).getChecked()) {
				result.add(i);
			}
		}
		return result;
	}

	public void deleteTableItem(int index) {
		Start start = (Start) pctlRes.getContents().get(0);
		
		if (tableData.get(index)[1] != null) {
			start.getRule().remove(tableData.get(index)[1]);
			
		}
		if (tableData.get(index)[2] != null) {
			start.getRule().remove(tableData.get(index)[2]);
		}
		
		save();
		
		tableData.remove(index);
		
		tableViewer.setInput(tableData);
		tableViewer.refresh();
		table.redraw();
	}

	public void save() {
		try {
			pctlRes.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			LOGGER.error("Could not save PCTL file.", e);
		}

	}

	@Override
	public void createControl(final Composite parent) {
		this.container = new Composite(parent, SWT.NONE);
		this.setControl(this.container);
		this.container.setLayout(new GridLayout(5, false));
		
		tableViewer = new TableViewer(container, SWT.CHECK | SWT.FULL_SELECTION);
		tableViewer.setContentProvider(ArrayContentProvider.getInstance());
		table = tableViewer.getTable();
		GridData gd_t = new GridData(SWT.FILL, SWT.FILL, true, true, 5, 1);
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
		
		tableViewer.setLabelProvider(new ITableLabelProvider() {

			@Override
			public void addListener(ILabelProviderListener listener) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void dispose() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public boolean isLabelProperty(Object element, String property) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void removeListener(ILabelProviderListener listener) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public Image getColumnImage(Object element, int columnIndex) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public String getColumnText(Object element, int columnIndex) {
				if (element == null) {
					return null;
				}
				
				if (!(element instanceof Object[]) || columnIndex >= ((Object[]) element).length) {
					return null;
				}
				
				Object col = ((Object[]) element)[columnIndex];
				
				if (col instanceof Comment) {
					return ((Comment) col).getComment().replaceFirst("^/+\\s*", "");
				}
				
				if (col instanceof Rule) {
					return NodeModelUtils.findActualNodeFor((Rule) col).getText().trim();
				}
				
				return null;
			}
			
		});
		
		table.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent arg0) {
				AnalyzeWizardPage1.this.getContainer().updateButtons();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
			}
		});

		container.addControlListener(new ControlAdapter() {
			@Override
			public void controlResized(ControlEvent e) {
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

		tableViewer.setInput(tableData);
		
//		String[] tableData = data.split("//");
//		for (String string : tableData) {
//			if (!string.isEmpty()) {
//				String[] tableSubData = string.split("\n", 2);
//				if (tableSubData.length > 1) {
//					addTableItem(tableSubData[0].trim(), tableSubData[1].trim());
//				} else {
//					addTableItem(tableSubData[0].trim(), "");
//				}
//			}
//		}
		
		Button btnSelectAll = new Button(container, SWT.NONE);
		btnSelectAll.setText("Select All");
		btnSelectAll.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent arg0) {
				for (TableItem item : table.getItems()) {
					item.setChecked(true);
				}
				AnalyzeWizardPage1.this.getContainer().updateButtons();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub

			}
		});

		
		Button btnDeselectAll = new Button(container, SWT.NONE);
		btnDeselectAll.setText("Deselect All");
		btnDeselectAll.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent arg0) {
				for (TableItem item : table.getItems()) {
					item.setChecked(false);
				}
				AnalyzeWizardPage1.this.getContainer().updateButtons();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub

			}
		});


		Button btnAdd = new Button(container, SWT.NONE);
		btnAdd.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, true, false,
				1, 1));
		btnAdd.setText("Add");
		btnAdd.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent arg0) {
				EditPropertiesWizard wizard = new EditPropertiesWizard(
						resource, null, null);
				WizardDialog wizardDialog = new WizardDialog(container
						.getShell(), wizard);
				wizardDialog.create();
				wizardDialog.setBlockOnOpen(true);
				if (wizardDialog.open() == Window.OK) {
					addTableItem(wizard.getKey(), wizard.getValue());
				}
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub

			}
		});

		Button btnEdit = new Button(container, SWT.NONE);
		btnEdit.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false,
				1, 1));
		btnEdit.setText("Edit");
		btnEdit.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent arg0) {
				if (table.getSelectionIndex() == -1) {
					return;
				}
				Object[] item = tableData.get(table.getSelectionIndex());
				EditPropertiesWizard wizard = new EditPropertiesWizard(
						resource, (Comment) item[1], (Rule) item[2]);
				WizardDialog wizardDialog = new WizardDialog(container.getShell(), wizard);
				wizardDialog.create();
				wizardDialog.setBlockOnOpen(true);
				if (wizardDialog.open() == Window.OK) {
					editTableItem(table.getSelectionIndex(), wizard.getKey(),
							wizard.getValue());
				}
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub

			}
		});

		Button btnDelete = new Button(container, SWT.NONE);
		btnDelete.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false,
				false, 1, 1));
		btnDelete.setText("Delete");
		btnDelete.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent arg0) {
				if (table.getSelectionIndex() == -1) {
					return;
				}
				deleteTableItem(table.getSelectionIndex());
				AnalyzeWizardPage1.this.getContainer().updateButtons();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub

			}
		});
	}

	public void setProperties(final HashMap<String, Object> properties) {
		ArrayList<String> propsNames = new ArrayList<String>();
		ArrayList<String> props = new ArrayList<String>();
		for (TableItem item : table.getItems()) {
			if (item.getChecked()) {
				propsNames.add(item.getText(1));
				props.add(item.getText(2));
			}
		}
		
		properties.put("analyzePropertyNames", propsNames);
		properties.put("analyzeProperties", props);
	}

	@Override
	public boolean isPageComplete() {
		this.setErrorMessage(null);

		for (TableItem tableItem : table.getItems()) {
			if (tableItem.getChecked()) {
				return true;
			}
		}
		this.setErrorMessage("Please select at least one property.");
		return false;
	}

}
