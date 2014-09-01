package de.uni_stuttgart.iste.cowolf.ui.model.ctmc.analyze;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.TreeSet;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ControlAdapter;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
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

public class AnalyzeWizardPage1 extends WizardPage {

	private Composite container;
	private Resource resource;
	Table table;
	TableViewer tableViewer;
	String data;
	File clsFile;

	protected AnalyzeWizardPage1(final String pageName, final Resource res) {
		super(pageName);
		this.resource = res;
		this.setTitle("Analyze a ctmc model");
		this.setDescription("Select properties to analyze.");

		IFile modelfile = ResourcesPlugin.getWorkspace().getRoot()
				.getFile(new Path(resource.getURI().toPlatformString(true)));

		IFile resultfile = ResourcesPlugin.getWorkspace().getRoot()
				.getFile(modelfile.getFullPath().addFileExtension("csl"));

		clsFile = new File(resultfile.getLocationURI());

		data = "";
		if (clsFile.exists()) {
			try (BufferedReader reader = new BufferedReader(new FileReader(
					clsFile))) {

				String line = null;
				while ((line = reader.readLine()) != null) {
					data += line;
				}
			} catch (IOException x) {
				System.err.format("IOException: %s%n", x);
			}
		} else {
			try {
				clsFile.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void addTableItem(String key, String value) {
		TableItem item = new TableItem(table, SWT.NONE);
		item.setText(new String[] { null, key, value });
		save();
	}

	public void editTableItem(Integer index, String key, String value) {
		TableItem item = table.getItem(index);
		item.setText(new String[] { null, key, value });
		save();
	}

	public void deleteTableItem(Integer index) {
		table.remove(index);
		save();
	}

	public void save() {
		try {
			FileOutputStream out = new FileOutputStream(clsFile);
			for (TableItem tableItem : table.getItems()) {
				out.write((tableItem.getText(1) + "," + tableItem.getText(2) + "_")
						.getBytes());
			}
			out.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void createControl(final Composite parent) {
		this.container = new Composite(parent, SWT.NONE);
		this.setControl(this.container);
		this.container.setLayout(new GridLayout(3, false));

		tableViewer = new TableViewer(container, SWT.CHECK | SWT.FULL_SELECTION);
		tableViewer.setContentProvider(ArrayContentProvider.getInstance());
		table = tableViewer.getTable();
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

		String[] tableData = data.split("_");
		for (String string : tableData) {
			if (string.contains(",")) {
				String[] tableSubData = string.split(",");
				if (tableSubData.length > 1) {
					addTableItem(tableSubData[0], tableSubData[1]);
				} else {
					addTableItem(tableSubData[0], "");
				}
			}
		}

		Button btnAdd = new Button(container, SWT.NONE);
		btnAdd.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, true, false,
				1, 1));
		btnAdd.setText("Add");
		btnAdd.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent arg0) {
				EditPropertiesWizard wizard = new EditPropertiesWizard(
						resource, "", "");
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
				TableItem item = table.getItem(table.getSelectionIndex());
				EditPropertiesWizard wizard = new EditPropertiesWizard(
						resource, item.getText(1), item.getText(2));
				WizardDialog wizardDialog = new WizardDialog(container
						.getShell(), wizard);
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

		TreeSet<String> labels = new TreeSet<String>();
		TreeSet<String> states = new TreeSet<String>();

		// properties.put("analyzeAbsorbing", this.btnAbsorbing.getSelection());
		properties.put("analyzeLabels", labels);
		properties.put("analyzeStates", states);
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
