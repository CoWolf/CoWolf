/**
 */
package de.uni_stuttgart.iste.cowolf.model.sequence_diagram.util;

import de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Sequence_diagramPackage;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Sequence_diagramXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequence_diagramXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		Sequence_diagramPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the Sequence_diagramResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new Sequence_diagramResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new Sequence_diagramResourceFactoryImpl());
		}
		return registrations;
	}

} //Sequence_diagramXMLProcessor
