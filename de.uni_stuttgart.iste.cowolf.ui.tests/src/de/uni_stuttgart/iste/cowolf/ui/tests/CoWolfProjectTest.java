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




import org.eclipse.swtbot.swt.finder.exceptions.WidgetNotFoundException;
import org.eclipse.swtbot.swt.finder.waits.Conditions;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotButton;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotShell;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTable;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTableItem;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swtbot.swt.finder.SWTBot;
import org.eclipse.swtbot.swt.finder.waits.ICondition;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotCombo;


@RunWith(SWTBotJunit4ClassRunner.class)
public class CoWolfProjectTest {
 
	private static SWTWorkbenchBot	bot;
  
	@BeforeClass
	public static void beforeClass() throws Exception {
		bot = new SWTWorkbenchBot();
		try {
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
		
		//opens the project wizard
		bot.menu("File").menu("New").menu("Other...").click();
		SWTBotShell shell = bot.shell("New");
	    shell.activate();
	    
//	    bot.tree().getTreeItem("CoWolf").expand();
//		
//		//Check if CoWolf Folder item is available
//		SWTBotTreeItem cFolder  = bot.tree().getTreeItem("CoWolf").getNode("CoWolf Folder").select();
//		assertEquals(cFolder.getText(), "CoWolf Folder");
//		
//		//Check if CoWolf Project item is available
//		SWTBotTreeItem cProject  = bot.tree().getTreeItem("CoWolf").getNode("CoWolf Project").select();
//		assertEquals(cProject.getText(), "CoWolf Project");
//		
//		//Check if CoWolf Folder item is available
//		SWTBotTreeItem cTrans = bot.tree().getTreeItem("CoWolf").getNode("CoWolf Transformation Mapping File").select();
//		assertEquals(cTrans.getText(), "CoWolf Transformation Mapping File");
//		
//		//open subdir
//		bot.tree().getTreeItem("CoWolf").getNode("Models").expand();
//		bot.tree().getTreeItem("CoWolf").getNode("Models").select();
//		
//		//Check if CoWolf Folder item is available
//		SWTBotTreeItem cAD = bot.tree().getTreeItem("CoWolf").getNode("Models").getNode("Activity Diagram").select();
//		assertEquals(cAD.getText(), "Activity Diagram");
//		
//		//Check if CoWolf Component_diagramemf model is available
//		SWTBotTreeItem cCDM = bot.tree().getTreeItem("CoWolf").getNode("Models").getNode("Component_diagramemf Model").select();
//		assertEquals(cCDM.getText(), "Component_diagramemf Model");
//		
//		//Check if CoWolf CTMC model is available
//		SWTBotTreeItem cCTMC = bot.tree().getTreeItem("CoWolf").getNode("Models").getNode("Ctmc Model").select();
//		assertEquals(cCTMC.getText(), "Ctmc Model");
//		
//		//Check if CoWolf DTMC model is available
//		SWTBotTreeItem cDTMC= bot.tree().getTreeItem("CoWolf").getNode("Models").getNode("DTMC Model").select();
//		assertEquals(cDTMC.getText(), "DTMC Model");
//		
//		//Check if CoWolf model FaultTree is available
//		SWTBotTreeItem cFTM = bot.tree().getTreeItem("CoWolf").getNode("Models").getNode("FaultTree Model").select();
//		assertEquals(cFTM.getText(), "FaultTree Model");
//		
//		//Check if CoWolf model statechartemf is available
//		SWTBotTreeItem cSCM = bot.tree().getTreeItem("CoWolf").getNode("Models").getNode("statechartemf Model").select();
//		assertEquals(cSCM.getText(), "statechartemf Model");
}
	
//	@Test
//	public void CreateProjectItemsTest() throws Exception {
//
//		//create a project that contains all Cowolf Items
//		//opens the project wizard
//		bot.menu("File").menu("New").menu("Other...").click();
//		SWTBotShell shell = bot.shell("New");
//	    shell.activate();
//	    
//		bot.tree().getTreeItem("CoWolf").expand();
//		
//		//create a new CoWolf Project
//		bot.tree().getTreeItem("CoWolf").getNode("CoWolf Project").select();
//		bot.button("Next >").click();
//		bot.textWithLabel("&Project name:").setText("CoWolf-Test-Project");
//		bot.button("Finish").click();
//		bot.button("Yes").click();
//				
//		//Create an Activity Diagram model
//		openProjectWizardwithContextMenu();
//		createModel("Activity Diagram");
//		
//		//Create an Component_diagramemf model
//		openProjectWizardwithContextMenu();
//		createModel("Component_diagramemf Model");
//		
//		//Create an Ctmc model
//		openProjectWizardwithContextMenu();
//		createModel("Ctmc Model");
//		
//		//Create an DTMC model
//		openProjectWizardwithContextMenu();
//		createModel("DTMC Model");
//		
//		//Create an Component_diagramemf model
//		openProjectWizardwithContextMenu();
//		createModel("FaultTree Model");
//
//		//Create an statechartemf model
//		openProjectWizardwithContextMenu();
//		createModel("statechartemf Model");
//		
//		//create a new Cowolf Folder
//		openProjectWizardwithContextMenu();
//		bot.tree().getTreeItem("CoWolf").getNode("CoWolf Folder").select();
//		bot.button("Next >").click();
//		bot.textWithLabel("Folder &name:").setText("CoWolfTestFolder");
//		bot.button("Finish").click();
//		
//		//Create CoWolf Transformation Mapping file within Cowolf folder
//		bot.sleep(20);
//		SWTBotTreeItem projectFolder = bot.tree().getTreeItem("CoWolf-Test-Project").select();
//		isExpanded(projectFolder);
//		projectFolder.getNode("CoWolfTestFolder").select();
//		projectFolder.contextMenu("New").menu("Other...").click();
//		bot.tree().getTreeItem("CoWolf").getNode("CoWolf Transformation Mapping File").select();
//		bot.button("Next >").click();
//		bot.textWithLabel("File na&me:").setText("testt.transmap");
//		bot.button("Finish").click();
//		
//	}
	
	private void createModel(String nModel){
		bot.tree().getTreeItem("CoWolf").getNode("Models").expand();
		bot.tree().getTreeItem("CoWolf").getNode("Models").getNode(nModel).select();
		bot.button("Next >").click();
		bot.button("Next >").click();
		bot.button("Finish").click();		
	}
	
	private void openProjectWizardwithContextMenu(){
		SWTBotTreeItem projectTree =  bot.tree().getTreeItem("CoWolf-Test-Project");
		isExpanded(projectTree);
		projectTree.getNode("models").select();
		projectTree.contextMenu("New").menu("Other...").click();
		SWTBotShell shell = bot.shell("New");
	    shell.activate();
	}
	
    private boolean isExpanded(SWTBotTreeItem item){
		if (item.isExpanded()){
			item.collapse();
		}
		item.expand();
		return item.getItems().length > 0;
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