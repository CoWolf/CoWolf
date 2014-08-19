/**
 */
package de.uni_stuttgart.iste.cowolf.model.activity_diagram;

import de.uni_stuttgart.iste.cowolf.model.commonBase.CommonBasePackage;

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
 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.Activity_diagramFactory
 * @model kind="package"
 * @generated
 */
public interface Activity_diagramPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "activity_diagram";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ActivityDiagram/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "activity_diagram";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Activity_diagramPackage eINSTANCE = de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.Activity_diagramPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.ActivityDiagramImpl <em>Activity Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.ActivityDiagramImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.Activity_diagramPackageImpl#getActivityDiagram()
	 * @generated
	 */
	int ACTIVITY_DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DIAGRAM__ID = CommonBasePackage.ID_BASE__ID;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DIAGRAM__START = CommonBasePackage.ID_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DIAGRAM__ACTION = CommonBasePackage.ID_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Decision</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DIAGRAM__DECISION = CommonBasePackage.ID_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DIAGRAM__END = CommonBasePackage.ID_BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Split</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DIAGRAM__SPLIT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Join</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DIAGRAM__JOIN = CommonBasePackage.ID_BASE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Start Arrow</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DIAGRAM__START_ARROW = CommonBasePackage.ID_BASE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>After Action Arrow</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DIAGRAM__AFTER_ACTION_ARROW = CommonBasePackage.ID_BASE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Decision Arrow</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DIAGRAM__DECISION_ARROW = CommonBasePackage.ID_BASE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Split Arrow</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DIAGRAM__SPLIT_ARROW = CommonBasePackage.ID_BASE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Join Arrow</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DIAGRAM__JOIN_ARROW = CommonBasePackage.ID_BASE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Arrow After Join</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DIAGRAM__ARROW_AFTER_JOIN = CommonBasePackage.ID_BASE_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Activity Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DIAGRAM_FEATURE_COUNT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Activity Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DIAGRAM_OPERATION_COUNT = CommonBasePackage.ID_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.StartImpl <em>Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.StartImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.Activity_diagramPackageImpl#getStart()
	 * @generated
	 */
	int START = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__ID = CommonBasePackage.ID_BASE__ID;

	/**
	 * The feature id for the '<em><b>Outgoing From Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__OUTGOING_FROM_START = CommonBasePackage.ID_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_FEATURE_COUNT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OPERATION_COUNT = CommonBasePackage.ID_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.NodesImpl <em>Nodes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.NodesImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.Activity_diagramPackageImpl#getNodes()
	 * @generated
	 */
	int NODES = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODES__ID = CommonBasePackage.ID_BASE__ID;

	/**
	 * The number of structural features of the '<em>Nodes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODES_FEATURE_COUNT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Nodes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODES_OPERATION_COUNT = CommonBasePackage.ID_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.NodesWithoutJoinImpl <em>Nodes Without Join</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.NodesWithoutJoinImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.Activity_diagramPackageImpl#getNodesWithoutJoin()
	 * @generated
	 */
	int NODES_WITHOUT_JOIN = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODES_WITHOUT_JOIN__ID = NODES__ID;

	/**
	 * The number of structural features of the '<em>Nodes Without Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODES_WITHOUT_JOIN_FEATURE_COUNT = NODES_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Nodes Without Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODES_WITHOUT_JOIN_OPERATION_COUNT = NODES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.ActionImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.Activity_diagramPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ID = NODES_WITHOUT_JOIN__ID;

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
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.DecisionImpl <em>Decision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.DecisionImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.Activity_diagramPackageImpl#getDecision()
	 * @generated
	 */
	int DECISION = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__ID = NODES_WITHOUT_JOIN__ID;

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
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.SplitImpl <em>Split</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.SplitImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.Activity_diagramPackageImpl#getSplit()
	 * @generated
	 */
	int SPLIT = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT__ID = NODES_WITHOUT_JOIN__ID;

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
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.JoinImpl <em>Join</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.JoinImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.Activity_diagramPackageImpl#getJoin()
	 * @generated
	 */
	int JOIN = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__ID = NODES__ID;

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
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.EndImpl <em>End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.EndImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.Activity_diagramPackageImpl#getEnd()
	 * @generated
	 */
	int END = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__ID = NODES_WITHOUT_JOIN__ID;

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
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.ArrowAfterStartImpl <em>Arrow After Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.ArrowAfterStartImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.Activity_diagramPackageImpl#getArrowAfterStart()
	 * @generated
	 */
	int ARROW_AFTER_START = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW_AFTER_START__ID = CommonBasePackage.ID_BASE__ID;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW_AFTER_START__TARGET = CommonBasePackage.ID_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Arrow After Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW_AFTER_START_FEATURE_COUNT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Arrow After Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW_AFTER_START_OPERATION_COUNT = CommonBasePackage.ID_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.DecisionArrowImpl <em>Decision Arrow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.DecisionArrowImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.Activity_diagramPackageImpl#getDecisionArrow()
	 * @generated
	 */
	int DECISION_ARROW = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_ARROW__ID = CommonBasePackage.ID_BASE__ID;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_ARROW__CONDITION = CommonBasePackage.ID_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_ARROW__TARGET = CommonBasePackage.ID_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Decision Arrow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_ARROW_FEATURE_COUNT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Decision Arrow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_ARROW_OPERATION_COUNT = CommonBasePackage.ID_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.AfterActionArrowImpl <em>After Action Arrow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.AfterActionArrowImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.Activity_diagramPackageImpl#getAfterActionArrow()
	 * @generated
	 */
	int AFTER_ACTION_ARROW = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_ACTION_ARROW__ID = CommonBasePackage.ID_BASE__ID;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_ACTION_ARROW__TARGET = CommonBasePackage.ID_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>After Action Arrow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_ACTION_ARROW_FEATURE_COUNT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>After Action Arrow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_ACTION_ARROW_OPERATION_COUNT = CommonBasePackage.ID_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.SplitArrowImpl <em>Split Arrow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.SplitArrowImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.Activity_diagramPackageImpl#getSplitArrow()
	 * @generated
	 */
	int SPLIT_ARROW = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_ARROW__ID = CommonBasePackage.ID_BASE__ID;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_ARROW__TARGET = CommonBasePackage.ID_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Split Arrow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_ARROW_FEATURE_COUNT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Split Arrow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_ARROW_OPERATION_COUNT = CommonBasePackage.ID_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.JoinArrowImpl <em>Join Arrow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.JoinArrowImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.Activity_diagramPackageImpl#getJoinArrow()
	 * @generated
	 */
	int JOIN_ARROW = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_ARROW__ID = CommonBasePackage.ID_BASE__ID;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_ARROW__SOURCE = CommonBasePackage.ID_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_ARROW__TARGET = CommonBasePackage.ID_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Join Arrow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_ARROW_FEATURE_COUNT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Join Arrow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_ARROW_OPERATION_COUNT = CommonBasePackage.ID_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.ArrowAfterJoinImpl <em>Arrow After Join</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.ArrowAfterJoinImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.Activity_diagramPackageImpl#getArrowAfterJoin()
	 * @generated
	 */
	int ARROW_AFTER_JOIN = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW_AFTER_JOIN__ID = CommonBasePackage.ID_BASE__ID;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW_AFTER_JOIN__TARGET = CommonBasePackage.ID_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Arrow After Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW_AFTER_JOIN_FEATURE_COUNT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Arrow After Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW_AFTER_JOIN_OPERATION_COUNT = CommonBasePackage.ID_BASE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.ActivityDiagram <em>Activity Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Diagram</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.ActivityDiagram
	 * @generated
	 */
	EClass getActivityDiagram();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.ActivityDiagram#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.ActivityDiagram#getStart()
	 * @see #getActivityDiagram()
	 * @generated
	 */
	EReference getActivityDiagram_Start();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.ActivityDiagram#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.ActivityDiagram#getAction()
	 * @see #getActivityDiagram()
	 * @generated
	 */
	EReference getActivityDiagram_Action();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.ActivityDiagram#getDecision <em>Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Decision</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.ActivityDiagram#getDecision()
	 * @see #getActivityDiagram()
	 * @generated
	 */
	EReference getActivityDiagram_Decision();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.ActivityDiagram#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>End</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.ActivityDiagram#getEnd()
	 * @see #getActivityDiagram()
	 * @generated
	 */
	EReference getActivityDiagram_End();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.ActivityDiagram#getSplit <em>Split</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Split</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.ActivityDiagram#getSplit()
	 * @see #getActivityDiagram()
	 * @generated
	 */
	EReference getActivityDiagram_Split();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.ActivityDiagram#getJoin <em>Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Join</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.ActivityDiagram#getJoin()
	 * @see #getActivityDiagram()
	 * @generated
	 */
	EReference getActivityDiagram_Join();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.ActivityDiagram#getStartArrow <em>Start Arrow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start Arrow</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.ActivityDiagram#getStartArrow()
	 * @see #getActivityDiagram()
	 * @generated
	 */
	EReference getActivityDiagram_StartArrow();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.ActivityDiagram#getAfterActionArrow <em>After Action Arrow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>After Action Arrow</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.ActivityDiagram#getAfterActionArrow()
	 * @see #getActivityDiagram()
	 * @generated
	 */
	EReference getActivityDiagram_AfterActionArrow();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.ActivityDiagram#getDecisionArrow <em>Decision Arrow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Decision Arrow</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.ActivityDiagram#getDecisionArrow()
	 * @see #getActivityDiagram()
	 * @generated
	 */
	EReference getActivityDiagram_DecisionArrow();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.ActivityDiagram#getSplitArrow <em>Split Arrow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Split Arrow</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.ActivityDiagram#getSplitArrow()
	 * @see #getActivityDiagram()
	 * @generated
	 */
	EReference getActivityDiagram_SplitArrow();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.ActivityDiagram#getJoinArrow <em>Join Arrow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Join Arrow</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.ActivityDiagram#getJoinArrow()
	 * @see #getActivityDiagram()
	 * @generated
	 */
	EReference getActivityDiagram_JoinArrow();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.ActivityDiagram#getArrowAfterJoin <em>Arrow After Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arrow After Join</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.ActivityDiagram#getArrowAfterJoin()
	 * @see #getActivityDiagram()
	 * @generated
	 */
	EReference getActivityDiagram_ArrowAfterJoin();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.Start <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.Start
	 * @generated
	 */
	EClass getStart();

	/**
	 * Returns the meta object for the reference '{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.Start#getOutgoingFromStart <em>Outgoing From Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Outgoing From Start</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.Start#getOutgoingFromStart()
	 * @see #getStart()
	 * @generated
	 */
	EReference getStart_OutgoingFromStart();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.Action#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.Action#getAction()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Action();

	/**
	 * Returns the meta object for the reference '{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.Action#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Outgoing</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.Action#getOutgoing()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Outgoing();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.Decision <em>Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.Decision
	 * @generated
	 */
	EClass getDecision();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.Decision#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.Decision#getOutgoing()
	 * @see #getDecision()
	 * @generated
	 */
	EReference getDecision_Outgoing();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.Split <em>Split</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Split</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.Split
	 * @generated
	 */
	EClass getSplit();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.Split#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.Split#getOutgoing()
	 * @see #getSplit()
	 * @generated
	 */
	EReference getSplit_Outgoing();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.Join <em>Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.Join
	 * @generated
	 */
	EClass getJoin();

	/**
	 * Returns the meta object for the reference '{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.Join#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Outgoing</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.Join#getOutgoing()
	 * @see #getJoin()
	 * @generated
	 */
	EReference getJoin_Outgoing();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.End <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.End
	 * @generated
	 */
	EClass getEnd();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.NodesWithoutJoin <em>Nodes Without Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nodes Without Join</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.NodesWithoutJoin
	 * @generated
	 */
	EClass getNodesWithoutJoin();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.ArrowAfterStart <em>Arrow After Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arrow After Start</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.ArrowAfterStart
	 * @generated
	 */
	EClass getArrowAfterStart();

	/**
	 * Returns the meta object for the reference '{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.ArrowAfterStart#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.ArrowAfterStart#getTarget()
	 * @see #getArrowAfterStart()
	 * @generated
	 */
	EReference getArrowAfterStart_Target();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.DecisionArrow <em>Decision Arrow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision Arrow</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.DecisionArrow
	 * @generated
	 */
	EClass getDecisionArrow();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.DecisionArrow#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.DecisionArrow#getCondition()
	 * @see #getDecisionArrow()
	 * @generated
	 */
	EAttribute getDecisionArrow_Condition();

	/**
	 * Returns the meta object for the reference '{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.DecisionArrow#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.DecisionArrow#getTarget()
	 * @see #getDecisionArrow()
	 * @generated
	 */
	EReference getDecisionArrow_Target();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.AfterActionArrow <em>After Action Arrow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>After Action Arrow</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.AfterActionArrow
	 * @generated
	 */
	EClass getAfterActionArrow();

	/**
	 * Returns the meta object for the reference '{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.AfterActionArrow#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.AfterActionArrow#getTarget()
	 * @see #getAfterActionArrow()
	 * @generated
	 */
	EReference getAfterActionArrow_Target();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.SplitArrow <em>Split Arrow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Split Arrow</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.SplitArrow
	 * @generated
	 */
	EClass getSplitArrow();

	/**
	 * Returns the meta object for the reference '{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.SplitArrow#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.SplitArrow#getTarget()
	 * @see #getSplitArrow()
	 * @generated
	 */
	EReference getSplitArrow_Target();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.JoinArrow <em>Join Arrow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join Arrow</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.JoinArrow
	 * @generated
	 */
	EClass getJoinArrow();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.JoinArrow#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.JoinArrow#getSource()
	 * @see #getJoinArrow()
	 * @generated
	 */
	EReference getJoinArrow_Source();

	/**
	 * Returns the meta object for the reference '{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.JoinArrow#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.JoinArrow#getTarget()
	 * @see #getJoinArrow()
	 * @generated
	 */
	EReference getJoinArrow_Target();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.Nodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nodes</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.Nodes
	 * @generated
	 */
	EClass getNodes();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.ArrowAfterJoin <em>Arrow After Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arrow After Join</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.ArrowAfterJoin
	 * @generated
	 */
	EClass getArrowAfterJoin();

	/**
	 * Returns the meta object for the reference '{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.ArrowAfterJoin#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.ArrowAfterJoin#getTarget()
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
	Activity_diagramFactory getActivity_diagramFactory();

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
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.ActivityDiagramImpl <em>Activity Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.ActivityDiagramImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.Activity_diagramPackageImpl#getActivityDiagram()
		 * @generated
		 */
		EClass ACTIVITY_DIAGRAM = eINSTANCE.getActivityDiagram();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_DIAGRAM__START = eINSTANCE.getActivityDiagram_Start();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_DIAGRAM__ACTION = eINSTANCE.getActivityDiagram_Action();

		/**
		 * The meta object literal for the '<em><b>Decision</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_DIAGRAM__DECISION = eINSTANCE.getActivityDiagram_Decision();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_DIAGRAM__END = eINSTANCE.getActivityDiagram_End();

		/**
		 * The meta object literal for the '<em><b>Split</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_DIAGRAM__SPLIT = eINSTANCE.getActivityDiagram_Split();

		/**
		 * The meta object literal for the '<em><b>Join</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_DIAGRAM__JOIN = eINSTANCE.getActivityDiagram_Join();

		/**
		 * The meta object literal for the '<em><b>Start Arrow</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_DIAGRAM__START_ARROW = eINSTANCE.getActivityDiagram_StartArrow();

		/**
		 * The meta object literal for the '<em><b>After Action Arrow</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_DIAGRAM__AFTER_ACTION_ARROW = eINSTANCE.getActivityDiagram_AfterActionArrow();

		/**
		 * The meta object literal for the '<em><b>Decision Arrow</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_DIAGRAM__DECISION_ARROW = eINSTANCE.getActivityDiagram_DecisionArrow();

		/**
		 * The meta object literal for the '<em><b>Split Arrow</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_DIAGRAM__SPLIT_ARROW = eINSTANCE.getActivityDiagram_SplitArrow();

		/**
		 * The meta object literal for the '<em><b>Join Arrow</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_DIAGRAM__JOIN_ARROW = eINSTANCE.getActivityDiagram_JoinArrow();

		/**
		 * The meta object literal for the '<em><b>Arrow After Join</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_DIAGRAM__ARROW_AFTER_JOIN = eINSTANCE.getActivityDiagram_ArrowAfterJoin();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.StartImpl <em>Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.StartImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.Activity_diagramPackageImpl#getStart()
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
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.ActionImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.Activity_diagramPackageImpl#getAction()
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
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.DecisionImpl <em>Decision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.DecisionImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.Activity_diagramPackageImpl#getDecision()
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
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.SplitImpl <em>Split</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.SplitImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.Activity_diagramPackageImpl#getSplit()
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
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.JoinImpl <em>Join</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.JoinImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.Activity_diagramPackageImpl#getJoin()
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
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.EndImpl <em>End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.EndImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.Activity_diagramPackageImpl#getEnd()
		 * @generated
		 */
		EClass END = eINSTANCE.getEnd();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.NodesWithoutJoinImpl <em>Nodes Without Join</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.NodesWithoutJoinImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.Activity_diagramPackageImpl#getNodesWithoutJoin()
		 * @generated
		 */
		EClass NODES_WITHOUT_JOIN = eINSTANCE.getNodesWithoutJoin();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.ArrowAfterStartImpl <em>Arrow After Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.ArrowAfterStartImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.Activity_diagramPackageImpl#getArrowAfterStart()
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
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.DecisionArrowImpl <em>Decision Arrow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.DecisionArrowImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.Activity_diagramPackageImpl#getDecisionArrow()
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
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.AfterActionArrowImpl <em>After Action Arrow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.AfterActionArrowImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.Activity_diagramPackageImpl#getAfterActionArrow()
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
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.SplitArrowImpl <em>Split Arrow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.SplitArrowImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.Activity_diagramPackageImpl#getSplitArrow()
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
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.JoinArrowImpl <em>Join Arrow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.JoinArrowImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.Activity_diagramPackageImpl#getJoinArrow()
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
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.NodesImpl <em>Nodes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.NodesImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.Activity_diagramPackageImpl#getNodes()
		 * @generated
		 */
		EClass NODES = eINSTANCE.getNodes();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.ArrowAfterJoinImpl <em>Arrow After Join</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.ArrowAfterJoinImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.Activity_diagramPackageImpl#getArrowAfterJoin()
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

} //Activity_diagramPackage
