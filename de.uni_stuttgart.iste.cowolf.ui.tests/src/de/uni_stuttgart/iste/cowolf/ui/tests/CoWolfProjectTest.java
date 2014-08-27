package de.uni_stuttgart.iste.cowolf.ui.tests;

import static org.junit.Assert.*;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTree;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTreeItem;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SWTBotJunit4ClassRunner.class)
public class CoWolfProjectTest {
 
	private static SWTWorkbenchBot	bot;
  
	@BeforeClass
	public static void beforeClass() throws Exception {
		bot = new SWTWorkbenchBot();
		bot.viewByTitle("Welcome").close();
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
		SWTBotTreeItem cAD = bot.tree().getTreeItem("CoWolf").getNode("Models").getNode("Activity Diagram").select();
		assertEquals(cAD.getText(), "Activity Diagram");
		
		//Check if CoWolf Component_diagramemf model is available
		SWTBotTreeItem cCDM = bot.tree().getTreeItem("CoWolf").getNode("Models").getNode("Component_diagramemf Model").select();
		assertEquals(cCDM.getText(), "Component_diagramemf Model");
		
		//Check if CoWolf CTMC model is available
		SWTBotTreeItem cCTMC = bot.tree().getTreeItem("CoWolf").getNode("Models").getNode("Ctmc Model").select();
		assertEquals(cCTMC.getText(), "Ctmc Model");
		
		//Check if CoWolf DTMC model is available
		SWTBotTreeItem cDTMC= bot.tree().getTreeItem("CoWolf").getNode("Models").getNode("DTMC Model").select();
		assertEquals(cDTMC.getText(), "DTMC Model");
		
		//Check if CoWolf model FaultTree is available
		SWTBotTreeItem cFTM = bot.tree().getTreeItem("CoWolf").getNode("Models").getNode("FaultTree Model").select();
		assertEquals(cFTM.getText(), "FaultTree Model");
		
		//Check if CoWolf model statechartemf is available
		SWTBotTreeItem cSCM = bot.tree().getTreeItem("CoWolf").getNode("Models").getNode("statechartemf Model").select();
		assertEquals(cSCM.getText(), "statechartemf Model");
}
	
	@Test
	public void CreateProjectItemsTest() throws Exception {

		bot.menu("File").menu("New").menu("Other...").click();
		bot.tree().getTreeItem("CoWolf").expand();
		bot.tree().getTreeItem("CoWolf").getNode("CoWolf Project").select();
		bot.button("Next >").click();
		bot.textWithLabel("&Project name:").setText("CoWolf-Test-Project");
		bot.button("Finish").click();
		bot.button("Yes").click();
		bot.tree().getTreeItem("CoWolf-Test-Project").expand();

		bot.tree().getTreeItem("CoWolf-Test-Project").getNode("models").select();
		bot.tree().contextMenu("New").menu("Other...").click();
		bot.tree().getTreeItem("CoWolf").getNode("Models").expand();
		bot.tree().getTreeItem("CoWolf").getNode("Models").getNode("Activity Diagram").select();
		bot.button("Next >").click();
		bot.button("Next >").click();
		bot.button("Finish").click();
		bot.tree().getTreeItem("CoWolf-Test-Project").getNode("models").select();
		bot.tree().contextMenu("New").menu("Other...").click();
		bot.tree().getTreeItem("CoWolf").getNode("Models").select();
		bot.tree().getTreeItem("CoWolf").getNode("Models").getNode("Component_diagramemf Model").select();
		bot.button("Next >").click();
		bot.button("Finish").click();
		bot.tree().getTreeItem("CoWolf-Test-Project").getNode("models").select();
		bot.tree().contextMenu("New").menu("Other...").click();
		bot.tree().getTreeItem("CoWolf").getNode("Models").getNode("Ctmc Model").select();
		bot.button("Next >").click();
		bot.button("Finish").click();
		bot.tree().getTreeItem("CoWolf-Test-Project").getNode("models").select();
		bot.tree().contextMenu("New").menu("Other...").click();
		bot.tree().getTreeItem("CoWolf").getNode("Models").getNode("DTMC Model").select();
		bot.button("Next >").click();
		bot.button("Next >").click();
		bot.button("Finish").click();
		bot.tree().getTreeItem("CoWolf-Test-Project").getNode("models").select();
		bot.tree().contextMenu("New").menu("Other...").click();
		bot.tree().getTreeItem("CoWolf").getNode("Models").getNode("FaultTree Model").select();
		bot.button("Next >").click();
		bot.button("Next >").click();
		bot.button("Finish").click();


		bot.tree().getTreeItem("CoWolf-Test-Project").select();
		bot.tree().getTreeItem("CoWolf-Test-Project").getNode("models").select();
		bot.tree().contextMenu("New").menu("Other...").click();
		bot.tree().getTreeItem("CoWolf").getNode("Models").getNode("statechartemf Model").select();
		bot.button("Next >").click();
		bot.button("Finish").click();

		bot.tree().getTreeItem("CoWolf-Test-Project").select();
		bot.tree().contextMenu("New").menu("Other...").click();
		bot.tree().getTreeItem("CoWolf").getNode("CoWolf Folder").select();
		bot.button("Next >").click();
		bot.textWithLabel("Folder &name:").setText("CoWolfTestFolder");
		bot.button("Finish").click();
		bot.tree().getTreeItem("CoWolf-Test-Project").select();
		bot.tree().getTreeItem("CoWolf-Test-Project").getNode("CoWolfTestFolder").select();
		bot.tree().contextMenu("New").menu("Other...").click();
		bot.tree().getTreeItem("CoWolf").getNode("CoWolf Transformation Mapping File").select();
		bot.button("Next >").click();
		bot.textWithLabel("File na&me:").setText("Transformation-Mapping-File.transmap");
		bot.button("Finish").click();

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