package de.uni_stuttgart.iste.cowolf.ui.tests;

import static org.junit.Assert.assertTrue;

import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotEditor;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotView;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotShell;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTreeItem;

public class TestHelper {
		
	public TestHelper(){
	}

	public SWTBotEditor getFileEditor(SWTWorkbenchBot bot, String filename ){
		//operate on the dtmc file
		//bot.tree().getTreeItem("CoWolf-Test-Project").getNode("My.dtmc").select().contextMenu("Open").click();
		SWTBotEditor file = bot.editorByTitle(filename);
		this.isExpanded(file.bot().tree().getTreeItem("platform:/resource/CoWolf-Test-Project/" + filename));
		return file;
	}
	
	public void createCoWolfProject(SWTWorkbenchBot bot){
		setFocusCoWolfView(bot);
		//create a project 
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
	}
	
	
	
	public void setFocusCoWolfView(SWTWorkbenchBot bot){
		bot.viewByTitle("CoWolf View").setFocus();
		SWTBotView coWolfView = bot.activeView();
		assertTrue("CoWolf View".equals(coWolfView.getTitle()));
	}
	
	
	public void changeToCoWolfPerspective(SWTWorkbenchBot bot){
		// Change the perspective via the Open Perspective dialog       
		bot.menu("Window").menu("Open Perspective").menu("Other...").click();
		SWTBotShell openPerspectiveShell = bot.shell("Open Perspective");
		openPerspectiveShell.activate();
	    bot.table().select("CoWolf perspective");
	    bot.button("OK").click();
	}
	public void createModel(SWTWorkbenchBot bot,String nModel){
		bot.tree().getTreeItem("CoWolf").getNode("Models").expand();
		bot.tree().getTreeItem("CoWolf").getNode("Models").getNode(nModel).select();
		bot.button("Next >").click();
		bot.button("Next >").click();
		bot.button("Finish").click();		
	}
	
	public void openProjectWizardwithContextMenu(SWTWorkbenchBot bot){
		SWTBotTreeItem projectTree =  bot.tree().getTreeItem("CoWolf-Test-Project");
		isExpanded(projectTree);
		projectTree.getNode("models").select();
		projectTree.contextMenu("New").menu("Other...").click();
		SWTBotShell shell = bot.shell("New");
	    shell.activate();
	}
	
	public boolean isExpanded(SWTBotTreeItem item){
		if (item.isExpanded()){
			item.collapse();
		}
		item.expand();
		return item.getItems().length > 0;
    }
}
