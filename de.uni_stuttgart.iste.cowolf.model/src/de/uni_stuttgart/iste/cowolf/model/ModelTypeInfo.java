package de.uni_stuttgart.iste.cowolf.model;

import java.util.List;

public class ModelTypeInfo {

	/**
	 * Create a ModelTypeInfo object. This object contains the meta-model-name and the 
	 * allowed EObject-Implementations. 
	 * @param metaModelName as string.
	 * @param properContents list of .class objects of every allowed EObject implementation.
	 */
	public ModelTypeInfo(String metaModelName, List<Class> properContents) {
		this.METAMODEL_NAME = metaModelName;
		this.PROPER_CONTENTS = properContents;
	}
	
	public final String METAMODEL_NAME;
	
	public final List<Class> PROPER_CONTENTS;
}
