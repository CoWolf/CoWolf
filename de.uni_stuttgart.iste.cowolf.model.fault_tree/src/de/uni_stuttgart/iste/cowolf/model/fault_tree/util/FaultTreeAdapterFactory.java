/**
 */
package de.uni_stuttgart.iste.cowolf.model.fault_tree.util;

import de.uni_stuttgart.iste.cowolf.model.commonBase.IDBase;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTreePackage
 * @generated
 */
public class FaultTreeAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FaultTreePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaultTreeAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = FaultTreePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FaultTreeSwitch<Adapter> modelSwitch =
		new FaultTreeSwitch<Adapter>() {
			@Override
			public Adapter caseHazard(Hazard object) {
				return createHazardAdapter();
			}
			@Override
			public Adapter caseGate(Gate object) {
				return createGateAdapter();
			}
			@Override
			public Adapter caseEvent(Event object) {
				return createEventAdapter();
			}
			@Override
			public Adapter caseIntermediateEvent(IntermediateEvent object) {
				return createIntermediateEventAdapter();
			}
			@Override
			public Adapter caseFailureType(FailureType object) {
				return createFailureTypeAdapter();
			}
			@Override
			public Adapter caseFailureInstance(FailureInstance object) {
				return createFailureInstanceAdapter();
			}
			@Override
			public Adapter caseBasicEvent(BasicEvent object) {
				return createBasicEventAdapter();
			}
			@Override
			public Adapter caseUndevelopedEvent(UndevelopedEvent object) {
				return createUndevelopedEventAdapter();
			}
			@Override
			public Adapter caseErrorType(ErrorType object) {
				return createErrorTypeAdapter();
			}
			@Override
			public Adapter caseErrorInstance(ErrorInstance object) {
				return createErrorInstanceAdapter();
			}
			@Override
			public Adapter caseOR(OR object) {
				return createORAdapter();
			}
			@Override
			public Adapter caseAND(AND object) {
				return createANDAdapter();
			}
			@Override
			public Adapter caseXOR(XOR object) {
				return createXORAdapter();
			}
			@Override
			public Adapter casePriorAND(PriorAND object) {
				return createPriorANDAdapter();
			}
			@Override
			public Adapter caseInhibit(Inhibit object) {
				return createInhibitAdapter();
			}
			@Override
			public Adapter caseFaultTree(FaultTree object) {
				return createFaultTreeAdapter();
			}
			@Override
			public Adapter caseIDBase(IDBase object) {
				return createIDBaseAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.Hazard <em>Hazard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.Hazard
	 * @generated
	 */
	public Adapter createHazardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.Gate <em>Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.Gate
	 * @generated
	 */
	public Adapter createGateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.IntermediateEvent <em>Intermediate Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.IntermediateEvent
	 * @generated
	 */
	public Adapter createIntermediateEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.FailureType <em>Failure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.FailureType
	 * @generated
	 */
	public Adapter createFailureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.FailureInstance <em>Failure Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.FailureInstance
	 * @generated
	 */
	public Adapter createFailureInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.BasicEvent <em>Basic Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.BasicEvent
	 * @generated
	 */
	public Adapter createBasicEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.UndevelopedEvent <em>Undeveloped Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.UndevelopedEvent
	 * @generated
	 */
	public Adapter createUndevelopedEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.ErrorType <em>Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.ErrorType
	 * @generated
	 */
	public Adapter createErrorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.ErrorInstance <em>Error Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.ErrorInstance
	 * @generated
	 */
	public Adapter createErrorInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.OR <em>OR</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.OR
	 * @generated
	 */
	public Adapter createORAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.AND <em>AND</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.AND
	 * @generated
	 */
	public Adapter createANDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.XOR <em>XOR</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.XOR
	 * @generated
	 */
	public Adapter createXORAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.PriorAND <em>Prior AND</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.PriorAND
	 * @generated
	 */
	public Adapter createPriorANDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.Inhibit <em>Inhibit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.Inhibit
	 * @generated
	 */
	public Adapter createInhibitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTree <em>Fault Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTree
	 * @generated
	 */
	public Adapter createFaultTreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_stuttgart.iste.cowolf.model.commonBase.IDBase <em>ID Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_stuttgart.iste.cowolf.model.commonBase.IDBase
	 * @generated
	 */
	public Adapter createIDBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //FaultTreeAdapterFactory
