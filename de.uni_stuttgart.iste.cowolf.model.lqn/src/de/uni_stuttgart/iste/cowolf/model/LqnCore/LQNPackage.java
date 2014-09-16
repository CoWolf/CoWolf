/**
 */
package de.uni_stuttgart.iste.cowolf.model.LqnCore;

import de.uni_stuttgart.iste.cowolf.model.commonBase.CommonBasePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNFactory
 * @model kind="package"
 *        extendedMetaData="qualified='false'"
 * @generated
 */
public interface LQNPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "LqnCore";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://LQN/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "LQN";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LQNPackage eINSTANCE = de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ActivityDefBaseImpl <em>Activity Def Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ActivityDefBaseImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getActivityDefBase()
	 * @generated
	 */
	int ACTIVITY_DEF_BASE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DEF_BASE__ID = CommonBasePackage.ID_BASE__ID;

	/**
	 * The feature id for the '<em><b>Result Join Delay</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DEF_BASE__RESULT_JOIN_DELAY = CommonBasePackage.ID_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Result Forwarding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DEF_BASE__RESULT_FORWARDING = CommonBasePackage.ID_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Service Time Distribution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DEF_BASE__SERVICE_TIME_DISTRIBUTION = CommonBasePackage.ID_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Result Activity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DEF_BASE__RESULT_ACTIVITY = CommonBasePackage.ID_BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Call Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DEF_BASE__CALL_ORDER = CommonBasePackage.ID_BASE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Host Demand Cvsq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DEF_BASE__HOST_DEMAND_CVSQ = CommonBasePackage.ID_BASE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Host Demand Mean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DEF_BASE__HOST_DEMAND_MEAN = CommonBasePackage.ID_BASE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Max Service Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DEF_BASE__MAX_SERVICE_TIME = CommonBasePackage.ID_BASE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DEF_BASE__NAME = CommonBasePackage.ID_BASE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Think Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DEF_BASE__THINK_TIME = CommonBasePackage.ID_BASE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Activity Def Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DEF_BASE_FEATURE_COUNT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Activity Def Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DEF_BASE_OPERATION_COUNT = CommonBasePackage.ID_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ActivityDefTypeImpl <em>Activity Def Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ActivityDefTypeImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getActivityDefType()
	 * @generated
	 */
	int ACTIVITY_DEF_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DEF_TYPE__ID = ACTIVITY_DEF_BASE__ID;

	/**
	 * The feature id for the '<em><b>Result Join Delay</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DEF_TYPE__RESULT_JOIN_DELAY = ACTIVITY_DEF_BASE__RESULT_JOIN_DELAY;

	/**
	 * The feature id for the '<em><b>Result Forwarding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DEF_TYPE__RESULT_FORWARDING = ACTIVITY_DEF_BASE__RESULT_FORWARDING;

	/**
	 * The feature id for the '<em><b>Service Time Distribution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DEF_TYPE__SERVICE_TIME_DISTRIBUTION = ACTIVITY_DEF_BASE__SERVICE_TIME_DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Result Activity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DEF_TYPE__RESULT_ACTIVITY = ACTIVITY_DEF_BASE__RESULT_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Call Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DEF_TYPE__CALL_ORDER = ACTIVITY_DEF_BASE__CALL_ORDER;

	/**
	 * The feature id for the '<em><b>Host Demand Cvsq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DEF_TYPE__HOST_DEMAND_CVSQ = ACTIVITY_DEF_BASE__HOST_DEMAND_CVSQ;

	/**
	 * The feature id for the '<em><b>Host Demand Mean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DEF_TYPE__HOST_DEMAND_MEAN = ACTIVITY_DEF_BASE__HOST_DEMAND_MEAN;

	/**
	 * The feature id for the '<em><b>Max Service Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DEF_TYPE__MAX_SERVICE_TIME = ACTIVITY_DEF_BASE__MAX_SERVICE_TIME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DEF_TYPE__NAME = ACTIVITY_DEF_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Think Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DEF_TYPE__THINK_TIME = ACTIVITY_DEF_BASE__THINK_TIME;

	/**
	 * The feature id for the '<em><b>Call List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DEF_TYPE__CALL_LIST = ACTIVITY_DEF_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DEF_TYPE__GROUP = ACTIVITY_DEF_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Synch Call</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DEF_TYPE__SYNCH_CALL = ACTIVITY_DEF_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Asynch Call</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DEF_TYPE__ASYNCH_CALL = ACTIVITY_DEF_BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Bound To Entry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DEF_TYPE__BOUND_TO_ENTRY = ACTIVITY_DEF_BASE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Activity Def Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DEF_TYPE_FEATURE_COUNT = ACTIVITY_DEF_BASE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Activity Def Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DEF_TYPE_OPERATION_COUNT = ACTIVITY_DEF_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ActivityGraphBaseImpl <em>Activity Graph Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ActivityGraphBaseImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getActivityGraphBase()
	 * @generated
	 */
	int ACTIVITY_GRAPH_BASE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_GRAPH_BASE__ID = CommonBasePackage.ID_BASE__ID;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_GRAPH_BASE__ACTIVITY = CommonBasePackage.ID_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Precedence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_GRAPH_BASE__PRECEDENCE = CommonBasePackage.ID_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Activity Graph Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_GRAPH_BASE_FEATURE_COUNT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Activity Graph Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_GRAPH_BASE_OPERATION_COUNT = CommonBasePackage.ID_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ActivityListTypeImpl <em>Activity List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ActivityListTypeImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getActivityListType()
	 * @generated
	 */
	int ACTIVITY_LIST_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_LIST_TYPE__ID = CommonBasePackage.ID_BASE__ID;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_LIST_TYPE__ACTIVITY = CommonBasePackage.ID_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activity List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_LIST_TYPE_FEATURE_COUNT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Activity List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_LIST_TYPE_OPERATION_COUNT = CommonBasePackage.ID_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ActivityLoopListTypeImpl <em>Activity Loop List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ActivityLoopListTypeImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getActivityLoopListType()
	 * @generated
	 */
	int ACTIVITY_LOOP_LIST_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_LOOP_LIST_TYPE__ID = CommonBasePackage.ID_BASE__ID;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_LOOP_LIST_TYPE__ACTIVITY = CommonBasePackage.ID_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_LOOP_LIST_TYPE__END = CommonBasePackage.ID_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Activity Loop List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_LOOP_LIST_TYPE_FEATURE_COUNT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Activity Loop List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_LOOP_LIST_TYPE_OPERATION_COUNT = CommonBasePackage.ID_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ActivityTypeImpl <em>Activity Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ActivityTypeImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getActivityType()
	 * @generated
	 */
	int ACTIVITY_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_TYPE__ID = CommonBasePackage.ID_BASE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_TYPE__NAME = CommonBasePackage.ID_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_TYPE_FEATURE_COUNT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Activity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_TYPE_OPERATION_COUNT = CommonBasePackage.ID_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ActivityLoopTypeImpl <em>Activity Loop Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ActivityLoopTypeImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getActivityLoopType()
	 * @generated
	 */
	int ACTIVITY_LOOP_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_LOOP_TYPE__ID = ACTIVITY_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_LOOP_TYPE__NAME = ACTIVITY_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_LOOP_TYPE__COUNT = ACTIVITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activity Loop Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_LOOP_TYPE_FEATURE_COUNT = ACTIVITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Activity Loop Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_LOOP_TYPE_OPERATION_COUNT = ACTIVITY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.MakingCallTypeImpl <em>Making Call Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.MakingCallTypeImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getMakingCallType()
	 * @generated
	 */
	int MAKING_CALL_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKING_CALL_TYPE__ID = CommonBasePackage.ID_BASE__ID;

	/**
	 * The feature id for the '<em><b>Result Call</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKING_CALL_TYPE__RESULT_CALL = CommonBasePackage.ID_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKING_CALL_TYPE__DEST = CommonBasePackage.ID_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fanin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKING_CALL_TYPE__FANIN = CommonBasePackage.ID_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fanout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKING_CALL_TYPE__FANOUT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Making Call Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKING_CALL_TYPE_FEATURE_COUNT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Making Call Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKING_CALL_TYPE_OPERATION_COUNT = CommonBasePackage.ID_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ActivityMakingCallTypeImpl <em>Activity Making Call Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ActivityMakingCallTypeImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getActivityMakingCallType()
	 * @generated
	 */
	int ACTIVITY_MAKING_CALL_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_MAKING_CALL_TYPE__ID = MAKING_CALL_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Result Call</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_MAKING_CALL_TYPE__RESULT_CALL = MAKING_CALL_TYPE__RESULT_CALL;

	/**
	 * The feature id for the '<em><b>Dest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_MAKING_CALL_TYPE__DEST = MAKING_CALL_TYPE__DEST;

	/**
	 * The feature id for the '<em><b>Fanin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_MAKING_CALL_TYPE__FANIN = MAKING_CALL_TYPE__FANIN;

	/**
	 * The feature id for the '<em><b>Fanout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_MAKING_CALL_TYPE__FANOUT = MAKING_CALL_TYPE__FANOUT;

	/**
	 * The feature id for the '<em><b>Calls Mean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_MAKING_CALL_TYPE__CALLS_MEAN = MAKING_CALL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activity Making Call Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_MAKING_CALL_TYPE_FEATURE_COUNT = MAKING_CALL_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Activity Making Call Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_MAKING_CALL_TYPE_OPERATION_COUNT = MAKING_CALL_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ActivityOrTypeImpl <em>Activity Or Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ActivityOrTypeImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getActivityOrType()
	 * @generated
	 */
	int ACTIVITY_OR_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OR_TYPE__ID = ACTIVITY_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OR_TYPE__NAME = ACTIVITY_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Prob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OR_TYPE__PROB = ACTIVITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activity Or Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OR_TYPE_FEATURE_COUNT = ACTIVITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Activity Or Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OR_TYPE_OPERATION_COUNT = ACTIVITY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ActivityPhasesTypeImpl <em>Activity Phases Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ActivityPhasesTypeImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getActivityPhasesType()
	 * @generated
	 */
	int ACTIVITY_PHASES_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PHASES_TYPE__ID = ACTIVITY_DEF_BASE__ID;

	/**
	 * The feature id for the '<em><b>Result Join Delay</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PHASES_TYPE__RESULT_JOIN_DELAY = ACTIVITY_DEF_BASE__RESULT_JOIN_DELAY;

	/**
	 * The feature id for the '<em><b>Result Forwarding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PHASES_TYPE__RESULT_FORWARDING = ACTIVITY_DEF_BASE__RESULT_FORWARDING;

	/**
	 * The feature id for the '<em><b>Service Time Distribution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PHASES_TYPE__SERVICE_TIME_DISTRIBUTION = ACTIVITY_DEF_BASE__SERVICE_TIME_DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Result Activity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PHASES_TYPE__RESULT_ACTIVITY = ACTIVITY_DEF_BASE__RESULT_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Call Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PHASES_TYPE__CALL_ORDER = ACTIVITY_DEF_BASE__CALL_ORDER;

	/**
	 * The feature id for the '<em><b>Host Demand Cvsq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PHASES_TYPE__HOST_DEMAND_CVSQ = ACTIVITY_DEF_BASE__HOST_DEMAND_CVSQ;

	/**
	 * The feature id for the '<em><b>Host Demand Mean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PHASES_TYPE__HOST_DEMAND_MEAN = ACTIVITY_DEF_BASE__HOST_DEMAND_MEAN;

	/**
	 * The feature id for the '<em><b>Max Service Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PHASES_TYPE__MAX_SERVICE_TIME = ACTIVITY_DEF_BASE__MAX_SERVICE_TIME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PHASES_TYPE__NAME = ACTIVITY_DEF_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Think Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PHASES_TYPE__THINK_TIME = ACTIVITY_DEF_BASE__THINK_TIME;

	/**
	 * The feature id for the '<em><b>Call List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PHASES_TYPE__CALL_LIST = ACTIVITY_DEF_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PHASES_TYPE__GROUP = ACTIVITY_DEF_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Synch Call</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PHASES_TYPE__SYNCH_CALL = ACTIVITY_DEF_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Asynch Call</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PHASES_TYPE__ASYNCH_CALL = ACTIVITY_DEF_BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PHASES_TYPE__PHASE = ACTIVITY_DEF_BASE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Activity Phases Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PHASES_TYPE_FEATURE_COUNT = ACTIVITY_DEF_BASE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Activity Phases Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PHASES_TYPE_OPERATION_COUNT = ACTIVITY_DEF_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.AndJoinListTypeImpl <em>And Join List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.AndJoinListTypeImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getAndJoinListType()
	 * @generated
	 */
	int AND_JOIN_LIST_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_JOIN_LIST_TYPE__ID = CommonBasePackage.ID_BASE__ID;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_JOIN_LIST_TYPE__ACTIVITY = CommonBasePackage.ID_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Quorum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_JOIN_LIST_TYPE__QUORUM = CommonBasePackage.ID_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>And Join List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_JOIN_LIST_TYPE_FEATURE_COUNT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>And Join List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_JOIN_LIST_TYPE_OPERATION_COUNT = CommonBasePackage.ID_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.AsynchCallTypeImpl <em>Asynch Call Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.AsynchCallTypeImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getAsynchCallType()
	 * @generated
	 */
	int ASYNCH_CALL_TYPE = 55;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.BindTypeImpl <em>Bind Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.BindTypeImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getBindType()
	 * @generated
	 */
	int BIND_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIND_TYPE__ID = CommonBasePackage.ID_BASE__ID;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIND_TYPE__PARAMETER = CommonBasePackage.ID_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Processor Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIND_TYPE__PROCESSOR_BINDING = CommonBasePackage.ID_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Port Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIND_TYPE__PORT_BINDING = CommonBasePackage.ID_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Bind Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIND_TYPE_FEATURE_COUNT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Bind Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIND_TYPE_OPERATION_COUNT = CommonBasePackage.ID_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.CallListTypeImpl <em>Call List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.CallListTypeImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getCallListType()
	 * @generated
	 */
	int CALL_LIST_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_LIST_TYPE__ID = CommonBasePackage.ID_BASE__ID;

	/**
	 * The feature id for the '<em><b>Synch Call</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_LIST_TYPE__SYNCH_CALL = CommonBasePackage.ID_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Asynch Call</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_LIST_TYPE__ASYNCH_CALL = CommonBasePackage.ID_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Call List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_LIST_TYPE_FEATURE_COUNT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Call List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_LIST_TYPE_OPERATION_COUNT = CommonBasePackage.ID_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNImpl <em>LQN</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getLQN()
	 * @generated
	 */
	int LQN = 13;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LQN__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LQN__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LQN__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Lqn Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LQN__LQN_CORE = 3;

	/**
	 * The feature id for the '<em><b>Lqn Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LQN__LQN_MODEL = 4;

	/**
	 * The number of structural features of the '<em>LQN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LQN_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>LQN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LQN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.EntryActivityDefTypeImpl <em>Entry Activity Def Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.EntryActivityDefTypeImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getEntryActivityDefType()
	 * @generated
	 */
	int ENTRY_ACTIVITY_DEF_TYPE = 16;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.EntryActivityGraphImpl <em>Entry Activity Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.EntryActivityGraphImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getEntryActivityGraph()
	 * @generated
	 */
	int ENTRY_ACTIVITY_GRAPH = 17;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.EntryMakingCallTypeImpl <em>Entry Making Call Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.EntryMakingCallTypeImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getEntryMakingCallType()
	 * @generated
	 */
	int ENTRY_MAKING_CALL_TYPE = 18;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.EntryTypeImpl <em>Entry Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.EntryTypeImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getEntryType()
	 * @generated
	 */
	int ENTRY_TYPE = 19;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.FirstPlotTypeImpl <em>First Plot Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.FirstPlotTypeImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getFirstPlotType()
	 * @generated
	 */
	int FIRST_PLOT_TYPE = 20;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.HistogramBinTypeImpl <em>Histogram Bin Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.HistogramBinTypeImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getHistogramBinType()
	 * @generated
	 */
	int HISTOGRAM_BIN_TYPE = 21;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.InPortTypeImpl <em>In Port Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.InPortTypeImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getInPortType()
	 * @generated
	 */
	int IN_PORT_TYPE = 22;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.InterfaceTypeImpl <em>Interface Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.InterfaceTypeImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getInterfaceType()
	 * @generated
	 */
	int INTERFACE_TYPE = 23;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LqnCoreTypeImpl <em>Lqn Core Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LqnCoreTypeImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getLqnCoreType()
	 * @generated
	 */
	int LQN_CORE_TYPE = 14;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LqnModelTypeImpl <em>Lqn Model Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LqnModelTypeImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getLqnModelType()
	 * @generated
	 */
	int LQN_MODEL_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LQN_CORE_TYPE__ID = CommonBasePackage.ID_BASE__ID;

	/**
	 * The feature id for the '<em><b>Processor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LQN_CORE_TYPE__PROCESSOR = CommonBasePackage.ID_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Slot</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LQN_CORE_TYPE__SLOT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Lqn Core Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LQN_CORE_TYPE_FEATURE_COUNT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Lqn Core Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LQN_CORE_TYPE_OPERATION_COUNT = CommonBasePackage.ID_BASE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LQN_MODEL_TYPE__ID = CommonBasePackage.ID_BASE__ID;

	/**
	 * The feature id for the '<em><b>Run Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LQN_MODEL_TYPE__RUN_CONTROL = CommonBasePackage.ID_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Plot Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LQN_MODEL_TYPE__PLOT_CONTROL = CommonBasePackage.ID_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Solver Params</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LQN_MODEL_TYPE__SOLVER_PARAMS = CommonBasePackage.ID_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Processor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LQN_MODEL_TYPE__PROCESSOR = CommonBasePackage.ID_BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Slot</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LQN_MODEL_TYPE__SLOT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LQN_MODEL_TYPE__DESCRIPTION = CommonBasePackage.ID_BASE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Lqncore Schema Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LQN_MODEL_TYPE__LQNCORE_SCHEMA_VERSION = CommonBasePackage.ID_BASE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Lqn Schema Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LQN_MODEL_TYPE__LQN_SCHEMA_VERSION = CommonBasePackage.ID_BASE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LQN_MODEL_TYPE__NAME = CommonBasePackage.ID_BASE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Xml Debug</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LQN_MODEL_TYPE__XML_DEBUG = CommonBasePackage.ID_BASE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Lqn Model Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LQN_MODEL_TYPE_FEATURE_COUNT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Lqn Model Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LQN_MODEL_TYPE_OPERATION_COUNT = CommonBasePackage.ID_BASE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_ACTIVITY_DEF_TYPE__ID = ACTIVITY_DEF_BASE__ID;

	/**
	 * The feature id for the '<em><b>Result Join Delay</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_ACTIVITY_DEF_TYPE__RESULT_JOIN_DELAY = ACTIVITY_DEF_BASE__RESULT_JOIN_DELAY;

	/**
	 * The feature id for the '<em><b>Result Forwarding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_ACTIVITY_DEF_TYPE__RESULT_FORWARDING = ACTIVITY_DEF_BASE__RESULT_FORWARDING;

	/**
	 * The feature id for the '<em><b>Service Time Distribution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_ACTIVITY_DEF_TYPE__SERVICE_TIME_DISTRIBUTION = ACTIVITY_DEF_BASE__SERVICE_TIME_DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Result Activity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_ACTIVITY_DEF_TYPE__RESULT_ACTIVITY = ACTIVITY_DEF_BASE__RESULT_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Call Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_ACTIVITY_DEF_TYPE__CALL_ORDER = ACTIVITY_DEF_BASE__CALL_ORDER;

	/**
	 * The feature id for the '<em><b>Host Demand Cvsq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_ACTIVITY_DEF_TYPE__HOST_DEMAND_CVSQ = ACTIVITY_DEF_BASE__HOST_DEMAND_CVSQ;

	/**
	 * The feature id for the '<em><b>Host Demand Mean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_ACTIVITY_DEF_TYPE__HOST_DEMAND_MEAN = ACTIVITY_DEF_BASE__HOST_DEMAND_MEAN;

	/**
	 * The feature id for the '<em><b>Max Service Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_ACTIVITY_DEF_TYPE__MAX_SERVICE_TIME = ACTIVITY_DEF_BASE__MAX_SERVICE_TIME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_ACTIVITY_DEF_TYPE__NAME = ACTIVITY_DEF_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Think Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_ACTIVITY_DEF_TYPE__THINK_TIME = ACTIVITY_DEF_BASE__THINK_TIME;

	/**
	 * The feature id for the '<em><b>Call List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_ACTIVITY_DEF_TYPE__CALL_LIST = ACTIVITY_DEF_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_ACTIVITY_DEF_TYPE__GROUP = ACTIVITY_DEF_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Synch Call</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_ACTIVITY_DEF_TYPE__SYNCH_CALL = ACTIVITY_DEF_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Asynch Call</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_ACTIVITY_DEF_TYPE__ASYNCH_CALL = ACTIVITY_DEF_BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>First Activity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_ACTIVITY_DEF_TYPE__FIRST_ACTIVITY = ACTIVITY_DEF_BASE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Entry Activity Def Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_ACTIVITY_DEF_TYPE_FEATURE_COUNT = ACTIVITY_DEF_BASE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Entry Activity Def Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_ACTIVITY_DEF_TYPE_OPERATION_COUNT = ACTIVITY_DEF_BASE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_ACTIVITY_GRAPH__ID = ACTIVITY_GRAPH_BASE__ID;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_ACTIVITY_GRAPH__ACTIVITY = ACTIVITY_GRAPH_BASE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Precedence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_ACTIVITY_GRAPH__PRECEDENCE = ACTIVITY_GRAPH_BASE__PRECEDENCE;

	/**
	 * The feature id for the '<em><b>Reply Activity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_ACTIVITY_GRAPH__REPLY_ACTIVITY = ACTIVITY_GRAPH_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entry Activity Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_ACTIVITY_GRAPH_FEATURE_COUNT = ACTIVITY_GRAPH_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Entry Activity Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_ACTIVITY_GRAPH_OPERATION_COUNT = ACTIVITY_GRAPH_BASE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_MAKING_CALL_TYPE__ID = MAKING_CALL_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Result Call</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_MAKING_CALL_TYPE__RESULT_CALL = MAKING_CALL_TYPE__RESULT_CALL;

	/**
	 * The feature id for the '<em><b>Dest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_MAKING_CALL_TYPE__DEST = MAKING_CALL_TYPE__DEST;

	/**
	 * The feature id for the '<em><b>Fanin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_MAKING_CALL_TYPE__FANIN = MAKING_CALL_TYPE__FANIN;

	/**
	 * The feature id for the '<em><b>Fanout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_MAKING_CALL_TYPE__FANOUT = MAKING_CALL_TYPE__FANOUT;

	/**
	 * The feature id for the '<em><b>Prob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_MAKING_CALL_TYPE__PROB = MAKING_CALL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entry Making Call Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_MAKING_CALL_TYPE_FEATURE_COUNT = MAKING_CALL_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Entry Making Call Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_MAKING_CALL_TYPE_OPERATION_COUNT = MAKING_CALL_TYPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_TYPE__ID = CommonBasePackage.ID_BASE__ID;

	/**
	 * The feature id for the '<em><b>Result Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_TYPE__RESULT_ENTRY = CommonBasePackage.ID_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Service Time Distribution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_TYPE__SERVICE_TIME_DISTRIBUTION = CommonBasePackage.ID_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Forwarding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_TYPE__FORWARDING = CommonBasePackage.ID_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Entry Activity Graph</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_TYPE__ENTRY_ACTIVITY_GRAPH = CommonBasePackage.ID_BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Entry Phase Activities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_TYPE__ENTRY_PHASE_ACTIVITIES = CommonBasePackage.ID_BASE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_TYPE__NAME = CommonBasePackage.ID_BASE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Open Arrival Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_TYPE__OPEN_ARRIVAL_RATE = CommonBasePackage.ID_BASE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_TYPE__PRIORITY = CommonBasePackage.ID_BASE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Semaphore</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_TYPE__SEMAPHORE = CommonBasePackage.ID_BASE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_TYPE__TYPE = CommonBasePackage.ID_BASE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Entry Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_TYPE_FEATURE_COUNT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Entry Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_TYPE_OPERATION_COUNT = CommonBasePackage.ID_BASE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_PLOT_TYPE__ID = CommonBasePackage.ID_BASE__ID;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_PLOT_TYPE__VARIABLE = CommonBasePackage.ID_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>First Plot Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_PLOT_TYPE_FEATURE_COUNT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>First Plot Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_PLOT_TYPE_OPERATION_COUNT = CommonBasePackage.ID_BASE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTOGRAM_BIN_TYPE__ID = CommonBasePackage.ID_BASE__ID;

	/**
	 * The feature id for the '<em><b>Begin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTOGRAM_BIN_TYPE__BEGIN = CommonBasePackage.ID_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Conf95</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTOGRAM_BIN_TYPE__CONF95 = CommonBasePackage.ID_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Conf99</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTOGRAM_BIN_TYPE__CONF99 = CommonBasePackage.ID_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTOGRAM_BIN_TYPE__END = CommonBasePackage.ID_BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Prob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTOGRAM_BIN_TYPE__PROB = CommonBasePackage.ID_BASE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Histogram Bin Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTOGRAM_BIN_TYPE_FEATURE_COUNT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Histogram Bin Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTOGRAM_BIN_TYPE_OPERATION_COUNT = CommonBasePackage.ID_BASE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT_TYPE__ID = CommonBasePackage.ID_BASE__ID;

	/**
	 * The feature id for the '<em><b>Connect From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT_TYPE__CONNECT_FROM = CommonBasePackage.ID_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT_TYPE__DESCRIPTION = CommonBasePackage.ID_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT_TYPE__NAME = CommonBasePackage.ID_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>In Port Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT_TYPE_FEATURE_COUNT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>In Port Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT_TYPE_OPERATION_COUNT = CommonBasePackage.ID_BASE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TYPE__ID = CommonBasePackage.ID_BASE__ID;

	/**
	 * The feature id for the '<em><b>In Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TYPE__IN_PORT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Out Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TYPE__OUT_PORT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Interface Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TYPE_FEATURE_COUNT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Interface Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TYPE_OPERATION_COUNT = CommonBasePackage.ID_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.OrListTypeImpl <em>Or List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.OrListTypeImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getOrListType()
	 * @generated
	 */
	int OR_LIST_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_LIST_TYPE__ID = CommonBasePackage.ID_BASE__ID;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_LIST_TYPE__ACTIVITY = CommonBasePackage.ID_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Or List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_LIST_TYPE_FEATURE_COUNT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Or List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_LIST_TYPE_OPERATION_COUNT = CommonBasePackage.ID_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.OutPortTypeImpl <em>Out Port Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.OutPortTypeImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getOutPortType()
	 * @generated
	 */
	int OUT_PORT_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT_TYPE__ID = CommonBasePackage.ID_BASE__ID;

	/**
	 * The feature id for the '<em><b>Connect To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT_TYPE__CONNECT_TO = CommonBasePackage.ID_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT_TYPE__DESCRIPTION = CommonBasePackage.ID_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT_TYPE__NAME = CommonBasePackage.ID_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Out Port Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT_TYPE_FEATURE_COUNT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Out Port Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT_TYPE_OPERATION_COUNT = CommonBasePackage.ID_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.OutputDistributionTypeImpl <em>Output Distribution Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.OutputDistributionTypeImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getOutputDistributionType()
	 * @generated
	 */
	int OUTPUT_DISTRIBUTION_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DISTRIBUTION_TYPE__ID = CommonBasePackage.ID_BASE__ID;

	/**
	 * The feature id for the '<em><b>Underflow Bin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DISTRIBUTION_TYPE__UNDERFLOW_BIN = CommonBasePackage.ID_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Histogram Bin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DISTRIBUTION_TYPE__HISTOGRAM_BIN = CommonBasePackage.ID_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Overflow Bin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DISTRIBUTION_TYPE__OVERFLOW_BIN = CommonBasePackage.ID_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bin Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DISTRIBUTION_TYPE__BIN_SIZE = CommonBasePackage.ID_BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Kurtosis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DISTRIBUTION_TYPE__KURTOSIS = CommonBasePackage.ID_BASE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DISTRIBUTION_TYPE__MAX = CommonBasePackage.ID_BASE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Mean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DISTRIBUTION_TYPE__MEAN = CommonBasePackage.ID_BASE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Mid Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DISTRIBUTION_TYPE__MID_POINT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DISTRIBUTION_TYPE__MIN = CommonBasePackage.ID_BASE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Number Bins</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DISTRIBUTION_TYPE__NUMBER_BINS = CommonBasePackage.ID_BASE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Skew</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DISTRIBUTION_TYPE__SKEW = CommonBasePackage.ID_BASE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Std Dev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DISTRIBUTION_TYPE__STD_DEV = CommonBasePackage.ID_BASE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>XSamples</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DISTRIBUTION_TYPE__XSAMPLES = CommonBasePackage.ID_BASE_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Output Distribution Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DISTRIBUTION_TYPE_FEATURE_COUNT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 13;

	/**
	 * The number of operations of the '<em>Output Distribution Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DISTRIBUTION_TYPE_OPERATION_COUNT = CommonBasePackage.ID_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.OutputEntryDistributionTypeImpl <em>Output Entry Distribution Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.OutputEntryDistributionTypeImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getOutputEntryDistributionType()
	 * @generated
	 */
	int OUTPUT_ENTRY_DISTRIBUTION_TYPE = 28;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ENTRY_DISTRIBUTION_TYPE__ID = OUTPUT_DISTRIBUTION_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Underflow Bin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ENTRY_DISTRIBUTION_TYPE__UNDERFLOW_BIN = OUTPUT_DISTRIBUTION_TYPE__UNDERFLOW_BIN;

	/**
	 * The feature id for the '<em><b>Histogram Bin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ENTRY_DISTRIBUTION_TYPE__HISTOGRAM_BIN = OUTPUT_DISTRIBUTION_TYPE__HISTOGRAM_BIN;

	/**
	 * The feature id for the '<em><b>Overflow Bin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ENTRY_DISTRIBUTION_TYPE__OVERFLOW_BIN = OUTPUT_DISTRIBUTION_TYPE__OVERFLOW_BIN;

	/**
	 * The feature id for the '<em><b>Bin Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ENTRY_DISTRIBUTION_TYPE__BIN_SIZE = OUTPUT_DISTRIBUTION_TYPE__BIN_SIZE;

	/**
	 * The feature id for the '<em><b>Kurtosis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ENTRY_DISTRIBUTION_TYPE__KURTOSIS = OUTPUT_DISTRIBUTION_TYPE__KURTOSIS;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ENTRY_DISTRIBUTION_TYPE__MAX = OUTPUT_DISTRIBUTION_TYPE__MAX;

	/**
	 * The feature id for the '<em><b>Mean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ENTRY_DISTRIBUTION_TYPE__MEAN = OUTPUT_DISTRIBUTION_TYPE__MEAN;

	/**
	 * The feature id for the '<em><b>Mid Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ENTRY_DISTRIBUTION_TYPE__MID_POINT = OUTPUT_DISTRIBUTION_TYPE__MID_POINT;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ENTRY_DISTRIBUTION_TYPE__MIN = OUTPUT_DISTRIBUTION_TYPE__MIN;

	/**
	 * The feature id for the '<em><b>Number Bins</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ENTRY_DISTRIBUTION_TYPE__NUMBER_BINS = OUTPUT_DISTRIBUTION_TYPE__NUMBER_BINS;

	/**
	 * The feature id for the '<em><b>Skew</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ENTRY_DISTRIBUTION_TYPE__SKEW = OUTPUT_DISTRIBUTION_TYPE__SKEW;

	/**
	 * The feature id for the '<em><b>Std Dev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ENTRY_DISTRIBUTION_TYPE__STD_DEV = OUTPUT_DISTRIBUTION_TYPE__STD_DEV;

	/**
	 * The feature id for the '<em><b>XSamples</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ENTRY_DISTRIBUTION_TYPE__XSAMPLES = OUTPUT_DISTRIBUTION_TYPE__XSAMPLES;

	/**
	 * The feature id for the '<em><b>Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ENTRY_DISTRIBUTION_TYPE__PHASE = OUTPUT_DISTRIBUTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Output Entry Distribution Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ENTRY_DISTRIBUTION_TYPE_FEATURE_COUNT = OUTPUT_DISTRIBUTION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Output Entry Distribution Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_ENTRY_DISTRIBUTION_TYPE_OPERATION_COUNT = OUTPUT_DISTRIBUTION_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.OutputResultForwardingANDJoinDelayImpl <em>Output Result Forwarding AND Join Delay</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.OutputResultForwardingANDJoinDelayImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getOutputResultForwardingANDJoinDelay()
	 * @generated
	 */
	int OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY = 29;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__ID = CommonBasePackage.ID_BASE__ID;

	/**
	 * The feature id for the '<em><b>Result Conf95</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__RESULT_CONF95 = CommonBasePackage.ID_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Result Conf99</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__RESULT_CONF99 = CommonBasePackage.ID_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Dest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__DEST = CommonBasePackage.ID_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Join Variance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__JOIN_VARIANCE = CommonBasePackage.ID_BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Join Waiting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__JOIN_WAITING = CommonBasePackage.ID_BASE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Waiting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__WAITING = CommonBasePackage.ID_BASE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Output Result Forwarding AND Join Delay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY_FEATURE_COUNT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Output Result Forwarding AND Join Delay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY_OPERATION_COUNT = CommonBasePackage.ID_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.OutputResultTypeImpl <em>Output Result Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.OutputResultTypeImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getOutputResultType()
	 * @generated
	 */
	int OUTPUT_RESULT_TYPE = 30;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_TYPE__ID = CommonBasePackage.ID_BASE__ID;

	/**
	 * The feature id for the '<em><b>Result Conf95</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_TYPE__RESULT_CONF95 = CommonBasePackage.ID_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Result Conf99</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_TYPE__RESULT_CONF99 = CommonBasePackage.ID_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Open Wait Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_TYPE__OPEN_WAIT_TIME = CommonBasePackage.ID_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Phase1 Proc Waiting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_TYPE__PHASE1_PROC_WAITING = CommonBasePackage.ID_BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Phase1 Service Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_TYPE__PHASE1_SERVICE_TIME = CommonBasePackage.ID_BASE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Phase1 Service Time Variance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_TYPE__PHASE1_SERVICE_TIME_VARIANCE = CommonBasePackage.ID_BASE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Phase1 Utilization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_TYPE__PHASE1_UTILIZATION = CommonBasePackage.ID_BASE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Phase2 Proc Waiting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_TYPE__PHASE2_PROC_WAITING = CommonBasePackage.ID_BASE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Phase2 Service Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_TYPE__PHASE2_SERVICE_TIME = CommonBasePackage.ID_BASE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Phase2 Service Time Variance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_TYPE__PHASE2_SERVICE_TIME_VARIANCE = CommonBasePackage.ID_BASE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Phase2 Utilization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_TYPE__PHASE2_UTILIZATION = CommonBasePackage.ID_BASE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Phase3 Proc Waiting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_TYPE__PHASE3_PROC_WAITING = CommonBasePackage.ID_BASE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Phase3 Service Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_TYPE__PHASE3_SERVICE_TIME = CommonBasePackage.ID_BASE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Phase3 Service Time Variance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_TYPE__PHASE3_SERVICE_TIME_VARIANCE = CommonBasePackage.ID_BASE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Phase3 Utilization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_TYPE__PHASE3_UTILIZATION = CommonBasePackage.ID_BASE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Prob Exceed Max Service Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_TYPE__PROB_EXCEED_MAX_SERVICE_TIME = CommonBasePackage.ID_BASE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Proc Utilization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_TYPE__PROC_UTILIZATION = CommonBasePackage.ID_BASE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Proc Waiting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_TYPE__PROC_WAITING = CommonBasePackage.ID_BASE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Service Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_TYPE__SERVICE_TIME = CommonBasePackage.ID_BASE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Service Time Variance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_TYPE__SERVICE_TIME_VARIANCE = CommonBasePackage.ID_BASE_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Squared Coeff Variation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_TYPE__SQUARED_COEFF_VARIATION = CommonBasePackage.ID_BASE_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_TYPE__THROUGHPUT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Throughput Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_TYPE__THROUGHPUT_BOUND = CommonBasePackage.ID_BASE_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Utilization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_TYPE__UTILIZATION = CommonBasePackage.ID_BASE_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Waiting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_TYPE__WAITING = CommonBasePackage.ID_BASE_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Waiting Variance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_TYPE__WAITING_VARIANCE = CommonBasePackage.ID_BASE_FEATURE_COUNT + 25;

	/**
	 * The number of structural features of the '<em>Output Result Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_TYPE_FEATURE_COUNT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 26;

	/**
	 * The number of operations of the '<em>Output Result Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_RESULT_TYPE_OPERATION_COUNT = CommonBasePackage.ID_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ParameterTypeImpl <em>Parameter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ParameterTypeImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getParameterType()
	 * @generated
	 */
	int PARAMETER_TYPE = 31;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__ID = CommonBasePackage.ID_BASE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__NAME = CommonBasePackage.ID_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__VALUE = CommonBasePackage.ID_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parameter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_FEATURE_COUNT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Parameter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_OPERATION_COUNT = CommonBasePackage.ID_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ParaTypeImpl <em>Para Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ParaTypeImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getParaType()
	 * @generated
	 */
	int PARA_TYPE = 32;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARA_TYPE__ID = CommonBasePackage.ID_BASE__ID;

	/**
	 * The feature id for the '<em><b>Start Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARA_TYPE__START_VALUE = CommonBasePackage.ID_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARA_TYPE__END_VALUE = CommonBasePackage.ID_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Step Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARA_TYPE__STEP_VALUE = CommonBasePackage.ID_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARA_TYPE__VALUE = CommonBasePackage.ID_BASE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Para Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARA_TYPE_FEATURE_COUNT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Para Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARA_TYPE_OPERATION_COUNT = CommonBasePackage.ID_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.PhaseActivitiesImpl <em>Phase Activities</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.PhaseActivitiesImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getPhaseActivities()
	 * @generated
	 */
	int PHASE_ACTIVITIES = 33;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_ACTIVITIES__ID = CommonBasePackage.ID_BASE__ID;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_ACTIVITIES__ACTIVITY = CommonBasePackage.ID_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Phase Activities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_ACTIVITIES_FEATURE_COUNT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Phase Activities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_ACTIVITIES_OPERATION_COUNT = CommonBasePackage.ID_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.PlotControlTypeImpl <em>Plot Control Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.PlotControlTypeImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getPlotControlType()
	 * @generated
	 */
	int PLOT_CONTROL_TYPE = 34;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLOT_CONTROL_TYPE__ID = CommonBasePackage.ID_BASE__ID;

	/**
	 * The feature id for the '<em><b>First Plot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLOT_CONTROL_TYPE__FIRST_PLOT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Plot</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLOT_CONTROL_TYPE__PLOT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Plot Control Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLOT_CONTROL_TYPE_FEATURE_COUNT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Plot Control Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLOT_CONTROL_TYPE_OPERATION_COUNT = CommonBasePackage.ID_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.PlotTypeImpl <em>Plot Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.PlotTypeImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getPlotType()
	 * @generated
	 */
	int PLOT_TYPE = 35;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLOT_TYPE__ID = CommonBasePackage.ID_BASE__ID;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLOT_TYPE__VARIABLE = CommonBasePackage.ID_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Plot Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLOT_TYPE_FEATURE_COUNT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Plot Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLOT_TYPE_OPERATION_COUNT = CommonBasePackage.ID_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.PortBindingTypeImpl <em>Port Binding Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.PortBindingTypeImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getPortBindingType()
	 * @generated
	 */
	int PORT_BINDING_TYPE = 36;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_BINDING_TYPE__ID = CommonBasePackage.ID_BASE__ID;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_BINDING_TYPE__SOURCE = CommonBasePackage.ID_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_BINDING_TYPE__TARGET = CommonBasePackage.ID_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Port Binding Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_BINDING_TYPE_FEATURE_COUNT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Port Binding Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_BINDING_TYPE_OPERATION_COUNT = CommonBasePackage.ID_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.PragmaTypeImpl <em>Pragma Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.PragmaTypeImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getPragmaType()
	 * @generated
	 */
	int PRAGMA_TYPE = 37;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRAGMA_TYPE__ID = CommonBasePackage.ID_BASE__ID;

	/**
	 * The feature id for the '<em><b>Param</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRAGMA_TYPE__PARAM = CommonBasePackage.ID_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRAGMA_TYPE__VALUE = CommonBasePackage.ID_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pragma Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRAGMA_TYPE_FEATURE_COUNT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pragma Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRAGMA_TYPE_OPERATION_COUNT = CommonBasePackage.ID_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.PrecedenceTypeImpl <em>Precedence Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.PrecedenceTypeImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getPrecedenceType()
	 * @generated
	 */
	int PRECEDENCE_TYPE = 38;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_TYPE__ID = CommonBasePackage.ID_BASE__ID;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_TYPE__PRE = CommonBasePackage.ID_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pre OR</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_TYPE__PRE_OR = CommonBasePackage.ID_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pre AND</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_TYPE__PRE_AND = CommonBasePackage.ID_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Post</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_TYPE__POST = CommonBasePackage.ID_BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Post OR</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_TYPE__POST_OR = CommonBasePackage.ID_BASE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Post AND</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_TYPE__POST_AND = CommonBasePackage.ID_BASE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Post LOOP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_TYPE__POST_LOOP = CommonBasePackage.ID_BASE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Precedence Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_TYPE_FEATURE_COUNT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Precedence Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_TYPE_OPERATION_COUNT = CommonBasePackage.ID_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ProcessorBindingTypeImpl <em>Processor Binding Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ProcessorBindingTypeImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getProcessorBindingType()
	 * @generated
	 */
	int PROCESSOR_BINDING_TYPE = 39;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_BINDING_TYPE__ID = CommonBasePackage.ID_BASE__ID;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_BINDING_TYPE__SOURCE = CommonBasePackage.ID_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_BINDING_TYPE__TARGET = CommonBasePackage.ID_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Processor Binding Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_BINDING_TYPE_FEATURE_COUNT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Processor Binding Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_BINDING_TYPE_OPERATION_COUNT = CommonBasePackage.ID_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ProcessorTypeImpl <em>Processor Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ProcessorTypeImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getProcessorType()
	 * @generated
	 */
	int PROCESSOR_TYPE = 40;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_TYPE__ID = CommonBasePackage.ID_BASE__ID;

	/**
	 * The feature id for the '<em><b>Result Processor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_TYPE__RESULT_PROCESSOR = CommonBasePackage.ID_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Task</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_TYPE__TASK = CommonBasePackage.ID_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_TYPE__MULTIPLICITY = CommonBasePackage.ID_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_TYPE__NAME = CommonBasePackage.ID_BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Quantum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_TYPE__QUANTUM = CommonBasePackage.ID_BASE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Replication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_TYPE__REPLICATION = CommonBasePackage.ID_BASE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Scheduling</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_TYPE__SCHEDULING = CommonBasePackage.ID_BASE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Speed Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_TYPE__SPEED_FACTOR = CommonBasePackage.ID_BASE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Processor Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_TYPE_FEATURE_COUNT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Processor Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_TYPE_OPERATION_COUNT = CommonBasePackage.ID_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ReplyActivityTypeImpl <em>Reply Activity Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ReplyActivityTypeImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getReplyActivityType()
	 * @generated
	 */
	int REPLY_ACTIVITY_TYPE = 41;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY_ACTIVITY_TYPE__ID = CommonBasePackage.ID_BASE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY_ACTIVITY_TYPE__NAME = CommonBasePackage.ID_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reply Activity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY_ACTIVITY_TYPE_FEATURE_COUNT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Reply Activity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY_ACTIVITY_TYPE_OPERATION_COUNT = CommonBasePackage.ID_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ReplyEntryTypeImpl <em>Reply Entry Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ReplyEntryTypeImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getReplyEntryType()
	 * @generated
	 */
	int REPLY_ENTRY_TYPE = 42;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY_ENTRY_TYPE__ID = CommonBasePackage.ID_BASE__ID;

	/**
	 * The feature id for the '<em><b>Reply Activity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY_ENTRY_TYPE__REPLY_ACTIVITY = CommonBasePackage.ID_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY_ENTRY_TYPE__NAME = CommonBasePackage.ID_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Reply Entry Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY_ENTRY_TYPE_FEATURE_COUNT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Reply Entry Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY_ENTRY_TYPE_OPERATION_COUNT = CommonBasePackage.ID_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ResultConf95TypeImpl <em>Result Conf95 Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ResultConf95TypeImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getResultConf95Type()
	 * @generated
	 */
	int RESULT_CONF95_TYPE = 43;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF95_TYPE__ID = CommonBasePackage.ID_BASE__ID;

	/**
	 * The feature id for the '<em><b>Join Variance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF95_TYPE__JOIN_VARIANCE = CommonBasePackage.ID_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Join Waiting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF95_TYPE__JOIN_WAITING = CommonBasePackage.ID_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Waiting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF95_TYPE__WAITING = CommonBasePackage.ID_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Result Conf95 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF95_TYPE_FEATURE_COUNT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Result Conf95 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF95_TYPE_OPERATION_COUNT = CommonBasePackage.ID_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ResultConf95Type1Impl <em>Result Conf95 Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ResultConf95Type1Impl
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getResultConf95Type1()
	 * @generated
	 */
	int RESULT_CONF95_TYPE1 = 44;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF95_TYPE1__ID = CommonBasePackage.ID_BASE__ID;

	/**
	 * The feature id for the '<em><b>Open Wait Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF95_TYPE1__OPEN_WAIT_TIME = CommonBasePackage.ID_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Phase1 Proc Waiting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF95_TYPE1__PHASE1_PROC_WAITING = CommonBasePackage.ID_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Phase1 Service Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF95_TYPE1__PHASE1_SERVICE_TIME = CommonBasePackage.ID_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Phase1 Service Time Variance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF95_TYPE1__PHASE1_SERVICE_TIME_VARIANCE = CommonBasePackage.ID_BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Phase1 Utilization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF95_TYPE1__PHASE1_UTILIZATION = CommonBasePackage.ID_BASE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Phase2 Proc Waiting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF95_TYPE1__PHASE2_PROC_WAITING = CommonBasePackage.ID_BASE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Phase2 Service Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF95_TYPE1__PHASE2_SERVICE_TIME = CommonBasePackage.ID_BASE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Phase2 Service Time Variance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF95_TYPE1__PHASE2_SERVICE_TIME_VARIANCE = CommonBasePackage.ID_BASE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Phase2 Utilization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF95_TYPE1__PHASE2_UTILIZATION = CommonBasePackage.ID_BASE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Phase3 Proc Waiting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF95_TYPE1__PHASE3_PROC_WAITING = CommonBasePackage.ID_BASE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Phase3 Service Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF95_TYPE1__PHASE3_SERVICE_TIME = CommonBasePackage.ID_BASE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Phase3 Service Time Variance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF95_TYPE1__PHASE3_SERVICE_TIME_VARIANCE = CommonBasePackage.ID_BASE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Phase3 Utilization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF95_TYPE1__PHASE3_UTILIZATION = CommonBasePackage.ID_BASE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Prob Exceed Max Service Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF95_TYPE1__PROB_EXCEED_MAX_SERVICE_TIME = CommonBasePackage.ID_BASE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Proc Utilization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF95_TYPE1__PROC_UTILIZATION = CommonBasePackage.ID_BASE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Proc Waiting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF95_TYPE1__PROC_WAITING = CommonBasePackage.ID_BASE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Service Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF95_TYPE1__SERVICE_TIME = CommonBasePackage.ID_BASE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Service Time Variance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF95_TYPE1__SERVICE_TIME_VARIANCE = CommonBasePackage.ID_BASE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Squared Coeff Variation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF95_TYPE1__SQUARED_COEFF_VARIATION = CommonBasePackage.ID_BASE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF95_TYPE1__THROUGHPUT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Throughput Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF95_TYPE1__THROUGHPUT_BOUND = CommonBasePackage.ID_BASE_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Utilization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF95_TYPE1__UTILIZATION = CommonBasePackage.ID_BASE_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Waiting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF95_TYPE1__WAITING = CommonBasePackage.ID_BASE_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Waiting Variance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF95_TYPE1__WAITING_VARIANCE = CommonBasePackage.ID_BASE_FEATURE_COUNT + 23;

	/**
	 * The number of structural features of the '<em>Result Conf95 Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF95_TYPE1_FEATURE_COUNT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 24;

	/**
	 * The number of operations of the '<em>Result Conf95 Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF95_TYPE1_OPERATION_COUNT = CommonBasePackage.ID_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ResultConf99TypeImpl <em>Result Conf99 Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ResultConf99TypeImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getResultConf99Type()
	 * @generated
	 */
	int RESULT_CONF99_TYPE = 45;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF99_TYPE__ID = CommonBasePackage.ID_BASE__ID;

	/**
	 * The feature id for the '<em><b>Join Variance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF99_TYPE__JOIN_VARIANCE = CommonBasePackage.ID_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Join Waiting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF99_TYPE__JOIN_WAITING = CommonBasePackage.ID_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Waiting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF99_TYPE__WAITING = CommonBasePackage.ID_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Result Conf99 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF99_TYPE_FEATURE_COUNT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Result Conf99 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF99_TYPE_OPERATION_COUNT = CommonBasePackage.ID_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ResultConf99Type1Impl <em>Result Conf99 Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ResultConf99Type1Impl
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getResultConf99Type1()
	 * @generated
	 */
	int RESULT_CONF99_TYPE1 = 46;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF99_TYPE1__ID = CommonBasePackage.ID_BASE__ID;

	/**
	 * The feature id for the '<em><b>Open Wait Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF99_TYPE1__OPEN_WAIT_TIME = CommonBasePackage.ID_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Phase1 Proc Waiting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF99_TYPE1__PHASE1_PROC_WAITING = CommonBasePackage.ID_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Phase1 Service Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF99_TYPE1__PHASE1_SERVICE_TIME = CommonBasePackage.ID_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Phase1 Service Time Variance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF99_TYPE1__PHASE1_SERVICE_TIME_VARIANCE = CommonBasePackage.ID_BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Phase1 Utilization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF99_TYPE1__PHASE1_UTILIZATION = CommonBasePackage.ID_BASE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Phase2 Proc Waiting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF99_TYPE1__PHASE2_PROC_WAITING = CommonBasePackage.ID_BASE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Phase2 Service Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF99_TYPE1__PHASE2_SERVICE_TIME = CommonBasePackage.ID_BASE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Phase2 Service Time Variance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF99_TYPE1__PHASE2_SERVICE_TIME_VARIANCE = CommonBasePackage.ID_BASE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Phase2 Utilization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF99_TYPE1__PHASE2_UTILIZATION = CommonBasePackage.ID_BASE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Phase3 Proc Waiting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF99_TYPE1__PHASE3_PROC_WAITING = CommonBasePackage.ID_BASE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Phase3 Service Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF99_TYPE1__PHASE3_SERVICE_TIME = CommonBasePackage.ID_BASE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Phase3 Service Time Variance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF99_TYPE1__PHASE3_SERVICE_TIME_VARIANCE = CommonBasePackage.ID_BASE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Phase3 Utilization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF99_TYPE1__PHASE3_UTILIZATION = CommonBasePackage.ID_BASE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Prob Exceed Max Service Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF99_TYPE1__PROB_EXCEED_MAX_SERVICE_TIME = CommonBasePackage.ID_BASE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Proc Utilization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF99_TYPE1__PROC_UTILIZATION = CommonBasePackage.ID_BASE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Proc Waiting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF99_TYPE1__PROC_WAITING = CommonBasePackage.ID_BASE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Service Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF99_TYPE1__SERVICE_TIME = CommonBasePackage.ID_BASE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Service Time Variance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF99_TYPE1__SERVICE_TIME_VARIANCE = CommonBasePackage.ID_BASE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Squared Coeff Variation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF99_TYPE1__SQUARED_COEFF_VARIATION = CommonBasePackage.ID_BASE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF99_TYPE1__THROUGHPUT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Throughput Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF99_TYPE1__THROUGHPUT_BOUND = CommonBasePackage.ID_BASE_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Utilization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF99_TYPE1__UTILIZATION = CommonBasePackage.ID_BASE_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Waiting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF99_TYPE1__WAITING = CommonBasePackage.ID_BASE_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Waiting Variance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF99_TYPE1__WAITING_VARIANCE = CommonBasePackage.ID_BASE_FEATURE_COUNT + 23;

	/**
	 * The number of structural features of the '<em>Result Conf99 Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF99_TYPE1_FEATURE_COUNT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 24;

	/**
	 * The number of operations of the '<em>Result Conf99 Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_CONF99_TYPE1_OPERATION_COUNT = CommonBasePackage.ID_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ResultGeneralTypeImpl <em>Result General Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ResultGeneralTypeImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getResultGeneralType()
	 * @generated
	 */
	int RESULT_GENERAL_TYPE = 47;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_GENERAL_TYPE__ID = CommonBasePackage.ID_BASE__ID;

	/**
	 * The feature id for the '<em><b>Conv Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_GENERAL_TYPE__CONV_VAL = CommonBasePackage.ID_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Elapsed Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_GENERAL_TYPE__ELAPSED_TIME = CommonBasePackage.ID_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Iterations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_GENERAL_TYPE__ITERATIONS = CommonBasePackage.ID_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Platform Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_GENERAL_TYPE__PLATFORM_INFO = CommonBasePackage.ID_BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Solver Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_GENERAL_TYPE__SOLVER_INFO = CommonBasePackage.ID_BASE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>System Cpu Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_GENERAL_TYPE__SYSTEM_CPU_TIME = CommonBasePackage.ID_BASE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>User Cpu Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_GENERAL_TYPE__USER_CPU_TIME = CommonBasePackage.ID_BASE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_GENERAL_TYPE__VALID = CommonBasePackage.ID_BASE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Result General Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_GENERAL_TYPE_FEATURE_COUNT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Result General Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_GENERAL_TYPE_OPERATION_COUNT = CommonBasePackage.ID_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.RunControlTypeImpl <em>Run Control Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.RunControlTypeImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getRunControlType()
	 * @generated
	 */
	int RUN_CONTROL_TYPE = 48;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_CONTROL_TYPE__ID = CommonBasePackage.ID_BASE__ID;

	/**
	 * The feature id for the '<em><b>Para</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_CONTROL_TYPE__PARA = CommonBasePackage.ID_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Run Control Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_CONTROL_TYPE_FEATURE_COUNT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Run Control Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_CONTROL_TYPE_OPERATION_COUNT = CommonBasePackage.ID_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ServiceTypeImpl <em>Service Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ServiceTypeImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getServiceType()
	 * @generated
	 */
	int SERVICE_TYPE = 49;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE__ID = CommonBasePackage.ID_BASE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE__NAME = CommonBasePackage.ID_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Service Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE_FEATURE_COUNT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Service Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE_OPERATION_COUNT = CommonBasePackage.ID_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.SingleActivityListTypeImpl <em>Single Activity List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.SingleActivityListTypeImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getSingleActivityListType()
	 * @generated
	 */
	int SINGLE_ACTIVITY_LIST_TYPE = 50;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ACTIVITY_LIST_TYPE__ID = CommonBasePackage.ID_BASE__ID;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ACTIVITY_LIST_TYPE__ACTIVITY = CommonBasePackage.ID_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Single Activity List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ACTIVITY_LIST_TYPE_FEATURE_COUNT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Single Activity List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ACTIVITY_LIST_TYPE_OPERATION_COUNT = CommonBasePackage.ID_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.SlotTypeImpl <em>Slot Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.SlotTypeImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getSlotType()
	 * @generated
	 */
	int SLOT_TYPE = 51;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_TYPE__ID = CommonBasePackage.ID_BASE__ID;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_TYPE__INTERFACE = CommonBasePackage.ID_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_TYPE__BINDING = CommonBasePackage.ID_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bind Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_TYPE__BIND_TARGET = CommonBasePackage.ID_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Replic Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_TYPE__REPLIC_NUM = CommonBasePackage.ID_BASE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Slot Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_TYPE_FEATURE_COUNT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Slot Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_TYPE_OPERATION_COUNT = CommonBasePackage.ID_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.SolverParamsTypeImpl <em>Solver Params Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.SolverParamsTypeImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getSolverParamsType()
	 * @generated
	 */
	int SOLVER_PARAMS_TYPE = 52;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_PARAMS_TYPE__ID = CommonBasePackage.ID_BASE__ID;

	/**
	 * The feature id for the '<em><b>Result General</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_PARAMS_TYPE__RESULT_GENERAL = CommonBasePackage.ID_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pragma</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_PARAMS_TYPE__PRAGMA = CommonBasePackage.ID_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_PARAMS_TYPE__COMMENT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Conv Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_PARAMS_TYPE__CONV_VAL = CommonBasePackage.ID_BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>It Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_PARAMS_TYPE__IT_LIMIT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Print Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_PARAMS_TYPE__PRINT_INT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Underrelax Coeff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_PARAMS_TYPE__UNDERRELAX_COEFF = CommonBasePackage.ID_BASE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Solver Params Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_PARAMS_TYPE_FEATURE_COUNT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Solver Params Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_PARAMS_TYPE_OPERATION_COUNT = CommonBasePackage.ID_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.CallTypeImpl <em>Call Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.CallTypeImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getCallType()
	 * @generated
	 */
	int CALL_TYPE = 53;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_TYPE__ID = CommonBasePackage.ID_BASE__ID;

	/**
	 * The feature id for the '<em><b>Dest</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_TYPE__DEST = CommonBasePackage.ID_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fanin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_TYPE__FANIN = CommonBasePackage.ID_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fanout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_TYPE__FANOUT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Call Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_TYPE_FEATURE_COUNT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Call Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_TYPE_OPERATION_COUNT = CommonBasePackage.ID_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.SynchCallTypeImpl <em>Synch Call Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.SynchCallTypeImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getSynchCallType()
	 * @generated
	 */
	int SYNCH_CALL_TYPE = 54;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCH_CALL_TYPE__ID = CALL_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Dest</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCH_CALL_TYPE__DEST = CALL_TYPE__DEST;

	/**
	 * The feature id for the '<em><b>Fanin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCH_CALL_TYPE__FANIN = CALL_TYPE__FANIN;

	/**
	 * The feature id for the '<em><b>Fanout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCH_CALL_TYPE__FANOUT = CALL_TYPE__FANOUT;

	/**
	 * The number of structural features of the '<em>Synch Call Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCH_CALL_TYPE_FEATURE_COUNT = CALL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Synch Call Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCH_CALL_TYPE_OPERATION_COUNT = CALL_TYPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNCH_CALL_TYPE__ID = CALL_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Dest</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNCH_CALL_TYPE__DEST = CALL_TYPE__DEST;

	/**
	 * The feature id for the '<em><b>Fanin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNCH_CALL_TYPE__FANIN = CALL_TYPE__FANIN;

	/**
	 * The feature id for the '<em><b>Fanout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNCH_CALL_TYPE__FANOUT = CALL_TYPE__FANOUT;

	/**
	 * The number of structural features of the '<em>Asynch Call Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNCH_CALL_TYPE_FEATURE_COUNT = CALL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Asynch Call Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNCH_CALL_TYPE_OPERATION_COUNT = CALL_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.TaskActivityGraphImpl <em>Task Activity Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.TaskActivityGraphImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getTaskActivityGraph()
	 * @generated
	 */
	int TASK_ACTIVITY_GRAPH = 56;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ACTIVITY_GRAPH__ID = ACTIVITY_GRAPH_BASE__ID;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ACTIVITY_GRAPH__ACTIVITY = ACTIVITY_GRAPH_BASE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Precedence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ACTIVITY_GRAPH__PRECEDENCE = ACTIVITY_GRAPH_BASE__PRECEDENCE;

	/**
	 * The feature id for the '<em><b>Reply Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ACTIVITY_GRAPH__REPLY_ENTRY = ACTIVITY_GRAPH_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Task Activity Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ACTIVITY_GRAPH_FEATURE_COUNT = ACTIVITY_GRAPH_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Task Activity Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ACTIVITY_GRAPH_OPERATION_COUNT = ACTIVITY_GRAPH_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.TaskTypeImpl <em>Task Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.TaskTypeImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getTaskType()
	 * @generated
	 */
	int TASK_TYPE = 57;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__ID = CommonBasePackage.ID_BASE__ID;

	/**
	 * The feature id for the '<em><b>Result Task</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__RESULT_TASK = CommonBasePackage.ID_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__ENTRY = CommonBasePackage.ID_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Service</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__SERVICE = CommonBasePackage.ID_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Task Activities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__TASK_ACTIVITIES = CommonBasePackage.ID_BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Activity Graph</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__ACTIVITY_GRAPH = CommonBasePackage.ID_BASE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__MULTIPLICITY = CommonBasePackage.ID_BASE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__NAME = CommonBasePackage.ID_BASE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__PRIORITY = CommonBasePackage.ID_BASE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Queue Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__QUEUE_LENGTH = CommonBasePackage.ID_BASE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Replication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__REPLICATION = CommonBasePackage.ID_BASE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Scheduling</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__SCHEDULING = CommonBasePackage.ID_BASE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Think Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__THINK_TIME = CommonBasePackage.ID_BASE_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Task Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE_FEATURE_COUNT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Task Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE_OPERATION_COUNT = CommonBasePackage.ID_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.AxisType <em>Axis Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.AxisType
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getAxisType()
	 * @generated
	 */
	int AXIS_TYPE = 58;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.CallOrderType <em>Call Order Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.CallOrderType
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getCallOrderType()
	 * @generated
	 */
	int CALL_ORDER_TYPE = 59;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.SchedulingType <em>Scheduling Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.SchedulingType
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getSchedulingType()
	 * @generated
	 */
	int SCHEDULING_TYPE = 60;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.SemaphoreType <em>Semaphore Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.SemaphoreType
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getSemaphoreType()
	 * @generated
	 */
	int SEMAPHORE_TYPE = 61;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.TaskOptionType <em>Task Option Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.TaskOptionType
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getTaskOptionType()
	 * @generated
	 */
	int TASK_OPTION_TYPE = 62;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.TaskSchedulingType <em>Task Scheduling Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.TaskSchedulingType
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getTaskSchedulingType()
	 * @generated
	 */
	int TASK_SCHEDULING_TYPE = 63;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.TypeType <em>Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.TypeType
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getTypeType()
	 * @generated
	 */
	int TYPE_TYPE = 64;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ValidType <em>Valid Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ValidType
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getValidType()
	 * @generated
	 */
	int VALID_TYPE = 65;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.XmlDebugType <em>Xml Debug Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.XmlDebugType
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getXmlDebugType()
	 * @generated
	 */
	int XML_DEBUG_TYPE = 66;

	/**
	 * The meta object id for the '<em>Axis Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.AxisType
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getAxisTypeObject()
	 * @generated
	 */
	int AXIS_TYPE_OBJECT = 67;

	/**
	 * The meta object id for the '<em>Call Order Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.CallOrderType
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getCallOrderTypeObject()
	 * @generated
	 */
	int CALL_ORDER_TYPE_OBJECT = 68;

	/**
	 * The meta object id for the '<em>Connect From Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getConnectFromType()
	 * @generated
	 */
	int CONNECT_FROM_TYPE = 69;

	/**
	 * The meta object id for the '<em>Connect To Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getConnectToType()
	 * @generated
	 */
	int CONNECT_TO_TYPE = 70;

	/**
	 * The meta object id for the '<em>Phase Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getPhaseType()
	 * @generated
	 */
	int PHASE_TYPE = 71;

	/**
	 * The meta object id for the '<em>Scheduling Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.SchedulingType
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getSchedulingTypeObject()
	 * @generated
	 */
	int SCHEDULING_TYPE_OBJECT = 72;

	/**
	 * The meta object id for the '<em>Sci Notation</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getSciNotation()
	 * @generated
	 */
	int SCI_NOTATION = 73;

	/**
	 * The meta object id for the '<em>Semaphore Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.SemaphoreType
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getSemaphoreTypeObject()
	 * @generated
	 */
	int SEMAPHORE_TYPE_OBJECT = 74;

	/**
	 * The meta object id for the '<em>Srvn Float</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getSrvnFloat()
	 * @generated
	 */
	int SRVN_FLOAT = 75;

	/**
	 * The meta object id for the '<em>Task Option Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.TaskOptionType
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getTaskOptionTypeObject()
	 * @generated
	 */
	int TASK_OPTION_TYPE_OBJECT = 76;

	/**
	 * The meta object id for the '<em>Task Scheduling Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.TaskSchedulingType
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getTaskSchedulingTypeObject()
	 * @generated
	 */
	int TASK_SCHEDULING_TYPE_OBJECT = 77;

	/**
	 * The meta object id for the '<em>Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.TypeType
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getTypeTypeObject()
	 * @generated
	 */
	int TYPE_TYPE_OBJECT = 78;

	/**
	 * The meta object id for the '<em>Valid Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ValidType
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getValidTypeObject()
	 * @generated
	 */
	int VALID_TYPE_OBJECT = 79;

	/**
	 * The meta object id for the '<em>Xml Debug Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.XmlDebugType
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getXmlDebugTypeObject()
	 * @generated
	 */
	int XML_DEBUG_TYPE_OBJECT = 80;


	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityDefBase <em>Activity Def Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Def Base</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityDefBase
	 * @generated
	 */
	EClass getActivityDefBase();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityDefBase#getResultJoinDelay <em>Result Join Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Result Join Delay</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityDefBase#getResultJoinDelay()
	 * @see #getActivityDefBase()
	 * @generated
	 */
	EReference getActivityDefBase_ResultJoinDelay();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityDefBase#getResultForwarding <em>Result Forwarding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Result Forwarding</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityDefBase#getResultForwarding()
	 * @see #getActivityDefBase()
	 * @generated
	 */
	EReference getActivityDefBase_ResultForwarding();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityDefBase#getServiceTimeDistribution <em>Service Time Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Time Distribution</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityDefBase#getServiceTimeDistribution()
	 * @see #getActivityDefBase()
	 * @generated
	 */
	EReference getActivityDefBase_ServiceTimeDistribution();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityDefBase#getResultActivity <em>Result Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Result Activity</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityDefBase#getResultActivity()
	 * @see #getActivityDefBase()
	 * @generated
	 */
	EReference getActivityDefBase_ResultActivity();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityDefBase#getCallOrder <em>Call Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Call Order</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityDefBase#getCallOrder()
	 * @see #getActivityDefBase()
	 * @generated
	 */
	EAttribute getActivityDefBase_CallOrder();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityDefBase#getHostDemandCvsq <em>Host Demand Cvsq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Demand Cvsq</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityDefBase#getHostDemandCvsq()
	 * @see #getActivityDefBase()
	 * @generated
	 */
	EAttribute getActivityDefBase_HostDemandCvsq();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityDefBase#getHostDemandMean <em>Host Demand Mean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Demand Mean</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityDefBase#getHostDemandMean()
	 * @see #getActivityDefBase()
	 * @generated
	 */
	EAttribute getActivityDefBase_HostDemandMean();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityDefBase#getMaxServiceTime <em>Max Service Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Service Time</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityDefBase#getMaxServiceTime()
	 * @see #getActivityDefBase()
	 * @generated
	 */
	EAttribute getActivityDefBase_MaxServiceTime();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityDefBase#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityDefBase#getName()
	 * @see #getActivityDefBase()
	 * @generated
	 */
	EAttribute getActivityDefBase_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityDefBase#getThinkTime <em>Think Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Think Time</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityDefBase#getThinkTime()
	 * @see #getActivityDefBase()
	 * @generated
	 */
	EAttribute getActivityDefBase_ThinkTime();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityDefType <em>Activity Def Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Def Type</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityDefType
	 * @generated
	 */
	EClass getActivityDefType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityDefType#getCallList <em>Call List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Call List</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityDefType#getCallList()
	 * @see #getActivityDefType()
	 * @generated
	 */
	EReference getActivityDefType_CallList();

	/**
	 * Returns the meta object for the attribute list '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityDefType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityDefType#getGroup()
	 * @see #getActivityDefType()
	 * @generated
	 */
	EAttribute getActivityDefType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityDefType#getSynchCall <em>Synch Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Synch Call</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityDefType#getSynchCall()
	 * @see #getActivityDefType()
	 * @generated
	 */
	EReference getActivityDefType_SynchCall();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityDefType#getAsynchCall <em>Asynch Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Asynch Call</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityDefType#getAsynchCall()
	 * @see #getActivityDefType()
	 * @generated
	 */
	EReference getActivityDefType_AsynchCall();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityDefType#getBoundToEntry <em>Bound To Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bound To Entry</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityDefType#getBoundToEntry()
	 * @see #getActivityDefType()
	 * @generated
	 */
	EAttribute getActivityDefType_BoundToEntry();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityGraphBase <em>Activity Graph Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Graph Base</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityGraphBase
	 * @generated
	 */
	EClass getActivityGraphBase();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityGraphBase#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activity</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityGraphBase#getActivity()
	 * @see #getActivityGraphBase()
	 * @generated
	 */
	EReference getActivityGraphBase_Activity();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityGraphBase#getPrecedence <em>Precedence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Precedence</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityGraphBase#getPrecedence()
	 * @see #getActivityGraphBase()
	 * @generated
	 */
	EReference getActivityGraphBase_Precedence();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityListType <em>Activity List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity List Type</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityListType
	 * @generated
	 */
	EClass getActivityListType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityListType#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activity</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityListType#getActivity()
	 * @see #getActivityListType()
	 * @generated
	 */
	EReference getActivityListType_Activity();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityLoopListType <em>Activity Loop List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Loop List Type</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityLoopListType
	 * @generated
	 */
	EClass getActivityLoopListType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityLoopListType#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activity</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityLoopListType#getActivity()
	 * @see #getActivityLoopListType()
	 * @generated
	 */
	EReference getActivityLoopListType_Activity();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityLoopListType#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityLoopListType#getEnd()
	 * @see #getActivityLoopListType()
	 * @generated
	 */
	EAttribute getActivityLoopListType_End();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityLoopType <em>Activity Loop Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Loop Type</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityLoopType
	 * @generated
	 */
	EClass getActivityLoopType();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityLoopType#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityLoopType#getCount()
	 * @see #getActivityLoopType()
	 * @generated
	 */
	EAttribute getActivityLoopType_Count();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityMakingCallType <em>Activity Making Call Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Making Call Type</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityMakingCallType
	 * @generated
	 */
	EClass getActivityMakingCallType();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityMakingCallType#getCallsMean <em>Calls Mean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Calls Mean</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityMakingCallType#getCallsMean()
	 * @see #getActivityMakingCallType()
	 * @generated
	 */
	EAttribute getActivityMakingCallType_CallsMean();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityOrType <em>Activity Or Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Or Type</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityOrType
	 * @generated
	 */
	EClass getActivityOrType();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityOrType#getProb <em>Prob</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prob</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityOrType#getProb()
	 * @see #getActivityOrType()
	 * @generated
	 */
	EAttribute getActivityOrType_Prob();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityPhasesType <em>Activity Phases Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Phases Type</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityPhasesType
	 * @generated
	 */
	EClass getActivityPhasesType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityPhasesType#getCallList <em>Call List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Call List</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityPhasesType#getCallList()
	 * @see #getActivityPhasesType()
	 * @generated
	 */
	EReference getActivityPhasesType_CallList();

	/**
	 * Returns the meta object for the attribute list '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityPhasesType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityPhasesType#getGroup()
	 * @see #getActivityPhasesType()
	 * @generated
	 */
	EAttribute getActivityPhasesType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityPhasesType#getSynchCall <em>Synch Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Synch Call</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityPhasesType#getSynchCall()
	 * @see #getActivityPhasesType()
	 * @generated
	 */
	EReference getActivityPhasesType_SynchCall();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityPhasesType#getAsynchCall <em>Asynch Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Asynch Call</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityPhasesType#getAsynchCall()
	 * @see #getActivityPhasesType()
	 * @generated
	 */
	EReference getActivityPhasesType_AsynchCall();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityPhasesType#getPhase <em>Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityPhasesType#getPhase()
	 * @see #getActivityPhasesType()
	 * @generated
	 */
	EAttribute getActivityPhasesType_Phase();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityType <em>Activity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Type</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityType
	 * @generated
	 */
	EClass getActivityType();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityType#getName()
	 * @see #getActivityType()
	 * @generated
	 */
	EAttribute getActivityType_Name();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.AndJoinListType <em>And Join List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And Join List Type</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.AndJoinListType
	 * @generated
	 */
	EClass getAndJoinListType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.AndJoinListType#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activity</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.AndJoinListType#getActivity()
	 * @see #getAndJoinListType()
	 * @generated
	 */
	EReference getAndJoinListType_Activity();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.AndJoinListType#getQuorum <em>Quorum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quorum</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.AndJoinListType#getQuorum()
	 * @see #getAndJoinListType()
	 * @generated
	 */
	EAttribute getAndJoinListType_Quorum();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.AsynchCallType <em>Asynch Call Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asynch Call Type</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.AsynchCallType
	 * @generated
	 */
	EClass getAsynchCallType();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.BindType <em>Bind Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bind Type</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.BindType
	 * @generated
	 */
	EClass getBindType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.BindType#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.BindType#getParameter()
	 * @see #getBindType()
	 * @generated
	 */
	EReference getBindType_Parameter();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.BindType#getProcessorBinding <em>Processor Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Processor Binding</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.BindType#getProcessorBinding()
	 * @see #getBindType()
	 * @generated
	 */
	EReference getBindType_ProcessorBinding();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.BindType#getPortBinding <em>Port Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port Binding</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.BindType#getPortBinding()
	 * @see #getBindType()
	 * @generated
	 */
	EReference getBindType_PortBinding();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.CallListType <em>Call List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call List Type</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.CallListType
	 * @generated
	 */
	EClass getCallListType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.CallListType#getSynchCall <em>Synch Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Synch Call</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.CallListType#getSynchCall()
	 * @see #getCallListType()
	 * @generated
	 */
	EReference getCallListType_SynchCall();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.CallListType#getAsynchCall <em>Asynch Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Asynch Call</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.CallListType#getAsynchCall()
	 * @see #getCallListType()
	 * @generated
	 */
	EReference getCallListType_AsynchCall();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.LQN <em>LQN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LQN</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.LQN
	 * @generated
	 */
	EClass getLQN();

	/**
	 * Returns the meta object for the attribute list '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.LQN#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.LQN#getMixed()
	 * @see #getLQN()
	 * @generated
	 */
	EAttribute getLQN_Mixed();

	/**
	 * Returns the meta object for the map '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.LQN#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.LQN#getXMLNSPrefixMap()
	 * @see #getLQN()
	 * @generated
	 */
	EReference getLQN_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.LQN#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.LQN#getXSISchemaLocation()
	 * @see #getLQN()
	 * @generated
	 */
	EReference getLQN_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.LQN#getLqnCore <em>Lqn Core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lqn Core</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.LQN#getLqnCore()
	 * @see #getLQN()
	 * @generated
	 */
	EReference getLQN_LqnCore();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.LQN#getLqnModel <em>Lqn Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lqn Model</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.LQN#getLqnModel()
	 * @see #getLQN()
	 * @generated
	 */
	EReference getLQN_LqnModel();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.EntryActivityDefType <em>Entry Activity Def Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry Activity Def Type</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.EntryActivityDefType
	 * @generated
	 */
	EClass getEntryActivityDefType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.EntryActivityDefType#getCallList <em>Call List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Call List</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.EntryActivityDefType#getCallList()
	 * @see #getEntryActivityDefType()
	 * @generated
	 */
	EReference getEntryActivityDefType_CallList();

	/**
	 * Returns the meta object for the attribute list '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.EntryActivityDefType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.EntryActivityDefType#getGroup()
	 * @see #getEntryActivityDefType()
	 * @generated
	 */
	EAttribute getEntryActivityDefType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.EntryActivityDefType#getSynchCall <em>Synch Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Synch Call</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.EntryActivityDefType#getSynchCall()
	 * @see #getEntryActivityDefType()
	 * @generated
	 */
	EReference getEntryActivityDefType_SynchCall();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.EntryActivityDefType#getAsynchCall <em>Asynch Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Asynch Call</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.EntryActivityDefType#getAsynchCall()
	 * @see #getEntryActivityDefType()
	 * @generated
	 */
	EReference getEntryActivityDefType_AsynchCall();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.EntryActivityDefType#getFirstActivity <em>First Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Activity</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.EntryActivityDefType#getFirstActivity()
	 * @see #getEntryActivityDefType()
	 * @generated
	 */
	EAttribute getEntryActivityDefType_FirstActivity();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.EntryActivityGraph <em>Entry Activity Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry Activity Graph</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.EntryActivityGraph
	 * @generated
	 */
	EClass getEntryActivityGraph();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.EntryActivityGraph#getReplyActivity <em>Reply Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reply Activity</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.EntryActivityGraph#getReplyActivity()
	 * @see #getEntryActivityGraph()
	 * @generated
	 */
	EReference getEntryActivityGraph_ReplyActivity();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.EntryMakingCallType <em>Entry Making Call Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry Making Call Type</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.EntryMakingCallType
	 * @generated
	 */
	EClass getEntryMakingCallType();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.EntryMakingCallType#getProb <em>Prob</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prob</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.EntryMakingCallType#getProb()
	 * @see #getEntryMakingCallType()
	 * @generated
	 */
	EAttribute getEntryMakingCallType_Prob();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.EntryType <em>Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry Type</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.EntryType
	 * @generated
	 */
	EClass getEntryType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.EntryType#getResultEntry <em>Result Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Result Entry</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.EntryType#getResultEntry()
	 * @see #getEntryType()
	 * @generated
	 */
	EReference getEntryType_ResultEntry();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.EntryType#getServiceTimeDistribution <em>Service Time Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Time Distribution</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.EntryType#getServiceTimeDistribution()
	 * @see #getEntryType()
	 * @generated
	 */
	EReference getEntryType_ServiceTimeDistribution();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.EntryType#getForwarding <em>Forwarding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Forwarding</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.EntryType#getForwarding()
	 * @see #getEntryType()
	 * @generated
	 */
	EReference getEntryType_Forwarding();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.EntryType#getEntryActivityGraph <em>Entry Activity Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entry Activity Graph</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.EntryType#getEntryActivityGraph()
	 * @see #getEntryType()
	 * @generated
	 */
	EReference getEntryType_EntryActivityGraph();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.EntryType#getEntryPhaseActivities <em>Entry Phase Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entry Phase Activities</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.EntryType#getEntryPhaseActivities()
	 * @see #getEntryType()
	 * @generated
	 */
	EReference getEntryType_EntryPhaseActivities();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.EntryType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.EntryType#getName()
	 * @see #getEntryType()
	 * @generated
	 */
	EAttribute getEntryType_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.EntryType#getOpenArrivalRate <em>Open Arrival Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Open Arrival Rate</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.EntryType#getOpenArrivalRate()
	 * @see #getEntryType()
	 * @generated
	 */
	EAttribute getEntryType_OpenArrivalRate();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.EntryType#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.EntryType#getPriority()
	 * @see #getEntryType()
	 * @generated
	 */
	EAttribute getEntryType_Priority();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.EntryType#getSemaphore <em>Semaphore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semaphore</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.EntryType#getSemaphore()
	 * @see #getEntryType()
	 * @generated
	 */
	EAttribute getEntryType_Semaphore();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.EntryType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.EntryType#getType()
	 * @see #getEntryType()
	 * @generated
	 */
	EAttribute getEntryType_Type();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.FirstPlotType <em>First Plot Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>First Plot Type</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.FirstPlotType
	 * @generated
	 */
	EClass getFirstPlotType();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.FirstPlotType#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.FirstPlotType#getVariable()
	 * @see #getFirstPlotType()
	 * @generated
	 */
	EAttribute getFirstPlotType_Variable();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.HistogramBinType <em>Histogram Bin Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Histogram Bin Type</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.HistogramBinType
	 * @generated
	 */
	EClass getHistogramBinType();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.HistogramBinType#getBegin <em>Begin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Begin</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.HistogramBinType#getBegin()
	 * @see #getHistogramBinType()
	 * @generated
	 */
	EAttribute getHistogramBinType_Begin();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.HistogramBinType#getConf95 <em>Conf95</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conf95</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.HistogramBinType#getConf95()
	 * @see #getHistogramBinType()
	 * @generated
	 */
	EAttribute getHistogramBinType_Conf95();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.HistogramBinType#getConf99 <em>Conf99</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conf99</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.HistogramBinType#getConf99()
	 * @see #getHistogramBinType()
	 * @generated
	 */
	EAttribute getHistogramBinType_Conf99();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.HistogramBinType#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.HistogramBinType#getEnd()
	 * @see #getHistogramBinType()
	 * @generated
	 */
	EAttribute getHistogramBinType_End();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.HistogramBinType#getProb <em>Prob</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prob</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.HistogramBinType#getProb()
	 * @see #getHistogramBinType()
	 * @generated
	 */
	EAttribute getHistogramBinType_Prob();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.InPortType <em>In Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>In Port Type</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.InPortType
	 * @generated
	 */
	EClass getInPortType();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.InPortType#getConnectFrom <em>Connect From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connect From</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.InPortType#getConnectFrom()
	 * @see #getInPortType()
	 * @generated
	 */
	EAttribute getInPortType_ConnectFrom();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.InPortType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.InPortType#getDescription()
	 * @see #getInPortType()
	 * @generated
	 */
	EAttribute getInPortType_Description();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.InPortType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.InPortType#getName()
	 * @see #getInPortType()
	 * @generated
	 */
	EAttribute getInPortType_Name();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.InterfaceType <em>Interface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Type</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.InterfaceType
	 * @generated
	 */
	EClass getInterfaceType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.InterfaceType#getInPort <em>In Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>In Port</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.InterfaceType#getInPort()
	 * @see #getInterfaceType()
	 * @generated
	 */
	EReference getInterfaceType_InPort();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.InterfaceType#getOutPort <em>Out Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Out Port</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.InterfaceType#getOutPort()
	 * @see #getInterfaceType()
	 * @generated
	 */
	EReference getInterfaceType_OutPort();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.LqnCoreType <em>Lqn Core Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lqn Core Type</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.LqnCoreType
	 * @generated
	 */
	EClass getLqnCoreType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.LqnCoreType#getProcessor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Processor</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.LqnCoreType#getProcessor()
	 * @see #getLqnCoreType()
	 * @generated
	 */
	EReference getLqnCoreType_Processor();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.LqnCoreType#getSlot <em>Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Slot</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.LqnCoreType#getSlot()
	 * @see #getLqnCoreType()
	 * @generated
	 */
	EReference getLqnCoreType_Slot();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.LqnModelType <em>Lqn Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lqn Model Type</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.LqnModelType
	 * @generated
	 */
	EClass getLqnModelType();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.LqnModelType#getRunControl <em>Run Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Run Control</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.LqnModelType#getRunControl()
	 * @see #getLqnModelType()
	 * @generated
	 */
	EReference getLqnModelType_RunControl();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.LqnModelType#getPlotControl <em>Plot Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Plot Control</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.LqnModelType#getPlotControl()
	 * @see #getLqnModelType()
	 * @generated
	 */
	EReference getLqnModelType_PlotControl();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.LqnModelType#getSolverParams <em>Solver Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Solver Params</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.LqnModelType#getSolverParams()
	 * @see #getLqnModelType()
	 * @generated
	 */
	EReference getLqnModelType_SolverParams();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.LqnModelType#getProcessor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Processor</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.LqnModelType#getProcessor()
	 * @see #getLqnModelType()
	 * @generated
	 */
	EReference getLqnModelType_Processor();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.LqnModelType#getSlot <em>Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Slot</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.LqnModelType#getSlot()
	 * @see #getLqnModelType()
	 * @generated
	 */
	EReference getLqnModelType_Slot();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.LqnModelType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.LqnModelType#getDescription()
	 * @see #getLqnModelType()
	 * @generated
	 */
	EAttribute getLqnModelType_Description();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.LqnModelType#getLqncoreSchemaVersion <em>Lqncore Schema Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lqncore Schema Version</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.LqnModelType#getLqncoreSchemaVersion()
	 * @see #getLqnModelType()
	 * @generated
	 */
	EAttribute getLqnModelType_LqncoreSchemaVersion();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.LqnModelType#getLqnSchemaVersion <em>Lqn Schema Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lqn Schema Version</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.LqnModelType#getLqnSchemaVersion()
	 * @see #getLqnModelType()
	 * @generated
	 */
	EAttribute getLqnModelType_LqnSchemaVersion();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.LqnModelType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.LqnModelType#getName()
	 * @see #getLqnModelType()
	 * @generated
	 */
	EAttribute getLqnModelType_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.LqnModelType#getXmlDebug <em>Xml Debug</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xml Debug</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.LqnModelType#getXmlDebug()
	 * @see #getLqnModelType()
	 * @generated
	 */
	EAttribute getLqnModelType_XmlDebug();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.MakingCallType <em>Making Call Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Making Call Type</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.MakingCallType
	 * @generated
	 */
	EClass getMakingCallType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.MakingCallType#getResultCall <em>Result Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Result Call</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.MakingCallType#getResultCall()
	 * @see #getMakingCallType()
	 * @generated
	 */
	EReference getMakingCallType_ResultCall();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.MakingCallType#getDest <em>Dest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dest</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.MakingCallType#getDest()
	 * @see #getMakingCallType()
	 * @generated
	 */
	EAttribute getMakingCallType_Dest();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.MakingCallType#getFanin <em>Fanin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fanin</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.MakingCallType#getFanin()
	 * @see #getMakingCallType()
	 * @generated
	 */
	EAttribute getMakingCallType_Fanin();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.MakingCallType#getFanout <em>Fanout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fanout</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.MakingCallType#getFanout()
	 * @see #getMakingCallType()
	 * @generated
	 */
	EAttribute getMakingCallType_Fanout();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.OrListType <em>Or List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or List Type</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.OrListType
	 * @generated
	 */
	EClass getOrListType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.OrListType#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activity</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.OrListType#getActivity()
	 * @see #getOrListType()
	 * @generated
	 */
	EReference getOrListType_Activity();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.OutPortType <em>Out Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Out Port Type</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.OutPortType
	 * @generated
	 */
	EClass getOutPortType();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.OutPortType#getConnectTo <em>Connect To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connect To</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.OutPortType#getConnectTo()
	 * @see #getOutPortType()
	 * @generated
	 */
	EAttribute getOutPortType_ConnectTo();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.OutPortType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.OutPortType#getDescription()
	 * @see #getOutPortType()
	 * @generated
	 */
	EAttribute getOutPortType_Description();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.OutPortType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.OutPortType#getName()
	 * @see #getOutPortType()
	 * @generated
	 */
	EAttribute getOutPortType_Name();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputDistributionType <em>Output Distribution Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Distribution Type</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputDistributionType
	 * @generated
	 */
	EClass getOutputDistributionType();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputDistributionType#getUnderflowBin <em>Underflow Bin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Underflow Bin</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputDistributionType#getUnderflowBin()
	 * @see #getOutputDistributionType()
	 * @generated
	 */
	EReference getOutputDistributionType_UnderflowBin();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputDistributionType#getHistogramBin <em>Histogram Bin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Histogram Bin</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputDistributionType#getHistogramBin()
	 * @see #getOutputDistributionType()
	 * @generated
	 */
	EReference getOutputDistributionType_HistogramBin();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputDistributionType#getOverflowBin <em>Overflow Bin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Overflow Bin</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputDistributionType#getOverflowBin()
	 * @see #getOutputDistributionType()
	 * @generated
	 */
	EReference getOutputDistributionType_OverflowBin();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputDistributionType#getBinSize <em>Bin Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bin Size</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputDistributionType#getBinSize()
	 * @see #getOutputDistributionType()
	 * @generated
	 */
	EAttribute getOutputDistributionType_BinSize();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputDistributionType#getKurtosis <em>Kurtosis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kurtosis</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputDistributionType#getKurtosis()
	 * @see #getOutputDistributionType()
	 * @generated
	 */
	EAttribute getOutputDistributionType_Kurtosis();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputDistributionType#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputDistributionType#getMax()
	 * @see #getOutputDistributionType()
	 * @generated
	 */
	EAttribute getOutputDistributionType_Max();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputDistributionType#getMean <em>Mean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mean</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputDistributionType#getMean()
	 * @see #getOutputDistributionType()
	 * @generated
	 */
	EAttribute getOutputDistributionType_Mean();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputDistributionType#getMidPoint <em>Mid Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mid Point</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputDistributionType#getMidPoint()
	 * @see #getOutputDistributionType()
	 * @generated
	 */
	EAttribute getOutputDistributionType_MidPoint();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputDistributionType#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputDistributionType#getMin()
	 * @see #getOutputDistributionType()
	 * @generated
	 */
	EAttribute getOutputDistributionType_Min();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputDistributionType#getNumberBins <em>Number Bins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Bins</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputDistributionType#getNumberBins()
	 * @see #getOutputDistributionType()
	 * @generated
	 */
	EAttribute getOutputDistributionType_NumberBins();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputDistributionType#getSkew <em>Skew</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Skew</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputDistributionType#getSkew()
	 * @see #getOutputDistributionType()
	 * @generated
	 */
	EAttribute getOutputDistributionType_Skew();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputDistributionType#getStdDev <em>Std Dev</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Std Dev</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputDistributionType#getStdDev()
	 * @see #getOutputDistributionType()
	 * @generated
	 */
	EAttribute getOutputDistributionType_StdDev();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputDistributionType#getXSamples <em>XSamples</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XSamples</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputDistributionType#getXSamples()
	 * @see #getOutputDistributionType()
	 * @generated
	 */
	EAttribute getOutputDistributionType_XSamples();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputEntryDistributionType <em>Output Entry Distribution Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Entry Distribution Type</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputEntryDistributionType
	 * @generated
	 */
	EClass getOutputEntryDistributionType();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputEntryDistributionType#getPhase <em>Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputEntryDistributionType#getPhase()
	 * @see #getOutputEntryDistributionType()
	 * @generated
	 */
	EAttribute getOutputEntryDistributionType_Phase();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputResultForwardingANDJoinDelay <em>Output Result Forwarding AND Join Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Result Forwarding AND Join Delay</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputResultForwardingANDJoinDelay
	 * @generated
	 */
	EClass getOutputResultForwardingANDJoinDelay();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputResultForwardingANDJoinDelay#getResultConf95 <em>Result Conf95</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Result Conf95</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputResultForwardingANDJoinDelay#getResultConf95()
	 * @see #getOutputResultForwardingANDJoinDelay()
	 * @generated
	 */
	EReference getOutputResultForwardingANDJoinDelay_ResultConf95();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputResultForwardingANDJoinDelay#getResultConf99 <em>Result Conf99</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Result Conf99</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputResultForwardingANDJoinDelay#getResultConf99()
	 * @see #getOutputResultForwardingANDJoinDelay()
	 * @generated
	 */
	EReference getOutputResultForwardingANDJoinDelay_ResultConf99();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputResultForwardingANDJoinDelay#getDest <em>Dest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dest</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputResultForwardingANDJoinDelay#getDest()
	 * @see #getOutputResultForwardingANDJoinDelay()
	 * @generated
	 */
	EAttribute getOutputResultForwardingANDJoinDelay_Dest();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputResultForwardingANDJoinDelay#getJoinVariance <em>Join Variance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Join Variance</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputResultForwardingANDJoinDelay#getJoinVariance()
	 * @see #getOutputResultForwardingANDJoinDelay()
	 * @generated
	 */
	EAttribute getOutputResultForwardingANDJoinDelay_JoinVariance();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputResultForwardingANDJoinDelay#getJoinWaiting <em>Join Waiting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Join Waiting</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputResultForwardingANDJoinDelay#getJoinWaiting()
	 * @see #getOutputResultForwardingANDJoinDelay()
	 * @generated
	 */
	EAttribute getOutputResultForwardingANDJoinDelay_JoinWaiting();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputResultForwardingANDJoinDelay#getWaiting <em>Waiting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Waiting</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputResultForwardingANDJoinDelay#getWaiting()
	 * @see #getOutputResultForwardingANDJoinDelay()
	 * @generated
	 */
	EAttribute getOutputResultForwardingANDJoinDelay_Waiting();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputResultType <em>Output Result Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Result Type</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputResultType
	 * @generated
	 */
	EClass getOutputResultType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputResultType#getResultConf95 <em>Result Conf95</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Result Conf95</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputResultType#getResultConf95()
	 * @see #getOutputResultType()
	 * @generated
	 */
	EReference getOutputResultType_ResultConf95();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputResultType#getResultConf99 <em>Result Conf99</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Result Conf99</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputResultType#getResultConf99()
	 * @see #getOutputResultType()
	 * @generated
	 */
	EReference getOutputResultType_ResultConf99();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputResultType#getOpenWaitTime <em>Open Wait Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Open Wait Time</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputResultType#getOpenWaitTime()
	 * @see #getOutputResultType()
	 * @generated
	 */
	EAttribute getOutputResultType_OpenWaitTime();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputResultType#getPhase1ProcWaiting <em>Phase1 Proc Waiting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase1 Proc Waiting</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputResultType#getPhase1ProcWaiting()
	 * @see #getOutputResultType()
	 * @generated
	 */
	EAttribute getOutputResultType_Phase1ProcWaiting();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputResultType#getPhase1ServiceTime <em>Phase1 Service Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase1 Service Time</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputResultType#getPhase1ServiceTime()
	 * @see #getOutputResultType()
	 * @generated
	 */
	EAttribute getOutputResultType_Phase1ServiceTime();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputResultType#getPhase1ServiceTimeVariance <em>Phase1 Service Time Variance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase1 Service Time Variance</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputResultType#getPhase1ServiceTimeVariance()
	 * @see #getOutputResultType()
	 * @generated
	 */
	EAttribute getOutputResultType_Phase1ServiceTimeVariance();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputResultType#getPhase1Utilization <em>Phase1 Utilization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase1 Utilization</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputResultType#getPhase1Utilization()
	 * @see #getOutputResultType()
	 * @generated
	 */
	EAttribute getOutputResultType_Phase1Utilization();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputResultType#getPhase2ProcWaiting <em>Phase2 Proc Waiting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase2 Proc Waiting</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputResultType#getPhase2ProcWaiting()
	 * @see #getOutputResultType()
	 * @generated
	 */
	EAttribute getOutputResultType_Phase2ProcWaiting();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputResultType#getPhase2ServiceTime <em>Phase2 Service Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase2 Service Time</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputResultType#getPhase2ServiceTime()
	 * @see #getOutputResultType()
	 * @generated
	 */
	EAttribute getOutputResultType_Phase2ServiceTime();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputResultType#getPhase2ServiceTimeVariance <em>Phase2 Service Time Variance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase2 Service Time Variance</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputResultType#getPhase2ServiceTimeVariance()
	 * @see #getOutputResultType()
	 * @generated
	 */
	EAttribute getOutputResultType_Phase2ServiceTimeVariance();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputResultType#getPhase2Utilization <em>Phase2 Utilization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase2 Utilization</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputResultType#getPhase2Utilization()
	 * @see #getOutputResultType()
	 * @generated
	 */
	EAttribute getOutputResultType_Phase2Utilization();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputResultType#getPhase3ProcWaiting <em>Phase3 Proc Waiting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase3 Proc Waiting</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputResultType#getPhase3ProcWaiting()
	 * @see #getOutputResultType()
	 * @generated
	 */
	EAttribute getOutputResultType_Phase3ProcWaiting();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputResultType#getPhase3ServiceTime <em>Phase3 Service Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase3 Service Time</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputResultType#getPhase3ServiceTime()
	 * @see #getOutputResultType()
	 * @generated
	 */
	EAttribute getOutputResultType_Phase3ServiceTime();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputResultType#getPhase3ServiceTimeVariance <em>Phase3 Service Time Variance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase3 Service Time Variance</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputResultType#getPhase3ServiceTimeVariance()
	 * @see #getOutputResultType()
	 * @generated
	 */
	EAttribute getOutputResultType_Phase3ServiceTimeVariance();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputResultType#getPhase3Utilization <em>Phase3 Utilization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase3 Utilization</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputResultType#getPhase3Utilization()
	 * @see #getOutputResultType()
	 * @generated
	 */
	EAttribute getOutputResultType_Phase3Utilization();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputResultType#getProbExceedMaxServiceTime <em>Prob Exceed Max Service Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prob Exceed Max Service Time</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputResultType#getProbExceedMaxServiceTime()
	 * @see #getOutputResultType()
	 * @generated
	 */
	EAttribute getOutputResultType_ProbExceedMaxServiceTime();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputResultType#getProcUtilization <em>Proc Utilization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Proc Utilization</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputResultType#getProcUtilization()
	 * @see #getOutputResultType()
	 * @generated
	 */
	EAttribute getOutputResultType_ProcUtilization();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputResultType#getProcWaiting <em>Proc Waiting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Proc Waiting</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputResultType#getProcWaiting()
	 * @see #getOutputResultType()
	 * @generated
	 */
	EAttribute getOutputResultType_ProcWaiting();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputResultType#getServiceTime <em>Service Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Time</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputResultType#getServiceTime()
	 * @see #getOutputResultType()
	 * @generated
	 */
	EAttribute getOutputResultType_ServiceTime();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputResultType#getServiceTimeVariance <em>Service Time Variance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Time Variance</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputResultType#getServiceTimeVariance()
	 * @see #getOutputResultType()
	 * @generated
	 */
	EAttribute getOutputResultType_ServiceTimeVariance();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputResultType#getSquaredCoeffVariation <em>Squared Coeff Variation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Squared Coeff Variation</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputResultType#getSquaredCoeffVariation()
	 * @see #getOutputResultType()
	 * @generated
	 */
	EAttribute getOutputResultType_SquaredCoeffVariation();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputResultType#getThroughput <em>Throughput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Throughput</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputResultType#getThroughput()
	 * @see #getOutputResultType()
	 * @generated
	 */
	EAttribute getOutputResultType_Throughput();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputResultType#getThroughputBound <em>Throughput Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Throughput Bound</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputResultType#getThroughputBound()
	 * @see #getOutputResultType()
	 * @generated
	 */
	EAttribute getOutputResultType_ThroughputBound();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputResultType#getUtilization <em>Utilization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Utilization</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputResultType#getUtilization()
	 * @see #getOutputResultType()
	 * @generated
	 */
	EAttribute getOutputResultType_Utilization();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputResultType#getWaiting <em>Waiting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Waiting</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputResultType#getWaiting()
	 * @see #getOutputResultType()
	 * @generated
	 */
	EAttribute getOutputResultType_Waiting();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputResultType#getWaitingVariance <em>Waiting Variance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Waiting Variance</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputResultType#getWaitingVariance()
	 * @see #getOutputResultType()
	 * @generated
	 */
	EAttribute getOutputResultType_WaitingVariance();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Type</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ParameterType
	 * @generated
	 */
	EClass getParameterType();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ParameterType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ParameterType#getName()
	 * @see #getParameterType()
	 * @generated
	 */
	EAttribute getParameterType_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ParameterType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ParameterType#getValue()
	 * @see #getParameterType()
	 * @generated
	 */
	EAttribute getParameterType_Value();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ParaType <em>Para Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Para Type</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ParaType
	 * @generated
	 */
	EClass getParaType();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ParaType#getStartValue <em>Start Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Value</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ParaType#getStartValue()
	 * @see #getParaType()
	 * @generated
	 */
	EAttribute getParaType_StartValue();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ParaType#getEndValue <em>End Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Value</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ParaType#getEndValue()
	 * @see #getParaType()
	 * @generated
	 */
	EAttribute getParaType_EndValue();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ParaType#getStepValue <em>Step Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step Value</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ParaType#getStepValue()
	 * @see #getParaType()
	 * @generated
	 */
	EAttribute getParaType_StepValue();

	/**
	 * Returns the meta object for the attribute list '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ParaType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ParaType#getValue()
	 * @see #getParaType()
	 * @generated
	 */
	EAttribute getParaType_Value();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.PhaseActivities <em>Phase Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Phase Activities</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.PhaseActivities
	 * @generated
	 */
	EClass getPhaseActivities();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.PhaseActivities#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activity</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.PhaseActivities#getActivity()
	 * @see #getPhaseActivities()
	 * @generated
	 */
	EReference getPhaseActivities_Activity();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.PlotControlType <em>Plot Control Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plot Control Type</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.PlotControlType
	 * @generated
	 */
	EClass getPlotControlType();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.PlotControlType#getFirstPlot <em>First Plot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>First Plot</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.PlotControlType#getFirstPlot()
	 * @see #getPlotControlType()
	 * @generated
	 */
	EReference getPlotControlType_FirstPlot();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.PlotControlType#getPlot <em>Plot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Plot</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.PlotControlType#getPlot()
	 * @see #getPlotControlType()
	 * @generated
	 */
	EReference getPlotControlType_Plot();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.PlotType <em>Plot Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plot Type</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.PlotType
	 * @generated
	 */
	EClass getPlotType();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.PlotType#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.PlotType#getVariable()
	 * @see #getPlotType()
	 * @generated
	 */
	EAttribute getPlotType_Variable();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.PortBindingType <em>Port Binding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Binding Type</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.PortBindingType
	 * @generated
	 */
	EClass getPortBindingType();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.PortBindingType#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.PortBindingType#getSource()
	 * @see #getPortBindingType()
	 * @generated
	 */
	EAttribute getPortBindingType_Source();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.PortBindingType#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.PortBindingType#getTarget()
	 * @see #getPortBindingType()
	 * @generated
	 */
	EAttribute getPortBindingType_Target();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.PragmaType <em>Pragma Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pragma Type</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.PragmaType
	 * @generated
	 */
	EClass getPragmaType();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.PragmaType#getParam <em>Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Param</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.PragmaType#getParam()
	 * @see #getPragmaType()
	 * @generated
	 */
	EAttribute getPragmaType_Param();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.PragmaType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.PragmaType#getValue()
	 * @see #getPragmaType()
	 * @generated
	 */
	EAttribute getPragmaType_Value();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.PrecedenceType <em>Precedence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Precedence Type</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.PrecedenceType
	 * @generated
	 */
	EClass getPrecedenceType();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.PrecedenceType#getPre <em>Pre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pre</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.PrecedenceType#getPre()
	 * @see #getPrecedenceType()
	 * @generated
	 */
	EReference getPrecedenceType_Pre();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.PrecedenceType#getPreOR <em>Pre OR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pre OR</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.PrecedenceType#getPreOR()
	 * @see #getPrecedenceType()
	 * @generated
	 */
	EReference getPrecedenceType_PreOR();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.PrecedenceType#getPreAND <em>Pre AND</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pre AND</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.PrecedenceType#getPreAND()
	 * @see #getPrecedenceType()
	 * @generated
	 */
	EReference getPrecedenceType_PreAND();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.PrecedenceType#getPost <em>Post</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.PrecedenceType#getPost()
	 * @see #getPrecedenceType()
	 * @generated
	 */
	EReference getPrecedenceType_Post();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.PrecedenceType#getPostOR <em>Post OR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post OR</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.PrecedenceType#getPostOR()
	 * @see #getPrecedenceType()
	 * @generated
	 */
	EReference getPrecedenceType_PostOR();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.PrecedenceType#getPostAND <em>Post AND</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post AND</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.PrecedenceType#getPostAND()
	 * @see #getPrecedenceType()
	 * @generated
	 */
	EReference getPrecedenceType_PostAND();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.PrecedenceType#getPostLOOP <em>Post LOOP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post LOOP</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.PrecedenceType#getPostLOOP()
	 * @see #getPrecedenceType()
	 * @generated
	 */
	EReference getPrecedenceType_PostLOOP();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ProcessorBindingType <em>Processor Binding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processor Binding Type</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ProcessorBindingType
	 * @generated
	 */
	EClass getProcessorBindingType();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ProcessorBindingType#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ProcessorBindingType#getSource()
	 * @see #getProcessorBindingType()
	 * @generated
	 */
	EAttribute getProcessorBindingType_Source();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ProcessorBindingType#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ProcessorBindingType#getTarget()
	 * @see #getProcessorBindingType()
	 * @generated
	 */
	EAttribute getProcessorBindingType_Target();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ProcessorType <em>Processor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processor Type</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ProcessorType
	 * @generated
	 */
	EClass getProcessorType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ProcessorType#getResultProcessor <em>Result Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Result Processor</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ProcessorType#getResultProcessor()
	 * @see #getProcessorType()
	 * @generated
	 */
	EReference getProcessorType_ResultProcessor();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ProcessorType#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Task</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ProcessorType#getTask()
	 * @see #getProcessorType()
	 * @generated
	 */
	EReference getProcessorType_Task();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ProcessorType#getMultiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ProcessorType#getMultiplicity()
	 * @see #getProcessorType()
	 * @generated
	 */
	EAttribute getProcessorType_Multiplicity();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ProcessorType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ProcessorType#getName()
	 * @see #getProcessorType()
	 * @generated
	 */
	EAttribute getProcessorType_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ProcessorType#getQuantum <em>Quantum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantum</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ProcessorType#getQuantum()
	 * @see #getProcessorType()
	 * @generated
	 */
	EAttribute getProcessorType_Quantum();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ProcessorType#getReplication <em>Replication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Replication</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ProcessorType#getReplication()
	 * @see #getProcessorType()
	 * @generated
	 */
	EAttribute getProcessorType_Replication();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ProcessorType#getScheduling <em>Scheduling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scheduling</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ProcessorType#getScheduling()
	 * @see #getProcessorType()
	 * @generated
	 */
	EAttribute getProcessorType_Scheduling();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ProcessorType#getSpeedFactor <em>Speed Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed Factor</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ProcessorType#getSpeedFactor()
	 * @see #getProcessorType()
	 * @generated
	 */
	EAttribute getProcessorType_SpeedFactor();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ReplyActivityType <em>Reply Activity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reply Activity Type</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ReplyActivityType
	 * @generated
	 */
	EClass getReplyActivityType();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ReplyActivityType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ReplyActivityType#getName()
	 * @see #getReplyActivityType()
	 * @generated
	 */
	EAttribute getReplyActivityType_Name();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ReplyEntryType <em>Reply Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reply Entry Type</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ReplyEntryType
	 * @generated
	 */
	EClass getReplyEntryType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ReplyEntryType#getReplyActivity <em>Reply Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reply Activity</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ReplyEntryType#getReplyActivity()
	 * @see #getReplyEntryType()
	 * @generated
	 */
	EReference getReplyEntryType_ReplyActivity();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ReplyEntryType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ReplyEntryType#getName()
	 * @see #getReplyEntryType()
	 * @generated
	 */
	EAttribute getReplyEntryType_Name();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf95Type <em>Result Conf95 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result Conf95 Type</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf95Type
	 * @generated
	 */
	EClass getResultConf95Type();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf95Type#getJoinVariance <em>Join Variance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Join Variance</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf95Type#getJoinVariance()
	 * @see #getResultConf95Type()
	 * @generated
	 */
	EAttribute getResultConf95Type_JoinVariance();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf95Type#getJoinWaiting <em>Join Waiting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Join Waiting</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf95Type#getJoinWaiting()
	 * @see #getResultConf95Type()
	 * @generated
	 */
	EAttribute getResultConf95Type_JoinWaiting();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf95Type#getWaiting <em>Waiting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Waiting</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf95Type#getWaiting()
	 * @see #getResultConf95Type()
	 * @generated
	 */
	EAttribute getResultConf95Type_Waiting();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf95Type1 <em>Result Conf95 Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result Conf95 Type1</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf95Type1
	 * @generated
	 */
	EClass getResultConf95Type1();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf95Type1#getOpenWaitTime <em>Open Wait Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Open Wait Time</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf95Type1#getOpenWaitTime()
	 * @see #getResultConf95Type1()
	 * @generated
	 */
	EAttribute getResultConf95Type1_OpenWaitTime();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf95Type1#getPhase1ProcWaiting <em>Phase1 Proc Waiting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase1 Proc Waiting</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf95Type1#getPhase1ProcWaiting()
	 * @see #getResultConf95Type1()
	 * @generated
	 */
	EAttribute getResultConf95Type1_Phase1ProcWaiting();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf95Type1#getPhase1ServiceTime <em>Phase1 Service Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase1 Service Time</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf95Type1#getPhase1ServiceTime()
	 * @see #getResultConf95Type1()
	 * @generated
	 */
	EAttribute getResultConf95Type1_Phase1ServiceTime();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf95Type1#getPhase1ServiceTimeVariance <em>Phase1 Service Time Variance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase1 Service Time Variance</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf95Type1#getPhase1ServiceTimeVariance()
	 * @see #getResultConf95Type1()
	 * @generated
	 */
	EAttribute getResultConf95Type1_Phase1ServiceTimeVariance();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf95Type1#getPhase1Utilization <em>Phase1 Utilization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase1 Utilization</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf95Type1#getPhase1Utilization()
	 * @see #getResultConf95Type1()
	 * @generated
	 */
	EAttribute getResultConf95Type1_Phase1Utilization();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf95Type1#getPhase2ProcWaiting <em>Phase2 Proc Waiting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase2 Proc Waiting</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf95Type1#getPhase2ProcWaiting()
	 * @see #getResultConf95Type1()
	 * @generated
	 */
	EAttribute getResultConf95Type1_Phase2ProcWaiting();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf95Type1#getPhase2ServiceTime <em>Phase2 Service Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase2 Service Time</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf95Type1#getPhase2ServiceTime()
	 * @see #getResultConf95Type1()
	 * @generated
	 */
	EAttribute getResultConf95Type1_Phase2ServiceTime();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf95Type1#getPhase2ServiceTimeVariance <em>Phase2 Service Time Variance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase2 Service Time Variance</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf95Type1#getPhase2ServiceTimeVariance()
	 * @see #getResultConf95Type1()
	 * @generated
	 */
	EAttribute getResultConf95Type1_Phase2ServiceTimeVariance();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf95Type1#getPhase2Utilization <em>Phase2 Utilization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase2 Utilization</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf95Type1#getPhase2Utilization()
	 * @see #getResultConf95Type1()
	 * @generated
	 */
	EAttribute getResultConf95Type1_Phase2Utilization();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf95Type1#getPhase3ProcWaiting <em>Phase3 Proc Waiting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase3 Proc Waiting</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf95Type1#getPhase3ProcWaiting()
	 * @see #getResultConf95Type1()
	 * @generated
	 */
	EAttribute getResultConf95Type1_Phase3ProcWaiting();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf95Type1#getPhase3ServiceTime <em>Phase3 Service Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase3 Service Time</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf95Type1#getPhase3ServiceTime()
	 * @see #getResultConf95Type1()
	 * @generated
	 */
	EAttribute getResultConf95Type1_Phase3ServiceTime();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf95Type1#getPhase3ServiceTimeVariance <em>Phase3 Service Time Variance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase3 Service Time Variance</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf95Type1#getPhase3ServiceTimeVariance()
	 * @see #getResultConf95Type1()
	 * @generated
	 */
	EAttribute getResultConf95Type1_Phase3ServiceTimeVariance();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf95Type1#getPhase3Utilization <em>Phase3 Utilization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase3 Utilization</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf95Type1#getPhase3Utilization()
	 * @see #getResultConf95Type1()
	 * @generated
	 */
	EAttribute getResultConf95Type1_Phase3Utilization();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf95Type1#getProbExceedMaxServiceTime <em>Prob Exceed Max Service Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prob Exceed Max Service Time</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf95Type1#getProbExceedMaxServiceTime()
	 * @see #getResultConf95Type1()
	 * @generated
	 */
	EAttribute getResultConf95Type1_ProbExceedMaxServiceTime();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf95Type1#getProcUtilization <em>Proc Utilization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Proc Utilization</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf95Type1#getProcUtilization()
	 * @see #getResultConf95Type1()
	 * @generated
	 */
	EAttribute getResultConf95Type1_ProcUtilization();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf95Type1#getProcWaiting <em>Proc Waiting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Proc Waiting</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf95Type1#getProcWaiting()
	 * @see #getResultConf95Type1()
	 * @generated
	 */
	EAttribute getResultConf95Type1_ProcWaiting();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf95Type1#getServiceTime <em>Service Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Time</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf95Type1#getServiceTime()
	 * @see #getResultConf95Type1()
	 * @generated
	 */
	EAttribute getResultConf95Type1_ServiceTime();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf95Type1#getServiceTimeVariance <em>Service Time Variance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Time Variance</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf95Type1#getServiceTimeVariance()
	 * @see #getResultConf95Type1()
	 * @generated
	 */
	EAttribute getResultConf95Type1_ServiceTimeVariance();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf95Type1#getSquaredCoeffVariation <em>Squared Coeff Variation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Squared Coeff Variation</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf95Type1#getSquaredCoeffVariation()
	 * @see #getResultConf95Type1()
	 * @generated
	 */
	EAttribute getResultConf95Type1_SquaredCoeffVariation();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf95Type1#getThroughput <em>Throughput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Throughput</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf95Type1#getThroughput()
	 * @see #getResultConf95Type1()
	 * @generated
	 */
	EAttribute getResultConf95Type1_Throughput();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf95Type1#getThroughputBound <em>Throughput Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Throughput Bound</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf95Type1#getThroughputBound()
	 * @see #getResultConf95Type1()
	 * @generated
	 */
	EAttribute getResultConf95Type1_ThroughputBound();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf95Type1#getUtilization <em>Utilization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Utilization</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf95Type1#getUtilization()
	 * @see #getResultConf95Type1()
	 * @generated
	 */
	EAttribute getResultConf95Type1_Utilization();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf95Type1#getWaiting <em>Waiting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Waiting</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf95Type1#getWaiting()
	 * @see #getResultConf95Type1()
	 * @generated
	 */
	EAttribute getResultConf95Type1_Waiting();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf95Type1#getWaitingVariance <em>Waiting Variance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Waiting Variance</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf95Type1#getWaitingVariance()
	 * @see #getResultConf95Type1()
	 * @generated
	 */
	EAttribute getResultConf95Type1_WaitingVariance();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf99Type <em>Result Conf99 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result Conf99 Type</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf99Type
	 * @generated
	 */
	EClass getResultConf99Type();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf99Type#getJoinVariance <em>Join Variance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Join Variance</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf99Type#getJoinVariance()
	 * @see #getResultConf99Type()
	 * @generated
	 */
	EAttribute getResultConf99Type_JoinVariance();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf99Type#getJoinWaiting <em>Join Waiting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Join Waiting</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf99Type#getJoinWaiting()
	 * @see #getResultConf99Type()
	 * @generated
	 */
	EAttribute getResultConf99Type_JoinWaiting();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf99Type#getWaiting <em>Waiting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Waiting</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf99Type#getWaiting()
	 * @see #getResultConf99Type()
	 * @generated
	 */
	EAttribute getResultConf99Type_Waiting();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf99Type1 <em>Result Conf99 Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result Conf99 Type1</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf99Type1
	 * @generated
	 */
	EClass getResultConf99Type1();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf99Type1#getOpenWaitTime <em>Open Wait Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Open Wait Time</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf99Type1#getOpenWaitTime()
	 * @see #getResultConf99Type1()
	 * @generated
	 */
	EAttribute getResultConf99Type1_OpenWaitTime();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf99Type1#getPhase1ProcWaiting <em>Phase1 Proc Waiting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase1 Proc Waiting</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf99Type1#getPhase1ProcWaiting()
	 * @see #getResultConf99Type1()
	 * @generated
	 */
	EAttribute getResultConf99Type1_Phase1ProcWaiting();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf99Type1#getPhase1ServiceTime <em>Phase1 Service Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase1 Service Time</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf99Type1#getPhase1ServiceTime()
	 * @see #getResultConf99Type1()
	 * @generated
	 */
	EAttribute getResultConf99Type1_Phase1ServiceTime();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf99Type1#getPhase1ServiceTimeVariance <em>Phase1 Service Time Variance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase1 Service Time Variance</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf99Type1#getPhase1ServiceTimeVariance()
	 * @see #getResultConf99Type1()
	 * @generated
	 */
	EAttribute getResultConf99Type1_Phase1ServiceTimeVariance();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf99Type1#getPhase1Utilization <em>Phase1 Utilization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase1 Utilization</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf99Type1#getPhase1Utilization()
	 * @see #getResultConf99Type1()
	 * @generated
	 */
	EAttribute getResultConf99Type1_Phase1Utilization();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf99Type1#getPhase2ProcWaiting <em>Phase2 Proc Waiting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase2 Proc Waiting</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf99Type1#getPhase2ProcWaiting()
	 * @see #getResultConf99Type1()
	 * @generated
	 */
	EAttribute getResultConf99Type1_Phase2ProcWaiting();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf99Type1#getPhase2ServiceTime <em>Phase2 Service Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase2 Service Time</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf99Type1#getPhase2ServiceTime()
	 * @see #getResultConf99Type1()
	 * @generated
	 */
	EAttribute getResultConf99Type1_Phase2ServiceTime();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf99Type1#getPhase2ServiceTimeVariance <em>Phase2 Service Time Variance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase2 Service Time Variance</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf99Type1#getPhase2ServiceTimeVariance()
	 * @see #getResultConf99Type1()
	 * @generated
	 */
	EAttribute getResultConf99Type1_Phase2ServiceTimeVariance();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf99Type1#getPhase2Utilization <em>Phase2 Utilization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase2 Utilization</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf99Type1#getPhase2Utilization()
	 * @see #getResultConf99Type1()
	 * @generated
	 */
	EAttribute getResultConf99Type1_Phase2Utilization();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf99Type1#getPhase3ProcWaiting <em>Phase3 Proc Waiting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase3 Proc Waiting</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf99Type1#getPhase3ProcWaiting()
	 * @see #getResultConf99Type1()
	 * @generated
	 */
	EAttribute getResultConf99Type1_Phase3ProcWaiting();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf99Type1#getPhase3ServiceTime <em>Phase3 Service Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase3 Service Time</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf99Type1#getPhase3ServiceTime()
	 * @see #getResultConf99Type1()
	 * @generated
	 */
	EAttribute getResultConf99Type1_Phase3ServiceTime();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf99Type1#getPhase3ServiceTimeVariance <em>Phase3 Service Time Variance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase3 Service Time Variance</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf99Type1#getPhase3ServiceTimeVariance()
	 * @see #getResultConf99Type1()
	 * @generated
	 */
	EAttribute getResultConf99Type1_Phase3ServiceTimeVariance();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf99Type1#getPhase3Utilization <em>Phase3 Utilization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase3 Utilization</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf99Type1#getPhase3Utilization()
	 * @see #getResultConf99Type1()
	 * @generated
	 */
	EAttribute getResultConf99Type1_Phase3Utilization();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf99Type1#getProbExceedMaxServiceTime <em>Prob Exceed Max Service Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prob Exceed Max Service Time</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf99Type1#getProbExceedMaxServiceTime()
	 * @see #getResultConf99Type1()
	 * @generated
	 */
	EAttribute getResultConf99Type1_ProbExceedMaxServiceTime();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf99Type1#getProcUtilization <em>Proc Utilization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Proc Utilization</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf99Type1#getProcUtilization()
	 * @see #getResultConf99Type1()
	 * @generated
	 */
	EAttribute getResultConf99Type1_ProcUtilization();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf99Type1#getProcWaiting <em>Proc Waiting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Proc Waiting</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf99Type1#getProcWaiting()
	 * @see #getResultConf99Type1()
	 * @generated
	 */
	EAttribute getResultConf99Type1_ProcWaiting();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf99Type1#getServiceTime <em>Service Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Time</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf99Type1#getServiceTime()
	 * @see #getResultConf99Type1()
	 * @generated
	 */
	EAttribute getResultConf99Type1_ServiceTime();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf99Type1#getServiceTimeVariance <em>Service Time Variance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Time Variance</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf99Type1#getServiceTimeVariance()
	 * @see #getResultConf99Type1()
	 * @generated
	 */
	EAttribute getResultConf99Type1_ServiceTimeVariance();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf99Type1#getSquaredCoeffVariation <em>Squared Coeff Variation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Squared Coeff Variation</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf99Type1#getSquaredCoeffVariation()
	 * @see #getResultConf99Type1()
	 * @generated
	 */
	EAttribute getResultConf99Type1_SquaredCoeffVariation();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf99Type1#getThroughput <em>Throughput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Throughput</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf99Type1#getThroughput()
	 * @see #getResultConf99Type1()
	 * @generated
	 */
	EAttribute getResultConf99Type1_Throughput();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf99Type1#getThroughputBound <em>Throughput Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Throughput Bound</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf99Type1#getThroughputBound()
	 * @see #getResultConf99Type1()
	 * @generated
	 */
	EAttribute getResultConf99Type1_ThroughputBound();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf99Type1#getUtilization <em>Utilization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Utilization</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf99Type1#getUtilization()
	 * @see #getResultConf99Type1()
	 * @generated
	 */
	EAttribute getResultConf99Type1_Utilization();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf99Type1#getWaiting <em>Waiting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Waiting</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf99Type1#getWaiting()
	 * @see #getResultConf99Type1()
	 * @generated
	 */
	EAttribute getResultConf99Type1_Waiting();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf99Type1#getWaitingVariance <em>Waiting Variance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Waiting Variance</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf99Type1#getWaitingVariance()
	 * @see #getResultConf99Type1()
	 * @generated
	 */
	EAttribute getResultConf99Type1_WaitingVariance();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultGeneralType <em>Result General Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result General Type</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultGeneralType
	 * @generated
	 */
	EClass getResultGeneralType();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultGeneralType#getConvVal <em>Conv Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conv Val</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultGeneralType#getConvVal()
	 * @see #getResultGeneralType()
	 * @generated
	 */
	EAttribute getResultGeneralType_ConvVal();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultGeneralType#getElapsedTime <em>Elapsed Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Elapsed Time</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultGeneralType#getElapsedTime()
	 * @see #getResultGeneralType()
	 * @generated
	 */
	EAttribute getResultGeneralType_ElapsedTime();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultGeneralType#getIterations <em>Iterations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iterations</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultGeneralType#getIterations()
	 * @see #getResultGeneralType()
	 * @generated
	 */
	EAttribute getResultGeneralType_Iterations();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultGeneralType#getPlatformInfo <em>Platform Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Platform Info</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultGeneralType#getPlatformInfo()
	 * @see #getResultGeneralType()
	 * @generated
	 */
	EAttribute getResultGeneralType_PlatformInfo();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultGeneralType#getSolverInfo <em>Solver Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Solver Info</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultGeneralType#getSolverInfo()
	 * @see #getResultGeneralType()
	 * @generated
	 */
	EAttribute getResultGeneralType_SolverInfo();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultGeneralType#getSystemCpuTime <em>System Cpu Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Cpu Time</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultGeneralType#getSystemCpuTime()
	 * @see #getResultGeneralType()
	 * @generated
	 */
	EAttribute getResultGeneralType_SystemCpuTime();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultGeneralType#getUserCpuTime <em>User Cpu Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Cpu Time</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultGeneralType#getUserCpuTime()
	 * @see #getResultGeneralType()
	 * @generated
	 */
	EAttribute getResultGeneralType_UserCpuTime();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultGeneralType#getValid <em>Valid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultGeneralType#getValid()
	 * @see #getResultGeneralType()
	 * @generated
	 */
	EAttribute getResultGeneralType_Valid();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.RunControlType <em>Run Control Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Run Control Type</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.RunControlType
	 * @generated
	 */
	EClass getRunControlType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.RunControlType#getPara <em>Para</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Para</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.RunControlType#getPara()
	 * @see #getRunControlType()
	 * @generated
	 */
	EReference getRunControlType_Para();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ServiceType <em>Service Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Type</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ServiceType
	 * @generated
	 */
	EClass getServiceType();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ServiceType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ServiceType#getName()
	 * @see #getServiceType()
	 * @generated
	 */
	EAttribute getServiceType_Name();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.SingleActivityListType <em>Single Activity List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Activity List Type</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.SingleActivityListType
	 * @generated
	 */
	EClass getSingleActivityListType();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.SingleActivityListType#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activity</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.SingleActivityListType#getActivity()
	 * @see #getSingleActivityListType()
	 * @generated
	 */
	EReference getSingleActivityListType_Activity();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.SlotType <em>Slot Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Slot Type</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.SlotType
	 * @generated
	 */
	EClass getSlotType();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.SlotType#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interface</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.SlotType#getInterface()
	 * @see #getSlotType()
	 * @generated
	 */
	EReference getSlotType_Interface();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.SlotType#getBinding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Binding</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.SlotType#getBinding()
	 * @see #getSlotType()
	 * @generated
	 */
	EReference getSlotType_Binding();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.SlotType#getBindTarget <em>Bind Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bind Target</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.SlotType#getBindTarget()
	 * @see #getSlotType()
	 * @generated
	 */
	EAttribute getSlotType_BindTarget();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.SlotType#getReplicNum <em>Replic Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Replic Num</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.SlotType#getReplicNum()
	 * @see #getSlotType()
	 * @generated
	 */
	EAttribute getSlotType_ReplicNum();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.SolverParamsType <em>Solver Params Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solver Params Type</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.SolverParamsType
	 * @generated
	 */
	EClass getSolverParamsType();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.SolverParamsType#getResultGeneral <em>Result General</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result General</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.SolverParamsType#getResultGeneral()
	 * @see #getSolverParamsType()
	 * @generated
	 */
	EReference getSolverParamsType_ResultGeneral();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.SolverParamsType#getPragma <em>Pragma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pragma</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.SolverParamsType#getPragma()
	 * @see #getSolverParamsType()
	 * @generated
	 */
	EReference getSolverParamsType_Pragma();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.SolverParamsType#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.SolverParamsType#getComment()
	 * @see #getSolverParamsType()
	 * @generated
	 */
	EAttribute getSolverParamsType_Comment();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.SolverParamsType#getConvVal <em>Conv Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conv Val</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.SolverParamsType#getConvVal()
	 * @see #getSolverParamsType()
	 * @generated
	 */
	EAttribute getSolverParamsType_ConvVal();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.SolverParamsType#getItLimit <em>It Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>It Limit</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.SolverParamsType#getItLimit()
	 * @see #getSolverParamsType()
	 * @generated
	 */
	EAttribute getSolverParamsType_ItLimit();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.SolverParamsType#getPrintInt <em>Print Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Print Int</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.SolverParamsType#getPrintInt()
	 * @see #getSolverParamsType()
	 * @generated
	 */
	EAttribute getSolverParamsType_PrintInt();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.SolverParamsType#getUnderrelaxCoeff <em>Underrelax Coeff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Underrelax Coeff</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.SolverParamsType#getUnderrelaxCoeff()
	 * @see #getSolverParamsType()
	 * @generated
	 */
	EAttribute getSolverParamsType_UnderrelaxCoeff();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.CallType <em>Call Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Type</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.CallType
	 * @generated
	 */
	EClass getCallType();

	/**
	 * Returns the meta object for the reference '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.CallType#getDest <em>Dest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dest</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.CallType#getDest()
	 * @see #getCallType()
	 * @generated
	 */
	EReference getCallType_Dest();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.CallType#getFanin <em>Fanin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fanin</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.CallType#getFanin()
	 * @see #getCallType()
	 * @generated
	 */
	EAttribute getCallType_Fanin();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.CallType#getFanout <em>Fanout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fanout</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.CallType#getFanout()
	 * @see #getCallType()
	 * @generated
	 */
	EAttribute getCallType_Fanout();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.SynchCallType <em>Synch Call Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Synch Call Type</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.SynchCallType
	 * @generated
	 */
	EClass getSynchCallType();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.TaskActivityGraph <em>Task Activity Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Activity Graph</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.TaskActivityGraph
	 * @generated
	 */
	EClass getTaskActivityGraph();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.TaskActivityGraph#getReplyEntry <em>Reply Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reply Entry</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.TaskActivityGraph#getReplyEntry()
	 * @see #getTaskActivityGraph()
	 * @generated
	 */
	EReference getTaskActivityGraph_ReplyEntry();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.TaskType <em>Task Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Type</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.TaskType
	 * @generated
	 */
	EClass getTaskType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.TaskType#getResultTask <em>Result Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Result Task</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.TaskType#getResultTask()
	 * @see #getTaskType()
	 * @generated
	 */
	EReference getTaskType_ResultTask();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.TaskType#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entry</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.TaskType#getEntry()
	 * @see #getTaskType()
	 * @generated
	 */
	EReference getTaskType_Entry();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.TaskType#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.TaskType#getService()
	 * @see #getTaskType()
	 * @generated
	 */
	EReference getTaskType_Service();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.TaskType#getTaskActivities <em>Task Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Task Activities</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.TaskType#getTaskActivities()
	 * @see #getTaskType()
	 * @generated
	 */
	EReference getTaskType_TaskActivities();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.TaskType#getActivityGraph <em>Activity Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activity Graph</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.TaskType#getActivityGraph()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_ActivityGraph();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.TaskType#getMultiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.TaskType#getMultiplicity()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_Multiplicity();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.TaskType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.TaskType#getName()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.TaskType#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.TaskType#getPriority()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_Priority();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.TaskType#getQueueLength <em>Queue Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Queue Length</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.TaskType#getQueueLength()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_QueueLength();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.TaskType#getReplication <em>Replication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Replication</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.TaskType#getReplication()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_Replication();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.TaskType#getScheduling <em>Scheduling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scheduling</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.TaskType#getScheduling()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_Scheduling();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.TaskType#getThinkTime <em>Think Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Think Time</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.TaskType#getThinkTime()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_ThinkTime();

	/**
	 * Returns the meta object for enum '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.AxisType <em>Axis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Axis Type</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.AxisType
	 * @generated
	 */
	EEnum getAxisType();

	/**
	 * Returns the meta object for enum '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.CallOrderType <em>Call Order Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Call Order Type</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.CallOrderType
	 * @generated
	 */
	EEnum getCallOrderType();

	/**
	 * Returns the meta object for enum '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.SchedulingType <em>Scheduling Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Scheduling Type</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.SchedulingType
	 * @generated
	 */
	EEnum getSchedulingType();

	/**
	 * Returns the meta object for enum '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.SemaphoreType <em>Semaphore Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Semaphore Type</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.SemaphoreType
	 * @generated
	 */
	EEnum getSemaphoreType();

	/**
	 * Returns the meta object for enum '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.TaskOptionType <em>Task Option Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Task Option Type</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.TaskOptionType
	 * @generated
	 */
	EEnum getTaskOptionType();

	/**
	 * Returns the meta object for enum '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.TaskSchedulingType <em>Task Scheduling Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Task Scheduling Type</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.TaskSchedulingType
	 * @generated
	 */
	EEnum getTaskSchedulingType();

	/**
	 * Returns the meta object for enum '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.TypeType <em>Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Type</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.TypeType
	 * @generated
	 */
	EEnum getTypeType();

	/**
	 * Returns the meta object for enum '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ValidType <em>Valid Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Valid Type</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ValidType
	 * @generated
	 */
	EEnum getValidType();

	/**
	 * Returns the meta object for enum '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.XmlDebugType <em>Xml Debug Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Xml Debug Type</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.XmlDebugType
	 * @generated
	 */
	EEnum getXmlDebugType();

	/**
	 * Returns the meta object for data type '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.AxisType <em>Axis Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Axis Type Object</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.AxisType
	 * @model instanceClass="de.uni_stuttgart.iste.cowolf.model.LqnCore.AxisType"
	 *        extendedMetaData="name='AxisType:Object' baseType='AxisType'"
	 * @generated
	 */
	EDataType getAxisTypeObject();

	/**
	 * Returns the meta object for data type '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.CallOrderType <em>Call Order Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Call Order Type Object</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.CallOrderType
	 * @model instanceClass="de.uni_stuttgart.iste.cowolf.model.LqnCore.CallOrderType"
	 *        extendedMetaData="name='CallOrderType:Object' baseType='CallOrderType'"
	 * @generated
	 */
	EDataType getCallOrderTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Connect From Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Connect From Type</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='connect-from_._type' itemType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getConnectFromType();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Connect To Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Connect To Type</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='connect-to_._type' itemType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getConnectToType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Phase Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Phase Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='phase_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#positiveInteger' minInclusive='1' maxInclusive='3'"
	 * @generated
	 */
	EDataType getPhaseType();

	/**
	 * Returns the meta object for data type '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.SchedulingType <em>Scheduling Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Scheduling Type Object</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.SchedulingType
	 * @model instanceClass="de.uni_stuttgart.iste.cowolf.model.LqnCore.SchedulingType"
	 *        extendedMetaData="name='SchedulingType:Object' baseType='SchedulingType'"
	 * @generated
	 */
	EDataType getSchedulingTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Sci Notation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Sci Notation</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='SciNotation' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='[\\+|\\-]?\\d+((\\.\\d+)?[e|E][\\+|\\-]\\d+)?'"
	 * @generated
	 */
	EDataType getSciNotation();

	/**
	 * Returns the meta object for data type '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.SemaphoreType <em>Semaphore Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Semaphore Type Object</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.SemaphoreType
	 * @model instanceClass="de.uni_stuttgart.iste.cowolf.model.LqnCore.SemaphoreType"
	 *        extendedMetaData="name='SemaphoreType:Object' baseType='SemaphoreType'"
	 * @generated
	 */
	EDataType getSemaphoreTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Srvn Float</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Srvn Float</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='SrvnFloat' memberTypes='SciNotation http://www.eclipse.org/emf/2003/XMLType#decimal'"
	 * @generated
	 */
	EDataType getSrvnFloat();

	/**
	 * Returns the meta object for data type '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.TaskOptionType <em>Task Option Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Task Option Type Object</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.TaskOptionType
	 * @model instanceClass="de.uni_stuttgart.iste.cowolf.model.LqnCore.TaskOptionType"
	 *        extendedMetaData="name='TaskOptionType:Object' baseType='TaskOptionType'"
	 * @generated
	 */
	EDataType getTaskOptionTypeObject();

	/**
	 * Returns the meta object for data type '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.TaskSchedulingType <em>Task Scheduling Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Task Scheduling Type Object</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.TaskSchedulingType
	 * @model instanceClass="de.uni_stuttgart.iste.cowolf.model.LqnCore.TaskSchedulingType"
	 *        extendedMetaData="name='TaskSchedulingType:Object' baseType='TaskSchedulingType'"
	 * @generated
	 */
	EDataType getTaskSchedulingTypeObject();

	/**
	 * Returns the meta object for data type '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.TypeType <em>Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Type Object</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.TypeType
	 * @model instanceClass="de.uni_stuttgart.iste.cowolf.model.LqnCore.TypeType"
	 *        extendedMetaData="name='type_._type:Object' baseType='type_._type'"
	 * @generated
	 */
	EDataType getTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ValidType <em>Valid Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Valid Type Object</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ValidType
	 * @model instanceClass="de.uni_stuttgart.iste.cowolf.model.LqnCore.ValidType"
	 *        extendedMetaData="name='valid_._type:Object' baseType='valid_._type'"
	 * @generated
	 */
	EDataType getValidTypeObject();

	/**
	 * Returns the meta object for data type '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.XmlDebugType <em>Xml Debug Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Xml Debug Type Object</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.XmlDebugType
	 * @model instanceClass="de.uni_stuttgart.iste.cowolf.model.LqnCore.XmlDebugType"
	 *        extendedMetaData="name='xml-debug_._type:Object' baseType='xml-debug_._type'"
	 * @generated
	 */
	EDataType getXmlDebugTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LQNFactory getLQNFactory();

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
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ActivityDefBaseImpl <em>Activity Def Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ActivityDefBaseImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getActivityDefBase()
		 * @generated
		 */
		EClass ACTIVITY_DEF_BASE = eINSTANCE.getActivityDefBase();

		/**
		 * The meta object literal for the '<em><b>Result Join Delay</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_DEF_BASE__RESULT_JOIN_DELAY = eINSTANCE.getActivityDefBase_ResultJoinDelay();

		/**
		 * The meta object literal for the '<em><b>Result Forwarding</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_DEF_BASE__RESULT_FORWARDING = eINSTANCE.getActivityDefBase_ResultForwarding();

		/**
		 * The meta object literal for the '<em><b>Service Time Distribution</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_DEF_BASE__SERVICE_TIME_DISTRIBUTION = eINSTANCE.getActivityDefBase_ServiceTimeDistribution();

		/**
		 * The meta object literal for the '<em><b>Result Activity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_DEF_BASE__RESULT_ACTIVITY = eINSTANCE.getActivityDefBase_ResultActivity();

		/**
		 * The meta object literal for the '<em><b>Call Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_DEF_BASE__CALL_ORDER = eINSTANCE.getActivityDefBase_CallOrder();

		/**
		 * The meta object literal for the '<em><b>Host Demand Cvsq</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_DEF_BASE__HOST_DEMAND_CVSQ = eINSTANCE.getActivityDefBase_HostDemandCvsq();

		/**
		 * The meta object literal for the '<em><b>Host Demand Mean</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_DEF_BASE__HOST_DEMAND_MEAN = eINSTANCE.getActivityDefBase_HostDemandMean();

		/**
		 * The meta object literal for the '<em><b>Max Service Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_DEF_BASE__MAX_SERVICE_TIME = eINSTANCE.getActivityDefBase_MaxServiceTime();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_DEF_BASE__NAME = eINSTANCE.getActivityDefBase_Name();

		/**
		 * The meta object literal for the '<em><b>Think Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_DEF_BASE__THINK_TIME = eINSTANCE.getActivityDefBase_ThinkTime();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ActivityDefTypeImpl <em>Activity Def Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ActivityDefTypeImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getActivityDefType()
		 * @generated
		 */
		EClass ACTIVITY_DEF_TYPE = eINSTANCE.getActivityDefType();

		/**
		 * The meta object literal for the '<em><b>Call List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_DEF_TYPE__CALL_LIST = eINSTANCE.getActivityDefType_CallList();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_DEF_TYPE__GROUP = eINSTANCE.getActivityDefType_Group();

		/**
		 * The meta object literal for the '<em><b>Synch Call</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_DEF_TYPE__SYNCH_CALL = eINSTANCE.getActivityDefType_SynchCall();

		/**
		 * The meta object literal for the '<em><b>Asynch Call</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_DEF_TYPE__ASYNCH_CALL = eINSTANCE.getActivityDefType_AsynchCall();

		/**
		 * The meta object literal for the '<em><b>Bound To Entry</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_DEF_TYPE__BOUND_TO_ENTRY = eINSTANCE.getActivityDefType_BoundToEntry();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ActivityGraphBaseImpl <em>Activity Graph Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ActivityGraphBaseImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getActivityGraphBase()
		 * @generated
		 */
		EClass ACTIVITY_GRAPH_BASE = eINSTANCE.getActivityGraphBase();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_GRAPH_BASE__ACTIVITY = eINSTANCE.getActivityGraphBase_Activity();

		/**
		 * The meta object literal for the '<em><b>Precedence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_GRAPH_BASE__PRECEDENCE = eINSTANCE.getActivityGraphBase_Precedence();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ActivityListTypeImpl <em>Activity List Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ActivityListTypeImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getActivityListType()
		 * @generated
		 */
		EClass ACTIVITY_LIST_TYPE = eINSTANCE.getActivityListType();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_LIST_TYPE__ACTIVITY = eINSTANCE.getActivityListType_Activity();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ActivityLoopListTypeImpl <em>Activity Loop List Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ActivityLoopListTypeImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getActivityLoopListType()
		 * @generated
		 */
		EClass ACTIVITY_LOOP_LIST_TYPE = eINSTANCE.getActivityLoopListType();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_LOOP_LIST_TYPE__ACTIVITY = eINSTANCE.getActivityLoopListType_Activity();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_LOOP_LIST_TYPE__END = eINSTANCE.getActivityLoopListType_End();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ActivityLoopTypeImpl <em>Activity Loop Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ActivityLoopTypeImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getActivityLoopType()
		 * @generated
		 */
		EClass ACTIVITY_LOOP_TYPE = eINSTANCE.getActivityLoopType();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_LOOP_TYPE__COUNT = eINSTANCE.getActivityLoopType_Count();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ActivityMakingCallTypeImpl <em>Activity Making Call Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ActivityMakingCallTypeImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getActivityMakingCallType()
		 * @generated
		 */
		EClass ACTIVITY_MAKING_CALL_TYPE = eINSTANCE.getActivityMakingCallType();

		/**
		 * The meta object literal for the '<em><b>Calls Mean</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_MAKING_CALL_TYPE__CALLS_MEAN = eINSTANCE.getActivityMakingCallType_CallsMean();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ActivityOrTypeImpl <em>Activity Or Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ActivityOrTypeImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getActivityOrType()
		 * @generated
		 */
		EClass ACTIVITY_OR_TYPE = eINSTANCE.getActivityOrType();

		/**
		 * The meta object literal for the '<em><b>Prob</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_OR_TYPE__PROB = eINSTANCE.getActivityOrType_Prob();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ActivityPhasesTypeImpl <em>Activity Phases Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ActivityPhasesTypeImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getActivityPhasesType()
		 * @generated
		 */
		EClass ACTIVITY_PHASES_TYPE = eINSTANCE.getActivityPhasesType();

		/**
		 * The meta object literal for the '<em><b>Call List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_PHASES_TYPE__CALL_LIST = eINSTANCE.getActivityPhasesType_CallList();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_PHASES_TYPE__GROUP = eINSTANCE.getActivityPhasesType_Group();

		/**
		 * The meta object literal for the '<em><b>Synch Call</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_PHASES_TYPE__SYNCH_CALL = eINSTANCE.getActivityPhasesType_SynchCall();

		/**
		 * The meta object literal for the '<em><b>Asynch Call</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_PHASES_TYPE__ASYNCH_CALL = eINSTANCE.getActivityPhasesType_AsynchCall();

		/**
		 * The meta object literal for the '<em><b>Phase</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_PHASES_TYPE__PHASE = eINSTANCE.getActivityPhasesType_Phase();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ActivityTypeImpl <em>Activity Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ActivityTypeImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getActivityType()
		 * @generated
		 */
		EClass ACTIVITY_TYPE = eINSTANCE.getActivityType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_TYPE__NAME = eINSTANCE.getActivityType_Name();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.AndJoinListTypeImpl <em>And Join List Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.AndJoinListTypeImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getAndJoinListType()
		 * @generated
		 */
		EClass AND_JOIN_LIST_TYPE = eINSTANCE.getAndJoinListType();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AND_JOIN_LIST_TYPE__ACTIVITY = eINSTANCE.getAndJoinListType_Activity();

		/**
		 * The meta object literal for the '<em><b>Quorum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AND_JOIN_LIST_TYPE__QUORUM = eINSTANCE.getAndJoinListType_Quorum();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.AsynchCallTypeImpl <em>Asynch Call Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.AsynchCallTypeImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getAsynchCallType()
		 * @generated
		 */
		EClass ASYNCH_CALL_TYPE = eINSTANCE.getAsynchCallType();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.BindTypeImpl <em>Bind Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.BindTypeImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getBindType()
		 * @generated
		 */
		EClass BIND_TYPE = eINSTANCE.getBindType();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIND_TYPE__PARAMETER = eINSTANCE.getBindType_Parameter();

		/**
		 * The meta object literal for the '<em><b>Processor Binding</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIND_TYPE__PROCESSOR_BINDING = eINSTANCE.getBindType_ProcessorBinding();

		/**
		 * The meta object literal for the '<em><b>Port Binding</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIND_TYPE__PORT_BINDING = eINSTANCE.getBindType_PortBinding();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.CallListTypeImpl <em>Call List Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.CallListTypeImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getCallListType()
		 * @generated
		 */
		EClass CALL_LIST_TYPE = eINSTANCE.getCallListType();

		/**
		 * The meta object literal for the '<em><b>Synch Call</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_LIST_TYPE__SYNCH_CALL = eINSTANCE.getCallListType_SynchCall();

		/**
		 * The meta object literal for the '<em><b>Asynch Call</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_LIST_TYPE__ASYNCH_CALL = eINSTANCE.getCallListType_AsynchCall();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNImpl <em>LQN</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getLQN()
		 * @generated
		 */
		EClass LQN = eINSTANCE.getLQN();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LQN__MIXED = eINSTANCE.getLQN_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LQN__XMLNS_PREFIX_MAP = eINSTANCE.getLQN_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LQN__XSI_SCHEMA_LOCATION = eINSTANCE.getLQN_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Lqn Core</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LQN__LQN_CORE = eINSTANCE.getLQN_LqnCore();

		/**
		 * The meta object literal for the '<em><b>Lqn Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LQN__LQN_MODEL = eINSTANCE.getLQN_LqnModel();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.EntryActivityDefTypeImpl <em>Entry Activity Def Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.EntryActivityDefTypeImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getEntryActivityDefType()
		 * @generated
		 */
		EClass ENTRY_ACTIVITY_DEF_TYPE = eINSTANCE.getEntryActivityDefType();

		/**
		 * The meta object literal for the '<em><b>Call List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY_ACTIVITY_DEF_TYPE__CALL_LIST = eINSTANCE.getEntryActivityDefType_CallList();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY_ACTIVITY_DEF_TYPE__GROUP = eINSTANCE.getEntryActivityDefType_Group();

		/**
		 * The meta object literal for the '<em><b>Synch Call</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY_ACTIVITY_DEF_TYPE__SYNCH_CALL = eINSTANCE.getEntryActivityDefType_SynchCall();

		/**
		 * The meta object literal for the '<em><b>Asynch Call</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY_ACTIVITY_DEF_TYPE__ASYNCH_CALL = eINSTANCE.getEntryActivityDefType_AsynchCall();

		/**
		 * The meta object literal for the '<em><b>First Activity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY_ACTIVITY_DEF_TYPE__FIRST_ACTIVITY = eINSTANCE.getEntryActivityDefType_FirstActivity();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.EntryActivityGraphImpl <em>Entry Activity Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.EntryActivityGraphImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getEntryActivityGraph()
		 * @generated
		 */
		EClass ENTRY_ACTIVITY_GRAPH = eINSTANCE.getEntryActivityGraph();

		/**
		 * The meta object literal for the '<em><b>Reply Activity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY_ACTIVITY_GRAPH__REPLY_ACTIVITY = eINSTANCE.getEntryActivityGraph_ReplyActivity();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.EntryMakingCallTypeImpl <em>Entry Making Call Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.EntryMakingCallTypeImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getEntryMakingCallType()
		 * @generated
		 */
		EClass ENTRY_MAKING_CALL_TYPE = eINSTANCE.getEntryMakingCallType();

		/**
		 * The meta object literal for the '<em><b>Prob</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY_MAKING_CALL_TYPE__PROB = eINSTANCE.getEntryMakingCallType_Prob();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.EntryTypeImpl <em>Entry Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.EntryTypeImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getEntryType()
		 * @generated
		 */
		EClass ENTRY_TYPE = eINSTANCE.getEntryType();

		/**
		 * The meta object literal for the '<em><b>Result Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY_TYPE__RESULT_ENTRY = eINSTANCE.getEntryType_ResultEntry();

		/**
		 * The meta object literal for the '<em><b>Service Time Distribution</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY_TYPE__SERVICE_TIME_DISTRIBUTION = eINSTANCE.getEntryType_ServiceTimeDistribution();

		/**
		 * The meta object literal for the '<em><b>Forwarding</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY_TYPE__FORWARDING = eINSTANCE.getEntryType_Forwarding();

		/**
		 * The meta object literal for the '<em><b>Entry Activity Graph</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY_TYPE__ENTRY_ACTIVITY_GRAPH = eINSTANCE.getEntryType_EntryActivityGraph();

		/**
		 * The meta object literal for the '<em><b>Entry Phase Activities</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY_TYPE__ENTRY_PHASE_ACTIVITIES = eINSTANCE.getEntryType_EntryPhaseActivities();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY_TYPE__NAME = eINSTANCE.getEntryType_Name();

		/**
		 * The meta object literal for the '<em><b>Open Arrival Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY_TYPE__OPEN_ARRIVAL_RATE = eINSTANCE.getEntryType_OpenArrivalRate();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY_TYPE__PRIORITY = eINSTANCE.getEntryType_Priority();

		/**
		 * The meta object literal for the '<em><b>Semaphore</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY_TYPE__SEMAPHORE = eINSTANCE.getEntryType_Semaphore();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY_TYPE__TYPE = eINSTANCE.getEntryType_Type();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.FirstPlotTypeImpl <em>First Plot Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.FirstPlotTypeImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getFirstPlotType()
		 * @generated
		 */
		EClass FIRST_PLOT_TYPE = eINSTANCE.getFirstPlotType();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIRST_PLOT_TYPE__VARIABLE = eINSTANCE.getFirstPlotType_Variable();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.HistogramBinTypeImpl <em>Histogram Bin Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.HistogramBinTypeImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getHistogramBinType()
		 * @generated
		 */
		EClass HISTOGRAM_BIN_TYPE = eINSTANCE.getHistogramBinType();

		/**
		 * The meta object literal for the '<em><b>Begin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HISTOGRAM_BIN_TYPE__BEGIN = eINSTANCE.getHistogramBinType_Begin();

		/**
		 * The meta object literal for the '<em><b>Conf95</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HISTOGRAM_BIN_TYPE__CONF95 = eINSTANCE.getHistogramBinType_Conf95();

		/**
		 * The meta object literal for the '<em><b>Conf99</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HISTOGRAM_BIN_TYPE__CONF99 = eINSTANCE.getHistogramBinType_Conf99();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HISTOGRAM_BIN_TYPE__END = eINSTANCE.getHistogramBinType_End();

		/**
		 * The meta object literal for the '<em><b>Prob</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HISTOGRAM_BIN_TYPE__PROB = eINSTANCE.getHistogramBinType_Prob();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.InPortTypeImpl <em>In Port Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.InPortTypeImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getInPortType()
		 * @generated
		 */
		EClass IN_PORT_TYPE = eINSTANCE.getInPortType();

		/**
		 * The meta object literal for the '<em><b>Connect From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IN_PORT_TYPE__CONNECT_FROM = eINSTANCE.getInPortType_ConnectFrom();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IN_PORT_TYPE__DESCRIPTION = eINSTANCE.getInPortType_Description();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IN_PORT_TYPE__NAME = eINSTANCE.getInPortType_Name();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.InterfaceTypeImpl <em>Interface Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.InterfaceTypeImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getInterfaceType()
		 * @generated
		 */
		EClass INTERFACE_TYPE = eINSTANCE.getInterfaceType();

		/**
		 * The meta object literal for the '<em><b>In Port</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_TYPE__IN_PORT = eINSTANCE.getInterfaceType_InPort();

		/**
		 * The meta object literal for the '<em><b>Out Port</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_TYPE__OUT_PORT = eINSTANCE.getInterfaceType_OutPort();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LqnCoreTypeImpl <em>Lqn Core Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LqnCoreTypeImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getLqnCoreType()
		 * @generated
		 */
		EClass LQN_CORE_TYPE = eINSTANCE.getLqnCoreType();

		/**
		 * The meta object literal for the '<em><b>Processor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LQN_CORE_TYPE__PROCESSOR = eINSTANCE.getLqnCoreType_Processor();

		/**
		 * The meta object literal for the '<em><b>Slot</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LQN_CORE_TYPE__SLOT = eINSTANCE.getLqnCoreType_Slot();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LqnModelTypeImpl <em>Lqn Model Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LqnModelTypeImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getLqnModelType()
		 * @generated
		 */
		EClass LQN_MODEL_TYPE = eINSTANCE.getLqnModelType();

		/**
		 * The meta object literal for the '<em><b>Run Control</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LQN_MODEL_TYPE__RUN_CONTROL = eINSTANCE.getLqnModelType_RunControl();

		/**
		 * The meta object literal for the '<em><b>Plot Control</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LQN_MODEL_TYPE__PLOT_CONTROL = eINSTANCE.getLqnModelType_PlotControl();

		/**
		 * The meta object literal for the '<em><b>Solver Params</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LQN_MODEL_TYPE__SOLVER_PARAMS = eINSTANCE.getLqnModelType_SolverParams();

		/**
		 * The meta object literal for the '<em><b>Processor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LQN_MODEL_TYPE__PROCESSOR = eINSTANCE.getLqnModelType_Processor();

		/**
		 * The meta object literal for the '<em><b>Slot</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LQN_MODEL_TYPE__SLOT = eINSTANCE.getLqnModelType_Slot();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LQN_MODEL_TYPE__DESCRIPTION = eINSTANCE.getLqnModelType_Description();

		/**
		 * The meta object literal for the '<em><b>Lqncore Schema Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LQN_MODEL_TYPE__LQNCORE_SCHEMA_VERSION = eINSTANCE.getLqnModelType_LqncoreSchemaVersion();

		/**
		 * The meta object literal for the '<em><b>Lqn Schema Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LQN_MODEL_TYPE__LQN_SCHEMA_VERSION = eINSTANCE.getLqnModelType_LqnSchemaVersion();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LQN_MODEL_TYPE__NAME = eINSTANCE.getLqnModelType_Name();

		/**
		 * The meta object literal for the '<em><b>Xml Debug</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LQN_MODEL_TYPE__XML_DEBUG = eINSTANCE.getLqnModelType_XmlDebug();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.MakingCallTypeImpl <em>Making Call Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.MakingCallTypeImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getMakingCallType()
		 * @generated
		 */
		EClass MAKING_CALL_TYPE = eINSTANCE.getMakingCallType();

		/**
		 * The meta object literal for the '<em><b>Result Call</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAKING_CALL_TYPE__RESULT_CALL = eINSTANCE.getMakingCallType_ResultCall();

		/**
		 * The meta object literal for the '<em><b>Dest</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAKING_CALL_TYPE__DEST = eINSTANCE.getMakingCallType_Dest();

		/**
		 * The meta object literal for the '<em><b>Fanin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAKING_CALL_TYPE__FANIN = eINSTANCE.getMakingCallType_Fanin();

		/**
		 * The meta object literal for the '<em><b>Fanout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAKING_CALL_TYPE__FANOUT = eINSTANCE.getMakingCallType_Fanout();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.OrListTypeImpl <em>Or List Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.OrListTypeImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getOrListType()
		 * @generated
		 */
		EClass OR_LIST_TYPE = eINSTANCE.getOrListType();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OR_LIST_TYPE__ACTIVITY = eINSTANCE.getOrListType_Activity();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.OutPortTypeImpl <em>Out Port Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.OutPortTypeImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getOutPortType()
		 * @generated
		 */
		EClass OUT_PORT_TYPE = eINSTANCE.getOutPortType();

		/**
		 * The meta object literal for the '<em><b>Connect To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUT_PORT_TYPE__CONNECT_TO = eINSTANCE.getOutPortType_ConnectTo();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUT_PORT_TYPE__DESCRIPTION = eINSTANCE.getOutPortType_Description();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUT_PORT_TYPE__NAME = eINSTANCE.getOutPortType_Name();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.OutputDistributionTypeImpl <em>Output Distribution Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.OutputDistributionTypeImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getOutputDistributionType()
		 * @generated
		 */
		EClass OUTPUT_DISTRIBUTION_TYPE = eINSTANCE.getOutputDistributionType();

		/**
		 * The meta object literal for the '<em><b>Underflow Bin</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_DISTRIBUTION_TYPE__UNDERFLOW_BIN = eINSTANCE.getOutputDistributionType_UnderflowBin();

		/**
		 * The meta object literal for the '<em><b>Histogram Bin</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_DISTRIBUTION_TYPE__HISTOGRAM_BIN = eINSTANCE.getOutputDistributionType_HistogramBin();

		/**
		 * The meta object literal for the '<em><b>Overflow Bin</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_DISTRIBUTION_TYPE__OVERFLOW_BIN = eINSTANCE.getOutputDistributionType_OverflowBin();

		/**
		 * The meta object literal for the '<em><b>Bin Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_DISTRIBUTION_TYPE__BIN_SIZE = eINSTANCE.getOutputDistributionType_BinSize();

		/**
		 * The meta object literal for the '<em><b>Kurtosis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_DISTRIBUTION_TYPE__KURTOSIS = eINSTANCE.getOutputDistributionType_Kurtosis();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_DISTRIBUTION_TYPE__MAX = eINSTANCE.getOutputDistributionType_Max();

		/**
		 * The meta object literal for the '<em><b>Mean</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_DISTRIBUTION_TYPE__MEAN = eINSTANCE.getOutputDistributionType_Mean();

		/**
		 * The meta object literal for the '<em><b>Mid Point</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_DISTRIBUTION_TYPE__MID_POINT = eINSTANCE.getOutputDistributionType_MidPoint();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_DISTRIBUTION_TYPE__MIN = eINSTANCE.getOutputDistributionType_Min();

		/**
		 * The meta object literal for the '<em><b>Number Bins</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_DISTRIBUTION_TYPE__NUMBER_BINS = eINSTANCE.getOutputDistributionType_NumberBins();

		/**
		 * The meta object literal for the '<em><b>Skew</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_DISTRIBUTION_TYPE__SKEW = eINSTANCE.getOutputDistributionType_Skew();

		/**
		 * The meta object literal for the '<em><b>Std Dev</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_DISTRIBUTION_TYPE__STD_DEV = eINSTANCE.getOutputDistributionType_StdDev();

		/**
		 * The meta object literal for the '<em><b>XSamples</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_DISTRIBUTION_TYPE__XSAMPLES = eINSTANCE.getOutputDistributionType_XSamples();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.OutputEntryDistributionTypeImpl <em>Output Entry Distribution Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.OutputEntryDistributionTypeImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getOutputEntryDistributionType()
		 * @generated
		 */
		EClass OUTPUT_ENTRY_DISTRIBUTION_TYPE = eINSTANCE.getOutputEntryDistributionType();

		/**
		 * The meta object literal for the '<em><b>Phase</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_ENTRY_DISTRIBUTION_TYPE__PHASE = eINSTANCE.getOutputEntryDistributionType_Phase();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.OutputResultForwardingANDJoinDelayImpl <em>Output Result Forwarding AND Join Delay</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.OutputResultForwardingANDJoinDelayImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getOutputResultForwardingANDJoinDelay()
		 * @generated
		 */
		EClass OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY = eINSTANCE.getOutputResultForwardingANDJoinDelay();

		/**
		 * The meta object literal for the '<em><b>Result Conf95</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__RESULT_CONF95 = eINSTANCE.getOutputResultForwardingANDJoinDelay_ResultConf95();

		/**
		 * The meta object literal for the '<em><b>Result Conf99</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__RESULT_CONF99 = eINSTANCE.getOutputResultForwardingANDJoinDelay_ResultConf99();

		/**
		 * The meta object literal for the '<em><b>Dest</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__DEST = eINSTANCE.getOutputResultForwardingANDJoinDelay_Dest();

		/**
		 * The meta object literal for the '<em><b>Join Variance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__JOIN_VARIANCE = eINSTANCE.getOutputResultForwardingANDJoinDelay_JoinVariance();

		/**
		 * The meta object literal for the '<em><b>Join Waiting</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__JOIN_WAITING = eINSTANCE.getOutputResultForwardingANDJoinDelay_JoinWaiting();

		/**
		 * The meta object literal for the '<em><b>Waiting</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__WAITING = eINSTANCE.getOutputResultForwardingANDJoinDelay_Waiting();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.OutputResultTypeImpl <em>Output Result Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.OutputResultTypeImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getOutputResultType()
		 * @generated
		 */
		EClass OUTPUT_RESULT_TYPE = eINSTANCE.getOutputResultType();

		/**
		 * The meta object literal for the '<em><b>Result Conf95</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_RESULT_TYPE__RESULT_CONF95 = eINSTANCE.getOutputResultType_ResultConf95();

		/**
		 * The meta object literal for the '<em><b>Result Conf99</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_RESULT_TYPE__RESULT_CONF99 = eINSTANCE.getOutputResultType_ResultConf99();

		/**
		 * The meta object literal for the '<em><b>Open Wait Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_RESULT_TYPE__OPEN_WAIT_TIME = eINSTANCE.getOutputResultType_OpenWaitTime();

		/**
		 * The meta object literal for the '<em><b>Phase1 Proc Waiting</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_RESULT_TYPE__PHASE1_PROC_WAITING = eINSTANCE.getOutputResultType_Phase1ProcWaiting();

		/**
		 * The meta object literal for the '<em><b>Phase1 Service Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_RESULT_TYPE__PHASE1_SERVICE_TIME = eINSTANCE.getOutputResultType_Phase1ServiceTime();

		/**
		 * The meta object literal for the '<em><b>Phase1 Service Time Variance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_RESULT_TYPE__PHASE1_SERVICE_TIME_VARIANCE = eINSTANCE.getOutputResultType_Phase1ServiceTimeVariance();

		/**
		 * The meta object literal for the '<em><b>Phase1 Utilization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_RESULT_TYPE__PHASE1_UTILIZATION = eINSTANCE.getOutputResultType_Phase1Utilization();

		/**
		 * The meta object literal for the '<em><b>Phase2 Proc Waiting</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_RESULT_TYPE__PHASE2_PROC_WAITING = eINSTANCE.getOutputResultType_Phase2ProcWaiting();

		/**
		 * The meta object literal for the '<em><b>Phase2 Service Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_RESULT_TYPE__PHASE2_SERVICE_TIME = eINSTANCE.getOutputResultType_Phase2ServiceTime();

		/**
		 * The meta object literal for the '<em><b>Phase2 Service Time Variance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_RESULT_TYPE__PHASE2_SERVICE_TIME_VARIANCE = eINSTANCE.getOutputResultType_Phase2ServiceTimeVariance();

		/**
		 * The meta object literal for the '<em><b>Phase2 Utilization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_RESULT_TYPE__PHASE2_UTILIZATION = eINSTANCE.getOutputResultType_Phase2Utilization();

		/**
		 * The meta object literal for the '<em><b>Phase3 Proc Waiting</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_RESULT_TYPE__PHASE3_PROC_WAITING = eINSTANCE.getOutputResultType_Phase3ProcWaiting();

		/**
		 * The meta object literal for the '<em><b>Phase3 Service Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_RESULT_TYPE__PHASE3_SERVICE_TIME = eINSTANCE.getOutputResultType_Phase3ServiceTime();

		/**
		 * The meta object literal for the '<em><b>Phase3 Service Time Variance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_RESULT_TYPE__PHASE3_SERVICE_TIME_VARIANCE = eINSTANCE.getOutputResultType_Phase3ServiceTimeVariance();

		/**
		 * The meta object literal for the '<em><b>Phase3 Utilization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_RESULT_TYPE__PHASE3_UTILIZATION = eINSTANCE.getOutputResultType_Phase3Utilization();

		/**
		 * The meta object literal for the '<em><b>Prob Exceed Max Service Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_RESULT_TYPE__PROB_EXCEED_MAX_SERVICE_TIME = eINSTANCE.getOutputResultType_ProbExceedMaxServiceTime();

		/**
		 * The meta object literal for the '<em><b>Proc Utilization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_RESULT_TYPE__PROC_UTILIZATION = eINSTANCE.getOutputResultType_ProcUtilization();

		/**
		 * The meta object literal for the '<em><b>Proc Waiting</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_RESULT_TYPE__PROC_WAITING = eINSTANCE.getOutputResultType_ProcWaiting();

		/**
		 * The meta object literal for the '<em><b>Service Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_RESULT_TYPE__SERVICE_TIME = eINSTANCE.getOutputResultType_ServiceTime();

		/**
		 * The meta object literal for the '<em><b>Service Time Variance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_RESULT_TYPE__SERVICE_TIME_VARIANCE = eINSTANCE.getOutputResultType_ServiceTimeVariance();

		/**
		 * The meta object literal for the '<em><b>Squared Coeff Variation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_RESULT_TYPE__SQUARED_COEFF_VARIATION = eINSTANCE.getOutputResultType_SquaredCoeffVariation();

		/**
		 * The meta object literal for the '<em><b>Throughput</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_RESULT_TYPE__THROUGHPUT = eINSTANCE.getOutputResultType_Throughput();

		/**
		 * The meta object literal for the '<em><b>Throughput Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_RESULT_TYPE__THROUGHPUT_BOUND = eINSTANCE.getOutputResultType_ThroughputBound();

		/**
		 * The meta object literal for the '<em><b>Utilization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_RESULT_TYPE__UTILIZATION = eINSTANCE.getOutputResultType_Utilization();

		/**
		 * The meta object literal for the '<em><b>Waiting</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_RESULT_TYPE__WAITING = eINSTANCE.getOutputResultType_Waiting();

		/**
		 * The meta object literal for the '<em><b>Waiting Variance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_RESULT_TYPE__WAITING_VARIANCE = eINSTANCE.getOutputResultType_WaitingVariance();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ParameterTypeImpl <em>Parameter Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ParameterTypeImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getParameterType()
		 * @generated
		 */
		EClass PARAMETER_TYPE = eINSTANCE.getParameterType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_TYPE__NAME = eINSTANCE.getParameterType_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_TYPE__VALUE = eINSTANCE.getParameterType_Value();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ParaTypeImpl <em>Para Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ParaTypeImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getParaType()
		 * @generated
		 */
		EClass PARA_TYPE = eINSTANCE.getParaType();

		/**
		 * The meta object literal for the '<em><b>Start Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARA_TYPE__START_VALUE = eINSTANCE.getParaType_StartValue();

		/**
		 * The meta object literal for the '<em><b>End Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARA_TYPE__END_VALUE = eINSTANCE.getParaType_EndValue();

		/**
		 * The meta object literal for the '<em><b>Step Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARA_TYPE__STEP_VALUE = eINSTANCE.getParaType_StepValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARA_TYPE__VALUE = eINSTANCE.getParaType_Value();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.PhaseActivitiesImpl <em>Phase Activities</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.PhaseActivitiesImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getPhaseActivities()
		 * @generated
		 */
		EClass PHASE_ACTIVITIES = eINSTANCE.getPhaseActivities();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHASE_ACTIVITIES__ACTIVITY = eINSTANCE.getPhaseActivities_Activity();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.PlotControlTypeImpl <em>Plot Control Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.PlotControlTypeImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getPlotControlType()
		 * @generated
		 */
		EClass PLOT_CONTROL_TYPE = eINSTANCE.getPlotControlType();

		/**
		 * The meta object literal for the '<em><b>First Plot</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLOT_CONTROL_TYPE__FIRST_PLOT = eINSTANCE.getPlotControlType_FirstPlot();

		/**
		 * The meta object literal for the '<em><b>Plot</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLOT_CONTROL_TYPE__PLOT = eINSTANCE.getPlotControlType_Plot();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.PlotTypeImpl <em>Plot Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.PlotTypeImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getPlotType()
		 * @generated
		 */
		EClass PLOT_TYPE = eINSTANCE.getPlotType();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLOT_TYPE__VARIABLE = eINSTANCE.getPlotType_Variable();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.PortBindingTypeImpl <em>Port Binding Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.PortBindingTypeImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getPortBindingType()
		 * @generated
		 */
		EClass PORT_BINDING_TYPE = eINSTANCE.getPortBindingType();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_BINDING_TYPE__SOURCE = eINSTANCE.getPortBindingType_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_BINDING_TYPE__TARGET = eINSTANCE.getPortBindingType_Target();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.PragmaTypeImpl <em>Pragma Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.PragmaTypeImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getPragmaType()
		 * @generated
		 */
		EClass PRAGMA_TYPE = eINSTANCE.getPragmaType();

		/**
		 * The meta object literal for the '<em><b>Param</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRAGMA_TYPE__PARAM = eINSTANCE.getPragmaType_Param();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRAGMA_TYPE__VALUE = eINSTANCE.getPragmaType_Value();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.PrecedenceTypeImpl <em>Precedence Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.PrecedenceTypeImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getPrecedenceType()
		 * @generated
		 */
		EClass PRECEDENCE_TYPE = eINSTANCE.getPrecedenceType();

		/**
		 * The meta object literal for the '<em><b>Pre</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRECEDENCE_TYPE__PRE = eINSTANCE.getPrecedenceType_Pre();

		/**
		 * The meta object literal for the '<em><b>Pre OR</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRECEDENCE_TYPE__PRE_OR = eINSTANCE.getPrecedenceType_PreOR();

		/**
		 * The meta object literal for the '<em><b>Pre AND</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRECEDENCE_TYPE__PRE_AND = eINSTANCE.getPrecedenceType_PreAND();

		/**
		 * The meta object literal for the '<em><b>Post</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRECEDENCE_TYPE__POST = eINSTANCE.getPrecedenceType_Post();

		/**
		 * The meta object literal for the '<em><b>Post OR</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRECEDENCE_TYPE__POST_OR = eINSTANCE.getPrecedenceType_PostOR();

		/**
		 * The meta object literal for the '<em><b>Post AND</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRECEDENCE_TYPE__POST_AND = eINSTANCE.getPrecedenceType_PostAND();

		/**
		 * The meta object literal for the '<em><b>Post LOOP</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRECEDENCE_TYPE__POST_LOOP = eINSTANCE.getPrecedenceType_PostLOOP();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ProcessorBindingTypeImpl <em>Processor Binding Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ProcessorBindingTypeImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getProcessorBindingType()
		 * @generated
		 */
		EClass PROCESSOR_BINDING_TYPE = eINSTANCE.getProcessorBindingType();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSOR_BINDING_TYPE__SOURCE = eINSTANCE.getProcessorBindingType_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSOR_BINDING_TYPE__TARGET = eINSTANCE.getProcessorBindingType_Target();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ProcessorTypeImpl <em>Processor Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ProcessorTypeImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getProcessorType()
		 * @generated
		 */
		EClass PROCESSOR_TYPE = eINSTANCE.getProcessorType();

		/**
		 * The meta object literal for the '<em><b>Result Processor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSOR_TYPE__RESULT_PROCESSOR = eINSTANCE.getProcessorType_ResultProcessor();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSOR_TYPE__TASK = eINSTANCE.getProcessorType_Task();

		/**
		 * The meta object literal for the '<em><b>Multiplicity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSOR_TYPE__MULTIPLICITY = eINSTANCE.getProcessorType_Multiplicity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSOR_TYPE__NAME = eINSTANCE.getProcessorType_Name();

		/**
		 * The meta object literal for the '<em><b>Quantum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSOR_TYPE__QUANTUM = eINSTANCE.getProcessorType_Quantum();

		/**
		 * The meta object literal for the '<em><b>Replication</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSOR_TYPE__REPLICATION = eINSTANCE.getProcessorType_Replication();

		/**
		 * The meta object literal for the '<em><b>Scheduling</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSOR_TYPE__SCHEDULING = eINSTANCE.getProcessorType_Scheduling();

		/**
		 * The meta object literal for the '<em><b>Speed Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSOR_TYPE__SPEED_FACTOR = eINSTANCE.getProcessorType_SpeedFactor();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ReplyActivityTypeImpl <em>Reply Activity Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ReplyActivityTypeImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getReplyActivityType()
		 * @generated
		 */
		EClass REPLY_ACTIVITY_TYPE = eINSTANCE.getReplyActivityType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPLY_ACTIVITY_TYPE__NAME = eINSTANCE.getReplyActivityType_Name();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ReplyEntryTypeImpl <em>Reply Entry Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ReplyEntryTypeImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getReplyEntryType()
		 * @generated
		 */
		EClass REPLY_ENTRY_TYPE = eINSTANCE.getReplyEntryType();

		/**
		 * The meta object literal for the '<em><b>Reply Activity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPLY_ENTRY_TYPE__REPLY_ACTIVITY = eINSTANCE.getReplyEntryType_ReplyActivity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPLY_ENTRY_TYPE__NAME = eINSTANCE.getReplyEntryType_Name();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ResultConf95TypeImpl <em>Result Conf95 Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ResultConf95TypeImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getResultConf95Type()
		 * @generated
		 */
		EClass RESULT_CONF95_TYPE = eINSTANCE.getResultConf95Type();

		/**
		 * The meta object literal for the '<em><b>Join Variance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF95_TYPE__JOIN_VARIANCE = eINSTANCE.getResultConf95Type_JoinVariance();

		/**
		 * The meta object literal for the '<em><b>Join Waiting</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF95_TYPE__JOIN_WAITING = eINSTANCE.getResultConf95Type_JoinWaiting();

		/**
		 * The meta object literal for the '<em><b>Waiting</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF95_TYPE__WAITING = eINSTANCE.getResultConf95Type_Waiting();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ResultConf95Type1Impl <em>Result Conf95 Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ResultConf95Type1Impl
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getResultConf95Type1()
		 * @generated
		 */
		EClass RESULT_CONF95_TYPE1 = eINSTANCE.getResultConf95Type1();

		/**
		 * The meta object literal for the '<em><b>Open Wait Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF95_TYPE1__OPEN_WAIT_TIME = eINSTANCE.getResultConf95Type1_OpenWaitTime();

		/**
		 * The meta object literal for the '<em><b>Phase1 Proc Waiting</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF95_TYPE1__PHASE1_PROC_WAITING = eINSTANCE.getResultConf95Type1_Phase1ProcWaiting();

		/**
		 * The meta object literal for the '<em><b>Phase1 Service Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF95_TYPE1__PHASE1_SERVICE_TIME = eINSTANCE.getResultConf95Type1_Phase1ServiceTime();

		/**
		 * The meta object literal for the '<em><b>Phase1 Service Time Variance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF95_TYPE1__PHASE1_SERVICE_TIME_VARIANCE = eINSTANCE.getResultConf95Type1_Phase1ServiceTimeVariance();

		/**
		 * The meta object literal for the '<em><b>Phase1 Utilization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF95_TYPE1__PHASE1_UTILIZATION = eINSTANCE.getResultConf95Type1_Phase1Utilization();

		/**
		 * The meta object literal for the '<em><b>Phase2 Proc Waiting</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF95_TYPE1__PHASE2_PROC_WAITING = eINSTANCE.getResultConf95Type1_Phase2ProcWaiting();

		/**
		 * The meta object literal for the '<em><b>Phase2 Service Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF95_TYPE1__PHASE2_SERVICE_TIME = eINSTANCE.getResultConf95Type1_Phase2ServiceTime();

		/**
		 * The meta object literal for the '<em><b>Phase2 Service Time Variance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF95_TYPE1__PHASE2_SERVICE_TIME_VARIANCE = eINSTANCE.getResultConf95Type1_Phase2ServiceTimeVariance();

		/**
		 * The meta object literal for the '<em><b>Phase2 Utilization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF95_TYPE1__PHASE2_UTILIZATION = eINSTANCE.getResultConf95Type1_Phase2Utilization();

		/**
		 * The meta object literal for the '<em><b>Phase3 Proc Waiting</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF95_TYPE1__PHASE3_PROC_WAITING = eINSTANCE.getResultConf95Type1_Phase3ProcWaiting();

		/**
		 * The meta object literal for the '<em><b>Phase3 Service Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF95_TYPE1__PHASE3_SERVICE_TIME = eINSTANCE.getResultConf95Type1_Phase3ServiceTime();

		/**
		 * The meta object literal for the '<em><b>Phase3 Service Time Variance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF95_TYPE1__PHASE3_SERVICE_TIME_VARIANCE = eINSTANCE.getResultConf95Type1_Phase3ServiceTimeVariance();

		/**
		 * The meta object literal for the '<em><b>Phase3 Utilization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF95_TYPE1__PHASE3_UTILIZATION = eINSTANCE.getResultConf95Type1_Phase3Utilization();

		/**
		 * The meta object literal for the '<em><b>Prob Exceed Max Service Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF95_TYPE1__PROB_EXCEED_MAX_SERVICE_TIME = eINSTANCE.getResultConf95Type1_ProbExceedMaxServiceTime();

		/**
		 * The meta object literal for the '<em><b>Proc Utilization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF95_TYPE1__PROC_UTILIZATION = eINSTANCE.getResultConf95Type1_ProcUtilization();

		/**
		 * The meta object literal for the '<em><b>Proc Waiting</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF95_TYPE1__PROC_WAITING = eINSTANCE.getResultConf95Type1_ProcWaiting();

		/**
		 * The meta object literal for the '<em><b>Service Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF95_TYPE1__SERVICE_TIME = eINSTANCE.getResultConf95Type1_ServiceTime();

		/**
		 * The meta object literal for the '<em><b>Service Time Variance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF95_TYPE1__SERVICE_TIME_VARIANCE = eINSTANCE.getResultConf95Type1_ServiceTimeVariance();

		/**
		 * The meta object literal for the '<em><b>Squared Coeff Variation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF95_TYPE1__SQUARED_COEFF_VARIATION = eINSTANCE.getResultConf95Type1_SquaredCoeffVariation();

		/**
		 * The meta object literal for the '<em><b>Throughput</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF95_TYPE1__THROUGHPUT = eINSTANCE.getResultConf95Type1_Throughput();

		/**
		 * The meta object literal for the '<em><b>Throughput Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF95_TYPE1__THROUGHPUT_BOUND = eINSTANCE.getResultConf95Type1_ThroughputBound();

		/**
		 * The meta object literal for the '<em><b>Utilization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF95_TYPE1__UTILIZATION = eINSTANCE.getResultConf95Type1_Utilization();

		/**
		 * The meta object literal for the '<em><b>Waiting</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF95_TYPE1__WAITING = eINSTANCE.getResultConf95Type1_Waiting();

		/**
		 * The meta object literal for the '<em><b>Waiting Variance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF95_TYPE1__WAITING_VARIANCE = eINSTANCE.getResultConf95Type1_WaitingVariance();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ResultConf99TypeImpl <em>Result Conf99 Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ResultConf99TypeImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getResultConf99Type()
		 * @generated
		 */
		EClass RESULT_CONF99_TYPE = eINSTANCE.getResultConf99Type();

		/**
		 * The meta object literal for the '<em><b>Join Variance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF99_TYPE__JOIN_VARIANCE = eINSTANCE.getResultConf99Type_JoinVariance();

		/**
		 * The meta object literal for the '<em><b>Join Waiting</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF99_TYPE__JOIN_WAITING = eINSTANCE.getResultConf99Type_JoinWaiting();

		/**
		 * The meta object literal for the '<em><b>Waiting</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF99_TYPE__WAITING = eINSTANCE.getResultConf99Type_Waiting();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ResultConf99Type1Impl <em>Result Conf99 Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ResultConf99Type1Impl
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getResultConf99Type1()
		 * @generated
		 */
		EClass RESULT_CONF99_TYPE1 = eINSTANCE.getResultConf99Type1();

		/**
		 * The meta object literal for the '<em><b>Open Wait Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF99_TYPE1__OPEN_WAIT_TIME = eINSTANCE.getResultConf99Type1_OpenWaitTime();

		/**
		 * The meta object literal for the '<em><b>Phase1 Proc Waiting</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF99_TYPE1__PHASE1_PROC_WAITING = eINSTANCE.getResultConf99Type1_Phase1ProcWaiting();

		/**
		 * The meta object literal for the '<em><b>Phase1 Service Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF99_TYPE1__PHASE1_SERVICE_TIME = eINSTANCE.getResultConf99Type1_Phase1ServiceTime();

		/**
		 * The meta object literal for the '<em><b>Phase1 Service Time Variance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF99_TYPE1__PHASE1_SERVICE_TIME_VARIANCE = eINSTANCE.getResultConf99Type1_Phase1ServiceTimeVariance();

		/**
		 * The meta object literal for the '<em><b>Phase1 Utilization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF99_TYPE1__PHASE1_UTILIZATION = eINSTANCE.getResultConf99Type1_Phase1Utilization();

		/**
		 * The meta object literal for the '<em><b>Phase2 Proc Waiting</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF99_TYPE1__PHASE2_PROC_WAITING = eINSTANCE.getResultConf99Type1_Phase2ProcWaiting();

		/**
		 * The meta object literal for the '<em><b>Phase2 Service Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF99_TYPE1__PHASE2_SERVICE_TIME = eINSTANCE.getResultConf99Type1_Phase2ServiceTime();

		/**
		 * The meta object literal for the '<em><b>Phase2 Service Time Variance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF99_TYPE1__PHASE2_SERVICE_TIME_VARIANCE = eINSTANCE.getResultConf99Type1_Phase2ServiceTimeVariance();

		/**
		 * The meta object literal for the '<em><b>Phase2 Utilization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF99_TYPE1__PHASE2_UTILIZATION = eINSTANCE.getResultConf99Type1_Phase2Utilization();

		/**
		 * The meta object literal for the '<em><b>Phase3 Proc Waiting</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF99_TYPE1__PHASE3_PROC_WAITING = eINSTANCE.getResultConf99Type1_Phase3ProcWaiting();

		/**
		 * The meta object literal for the '<em><b>Phase3 Service Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF99_TYPE1__PHASE3_SERVICE_TIME = eINSTANCE.getResultConf99Type1_Phase3ServiceTime();

		/**
		 * The meta object literal for the '<em><b>Phase3 Service Time Variance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF99_TYPE1__PHASE3_SERVICE_TIME_VARIANCE = eINSTANCE.getResultConf99Type1_Phase3ServiceTimeVariance();

		/**
		 * The meta object literal for the '<em><b>Phase3 Utilization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF99_TYPE1__PHASE3_UTILIZATION = eINSTANCE.getResultConf99Type1_Phase3Utilization();

		/**
		 * The meta object literal for the '<em><b>Prob Exceed Max Service Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF99_TYPE1__PROB_EXCEED_MAX_SERVICE_TIME = eINSTANCE.getResultConf99Type1_ProbExceedMaxServiceTime();

		/**
		 * The meta object literal for the '<em><b>Proc Utilization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF99_TYPE1__PROC_UTILIZATION = eINSTANCE.getResultConf99Type1_ProcUtilization();

		/**
		 * The meta object literal for the '<em><b>Proc Waiting</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF99_TYPE1__PROC_WAITING = eINSTANCE.getResultConf99Type1_ProcWaiting();

		/**
		 * The meta object literal for the '<em><b>Service Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF99_TYPE1__SERVICE_TIME = eINSTANCE.getResultConf99Type1_ServiceTime();

		/**
		 * The meta object literal for the '<em><b>Service Time Variance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF99_TYPE1__SERVICE_TIME_VARIANCE = eINSTANCE.getResultConf99Type1_ServiceTimeVariance();

		/**
		 * The meta object literal for the '<em><b>Squared Coeff Variation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF99_TYPE1__SQUARED_COEFF_VARIATION = eINSTANCE.getResultConf99Type1_SquaredCoeffVariation();

		/**
		 * The meta object literal for the '<em><b>Throughput</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF99_TYPE1__THROUGHPUT = eINSTANCE.getResultConf99Type1_Throughput();

		/**
		 * The meta object literal for the '<em><b>Throughput Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF99_TYPE1__THROUGHPUT_BOUND = eINSTANCE.getResultConf99Type1_ThroughputBound();

		/**
		 * The meta object literal for the '<em><b>Utilization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF99_TYPE1__UTILIZATION = eINSTANCE.getResultConf99Type1_Utilization();

		/**
		 * The meta object literal for the '<em><b>Waiting</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF99_TYPE1__WAITING = eINSTANCE.getResultConf99Type1_Waiting();

		/**
		 * The meta object literal for the '<em><b>Waiting Variance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_CONF99_TYPE1__WAITING_VARIANCE = eINSTANCE.getResultConf99Type1_WaitingVariance();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ResultGeneralTypeImpl <em>Result General Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ResultGeneralTypeImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getResultGeneralType()
		 * @generated
		 */
		EClass RESULT_GENERAL_TYPE = eINSTANCE.getResultGeneralType();

		/**
		 * The meta object literal for the '<em><b>Conv Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_GENERAL_TYPE__CONV_VAL = eINSTANCE.getResultGeneralType_ConvVal();

		/**
		 * The meta object literal for the '<em><b>Elapsed Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_GENERAL_TYPE__ELAPSED_TIME = eINSTANCE.getResultGeneralType_ElapsedTime();

		/**
		 * The meta object literal for the '<em><b>Iterations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_GENERAL_TYPE__ITERATIONS = eINSTANCE.getResultGeneralType_Iterations();

		/**
		 * The meta object literal for the '<em><b>Platform Info</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_GENERAL_TYPE__PLATFORM_INFO = eINSTANCE.getResultGeneralType_PlatformInfo();

		/**
		 * The meta object literal for the '<em><b>Solver Info</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_GENERAL_TYPE__SOLVER_INFO = eINSTANCE.getResultGeneralType_SolverInfo();

		/**
		 * The meta object literal for the '<em><b>System Cpu Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_GENERAL_TYPE__SYSTEM_CPU_TIME = eINSTANCE.getResultGeneralType_SystemCpuTime();

		/**
		 * The meta object literal for the '<em><b>User Cpu Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_GENERAL_TYPE__USER_CPU_TIME = eINSTANCE.getResultGeneralType_UserCpuTime();

		/**
		 * The meta object literal for the '<em><b>Valid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_GENERAL_TYPE__VALID = eINSTANCE.getResultGeneralType_Valid();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.RunControlTypeImpl <em>Run Control Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.RunControlTypeImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getRunControlType()
		 * @generated
		 */
		EClass RUN_CONTROL_TYPE = eINSTANCE.getRunControlType();

		/**
		 * The meta object literal for the '<em><b>Para</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUN_CONTROL_TYPE__PARA = eINSTANCE.getRunControlType_Para();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ServiceTypeImpl <em>Service Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ServiceTypeImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getServiceType()
		 * @generated
		 */
		EClass SERVICE_TYPE = eINSTANCE.getServiceType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_TYPE__NAME = eINSTANCE.getServiceType_Name();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.SingleActivityListTypeImpl <em>Single Activity List Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.SingleActivityListTypeImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getSingleActivityListType()
		 * @generated
		 */
		EClass SINGLE_ACTIVITY_LIST_TYPE = eINSTANCE.getSingleActivityListType();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_ACTIVITY_LIST_TYPE__ACTIVITY = eINSTANCE.getSingleActivityListType_Activity();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.SlotTypeImpl <em>Slot Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.SlotTypeImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getSlotType()
		 * @generated
		 */
		EClass SLOT_TYPE = eINSTANCE.getSlotType();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLOT_TYPE__INTERFACE = eINSTANCE.getSlotType_Interface();

		/**
		 * The meta object literal for the '<em><b>Binding</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLOT_TYPE__BINDING = eINSTANCE.getSlotType_Binding();

		/**
		 * The meta object literal for the '<em><b>Bind Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLOT_TYPE__BIND_TARGET = eINSTANCE.getSlotType_BindTarget();

		/**
		 * The meta object literal for the '<em><b>Replic Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLOT_TYPE__REPLIC_NUM = eINSTANCE.getSlotType_ReplicNum();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.SolverParamsTypeImpl <em>Solver Params Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.SolverParamsTypeImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getSolverParamsType()
		 * @generated
		 */
		EClass SOLVER_PARAMS_TYPE = eINSTANCE.getSolverParamsType();

		/**
		 * The meta object literal for the '<em><b>Result General</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLVER_PARAMS_TYPE__RESULT_GENERAL = eINSTANCE.getSolverParamsType_ResultGeneral();

		/**
		 * The meta object literal for the '<em><b>Pragma</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLVER_PARAMS_TYPE__PRAGMA = eINSTANCE.getSolverParamsType_Pragma();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLVER_PARAMS_TYPE__COMMENT = eINSTANCE.getSolverParamsType_Comment();

		/**
		 * The meta object literal for the '<em><b>Conv Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLVER_PARAMS_TYPE__CONV_VAL = eINSTANCE.getSolverParamsType_ConvVal();

		/**
		 * The meta object literal for the '<em><b>It Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLVER_PARAMS_TYPE__IT_LIMIT = eINSTANCE.getSolverParamsType_ItLimit();

		/**
		 * The meta object literal for the '<em><b>Print Int</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLVER_PARAMS_TYPE__PRINT_INT = eINSTANCE.getSolverParamsType_PrintInt();

		/**
		 * The meta object literal for the '<em><b>Underrelax Coeff</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLVER_PARAMS_TYPE__UNDERRELAX_COEFF = eINSTANCE.getSolverParamsType_UnderrelaxCoeff();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.CallTypeImpl <em>Call Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.CallTypeImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getCallType()
		 * @generated
		 */
		EClass CALL_TYPE = eINSTANCE.getCallType();

		/**
		 * The meta object literal for the '<em><b>Dest</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_TYPE__DEST = eINSTANCE.getCallType_Dest();

		/**
		 * The meta object literal for the '<em><b>Fanin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALL_TYPE__FANIN = eINSTANCE.getCallType_Fanin();

		/**
		 * The meta object literal for the '<em><b>Fanout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALL_TYPE__FANOUT = eINSTANCE.getCallType_Fanout();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.SynchCallTypeImpl <em>Synch Call Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.SynchCallTypeImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getSynchCallType()
		 * @generated
		 */
		EClass SYNCH_CALL_TYPE = eINSTANCE.getSynchCallType();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.TaskActivityGraphImpl <em>Task Activity Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.TaskActivityGraphImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getTaskActivityGraph()
		 * @generated
		 */
		EClass TASK_ACTIVITY_GRAPH = eINSTANCE.getTaskActivityGraph();

		/**
		 * The meta object literal for the '<em><b>Reply Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_ACTIVITY_GRAPH__REPLY_ENTRY = eINSTANCE.getTaskActivityGraph_ReplyEntry();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.TaskTypeImpl <em>Task Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.TaskTypeImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getTaskType()
		 * @generated
		 */
		EClass TASK_TYPE = eINSTANCE.getTaskType();

		/**
		 * The meta object literal for the '<em><b>Result Task</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_TYPE__RESULT_TASK = eINSTANCE.getTaskType_ResultTask();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_TYPE__ENTRY = eINSTANCE.getTaskType_Entry();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_TYPE__SERVICE = eINSTANCE.getTaskType_Service();

		/**
		 * The meta object literal for the '<em><b>Task Activities</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_TYPE__TASK_ACTIVITIES = eINSTANCE.getTaskType_TaskActivities();

		/**
		 * The meta object literal for the '<em><b>Activity Graph</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__ACTIVITY_GRAPH = eINSTANCE.getTaskType_ActivityGraph();

		/**
		 * The meta object literal for the '<em><b>Multiplicity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__MULTIPLICITY = eINSTANCE.getTaskType_Multiplicity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__NAME = eINSTANCE.getTaskType_Name();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__PRIORITY = eINSTANCE.getTaskType_Priority();

		/**
		 * The meta object literal for the '<em><b>Queue Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__QUEUE_LENGTH = eINSTANCE.getTaskType_QueueLength();

		/**
		 * The meta object literal for the '<em><b>Replication</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__REPLICATION = eINSTANCE.getTaskType_Replication();

		/**
		 * The meta object literal for the '<em><b>Scheduling</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__SCHEDULING = eINSTANCE.getTaskType_Scheduling();

		/**
		 * The meta object literal for the '<em><b>Think Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__THINK_TIME = eINSTANCE.getTaskType_ThinkTime();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.AxisType <em>Axis Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.AxisType
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getAxisType()
		 * @generated
		 */
		EEnum AXIS_TYPE = eINSTANCE.getAxisType();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.CallOrderType <em>Call Order Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.CallOrderType
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getCallOrderType()
		 * @generated
		 */
		EEnum CALL_ORDER_TYPE = eINSTANCE.getCallOrderType();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.SchedulingType <em>Scheduling Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.SchedulingType
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getSchedulingType()
		 * @generated
		 */
		EEnum SCHEDULING_TYPE = eINSTANCE.getSchedulingType();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.SemaphoreType <em>Semaphore Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.SemaphoreType
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getSemaphoreType()
		 * @generated
		 */
		EEnum SEMAPHORE_TYPE = eINSTANCE.getSemaphoreType();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.TaskOptionType <em>Task Option Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.TaskOptionType
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getTaskOptionType()
		 * @generated
		 */
		EEnum TASK_OPTION_TYPE = eINSTANCE.getTaskOptionType();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.TaskSchedulingType <em>Task Scheduling Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.TaskSchedulingType
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getTaskSchedulingType()
		 * @generated
		 */
		EEnum TASK_SCHEDULING_TYPE = eINSTANCE.getTaskSchedulingType();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.TypeType <em>Type Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.TypeType
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getTypeType()
		 * @generated
		 */
		EEnum TYPE_TYPE = eINSTANCE.getTypeType();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ValidType <em>Valid Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ValidType
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getValidType()
		 * @generated
		 */
		EEnum VALID_TYPE = eINSTANCE.getValidType();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.XmlDebugType <em>Xml Debug Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.XmlDebugType
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getXmlDebugType()
		 * @generated
		 */
		EEnum XML_DEBUG_TYPE = eINSTANCE.getXmlDebugType();

		/**
		 * The meta object literal for the '<em>Axis Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.AxisType
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getAxisTypeObject()
		 * @generated
		 */
		EDataType AXIS_TYPE_OBJECT = eINSTANCE.getAxisTypeObject();

		/**
		 * The meta object literal for the '<em>Call Order Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.CallOrderType
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getCallOrderTypeObject()
		 * @generated
		 */
		EDataType CALL_ORDER_TYPE_OBJECT = eINSTANCE.getCallOrderTypeObject();

		/**
		 * The meta object literal for the '<em>Connect From Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getConnectFromType()
		 * @generated
		 */
		EDataType CONNECT_FROM_TYPE = eINSTANCE.getConnectFromType();

		/**
		 * The meta object literal for the '<em>Connect To Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getConnectToType()
		 * @generated
		 */
		EDataType CONNECT_TO_TYPE = eINSTANCE.getConnectToType();

		/**
		 * The meta object literal for the '<em>Phase Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getPhaseType()
		 * @generated
		 */
		EDataType PHASE_TYPE = eINSTANCE.getPhaseType();

		/**
		 * The meta object literal for the '<em>Scheduling Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.SchedulingType
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getSchedulingTypeObject()
		 * @generated
		 */
		EDataType SCHEDULING_TYPE_OBJECT = eINSTANCE.getSchedulingTypeObject();

		/**
		 * The meta object literal for the '<em>Sci Notation</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getSciNotation()
		 * @generated
		 */
		EDataType SCI_NOTATION = eINSTANCE.getSciNotation();

		/**
		 * The meta object literal for the '<em>Semaphore Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.SemaphoreType
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getSemaphoreTypeObject()
		 * @generated
		 */
		EDataType SEMAPHORE_TYPE_OBJECT = eINSTANCE.getSemaphoreTypeObject();

		/**
		 * The meta object literal for the '<em>Srvn Float</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getSrvnFloat()
		 * @generated
		 */
		EDataType SRVN_FLOAT = eINSTANCE.getSrvnFloat();

		/**
		 * The meta object literal for the '<em>Task Option Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.TaskOptionType
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getTaskOptionTypeObject()
		 * @generated
		 */
		EDataType TASK_OPTION_TYPE_OBJECT = eINSTANCE.getTaskOptionTypeObject();

		/**
		 * The meta object literal for the '<em>Task Scheduling Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.TaskSchedulingType
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getTaskSchedulingTypeObject()
		 * @generated
		 */
		EDataType TASK_SCHEDULING_TYPE_OBJECT = eINSTANCE.getTaskSchedulingTypeObject();

		/**
		 * The meta object literal for the '<em>Type Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.TypeType
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getTypeTypeObject()
		 * @generated
		 */
		EDataType TYPE_TYPE_OBJECT = eINSTANCE.getTypeTypeObject();

		/**
		 * The meta object literal for the '<em>Valid Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.ValidType
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getValidTypeObject()
		 * @generated
		 */
		EDataType VALID_TYPE_OBJECT = eINSTANCE.getValidTypeObject();

		/**
		 * The meta object literal for the '<em>Xml Debug Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.XmlDebugType
		 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LQNPackageImpl#getXmlDebugTypeObject()
		 * @generated
		 */
		EDataType XML_DEBUG_TYPE_OBJECT = eINSTANCE.getXmlDebugTypeObject();

	}

} //LQNPackage
