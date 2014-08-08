package de.uni_stuttgart.iste.cowolf.core.ModelAssociationManager;

import org.eclipse.emf.ecore.resource.Resource;

public class Association {

	private Resource target;
	private Resource source;

	public Association(Resource source, Resource target) {
		this.setSource(source);
		this.setTarget(target);
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
}
