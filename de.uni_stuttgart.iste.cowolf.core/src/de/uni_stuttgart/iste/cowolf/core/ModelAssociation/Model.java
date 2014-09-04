/**
 */
package de.uni_stuttgart.iste.cowolf.core.ModelAssociation;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.core.ModelAssociation.Model#getVersions <em>Versions</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.core.ModelAssociation.Model#getModel <em>Model</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.core.ModelAssociation.Model#getModelID <em>Model ID</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.core.ModelAssociation.Model#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelAssociationPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Versions</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelVersion}.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelVersion#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Versions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Versions</em>' containment reference list.
	 * @see de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelAssociationPackage#getModel_Versions()
	 * @see de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelVersion#getModel
	 * @model opposite="model" containment="true"
	 * @generated
	 */
	EList<ModelVersion> getVersions();

	/**
	 * Returns the value of the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' attribute.
	 * @see #setModel(String)
	 * @see de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelAssociationPackage#getModel_Model()
	 * @model required="true"
	 * @generated
	 */
	String getModel();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.core.ModelAssociation.Model#getModel <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' attribute.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(String value);

	/**
	 * Returns the value of the '<em><b>Model ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model ID</em>' attribute.
	 * @see #setModelID(String)
	 * @see de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelAssociationPackage#getModel_ModelID()
	 * @model id="true"
	 * @generated
	 */
	String getModelID();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.core.ModelAssociation.Model#getModelID <em>Model ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model ID</em>' attribute.
	 * @see #getModelID()
	 * @generated
	 */
	void setModelID(String value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelAssociation#getModels <em>Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(ModelAssociation)
	 * @see de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelAssociationPackage#getModel_Parent()
	 * @see de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelAssociation#getModels
	 * @model opposite="models" transient="false"
	 * @generated
	 */
	ModelAssociation getParent();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.core.ModelAssociation.Model#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(ModelAssociation value);

	public abstract List<Association> getAllAssociations();

	public abstract List<Association> getTargetAssociations();

	public abstract List<Association> getSourceAssociations();

	public abstract ModelVersion createVersion(Resource res);

	public abstract ModelVersion createVersion();

	public abstract boolean rename(String newPath);

	public abstract Resource getResource();

	abstract void prepareRemove();

	Association getLatestAssociationTo(Model target);

	boolean hasChanges();

	Association getLatestAssociationFrom(Model source);


} // Model
