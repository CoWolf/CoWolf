package de.uni_stuttgart.iste.cowolf.core.ModelAssociationManager;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * This class holds an association between two models and the project where the
 * projects belong to
 *
 */
public class Association {

	private Resource target;
	private Resource source;
	private IProject iProject;

	public Association(Resource source, Resource target, IProject project) {
		this.setSource(source);
		this.setTarget(target);
		this.setIProject(project);
	}

	public Resource getSource() {
		return source;
	}

	public void setSource(Resource source) {
		this.source = source;
	}

	public Resource getTarget() {
		return target;
	}

	public void setTarget(Resource target) {
		this.target = target;
	}

	public IProject getIProject() {
		return iProject;
	}

	public void setIProject(IProject iProject) {
		this.iProject = iProject;
	}
}
