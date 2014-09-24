package de.uni_stuttgart.iste.cowolf.ui.tests;

import static java.nio.file.FileSystems.getDefault;
import static org.eclipse.xtext.junit4.ui.util.IResourcesSetupUtil.cleanWorkspace;
import static org.junit.Assert.*;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Widget;
import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotEclipseEditor;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotEditor;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotView;
import org.eclipse.swtbot.swt.finder.SWTBot;
import org.eclipse.swtbot.swt.finder.finders.UIThreadRunnable;
import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.eclipse.swtbot.swt.finder.results.Result;
import org.eclipse.swtbot.swt.finder.utils.SWTBotPreferences;
import org.eclipse.swtbot.swt.finder.widgets.AbstractSWTBot;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTreeItem;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.eclipse.xtext.junit4.ui.util.IResourcesSetupUtil.cleanWorkspace;

@RunWith(SWTBotJunit4ClassRunner.class)
public class CoWolfEditorTest {

	private static SWTWorkbenchBot bot;
	private static TestDriver testDriver = null;
	
	String _dtmc_file_name = "My.dtmc";
	String _ctmc_file_name = "My.ctmc";
	String _statechart_file_name = "My.statechart";
	String _faulttree_file_name = "My.faulttree";
	String _activity_file_name = "My.activity_diagram";
	String _component_file_name = "My.component_diagram";
	

	@BeforeClass
	public static void beforeClass() throws Exception {
		bot = new SWTWorkbenchBot();
		SWTBotPreferences.TIMEOUT = 10000;
		testDriver = new TestDriver();
		try {
			cleanWorkspace();
			bot.viewByTitle("Welcome").close();
		} catch (Exception ex) {
			// Welcome view not open
			// -> continuing
		}
	}

	// Tests for CoWolf project model editors
	// CoWolf consists of the following model Editors:
	// - Activity Diagram editor
	// - DTMC editor
	// - CTMC editor
	// - Statechart editor
	// - Component_diagramemf editor

	// dtmc editor test
	@Test
	public void dtmcEditorTest() throws Exception {
		

		projectInit(TestDriver._cowolf_model_dtmc);

		// Set the Cowolf view active to open the My.Dtmc file
		testDriver.setFocusCoWolfView(bot);

		// operate on the dtmc file
		SWTBotEditor editor = testDriver.getFileEditor(bot, _dtmc_file_name);
		editor.saveAndClose();
		// open My.dtmc as text file
		bot.viewByTitle(TestDriver._cowolf_view).setFocus();
		bot.tree().getTreeItem(TestDriver._cowolf_project_name).getNode(_dtmc_file_name)
				.select().contextMenu("Open With").menu(TestDriver._cowolf_Dialog_Open_With_dtmc).click();
		
		// We set a refrence to the dtmc node, to extend it with States and
		// transitions
		editor = testDriver.getFileEditor(bot, _dtmc_file_name);
		SWTBotTreeItem dtmcRootNode = getRootNode(editor, _dtmc_file_name, "DTMC");
		
		SWTBotView propertiesView = getPropertiesView(bot, dtmcRootNode);

		// populate DTMC model instance

		// Create states
		createNode(dtmcRootNode, propertiesView, "State", "0");
		createNode(dtmcRootNode, propertiesView, "State", "1");
		createNode(dtmcRootNode, propertiesView, "State", "2");
		createNode(dtmcRootNode, propertiesView, "State", "3");
		createNode(dtmcRootNode, propertiesView, "State", "4");
		createNode(dtmcRootNode, propertiesView, "State", "5");
		createNode(dtmcRootNode, propertiesView, "State", "6");

		createNode(dtmcRootNode, propertiesView, "State", "E1");
		createNode(dtmcRootNode, propertiesView, "State", "E2");
		createNode(dtmcRootNode, propertiesView, "State", "E3");
		createNode(dtmcRootNode, propertiesView, "State", "E4");
		createNode(dtmcRootNode, propertiesView, "State", "E5");
		createNode(dtmcRootNode, propertiesView, "State", "E6");

		editor.bot().tree()
				.getTreeItem("platform:/resource/CoWolf-Test-Project/My.dtmc")
				.select();

		createTransitionWithProperties(dtmcRootNode, propertiesView, "Prob",
				"State 1");
		createTransitionWithProperties(dtmcRootNode, propertiesView, "Prob",
				"State 2");
		createTransitionWithProperties(dtmcRootNode, propertiesView, "Prob",
				"State 3");
		createTransitionWithProperties(dtmcRootNode, propertiesView, "Prob",
				"State 4");
		createTransitionWithProperties(dtmcRootNode, propertiesView, "Prob",
				"State 5");
		createTransitionWithProperties(dtmcRootNode, propertiesView, "Prob",
				"State 6");

		// Save
		editor.saveAndClose();
	}

