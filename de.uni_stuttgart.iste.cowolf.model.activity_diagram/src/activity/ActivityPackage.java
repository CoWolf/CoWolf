/**
 */
package activity;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see activity.ActivityFactory
 * @model kind="package"
 * @generated
 */
public interface ActivityPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "activity";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://activity/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "activity";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ActivityPackage eINSTANCE = activity.impl.ActivityPackageImpl.init();

	/**
	 * The meta object id for the '{@link activity.impl.RootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activity.impl.RootImpl
	 * @see activity.impl.ActivityPackageImpl#getRoot()
	 * @generated
	 */
	int ROOT = 0;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__START = 0;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__ACTION = 1;

	/**
	 * The feature id for the '<em><b>Decision</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__DECISION = 2;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__END = 3;

	/**
	 * The feature id for the '<em><b>Split</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__SPLIT = 4;

	/**
	 * The feature id for the '<em><b>Join</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__JOIN = 5;

	/**
	 * The feature id for the '<em><b>Start Arrow</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__START_ARROW = 6;

	/**
	 * The feature id for the '<em><b>Nodes Without Join</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__NODES_WITHOUT_JOIN = 7;

	/**
	 * The feature id for the '<em><b>After Action Arrow</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__AFTER_ACTION_ARROW = 8;

	/**
	 * The feature id for the '<em><b>Decision Arrow</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__DECISION_ARROW = 9;

	/**
	 * The feature id for the '<em><b>Split Arrow</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__SPLIT_ARROW = 10;

	/**
	 * The feature id for the '<em><b>Join Arrow</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__JOIN_ARROW = 11;

	/**
	 * The feature id for the '<em><b>Arrow After Join</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__ARROW_AFTER_JOIN = 12;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activity.impl.StartImpl <em>Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activity.impl.StartImpl
	 * @see activity.impl.ActivityPackageImpl#getStart()
	 * @generated
	 */
	int START = 1;

	/**
	 * The feature id for the '<em><b>Outgoing From Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__OUTGOING_FROM_START = 0;

	/**
	 * The number of structural features of the '<em>Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activity.impl.NodesImpl <em>Nodes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activity.impl.NodesImpl
	 * @see activity.impl.ActivityPackageImpl#getNodes()
	 * @generated
	 */
	int NODES = 13;

	/**
	 * The number of structural features of the '<em>Nodes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODES_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Nodes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activity.impl.NodesWithoutJoinImpl <em>Nodes Without Join</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activity.impl.NodesWithoutJoinImpl
	 * @see activity.impl.ActivityPackageImpl#getNodesWithoutJoin()
	 * @generated
	 */
	int NODES_WITHOUT_JOIN = 7;

	/**
	 * The feature id for the '<em><b>Join</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODES_WITHOUT_JOIN__JOIN = NODES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Nodes Without Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODES_WITHOUT_JOIN_FEATURE_COUNT = NODES_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Nodes Without Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODES_WITHOUT_JOIN_OPERATION_COUNT = NODES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activity.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activity.impl.ActionImpl
	 * @see activity.impl.ActivityPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 2;

	/**
	 * The feature id for the '<em><b>Join</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__JOIN = NODES_WITHOUT_JOIN__JOIN;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ACTION = NODES_WITHOUT_JOIN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__OUTGOING = NODES_WITHOUT_JOIN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = NODES_WITHOUT_JOIN_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = NODES_WITHOUT_JOIN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activity.impl.DecisionImpl <em>Decision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activity.impl.DecisionImpl
	 * @see activity.impl.ActivityPackageImpl#getDecision()
	 * @generated
	 */
	int DECISION = 3;

	/**
	 * The feature id for the '<em><b>Join</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__JOIN = NODES_WITHOUT_JOIN__JOIN;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__OUTGOING = NODES_WITHOUT_JOIN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Decision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_FEATURE_COUNT = NODES_WITHOUT_JOIN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Decision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_OPERATION_COUNT = NODES_WITHOUT_JOIN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activity.impl.SplitImpl <em>Split</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activity.impl.SplitImpl
	 * @see activity.impl.ActivityPackageImpl#getSplit()
	 * @generated
	 */
	int SPLIT = 4;

	/**
	 * The feature id for the '<em><b>Join</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT__JOIN = NODES_WITHOUT_JOIN__JOIN;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT__OUTGOING = NODES_WITHOUT_JOIN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Split</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_FEATURE_COUNT = NODES_WITHOUT_JOIN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Split</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_OPERATION_COUNT = NODES_WITHOUT_JOIN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activity.impl.JoinImpl <em>Join</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activity.impl.JoinImpl
	 * @see activity.impl.ActivityPackageImpl#getJoin()
	 * @generated
	 */
	int JOIN = 5;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__OUTGOING = NODES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_FEATURE_COUNT = NODES_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_OPERATION_COUNT = NODES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activity.impl.EndImpl <em>End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activity.impl.EndImpl
	 * @see activity.impl.ActivityPackageImpl#getEnd()
	 * @generated
	 */
	int END = 6;

	/**
	 * The feature id for the '<em><b>Join</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__JOIN = NODES_WITHOUT_JOIN__JOIN;

	/**
	 * The number of structural features of the '<em>End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_COUNT = NODES_WITHOUT_JOIN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_OPERATION_COUNT = NODES_WITHOUT_JOIN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activity.impl.ArrowAfterStartImpl <em>Arrow After Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activity.impl.ArrowAfterStartImpl
	 * @see activity.impl.ActivityPackageImpl#getArrowAfterStart()
	 * @generated
	 */
	int ARROW_AFTER_START = 8;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW_AFTER_START__TARGET = 0;

	/**
	 * The number of structural features of the '<em>Arrow After Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW_AFTER_START_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Arrow After Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW_AFTER_START_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activity.impl.DecisionArrowImpl <em>Decision Arrow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activity.impl.DecisionArrowImpl
	 * @see activity.impl.ActivityPackageImpl#getDecisionArrow()
	 * @generated
	 */
	int DECISION_ARROW = 9;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_ARROW__CONDITION = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_ARROW__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Decision Arrow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_ARROW_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Decision Arrow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_ARROW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activity.impl.AfterActionArrowImpl <em>After Action Arrow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activity.impl.AfterActionArrowImpl
	 * @see activity.impl.ActivityPackageImpl#getAfterActionArrow()
	 * @generated
	 */
	int AFTER_ACTION_ARROW = 10;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_ACTION_ARROW__TARGET = 0;

	/**
	 * The number of structural features of the '<em>After Action Arrow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_ACTION_ARROW_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>After Action Arrow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_ACTION_ARROW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activity.impl.SplitArrowImpl <em>Split Arrow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activity.impl.SplitArrowImpl
	 * @see activity.impl.ActivityPackageImpl#getSplitArrow()
	 * @generated
	 */
	int SPLIT_ARROW = 11;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_ARROW__TARGET = 0;

	/**
	 * The number of structural features of the '<em>Split Arrow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_ARROW_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Split Arrow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_ARROW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activity.impl.JoinArrowImpl <em>Join Arrow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activity.impl.JoinArrowImpl
	 * @see activity.impl.ActivityPackageImpl#getJoinArrow()
	 * @generated
	 */
	int JOIN_ARROW = 12;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_ARROW__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_ARROW__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Join Arrow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_ARROW_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Join Arrow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_ARROW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activity.impl.ArrowAfterJoinImpl <em>Arrow After Join</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activity.impl.ArrowAfterJoinImpl
	 * @see activity.impl.ActivityPackageImpl#getArrowAfterJoin()
	 * @generated
	 */
	int ARROW_AFTER_JOIN = 14;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW_AFTER_JOIN__TARGET = 0;

	/**
	 * The number of structural features of the '<em>Arrow After Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW_AFTER_JOIN_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Arrow After Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW_AFTER_JOIN_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link activity.Root <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see activity.Root
	 * @generated
	 */
	EClass getRoot();

	/**
	 * Returns the meta object for the containment reference '{@link activity.Root#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start</em>'.
	 * @see activity.Root#getStart()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Start();

	/**
	 * Returns the meta object for the containment reference list '{@link activity.Root#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action</em>'.
	 * @see activity.Root#getAction()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Action();

	/**
	 * Returns the meta object for the containment reference list '{@link activity.Root#getDecision <em>Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Decision</em>'.
	 * @see activity.Root#getDecision()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Decision();

	/**
	 * Returns the meta object for the containment reference '{@link activity.Root#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>End</em>'.
	 * @see activity.Root#getEnd()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_End();

	/**
	 * Returns the meta object for the containment reference list '{@link activity.Root#getSplit <em>Split</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Split</em>'.
	 * @see activity.Root#getSplit()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Split();

	/**
	 * Returns the meta object for the containment reference list '{@link activity.Root#getJoin <em>Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Join</em>'.
	 * @see activity.Root#getJoin()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Join();

	/**
	 * Returns the meta object for the containment reference '{@link activity.Root#getStartArrow <em>Start Arrow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start Arrow</em>'.
	 * @see activity.Root#getStartArrow()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_StartArrow();

	/**
	 * Returns the meta object for the containment reference list '{@link activity.Root#getNodesWithoutJoin <em>Nodes Without Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes Without Join</em>'.
	 * @see activity.Root#getNodesWithoutJoin()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_NodesWithoutJoin();

	/**
	 * Returns the meta object for the containment reference list '{@link activity.Root#getAfterActionArrow <em>After Action Arrow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>After Action Arrow</em>'.
	 * @see activity.Root#getAfterActionArrow()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_AfterActionArrow();

	/**
	 * Returns the meta object for the containment reference list '{@link activity.Root#getDecisionArrow <em>Decision Arrow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Decision Arrow</em>'.
	 * @see activity.Root#getDecisionArrow()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_DecisionArrow();

	/**
	 * Returns the meta object for the containment reference list '{@link activity.Root#getSplitArrow <em>Split Arrow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Split Arrow</em>'.
	 * @see activity.Root#getSplitArrow()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_SplitArrow();

	/**
	 * Returns the meta object for the containment reference list '{@link activity.Root#getJoinArrow <em>Join Arrow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Join Arrow</em>'.
	 * @see activity.Root#getJoinArrow()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_JoinArrow();

	/**
	 * Returns the meta object for the containment reference list '{@link activity.Root#getArrowAfterJoin <em>Arrow After Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arrow After Join</em>'.
	 * @see activity.Root#getArrowAfterJoin()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_ArrowAfterJoin();

	/**
	 * Returns the meta object for class '{@link activity.Start <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start</em>'.
	 * @see activity.Start
	 * @generated
	 */
	EClass getStart();

	/**
	 * Returns the meta object for the reference '{@link activity.Start#getOutgoingFromStart <em>Outgoing From Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Outgoing From Start</em>'.
	 * @see activity.Start#getOutgoingFromStart()
	 * @see #getStart()
	 * @generated
	 */
	EReference getStart_OutgoingFromStart();

	/**
	 * Returns the meta object for class '{@link activity.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see activity.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute '{@link activity.Action#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see activity.Action#getAction()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Action();

	/**
	 * Returns the meta object for the reference '{@link activity.Action#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Outgoing</em>'.
	 * @see activity.Action#getOutgoing()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Outgoing();

	/**
	 * Returns the meta object for class '{@link activity.Decision <em>Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision</em>'.
	 * @see activity.Decision
	 * @generated
	 */
	EClass getDecision();

	/**
	 * Returns the meta object for the reference list '{@link activity.Decision#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing</em>'.
	 * @see activity.Decision#getOutgoing()
	 * @see #getDecision()
	 * @generated
	 */
	EReference getDecision_Outgoing();

	/**
	 * Returns the meta object for class '{@link activity.Split <em>Split</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Split</em>'.
	 * @see activity.Split
	 * @generated
	 */
	EClass getSplit();

	/**
	 * Returns the meta object for the reference list '{@link activity.Split#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing</em>'.
	 * @see activity.Split#getOutgoing()
	 * @see #getSplit()
	 * @generated
	 */
	EReference getSplit_Outgoing();

	/**
	 * Returns the meta object for class '{@link activity.Join <em>Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join</em>'.
	 * @see activity.Join
	 * @generated
	 */
	EClass getJoin();

	/**
	 * Returns the meta object for the reference '{@link activity.Join#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Outgoing</em>'.
	 * @see activity.Join#getOutgoing()
	 * @see #getJoin()
	 * @generated
	 */
	EReference getJoin_Outgoing();

	/**
	 * Returns the meta object for class '{@link activity.End <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End</em>'.
	 * @see activity.End
	 * @generated
	 */
	EClass getEnd();

	/**
	 * Returns the meta object for class '{@link activity.NodesWithoutJoin <em>Nodes Without Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nodes Without Join</em>'.
	 * @see activity.NodesWithoutJoin
	 * @generated
	 */
	EClass getNodesWithoutJoin();

	/**
	 * Returns the meta object for the reference list '{@link activity.NodesWithoutJoin#getJoin <em>Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Join</em>'.
	 * @see activity.NodesWithoutJoin#getJoin()
	 * @see #getNodesWithoutJoin()
	 * @generated
	 */
	EReference getNodesWithoutJoin_Join();

	/**
	 * Returns the meta object for class '{@link activity.ArrowAfterStart <em>Arrow After Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arrow After Start</em>'.
	 * @see activity.ArrowAfterStart
	 * @generated
	 */
	EClass getArrowAfterStart();

	/**
	 * Returns the meta object for the reference '{@link activity.ArrowAfterStart#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see activity.ArrowAfterStart#getTarget()
	 * @see #getArrowAfterStart()
	 * @generated
	 */
	EReference getArrowAfterStart_Target();

	/**
	 * Returns the meta object for class '{@link activity.DecisionArrow <em>Decision Arrow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision Arrow</em>'.
	 * @see activity.DecisionArrow
	 * @generated
	 */
	EClass getDecisionArrow();

	/**
	 * Returns the meta object for the attribute '{@link activity.DecisionArrow#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see activity.DecisionArrow#getCondition()
	 * @see #getDecisionArrow()
	 * @generated
	 */
	EAttribute getDecisionArrow_Condition();

	/**
	 * Returns the meta object for the reference '{@link activity.DecisionArrow#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see activity.DecisionArrow#getTarget()
	 * @see #getDecisionArrow()
	 * @generated
	 */
	EReference getDecisionArrow_Target();

	/**
	 * Returns the meta object for class '{@link activity.AfterActionArrow <em>After Action Arrow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>After Action Arrow</em>'.
	 * @see activity.AfterActionArrow
	 * @generated
	 */
	EClass getAfterActionArrow();

	/**
	 * Returns the meta object for the reference '{@link activity.AfterActionArrow#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see activity.AfterActionArrow#getTarget()
	 * @see #getAfterActionArrow()
	 * @generated
	 */
	EReference getAfterActionArrow_Target();

	/**
	 * Returns the meta object for class '{@link activity.SplitArrow <em>Split Arrow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Split Arrow</em>'.
	 * @see activity.SplitArrow
	 * @generated
	 */
	EClass getSplitArrow();

	/**
	 * Returns the meta object for the reference '{@link activity.SplitArrow#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see activity.SplitArrow#getTarget()
	 * @see #getSplitArrow()
	 * @generated
	 */
	EReference getSplitArrow_Target();

	/**
	 * Returns the meta object for class '{@link activity.JoinArrow <em>Join Arrow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join Arrow</em>'.
	 * @see activity.JoinArrow
	 * @generated
	 */
	EClass getJoinArrow();

	/**
	 * Returns the meta object for the reference list '{@link activity.JoinArrow#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source</em>'.
	 * @see activity.JoinArrow#getSource()
	 * @see #getJoinArrow()
	 * @generated
	 */
	EReference getJoinArrow_Source();

	/**
	 * Returns the meta object for the reference '{@link activity.JoinArrow#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see activity.JoinArrow#getTarget()
	 * @see #getJoinArrow()
	 * @generated
	 */
	EReference getJoinArrow_Target();

	/**
	 * Returns the meta object for class '{@link activity.Nodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nodes</em>'.
	 * @see activity.Nodes
	 * @generated
	 */
	EClass getNodes();

	/**
	 * Returns the meta object for class '{@link activity.ArrowAfterJoin <em>Arrow After Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arrow After Join</em>'.
	 * @see activity.ArrowAfterJoin
	 * @generated
	 */
	EClass getArrowAfterJoin();

	/**
	 * Returns the meta object for the reference '{@link activity.ArrowAfterJoin#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see activity.ArrowAfterJoin#getTarget()
	 * @see #getArrowAfterJoin()
	 * @generated
	 */
	EReference getArrowAfterJoin_Target();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ActivityFactory getActivityFactory();

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
		 * The meta object literal for the '{@link activity.impl.RootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activity.impl.RootImpl
		 * @see activity.impl.ActivityPackageImpl#getRoot()
		 * @generated
		 */
		EClass ROOT = eINSTANCE.getRoot();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__START = eINSTANCE.getRoot_Start();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__ACTION = eINSTANCE.getRoot_Action();

		/**
		 * The meta object literal for the '<em><b>Decision</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__DECISION = eINSTANCE.getRoot_Decision();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__END = eINSTANCE.getRoot_End();

		/**
		 * The meta object literal for the '<em><b>Split</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__SPLIT = eINSTANCE.getRoot_Split();

		/**
		 * The meta object literal for the '<em><b>Join</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__JOIN = eINSTANCE.getRoot_Join();

		/**
		 * The meta object literal for the '<em><b>Start Arrow</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__START_ARROW = eINSTANCE.getRoot_StartArrow();

		/**
		 * The meta object literal for the '<em><b>Nodes Without Join</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__NODES_WITHOUT_JOIN = eINSTANCE.getRoot_NodesWithoutJoin();

		/**
		 * The meta object literal for the '<em><b>After Action Arrow</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__AFTER_ACTION_ARROW = eINSTANCE.getRoot_AfterActionArrow();

		/**
		 * The meta object literal for the '<em><b>Decision Arrow</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__DECISION_ARROW = eINSTANCE.getRoot_DecisionArrow();

		/**
		 * The meta object literal for the '<em><b>Split Arrow</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__SPLIT_ARROW = eINSTANCE.getRoot_SplitArrow();

		/**
		 * The meta object literal for the '<em><b>Join Arrow</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__JOIN_ARROW = eINSTANCE.getRoot_JoinArrow();

		/**
		 * The meta object literal for the '<em><b>Arrow After Join</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__ARROW_AFTER_JOIN = eINSTANCE.getRoot_ArrowAfterJoin();

		/**
		 * The meta object literal for the '{@link activity.impl.StartImpl <em>Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activity.impl.StartImpl
		 * @see activity.impl.ActivityPackageImpl#getStart()
		 * @generated
		 */
		EClass START = eINSTANCE.getStart();

		/**
		 * The meta object literal for the '<em><b>Outgoing From Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference START__OUTGOING_FROM_START = eINSTANCE.getStart_OutgoingFromStart();

		/**
		 * The meta object literal for the '{@link activity.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activity.impl.ActionImpl
		 * @see activity.impl.ActivityPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__ACTION = eINSTANCE.getAction_Action();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__OUTGOING = eINSTANCE.getAction_Outgoing();

		/**
		 * The meta object literal for the '{@link activity.impl.DecisionImpl <em>Decision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activity.impl.DecisionImpl
		 * @see activity.impl.ActivityPackageImpl#getDecision()
		 * @generated
		 */
		EClass DECISION = eINSTANCE.getDecision();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECISION__OUTGOING = eINSTANCE.getDecision_Outgoing();

		/**
		 * The meta object literal for the '{@link activity.impl.SplitImpl <em>Split</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activity.impl.SplitImpl
		 * @see activity.impl.ActivityPackageImpl#getSplit()
		 * @generated
		 */
		EClass SPLIT = eINSTANCE.getSplit();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPLIT__OUTGOING = eINSTANCE.getSplit_Outgoing();

		/**
		 * The meta object literal for the '{@link activity.impl.JoinImpl <em>Join</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activity.impl.JoinImpl
		 * @see activity.impl.ActivityPackageImpl#getJoin()
		 * @generated
		 */
		EClass JOIN = eINSTANCE.getJoin();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOIN__OUTGOING = eINSTANCE.getJoin_Outgoing();

		/**
		 * The meta object literal for the '{@link activity.impl.EndImpl <em>End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activity.impl.EndImpl
		 * @see activity.impl.ActivityPackageImpl#getEnd()
		 * @generated
		 */
		EClass END = eINSTANCE.getEnd();

		/**
		 * The meta object literal for the '{@link activity.impl.NodesWithoutJoinImpl <em>Nodes Without Join</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activity.impl.NodesWithoutJoinImpl
		 * @see activity.impl.ActivityPackageImpl#getNodesWithoutJoin()
		 * @generated
		 */
		EClass NODES_WITHOUT_JOIN = eINSTANCE.getNodesWithoutJoin();

		/**
		 * The meta object literal for the '<em><b>Join</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODES_WITHOUT_JOIN__JOIN = eINSTANCE.getNodesWithoutJoin_Join();

		/**
		 * The meta object literal for the '{@link activity.impl.ArrowAfterStartImpl <em>Arrow After Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activity.impl.ArrowAfterStartImpl
		 * @see activity.impl.ActivityPackageImpl#getArrowAfterStart()
		 * @generated
		 */
		EClass ARROW_AFTER_START = eINSTANCE.getArrowAfterStart();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARROW_AFTER_START__TARGET = eINSTANCE.getArrowAfterStart_Target();

		/**
		 * The meta object literal for the '{@link activity.impl.DecisionArrowImpl <em>Decision Arrow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activity.impl.DecisionArrowImpl
		 * @see activity.impl.ActivityPackageImpl#getDecisionArrow()
		 * @generated
		 */
		EClass DECISION_ARROW = eINSTANCE.getDecisionArrow();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECISION_ARROW__CONDITION = eINSTANCE.getDecisionArrow_Condition();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECISION_ARROW__TARGET = eINSTANCE.getDecisionArrow_Target();

		/**
		 * The meta object literal for the '{@link activity.impl.AfterActionArrowImpl <em>After Action Arrow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activity.impl.AfterActionArrowImpl
		 * @see activity.impl.ActivityPackageImpl#getAfterActionArrow()
		 * @generated
		 */
		EClass AFTER_ACTION_ARROW = eINSTANCE.getAfterActionArrow();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AFTER_ACTION_ARROW__TARGET = eINSTANCE.getAfterActionArrow_Target();

		/**
		 * The meta object literal for the '{@link activity.impl.SplitArrowImpl <em>Split Arrow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activity.impl.SplitArrowImpl
		 * @see activity.impl.ActivityPackageImpl#getSplitArrow()
		 * @generated
		 */
		EClass SPLIT_ARROW = eINSTANCE.getSplitArrow();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPLIT_ARROW__TARGET = eINSTANCE.getSplitArrow_Target();

		/**
		 * The meta object literal for the '{@link activity.impl.JoinArrowImpl <em>Join Arrow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activity.impl.JoinArrowImpl
		 * @see activity.impl.ActivityPackageImpl#getJoinArrow()
		 * @generated
		 */
		EClass JOIN_ARROW = eINSTANCE.getJoinArrow();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOIN_ARROW__SOURCE = eINSTANCE.getJoinArrow_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOIN_ARROW__TARGET = eINSTANCE.getJoinArrow_Target();

		/**
		 * The meta object literal for the '{@link activity.impl.NodesImpl <em>Nodes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activity.impl.NodesImpl
		 * @see activity.impl.ActivityPackageImpl#getNodes()
		 * @generated
		 */
		EClass NODES = eINSTANCE.getNodes();

		/**
		 * The meta object literal for the '{@link activity.impl.ArrowAfterJoinImpl <em>Arrow After Join</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activity.impl.ArrowAfterJoinImpl
		 * @see activity.impl.ActivityPackageImpl#getArrowAfterJoin()
		 * @generated
		 */
		EClass ARROW_AFTER_JOIN = eINSTANCE.getArrowAfterJoin();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARROW_AFTER_JOIN__TARGET = eINSTANCE.getArrowAfterJoin_Target();

	}

} //ActivityPackage
