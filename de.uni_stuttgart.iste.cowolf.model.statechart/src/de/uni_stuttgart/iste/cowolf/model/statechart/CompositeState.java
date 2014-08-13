/**
 */
package de.uni_stuttgart.iste.cowolf.model.statechart;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.statechart.CompositeState#getSubVertexes <em>Sub Vertexes</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.statechart.CompositeState#isIsConcurrent <em>Is Concurrent</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_stuttgart.iste.cowolf.model.statechart.statechartemfPackage#getCompositeState()
 * @model
 * @generated
 */
public interface CompositeState extends State {
	/**
	 * Returns the value of the '<em><b>Sub Vertexes</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_stuttgart.iste.cowolf.model.statechart.StateVertex}.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.model.statechart.StateVertex#getSv_container <em>Sv container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Vertexes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Vertexes</em>' containment reference list.
	 * @see de.uni_stuttgart.iste.cowolf.model.statechart.statechartemfPackage#getCompositeState_SubVertexes()
	 * @see de.uni_stuttgart.iste.cowolf.model.statechart.StateVertex#getSv_container
	 * @model opposite="sv_container" containment="true" ordered="false"
	 * @generated
	 */
	EList<StateVertex> getSubVertexes();

	/**
	 * Returns the value of the '<em><b>Is Concurrent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Concurrent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Concurrent</em>' attribute.
	 * @see #setIsConcurrent(boolean)
	 * @see de.uni_stuttgart.iste.cowolf.model.statechart.statechartemfPackage#getCompositeState_IsConcurrent()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsConcurrent();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.statechart.CompositeState#isIsConcurrent <em>Is Concurrent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Concurrent</em>' attribute.
	 * @see #isIsConcurrent()
	 * @generated
	 */
	void setIsConcurrent(boolean value);

} // CompositeState
