package de.uni_stuttgart.iste.cowolf.evolution.statechart.difference.technical;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.sidiff.difference.technical.TechnicalDifferenceBuilder;
import org.silift.common.util.access.EMFModelAccessEx;

/**
 * To filter not needed stuff. Nothing filtered here.
 * 
 * 
 * @TODO: Change ECorePackage to Statechart model Package and organize
 *        dependencies (required plug-ins).
 * 
 * @author: Michael Zimmermann
 */
public class TechnicalDifferenceBuilderStatechart extends
		TechnicalDifferenceBuilder {

	@Override
	protected Set<EClass> getUnconsideredNodeTypes() {
		Set<EClass> unconsideredNodeTypes = new HashSet<EClass>();

		return unconsideredNodeTypes;
	}

	@Override
	protected Set<EReference> getUnconsideredEdgeTypes() {
		Set<EReference> unconsideredEdgeTypes = new HashSet<EReference>();

		return unconsideredEdgeTypes;
	}

	@Override
	protected Set<EAttribute> getUnconsideredAttributeTypes() {
		Set<EAttribute> unconsideredAttributeTypes = new HashSet<EAttribute>();

		return unconsideredAttributeTypes;
	}

	@Override
	protected void checkDocumentType(Resource model) {
		// TODO Change EcorePackage into Statechart model package
		String docType = EMFModelAccessEx.getCharacteristicDocumentType(model);
		assert (docType == EcorePackage.eNS_URI) : "Wrong document type: Expected "
				+ EcorePackage.eNS_URI + " but got " + docType;
	}

	@Override
	protected String getObjectName(EObject obj) {
		return obj.toString();
	}

	@Override
	public String getDocumentType() {
		// TODO Change EcorePackage into Statechart model package
		return EcorePackage.eNS_URI;
	}

	@Override
	public String getName() {
		return "Statechart Technical Difference Builder";
	}

}
