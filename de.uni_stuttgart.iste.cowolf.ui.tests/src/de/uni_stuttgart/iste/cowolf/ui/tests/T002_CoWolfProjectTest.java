package de.uni_stuttgart.iste.cowolf.ui.tests;

import static org.eclipse.xtext.junit4.ui.util.IResourcesSetupUtil.cleanWorkspace;
import static org.junit.Assert.*;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.eclipse.swtbot.swt.finder.utils.SWTBotPreferences;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTree;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTreeItem;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SWTBotJunit4ClassRunner.class)
public class T002_CoWolfProjectTest {
 
	private static SWTWorkbenchBot	bot;
	private static TestDriver testDriver = null;
	
	@BeforeClass
	public static void beforeClass() throws Exception {
		bot = new SWTWorkbenchBot();
		testDriver = new TestDriver();
		SWTBotPreferences.TIMEOUT = 10000;
		try {
			cleanWorkspace();
			bot.viewByTitle("Welcome").close();
		} catch (Exception ex) {
			// Welcome view not open
			// -> continuing
		}
	}

	//CoWolf Project items test
	//CoWolf consists of the following project items:
	// + CoWolf
	// 		- CoWolf Folder
	//		- CoWolf Project
	//		- CoWolf Transformation Mapping File
	//		+ Models
	//			- DTMC
	//			- CTMC
	//			- Statechart
	//			- Component_diagramemf model
	
	@Test
	public void AllProjectTypesAvailableTest() throws Exception {
		bot.menu("File").menu("New").menu("Other...").click();
		bot.tree().getTreeItem("CoWolf").expand();
		
		//Check if CoWolf Folder item is available
		SWTBotTreeItem cFolder  = bot.tree().getTreeItem("CoWolf").getNode("CoWolf Folder").select();
		assertEquals(cFolder.getText(), "CoWolf Folder");
		
		//Check if CoWolf Project item is available
		SWTBotTreeItem cProject  = bot.tree().getTreeItem("CoWolf").getNode("CoWolf Project").select();
		assertEquals(cProject.getText(), "CoWolf Project");
		
		//Check if CoWolf Folder item is available
		SWTBotTreeItem cTrans = bot.tree().getTreeItem("CoWolf").getNode("CoWolf Transformation Mapping File").select();
		assertEquals(cTrans.getText(), "CoWolf Transformation Mapping File");
		
		//open subdir
		bot.tree().getTreeItem("CoWolf").getNode("Models").expand();
		bot.tree().getTreeItem("CoWolf").getNode("Models").select();
		
		//Check if CoWolf Folder item is available
		SWTBotTreeItem cAD = bot.tree().getTreeItem("CoWolf").getNode("Models").getNode(TestDriver._cowolf_model_activity).select();
		assertEquals(cAD.getText(), TestDriver._cowolf_model_activity);
		
		//Check if CoWolf Component_diagramemf model is available
		SWTBotTreeItem cCDM = bot.tree().getTreeItem("CoWolf").getNode("Models").getNode(TestDriver._cowolf_model_component).select();
		assertEquals(cCDM.getText(), TestDriver._cowolf_model_component);
		
		//Check if CoWolf CTMC model is available
		SWTBotTreeItem cCTMC = bot.tree().getTreeItem("CoWolf").getNode("Models").getNode(TestDriver._cowolf_model_ctmc).select();
		assertEquals(cCTMC.getText(), TestDriver._cowolf_model_ctmc);
		
		//Check if CoWolf DTMC model is available
		SWTBotTreeItem cDTMC= bot.tree().getTreeItem("CoWolf").getNode("Models").getNode(TestDriver._cowolf_model_dtmc).select();
		assertEquals(cDTMC.getText(), TestDriver._cowolf_model_dtmc);
		
		//Check if CoWolf model FaultTree is available
		SWTBotTreeItem cFTM = bot.tree().getTreeItem("CoWolf").getNode("Models").getNode(TestDriver._cowolf_model_faulttree).select();
		assertEquals(cFTM.getText(), TestDriver._cowolf_model_faulttree);
		
		//Check if CoWolf model statechartemf is available
		SWTBotTreeItem cSCM = bot.tree().getTreeItem("CoWolf").getNode("Models").getNode(TestDriver._cowolf_model_statemachine).select();
		assertEquals(cSCM.getText(), TestDriver._cowolf_model_statemachine);
}
	
	@Test
	public void CreateProjectItemsTest() throws Exception {

		// change to cowolf perspective
		testDriver.changeToCoWolfPerspective(bot);

		testDriver.createCoWolfProject(bot);
		bot.sleep(3000);
		// Create a models
		testDriver.openProjectWizardwithContextMenu(bot);
		testDriver.createModel(bot, TestDriver._cowolf_model_activity);
		
		testDriver.openProjectWizardwithContextMenu(bot);
		testDriver.createModel(bot, TestDriver._cowolf_model_component);
		
		testDriver.openProjectWizardwithContextMenu(bot);
		testDriver.createModel(bot, TestDriver._cowolf_model_ctmc);
		
		testDriver.openProjectWizardwithContextMenu(bot);
		testDriver.createModel(bot, TestDriver._cowolf_model_dtmc);
		
		testDriver.openProjectWizardwithContextMenu(bot);
		testDriver.createModel(bot, TestDriver._cowolf_model_faulttree);
		
		testDriver.openProjectWizardwithContextMenu(bot);
		testDriver.createModel(bot, TestDriver._cowolf_model_statemachine);
				
	}

 
 
	@AfterClass
	public static void sleep() {
		bot.sleep(2000);

	}
	
	@After
	public void runAfterEveryTest() throws CoreException {
		bot.resetWorkbench();
	}
}
