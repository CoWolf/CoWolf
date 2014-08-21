package de.uni_stuttgart.iste.cowolf.evolution.fault_tree.difference.technical;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.sidiff.difference.technical.TechnicalDifferenceBuilder;
import org.silift.common.util.access.EMFModelAccessEx;

import de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTreePackage;

/**
 * To filter not needed stuff. Nothing filtered here.
 * 
 * 
 * @author: Michael Zimmermann
 */
public class TechnicalDifferenceBuilderFaultTree extends
		TechnicalDifferenceBuilder {

	@Override
	protected Set<EClass> getUnconsideredNodeTypes() {
		Set<EClass> unconsideredNodeTypes = new HashSet<EClass>();
		// No filtering
		return unconsideredNodeTypes;
	}

	@Override
	protected Set<EReference> getUnconsideredEdgeTypes() {
		Set<EReference> unconsideredEdgeTypes = new HashSet<EReference>();
		// No filtering
		return unconsideredEdgeTypes;
	}

	@Override
	protected Set<EAttribute> getUnconsideredAttributeTypes() {
		Set<EAttribute> unconsideredAttributeTypes = new HashSet<EAttribute>();
		// No filtering
		return unconsideredAttributeTypes;
	}

	@Override
	protected void checkDocumentType(Resource model) {
		String docType = EMFModelAccessEx.getCharacteristicDocumentType(model);
		assert (docType == FaultTreePackage.eNS_URI) : "Wrong document type: Expected "
				+ FaultTreePackage.eNS_URI + " but got " + docType;
	}

	@Override
	protected String getObjectName(EObject obj) {
		return obj.toString();
	}

	@Override
	public String getDocumentType() {
		return FaultTreePackage.eNS_URI;
	}

	@Override
	public String getName() {
		return "Statechart Technical Difference Builder";
	}

}
