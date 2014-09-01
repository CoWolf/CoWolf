/**
 */
package sequence;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains
 * accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each operation of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see sequence.SequenceFactory
 * @model kind="package"
 * @generated
 */
public interface SequencePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sequence";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "sequence";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sequence";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	SequencePackage eINSTANCE = sequence.impl.SequencePackageImpl.init();

	/**
	 * The meta object id for the '{@link sequence.impl.SequenceImpl <em>Sequence</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see sequence.impl.SequenceImpl
	 * @see sequence.impl.SequencePackageImpl#getSequence()
	 * @generated
	 */
	int SEQUENCE = 0;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__BLOCK = 1;

	/**
	 * The number of structural features of the '<em>sequence</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>sequence</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sequence.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see sequence.impl.ElementImpl
	 * @see sequence.impl.SequencePackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 1;

	/**
	 * The number of structural features of the '<em>Element</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Element</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sequence.impl.LifelineImpl <em>Lifeline</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see sequence.impl.LifelineImpl
	 * @see sequence.impl.SequencePackageImpl#getLifeline()
	 * @generated
	 */
	int LIFELINE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LIFELINE__NAME = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Task</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE__TASK = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Lifeline</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LIFELINE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Lifeline</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LIFELINE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sequence.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see sequence.impl.MessageImpl
	 * @see sequence.impl.SequencePackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 3;

	/**
	 * The feature id for the '<em><b>Message Kind</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MESSAGE__MESSAGE_KIND = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Message Sort</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MESSAGE__MESSAGE_SORT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__FROM = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__TO = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Message</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Message</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sequence.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see sequence.impl.TaskImpl
	 * @see sequence.impl.SequencePackageImpl#getTask()
	 * @generated
	 */
	int TASK = 4;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__OUTGOING = 0;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__INCOMING = 1;

	/**
	 * The number of structural features of the '<em>Task</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Task</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sequence.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see sequence.impl.BlockImpl
	 * @see sequence.impl.SequencePackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 5;

	/**
	 * The number of structural features of the '<em>Block</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Block</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BLOCK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Sequence.impl.LoopBlockImpl
	 * <em>Loop Block</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see Sequence.impl.LoopBlockImpl
	 * @see Sequence.impl.SequencePackageImpl#getLoopBlock()
	 * @generated
	 */
	int LOOP_BLOCK = 6;

	/**
	 * The feature id for the '<em><b>Include</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_BLOCK__INCLUDE = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Loop Block</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_BLOCK_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Loop Block</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LOOP_BLOCK_OPERATION_COUNT = BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sequence.impl.AltBlockImpl <em>Alt Block</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see sequence.impl.AltBlockImpl
	 * @see sequence.impl.SequencePackageImpl#getAltBlock()
	 * @generated
	 */
	int ALT_BLOCK = 7;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_BLOCK__ALTERNATIVE = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Alt Block</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ALT_BLOCK_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Alt Block</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ALT_BLOCK_OPERATION_COUNT = BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sequence.impl.AlternativeImpl <em>Alternative</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sequence.impl.AlternativeImpl
	 * @see sequence.impl.SequencePackageImpl#getAlternative()
	 * @generated
	 */
	int ALTERNATIVE = 8;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__INCLUDES = 0;

	/**
	 * The number of structural features of the '<em>Alternative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Alternative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Sequence.MessageKind
	 * <em>Message Kind</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see Sequence.MessageKind
	 * @see Sequence.impl.SequencePackageImpl#getMessageKind()
	 * @generated
	 */
	int MESSAGE_KIND = 9;

	/**
	 * The meta object id for the '{@link Sequence.MessageSort
	 * <em>Message Sort</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see Sequence.MessageSort
	 * @see Sequence.impl.SequencePackageImpl#getMessageSort()
	 * @generated
	 */
	int MESSAGE_SORT = 10;

	/**
	 * Returns the meta object for class '{@link sequence.Sequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence</em>'.
	 * @see sequence.Sequence
	 * @generated
	 */
	EClass getSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link sequence.Sequence#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element</em>'.
	 * @see sequence.Sequence#getElement()
	 * @see #getSequence()
	 * @generated
	 */
	EReference getSequence_Element();

	/**
	 * Returns the meta object for the containment reference list '{@link sequence.Sequence#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Block</em>'.
	 * @see sequence.Sequence#getBlock()
	 * @see #getSequence()
	 * @generated
	 */
	EReference getSequence_Block();

	/**
	 * Returns the meta object for class '{@link sequence.Element <em>Element</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see sequence.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for class '{@link sequence.Lifeline <em>Lifeline</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lifeline</em>'.
	 * @see sequence.Lifeline
	 * @generated
	 */
	EClass getLifeline();

	/**
	 * Returns the meta object for the attribute '{@link sequence.Lifeline#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sequence.Lifeline#getName()
	 * @see #getLifeline()
	 * @generated
	 */
	EAttribute getLifeline_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link sequence.Lifeline#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Task</em>'.
	 * @see sequence.Lifeline#getTask()
	 * @see #getLifeline()
	 * @generated
	 */
	EReference getLifeline_Task();

	/**
	 * Returns the meta object for class '{@link sequence.Message <em>Message</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see sequence.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for the attribute '
	 * {@link Sequence.Message#getMessageKind <em>Message Kind</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Message Kind</em>'.
	 * @see Sequence.Message#getMessageKind()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_MessageKind();

	/**
	 * Returns the meta object for the attribute '
	 * {@link Sequence.Message#getMessageSort <em>Message Sort</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Message Sort</em>'.
	 * @see Sequence.Message#getMessageSort()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_MessageSort();

	/**
	 * Returns the meta object for the reference '{@link sequence.Message#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see sequence.Message#getFrom()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_From();

	/**
	 * Returns the meta object for the reference '{@link sequence.Message#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see sequence.Message#getTo()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_To();

	/**
	 * Returns the meta object for class '{@link sequence.Task <em>Task</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see sequence.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the containment reference list '{@link sequence.Task#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outgoing</em>'.
	 * @see sequence.Task#getOutgoing()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Outgoing();

	/**
	 * Returns the meta object for the reference list '{@link sequence.Task#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming</em>'.
	 * @see sequence.Task#getIncoming()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Incoming();

	/**
	 * Returns the meta object for class '{@link sequence.Block <em>Block</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see sequence.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for class '{@link sequence.LoopBlock <em>Loop Block</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop Block</em>'.
	 * @see sequence.LoopBlock
	 * @generated
	 */
	EClass getLoopBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link sequence.LoopBlock#getInclude <em>Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Include</em>'.
	 * @see sequence.LoopBlock#getInclude()
	 * @see #getLoopBlock()
	 * @generated
	 */
	EReference getLoopBlock_Include();

	/**
	 * Returns the meta object for class '{@link sequence.AltBlock <em>Alt Block</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alt Block</em>'.
	 * @see sequence.AltBlock
	 * @generated
	 */
	EClass getAltBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link sequence.AltBlock#getAlternative <em>Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alternative</em>'.
	 * @see sequence.AltBlock#getAlternative()
	 * @see #getAltBlock()
	 * @generated
	 */
	EReference getAltBlock_Alternative();

	/**
	 * Returns the meta object for class '{@link sequence.Alternative <em>Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alternative</em>'.
	 * @see sequence.Alternative
	 * @generated
	 */
	EClass getAlternative();

	/**
	 * Returns the meta object for the containment reference list '{@link sequence.Alternative#getIncludes <em>Includes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Includes</em>'.
	 * @see sequence.Alternative#getIncludes()
	 * @see #getAlternative()
	 * @generated
	 */
	EReference getAlternative_Includes();

	/**
	 * Returns the meta object for enum '{@link sequence.MessageKind <em>Message Kind</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Message Kind</em>'.
	 * @see sequence.MessageKind
	 * @generated
	 */
	EEnum getMessageKind();

	/**
	 * Returns the meta object for enum '{@link sequence.MessageSort <em>Message Sort</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Message Sort</em>'.
	 * @see sequence.MessageSort
	 * @generated
	 */
	EEnum getMessageSort();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SequenceFactory getSequenceFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that
	 * represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each operation of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Sequence.impl.sequenceImpl
		 * <em>sequence</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see Sequence.impl.sequenceImpl
		 * @see Sequence.impl.SequencePackageImpl#getsequence()
		 * @generated
		 */
		EClass SEQUENCE = eINSTANCE.getSequence();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE__ELEMENT = eINSTANCE.getSequence_Element();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE__BLOCK = eINSTANCE.getSequence_Block();

		/**
		 * The meta object literal for the '{@link Sequence.impl.ElementImpl
		 * <em>Element</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see Sequence.impl.ElementImpl
		 * @see Sequence.impl.SequencePackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '{@link Sequence.impl.LifelineImpl
		 * <em>Lifeline</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see Sequence.impl.LifelineImpl
		 * @see Sequence.impl.SequencePackageImpl#getLifeline()
		 * @generated
		 */
		EClass LIFELINE = eINSTANCE.getLifeline();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIFELINE__NAME = eINSTANCE.getLifeline_Name();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIFELINE__TASK = eINSTANCE.getLifeline_Task();

		/**
		 * The meta object literal for the '{@link Sequence.impl.MessageImpl
		 * <em>Message</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see Sequence.impl.MessageImpl
		 * @see Sequence.impl.SequencePackageImpl#getMessage()
		 * @generated
		 */
		EClass MESSAGE = eINSTANCE.getMessage();

		/**
		 * The meta object literal for the '<em><b>Message Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__MESSAGE_KIND = eINSTANCE.getMessage_MessageKind();

		/**
		 * The meta object literal for the '<em><b>Message Sort</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__MESSAGE_SORT = eINSTANCE.getMessage_MessageSort();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__FROM = eINSTANCE.getMessage_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__TO = eINSTANCE.getMessage_To();

		/**
		 * The meta object literal for the '{@link sequence.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see sequence.impl.TaskImpl
		 * @see sequence.impl.SequencePackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__OUTGOING = eINSTANCE.getTask_Outgoing();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__INCOMING = eINSTANCE.getTask_Incoming();

		/**
		 * The meta object literal for the '{@link sequence.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see sequence.impl.BlockImpl
		 * @see sequence.impl.SequencePackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '{@link sequence.impl.LoopBlockImpl <em>Loop Block</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see sequence.impl.LoopBlockImpl
		 * @see sequence.impl.SequencePackageImpl#getLoopBlock()
		 * @generated
		 */
		EClass LOOP_BLOCK = eINSTANCE.getLoopBlock();

		/**
		 * The meta object literal for the '<em><b>Include</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP_BLOCK__INCLUDE = eINSTANCE.getLoopBlock_Include();

		/**
		 * The meta object literal for the '{@link Sequence.impl.AltBlockImpl
		 * <em>Alt Block</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see Sequence.impl.AltBlockImpl
		 * @see Sequence.impl.SequencePackageImpl#getAltBlock()
		 * @generated
		 */
		EClass ALT_BLOCK = eINSTANCE.getAltBlock();

		/**
		 * The meta object literal for the '<em><b>Alternative</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALT_BLOCK__ALTERNATIVE = eINSTANCE.getAltBlock_Alternative();

		/**
		 * The meta object literal for the '{@link sequence.impl.AlternativeImpl <em>Alternative</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sequence.impl.AlternativeImpl
		 * @see sequence.impl.SequencePackageImpl#getAlternative()
		 * @generated
		 */
		EClass ALTERNATIVE = eINSTANCE.getAlternative();

		/**
		 * The meta object literal for the '<em><b>Includes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALTERNATIVE__INCLUDES = eINSTANCE.getAlternative_Includes();

		/**
		 * The meta object literal for the '{@link sequence.MessageKind <em>Message Kind</em>}' enum.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see sequence.MessageKind
		 * @see sequence.impl.SequencePackageImpl#getMessageKind()
		 * @generated
		 */
		EEnum MESSAGE_KIND = eINSTANCE.getMessageKind();

		/**
		 * The meta object literal for the '{@link sequence.MessageSort <em>Message Sort</em>}' enum.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see sequence.MessageSort
		 * @see sequence.impl.SequencePackageImpl#getMessageSort()
		 * @generated
		 */
		EEnum MESSAGE_SORT = eINSTANCE.getMessageSort();

	}

} // SequencePackage
