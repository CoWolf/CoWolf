/**
 */
package de.uni_stuttgart.iste.cowolf.model.statechart.impl;

import de.uni_stuttgart.iste.cowolf.model.statechart.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class statechartemfFactoryImpl extends EFactoryImpl implements statechartemfFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static statechartemfFactory init() {
		try {
			statechartemfFactory thestatechartemfFactory = (statechartemfFactory)EPackage.Registry.INSTANCE.getEFactory(statechartemfPackage.eNS_URI);
			if (thestatechartemfFactory != null) {
				return thestatechartemfFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new statechartemfFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public statechartemfFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case statechartemfPackage.BOOLEAN_EXPRESSION: return createBooleanExpression();
			case statechartemfPackage.STATE_MACHINE: return createStateMachine();
			case statechartemfPackage.STATE: return createState();
			case statechartemfPackage.COMPOSITE_STATE: return createCompositeState();
			case statechartemfPackage.TRANSITION: return createTransition();
			case statechartemfPackage.STATE_VERTEX: return createStateVertex();
			case statechartemfPackage.GUARD: return createGuard();
			case statechartemfPackage.EVENT: return createEvent();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanExpression createBooleanExpression() {
		BooleanExpressionImpl booleanExpression = new BooleanExpressionImpl();
		return booleanExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine createStateMachine() {
		StateMachineImpl stateMachine = new StateMachineImpl();
		return stateMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeState createCompositeState() {
		CompositeStateImpl compositeState = new CompositeStateImpl();
		return compositeState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateVertex createStateVertex() {
		StateVertexImpl stateVertex = new StateVertexImpl();
		return stateVertex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Guard createGuard() {
		GuardImpl guard = new GuardImpl();
		return guard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public statechartemfPackage getstatechartemfPackage() {
		return (statechartemfPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static statechartemfPackage getPackage() {
		return statechartemfPackage.eINSTANCE;
	}

} //statechartemfFactoryImpl
