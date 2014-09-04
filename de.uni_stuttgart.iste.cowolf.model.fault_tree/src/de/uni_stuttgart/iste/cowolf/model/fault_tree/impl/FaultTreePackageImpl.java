/**
 */
package de.uni_stuttgart.iste.cowolf.model.fault_tree.impl;

import de.uni_stuttgart.iste.cowolf.model.commonBase.CommonBasePackage;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.BasicEvent;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.ErrorInstance;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.ErrorType;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.Event;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.FailureInstance;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.FailureType;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTree;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTreeFactory;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTreePackage;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.Gate;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.Hazard;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.Inhibit;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.IntermediateEvent;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.PriorAND;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.UndevelopedEvent;

import de.uni_stuttgart.iste.cowolf.model.fault_tree.util.FaultTreeValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FaultTreePackageImpl extends EPackageImpl implements FaultTreePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hazardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intermediateEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass failureTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass failureInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass undevelopedEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass priorANDEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inhibitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass faultTreeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTreePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FaultTreePackageImpl() {
		super(eNS_URI, FaultTreeFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link FaultTreePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FaultTreePackage init() {
		if (isInited) return (FaultTreePackage)EPackage.Registry.INSTANCE.getEPackage(FaultTreePackage.eNS_URI);

		// Obtain or create and register package
		FaultTreePackageImpl theFaultTreePackage = (FaultTreePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FaultTreePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FaultTreePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CommonBasePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theFaultTreePackage.createPackageContents();

		// Initialize created meta-data
		theFaultTreePackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theFaultTreePackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return FaultTreeValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theFaultTreePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FaultTreePackage.eNS_URI, theFaultTreePackage);
		return theFaultTreePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHazard() {
		return hazardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHazard_InEvent() {
		return (EReference)hazardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGate() {
		return gateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGate_InputGates() {
		return (EReference)gateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGate_InputEvents() {
		return (EReference)gateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGate_OutputGate() {
		return (EReference)gateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGate_OutputEvent() {
		return (EReference)gateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGate_Root() {
		return (EReference)gateEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvent_Description() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvent_InputGate() {
		return (EReference)eventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvent_OutputGate() {
		return (EReference)eventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvent_Root() {
		return (EReference)eventEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvent_Name() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntermediateEvent() {
		return intermediateEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntermediateEvent_Instance() {
		return (EReference)intermediateEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntermediateEvent_InEvent() {
		return (EReference)intermediateEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntermediateEvent_OutEvent() {
		return (EReference)intermediateEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFailureType() {
		return failureTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFailureType_Instance() {
		return (EReference)failureTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFailureType_Root() {
		return (EReference)failureTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFailureType_Name() {
		return (EAttribute)failureTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFailureInstance() {
		return failureInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFailureInstance_Type() {
		return (EReference)failureInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFailureInstance_Root() {
		return (EReference)failureInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFailureInstance_PreviousFailure() {
		return (EReference)failureInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFailureInstance_PreviousError() {
		return (EReference)failureInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFailureInstance_Event() {
		return (EReference)failureInstanceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFailureInstance_Name() {
		return (EAttribute)failureInstanceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBasicEvent() {
		return basicEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBasicEvent_Instance() {
		return (EReference)basicEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBasicEvent_Probability() {
		return (EAttribute)basicEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBasicEvent_OutEvent() {
		return (EReference)basicEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUndevelopedEvent() {
		return undevelopedEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getErrorType() {
		return errorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorType_Error() {
		return (EReference)errorTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorType_Root() {
		return (EReference)errorTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getErrorType_Name() {
		return (EAttribute)errorTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getErrorInstance() {
		return errorInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorInstance_Error() {
		return (EReference)errorInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorInstance_Type() {
		return (EReference)errorInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorInstance_Root() {
		return (EReference)errorInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getErrorInstance_Name() {
		return (EAttribute)errorInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOR() {
		return orEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAND() {
		return andEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXOR() {
		return xorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPriorAND() {
		return priorANDEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInhibit() {
		return inhibitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFaultTree() {
		return faultTreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFaultTree_Hazard() {
		return (EReference)faultTreeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFaultTree_Gate() {
		return (EReference)faultTreeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFaultTree_Event() {
		return (EReference)faultTreeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFaultTree_Failure_instance() {
		return (EReference)faultTreeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFaultTree_Failure_type() {
		return (EReference)faultTreeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFaultTree_Error_instance() {
		return (EReference)faultTreeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFaultTree_Error_type() {
		return (EReference)faultTreeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaultTreeFactory getFaultTreeFactory() {
		return (FaultTreeFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		hazardEClass = createEClass(HAZARD);
		createEReference(hazardEClass, HAZARD__IN_EVENT);

		gateEClass = createEClass(GATE);
		createEReference(gateEClass, GATE__INPUT_GATES);
		createEReference(gateEClass, GATE__INPUT_EVENTS);
		createEReference(gateEClass, GATE__OUTPUT_GATE);
		createEReference(gateEClass, GATE__OUTPUT_EVENT);
		createEReference(gateEClass, GATE__ROOT);

		eventEClass = createEClass(EVENT);
		createEAttribute(eventEClass, EVENT__DESCRIPTION);
		createEReference(eventEClass, EVENT__INPUT_GATE);
		createEReference(eventEClass, EVENT__OUTPUT_GATE);
		createEReference(eventEClass, EVENT__ROOT);
		createEAttribute(eventEClass, EVENT__NAME);

		intermediateEventEClass = createEClass(INTERMEDIATE_EVENT);
		createEReference(intermediateEventEClass, INTERMEDIATE_EVENT__INSTANCE);
		createEReference(intermediateEventEClass, INTERMEDIATE_EVENT__IN_EVENT);
		createEReference(intermediateEventEClass, INTERMEDIATE_EVENT__OUT_EVENT);

		failureTypeEClass = createEClass(FAILURE_TYPE);
		createEReference(failureTypeEClass, FAILURE_TYPE__INSTANCE);
		createEReference(failureTypeEClass, FAILURE_TYPE__ROOT);
		createEAttribute(failureTypeEClass, FAILURE_TYPE__NAME);

		failureInstanceEClass = createEClass(FAILURE_INSTANCE);
		createEReference(failureInstanceEClass, FAILURE_INSTANCE__TYPE);
		createEReference(failureInstanceEClass, FAILURE_INSTANCE__ROOT);
		createEReference(failureInstanceEClass, FAILURE_INSTANCE__PREVIOUS_FAILURE);
		createEReference(failureInstanceEClass, FAILURE_INSTANCE__PREVIOUS_ERROR);
		createEReference(failureInstanceEClass, FAILURE_INSTANCE__EVENT);
		createEAttribute(failureInstanceEClass, FAILURE_INSTANCE__NAME);

		basicEventEClass = createEClass(BASIC_EVENT);
		createEReference(basicEventEClass, BASIC_EVENT__INSTANCE);
		createEAttribute(basicEventEClass, BASIC_EVENT__PROBABILITY);
		createEReference(basicEventEClass, BASIC_EVENT__OUT_EVENT);

		undevelopedEventEClass = createEClass(UNDEVELOPED_EVENT);

		errorTypeEClass = createEClass(ERROR_TYPE);
		createEReference(errorTypeEClass, ERROR_TYPE__ERROR);
		createEReference(errorTypeEClass, ERROR_TYPE__ROOT);
		createEAttribute(errorTypeEClass, ERROR_TYPE__NAME);

		errorInstanceEClass = createEClass(ERROR_INSTANCE);
		createEReference(errorInstanceEClass, ERROR_INSTANCE__ERROR);
		createEReference(errorInstanceEClass, ERROR_INSTANCE__TYPE);
		createEReference(errorInstanceEClass, ERROR_INSTANCE__ROOT);
		createEAttribute(errorInstanceEClass, ERROR_INSTANCE__NAME);

		orEClass = createEClass(OR);

		andEClass = createEClass(AND);

		xorEClass = createEClass(XOR);

		priorANDEClass = createEClass(PRIOR_AND);

		inhibitEClass = createEClass(INHIBIT);

		faultTreeEClass = createEClass(FAULT_TREE);
		createEReference(faultTreeEClass, FAULT_TREE__HAZARD);
		createEReference(faultTreeEClass, FAULT_TREE__GATE);
		createEReference(faultTreeEClass, FAULT_TREE__EVENT);
		createEReference(faultTreeEClass, FAULT_TREE__FAILURE_INSTANCE);
		createEReference(faultTreeEClass, FAULT_TREE__FAILURE_TYPE);
		createEReference(faultTreeEClass, FAULT_TREE__ERROR_INSTANCE);
		createEReference(faultTreeEClass, FAULT_TREE__ERROR_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CommonBasePackage theCommonBasePackage = (CommonBasePackage)EPackage.Registry.INSTANCE.getEPackage(CommonBasePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		hazardEClass.getESuperTypes().add(this.getEvent());
		gateEClass.getESuperTypes().add(theCommonBasePackage.getIDBase());
		eventEClass.getESuperTypes().add(theCommonBasePackage.getIDBase());
		intermediateEventEClass.getESuperTypes().add(this.getEvent());
		failureTypeEClass.getESuperTypes().add(theCommonBasePackage.getIDBase());
		failureInstanceEClass.getESuperTypes().add(theCommonBasePackage.getIDBase());
		basicEventEClass.getESuperTypes().add(this.getEvent());
		undevelopedEventEClass.getESuperTypes().add(this.getEvent());
		errorTypeEClass.getESuperTypes().add(theCommonBasePackage.getIDBase());
		errorInstanceEClass.getESuperTypes().add(theCommonBasePackage.getIDBase());
		orEClass.getESuperTypes().add(this.getGate());
		andEClass.getESuperTypes().add(this.getGate());
		xorEClass.getESuperTypes().add(this.getGate());
		priorANDEClass.getESuperTypes().add(this.getGate());
		inhibitEClass.getESuperTypes().add(this.getGate());
		faultTreeEClass.getESuperTypes().add(theCommonBasePackage.getIDBase());

		// Initialize classes and features; add operations and parameters
		initEClass(hazardEClass, Hazard.class, "Hazard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHazard_InEvent(), this.getIntermediateEvent(), null, "inEvent", null, 0, 1, Hazard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gateEClass, Gate.class, "Gate", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGate_InputGates(), this.getGate(), null, "inputGates", null, 0, -1, Gate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGate_InputEvents(), this.getEvent(), this.getEvent_OutputGate(), "inputEvents", null, 0, -1, Gate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGate_OutputGate(), this.getGate(), null, "outputGate", null, 0, 1, Gate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGate_OutputEvent(), this.getEvent(), this.getEvent_InputGate(), "outputEvent", null, 0, 1, Gate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGate_Root(), this.getFaultTree(), this.getFaultTree_Gate(), "root", null, 0, 1, Gate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventEClass, Event.class, "Event", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvent_Description(), ecorePackage.getEString(), "description", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvent_InputGate(), this.getGate(), this.getGate_OutputEvent(), "inputGate", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvent_OutputGate(), this.getGate(), this.getGate_InputEvents(), "outputGate", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvent_Root(), this.getFaultTree(), this.getFaultTree_Event(), "root", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvent_Name(), ecorePackage.getEString(), "name", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intermediateEventEClass, IntermediateEvent.class, "IntermediateEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntermediateEvent_Instance(), this.getFailureInstance(), this.getFailureInstance_Event(), "instance", null, 0, -1, IntermediateEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntermediateEvent_InEvent(), this.getEvent(), null, "inEvent", null, 0, 1, IntermediateEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntermediateEvent_OutEvent(), this.getEvent(), null, "outEvent", null, 0, 1, IntermediateEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(failureTypeEClass, FailureType.class, "FailureType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFailureType_Instance(), this.getFailureInstance(), this.getFailureInstance_Type(), "instance", null, 1, -1, FailureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFailureType_Root(), this.getFaultTree(), this.getFaultTree_Failure_type(), "root", null, 0, 1, FailureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFailureType_Name(), ecorePackage.getEString(), "name", null, 0, 1, FailureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(failureInstanceEClass, FailureInstance.class, "FailureInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFailureInstance_Type(), this.getFailureType(), this.getFailureType_Instance(), "type", null, 1, 1, FailureInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFailureInstance_Root(), this.getFaultTree(), this.getFaultTree_Failure_instance(), "root", null, 0, 1, FailureInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFailureInstance_PreviousFailure(), this.getFailureInstance(), null, "previousFailure", null, 0, 1, FailureInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFailureInstance_PreviousError(), this.getErrorInstance(), null, "previousError", null, 0, 1, FailureInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFailureInstance_Event(), this.getIntermediateEvent(), this.getIntermediateEvent_Instance(), "event", null, 0, 1, FailureInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFailureInstance_Name(), ecorePackage.getEString(), "name", null, 0, 1, FailureInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(basicEventEClass, BasicEvent.class, "BasicEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBasicEvent_Instance(), this.getErrorInstance(), this.getErrorInstance_Error(), "instance", null, 0, -1, BasicEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasicEvent_Probability(), ecorePackage.getEDouble(), "probability", "1", 0, 1, BasicEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBasicEvent_OutEvent(), this.getIntermediateEvent(), null, "outEvent", null, 0, 1, BasicEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(undevelopedEventEClass, UndevelopedEvent.class, "UndevelopedEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(errorTypeEClass, ErrorType.class, "ErrorType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getErrorType_Error(), this.getErrorInstance(), this.getErrorInstance_Type(), "error", null, 1, -1, ErrorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getErrorType_Root(), this.getFaultTree(), this.getFaultTree_Error_type(), "root", null, 0, 1, ErrorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getErrorType_Name(), ecorePackage.getEString(), "name", null, 0, 1, ErrorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(errorInstanceEClass, ErrorInstance.class, "ErrorInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getErrorInstance_Error(), this.getBasicEvent(), this.getBasicEvent_Instance(), "error", null, 0, 1, ErrorInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getErrorInstance_Type(), this.getErrorType(), this.getErrorType_Error(), "type", null, 1, 1, ErrorInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getErrorInstance_Root(), this.getFaultTree(), this.getFaultTree_Error_instance(), "root", null, 0, 1, ErrorInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getErrorInstance_Name(), ecorePackage.getEString(), "name", null, 0, 1, ErrorInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orEClass, de.uni_stuttgart.iste.cowolf.model.fault_tree.OR.class, "OR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(andEClass, de.uni_stuttgart.iste.cowolf.model.fault_tree.AND.class, "AND", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xorEClass, de.uni_stuttgart.iste.cowolf.model.fault_tree.XOR.class, "XOR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(priorANDEClass, PriorAND.class, "PriorAND", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inhibitEClass, Inhibit.class, "Inhibit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(faultTreeEClass, FaultTree.class, "FaultTree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFaultTree_Hazard(), this.getHazard(), null, "hazard", null, 1, 1, FaultTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFaultTree_Gate(), this.getGate(), this.getGate_Root(), "gate", null, 0, -1, FaultTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFaultTree_Event(), this.getEvent(), this.getEvent_Root(), "event", null, 0, -1, FaultTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFaultTree_Failure_instance(), this.getFailureInstance(), this.getFailureInstance_Root(), "failure_instance", null, 0, -1, FaultTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFaultTree_Failure_type(), this.getFailureType(), this.getFailureType_Root(), "failure_type", null, 0, -1, FaultTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFaultTree_Error_instance(), this.getErrorInstance(), this.getErrorInstance_Root(), "error_instance", null, 0, -1, FaultTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFaultTree_Error_type(), this.getErrorType(), this.getErrorType_Root(), "error_type", null, 0, -1, FaultTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL
		createOCLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "commonBase", "../../de.uni_stuttgart.iste.cowolf.model/model/CommonBase.ecore#/",
			 "ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL"
		   });	
		addAnnotation
		  (hazardEClass, 
		   source, 
		   new String[] {
			 "constraints", "NoStandaloneUndevelopedEvent"
		   });	
		addAnnotation
		  (gateEClass, 
		   source, 
		   new String[] {
			 "constraints", "NoHazardAsInput NoBasicEventAsOutput AtLeastTwoInputs ExactlyOneOutput"
		   });	
		addAnnotation
		  (intermediateEventEClass, 
		   source, 
		   new String[] {
			 "constraints", "OnlyIntermediateOrBasicEventAsInput NoStandaloneIntermediateEvent OnlyIntermediateOrHazardtAsOutput"
		   });	
		addAnnotation
		  (basicEventEClass, 
		   source, 
		   new String[] {
			 "constraints", "NoStandaloneBasicEvent"
		   });	
		addAnnotation
		  (undevelopedEventEClass, 
		   source, 
		   new String[] {
			 "constraints", "NoStandaloneUndevelopedEvent"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOCLAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL";	
		addAnnotation
		  (hazardEClass, 
		   source, 
		   new String[] {
			 "NoStandaloneUndevelopedEvent", "self.inputGate->size() + self.outputGate->size() + self.inEvent->size() > 0"
		   });	
		addAnnotation
		  (gateEClass, 
		   source, 
		   new String[] {
			 "NoHazardAsInput", "self.inputEvents->forAll(e : Event | (e.oclIsTypeOf(BasicEvent) or e.oclIsTypeOf(IntermediateEvent)) and not e.oclIsTypeOf(Hazard))",
			 "NoBasicEventAsOutput", "self.outputEvent->forAll(e : Event | (e.oclIsTypeOf(IntermediateEvent) or e.oclIsTypeOf(Hazard)) and not e.oclIsTypeOf(BasicEvent))",
			 "AtLeastTwoInputs", "self.inputGates->size() + self.inputEvents->size() >= 2",
			 "ExactlyOneOutput", "self.outputGate->size() + self.outputEvent->size() = 1"
		   });	
		addAnnotation
		  (intermediateEventEClass, 
		   source, 
		   new String[] {
			 "OnlyIntermediateOrBasicEventAsInput", "self.inEvent->forAll(e : Event | (e.oclIsTypeOf(IntermediateEvent) or e.oclIsTypeOf(BasicEvent)))",
			 "NoStandaloneIntermediateEvent", "self.inputGate->size() + self.outputGate->size() + self.inEvent->size() + self.outEvent->size()> 0",
			 "OnlyIntermediateOrHazardtAsOutput", "self.outEvent->forAll(e : Event | (e.oclIsTypeOf(IntermediateEvent) or e.oclIsTypeOf(Hazard)))"
		   });	
		addAnnotation
		  (basicEventEClass, 
		   source, 
		   new String[] {
			 "NoStandaloneBasicEvent", "self.inputGate->size() + self.outputGate->size() + self.outEvent->size()> 0"
		   });	
		addAnnotation
		  (undevelopedEventEClass, 
		   source, 
		   new String[] {
			 "NoStandaloneUndevelopedEvent", "self.inputGate->size() + self.outputGate->size() > 0"
		   });
	}

} //FaultTreePackageImpl
