/**
 */
package de.uni_stuttgart.iste.cowolf.model.statechart;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.statechart.Event#getEvt_container <em>Evt container</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.statechart.Event#getTargets <em>Targets</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_stuttgart.iste.cowolf.model.statechart.statechartemfPackage#getEvent()
 * @model
 * @generated
 */
public interface Event extends de.uni_stuttgart.iste.cowolf.model.commonBase.IDBase, de.uni_stuttgart.iste.cowolf.model.commonBase.NameBase {
	/**
	 * Returns the value of the '<em><b>Evt container</b></em>' reference list.
	 * The list contents are of type {@link de.uni_stuttgart.iste.cowolf.model.statechart.Transition}.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.model.statechart.Transition#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evt container</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evt container</em>' reference list.
	 * @see de.uni_stuttgart.iste.cowolf.model.statechart.statechartemfPackage#getEvent_Evt_container()
	 * @see de.uni_stuttgart.iste.cowolf.model.statechart.Transition#getTrigger
	 * @model opposite="trigger" ordered="false"
	 * @generated
	 */
	EList<Transition> getEvt_container();

	/**
	 * Returns the value of the '<em><b>Targets</b></em>' reference list.
	 * The list contents are of type {@link de.uni_stuttgart.iste.cowolf.model.statechart.State}.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.model.statechart.State#getDeferrableEvents <em>Deferrable Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Targets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targets</em>' reference list.
	 * @see de.uni_stuttgart.iste.cowolf.model.statechart.statechartemfPackage#getEvent_Targets()
	 * @see de.uni_stuttgart.iste.cowolf.model.statechart.State#getDeferrableEvents
	 * @model opposite="deferrableEvents" ordered="false"
	 * @generated
	 */
	EList<State> getTargets();

} // Event
