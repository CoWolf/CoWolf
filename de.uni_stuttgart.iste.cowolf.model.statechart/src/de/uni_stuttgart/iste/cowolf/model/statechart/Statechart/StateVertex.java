/**
 */
package de.uni_stuttgart.iste.cowolf.model.statechart.Statechart;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Vertex</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.statechart.Statechart.StateVertex#getSv_container <em>Sv container</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.statechart.Statechart.StateVertex#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.statechart.Statechart.StateVertex#getIncoming <em>Incoming</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_stuttgart.iste.cowolf.model.statechart.Statechart.StatechartemfPackage#getStateVertex()
 * @model
 * @generated
 */
public interface StateVertex extends EObject {
	/**
	 * Returns the value of the '<em><b>Sv container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.model.statechart.Statechart.CompositeState#getSubVertexes <em>Sub Vertexes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sv container</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sv container</em>' container reference.
	 * @see #setSv_container(CompositeState)
	 * @see de.uni_stuttgart.iste.cowolf.model.statechart.Statechart.StatechartemfPackage#getStateVertex_Sv_container()
	 * @see de.uni_stuttgart.iste.cowolf.model.statechart.Statechart.CompositeState#getSubVertexes
	 * @model opposite="subVertexes" transient="false" ordered="false"
	 * @generated
	 */
	CompositeState getSv_container();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.statechart.Statechart.StateVertex#getSv_container <em>Sv container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sv container</em>' container reference.
	 * @see #getSv_container()
	 * @generated
	 */
	void setSv_container(CompositeState value);

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link de.uni_stuttgart.iste.cowolf.model.statechart.Statechart.Transition}.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.model.statechart.Statechart.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see de.uni_stuttgart.iste.cowolf.model.statechart.Statechart.StatechartemfPackage#getStateVertex_Outgoing()
	 * @see de.uni_stuttgart.iste.cowolf.model.statechart.Statechart.Transition#getSource
	 * @model opposite="source" ordered="false"
	 * @generated
	 */
	EList<Transition> getOutgoing();

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link de.uni_stuttgart.iste.cowolf.model.statechart.Statechart.Transition}.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.model.statechart.Statechart.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see de.uni_stuttgart.iste.cowolf.model.statechart.Statechart.StatechartemfPackage#getStateVertex_Incoming()
	 * @see de.uni_stuttgart.iste.cowolf.model.statechart.Statechart.Transition#getTarget
	 * @model opposite="target" ordered="false"
	 * @generated
	 */
	EList<Transition> getIncoming();

} // StateVertex
