package de.uni_stuttgart.iste.cowolf.transformation.generator.ui;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

public class TransformationRulesContentProvider implements ITreeContentProvider {

	public TransformationRulesContentProvider() {
	}

	@Override
	public void dispose() {

	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {

	}

	@Override
	public Object[] getElements(Object inputElement) {
		if (inputElement instanceof IFile[]) {
			return (IFile[]) inputElement;
		}
		return null;
	}

	@Override
	public Object[] getChildren(Object parentElement) {

		if (parentElement instanceof IFile) {

			IFile parentFile = (IFile) parentElement;

			//IWorkspaceRoot.
			
			File[] files = parentFile.getLocation().toFile()
					.listFiles(new FilenameFilter() {
						@Override
						public boolean accept(File dir, String name) {
							return name.toLowerCase().endsWith(".henshin");
						}
					});

			List<IFile> iFiles = new ArrayList<IFile>();

//			for (File file : files) {
//				iFiles.add(parentFile.getLocation().append(file.getName()).);
//			}

			return files;

		}

		return null;
	}

	@Override
	public Object getParent(Object element) {

		if (element instanceof File) {
			return ((File) element).getParentFile();
		}

		return null;

	}

	@Override
	public boolean hasChildren(Object element) {
		Object[] children = getChildren(element);

		return children != null && children.length > 0;

	}

}
