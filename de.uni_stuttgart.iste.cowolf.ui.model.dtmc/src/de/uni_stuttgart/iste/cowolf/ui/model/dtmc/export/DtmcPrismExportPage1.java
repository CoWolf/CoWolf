package de.uni_stuttgart.iste.cowolf.ui.model.dtmc.export;


import java.util.LinkedList;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.ContainerCheckedTreeViewer;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Tree;

public class DtmcPrismExportPage1 extends WizardPage {

	private Composite container;

	protected DtmcPrismExportPage1(String pageName, IWorkbench workbench, IStructuredSelection selection) {
		super(pageName);
		this.setDescription("Description");
		this.setTitle("Export DTMC model as PRISM model");
	}

	@Override
	public void createControl(Composite parent) {
		this.container = new Composite(parent, SWT.NONE);
		this.setControl(this.container);
		this.container.setLayout(new GridLayout(1, false));
		ContainerCheckedTreeViewer tree = new ContainerCheckedTreeViewer(this.container);
		Tree tree_1 = tree.getTree();
		tree_1.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		tree.setContentProvider(new FileTreeContentProvider("dtmcemf"));
		tree.setLabelProvider(new FileTreeLabelProvider());
		tree.setInput("root"); // pass a non-null that will be ignored
	}
	
}
