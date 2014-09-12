package de.uni_stuttgart.iste.cowolf.evolution.ctmc.difference.technical;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.henshin.trace.impl.TracePackageImpl;
import org.sidiff.difference.technical.TechnicalDifferenceBuilder;
import org.silift.common.util.access.EMFModelAccessEx;

import de.uni_stuttgart.iste.cowolf.model.ctmc.CtmcPackage;

/**
 * To filter not needed stuff.
 * 
 * 
 * @author: Michael Zimmermann
 */
public class TechnicalDifferenceBuilderCTMC extends TechnicalDifferenceBuilder {

	@Override
	protected Set<EClass> getUnconsideredNodeTypes() {
		Set<EClass> unconsideredNodeTypes = new HashSet<EClass>();
		unconsideredNodeTypes.add(TracePackageImpl.eINSTANCE.getTrace());
		return unconsideredNodeTypes;
	}

	@Override
	protected Set<EReference> getUnconsideredEdgeTypes() {
		Set<EReference> unconsideredEdgeTypes = new HashSet<EReference>();
		unconsideredEdgeTypes.add(TracePackageImpl.eINSTANCE.getTrace_Source());
		unconsideredEdgeTypes.add(TracePackageImpl.eINSTANCE
				.getTrace_SubTraces());
		unconsideredEdgeTypes.add(TracePackageImpl.eINSTANCE.getTrace_Target());
		return unconsideredEdgeTypes;
	}

	@Override
	protected Set<EAttribute> getUnconsideredAttributeTypes() {
		Set<EAttribute> unconsideredAttributeTypes = new HashSet<EAttribute>();
		unconsideredAttributeTypes.add(TracePackageImpl.eINSTANCE
				.getTrace_Name());
		return unconsideredAttributeTypes;
	}

	@Override
	protected String getObjectName(EObject obj) {
		return obj.toString();
	}

	@Override
	public String getDocumentType() {
		return CtmcPackage.eNS_URI;
	}

	@Override
	public String getName() {
		return "CTMC Technical Difference Builder";
	}

}
