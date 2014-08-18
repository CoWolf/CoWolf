/**
 */
package de.uni_stuttgart.iste.cowolf.model.component_diagram;

import de.uni_stuttgart.iste.cowolf.model.commonBase.IDBase;
import de.uni_stuttgart.iste.cowolf.model.commonBase.NameBase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.Dependency#getSupplier <em>Supplier</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.Dependency#getClient <em>Client</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.Component_diagramemfPackage#getDependency()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SupplierShoudBeDifferentFromClient'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot SupplierShoudBeDifferentFromClient='Tuple {\n\tmessage : String = \n\t\t\t\'The dependency supplier component should be not the same component like the client\',\n\tstatus : Boolean = \n\t\t\tself.supplier <> self.client\n}.status'"
 * @generated
 */
public interface Dependency extends IDBase, NameBase {
	/**
	 * Returns the value of the '<em><b>Supplier</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.Component#getOnDepend <em>On Depend</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supplier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supplier</em>' reference.
	 * @see #setSupplier(Component)
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.Component_diagramemfPackage#getDependency_Supplier()
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.Component#getOnDepend
	 * @model opposite="onDepend"
	 * @generated
	 */
	Component getSupplier();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.Dependency#getSupplier <em>Supplier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supplier</em>' reference.
	 * @see #getSupplier()
	 * @generated
	 */
	void setSupplier(Component value);

	/**
	 * Returns the value of the '<em><b>Client</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client</em>' reference.
	 * @see #setClient(Component)
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.Component_diagramemfPackage#getDependency_Client()
	 * @model
	 * @generated
	 */
	Component getClient();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.Dependency#getClient <em>Client</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client</em>' reference.
	 * @see #getClient()
	 * @generated
	 */
	void setClient(Component value);

} // Dependency
