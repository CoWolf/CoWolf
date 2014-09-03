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
public class DTMCAnalyseTest {

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

	@Test
	public void AnalyseDTMC() throws Exception {
		
		// read dtmc template content
		String path = CoWolfEditorTest.class.getProtectionDomain()
				.getCodeSource().getLocation().getPath();
		String xml1 = new String(java.nio.file.Files.readAllBytes(getDefault()
				.getPath(path, "/Templates/My.dtmc")), "UTF8");
		String xml2 = new String(java.nio.file.Files.readAllBytes(getDefault()
				.getPath(path, "/Templates/My_edit.dtmc")), "UTF8");
		
		
		// change to cowolf perspective
		testHelper.changeToCoWolfPerspective(bot);

		testHelper.createCoWolfProject(bot);

		// Create a ctmc model
		testHelper.openProjectWizardwithContextMenu(bot);
		testHelper.createModel(bot, "DTMC Model");

		// Set the Cowolf view active to open the My.Dtmc file
		testHelper.setFocusCoWolfView(bot);
		
		SWTBotEditor dtmcEditor = testHelper.getFileEditor(bot, "My.dtmc");
		dtmcEditor.bot().tree()
		.getTreeItem("platform:/resource/CoWolf-Test-Project/My.dtmc")
		.select();
		// Save
		dtmcEditor.saveAndClose();
		
		
		// open My.dtmc as text file
		bot.viewByTitle("CoWolf View").setFocus();
		bot.tree().getTreeItem("CoWolf-Test-Project").getNode("My.dtmc")
				.select().contextMenu("Open With").menu("Text Editor").click();

		// Open My.dtmc as textfile
		bot.viewByTitle("CoWolf View").setFocus();
		bot.tree().getTreeItem("CoWolf-Test-Project").getNode("My.dtmc")
				.select().contextMenu("Open With").menu("Text Editor").click();

		// Open My.dtmc as textfile
		SWTBotEditor editor = bot.editorByTitle("My.dtmc");
		SWTBotEclipseEditor e = editor.toTextEditor();
		e.setText(xml1.toString());
		editor.saveAndClose();
		
		//create modified dtmc
		// Create a ctmc model
		testHelper.openProjectWizardwithContextMenu(bot);
		testHelper.createModel(bot, "DTMC Model");

		dtmcEditor = testHelper.getFileEditor(bot, "My1.dtmc");
		dtmcEditor.bot().tree()
		.getTreeItem("platform:/resource/CoWolf-Test-Project/My1.dtmc")
		.select();
		// Save
		dtmcEditor.saveAndClose();
		
		bot.sleep(2000);
		// open My.dtmc as text file
		bot.viewByTitle("CoWolf View").setFocus();
		bot.tree().getTreeItem("CoWolf-Test-Project").getNode("My1.dtmc")
				.select().contextMenu("Open With").menu("Text Editor").click();


		// Open My.dtmc as textfile
		editor = bot.editorByTitle("My1.dtmc");
		e = editor.toTextEditor();
		e.setText(xml2.toString());
		editor.saveAndClose();
		
		bot.sleep(2000);
		bot.viewByTitle("CoWolf View").setFocus();
		SWTBotTreeItem test = bot.tree().getTreeItem("CoWolf-Test-Project");
		test.select("My.dtmc").contextMenu("CoWolf").contextMenu("Evolve").click();
		bot.sleep(2000);
//		test.contextMenu("CoWolf").menu("Evolve");
		bot.sleep(2000);
		
		
		
		

//		// change to cowolf perspective
//		testHelper.changeToCoWolfPerspective(bot);
//
//		testHelper.createCoWolfProject(bot);
//
//		// Create a Activitiy Diagram model
//		testHelper.openProjectWizardwithContextMenu(bot);
//		testHelper.createModel(bot, "Component_diagramemf Model");
//
//		// Set the Cowolf view active to open the My.activity file
//		testHelper.setFocusCoWolfView(bot);
//
//		// operate on the dtmc file
//		SWTBotEditor editor = testHelper.getFileEditor(bot,
//				"My.component_diagram");
//
//		// We set a refrence to the node, to extend it
//		SWTBotTreeItem rootNode = getRootNode(editor, "My.component_diagram",
//				"Component Diagram");
//
//		SWTBotView propertiesView = getPropertiesView(bot, rootNode);
//
//		// populate DTMC model instance
//
//		createNode(rootNode, propertiesView, "Component", "Mail Entry");
//		createNode(rootNode, propertiesView, "Component", "Mail Exit");
//		createNode(rootNode, propertiesView, "Component", "Mail Management");
//
//		rootNode.getNode("Component Mail Entry").contextMenu("New Child")
//				.menu("Port").click();
//		propertiesView.bot().tree().getTreeItem("Name").select().click();
//		propertiesView.bot().text().setText("Receive Mail");
//		rootNode.getNode("Component Mail Entry").select();
//
//		editor.bot()
//				.tree()
//				.getTreeItem(
//						"platform:/resource/CoWolf-Test-Project/My.component_diagram")
//				.select();
//		// Save
//		editor.saveAndClose();
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