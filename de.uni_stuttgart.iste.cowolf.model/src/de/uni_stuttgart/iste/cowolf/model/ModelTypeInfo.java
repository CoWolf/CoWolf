package de.uni_stuttgart.iste.cowolf.model;

import java.util.List;

public class ModelTypeInfo {

	/**
	 * Create a ModelTypeInfo object. This object contains the meta-model-name
	 * and the allowed EObject-Implementations.
	 * 
	 * @param metaModelName
	 *            a string. This will be the name of the automatically created
	 *            model folder
	 * @param propercontents
	 *            list of .class objects of every allowed EObject
	 *            implementation.
	 */
	public ModelTypeInfo(String metaModelName, List<Class<?>> properContents, String documentType) {
		this.METAMODEL_NAME = metaModelName;
		this.PROPER_CONTENTS = properContents;
		this.DOCUMENT_TYPE = documentType;
		
	}

	public final String METAMODEL_NAME;

	public final List<Class<?>> PROPER_CONTENTS;
	
	public final String DOCUMENT_TYPE;
}
