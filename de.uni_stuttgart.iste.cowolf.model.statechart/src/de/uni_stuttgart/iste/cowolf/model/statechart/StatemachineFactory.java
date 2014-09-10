/**
 */
package de.uni_stuttgart.iste.cowolf.model.statechart;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.uni_stuttgart.iste.cowolf.model.statechart.StatemachinePackage
 * @generated
 */
public interface StatemachineFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StatemachineFactory eINSTANCE = de.uni_stuttgart.iste.cowolf.model.statechart.impl.StatemachineFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>State Machine Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State Machine Root</em>'.
	 * @generated
	 */
	StateMachineRoot createStateMachineRoot();

	/**
	 * Returns a new object of class '<em>State Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State Machine</em>'.
	 * @generated
	 */
	StateMachine createStateMachine();

	/**
	 * Returns a new object of class '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State</em>'.
	 * @generated
	 */
	State createState();

	/**
	 * Returns a new object of class '<em>Composite State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite State</em>'.
	 * @generated
	 */
	CompositeState createCompositeState();

	/**
	 * Returns a new object of class '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action</em>'.
	 * @generated
	 */
	Action createAction();

	/**
	 * Returns a new object of class '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition</em>'.
	 * @generated
	 */
	Transition createTransition();

	/**
	 * Returns a new object of class '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event</em>'.
	 * @generated
	 */
	Event createEvent();

	/**
	 * Returns a new object of class '<em>Guard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Guard</em>'.
	 * @generated
	 */
	Guard createGuard();

	/**
	 * Returns a new object of class '<em>Transition Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition Action</em>'.
	 * @generated
	 */
	TransitionAction createTransitionAction();

	/**
	 * Returns a new object of class '<em>State Vertex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State Vertex</em>'.
	 * @generated
	 */
	StateVertex createStateVertex();

	/**
	 * Returns a new object of class '<em>DO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DO</em>'.
	 * @generated
	 */
	DO createDO();

	/**
	 * Returns a new object of class '<em>ENTRY</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ENTRY</em>'.
	 * @generated
	 */
	ENTRY createENTRY();

	/**
	 * Returns a new object of class '<em>EXIT</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EXIT</em>'.
	 * @generated
	 */
	EXIT createEXIT();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StatemachinePackage getStatemachinePackage();

} //StatemachineFactory
