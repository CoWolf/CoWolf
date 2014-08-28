/**
 */
package de.uni_stuttgart.iste.cowolf.core.ModelAssociation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelAssociation#getModels <em>Models</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelAssociation#getAssociations <em>Associations</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelAssociationPackage#getModelAssociation()
 * @model
 * @generated
 */
public interface ModelAssociation extends EObject {
	/**
	 * Returns the value of the '<em><b>Models</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_stuttgart.iste.cowolf.core.ModelAssociation.Model}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Models</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Models</em>' containment reference list.
	 * @see de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelAssociationPackage#getModelAssociation_Models()
	 * @model containment="true"
	 * @generated
	 */
	EList<Model> getModels();

	/**
	 * Returns the value of the '<em><b>Associations</b></em>' reference list.
	 * The list contents are of type {@link de.uni_stuttgart.iste.cowolf.core.ModelAssociation.Association}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associations</em>' reference list.
	 * @see de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelAssociationPackage#getModelAssociation_Associations()
	 * @model
	 * @generated
	 */
	EList<Association> getAssociations();

} // ModelAssociation
