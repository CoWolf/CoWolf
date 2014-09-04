/**
 */
package de.uni_stuttgart.iste.cowolf.core.ModelAssociation;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

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
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.core.ModelAssociation.Model#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Models</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Models</em>' containment reference list.
	 * @see de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelAssociationPackage#getModelAssociation_Models()
	 * @see de.uni_stuttgart.iste.cowolf.core.ModelAssociation.Model#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Model> getModels();

	/**
	 * Returns the value of the '<em><b>Associations</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_stuttgart.iste.cowolf.core.ModelAssociation.Association}.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.core.ModelAssociation.Association#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associations</em>' containment reference list.
	 * @see de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelAssociationPackage#getModelAssociation_Associations()
	 * @see de.uni_stuttgart.iste.cowolf.core.ModelAssociation.Association#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Association> getAssociations();

	public abstract Model getModel(Resource res);

	public abstract Model registerModel(Resource res);
	
	public abstract Association registerAssociation();

	public abstract void setProject(IProject project);

	public abstract IProject getProject();

	Model getModelByPath(String file);

	void removeModel(Model model);

} // ModelAssociation
