/**
 */
package de.uni_stuttgart.iste.cowolf.model.fault_tree.impl;

import de.uni_stuttgart.iste.cowolf.model.fault_tree.*;

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
public class FaultTreeFactoryImpl extends EFactoryImpl implements FaultTreeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FaultTreeFactory init() {
		try {
			FaultTreeFactory theFaultTreeFactory = (FaultTreeFactory)EPackage.Registry.INSTANCE.getEFactory(FaultTreePackage.eNS_URI);
			if (theFaultTreeFactory != null) {
				return theFaultTreeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FaultTreeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaultTreeFactoryImpl() {
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
			case FaultTreePackage.HAZARD: return createHazard();
			case FaultTreePackage.INTERMEDIATE_EVENT: return createIntermediateEvent();
			case FaultTreePackage.FAILURE_TYPE: return createFailureType();
			case FaultTreePackage.FAILURE_INSTANCE: return createFailureInstance();
			case FaultTreePackage.BASIC_EVENT: return createBasicEvent();
			case FaultTreePackage.UNDEVELOPED_EVENT: return createUndevelopedEvent();
			case FaultTreePackage.ERROR_TYPE: return createErrorType();
			case FaultTreePackage.ERROR_INSTANCE: return createErrorInstance();
			case FaultTreePackage.OR: return createOR();
			case FaultTreePackage.AND: return createAND();
			case FaultTreePackage.XOR: return createXOR();
			case FaultTreePackage.PRIOR_AND: return createPriorAND();
			case FaultTreePackage.INHIBIT: return createInhibit();
			case FaultTreePackage.ROOT: return createRoot();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hazard createHazard() {
		HazardImpl hazard = new HazardImpl();
		return hazard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermediateEvent createIntermediateEvent() {
		IntermediateEventImpl intermediateEvent = new IntermediateEventImpl();
		return intermediateEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailureType createFailureType() {
		FailureTypeImpl failureType = new FailureTypeImpl();
		return failureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailureInstance createFailureInstance() {
		FailureInstanceImpl failureInstance = new FailureInstanceImpl();
		return failureInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicEvent createBasicEvent() {
		BasicEventImpl basicEvent = new BasicEventImpl();
		return basicEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UndevelopedEvent createUndevelopedEvent() {
		UndevelopedEventImpl undevelopedEvent = new UndevelopedEventImpl();
		return undevelopedEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorType createErrorType() {
		ErrorTypeImpl errorType = new ErrorTypeImpl();
		return errorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorInstance createErrorInstance() {
		ErrorInstanceImpl errorInstance = new ErrorInstanceImpl();
		return errorInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OR createOR() {
		ORImpl or = new ORImpl();
		return or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AND createAND() {
		ANDImpl and = new ANDImpl();
		return and;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XOR createXOR() {
		XORImpl xor = new XORImpl();
		return xor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PriorAND createPriorAND() {
		PriorANDImpl priorAND = new PriorANDImpl();
		return priorAND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inhibit createInhibit() {
		InhibitImpl inhibit = new InhibitImpl();
		return inhibit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Root createRoot() {
		RootImpl root = new RootImpl();
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaultTreePackage getFaultTreePackage() {
		return (FaultTreePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FaultTreePackage getPackage() {
		return FaultTreePackage.eINSTANCE;
	}

} //FaultTreeFactoryImpl