	@Test
	public void CtmcEditorTest() throws Exception {

		projectInit(TestDriver._cowolf_model_ctmc);

		// Set the Cowolf view active to open the My.Dtmc file
		testDriver.setFocusCoWolfView(bot);

		// operate on the ctmc file
		SWTBotEditor editor = testDriver.getFileEditor(bot, _ctmc_file_name);
		editor.saveAndClose();
		// open My.dtmc as text file
		bot.viewByTitle(TestDriver._cowolf_view).setFocus();
		bot.tree().getTreeItem(TestDriver._cowolf_project_name).getNode(_ctmc_file_name)
				.select().contextMenu("Open With").menu(TestDriver._cowolf_Dialog_Open_With_ctmc).click();
		
		// We set a refrence to the dtmc node, to extend it with States and
		// transitions
		editor = testDriver.getFileEditor(bot, _ctmc_file_name);
		SWTBotTreeItem rootNode = getRootNode(editor, _ctmc_file_name, "CTMC");

		SWTBotView propertiesView = getPropertiesView(bot, rootNode);

		// populate DTMC model instance

		// Create states
		createNode(rootNode, propertiesView, "State", "0");
		createNode(rootNode, propertiesView, "State", "1");
		createNode(rootNode, propertiesView, "State", "2");
		createNode(rootNode, propertiesView, "State", "3");
		createNode(rootNode, propertiesView, "State", "4");
		createNode(rootNode, propertiesView, "State", "5");
		createNode(rootNode, propertiesView, "State", "6");

		createNode(rootNode, propertiesView, "State", "E1");
		createNode(rootNode, propertiesView, "State", "E2");
		createNode(rootNode, propertiesView, "State", "E3");
		createNode(rootNode, propertiesView, "State", "E4");
		createNode(rootNode, propertiesView, "State", "E5");
		createNode(rootNode, propertiesView, "State", "E6");

		editor.bot().tree()
				.getTreeItem("platform:/resource/CoWolf-Test-Project/My.ctmc")
				.select();

		createTransitionWithProperties(rootNode, propertiesView, "Rate",
				"State 1");
		createTransitionWithProperties(rootNode, propertiesView, "Rate",
				"State 2");
		createTransitionWithProperties(rootNode, propertiesView, "Rate",
				"State 3");
		createTransitionWithProperties(rootNode, propertiesView, "Rate",
				"State 4");
		createTransitionWithProperties(rootNode, propertiesView, "Rate",
				"State 5");
		createTransitionWithProperties(rootNode, propertiesView, "Rate",
				"State 6");

		// Save
		editor.saveAndClose();
	}

	@Test
	public void StateMachineTest() throws Exception {

		projectInit(TestDriver._cowolf_model_statemachine);


		// Set the Cowolf view active to open the file
		testDriver.setFocusCoWolfView(bot);

		// operate on the file
		SWTBotEditor editor = testDriver.getFileEditor(bot, _statechart_file_name);
		editor.saveAndClose();
		// open My.dtmc as text file
		bot.viewByTitle(TestDriver._cowolf_view).setFocus();
		bot.tree().getTreeItem(TestDriver._cowolf_project_name).getNode(_statechart_file_name)
				.select().contextMenu("Open With").menu(TestDriver._cowolf_Dialog_Open_With_statechart).click();
		
		// We set a refrence to the dtmc node, to extend it with States and
		// transitions
		editor = testDriver.getFileEditor(bot, _statechart_file_name);
		SWTBotTreeItem rootNode = getRootNode(editor, _statechart_file_name, "State Machine Root");

		SWTBotView propertiesView = getPropertiesView(bot, rootNode);

		// populate model instance

		// Create states
		createNode(rootNode, propertiesView, "State", "START");
		createNode(rootNode, propertiesView, "State", "STOP");

		editor.bot()
				.tree()
				.getTreeItem(
						"platform:/resource/CoWolf-Test-Project/My.statechart")
				.select();

		createTransition(rootNode, propertiesView, "State START");
		bot.sleep(20);
		createTransition(rootNode, propertiesView, "State STOP");

		// Save
		editor.saveAndClose();
	}

