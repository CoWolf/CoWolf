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
public class T003_CoWolfFaulttreeAnalyseTest {

	private static SWTWorkbenchBot bot;
	private static TestDriver testDriver = null;

	
	String _faulttree_file_name = "My.faulttree";
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
	public void FaulttreeAnalyseTest() throws Exception {
		
		testDriver.setXftaPath(bot);
	
		// change to cowolf perspective
		testDriver.changeToCoWolfPerspective(bot);

		testDriver.createCoWolfProject(bot);
		bot.sleep(3000);
		// Create a ctmc model
		testDriver.openProjectWizardwithContextMenu(bot);
		testDriver.createModel(bot, TestDriver._cowolf_model_faulttree);

		testDriver.setFocusCoWolfView(bot);
		
		
		SWTBotEditor dtmcEditor = testDriver.getFileEditor(bot, _faulttree_file_name);
		dtmcEditor.saveAndClose();
		
		// open My.dtmc as text file
		bot.viewByTitle(TestDriver._cowolf_view).setFocus();
		bot.tree().getTreeItem(TestDriver._cowolf_project_name).expand().select().click()
		.getNode("models").expand().select().click()
		.getNode(_faulttree_file_name)
		.select().contextMenu("Open With").menu("Text Editor").click();
		
		SWTBotEditor editor = bot.editorByTitle(_faulttree_file_name);
		SWTBotEclipseEditor e = editor.toTextEditor();
		e.setText(testDriver.getResourceFileContent(_faulttree_file_name));
		editor.saveAndClose();	

		// open My.dtmc as text file
		bot.viewByTitle(TestDriver._cowolf_view).setFocus();
		bot.tree().getTreeItem(TestDriver._cowolf_project_name).expand().select().click()
		.getNode("models").expand().select().click()
		.getNode(_faulttree_file_name).expand().select().click()
		.select().contextMenu("CoWolf").menu("Analyze").click();

		bot.button("Finish").click();

		bot.viewByTitle(TestDriver._cowolf_view).setFocus();
		bot.tree().getTreeItem("CoWolf-Test-Project").select().expand().click()
		.getNode("models").expand().select().click()
		.getNode("My.faulttree.analysis.html").select();
		bot.sleep(2000);
		
	}
	
	}

