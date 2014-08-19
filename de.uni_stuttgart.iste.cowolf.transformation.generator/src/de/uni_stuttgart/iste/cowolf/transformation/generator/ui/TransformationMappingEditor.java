package de.uni_stuttgart.iste.cowolf.transformation.generator.ui;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.ui.dialogs.WorkspaceResourceDialog;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.part.EditorPart;
import org.sidiff.difference.rulebase.extension.IRuleBase;
import org.sidiff.difference.rulebase.util.RuleBaseUtil;

import de.uni_stuttgart.iste.cowolf.core.extensions.ExtensionHandler;

public class TransformationMappingEditor extends EditorPart {

	public TransformationMappingEditor() {
	}

	public static final String ID = "de.uni_stuttgart.iste.cowolf.transformation.generator.ui.TransformationMappingEditor";

	private TransformationMappingEditorInput input;

	private boolean inputFileChanged;

	private Composite parent;

	private TreeViewer henshinRulesTreeViewer;

	private List<IFile> henshinTransformationRules;

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

		this.parent = parent;

		FormToolkit toolkit = new FormToolkit(parent.getDisplay());

		ScrolledForm editorScrolledForm = toolkit.createScrolledForm(parent);

		// ToolBarManager manager = (ToolBarManager) form.getToolBarManager();
		toolkit.decorateFormHeading(editorScrolledForm.getForm());

		// IMenuService menuService = (IMenuService) this.getSite().getService(
		// IMenuService.class);
		// menuService.populateContributionManager(manager,
		// "popup:formsToolBar");
		// manager.update(true);

		editorScrolledForm.setText("CoWolf Transformation Mapping Editor");

		FillLayout editorLayout = new FillLayout(SWT.HORIZONTAL);
		editorLayout.spacing = 20;
		editorLayout.marginWidth = 10;
		editorLayout.marginHeight = 10;
		editorScrolledForm.getBody().setLayout(editorLayout);

		createRecognitionRulesSection(toolkit, editorScrolledForm);
		createHenshinRulesSection(toolkit, editorScrolledForm);

		henshinTransformationRules = new ArrayList<IFile>();

	}

	private void createRecognitionRulesSection(FormToolkit toolkit,
			ScrolledForm form) {
		Section section1 = toolkit.createSection(form.getBody(),
				Section.DESCRIPTION | Section.TITLE_BAR);
		section1.setText("SiLift recognition rules");
		section1.setDescription("Define a recognition rule as part of a SiLift rulebase that should be the source of the mapping.");

		Composite section1Composite = toolkit.createComposite(section1);
		section1Composite.setLayout(new GridLayout(2, false));

		Tree recognitionRulesTree = toolkit.createTree(section1Composite,
				SWT.H_SCROLL | SWT.V_SCROLL);
		TreeViewer recognitionRulesTreeViewer = new TreeViewer(
				recognitionRulesTree);

		recognitionRulesTreeViewer
				.setContentProvider(new SiLiftRecognitionRulesContentProvider());
		recognitionRulesTreeViewer
				.setInput(getRecognitionRulesTreeViewerInitialInput());
		recognitionRulesTreeViewer
				.setLabelProvider(new SiLiftRecognitionRulesLabelProvider());
		recognitionRulesTreeViewer.expandAll();

		GridData recognitionRulesTreeGridData = new GridData(GridData.FILL_BOTH);
		recognitionRulesTree.setLayoutData(recognitionRulesTreeGridData);

		toolkit.paintBordersFor(section1Composite);

		Button addRulebaseButton = toolkit.createButton(section1Composite,
				"Add rulebases...", SWT.PUSH);

		GridData addRulebaseButtonGridData = new GridData(
				GridData.VERTICAL_ALIGN_BEGINNING);
		addRulebaseButton.setLayoutData(addRulebaseButtonGridData);

		section1.setClient(section1Composite);

	}

	private IRuleBase[] getRecognitionRulesTreeViewerInitialInput() {

		List<String> modelDocumentTypes = ExtensionHandler.getInstance()
				.getAllModelDocumentTypes();

		Set<IRuleBase> allRuleBases = new HashSet<IRuleBase>();

		// add only the SiLift rule bases for the evolution of the CoWolf models
		for (String modelDocumentType : modelDocumentTypes) {

			for (IRuleBase ruleBase : RuleBaseUtil
					.getAvailableRulebases(modelDocumentType)) {
				allRuleBases.add(ruleBase);
			}
		}

		return allRuleBases.toArray(new IRuleBase[allRuleBases.size()]);

	}

	private void createHenshinRulesSection(FormToolkit toolkit,
			ScrolledForm form) {

		Section section2 = toolkit.createSection(form.getBody(),
				Section.DESCRIPTION | Section.TITLE_BAR);
		section2.setDescription("Define a Henshin rule that should be the target of the mapping.");
		section2.setText("Henshin Transformation Rules");

		Composite section2Composite = toolkit.createComposite(section2);
		section2Composite.setLayout(new GridLayout(2, false));

		Tree henshinRulesTree = toolkit.createTree(section2Composite,
				SWT.H_SCROLL | SWT.V_SCROLL);
		henshinRulesTreeViewer = new TreeViewer(henshinRulesTree);

		henshinRulesTreeViewer
				.setContentProvider(new TransformationRulesContentProvider());

		// TODO
		// henshinRulesTreeViewer
		// .setInput(getRecognitionRulesTreeViewerInitialInput());

		henshinRulesTreeViewer
				.setLabelProvider(new TransformationRulesLabelProvider());
		henshinRulesTreeViewer.expandAll();

		GridData henshinRulesTreeGridData = new GridData(GridData.FILL_BOTH);
		henshinRulesTree.setLayoutData(henshinRulesTreeGridData);

		toolkit.paintBordersFor(section2Composite);

		Button addDirButton = toolkit.createButton(section2Composite,
				"Add directories...", SWT.PUSH);
		GridData addDirButtonGridData = new GridData(
				GridData.VERTICAL_ALIGN_BEGINNING);
		addDirButton.setLayoutData(addDirButtonGridData);

		addDirButton.addSelectionListener(this.browseWorkspace(parent
				.getShell()));

		section2.setClient(section2Composite);

	}

	protected SelectionListener browseWorkspace(final Shell shell) {

		SelectionListener listener = new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {

				List<ViewerFilter> filters = new ArrayList<ViewerFilter>();
				filters.add(new WorkspaceResourceDialogFilter());
				IFile[] files = WorkspaceResourceDialog
						.openFileSelection(
								shell,
								"Choose transformation rules",
								"Choose directories with Henshin transformation rules.",
								true, null, filters);

				// directories[0].

				
				
				henshinTransformationRules.addAll(Arrays.asList(files));

				henshinRulesTreeViewer.add(henshinRulesTreeViewer.getInput(),
						files);

			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// nothing to do
			}
		};
		return listener;
	}

	private void addDirsToTransformationRulesTreeViewer(File[] dirs) {

	}

	@Override
	public void setFocus() {
		if (parent != null) {
			parent.setFocus();
		}
	}

}
