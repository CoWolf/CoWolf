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
	 * The feature id for the '<em><b>Bar</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__BAR = 3;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__TRANSITION = 4;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__END = 5;

	/**
	 * The feature id for the '<em><b>Condition Arrow</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__CONDITION_ARROW = 6;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_FEATURE_COUNT = 7;

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
	 * The meta object id for the '{@link activity.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activity.impl.ActionImpl
	 * @see activity.impl.ActivityPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 2;

	/**
	 * The feature id for the '<em><b>Incoming To Action</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__INCOMING_TO_ACTION = 0;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ACTION = 1;

	/**
	 * The feature id for the '<em><b>Outgoing From Action Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__OUTGOING_FROM_ACTION_ACTION = 2;

	/**
	 * The feature id for the '<em><b>Incoming To Action From Decision</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__INCOMING_TO_ACTION_FROM_DECISION = 3;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Outgoing From Decision</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__OUTGOING_FROM_DECISION = 0;

	/**
	 * The feature id for the '<em><b>Incoming To Decision</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__INCOMING_TO_DECISION = 1;

	/**
	 * The number of structural features of the '<em>Decision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Decision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activity.impl.BarImpl <em>Bar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activity.impl.BarImpl
	 * @see activity.impl.ActivityPackageImpl#getBar()
	 * @generated
	 */
	int BAR = 4;

	/**
	 * The number of structural features of the '<em>Bar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Bar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activity.impl.SplitImpl <em>Split</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activity.impl.SplitImpl
	 * @see activity.impl.ActivityPackageImpl#getSplit()
	 * @generated
	 */
	int SPLIT = 5;

	/**
	 * The feature id for the '<em><b>Outgoing From Split</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT__OUTGOING_FROM_SPLIT = BAR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Incoming To Split</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT__INCOMING_TO_SPLIT = BAR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Split</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_FEATURE_COUNT = BAR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Split</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_OPERATION_COUNT = BAR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activity.impl.JoinImpl <em>Join</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activity.impl.JoinImpl
	 * @see activity.impl.ActivityPackageImpl#getJoin()
	 * @generated
	 */
	int JOIN = 6;

	/**
	 * The feature id for the '<em><b>Incoming To Join</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__INCOMING_TO_JOIN = BAR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outgoing From Join</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__OUTGOING_FROM_JOIN = BAR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_FEATURE_COUNT = BAR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_OPERATION_COUNT = BAR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activity.impl.ArrowImpl <em>Arrow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activity.impl.ArrowImpl
	 * @see activity.impl.ActivityPackageImpl#getArrow()
	 * @generated
	 */
	int ARROW = 7;

	/**
	 * The feature id for the '<em><b>EReference0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW__EREFERENCE0 = 0;

	/**
	 * The feature id for the '<em><b>From Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW__FROM_START = 1;

	/**
	 * The feature id for the '<em><b>To End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW__TO_END = 2;

	/**
	 * The feature id for the '<em><b>From Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW__FROM_ACTION = 3;

	/**
	 * The feature id for the '<em><b>To Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW__TO_ACTION = 4;

	/**
	 * The feature id for the '<em><b>From Split</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW__FROM_SPLIT = 5;

	/**
	 * The feature id for the '<em><b>To Split</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW__TO_SPLIT = 6;

	/**
	 * The feature id for the '<em><b>To Join</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW__TO_JOIN = 7;

	/**
	 * The feature id for the '<em><b>From Join</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW__FROM_JOIN = 8;

	/**
	 * The feature id for the '<em><b>To Decision</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW__TO_DECISION = 9;

	/**
	 * The number of structural features of the '<em>Arrow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Arrow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activity.impl.EndImpl <em>End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activity.impl.EndImpl
	 * @see activity.impl.ActivityPackageImpl#getEnd()
	 * @generated
	 */
	int END = 8;

	/**
	 * The feature id for the '<em><b>Incoming To End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__INCOMING_TO_END = 0;

	/**
	 * The number of structural features of the '<em>End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activity.impl.ConditionArrowImpl <em>Condition Arrow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activity.impl.ConditionArrowImpl
	 * @see activity.impl.ActivityPackageImpl#getConditionArrow()
	 * @generated
	 */
	int CONDITION_ARROW = 9;

	/**
	 * The feature id for the '<em><b>From Decision</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ARROW__FROM_DECISION = 0;

	/**
	 * The feature id for the '<em><b>To Action From Decision</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ARROW__TO_ACTION_FROM_DECISION = 1;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ARROW__CONDITION = 2;

	/**
	 * The number of structural features of the '<em>Condition Arrow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ARROW_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Condition Arrow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ARROW_OPERATION_COUNT = 0;


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
	 * Returns the meta object for the containment reference list '{@link activity.Root#getBar <em>Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bar</em>'.
	 * @see activity.Root#getBar()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Bar();

	/**
	 * Returns the meta object for the containment reference list '{@link activity.Root#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transition</em>'.
	 * @see activity.Root#getTransition()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Transition();

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
	 * Returns the meta object for the containment reference list '{@link activity.Root#getConditionArrow <em>Condition Arrow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Condition Arrow</em>'.
	 * @see activity.Root#getConditionArrow()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_ConditionArrow();

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
	 * Returns the meta object for the reference list '{@link activity.Action#getIncomingToAction <em>Incoming To Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming To Action</em>'.
	 * @see activity.Action#getIncomingToAction()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_IncomingToAction();

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
	 * Returns the meta object for the reference '{@link activity.Action#getOutgoingFromActionAction <em>Outgoing From Action Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Outgoing From Action Action</em>'.
	 * @see activity.Action#getOutgoingFromActionAction()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_OutgoingFromActionAction();

	/**
	 * Returns the meta object for the reference list '{@link activity.Action#getIncomingToActionFromDecision <em>Incoming To Action From Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming To Action From Decision</em>'.
	 * @see activity.Action#getIncomingToActionFromDecision()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_IncomingToActionFromDecision();

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
	 * Returns the meta object for the reference list '{@link activity.Decision#getOutgoingFromDecision <em>Outgoing From Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing From Decision</em>'.
	 * @see activity.Decision#getOutgoingFromDecision()
	 * @see #getDecision()
	 * @generated
	 */
	EReference getDecision_OutgoingFromDecision();

	/**
	 * Returns the meta object for the reference '{@link activity.Decision#getIncomingToDecision <em>Incoming To Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Incoming To Decision</em>'.
	 * @see activity.Decision#getIncomingToDecision()
	 * @see #getDecision()
	 * @generated
	 */
	EReference getDecision_IncomingToDecision();

	/**
	 * Returns the meta object for class '{@link activity.Bar <em>Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bar</em>'.
	 * @see activity.Bar
	 * @generated
	 */
	EClass getBar();

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
	 * Returns the meta object for the reference list '{@link activity.Split#getOutgoingFromSplit <em>Outgoing From Split</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing From Split</em>'.
	 * @see activity.Split#getOutgoingFromSplit()
	 * @see #getSplit()
	 * @generated
	 */
	EReference getSplit_OutgoingFromSplit();

	/**
	 * Returns the meta object for the reference '{@link activity.Split#getIncomingToSplit <em>Incoming To Split</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Incoming To Split</em>'.
	 * @see activity.Split#getIncomingToSplit()
	 * @see #getSplit()
	 * @generated
	 */
	EReference getSplit_IncomingToSplit();

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
	 * Returns the meta object for the reference list '{@link activity.Join#getIncomingToJoin <em>Incoming To Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming To Join</em>'.
	 * @see activity.Join#getIncomingToJoin()
	 * @see #getJoin()
	 * @generated
	 */
	EReference getJoin_IncomingToJoin();

	/**
	 * Returns the meta object for the reference '{@link activity.Join#getOutgoingFromJoin <em>Outgoing From Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Outgoing From Join</em>'.
	 * @see activity.Join#getOutgoingFromJoin()
	 * @see #getJoin()
	 * @generated
	 */
	EReference getJoin_OutgoingFromJoin();

	/**
	 * Returns the meta object for class '{@link activity.Arrow <em>Arrow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arrow</em>'.
	 * @see activity.Arrow
	 * @generated
	 */
	EClass getArrow();

	/**
	 * Returns the meta object for the reference '{@link activity.Arrow#getEReference0 <em>EReference0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference0</em>'.
	 * @see activity.Arrow#getEReference0()
	 * @see #getArrow()
	 * @generated
	 */
	EReference getArrow_EReference0();

	/**
	 * Returns the meta object for the reference '{@link activity.Arrow#getFromStart <em>From Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Start</em>'.
	 * @see activity.Arrow#getFromStart()
	 * @see #getArrow()
	 * @generated
	 */
	EReference getArrow_FromStart();

	/**
	 * Returns the meta object for the reference '{@link activity.Arrow#getToEnd <em>To End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To End</em>'.
	 * @see activity.Arrow#getToEnd()
	 * @see #getArrow()
	 * @generated
	 */
	EReference getArrow_ToEnd();

	/**
	 * Returns the meta object for the reference '{@link activity.Arrow#getFromAction <em>From Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Action</em>'.
	 * @see activity.Arrow#getFromAction()
	 * @see #getArrow()
	 * @generated
	 */
	EReference getArrow_FromAction();

	/**
	 * Returns the meta object for the reference '{@link activity.Arrow#getToAction <em>To Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Action</em>'.
	 * @see activity.Arrow#getToAction()
	 * @see #getArrow()
	 * @generated
	 */
	EReference getArrow_ToAction();

	/**
	 * Returns the meta object for the reference '{@link activity.Arrow#getFromSplit <em>From Split</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Split</em>'.
	 * @see activity.Arrow#getFromSplit()
	 * @see #getArrow()
	 * @generated
	 */
	EReference getArrow_FromSplit();

	/**
	 * Returns the meta object for the reference '{@link activity.Arrow#getToSplit <em>To Split</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Split</em>'.
	 * @see activity.Arrow#getToSplit()
	 * @see #getArrow()
	 * @generated
	 */
	EReference getArrow_ToSplit();

	/**
	 * Returns the meta object for the reference '{@link activity.Arrow#getToJoin <em>To Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Join</em>'.
	 * @see activity.Arrow#getToJoin()
	 * @see #getArrow()
	 * @generated
	 */
	EReference getArrow_ToJoin();

	/**
	 * Returns the meta object for the reference '{@link activity.Arrow#getFromJoin <em>From Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Join</em>'.
	 * @see activity.Arrow#getFromJoin()
	 * @see #getArrow()
	 * @generated
	 */
	EReference getArrow_FromJoin();

	/**
	 * Returns the meta object for the reference '{@link activity.Arrow#getToDecision <em>To Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Decision</em>'.
	 * @see activity.Arrow#getToDecision()
	 * @see #getArrow()
	 * @generated
	 */
	EReference getArrow_ToDecision();

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
	 * Returns the meta object for the reference '{@link activity.End#getIncomingToEnd <em>Incoming To End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Incoming To End</em>'.
	 * @see activity.End#getIncomingToEnd()
	 * @see #getEnd()
	 * @generated
	 */
	EReference getEnd_IncomingToEnd();

	/**
	 * Returns the meta object for class '{@link activity.ConditionArrow <em>Condition Arrow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Arrow</em>'.
	 * @see activity.ConditionArrow
	 * @generated
	 */
	EClass getConditionArrow();

	/**
	 * Returns the meta object for the reference '{@link activity.ConditionArrow#getFromDecision <em>From Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Decision</em>'.
	 * @see activity.ConditionArrow#getFromDecision()
	 * @see #getConditionArrow()
	 * @generated
	 */
	EReference getConditionArrow_FromDecision();

	/**
	 * Returns the meta object for the reference '{@link activity.ConditionArrow#getToActionFromDecision <em>To Action From Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Action From Decision</em>'.
	 * @see activity.ConditionArrow#getToActionFromDecision()
	 * @see #getConditionArrow()
	 * @generated
	 */
	EReference getConditionArrow_ToActionFromDecision();

	/**
	 * Returns the meta object for the attribute '{@link activity.ConditionArrow#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see activity.ConditionArrow#getCondition()
	 * @see #getConditionArrow()
	 * @generated
	 */
	EAttribute getConditionArrow_Condition();

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
		 * The meta object literal for the '<em><b>Bar</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__BAR = eINSTANCE.getRoot_Bar();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__TRANSITION = eINSTANCE.getRoot_Transition();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__END = eINSTANCE.getRoot_End();

		/**
		 * The meta object literal for the '<em><b>Condition Arrow</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__CONDITION_ARROW = eINSTANCE.getRoot_ConditionArrow();

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
		 * The meta object literal for the '<em><b>Incoming To Action</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__INCOMING_TO_ACTION = eINSTANCE.getAction_IncomingToAction();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__ACTION = eINSTANCE.getAction_Action();

		/**
		 * The meta object literal for the '<em><b>Outgoing From Action Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__OUTGOING_FROM_ACTION_ACTION = eINSTANCE.getAction_OutgoingFromActionAction();

		/**
		 * The meta object literal for the '<em><b>Incoming To Action From Decision</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__INCOMING_TO_ACTION_FROM_DECISION = eINSTANCE.getAction_IncomingToActionFromDecision();

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
		 * The meta object literal for the '<em><b>Outgoing From Decision</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECISION__OUTGOING_FROM_DECISION = eINSTANCE.getDecision_OutgoingFromDecision();

		/**
		 * The meta object literal for the '<em><b>Incoming To Decision</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECISION__INCOMING_TO_DECISION = eINSTANCE.getDecision_IncomingToDecision();

		/**
		 * The meta object literal for the '{@link activity.impl.BarImpl <em>Bar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activity.impl.BarImpl
		 * @see activity.impl.ActivityPackageImpl#getBar()
		 * @generated
		 */
		EClass BAR = eINSTANCE.getBar();

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
		 * The meta object literal for the '<em><b>Outgoing From Split</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPLIT__OUTGOING_FROM_SPLIT = eINSTANCE.getSplit_OutgoingFromSplit();

		/**
		 * The meta object literal for the '<em><b>Incoming To Split</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPLIT__INCOMING_TO_SPLIT = eINSTANCE.getSplit_IncomingToSplit();

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
		 * The meta object literal for the '<em><b>Incoming To Join</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOIN__INCOMING_TO_JOIN = eINSTANCE.getJoin_IncomingToJoin();

		/**
		 * The meta object literal for the '<em><b>Outgoing From Join</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOIN__OUTGOING_FROM_JOIN = eINSTANCE.getJoin_OutgoingFromJoin();

		/**
		 * The meta object literal for the '{@link activity.impl.ArrowImpl <em>Arrow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activity.impl.ArrowImpl
		 * @see activity.impl.ActivityPackageImpl#getArrow()
		 * @generated
		 */
		EClass ARROW = eINSTANCE.getArrow();

		/**
		 * The meta object literal for the '<em><b>EReference0</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARROW__EREFERENCE0 = eINSTANCE.getArrow_EReference0();

		/**
		 * The meta object literal for the '<em><b>From Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARROW__FROM_START = eINSTANCE.getArrow_FromStart();

		/**
		 * The meta object literal for the '<em><b>To End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARROW__TO_END = eINSTANCE.getArrow_ToEnd();

		/**
		 * The meta object literal for the '<em><b>From Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARROW__FROM_ACTION = eINSTANCE.getArrow_FromAction();

		/**
		 * The meta object literal for the '<em><b>To Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARROW__TO_ACTION = eINSTANCE.getArrow_ToAction();

		/**
		 * The meta object literal for the '<em><b>From Split</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARROW__FROM_SPLIT = eINSTANCE.getArrow_FromSplit();

		/**
		 * The meta object literal for the '<em><b>To Split</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARROW__TO_SPLIT = eINSTANCE.getArrow_ToSplit();

		/**
		 * The meta object literal for the '<em><b>To Join</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARROW__TO_JOIN = eINSTANCE.getArrow_ToJoin();

		/**
		 * The meta object literal for the '<em><b>From Join</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARROW__FROM_JOIN = eINSTANCE.getArrow_FromJoin();

		/**
		 * The meta object literal for the '<em><b>To Decision</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARROW__TO_DECISION = eINSTANCE.getArrow_ToDecision();

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
		 * The meta object literal for the '<em><b>Incoming To End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END__INCOMING_TO_END = eINSTANCE.getEnd_IncomingToEnd();

		/**
		 * The meta object literal for the '{@link activity.impl.ConditionArrowImpl <em>Condition Arrow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activity.impl.ConditionArrowImpl
		 * @see activity.impl.ActivityPackageImpl#getConditionArrow()
		 * @generated
		 */
		EClass CONDITION_ARROW = eINSTANCE.getConditionArrow();

		/**
		 * The meta object literal for the '<em><b>From Decision</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_ARROW__FROM_DECISION = eINSTANCE.getConditionArrow_FromDecision();

		/**
		 * The meta object literal for the '<em><b>To Action From Decision</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_ARROW__TO_ACTION_FROM_DECISION = eINSTANCE.getConditionArrow_ToActionFromDecision();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION_ARROW__CONDITION = eINSTANCE.getConditionArrow_Condition();

	}

} //ActivityPackage
