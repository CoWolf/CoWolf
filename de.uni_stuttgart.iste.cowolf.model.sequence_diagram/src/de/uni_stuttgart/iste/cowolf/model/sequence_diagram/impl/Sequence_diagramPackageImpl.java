/**
 */
package de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl;

import de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Actor;
import de.uni_stuttgart.iste.cowolf.model.sequence_diagram.ExecutionSpecification;
import de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Gate;
import de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Interaction;
import de.uni_stuttgart.iste.cowolf.model.sequence_diagram.InteractionFragment;
import de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Lifeline;
import de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Message;
import de.uni_stuttgart.iste.cowolf.model.sequence_diagram.MessageEnd;
import de.uni_stuttgart.iste.cowolf.model.sequence_diagram.MessageKind;
import de.uni_stuttgart.iste.cowolf.model.sequence_diagram.MessageSort;
import de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Sequence_diagramFactory;
import de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Sequence_diagramPackage;
import de.uni_stuttgart.iste.cowolf.model.sequence_diagram.ValueSpecification;
import de.uni_stuttgart.iste.cowolf.model.sequence_diagram.util.Sequence_diagramValidator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.uml2.types.TypesPackage;
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
	private EClass interactionEClass = null;
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
	private EClass gateEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionFragmentEClass = null;
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
	private EClass valueSpecificationEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageEndEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionSpecificationEClass = null;
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
	private EEnum messageKindEEnum = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum messageSortEEnum = null;
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
		UMLPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSequence_diagramPackage.createPackageContents();

		// Initialize created meta-data
		theSequence_diagramPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theSequence_diagramPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return Sequence_diagramValidator.INSTANCE;
				 }
			 });

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
	public EClass getInteraction() {
		return interactionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteraction_Lifeline() {
		return (EReference)interactionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteraction_Fragment() {
		return (EReference)interactionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteraction_Action() {
		return (EReference)interactionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteraction_FormalGate() {
		return (EReference)interactionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteraction_Message() {
		return (EReference)interactionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInteraction__Not_contained__DiagnosticChain_Map() {
		return interactionEClass.getEOperations().get(0);
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
	public EReference getMessage_Argument() {
		return (EReference)messageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessage_Connector() {
		return (EReference)messageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessage_Interaction() {
		return (EReference)messageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_MessageKind() {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_MessageSort() {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessage_ReceiveEvent() {
		return (EReference)messageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessage_SendEvent() {
		return (EReference)messageEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessage_Signature() {
		return (EReference)messageEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMessage__Sending_receiving_message_event__DiagnosticChain_Map() {
		return messageEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMessage__Arguments__DiagnosticChain_Map() {
		return messageEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMessage__Cannot_cross_boundaries__DiagnosticChain_Map() {
		return messageEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMessage__Signature_is_signal__DiagnosticChain_Map() {
		return messageEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMessage__Occurrence_specifications__DiagnosticChain_Map() {
		return messageEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMessage__Signature_refer_to__DiagnosticChain_Map() {
		return messageEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMessage__Signature_is_operation_request__DiagnosticChain_Map() {
		return messageEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMessage__Signature_is_operation_reply__DiagnosticChain_Map() {
		return messageEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMessage__GetMessageKind() {
		return messageEClass.getEOperations().get(8);
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
	public EOperation getGate__Actual_gate_matched__DiagnosticChain_Map() {
		return gateEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGate__Inside_cf_matched__DiagnosticChain_Map() {
		return gateEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGate__Outside_cf_matched__DiagnosticChain_Map() {
		return gateEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGate__Formal_gate_distinguishable__DiagnosticChain_Map() {
		return gateEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGate__Actual_gate_distinguishable__DiagnosticChain_Map() {
		return gateEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGate__Outside_cf_gate_distinguishable__DiagnosticChain_Map() {
		return gateEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGate__Inside_cf_gate_distinguishable__DiagnosticChain_Map() {
		return gateEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGate__IsOutsideCF() {
		return gateEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGate__IsInsideCF() {
		return gateEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGate__IsActual() {
		return gateEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGate__IsFormal() {
		return gateEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGate__GetName() {
		return gateEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGate__Matches__Gate() {
		return gateEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGate__GetOperand() {
		return gateEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteractionFragment() {
		return interactionFragmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionFragment_Covered() {
		return (EReference)interactionFragmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionFragment_EnclosingOperand() {
		return (EReference)interactionFragmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionFragment_EnclosingInteraction() {
		return (EReference)interactionFragmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionFragment_GeneralOrdering() {
		return (EReference)interactionFragmentEClass.getEStructuralFeatures().get(3);
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
	public EReference getLifeline_DecomposedAs() {
		return (EReference)lifelineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLifeline_Interaction() {
		return (EReference)lifelineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLifeline_Represents() {
		return (EReference)lifelineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLifeline_Selector() {
		return (EReference)lifelineEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLifeline_CoveredBy() {
		return (EReference)lifelineEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLifeline__Selector_specified__DiagnosticChain_Map() {
		return lifelineEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLifeline__Interaction_uses_share_lifeline__DiagnosticChain_Map() {
		return lifelineEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLifeline__Same_classifier__DiagnosticChain_Map() {
		return lifelineEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLifeline__Selector_int_or_string__DiagnosticChain_Map() {
		return lifelineEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueSpecification() {
		return valueSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getValueSpecification__BooleanValue() {
		return valueSpecificationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getValueSpecification__IntegerValue() {
		return valueSpecificationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getValueSpecification__IsComputable() {
		return valueSpecificationEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getValueSpecification__IsNull() {
		return valueSpecificationEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getValueSpecification__RealValue() {
		return valueSpecificationEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getValueSpecification__StringValue() {
		return valueSpecificationEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getValueSpecification__UnlimitedValue() {
		return valueSpecificationEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageEnd() {
		return messageEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageEnd_Message() {
		return (EReference)messageEndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMessageEnd__OppositeEnd() {
		return messageEndEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMessageEnd__IsSend() {
		return messageEndEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMessageEnd__IsReceive() {
		return messageEndEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMessageEnd__EnclosingFragment() {
		return messageEndEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutionSpecification() {
		return executionSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionSpecification_Finish() {
		return (EReference)executionSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionSpecification_Start() {
		return (EReference)executionSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExecutionSpecification__Same_lifeline__DiagnosticChain_Map() {
		return executionSpecificationEClass.getEOperations().get(0);
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
	public EOperation getActor__Associations__DiagnosticChain_Map() {
		return actorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActor__Must_have_name__DiagnosticChain_Map() {
		return actorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMessageKind() {
		return messageKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMessageSort() {
		return messageSortEEnum;
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
		interactionEClass = createEClass(INTERACTION);
		createEReference(interactionEClass, INTERACTION__LIFELINE);
		createEReference(interactionEClass, INTERACTION__FRAGMENT);
		createEReference(interactionEClass, INTERACTION__ACTION);
		createEReference(interactionEClass, INTERACTION__FORMAL_GATE);
		createEReference(interactionEClass, INTERACTION__MESSAGE);
		createEOperation(interactionEClass, INTERACTION___NOT_CONTAINED__DIAGNOSTICCHAIN_MAP);

		messageEClass = createEClass(MESSAGE);
		createEReference(messageEClass, MESSAGE__ARGUMENT);
		createEReference(messageEClass, MESSAGE__CONNECTOR);
		createEReference(messageEClass, MESSAGE__INTERACTION);
		createEAttribute(messageEClass, MESSAGE__MESSAGE_KIND);
		createEAttribute(messageEClass, MESSAGE__MESSAGE_SORT);
		createEReference(messageEClass, MESSAGE__RECEIVE_EVENT);
		createEReference(messageEClass, MESSAGE__SEND_EVENT);
		createEReference(messageEClass, MESSAGE__SIGNATURE);
		createEOperation(messageEClass, MESSAGE___SENDING_RECEIVING_MESSAGE_EVENT__DIAGNOSTICCHAIN_MAP);
		createEOperation(messageEClass, MESSAGE___ARGUMENTS__DIAGNOSTICCHAIN_MAP);
		createEOperation(messageEClass, MESSAGE___CANNOT_CROSS_BOUNDARIES__DIAGNOSTICCHAIN_MAP);
		createEOperation(messageEClass, MESSAGE___SIGNATURE_IS_SIGNAL__DIAGNOSTICCHAIN_MAP);
		createEOperation(messageEClass, MESSAGE___OCCURRENCE_SPECIFICATIONS__DIAGNOSTICCHAIN_MAP);
		createEOperation(messageEClass, MESSAGE___SIGNATURE_REFER_TO__DIAGNOSTICCHAIN_MAP);
		createEOperation(messageEClass, MESSAGE___SIGNATURE_IS_OPERATION_REQUEST__DIAGNOSTICCHAIN_MAP);
		createEOperation(messageEClass, MESSAGE___SIGNATURE_IS_OPERATION_REPLY__DIAGNOSTICCHAIN_MAP);
		createEOperation(messageEClass, MESSAGE___GET_MESSAGE_KIND);

		gateEClass = createEClass(GATE);
		createEOperation(gateEClass, GATE___ACTUAL_GATE_MATCHED__DIAGNOSTICCHAIN_MAP);
		createEOperation(gateEClass, GATE___INSIDE_CF_MATCHED__DIAGNOSTICCHAIN_MAP);
		createEOperation(gateEClass, GATE___OUTSIDE_CF_MATCHED__DIAGNOSTICCHAIN_MAP);
		createEOperation(gateEClass, GATE___FORMAL_GATE_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP);
		createEOperation(gateEClass, GATE___ACTUAL_GATE_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP);
		createEOperation(gateEClass, GATE___OUTSIDE_CF_GATE_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP);
		createEOperation(gateEClass, GATE___INSIDE_CF_GATE_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP);
		createEOperation(gateEClass, GATE___IS_OUTSIDE_CF);
		createEOperation(gateEClass, GATE___IS_INSIDE_CF);
		createEOperation(gateEClass, GATE___IS_ACTUAL);
		createEOperation(gateEClass, GATE___IS_FORMAL);
		createEOperation(gateEClass, GATE___GET_NAME);
		createEOperation(gateEClass, GATE___MATCHES__GATE);
		createEOperation(gateEClass, GATE___GET_OPERAND);

		interactionFragmentEClass = createEClass(INTERACTION_FRAGMENT);
		createEReference(interactionFragmentEClass, INTERACTION_FRAGMENT__COVERED);
		createEReference(interactionFragmentEClass, INTERACTION_FRAGMENT__ENCLOSING_OPERAND);
		createEReference(interactionFragmentEClass, INTERACTION_FRAGMENT__ENCLOSING_INTERACTION);
		createEReference(interactionFragmentEClass, INTERACTION_FRAGMENT__GENERAL_ORDERING);

		lifelineEClass = createEClass(LIFELINE);
		createEReference(lifelineEClass, LIFELINE__DECOMPOSED_AS);
		createEReference(lifelineEClass, LIFELINE__INTERACTION);
		createEReference(lifelineEClass, LIFELINE__REPRESENTS);
		createEReference(lifelineEClass, LIFELINE__SELECTOR);
		createEReference(lifelineEClass, LIFELINE__COVERED_BY);
		createEOperation(lifelineEClass, LIFELINE___SELECTOR_SPECIFIED__DIAGNOSTICCHAIN_MAP);
		createEOperation(lifelineEClass, LIFELINE___INTERACTION_USES_SHARE_LIFELINE__DIAGNOSTICCHAIN_MAP);
		createEOperation(lifelineEClass, LIFELINE___SAME_CLASSIFIER__DIAGNOSTICCHAIN_MAP);
		createEOperation(lifelineEClass, LIFELINE___SELECTOR_INT_OR_STRING__DIAGNOSTICCHAIN_MAP);

		valueSpecificationEClass = createEClass(VALUE_SPECIFICATION);
		createEOperation(valueSpecificationEClass, VALUE_SPECIFICATION___BOOLEAN_VALUE);
		createEOperation(valueSpecificationEClass, VALUE_SPECIFICATION___INTEGER_VALUE);
		createEOperation(valueSpecificationEClass, VALUE_SPECIFICATION___IS_COMPUTABLE);
		createEOperation(valueSpecificationEClass, VALUE_SPECIFICATION___IS_NULL);
		createEOperation(valueSpecificationEClass, VALUE_SPECIFICATION___REAL_VALUE);
		createEOperation(valueSpecificationEClass, VALUE_SPECIFICATION___STRING_VALUE);
		createEOperation(valueSpecificationEClass, VALUE_SPECIFICATION___UNLIMITED_VALUE);

		messageEndEClass = createEClass(MESSAGE_END);
		createEReference(messageEndEClass, MESSAGE_END__MESSAGE);
		createEOperation(messageEndEClass, MESSAGE_END___OPPOSITE_END);
		createEOperation(messageEndEClass, MESSAGE_END___IS_SEND);
		createEOperation(messageEndEClass, MESSAGE_END___IS_RECEIVE);
		createEOperation(messageEndEClass, MESSAGE_END___ENCLOSING_FRAGMENT);

		executionSpecificationEClass = createEClass(EXECUTION_SPECIFICATION);
		createEReference(executionSpecificationEClass, EXECUTION_SPECIFICATION__FINISH);
		createEReference(executionSpecificationEClass, EXECUTION_SPECIFICATION__START);
		createEOperation(executionSpecificationEClass, EXECUTION_SPECIFICATION___SAME_LIFELINE__DIAGNOSTICCHAIN_MAP);

		actorEClass = createEClass(ACTOR);
		createEOperation(actorEClass, ACTOR___ASSOCIATIONS__DIAGNOSTICCHAIN_MAP);
		createEOperation(actorEClass, ACTOR___MUST_HAVE_NAME__DIAGNOSTICCHAIN_MAP);

		// Create enums
		messageKindEEnum = createEEnum(MESSAGE_KIND);
		messageSortEEnum = createEEnum(MESSAGE_SORT);
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
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		interactionEClass.getESuperTypes().add(theUMLPackage.getBehavior());
		interactionEClass.getESuperTypes().add(this.getInteractionFragment());
		messageEClass.getESuperTypes().add(theUMLPackage.getNamedElement());
		gateEClass.getESuperTypes().add(this.getMessageEnd());
		interactionFragmentEClass.getESuperTypes().add(theUMLPackage.getNamedElement());
		lifelineEClass.getESuperTypes().add(theUMLPackage.getNamedElement());
		valueSpecificationEClass.getESuperTypes().add(theUMLPackage.getPackageableElement());
		valueSpecificationEClass.getESuperTypes().add(theUMLPackage.getTypedElement());
		messageEndEClass.getESuperTypes().add(theUMLPackage.getNamedElement());
		executionSpecificationEClass.getESuperTypes().add(this.getInteractionFragment());
		actorEClass.getESuperTypes().add(theUMLPackage.getBehavioredClassifier());

		// Initialize classes, features, and operations; add parameters
		initEClass(interactionEClass, Interaction.class, "Interaction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInteraction_Lifeline(), this.getLifeline(), null, "lifeline", null, 0, -1, Interaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInteraction_Fragment(), this.getInteractionFragment(), null, "fragment", null, 0, -1, Interaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInteraction_Action(), theUMLPackage.getAction(), null, "action", null, 0, -1, Interaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInteraction_FormalGate(), this.getGate(), null, "formalGate", null, 0, -1, Interaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInteraction_Message(), this.getMessage(), null, "message", null, 0, -1, Interaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = initEOperation(getInteraction__Not_contained__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "not_contained", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(messageEClass, Message.class, "Message", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMessage_Argument(), this.getValueSpecification(), null, "argument", null, 0, -1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessage_Connector(), theUMLPackage.getConnector(), null, "connector", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMessage_Interaction(), this.getInteraction(), null, "interaction", null, 1, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMessage_MessageKind(), this.getMessageKind(), "messageKind", "unknown", 1, 1, Message.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMessage_MessageSort(), this.getMessageSort(), "messageSort", "synchCall", 1, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMessage_ReceiveEvent(), this.getMessageEnd(), null, "receiveEvent", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMessage_SendEvent(), this.getMessageEnd(), null, "sendEvent", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMessage_Signature(), theUMLPackage.getNamedElement(), null, "signature", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getMessage__Sending_receiving_message_event__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "sending_receiving_message_event", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMessage__Arguments__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "arguments", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMessage__Cannot_cross_boundaries__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "cannot_cross_boundaries", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMessage__Signature_is_signal__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "signature_is_signal", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMessage__Occurrence_specifications__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "occurrence_specifications", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMessage__Signature_refer_to__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "signature_refer_to", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMessage__Signature_is_operation_request__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "signature_is_operation_request", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMessage__Signature_is_operation_reply__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "signature_is_operation_reply", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getMessage__GetMessageKind(), theUMLPackage.getMessageKind(), "getMessageKind", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(gateEClass, Gate.class, "Gate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getGate__Actual_gate_matched__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "actual_gate_matched", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getGate__Inside_cf_matched__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "inside_cf_matched", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getGate__Outside_cf_matched__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "outside_cf_matched", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getGate__Formal_gate_distinguishable__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "formal_gate_distinguishable", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getGate__Actual_gate_distinguishable__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "actual_gate_distinguishable", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getGate__Outside_cf_gate_distinguishable__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "outside_cf_gate_distinguishable", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getGate__Inside_cf_gate_distinguishable__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "inside_cf_gate_distinguishable", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getGate__IsOutsideCF(), theTypesPackage.getBoolean(), "isOutsideCF", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getGate__IsInsideCF(), theTypesPackage.getBoolean(), "isInsideCF", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getGate__IsActual(), theTypesPackage.getBoolean(), "isActual", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getGate__IsFormal(), theTypesPackage.getBoolean(), "isFormal", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getGate__GetName(), theTypesPackage.getString(), "getName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getGate__Matches__Gate(), theTypesPackage.getBoolean(), "matches", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getGate(), "gateToMatch", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getGate__GetOperand(), theUMLPackage.getInteractionOperand(), "getOperand", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(interactionFragmentEClass, InteractionFragment.class, "InteractionFragment", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInteractionFragment_Covered(), theUMLPackage.getLifeline(), null, "covered", null, 0, -1, InteractionFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInteractionFragment_EnclosingOperand(), theUMLPackage.getInteractionOperand(), null, "enclosingOperand", null, 0, 1, InteractionFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInteractionFragment_EnclosingInteraction(), this.getInteraction(), null, "enclosingInteraction", null, 0, 1, InteractionFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInteractionFragment_GeneralOrdering(), theUMLPackage.getGeneralOrdering(), null, "generalOrdering", null, 0, -1, InteractionFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(lifelineEClass, Lifeline.class, "Lifeline", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLifeline_DecomposedAs(), theUMLPackage.getPartDecomposition(), null, "decomposedAs", null, 0, 1, Lifeline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLifeline_Interaction(), this.getInteraction(), null, "interaction", null, 1, 1, Lifeline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLifeline_Represents(), theUMLPackage.getConnectableElement(), null, "represents", null, 0, 1, Lifeline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLifeline_Selector(), theUMLPackage.getValueSpecification(), null, "selector", null, 0, 1, Lifeline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLifeline_CoveredBy(), this.getInteractionFragment(), null, "coveredBy", null, 0, -1, Lifeline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getLifeline__Selector_specified__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "selector_specified", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLifeline__Interaction_uses_share_lifeline__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "interaction_uses_share_lifeline", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLifeline__Same_classifier__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "same_classifier", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLifeline__Selector_int_or_string__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "selector_int_or_string", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(valueSpecificationEClass, ValueSpecification.class, "ValueSpecification", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getValueSpecification__BooleanValue(), theTypesPackage.getBoolean(), "booleanValue", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getValueSpecification__IntegerValue(), theTypesPackage.getInteger(), "integerValue", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getValueSpecification__IsComputable(), theTypesPackage.getBoolean(), "isComputable", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getValueSpecification__IsNull(), theTypesPackage.getBoolean(), "isNull", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getValueSpecification__RealValue(), theTypesPackage.getReal(), "realValue", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getValueSpecification__StringValue(), theTypesPackage.getString(), "stringValue", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getValueSpecification__UnlimitedValue(), theTypesPackage.getUnlimitedNatural(), "unlimitedValue", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(messageEndEClass, MessageEnd.class, "MessageEnd", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMessageEnd_Message(), this.getMessage(), null, "message", null, 0, 1, MessageEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getMessageEnd__OppositeEnd(), this.getMessageEnd(), "oppositeEnd", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getMessageEnd__IsSend(), theTypesPackage.getBoolean(), "isSend", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getMessageEnd__IsReceive(), theTypesPackage.getBoolean(), "isReceive", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getMessageEnd__EnclosingFragment(), theUMLPackage.getInteractionFragment(), "enclosingFragment", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(executionSpecificationEClass, ExecutionSpecification.class, "ExecutionSpecification", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExecutionSpecification_Finish(), theUMLPackage.getOccurrenceSpecification(), null, "finish", null, 1, 1, ExecutionSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getExecutionSpecification_Start(), theUMLPackage.getOccurrenceSpecification(), null, "start", null, 1, 1, ExecutionSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getExecutionSpecification__Same_lifeline__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "same_lifeline", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(actorEClass, Actor.class, "Actor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getActor__Associations__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "associations", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getActor__Must_have_name__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "must_have_name", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(messageKindEEnum, MessageKind.class, "MessageKind");
		addEEnumLiteral(messageKindEEnum, MessageKind.COMPLETE);
		addEEnumLiteral(messageKindEEnum, MessageKind.LOST);
		addEEnumLiteral(messageKindEEnum, MessageKind.FOUND);
		addEEnumLiteral(messageKindEEnum, MessageKind.UNKNOWN);

		initEEnum(messageSortEEnum, MessageSort.class, "MessageSort");
		addEEnumLiteral(messageSortEEnum, MessageSort.SYNCH_CALL);
		addEEnumLiteral(messageSortEEnum, MessageSort.ASYNCH_CALL);
		addEEnumLiteral(messageSortEEnum, MessageSort.ASYNCH_SIGNAL);
		addEEnumLiteral(messageSortEEnum, MessageSort.CREATE_MESSAGE);
		addEEnumLiteral(messageSortEEnum, MessageSort.DELETE_MESSAGE);
		addEEnumLiteral(messageSortEEnum, MessageSort.REPLY);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// subsets
		createSubsetsAnnotations();
		// duplicates
		createDuplicatesAnnotations();
		// http://www.eclipse.org/uml2/2.0.0/UML
		createUMLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>subsets</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createSubsetsAnnotations() {
		String source = "subsets";	
		addAnnotation
		  (getInteraction_Lifeline(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(UMLPackage.eNS_URI).appendFragment("//Namespace/ownedMember")
		   });	
		addAnnotation
		  (getInteraction_Fragment(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(UMLPackage.eNS_URI).appendFragment("//Namespace/ownedMember")
		   });	
		addAnnotation
		  (getInteraction_Action(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(UMLPackage.eNS_URI).appendFragment("//Element/ownedElement")
		   });	
		addAnnotation
		  (getInteraction_FormalGate(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(UMLPackage.eNS_URI).appendFragment("//Namespace/ownedMember")
		   });	
		addAnnotation
		  (getInteraction_Message(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(UMLPackage.eNS_URI).appendFragment("//Namespace/ownedMember")
		   });	
		addAnnotation
		  (getMessage_Argument(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(UMLPackage.eNS_URI).appendFragment("//Element/ownedElement")
		   });	
		addAnnotation
		  (getMessage_Interaction(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(UMLPackage.eNS_URI).appendFragment("//NamedElement/namespace")
		   });	
		addAnnotation
		  (getInteractionFragment_EnclosingOperand(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(UMLPackage.eNS_URI).appendFragment("//NamedElement/namespace")
		   });	
		addAnnotation
		  (getInteractionFragment_EnclosingInteraction(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(UMLPackage.eNS_URI).appendFragment("//NamedElement/namespace")
		   });	
		addAnnotation
		  (getInteractionFragment_GeneralOrdering(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(UMLPackage.eNS_URI).appendFragment("//Element/ownedElement")
		   });	
		addAnnotation
		  (getLifeline_Interaction(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(UMLPackage.eNS_URI).appendFragment("//NamedElement/namespace")
		   });	
		addAnnotation
		  (getLifeline_Selector(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(UMLPackage.eNS_URI).appendFragment("//Element/ownedElement")
		   });
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
		addAnnotation
		  (gateEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (valueSpecificationEClass, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/2.0.0/UML</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUMLAnnotations() {
		String source = "http://www.eclipse.org/uml2/2.0.0/UML";	
		addAnnotation
		  (getMessage__GetMessageKind(), 
		   source, 
		   new String[] {
			 "originalName", "messageKind"
		   });
	}

} //Sequence_diagramPackageImpl
