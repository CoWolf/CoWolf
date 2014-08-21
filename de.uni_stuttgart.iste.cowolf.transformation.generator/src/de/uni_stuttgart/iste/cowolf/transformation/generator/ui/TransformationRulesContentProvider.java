package de.uni_stuttgart.iste.cowolf.transformation.generator.ui;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.henshin.model.Module;
import org.eclipse.emf.henshin.model.Unit;
import org.eclipse.emf.henshin.model.resource.HenshinResourceSet;
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
		if (inputElement instanceof IProject[]) {
			return (IProject[]) inputElement;
		}
		return new Object[0];
	}

	@Override
	public Object[] getChildren(Object parentElement) {

		if ((parentElement instanceof IProject)
				|| (parentElement instanceof IFolder)) {

			IContainer parentContainer = (IContainer) parentElement;

			List<IResource> children = new ArrayList<IResource>();

			try {

				for (IResource res : parentContainer.members()) {

					if (!(res instanceof IFile)
							|| "henshin".equals(res.getFileExtension())) {
						children.add(res);
					}

				}

				return children.toArray(new IResource[children.size()]);

			} catch (CoreException e) {
				e.printStackTrace();
			}

		} else if (parentElement instanceof IFile) {

			IFile file = (IFile) parentElement;

			HenshinResourceSet henshinResourceSet = new HenshinResourceSet();

			// TODO check for null or exception
			Module module = henshinResourceSet.getModule(file.getLocation()
					.toFile().toString(), false);

			// Module module = henshinResourceSet.getModule(file.getLocation()
			// .toFile().toString(), true);

			EList<Unit> units = module.getUnits();

			return units.toArray(new Unit[units.size()]);

		}

		return new Object[0];

	}

	@Override
	public Object getParent(Object element) {

		if ((element instanceof IFile) || (element instanceof IFolder)) {
			return ((IResource) element).getParent();
		}
		// TODO parent of unit
		return null;

	}

	@Override
	public boolean hasChildren(Object element) {

		Object[] children = this.getChildren(element);

		return (children != null) && (children.length > 0);

	}

}
