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
	private static TestHelper testHelper = null;

	@BeforeClass
	public static void beforeClass() throws Exception {
		bot = new SWTWorkbenchBot();
		testHelper = new TestHelper();
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

		// change to cowolf perspective
		testHelper.changeToCoWolfPerspective(bot);

		testHelper.createCoWolfProject(bot);

		// Create a dtmc model
		testHelper.openProjectWizardwithContextMenu(bot);
		testHelper.createModel(bot, "DTMC Model");

		// Set the Cowolf view active to open the My.Dtmc file
		testHelper.setFocusCoWolfView(bot);

		// operate on the dtmc file
		SWTBotEditor dtmcEditor = testHelper.getFileEditor(bot, "My.dtmc");

		// We set a refrence to the dtmc node, to extend it with States and
		// transitions
		SWTBotTreeItem dtmcRootNode = getRootNode(dtmcEditor, "My.dtmc", "DTMC");

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

		dtmcEditor.bot().tree()
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
		dtmcEditor.saveAndClose();
	}

	@Test
	public void CtmcEditorTest() throws Exception {

		// change to cowolf perspective
		testHelper.changeToCoWolfPerspective(bot);

		testHelper.createCoWolfProject(bot);

		// Create a ctmc model
		testHelper.openProjectWizardwithContextMenu(bot);
		testHelper.createModel(bot, "Ctmc Model");

		// Set the Cowolf view active to open the My.Dtmc file
		testHelper.setFocusCoWolfView(bot);

		// operate on the dtmc file
		SWTBotEditor dtmcEditor = testHelper.getFileEditor(bot, "My.ctmc");

		// We set a refrence to the dtmc node, to extend it with States and
		// transitions
		SWTBotTreeItem dtmcRootNode = getRootNode(dtmcEditor, "My.ctmc", "CTMC");

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

		dtmcEditor.bot().tree()
				.getTreeItem("platform:/resource/CoWolf-Test-Project/My.ctmc")
				.select();

		createTransitionWithProperties(dtmcRootNode, propertiesView, "Rate",
				"State 1");
		createTransitionWithProperties(dtmcRootNode, propertiesView, "Rate",
				"State 2");
		createTransitionWithProperties(dtmcRootNode, propertiesView, "Rate",
				"State 3");
		createTransitionWithProperties(dtmcRootNode, propertiesView, "Rate",
				"State 4");
		createTransitionWithProperties(dtmcRootNode, propertiesView, "Rate",
				"State 5");
		createTransitionWithProperties(dtmcRootNode, propertiesView, "Rate",
				"State 6");

		// Save
		dtmcEditor.saveAndClose();
	}

	@Test
	public void StateChartTest() throws Exception {

		// change to cowolf perspective
		testHelper.changeToCoWolfPerspective(bot);

		testHelper.createCoWolfProject(bot);

		// Create a dtmc model
		testHelper.openProjectWizardwithContextMenu(bot);
		testHelper.createModel(bot, "statechartemf Model");

		// Set the Cowolf view active to open the My.Dtmc file
		testHelper.setFocusCoWolfView(bot);

		// operate on the dtmc file
		SWTBotEditor editor = testHelper.getFileEditor(bot, "My.statechartemf");

		// We set a refrence to the dtmc node, to extend it with States and
		// transitions
		SWTBotTreeItem rootNode = getRootNode(editor, "My.statechartemf",
				"State Machine");

		SWTBotView propertiesView = getPropertiesView(bot, rootNode);

		// populate model instance

		// Create states
		createNode(rootNode, propertiesView, "State", "START");
		createNode(rootNode, propertiesView, "State", "STOP");

		editor.bot()
				.tree()
				.getTreeItem(
						"platform:/resource/CoWolf-Test-Project/My.statechartemf")
				.select();

		createTransition(rootNode, propertiesView, "State START");
		bot.sleep(20);
		createTransition(rootNode, propertiesView, "State STOP");

		// Save
		editor.saveAndClose();
	}

	@Test
	public void FaultTreeTest() throws Exception {

		// change to cowolf perspective
		testHelper.changeToCoWolfPerspective(bot);

		testHelper.createCoWolfProject(bot);

		// Create a dtmc model
		testHelper.openProjectWizardwithContextMenu(bot);
		testHelper.createModel(bot, "FaultTree Model");

		// Set the Cowolf view active to open the My.Dtmc file
		testHelper.setFocusCoWolfView(bot);

		// // operate on the dtmc file
		// SWTBotEditor editor = testHelper.getFileEditor(bot, "My.faulttree");
		//
		// // We set a refrence to the dtmc node, to extend it with States and
		// // transitions
		// SWTBotTreeItem rootNode = getRootNode(editor, "My.faulttree",
		// "Fault Tree");
		//
		// SWTBotView propertiesView = getPropertiesView(bot, rootNode);
		SWTBotEditor editor = testHelper.getFileEditor(bot, "My.faulttree");

		// We set a refrence to the dtmc node, to extend it with States and
		// transitions

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

		// change to cowolf perspective
		testHelper.changeToCoWolfPerspective(bot);

		testHelper.createCoWolfProject(bot);

		// Create a Activitiy Diagram model
		testHelper.openProjectWizardwithContextMenu(bot);
		testHelper.createModel(bot, "Activity Diagram");

		// Set the Cowolf view active to open the My.activity file
		testHelper.setFocusCoWolfView(bot);

		SWTBotEditor editor = testHelper.getFileEditor(bot,
				"My.activity_diagram");

		// We set a refrence to the dtmc node, to extend it with States and
		// transitions

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

		// populate DTMC model instance

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

		// change to cowolf perspective
		testHelper.changeToCoWolfPerspective(bot);

		testHelper.createCoWolfProject(bot);

		// Create a Activitiy Diagram model
		testHelper.openProjectWizardwithContextMenu(bot);
		testHelper.createModel(bot, "Component_diagramemf Model");

		// Set the Cowolf view active to open the My.activity file
		testHelper.setFocusCoWolfView(bot);

		// operate on the dtmc file
		SWTBotEditor editor = testHelper.getFileEditor(bot,
				"My.component_diagram");

		// We set a refrence to the node, to extend it
		SWTBotTreeItem rootNode = getRootNode(editor, "My.component_diagram",
				"Component Diagram");

		SWTBotView propertiesView = getPropertiesView(bot, rootNode);

		// populate DTMC model instance

		createNode(rootNode, propertiesView, "Component", "Mail Entry");
		createNode(rootNode, propertiesView, "Component", "Mail Exit");
		createNode(rootNode, propertiesView, "Component", "Mail Management");

		rootNode.getNode("Component Mail Entry").contextMenu("New Child")
				.menu("Port").click();
		propertiesView.bot().tree().getTreeItem("Name").select().click();
		propertiesView.bot().text().setText("Receive Mail");
		rootNode.getNode("Component Mail Entry").select();

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
		// operate on the properties view of the dtmc model file
		bot.viewByTitle("Properties").setFocus();

		// we set a reference to the properties to add names and transitions
		SWTBotView propertiesView = bot.activeView();
		assertTrue("Properties".equals(propertiesView.getTitle()));

		return propertiesView;
	}

	private SWTBotTreeItem getRootNode(SWTBotEditor editor, String filename,
			String nodeName) {
		SWTBotTreeItem item = editor
				.bot()
				.tree()
				.getTreeItem(
						"platform:/resource/CoWolf-Test-Project/" + filename)
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