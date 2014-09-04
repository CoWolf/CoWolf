/**
 */
package de.uni_stuttgart.iste.cowolf.core.ModelAssociation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Version</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelVersion#getModel <em>Model</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelVersion#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelVersion#isCurrent <em>Current</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelVersion#isManual <em>Manual</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelVersion#getTargetAssociations <em>Target Associations</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelVersion#getSourceAssociations <em>Source Associations</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelAssociationPackage#getModelVersion()
 * @model
 * @generated
 */
public interface ModelVersion extends EObject {
	/**
	 * Returns the value of the '<em><b>Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.core.ModelAssociation.Model#getVersions <em>Versions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' container reference.
	 * @see #setModel(Model)
	 * @see de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelAssociationPackage#getModelVersion_Model()
	 * @see de.uni_stuttgart.iste.cowolf.core.ModelAssociation.Model#getVersions
	 * @model opposite="versions" transient="false"
	 * @generated
	 */
	Model getModel();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelVersion#getModel <em>Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' container reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(Model value);

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
	 * @see de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelAssociationPackage#getModelVersion_Timestamp()
	 * @model
	 * @generated
	 */
	long getTimestamp();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelVersion#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(long value);

	/**
	 * Returns the value of the '<em><b>Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current</em>' attribute.
	 * @see #setCurrent(boolean)
	 * @see de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelAssociationPackage#getModelVersion_Current()
	 * @model
	 * @generated
	 */
	boolean isCurrent();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelVersion#isCurrent <em>Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current</em>' attribute.
	 * @see #isCurrent()
	 * @generated
	 */
	void setCurrent(boolean value);

	/**
	 * Returns the value of the '<em><b>Manual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manual</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manual</em>' attribute.
	 * @see #setManual(boolean)
	 * @see de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelAssociationPackage#getModelVersion_Manual()
	 * @model
	 * @generated
	 */
	boolean isManual();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelVersion#isManual <em>Manual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manual</em>' attribute.
	 * @see #isManual()
	 * @generated
	 */
	void setManual(boolean value);

	/**
	 * Returns the value of the '<em><b>Target Associations</b></em>' reference list.
	 * The list contents are of type {@link de.uni_stuttgart.iste.cowolf.core.ModelAssociation.Association}.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.core.ModelAssociation.Association#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Associations</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Associations</em>' reference list.
	 * @see de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelAssociationPackage#getModelVersion_TargetAssociations()
	 * @see de.uni_stuttgart.iste.cowolf.core.ModelAssociation.Association#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Association> getTargetAssociations();

	/**
	 * Returns the value of the '<em><b>Source Associations</b></em>' reference list.
	 * The list contents are of type {@link de.uni_stuttgart.iste.cowolf.core.ModelAssociation.Association}.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.core.ModelAssociation.Association#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Associations</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Associations</em>' reference list.
	 * @see de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelAssociationPackage#getModelVersion_SourceAssociations()
	 * @see de.uni_stuttgart.iste.cowolf.core.ModelAssociation.Association#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<Association> getSourceAssociations();

	public abstract Resource getResource();

} // ModelVersion