	@Test
	public void FaultTreeTest() throws Exception {

		projectInit(TestDriver._cowolf_model_faulttree);

		// Set the Cowolf view active to open the My.Dtmc file
		testDriver.setFocusCoWolfView(bot);

		SWTBotEditor editor = testDriver.getFileEditor(bot, _faulttree_file_name);
		editor.saveAndClose();
		// open My.dtmc as text file
		bot.viewByTitle(TestDriver._cowolf_view).setFocus();
		bot.tree().getTreeItem(TestDriver._cowolf_project_name).getNode(_faulttree_file_name)
				.select().contextMenu("Open With").menu(TestDriver._cowolf_Dialog_Open_With_faulttree).click();
		
		// We set a refrence to the dtmc node, to extend it with States and
		// transitions
		editor = testDriver.getFileEditor(bot, _faulttree_file_name);
	  
		SWTBotTreeItem xml = editor
				.bot()
				.tree()
				.getTreeItem(
						"platform:/resource/CoWolf-Test-Project/My.faulttree")
				.expand();

		SWTBotTreeItem[] items = xml.getItems();
		SWTBotTreeItem rootNode = null;
		for (SWTBotTreeItem item : items) {
			if (item.getText().contains("Fault Tree")) {
				rootNode = item;
			}
		}
		assertNotNull(rootNode);

		SWTBotView propertiesView = getPropertiesView(bot, rootNode);
		// populate model instance
		rootNode.select().contextMenu("New Child").menu("Hazard Hazard")
				.click();
		rootNode.select().contextMenu("New Child").menu("Event Hazard").click();
		rootNode.select().contextMenu("New Child")
				.menu("Event Intermediate Event").click();
		rootNode.select().contextMenu("New Child").menu("Event Basic Event")
				.click();
		rootNode.select().contextMenu("New Child")
				.menu("Event Undeveloped Event").click();
		rootNode.select().contextMenu("New Child").menu("Failure Instance")
				.click();
		rootNode.select().contextMenu("New Child").menu("Error Type").click();

		editor.bot()
				.tree()
				.getTreeItem(
						"platform:/resource/CoWolf-Test-Project/My.faulttree")
				.select();

		editor.saveAndClose();
	}

	@Test
	public void ActivityDiagramTest() throws Exception {

		projectInit(TestDriver._cowolf_model_activity);

		// Set the Cowolf view active to open the My.Dtmc file
		testDriver.setFocusCoWolfView(bot);
		bot.sleep(2000);
		SWTBotEditor editor = testDriver.getFileEditor(bot, _activity_file_name);
		
		editor = testDriver.getFileEditor(bot, _activity_file_name);
		bot.sleep(2000);
		SWTBotTreeItem xml = editor
				.bot()
				.tree()
				.getTreeItem(
						"platform:/resource/CoWolf-Test-Project/My.activity_diagram")
				.expand();

		SWTBotTreeItem[] items = xml.getItems();
		SWTBotTreeItem rootNode = null;
		for (SWTBotTreeItem item : items) {
			if (item.getText().contains("Activity Diagram")) {
				rootNode = item;
			}
		}
		assertNotNull(rootNode);

		SWTBotView propertiesView = getPropertiesView(bot, rootNode);

		// populate model instance
		createNode(rootNode, propertiesView, "Start", "");
		createNode(rootNode, propertiesView, "Decision", "");
		createNode(rootNode, propertiesView, "Action", "");
		createNode(rootNode, propertiesView, "Split", "");
		createNode(rootNode, propertiesView, "Join", "");
		createNode(rootNode, propertiesView, "End", "");

		editor.bot()
				.tree()
				.getTreeItem(
						"platform:/resource/CoWolf-Test-Project/My.activity_diagram")
				.select();
		// Save
		editor.saveAndClose();
	}

	@Test
	public void ComponentDiagramTest() throws Exception {

		projectInit(TestDriver._cowolf_model_component);

		// Set the Cowolf view active to open the My.activity file
		testDriver.setFocusCoWolfView(bot);

		// operate on the component_diagram file
		SWTBotEditor editor = testDriver.getFileEditor(bot, _component_file_name);

		editor = testDriver.getFileEditor(bot, _component_file_name);

		// We set a refrence to the node, to extend it
		SWTBotTreeItem rootNode = getRootNode(editor, _component_file_name,
				"Architecture");
		bot.sleep(4000);
		SWTBotView propertiesView = getPropertiesView(bot, rootNode);

		// populate model instance

		createNode(rootNode, propertiesView, "Software Component", "Mail Entry");
		createNode(rootNode, propertiesView, "Software Component", "Mail Exit");
		createNode(rootNode, propertiesView, "Software Component", "Mail Management");

		rootNode.getNode("Software Component Mail Entry").contextMenu("New Child")
				.menu("Port Type").click();
		propertiesView.bot().tree().getTreeItem("Name").select().click();
		propertiesView.bot().text().setText("Receive Mail");
		rootNode.getNode("Software Component Mail Entry").select();

		editor.bot()
				.tree()
				.getTreeItem(
						"platform:/resource/CoWolf-Test-Project/My.component_diagram")
				.select();
		// Save
		editor.saveAndClose();
	}

