/**
 */
package de.uni_stuttgart.iste.cowolf.model.dtmc.impl;

import de.uni_stuttgart.iste.cowolf.model.commonBase.CommonBasePackage;

import de.uni_stuttgart.iste.cowolf.model.dtmc.DTMCFactory;
import de.uni_stuttgart.iste.cowolf.model.dtmc.DTMCPackage;
import de.uni_stuttgart.iste.cowolf.model.dtmc.Label;
import de.uni_stuttgart.iste.cowolf.model.dtmc.State;
import de.uni_stuttgart.iste.cowolf.model.dtmc.Transition;

import de.uni_stuttgart.iste.cowolf.model.dtmc.util.DTMCValidator;

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
public class DTMCPackageImpl extends EPackageImpl implements DTMCPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dtmcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelEClass = null;

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
	 * @see de.uni_stuttgart.iste.cowolf.model.dtmc.DTMCPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DTMCPackageImpl() {
		super(eNS_URI, DTMCFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DTMCPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DTMCPackage init() {
		if (isInited) return (DTMCPackage)EPackage.Registry.INSTANCE.getEPackage(DTMCPackage.eNS_URI);

		// Obtain or create and register package
		DTMCPackageImpl theDTMCPackage = (DTMCPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DTMCPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DTMCPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CommonBasePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDTMCPackage.createPackageContents();

		// Initialize created meta-data
		theDTMCPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theDTMCPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return DTMCValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theDTMCPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DTMCPackage.eNS_URI, theDTMCPackage);
		return theDTMCPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDTMC() {
		return dtmcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDTMC_Name() {
		return (EAttribute)dtmcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDTMC_States() {
		return (EReference)dtmcEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDTMC_InitialState() {
		return (EReference)dtmcEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getState() {
		return stateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getState_Name() {
		return (EAttribute)stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Incoming() {
		return (EReference)stateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Outgoing() {
		return (EReference)stateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Labels() {
		return (EReference)stateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_From() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_To() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransition_Prob() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabel() {
		return labelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabel_Name() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLabel_State() {
		return (EReference)labelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DTMCFactory getDTMCFactory() {
		return (DTMCFactory)getEFactoryInstance();
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
		dtmcEClass = createEClass(DTMC);
		createEAttribute(dtmcEClass, DTMC__NAME);
		createEReference(dtmcEClass, DTMC__STATES);
		createEReference(dtmcEClass, DTMC__INITIAL_STATE);

		stateEClass = createEClass(STATE);
		createEAttribute(stateEClass, STATE__NAME);
		createEReference(stateEClass, STATE__INCOMING);
		createEReference(stateEClass, STATE__OUTGOING);
		createEReference(stateEClass, STATE__LABELS);

		transitionEClass = createEClass(TRANSITION);
		createEReference(transitionEClass, TRANSITION__FROM);
		createEReference(transitionEClass, TRANSITION__TO);
		createEAttribute(transitionEClass, TRANSITION__PROB);

		labelEClass = createEClass(LABEL);
		createEAttribute(labelEClass, LABEL__NAME);
		createEReference(labelEClass, LABEL__STATE);
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
		dtmcEClass.getESuperTypes().add(theCommonBasePackage.getIDBase());
		stateEClass.getESuperTypes().add(theCommonBasePackage.getIDBase());
		transitionEClass.getESuperTypes().add(theCommonBasePackage.getIDBase());
		labelEClass.getESuperTypes().add(theCommonBasePackage.getIDBase());

		// Initialize classes, features, and operations; add parameters
		initEClass(dtmcEClass, de.uni_stuttgart.iste.cowolf.model.dtmc.DTMC.class, "DTMC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDTMC_Name(), ecorePackage.getEString(), "name", "", 0, 1, de.uni_stuttgart.iste.cowolf.model.dtmc.DTMC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDTMC_States(), this.getState(), null, "States", null, 0, -1, de.uni_stuttgart.iste.cowolf.model.dtmc.DTMC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDTMC_InitialState(), this.getState(), null, "initialState", null, 1, 1, de.uni_stuttgart.iste.cowolf.model.dtmc.DTMC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getState_Name(), ecorePackage.getEString(), "name", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_Incoming(), this.getTransition(), this.getTransition_To(), "incoming", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_Outgoing(), this.getTransition(), this.getTransition_From(), "outgoing", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_Labels(), this.getLabel(), this.getLabel_State(), "labels", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransition_From(), this.getState(), this.getState_Outgoing(), "from", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_To(), this.getState(), this.getState_Incoming(), "to", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_Prob(), ecorePackage.getEFloat(), "prob", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(labelEClass, Label.class, "Label", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLabel_Name(), ecorePackage.getEString(), "name", null, 1, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLabel_State(), this.getState(), this.getState_Labels(), "state", null, 1, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (stateEClass, 
		   source, 
		   new String[] {
			 "constraints", "OutgoingDontAddUpToOne NonDeterministic NoDuplicateLabels"
		   });	
		addAnnotation
		  (transitionEClass, 
		   source, 
		   new String[] {
			 "constraints", "ProbBetween0and1"
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
		  (stateEClass, 
		   source, 
		   new String[] {
			 "OutgoingDontAddUpToOne", "Tuple {\n\tmessage : String = \'Probability of all outgoing transitions must be 1.0.\',\n\tstatus : Boolean = \n\t\t\tself.outgoing->size() = 0 or (self.outgoing.prob->sum() - 1.0).abs()  < 0.000001\n}.status",
			 "NonDeterministic", "Tuple {\n\tmessage : String = \'There must not be any nondeterminism. Please union transitions to the same target.\',\n\tstatus : Boolean = \n\t\t\tself.outgoing.to->asSet()->size() = self.outgoing->size()\n}.status",
			 "NoDuplicateLabels", "Tuple {\n\tmessage : String = \'Labels must be unique per state.\',\n\tstatus : Boolean = \n\t\t\tself.labels.name->asSet()->size() = self.labels->size()\n}.status"
		   });	
		addAnnotation
		  (transitionEClass, 
		   source, 
		   new String[] {
			 "ProbBetween0and1", "Tuple {\n\tmessage : String = \'Probability must be between 0 and 1.\',\n\tstatus : Boolean = \n\t \t\tprob >= 0.0 and prob <= 1.0\n}.status"
		   });
	}

} //DTMCPackageImpl
