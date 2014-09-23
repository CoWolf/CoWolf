package de.uni_stuttgart.iste.cowolf.ui.tests;

import static org.junit.Assert.assertTrue;
import static java.nio.file.FileSystems.getDefault;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotEditor;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotView;
import org.eclipse.swtbot.swt.finder.SWTBot;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotShell;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTreeItem;

public class TestDriver {
	
	static String _cowolf_prism_path = "/Build/prism-4.2.beta1-linux64";
	
	static String _cowolf_perspective_dialog_name = "CoWolf perspective";
	static String _cowolf_view = "Project Explorer";
	static String _cowolf_template_dir = "Templates";
	
	//Project
	static String _cowolf_project_name = "CoWolf-Test-Project";
	static String cowolf_wizard_menue_name = "CoWolf";
	

	//Dialog
	static String _cowolf_Dialog_Open_With_dtmc = "DTMC Model Editor";
	static String _cowolf_Dialog_Open_With_ctmc = "Ctmc Model Editor";
	static String _cowolf_Dialog_Open_With_statechart = "Statemachine Model Editor";
	static String _cowolf_Dialog_Open_With_component = "Component_diagram Model Editor";
	static String _cowolf_Dialog_Open_With_faulttree = "FaultTree Model Editor";
	static String _cowolf_Dialog_Open_With_activity = "Activity Diagram Model Editor";
	static String _cowolf_Dialog_Open_With_lqn = "LQN Model Editor";
	static String _cowolf_Dialog_Open_With_sequence = "Sequence Diagram Model Editor";
	
	
	//Models
	static String _cowolf_model_component = "Component_diagram Model";
	static String _cowolf_model_statemachine = "Statemachine Model";
	static String _cowolf_model_faulttree = "FaultTree Model";
	static String _cowolf_model_lqn = "LQN Model";
	static String _cowolf_model_activity = "Activity Diagram";
	static String _cowolf_model_ctmc = "Ctmc Model";
	static String _cowolf_model_dtmc = "DTMC Model";
	static String _cowolf_model_sequence = "Sequence Diagram";
		
	public TestDriver(){
	}

	public SWTBotEditor getFileEditor(SWTWorkbenchBot bot, String filename ){
		SWTBotEditor file = bot.editorByTitle(filename);
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
		bot.textWithLabel("&Project name:").setText(_cowolf_project_name);
		bot.button("Finish").click();
	}
	
	
	
	public void setFocusCoWolfView(SWTWorkbenchBot bot){
		bot.sleep(1000);
		bot.viewByTitle(_cowolf_view).setFocus();
		SWTBotView coWolfView = bot.activeView();
		assertTrue(_cowolf_view.equals(coWolfView.getTitle()));
	}
	
	
	public void changeToCoWolfPerspective(SWTWorkbenchBot bot){
		// Change the perspective via the Open Perspective dialog       
		bot.menu("Window").menu("Open Perspective").menu("Other...").click();
		SWTBotShell openPerspectiveShell = bot.shell("Open Perspective");
		openPerspectiveShell.activate();
	    bot.table().select(_cowolf_perspective_dialog_name);
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
		SWTBotTreeItem projectTree =  bot.tree().getTreeItem(_cowolf_project_name);
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
	
	public String getResourceFileContent(String fileName) {
		
		String path = CoWolfEditorTest.class.getProtectionDomain()
				.getCodeSource().getLocation().getPath();
		
		String xml = "";
		try {
			xml = new String(java.nio.file.Files.readAllBytes(getDefault()
					.getPath(path, File.separator + _cowolf_template_dir + File.separator + fileName)), "UTF8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return xml;
	}
		
	public String getResourceLocation(String filename){
		String filepath = "platform:"
				+ File.separator
				+ "resource"
				+ File.separator
				+ _cowolf_project_name
				+ File.separator
				+ filename;
		return filepath;
	}
	
	public void setPrisimPath(SWTBot bot){
		// Change the perspective via the Open Perspective dialog       
		bot.menu("Window").menu("Preferences").click();
		SWTBotShell prefsShell = bot.shell("Preferences");
		prefsShell.activate();
		
		
		String[] models = {"DTMC","CTMC"};
		for (String model : models) {
			SWTBotTreeItem treeItem = bot.tree().getTreeItem("CoWolf").select().expand().click()
					.getNode("Models").select().expand().click()
					.getNode(model).select().click();		
			bot.textWithLabel("&Path to Prism:").setText(_cowolf_prism_path);
			bot.button("Apply").click();
				
		}
		bot.button("OK").click();

		
		
	}
}
