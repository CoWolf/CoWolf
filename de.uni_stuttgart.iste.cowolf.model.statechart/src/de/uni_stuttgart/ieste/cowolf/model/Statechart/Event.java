/**
 */
package de.uni_stuttgart.ieste.cowolf.model.Statechart;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_stuttgart.ieste.cowolf.model.Statechart.Event#getEvt_container <em>Evt container</em>}</li>
 *   <li>{@link de.uni_stuttgart.ieste.cowolf.model.Statechart.Event#getTargets <em>Targets</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_stuttgart.ieste.cowolf.model.Statechart.statchartemfPackage#getEvent()
 * @model
 * @generated
 */
public interface Event extends EObject {
	/**
	 * Returns the value of the '<em><b>Evt container</b></em>' reference list.
	 * The list contents are of type {@link de.uni_stuttgart.ieste.cowolf.model.Statechart.Transition}.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.ieste.cowolf.model.Statechart.Transition#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evt container</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evt container</em>' reference list.
	 * @see de.uni_stuttgart.ieste.cowolf.model.Statechart.statchartemfPackage#getEvent_Evt_container()
	 * @see de.uni_stuttgart.ieste.cowolf.model.Statechart.Transition#getTrigger
	 * @model opposite="trigger" ordered="false"
	 * @generated
	 */
	EList<Transition> getEvt_container();

	/**
	 * Returns the value of the '<em><b>Targets</b></em>' reference list.
	 * The list contents are of type {@link de.uni_stuttgart.ieste.cowolf.model.Statechart.State}.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.ieste.cowolf.model.Statechart.State#getDeferrableEvents <em>Deferrable Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Targets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targets</em>' reference list.
	 * @see de.uni_stuttgart.ieste.cowolf.model.Statechart.statchartemfPackage#getEvent_Targets()
	 * @see de.uni_stuttgart.ieste.cowolf.model.Statechart.State#getDeferrableEvents
	 * @model opposite="deferrableEvents" ordered="false"
	 * @generated
	 */
	EList<State> getTargets();

} // Event
