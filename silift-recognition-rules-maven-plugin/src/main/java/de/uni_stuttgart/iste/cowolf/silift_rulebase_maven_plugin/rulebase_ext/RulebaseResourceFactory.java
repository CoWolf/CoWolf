package de.uni_stuttgart.iste.cowolf.silift_rulebase_maven_plugin.rulebase_ext;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class RulebaseResourceFactory extends XMIResourceFactoryImpl {

	/**
	 * Default constructor.
	 */
	public RulebaseResourceFactory() {
		super();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl#createResource(
	 * org.eclipse.emf.common.util.URI)
	 */
	@Override
	public Resource createResource(URI uri) {
		return new RulebaseResource(uri);
	}

}
