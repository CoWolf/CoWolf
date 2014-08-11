package de.uni_stuttgart.iste.cowolf.core.ModelAssociationManager;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.resource.Resource;

public class Association {

	private Resource target;
	private Resource source;
	private IProject project;

	public Association(Resource source, Resource target, IProject project) {
		this.setSource(source);
		this.setTarget(target);
		this.setProject(project);
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

	public IProject getProject() {
		return project;
	}

	public void setProject(IProject project) {
		this.project = project;
	}
}
