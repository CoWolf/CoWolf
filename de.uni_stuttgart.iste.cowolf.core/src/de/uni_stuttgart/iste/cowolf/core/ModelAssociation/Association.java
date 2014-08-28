/**
 */
package de.uni_stuttgart.iste.cowolf.core.ModelAssociation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.henshin.trace.Trace;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.core.ModelAssociation.Association#getSource <em>Source</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.core.ModelAssociation.Association#getTarget <em>Target</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.core.ModelAssociation.Association#getTraces <em>Traces</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.core.ModelAssociation.Association#getTimestamp <em>Timestamp</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelAssociationPackage#getAssociation()
 * @model
 * @generated
 */
public interface Association extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference list.
	 * The list contents are of type {@link de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelVersion}.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelVersion#getSourceAssociations <em>Source Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference list.
	 * @see de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelAssociationPackage#getAssociation_Source()
	 * @see de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelVersion#getSourceAssociations
	 * @model opposite="sourceAssociations" required="true"
	 * @generated
	 */
	EList<ModelVersion> getSource();

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference list.
	 * The list contents are of type {@link de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelVersion}.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelVersion#getTargetAssociations <em>Target Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference list.
	 * @see de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelAssociationPackage#getAssociation_Target()
	 * @see de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelVersion#getTargetAssociations
	 * @model opposite="targetAssociations" required="true"
	 * @generated
	 */
	EList<ModelVersion> getTarget();

	/**
	 * Returns the value of the '<em><b>Traces</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.henshin.trace.Trace}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Traces</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Traces</em>' reference list.
	 * @see de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelAssociationPackage#getAssociation_Traces()
	 * @model
	 * @generated
	 */
	EList<Trace> getTraces();

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timestamp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(long)
	 * @see de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelAssociationPackage#getAssociation_Timestamp()
	 * @model
	 * @generated
	 */
	long getTimestamp();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.core.ModelAssociation.Association#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(long value);

} // Association
