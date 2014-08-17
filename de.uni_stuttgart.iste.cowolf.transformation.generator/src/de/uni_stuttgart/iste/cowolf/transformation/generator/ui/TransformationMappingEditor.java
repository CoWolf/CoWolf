package de.uni_stuttgart.iste.cowolf.transformation.generator.ui;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.part.EditorPart;

public class TransformationMappingEditor extends EditorPart {

	public TransformationMappingEditor() {
	}

	public static final String ID = "de.uni_stuttgart.iste.cowolf.transformation.generator.ui.TransformationMappingEditor";

	private TransformationMappingEditorInput input;

	private boolean inputFileChanged;

	private Label contents;

	private TableViewer viewer;

	@Override
	public void doSave(IProgressMonitor monitor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void doSaveAs() {
		// TODO Auto-generated method stub

	}

	@Override
	public void init(IEditorSite site, IEditorInput input)
			throws PartInitException {

		if (!(input instanceof TransformationMappingEditorInput)) {
			throw new RuntimeException("Wrong input");
		}

		this.input = (TransformationMappingEditorInput) input;

		this.setSite(site);
		this.setInput(input);

	}

	@Override
	public boolean isDirty() {
		return this.inputFileChanged;
	}

	@Override
	public boolean isSaveAsAllowed() {
		return true;
	}

	@Override
	public void createPartControl(Composite parent) {

		FormToolkit toolkit = new FormToolkit(parent.getDisplay());

		ScrolledForm form = toolkit.createScrolledForm(parent);

		// ToolBarManager manager = (ToolBarManager) form.getToolBarManager();
		toolkit.decorateFormHeading(form.getForm());

		// IMenuService menuService = (IMenuService) this.getSite().getService(
		// IMenuService.class);
		// menuService.populateContributionManager(manager,
		// "popup:formsToolBar");
		// manager.update(true);

		form.setText("Transformation Mapping Editor");

		FillLayout fillLayout_1 = new FillLayout(SWT.HORIZONTAL);
		fillLayout_1.spacing = 20;
		fillLayout_1.marginWidth = 10;
		fillLayout_1.marginHeight = 10;
		form.getBody().setLayout(fillLayout_1);

		Section section1 = toolkit.createSection(form.getBody(),
				Section.DESCRIPTION | Section.TITLE_BAR);
		section1.setText("SiLift recognition rules");
		section1.setDescription("Define a recognition rule as part of a SiLift rulebase that should be the source of the mapping.");
		Composite composite = toolkit.createComposite(section1, SWT.WRAP);
		toolkit.paintBordersFor(composite);
		composite.setLayout(new GridLayout(1, false));

		Tree henshinRulesTree = toolkit.createTree(parent, SWT.H_SCROLL
				| SWT.V_SCROLL);
		TreeViewer henshinRulesTreeViewer = new TreeViewer(henshinRulesTree);

		Button b = toolkit.createButton(composite, "Add rulebase...", SWT.PUSH);

		gd = new GridData(GridData.VERTICAL_ALIGN_BEGINNING);
		b.setLayoutData(gd);

		section1.setClient(composite);

		Section section2 = toolkit.createSection(form.getBody(),
				Section.DESCRIPTION | Section.TITLE_BAR);
		section2.setDescription("Define a Henshin rule that should be the target of the mapping.");
		section2.setText("Henshin Transformation Rules");

		Composite composite2 = toolkit.createComposite(section2, SWT.WRAP);
		composite2.setLayout(new GridLayout(2, false));

		Table t2 = toolkit.createTable(composite2, SWT.NONE);
		GridData gd_t2 = new GridData(GridData.FILL_BOTH);
		// gd_t2.widthHint = 100;
		t2.setLayoutData(gd_t2);
		toolkit.paintBordersFor(composite2);

		Button b2 = toolkit.createButton(composite2, "Add directory...",
				SWT.PUSH);
		gd_t2 = new GridData(GridData.VERTICAL_ALIGN_BEGINNING);
		b2.setLayoutData(gd_t2);

		section2.setClient(composite2);

		// GridLayout layout = new GridLayout();
		// layout.numColumns = 2;
		// layout.marginWidth = 2;
		// layout.marginHeight = 2;

		// this.viewer = new TableViewer(t);
		// this.viewer.setContentProvider(new ArrayContentProvider());
		// TableViewerColumn viewerColumn = new TableViewerColumn(this.viewer,
		// SWT.NONE);
		// viewerColumn.getColumn().setWidth(100);
		// viewerColumn.setLabelProvider(new ColumnLabelProvider() {
		//
		// @Override
		// public String getText(Object element) {
		// return element.toString();
		// };
		//
		// @Override
		// public Image getImage(Object element) {
		// return PlatformUI.getWorkbench().getSharedImages()
		// .getImage(ISharedImages.IMG_OBJ_ELEMENT);
		// };
		// });

		// this.viewer.setInput(this.getEditorSite());

		// try {
		//
		// Mappings mappings = XMLMappingLoader.loadMapping(this.input
		// .getFile());
		//
		// } catch (JAXBException e) {
		// e.printStackTrace();
		// ErrorDialog.openError(parent.getShell(),
		// "Invalid Transformation Mapping file",
		// "File " + this.input.getFilePath()
		// + " is not a valid Transformation Mapping file.",
		// Status.OK_STATUS);
		// }

	}

	@Override
	public void setFocus() {

		this.viewer.getControl().setFocus();

	}

	// @Override
	// protected void addPages() {
	// this.addPage(new TransformationMappingEditorPage(this));
	// }

}
