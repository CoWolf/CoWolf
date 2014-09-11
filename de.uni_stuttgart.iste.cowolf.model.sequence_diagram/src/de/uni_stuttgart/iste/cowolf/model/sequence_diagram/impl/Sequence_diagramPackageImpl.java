/**
 */
package de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl;

import de.uni_stuttgart.iste.cowolf.model.commonBase.CommonBasePackage;
import de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Actor;
import de.uni_stuttgart.iste.cowolf.model.sequence_diagram.ActorLifeline;
import de.uni_stuttgart.iste.cowolf.model.sequence_diagram.BehaviorExecutionSpecification;
import de.uni_stuttgart.iste.cowolf.model.sequence_diagram.ExecutionSpecifiaction;
import de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Interaction;
import de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Lifeline;
import de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Message;
import de.uni_stuttgart.iste.cowolf.model.sequence_diagram.MessageOccurenceSpecification;
import de.uni_stuttgart.iste.cowolf.model.sequence_diagram.OpaqueBehavior;
import de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Operation;
import de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Property;
import de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Sequence_diagramFactory;
import de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Sequence_diagramPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Sequence_diagramPackageImpl extends EPackageImpl implements Sequence_diagramPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageOccurenceSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behaviorExecutionSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opaqueBehaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lifelineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionSpecifiactionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actorLifelineEClass = null;

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
	 * @see de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Sequence_diagramPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Sequence_diagramPackageImpl() {
		super(eNS_URI, Sequence_diagramFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Sequence_diagramPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Sequence_diagramPackage init() {
		if (isInited) return (Sequence_diagramPackage)EPackage.Registry.INSTANCE.getEPackage(Sequence_diagramPackage.eNS_URI);

		// Obtain or create and register package
		Sequence_diagramPackageImpl theSequence_diagramPackage = (Sequence_diagramPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Sequence_diagramPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Sequence_diagramPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CommonBasePackage.eINSTANCE.eClass();
		UMLPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSequence_diagramPackage.createPackageContents();

		// Initialize created meta-data
		theSequence_diagramPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSequence_diagramPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Sequence_diagramPackage.eNS_URI, theSequence_diagramPackage);
		return theSequence_diagramPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessage() {
		return messageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageOccurenceSpecification() {
		return messageOccurenceSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBehaviorExecutionSpecification() {
		return behaviorExecutionSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpaqueBehavior() {
		return opaqueBehaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLifeline() {
		return lifelineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActor() {
		return actorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperation() {
		return operationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteraction() {
		return interactionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackage() {
		return packageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClass_() {
		return classEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutionSpecifiaction() {
		return executionSpecifiactionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActorLifeline() {
		return actorLifelineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequence_diagramFactory getSequence_diagramFactory() {
		return (Sequence_diagramFactory)getEFactoryInstance();
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
		packageEClass = createEClass(PACKAGE);

		classEClass = createEClass(CLASS);

		interactionEClass = createEClass(INTERACTION);

		actorEClass = createEClass(ACTOR);

		operationEClass = createEClass(OPERATION);

		messageEClass = createEClass(MESSAGE);

		messageOccurenceSpecificationEClass = createEClass(MESSAGE_OCCURENCE_SPECIFICATION);

		behaviorExecutionSpecificationEClass = createEClass(BEHAVIOR_EXECUTION_SPECIFICATION);

		opaqueBehaviorEClass = createEClass(OPAQUE_BEHAVIOR);

		actorLifelineEClass = createEClass(ACTOR_LIFELINE);

		lifelineEClass = createEClass(LIFELINE);

		propertyEClass = createEClass(PROPERTY);

		executionSpecifiactionEClass = createEClass(EXECUTION_SPECIFIACTION);
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
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);
		CommonBasePackage theCommonBasePackage = (CommonBasePackage)EPackage.Registry.INSTANCE.getEPackage(CommonBasePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		packageEClass.getESuperTypes().add(theUMLPackage.getPackage());
		packageEClass.getESuperTypes().add(theCommonBasePackage.getIDBase());
		classEClass.getESuperTypes().add(theUMLPackage.getClass_());
		classEClass.getESuperTypes().add(theCommonBasePackage.getIDBase());
		interactionEClass.getESuperTypes().add(theUMLPackage.getInteraction());
		interactionEClass.getESuperTypes().add(theCommonBasePackage.getIDBase());
		actorEClass.getESuperTypes().add(theUMLPackage.getActor());
		actorEClass.getESuperTypes().add(theCommonBasePackage.getIDBase());
		operationEClass.getESuperTypes().add(theUMLPackage.getOperation());
		operationEClass.getESuperTypes().add(theCommonBasePackage.getIDBase());
		messageEClass.getESuperTypes().add(theUMLPackage.getMessage());
		messageEClass.getESuperTypes().add(theCommonBasePackage.getIDBase());
		messageOccurenceSpecificationEClass.getESuperTypes().add(theUMLPackage.getMessageOccurrenceSpecification());
		messageOccurenceSpecificationEClass.getESuperTypes().add(theCommonBasePackage.getIDBase());
		behaviorExecutionSpecificationEClass.getESuperTypes().add(theUMLPackage.getBehaviorExecutionSpecification());
		behaviorExecutionSpecificationEClass.getESuperTypes().add(theCommonBasePackage.getIDBase());
		opaqueBehaviorEClass.getESuperTypes().add(theUMLPackage.getOpaqueBehavior());
		opaqueBehaviorEClass.getESuperTypes().add(theCommonBasePackage.getIDBase());
		actorLifelineEClass.getESuperTypes().add(theUMLPackage.getLifeline());
		actorLifelineEClass.getESuperTypes().add(theCommonBasePackage.getIDBase());
		lifelineEClass.getESuperTypes().add(theUMLPackage.getLifeline());
		lifelineEClass.getESuperTypes().add(theCommonBasePackage.getIDBase());
		propertyEClass.getESuperTypes().add(theUMLPackage.getProperty());
		propertyEClass.getESuperTypes().add(theCommonBasePackage.getIDBase());
		executionSpecifiactionEClass.getESuperTypes().add(theUMLPackage.getExecutionSpecification());
		executionSpecifiactionEClass.getESuperTypes().add(theCommonBasePackage.getIDBase());

		// Initialize classes, features, and operations; add parameters
		initEClass(packageEClass, de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Package.class, "Package", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(classEClass, de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Class.class, "Class", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(interactionEClass, Interaction.class, "Interaction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actorEClass, Actor.class, "Actor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(messageEClass, Message.class, "Message", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(messageOccurenceSpecificationEClass, MessageOccurenceSpecification.class, "MessageOccurenceSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(behaviorExecutionSpecificationEClass, BehaviorExecutionSpecification.class, "BehaviorExecutionSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(opaqueBehaviorEClass, OpaqueBehavior.class, "OpaqueBehavior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actorLifelineEClass, ActorLifeline.class, "ActorLifeline", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lifelineEClass, Lifeline.class, "Lifeline", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(executionSpecifiactionEClass, ExecutionSpecifiaction.class, "ExecutionSpecifiaction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// duplicates
		createDuplicatesAnnotations();
	}

	/**
	 * Initializes the annotations for <b>duplicates</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDuplicatesAnnotations() {
		String source = "duplicates";	
		addAnnotation
		  (messageEClass, 
		   source, 
		   new String[] {
		   });
	}

} //Sequence_diagramPackageImpl
