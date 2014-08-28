package de.uni_stuttgart.iste.cowolf.ui.tests;

import static org.junit.Assert.*;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotEditor;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotView;
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
import org.eclipse.swtbot.swt.finder.SWTBot;
import org.eclipse.swtbot.swt.finder.waits.ICondition;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotCombo;
import org.eclipse.jface.dialogs.IDialogConstants;

import static org.eclipse.xtext.junit4.ui.util.IResourcesSetupUtil.cleanWorkspace;



@RunWith(SWTBotJunit4ClassRunner.class)
public class CoWolfEditorTest {
 
	private static SWTWorkbenchBot	bot;
	
  
	@BeforeClass
	public static void beforeClass() throws Exception {
		bot = new SWTWorkbenchBot();
		try {
			    cleanWorkspace();
				bot.viewByTitle("Welcome").close();
			} catch (Exception ex) {
			// Welcome view not open
			// -> continuing
			}
		
	}

	//Tests for CoWolf project model editors
	//CoWolf consists of the following model Editors:
	//			- Activity Diagram editor
	//          - DTMC editor
	//			- CTMC editor
	//			- Statechart editor
	//			- Component_diagramemf editor
	
	@Test
	public void StateDtmcEditorTest() throws Exception {
		
		// Change the perspective via the Open Perspective dialog       
		bot.menu("Window").menu("Open Perspective").menu("Other...").click();
		SWTBotShell openPerspectiveShell = bot.shell("Open Perspective");
		openPerspectiveShell.activate();
	    bot.table().select("CoWolf perspective");
	    bot.button("OK").click();

		
	    
		bot.viewByTitle("CoWolf View").setFocus();
		SWTBotView coWolfView = bot.activeView();
		assertTrue("CoWolf View".equals(coWolfView.getTitle()));
		
		
		//create a project that contains all Cowolf Items
		//opens the project wizard
		bot.menu("File").menu("New").menu("Other...").click();
		SWTBotShell shell = bot.shell("New");
	    shell.activate();
		bot.tree().getTreeItem("CoWolf").expand();
		//create a new CoWolf Project
		bot.tree().getTreeItem("CoWolf").getNode("CoWolf Project").select();
		bot.button("Next >").click();
		bot.textWithLabel("&Project name:").setText("CoWolf-Test-Project");
		bot.button("Finish").click();
		//Create an dtmc model
		openProjectWizardwithContextMenu();
		createModel("DTMC Model");
		

		
		
		//open the tree view from the dtmc model file
		bot.viewByTitle("CoWolf View").setFocus();
		coWolfView = bot.activeView();
		assertTrue("CoWolf View".equals(coWolfView.getTitle()));
		
		//operate on the dtmc file
		bot.tree().getTreeItem("CoWolf-Test-Project").getNode("My.dtmc").select().contextMenu("Open").click();
		SWTBotEditor dtmcFile = bot.editorByTitle("My.dtmc");
		
		// populate DTMC model instance
		// local state s : [1..3] init 0;
		// [] s=1 -> 0.5 : (s'=2) + 0.5 : (s'=3);
		dtmcFile.bot().tree().getTreeItem("platform:/resource/CoWolf-Test-Project/My.dtmc").select();
		dtmcFile.bot().tree().contextMenu("Show Properties View").click();
		isExpanded(dtmcFile.bot().tree().getTreeItem("platform:/resource/CoWolf-Test-Project/My.dtmc"));
		//dtmcFile.bot().tree().getTreeItem("platform:/resource/CoWolf-Test-Project/My.dtmc").getNode("DTMC").select()
		//.contextMenu("New Child").menu("State").click();
		SWTBotTreeItem dtmc = dtmcFile.bot().tree().getTreeItem("platform:/resource/CoWolf-Test-Project/My.dtmc").getNode("DTMC");
		dtmc.select().contextMenu("New Child").menu("State").click();
		dtmc.select().getNode("State").select();
		
		
		//operate on the properties view of the dtmc model file
		bot.viewByTitle("Properties").setFocus();
		SWTBotView dtmcProperties = bot.activeView();
		assertTrue("Properties".equals(dtmcProperties.getTitle()));
		bot.comboBox().setSelection("Name");
		bot.sleep(4000);

//		dtmcProperties.bot().text().setText("1");
//		bot.sleep(4000);
		
	
//		bot.tree().getTreeItem("platform:/resource/CoWolf-Test-Project/My.dtmc").getNode("DTMC").select();
//		bot.tree().getTreeItem("platform:/resource/CoWolf-Test-Project/My.dtmc").getNode("DTMC").select();
//		bot.tree().contextMenu("New Child").menu("State").click();
//		bot.text().setText("2");
//		bot.tree().getTreeItem("platform:/resource/CoWolf-Test-Project/My.dtmc").getNode("DTMC").getNode("State").select();
//		bot.tree().getTreeItem("platform:/resource/CoWolf-Test-Project/My.dtmc").getNode("DTMC").select();
//		bot.tree().contextMenu("New Child").menu("State").click();
//		bot.text().setText("3");
//		bot.tree().getTreeItem("platform:/resource/CoWolf-Test-Project/My.dtmc").getNode("DTMC").getNode("State").select();
//
//		bot.tree().getTreeItem("platform:/resource/CoWolf-Test-Project/My.dtmc").getNode("DTMC").getNode("State 1").select();
//		bot.tree().contextMenu("New Child").menu("Transition").click();
//		bot.tree().getTreeItem("platform:/resource/CoWolf-Test-Project/My.dtmc").getNode("DTMC").getNode("State 1").expand();
//		bot.text().setText("0.5");
//		bot.list().select("State 2");
		
//		bot.ccomboBox().select("State 2");
//		bot.tree().getTreeItem("platform:/resource/CoWolf-Test-Project/My.dtmc").getNode("DTMC").getNode("State 1").select();
//		bot.tree().getTreeItem("platform:/resource/CoWolf-Test-Project/My.dtmc").getNode("DTMC").getNode("State 1").select();
//		bot.contextMenu("New Child").menu("Transition").click();
//		bot.text().setText("0.5");
//		bot.list().select("State 3");
//		bot.ccomboBox().select("State 3");
//		bot.toolbarButtonWithTooltip("Save (Ctrl+S)").click();
		bot.sleep(4000);
	}
	
	
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
		cleanWorkspace();
		bot.resetWorkbench();
	}
}