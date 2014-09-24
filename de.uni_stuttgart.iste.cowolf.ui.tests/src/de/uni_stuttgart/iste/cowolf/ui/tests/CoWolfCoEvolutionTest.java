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
public class CoWolfCoEvolutionTest {

	private static SWTWorkbenchBot bot;
	private static TestDriver testDriver = null;

	
	String _sta0_file_name = "00.statemachine";
	String _sta1_file_name = "01.statemachine";
	String _dtmc_file_name = "My.dtmc";
	
	@BeforeClass
	public static void beforeClass() throws Exception {
		bot = new SWTWorkbenchBot();
		testDriver = new TestDriver();
		try {
			cleanWorkspace();
			bot.viewByTitle("Welcome").close();
		} catch (Exception ex) {
			// Welcome view not open
			// -> continuing
		}
	}
		
		
		
	@Test
	public void StatechartDtmcCoEvolutionTest() throws Exception {
		
		testDriver.setPrisimPath(bot);
	
		testDriver.changeToCoWolfPerspective(bot);

		testDriver.createCoWolfProject(bot);
		bot.sleep(3000);
		
		//create 00.statechart
		testDriver.openProjectWizardwithContextMenu(bot);
		testDriver.createModel(bot, TestDriver._cowolf_model_statemachine, _sta0_file_name);
		testDriver.setFocusCoWolfView(bot);
		//create My.dtmc
		testDriver.openProjectWizardwithContextMenu(bot);
		testDriver.createModel(bot, TestDriver._cowolf_model_statemachine);
		testDriver.setFocusCoWolfView(bot);
		
		//close 00.statechart
		SWTBotEditor editor = testDriver.getFileEditor(bot, _sta0_file_name);
		editor.saveAndClose();
		//close 00.dtmc
		editor = testDriver.getFileEditor(bot, _dtmc_file_name);
		editor.saveAndClose();
		

		//open 00.statechart as text 
		bot.viewByTitle(TestDriver._cowolf_view).setFocus();
		bot.tree().getTreeItem("CoWolf-Test-Project").getNode(_sta0_file_name)
				.select().contextMenu("Open With").menu("Text Editor").click();
		//copy the 00.statechart template
		editor = bot.editorByTitle(_sta0_file_name);
		SWTBotEclipseEditor e = editor.toTextEditor();
		e.setText(testDriver.getResourceFileContent(_sta0_file_name));
		editor.saveAndClose();	

		//open 00.statechart as text and replace it with  01.statechart content
		bot.viewByTitle(TestDriver._cowolf_view).setFocus();
		bot.tree().getTreeItem("CoWolf-Test-Project").getNode(_sta0_file_name)
				.select().contextMenu("Open With").menu("Text Editor").click();
		//replace 00.statechart with  01.statechart
		editor = bot.editorByTitle(_sta0_file_name);
		e = editor.toTextEditor();
		e.setText(testDriver.getResourceFileContent(_sta1_file_name));
		editor.saveAndClose();
		
		
		// CoEvolve
		bot.viewByTitle(TestDriver._cowolf_view).setFocus();
		bot.tree().getTreeItem(TestDriver._cowolf_project_name).getNode(_sta0_file_name)
				.select().contextMenu("CoWolf").menu("CoEvolve").click();
		bot.sleep(4000);
//		bot.button("Next >").click();
//		bot.button("Finish").click();
		
		
		
		bot.viewByTitle(TestDriver._cowolf_view).setFocus();
		bot.tree().getTreeItem("CoWolf-Test-Project").select().expand().click().getNode("My.dtmc.analysis.html").select();
		bot.sleep(2000);
		
	}
	}