/**
 */
package sequence;

import commonBase.CommonBasePackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see sequence.SequenceFactory
 * @model kind="package"
 * @generated
 */
public interface SequencePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sequence";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sequence/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sequence";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SequencePackage eINSTANCE = sequence.impl.SequencePackageImpl.init();

	/**
	 * The meta object id for the '{@link sequence.impl.LifelineImpl <em>Lifeline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sequence.impl.LifelineImpl
	 * @see sequence.impl.SequencePackageImpl#getLifeline()
	 * @generated
	 */
	int LIFELINE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE__ID = CommonBasePackage.ID_BASE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE__NAME = CommonBasePackage.ID_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE__TASKS = CommonBasePackage.ID_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Lifeline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE_FEATURE_COUNT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Lifeline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE_OPERATION_COUNT = CommonBasePackage.ID_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sequence.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sequence.impl.MessageImpl
	 * @see sequence.impl.SequencePackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__ID = CommonBasePackage.ID_BASE__ID;

	/**
	 * The feature id for the '<em><b>Message Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__MESSAGE_KIND = CommonBasePackage.ID_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__MESSAGE = CommonBasePackage.ID_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__IN = CommonBasePackage.ID_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OPERATION_COUNT = CommonBasePackage.ID_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sequence.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sequence.impl.TaskImpl
	 * @see sequence.impl.SequencePackageImpl#getTask()
	 * @generated
	 */
	int TASK = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__ID = CommonBasePackage.ID_BASE__ID;

	/**
	 * The feature id for the '<em><b>Outgoing Messages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__OUTGOING_MESSAGES = CommonBasePackage.ID_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lifeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__LIFELINE = CommonBasePackage.ID_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__FROM = CommonBasePackage.ID_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__IN = CommonBasePackage.ID_BASE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = CommonBasePackage.ID_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sequence.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sequence.impl.ContainerImpl
	 * @see sequence.impl.SequencePackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ID = CommonBasePackage.ID_BASE__ID;

	/**
	 * The feature id for the '<em><b>Messages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__MESSAGES = CommonBasePackage.ID_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__TASKS = CommonBasePackage.ID_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_COUNT = CommonBasePackage.ID_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sequence.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sequence.impl.BlockImpl
	 * @see sequence.impl.SequencePackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__ID = CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Messages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__MESSAGES = CONTAINER__MESSAGES;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__TASKS = CONTAINER__TASKS;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__INCLUDES = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_OPERATION_COUNT = CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sequence.impl.LoopBlockImpl <em>Loop Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sequence.impl.LoopBlockImpl
	 * @see sequence.impl.SequencePackageImpl#getLoopBlock()
	 * @generated
	 */
	int LOOP_BLOCK = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_BLOCK__ID = BLOCK__ID;

	/**
	 * The feature id for the '<em><b>Messages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_BLOCK__MESSAGES = BLOCK__MESSAGES;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_BLOCK__TASKS = BLOCK__TASKS;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_BLOCK__INCLUDES = BLOCK__INCLUDES;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_BLOCK__CONDITION = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Loop Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_BLOCK_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Loop Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_BLOCK_OPERATION_COUNT = BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sequence.impl.AltBlockImpl <em>Alt Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sequence.impl.AltBlockImpl
	 * @see sequence.impl.SequencePackageImpl#getAltBlock()
	 * @generated
	 */
	int ALT_BLOCK = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_BLOCK__ID = CommonBasePackage.ID_BASE__ID;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_BLOCK__ALTERNATIVE = CommonBasePackage.ID_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Alt Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_BLOCK_FEATURE_COUNT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Alt Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_BLOCK_OPERATION_COUNT = CommonBasePackage.ID_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sequence.impl.AlternativeImpl <em>Alternative</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sequence.impl.AlternativeImpl
	 * @see sequence.impl.SequencePackageImpl#getAlternative()
	 * @generated
	 */
	int ALTERNATIVE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__ID = BLOCK__ID;

	/**
	 * The feature id for the '<em><b>Messages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__MESSAGES = BLOCK__MESSAGES;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__TASKS = BLOCK__TASKS;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__INCLUDES = BLOCK__INCLUDES;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__CONDITION = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Alternative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Alternative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_OPERATION_COUNT = BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sequence.impl.optBlockImpl <em>opt Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sequence.impl.optBlockImpl
	 * @see sequence.impl.SequencePackageImpl#getoptBlock()
	 * @generated
	 */
	int OPT_BLOCK = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPT_BLOCK__ID = BLOCK__ID;

	/**
	 * The feature id for the '<em><b>Messages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPT_BLOCK__MESSAGES = BLOCK__MESSAGES;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPT_BLOCK__TASKS = BLOCK__TASKS;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPT_BLOCK__INCLUDES = BLOCK__INCLUDES;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPT_BLOCK__CONDITION = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>opt Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPT_BLOCK_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>opt Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPT_BLOCK_OPERATION_COUNT = BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sequence.impl.SequenceImpl <em>Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sequence.impl.SequenceImpl
	 * @see sequence.impl.SequencePackageImpl#getSequence()
	 * @generated
	 */
	int SEQUENCE = 15;

	/**
	 * The meta object id for the '{@link sequence.impl.topLayerImpl <em>top Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sequence.impl.topLayerImpl
	 * @see sequence.impl.SequencePackageImpl#gettopLayer()
	 * @generated
	 */
	int TOP_LAYER = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LAYER__ID = CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Messages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LAYER__MESSAGES = CONTAINER__MESSAGES;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LAYER__TASKS = CONTAINER__TASKS;

	/**
	 * The feature id for the '<em><b>Lifelines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LAYER__LIFELINES = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Loop Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LAYER__LOOP_BLOCKS = CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Alt Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LAYER__ALT_BLOCKS = CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Opt Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LAYER__OPT_BLOCKS = CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Actors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LAYER__ACTORS = CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>top Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LAYER_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>top Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LAYER_OPERATION_COUNT = CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sequence.impl.MessageBaseImpl <em>Message Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sequence.impl.MessageBaseImpl
	 * @see sequence.impl.SequencePackageImpl#getMessageBase()
	 * @generated
	 */
	int MESSAGE_BASE = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BASE__ID = CommonBasePackage.ID_BASE__ID;

	/**
	 * The feature id for the '<em><b>To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BASE__TO = CommonBasePackage.ID_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Message Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BASE_FEATURE_COUNT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Message Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BASE_OPERATION_COUNT = CommonBasePackage.ID_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sequence.impl.InitialMessageImpl <em>Initial Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sequence.impl.InitialMessageImpl
	 * @see sequence.impl.SequencePackageImpl#getInitialMessage()
	 * @generated
	 */
	int INITIAL_MESSAGE = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MESSAGE__ID = MESSAGE_BASE__ID;

	/**
	 * The feature id for the '<em><b>To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MESSAGE__TO = MESSAGE_BASE__TO;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MESSAGE__MESSAGE = MESSAGE_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Initial Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MESSAGE_FEATURE_COUNT = MESSAGE_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Initial Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MESSAGE_OPERATION_COUNT = MESSAGE_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sequence.impl.ActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sequence.impl.ActorImpl
	 * @see sequence.impl.SequencePackageImpl#getActor()
	 * @generated
	 */
	int ACTOR = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__ID = CommonBasePackage.ID_BASE__ID;

	/**
	 * The feature id for the '<em><b>Initial Messages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__INITIAL_MESSAGES = CommonBasePackage.ID_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__NAME = CommonBasePackage.ID_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FEATURE_COUNT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_OPERATION_COUNT = CommonBasePackage.ID_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sequence.impl.SpecialMessageImpl <em>Special Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sequence.impl.SpecialMessageImpl
	 * @see sequence.impl.SequencePackageImpl#getSpecialMessage()
	 * @generated
	 */
	int SPECIAL_MESSAGE = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_MESSAGE__ID = MESSAGE__ID;

	/**
	 * The feature id for the '<em><b>Message Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_MESSAGE__MESSAGE_KIND = MESSAGE__MESSAGE_KIND;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_MESSAGE__MESSAGE = MESSAGE__MESSAGE;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_MESSAGE__IN = MESSAGE__IN;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_MESSAGE__TO = MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Message Sort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_MESSAGE__MESSAGE_SORT = MESSAGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Special Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_MESSAGE_FEATURE_COUNT = MESSAGE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Special Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_MESSAGE_OPERATION_COUNT = MESSAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sequence.impl.NormalMessageImpl <em>Normal Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sequence.impl.NormalMessageImpl
	 * @see sequence.impl.SequencePackageImpl#getNormalMessage()
	 * @generated
	 */
	int NORMAL_MESSAGE = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_MESSAGE__ID = MESSAGE__ID;

	/**
	 * The feature id for the '<em><b>Message Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_MESSAGE__MESSAGE_KIND = MESSAGE__MESSAGE_KIND;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_MESSAGE__MESSAGE = MESSAGE__MESSAGE;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_MESSAGE__IN = MESSAGE__IN;

	/**
	 * The feature id for the '<em><b>To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_MESSAGE__TO = MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Message Sort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_MESSAGE__MESSAGE_SORT = MESSAGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Normal Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_MESSAGE_FEATURE_COUNT = MESSAGE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Normal Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_MESSAGE_OPERATION_COUNT = MESSAGE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__ID = CommonBasePackage.ID_BASE__ID;

	/**
	 * The feature id for the '<em><b>Top Layer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__TOP_LAYER = CommonBasePackage.ID_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FEATURE_COUNT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_OPERATION_COUNT = CommonBasePackage.ID_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sequence.impl.BlockBaseImpl <em>Block Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sequence.impl.BlockBaseImpl
	 * @see sequence.impl.SequencePackageImpl#getBlockBase()
	 * @generated
	 */
	int BLOCK_BASE = 16;

	/**
	 * The number of structural features of the '<em>Block Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_BASE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Block Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_BASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sequence.MessageKind <em>Message Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sequence.MessageKind
	 * @see sequence.impl.SequencePackageImpl#getMessageKind()
	 * @generated
	 */
	int MESSAGE_KIND = 17;

	/**
	 * The meta object id for the '{@link sequence.MessageSortSpecial <em>Message Sort Special</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sequence.MessageSortSpecial
	 * @see sequence.impl.SequencePackageImpl#getMessageSortSpecial()
	 * @generated
	 */
	int MESSAGE_SORT_SPECIAL = 18;

	/**
	 * The meta object id for the '{@link sequence.MessageSortNormal <em>Message Sort Normal</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sequence.MessageSortNormal
	 * @see sequence.impl.SequencePackageImpl#getMessageSortNormal()
	 * @generated
	 */
	int MESSAGE_SORT_NORMAL = 19;


	/**
	 * Returns the meta object for class '{@link sequence.Lifeline <em>Lifeline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * Returns the meta object for the reference list '{@link sequence.Lifeline#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tasks</em>'.
	 * @see sequence.Lifeline#getTasks()
	 * @see #getLifeline()
	 * @generated
	 */
	EReference getLifeline_Tasks();

	/**
	 * Returns the meta object for class '{@link sequence.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see sequence.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for the attribute '{@link sequence.Message#getMessageKind <em>Message Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Kind</em>'.
	 * @see sequence.Message#getMessageKind()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_MessageKind();

	/**
	 * Returns the meta object for the attribute '{@link sequence.Message#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see sequence.Message#getMessage()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Message();

	/**
	 * Returns the meta object for the reference '{@link sequence.Message#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>In</em>'.
	 * @see sequence.Message#getIn()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_In();

	/**
	 * Returns the meta object for class '{@link sequence.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see sequence.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the containment reference list '{@link sequence.Task#getOutgoingMessages <em>Outgoing Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outgoing Messages</em>'.
	 * @see sequence.Task#getOutgoingMessages()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_OutgoingMessages();

	/**
	 * Returns the meta object for the reference '{@link sequence.Task#getLifeline <em>Lifeline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lifeline</em>'.
	 * @see sequence.Task#getLifeline()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Lifeline();

	/**
	 * Returns the meta object for the container reference '{@link sequence.Task#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>From</em>'.
	 * @see sequence.Task#getFrom()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_From();

	/**
	 * Returns the meta object for the reference '{@link sequence.Task#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>In</em>'.
	 * @see sequence.Task#getIn()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_In();

	/**
	 * Returns the meta object for class '{@link sequence.LoopBlock <em>Loop Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop Block</em>'.
	 * @see sequence.LoopBlock
	 * @generated
	 */
	EClass getLoopBlock();

	/**
	 * Returns the meta object for the attribute '{@link sequence.LoopBlock#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see sequence.LoopBlock#getCondition()
	 * @see #getLoopBlock()
	 * @generated
	 */
	EAttribute getLoopBlock_Condition();

	/**
	 * Returns the meta object for class '{@link sequence.AltBlock <em>Alt Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * Returns the meta object for the attribute '{@link sequence.Alternative#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see sequence.Alternative#getCondition()
	 * @see #getAlternative()
	 * @generated
	 */
	EAttribute getAlternative_Condition();

	/**
	 * Returns the meta object for class '{@link sequence.optBlock <em>opt Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>opt Block</em>'.
	 * @see sequence.optBlock
	 * @generated
	 */
	EClass getoptBlock();

	/**
	 * Returns the meta object for the attribute '{@link sequence.optBlock#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see sequence.optBlock#getCondition()
	 * @see #getoptBlock()
	 * @generated
	 */
	EAttribute getoptBlock_Condition();

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
	 * Returns the meta object for the containment reference '{@link sequence.Sequence#getTopLayer <em>Top Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Top Layer</em>'.
	 * @see sequence.Sequence#getTopLayer()
	 * @see #getSequence()
	 * @generated
	 */
	EReference getSequence_TopLayer();

	/**
	 * Returns the meta object for class '{@link sequence.BlockBase <em>Block Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block Base</em>'.
	 * @see sequence.BlockBase
	 * @generated
	 */
	EClass getBlockBase();

	/**
	 * Returns the meta object for class '{@link sequence.topLayer <em>top Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>top Layer</em>'.
	 * @see sequence.topLayer
	 * @generated
	 */
	EClass gettopLayer();

	/**
	 * Returns the meta object for the containment reference list '{@link sequence.topLayer#getLifelines <em>Lifelines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lifelines</em>'.
	 * @see sequence.topLayer#getLifelines()
	 * @see #gettopLayer()
	 * @generated
	 */
	EReference gettopLayer_Lifelines();

	/**
	 * Returns the meta object for the containment reference list '{@link sequence.topLayer#getLoopBlocks <em>Loop Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Loop Blocks</em>'.
	 * @see sequence.topLayer#getLoopBlocks()
	 * @see #gettopLayer()
	 * @generated
	 */
	EReference gettopLayer_LoopBlocks();

	/**
	 * Returns the meta object for the containment reference list '{@link sequence.topLayer#getAltBlocks <em>Alt Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alt Blocks</em>'.
	 * @see sequence.topLayer#getAltBlocks()
	 * @see #gettopLayer()
	 * @generated
	 */
	EReference gettopLayer_AltBlocks();

	/**
	 * Returns the meta object for the containment reference list '{@link sequence.topLayer#getOptBlocks <em>Opt Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Opt Blocks</em>'.
	 * @see sequence.topLayer#getOptBlocks()
	 * @see #gettopLayer()
	 * @generated
	 */
	EReference gettopLayer_OptBlocks();

	/**
	 * Returns the meta object for the containment reference list '{@link sequence.topLayer#getActors <em>Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actors</em>'.
	 * @see sequence.topLayer#getActors()
	 * @see #gettopLayer()
	 * @generated
	 */
	EReference gettopLayer_Actors();

	/**
	 * Returns the meta object for class '{@link sequence.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see sequence.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the reference list '{@link sequence.Container#getMessages <em>Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Messages</em>'.
	 * @see sequence.Container#getMessages()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Messages();

	/**
	 * Returns the meta object for the reference list '{@link sequence.Container#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tasks</em>'.
	 * @see sequence.Container#getTasks()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Tasks();

	/**
	 * Returns the meta object for class '{@link sequence.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see sequence.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link sequence.Block#getIncludes <em>Includes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Includes</em>'.
	 * @see sequence.Block#getIncludes()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Includes();

	/**
	 * Returns the meta object for class '{@link sequence.InitialMessage <em>Initial Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial Message</em>'.
	 * @see sequence.InitialMessage
	 * @generated
	 */
	EClass getInitialMessage();

	/**
	 * Returns the meta object for the attribute '{@link sequence.InitialMessage#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see sequence.InitialMessage#getMessage()
	 * @see #getInitialMessage()
	 * @generated
	 */
	EAttribute getInitialMessage_Message();

	/**
	 * Returns the meta object for class '{@link sequence.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see sequence.Actor
	 * @generated
	 */
	EClass getActor();

	/**
	 * Returns the meta object for the containment reference list '{@link sequence.Actor#getInitialMessages <em>Initial Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Initial Messages</em>'.
	 * @see sequence.Actor#getInitialMessages()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_InitialMessages();

	/**
	 * Returns the meta object for the attribute '{@link sequence.Actor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sequence.Actor#getName()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_Name();

	/**
	 * Returns the meta object for class '{@link sequence.SpecialMessage <em>Special Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Special Message</em>'.
	 * @see sequence.SpecialMessage
	 * @generated
	 */
	EClass getSpecialMessage();

	/**
	 * Returns the meta object for the reference '{@link sequence.SpecialMessage#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see sequence.SpecialMessage#getTo()
	 * @see #getSpecialMessage()
	 * @generated
	 */
	EReference getSpecialMessage_To();

	/**
	 * Returns the meta object for the attribute '{@link sequence.SpecialMessage#getMessageSort <em>Message Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Sort</em>'.
	 * @see sequence.SpecialMessage#getMessageSort()
	 * @see #getSpecialMessage()
	 * @generated
	 */
	EAttribute getSpecialMessage_MessageSort();

	/**
	 * Returns the meta object for class '{@link sequence.NormalMessage <em>Normal Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Normal Message</em>'.
	 * @see sequence.NormalMessage
	 * @generated
	 */
	EClass getNormalMessage();

	/**
	 * Returns the meta object for the attribute '{@link sequence.NormalMessage#getMessageSort <em>Message Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Sort</em>'.
	 * @see sequence.NormalMessage#getMessageSort()
	 * @see #getNormalMessage()
	 * @generated
	 */
	EAttribute getNormalMessage_MessageSort();

	/**
	 * Returns the meta object for class '{@link sequence.MessageBase <em>Message Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Base</em>'.
	 * @see sequence.MessageBase
	 * @generated
	 */
	EClass getMessageBase();

	/**
	 * Returns the meta object for the containment reference '{@link sequence.MessageBase#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>To</em>'.
	 * @see sequence.MessageBase#getTo()
	 * @see #getMessageBase()
	 * @generated
	 */
	EReference getMessageBase_To();

	/**
	 * Returns the meta object for enum '{@link sequence.MessageKind <em>Message Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Message Kind</em>'.
	 * @see sequence.MessageKind
	 * @generated
	 */
	EEnum getMessageKind();

	/**
	 * Returns the meta object for enum '{@link sequence.MessageSortSpecial <em>Message Sort Special</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Message Sort Special</em>'.
	 * @see sequence.MessageSortSpecial
	 * @generated
	 */
	EEnum getMessageSortSpecial();

	/**
	 * Returns the meta object for enum '{@link sequence.MessageSortNormal <em>Message Sort Normal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Message Sort Normal</em>'.
	 * @see sequence.MessageSortNormal
	 * @generated
	 */
	EEnum getMessageSortNormal();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SequenceFactory getSequenceFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link sequence.impl.LifelineImpl <em>Lifeline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sequence.impl.LifelineImpl
		 * @see sequence.impl.SequencePackageImpl#getLifeline()
		 * @generated
		 */
		EClass LIFELINE = eINSTANCE.getLifeline();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIFELINE__NAME = eINSTANCE.getLifeline_Name();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIFELINE__TASKS = eINSTANCE.getLifeline_Tasks();

		/**
		 * The meta object literal for the '{@link sequence.impl.MessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sequence.impl.MessageImpl
		 * @see sequence.impl.SequencePackageImpl#getMessage()
		 * @generated
		 */
		EClass MESSAGE = eINSTANCE.getMessage();

		/**
		 * The meta object literal for the '<em><b>Message Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__MESSAGE_KIND = eINSTANCE.getMessage_MessageKind();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__MESSAGE = eINSTANCE.getMessage_Message();

		/**
		 * The meta object literal for the '<em><b>In</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__IN = eINSTANCE.getMessage_In();

		/**
		 * The meta object literal for the '{@link sequence.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sequence.impl.TaskImpl
		 * @see sequence.impl.SequencePackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Outgoing Messages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__OUTGOING_MESSAGES = eINSTANCE.getTask_OutgoingMessages();

		/**
		 * The meta object literal for the '<em><b>Lifeline</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__LIFELINE = eINSTANCE.getTask_Lifeline();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__FROM = eINSTANCE.getTask_From();

		/**
		 * The meta object literal for the '<em><b>In</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__IN = eINSTANCE.getTask_In();

		/**
		 * The meta object literal for the '{@link sequence.impl.LoopBlockImpl <em>Loop Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sequence.impl.LoopBlockImpl
		 * @see sequence.impl.SequencePackageImpl#getLoopBlock()
		 * @generated
		 */
		EClass LOOP_BLOCK = eINSTANCE.getLoopBlock();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOP_BLOCK__CONDITION = eINSTANCE.getLoopBlock_Condition();

		/**
		 * The meta object literal for the '{@link sequence.impl.AltBlockImpl <em>Alt Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sequence.impl.AltBlockImpl
		 * @see sequence.impl.SequencePackageImpl#getAltBlock()
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
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALTERNATIVE__CONDITION = eINSTANCE.getAlternative_Condition();

		/**
		 * The meta object literal for the '{@link sequence.impl.optBlockImpl <em>opt Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sequence.impl.optBlockImpl
		 * @see sequence.impl.SequencePackageImpl#getoptBlock()
		 * @generated
		 */
		EClass OPT_BLOCK = eINSTANCE.getoptBlock();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPT_BLOCK__CONDITION = eINSTANCE.getoptBlock_Condition();

		/**
		 * The meta object literal for the '{@link sequence.impl.SequenceImpl <em>Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sequence.impl.SequenceImpl
		 * @see sequence.impl.SequencePackageImpl#getSequence()
		 * @generated
		 */
		EClass SEQUENCE = eINSTANCE.getSequence();

		/**
		 * The meta object literal for the '<em><b>Top Layer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE__TOP_LAYER = eINSTANCE.getSequence_TopLayer();

		/**
		 * The meta object literal for the '{@link sequence.impl.BlockBaseImpl <em>Block Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sequence.impl.BlockBaseImpl
		 * @see sequence.impl.SequencePackageImpl#getBlockBase()
		 * @generated
		 */
		EClass BLOCK_BASE = eINSTANCE.getBlockBase();

		/**
		 * The meta object literal for the '{@link sequence.impl.topLayerImpl <em>top Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sequence.impl.topLayerImpl
		 * @see sequence.impl.SequencePackageImpl#gettopLayer()
		 * @generated
		 */
		EClass TOP_LAYER = eINSTANCE.gettopLayer();

		/**
		 * The meta object literal for the '<em><b>Lifelines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOP_LAYER__LIFELINES = eINSTANCE.gettopLayer_Lifelines();

		/**
		 * The meta object literal for the '<em><b>Loop Blocks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOP_LAYER__LOOP_BLOCKS = eINSTANCE.gettopLayer_LoopBlocks();

		/**
		 * The meta object literal for the '<em><b>Alt Blocks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOP_LAYER__ALT_BLOCKS = eINSTANCE.gettopLayer_AltBlocks();

		/**
		 * The meta object literal for the '<em><b>Opt Blocks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOP_LAYER__OPT_BLOCKS = eINSTANCE.gettopLayer_OptBlocks();

		/**
		 * The meta object literal for the '<em><b>Actors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOP_LAYER__ACTORS = eINSTANCE.gettopLayer_Actors();

		/**
		 * The meta object literal for the '{@link sequence.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sequence.impl.ContainerImpl
		 * @see sequence.impl.SequencePackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em><b>Messages</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__MESSAGES = eINSTANCE.getContainer_Messages();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__TASKS = eINSTANCE.getContainer_Tasks();

		/**
		 * The meta object literal for the '{@link sequence.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sequence.impl.BlockImpl
		 * @see sequence.impl.SequencePackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '<em><b>Includes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__INCLUDES = eINSTANCE.getBlock_Includes();

		/**
		 * The meta object literal for the '{@link sequence.impl.InitialMessageImpl <em>Initial Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sequence.impl.InitialMessageImpl
		 * @see sequence.impl.SequencePackageImpl#getInitialMessage()
		 * @generated
		 */
		EClass INITIAL_MESSAGE = eINSTANCE.getInitialMessage();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INITIAL_MESSAGE__MESSAGE = eINSTANCE.getInitialMessage_Message();

		/**
		 * The meta object literal for the '{@link sequence.impl.ActorImpl <em>Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sequence.impl.ActorImpl
		 * @see sequence.impl.SequencePackageImpl#getActor()
		 * @generated
		 */
		EClass ACTOR = eINSTANCE.getActor();

		/**
		 * The meta object literal for the '<em><b>Initial Messages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__INITIAL_MESSAGES = eINSTANCE.getActor_InitialMessages();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR__NAME = eINSTANCE.getActor_Name();

		/**
		 * The meta object literal for the '{@link sequence.impl.SpecialMessageImpl <em>Special Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sequence.impl.SpecialMessageImpl
		 * @see sequence.impl.SequencePackageImpl#getSpecialMessage()
		 * @generated
		 */
		EClass SPECIAL_MESSAGE = eINSTANCE.getSpecialMessage();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIAL_MESSAGE__TO = eINSTANCE.getSpecialMessage_To();

		/**
		 * The meta object literal for the '<em><b>Message Sort</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIAL_MESSAGE__MESSAGE_SORT = eINSTANCE.getSpecialMessage_MessageSort();

		/**
		 * The meta object literal for the '{@link sequence.impl.NormalMessageImpl <em>Normal Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sequence.impl.NormalMessageImpl
		 * @see sequence.impl.SequencePackageImpl#getNormalMessage()
		 * @generated
		 */
		EClass NORMAL_MESSAGE = eINSTANCE.getNormalMessage();

		/**
		 * The meta object literal for the '<em><b>Message Sort</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NORMAL_MESSAGE__MESSAGE_SORT = eINSTANCE.getNormalMessage_MessageSort();

		/**
		 * The meta object literal for the '{@link sequence.impl.MessageBaseImpl <em>Message Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sequence.impl.MessageBaseImpl
		 * @see sequence.impl.SequencePackageImpl#getMessageBase()
		 * @generated
		 */
		EClass MESSAGE_BASE = eINSTANCE.getMessageBase();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_BASE__TO = eINSTANCE.getMessageBase_To();

		/**
		 * The meta object literal for the '{@link sequence.MessageKind <em>Message Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sequence.MessageKind
		 * @see sequence.impl.SequencePackageImpl#getMessageKind()
		 * @generated
		 */
		EEnum MESSAGE_KIND = eINSTANCE.getMessageKind();

		/**
		 * The meta object literal for the '{@link sequence.MessageSortSpecial <em>Message Sort Special</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sequence.MessageSortSpecial
		 * @see sequence.impl.SequencePackageImpl#getMessageSortSpecial()
		 * @generated
		 */
		EEnum MESSAGE_SORT_SPECIAL = eINSTANCE.getMessageSortSpecial();

		/**
		 * The meta object literal for the '{@link sequence.MessageSortNormal <em>Message Sort Normal</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sequence.MessageSortNormal
		 * @see sequence.impl.SequencePackageImpl#getMessageSortNormal()
		 * @generated
		 */
		EEnum MESSAGE_SORT_NORMAL = eINSTANCE.getMessageSortNormal();

	}

} //SequencePackage
