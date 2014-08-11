/**
 */
package de.uni_stuttgart.iste.cowolf.model.statechart;

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
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.statechart.StateVertex#getSv_container <em>Sv container</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.statechart.StateVertex#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.statechart.StateVertex#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.statechart.StateVertex#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_stuttgart.iste.cowolf.model.statechart.statechartemfPackage#getStateVertex()
 * @model
 * @generated
 */
public interface StateVertex extends EObject {
	/**
	 * Returns the value of the '<em><b>Sv container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.model.statechart.CompositeState#getSubVertexes <em>Sub Vertexes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sv container</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sv container</em>' container reference.
	 * @see #setSv_container(CompositeState)
	 * @see de.uni_stuttgart.iste.cowolf.model.statechart.statechartemfPackage#getStateVertex_Sv_container()
	 * @see de.uni_stuttgart.iste.cowolf.model.statechart.CompositeState#getSubVertexes
	 * @model opposite="subVertexes" transient="false" ordered="false"
	 * @generated
	 */
	CompositeState getSv_container();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.statechart.StateVertex#getSv_container <em>Sv container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sv container</em>' container reference.
	 * @see #getSv_container()
	 * @generated
	 */
	void setSv_container(CompositeState value);

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link de.uni_stuttgart.iste.cowolf.model.statechart.Transition}.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.model.statechart.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see de.uni_stuttgart.iste.cowolf.model.statechart.statechartemfPackage#getStateVertex_Outgoing()
	 * @see de.uni_stuttgart.iste.cowolf.model.statechart.Transition#getSource
	 * @model opposite="source" ordered="false"
	 * @generated
	 */
	EList<Transition> getOutgoing();

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link de.uni_stuttgart.iste.cowolf.model.statechart.Transition}.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.model.statechart.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see de.uni_stuttgart.iste.cowolf.model.statechart.statechartemfPackage#getStateVertex_Incoming()
	 * @see de.uni_stuttgart.iste.cowolf.model.statechart.Transition#getTarget
	 * @model opposite="target" ordered="false"
	 * @generated
	 */
	EList<Transition> getIncoming();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.uni_stuttgart.iste.cowolf.model.statechart.statechartemfPackage#getStateVertex_Id()
	 * @model id="true" required="true"
	 *        annotation="ExtendedMetaData name='id' namespace='http://sdq.ipd.uka.de/Indentifier/1.0'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.statechart.StateVertex#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // StateVertex