	// /**
	// * Return the cell editor control associated to the TreeItem.
	// *
	// * @param item
	// * the tree item
	// * @param clazz
	// * Text or CCombo are the only one supported for now
	// * @return The associated SWTBot adapter for the control.
	// */
	// public static AbstractSWTBot<? extends Widget> getCellEditor( final
	// SWTBotTreeItem item, final Class<? extends Widget> clazz) {
	//
	// return UIThreadRunnable.syncExec(item,
	// new Result<AbstractSWTBot<? extends Widget>>() {
	// public AbstractSWTBot<? extends Widget> run() {
	//
	// if (!clazz.equals(Text.class)
	// && !clazz.equals(CCombo.class)) {
	// throw new IllegalArgumentException("The class "
	// + clazz.toString()
	// + " is not supported yet!");
	// }
	// AbstractSWTBot<? extends Widget> botEditorWidget;
	// final SWTBot bot = new SWTBot(item.widget);
	// final Matcher<? extends Widget> matcher = widgetOfType(clazz);
	// final Widget editorWidget = bot.widget(matcher);
	// botEditorWidget = null;
	// if (clazz.equals(Text.class)) {
	// botEditorWidget = new SWTBotText(
	// (Text) editorWidget, matcher);
	// } else if (clazz.equals(CCombo.class)) {
	// botEditorWidget = new SWTBotCCombo(
	// (CCombo) editorWidget, matcher);
	// }
	// return botEditorWidget;
	// }
	// });
	// }

	private SWTBotView getPropertiesView(SWTWorkbenchBot bot,
			SWTBotTreeItem rootNode) {
		// open properties tab
		rootNode.contextMenu("Show Properties View").click();
		// operate on the properties view of the model file
		bot.viewByTitle("Properties").setFocus();

		// we set a reference to the properties to add names and transitions
		SWTBotView propertiesView = bot.activeView();
		assertTrue("Properties".equals(propertiesView.getTitle()));

		return propertiesView;
	}

	private SWTBotTreeItem getRootNode(SWTBotEditor editor, String filename,
			String nodeName) {
		SWTBotTreeItem item = editor.bot().tree()
				.getTreeItem(
						"platform:/resource/" + TestDriver._cowolf_project_name + "/" + filename).select().expand().click()
				.getNode(nodeName);
		return item;
	}

	private void createTransitionWithProperties(SWTBotTreeItem item,
			SWTBotView view, String type, String name) {
		item.getNode(name).contextMenu("New Child").menu("Transition").click();
		view.bot().tree().getTreeItem(type).select().click();
		view.bot().text().setText("0.5");
		item.getNode(name).select();
	}

	private void createTransition(SWTBotTreeItem item, SWTBotView view,
			String name) {
		item.getNode(name).contextMenu("New Child").menu("Transition").click();
		item.getNode(name).select();
	}

	private void createNode(SWTBotTreeItem item, SWTBotView view, String type,
			String name) {
		item.select().contextMenu("New Child").menu(type).click();
		SWTBotTreeItem[] nodeItems = item.select().getItems();
		SWTBotTreeItem node = null;
		for (SWTBotTreeItem child : nodeItems) {
			if (child.getText().contains(type)) {
				node = child;
			}
		}
		assertNotNull(node);
		node.select();
		if (name != "") {
			view.bot().tree().getTreeItem("Name").select().click();
			view.bot().text().setText(name);
		}
	}
	private void projectInit(String model){
		testDriver.changeToCoWolfPerspective(bot);
		testDriver.createCoWolfProject(bot);
		testDriver.openProjectWizardwithContextMenu(bot);
		testDriver.createModel(bot, model);		
	}

	@AfterClass
	public static void sleep() {
		bot.sleep(2000);
	}

	@After
	public void runAfterEveryTest() throws CoreException {
		cleanWorkspace();
		bot.resetWorkbench();
	}
}