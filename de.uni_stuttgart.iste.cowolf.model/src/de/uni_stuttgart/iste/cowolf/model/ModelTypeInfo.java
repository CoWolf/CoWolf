package de.uni_stuttgart.iste.cowolf.model;

import java.util.List;

public class ModelTypeInfo {

	public ModelTypeInfo(String metaModelName, List<Class> properContents) {
		this.METAMODEL_NAME = metaModelName;
		this.PROPER_CONTENTS = properContents;
	}
	
	public final String METAMODEL_NAME;
	
	public final List<Class> PROPER_CONTENTS;
}
