package de.uni_stuttgart.iste.cowolf.silift_rulebase_maven_plugin.rulebase_ext;

import java.util.HashMap;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLParserPoolImpl;

public class RulebaseResource extends XMIResourceImpl {

	/**
	 * File extension for Rulebase files.
	 */
	public static final String FILE_EXTENSION = "rulebase";

	/**
	 * Default constructor.
	 */
	public RulebaseResource() {
		super();
		getDefaultLoadOptions().put(XMLResource.OPTION_USE_PARSER_POOL,
				new XMLParserPoolImpl());
		getDefaultLoadOptions().put(
				XMLResource.OPTION_USE_XML_NAME_TO_FEATURE_MAP,
				new HashMap<Object, Object>());
		getDefaultSaveOptions().put(XMIResource.OPTION_SCHEMA_LOCATION,
				Boolean.TRUE);
		setIntrinsicIDToEObjectMap(new HashMap<String, EObject>());
	}

	/**
	 * Constructor.
	 * 
	 * @param uri
	 *            URI of a Rulebase resource.
	 */
	public RulebaseResource(URI uri) {
		super(uri);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl#useUUIDs()
	 */
	@Override
	protected boolean useUUIDs() {
		return true;
	}

}
