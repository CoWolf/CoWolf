/**
 */
package de.uni_stuttgart.iste.cowolf.model.fault_tree;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTreeFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import commonBase='../../de.uni_stuttgart.iste.cowolf.model/model/CommonBase.ecore#/' ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface FaultTreePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "fault_tree";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://FaultTree/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fault_tree";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FaultTreePackage eINSTANCE = de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.FaultTreePackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.EventImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.FaultTreePackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__ID = CommonBasePackage.ID_BASE__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__DESCRIPTION = CommonBasePackage.ID_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input Gate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__INPUT_GATE = CommonBasePackage.ID_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output Gate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__OUTPUT_GATE = CommonBasePackage.ID_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__ROOT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = CommonBasePackage.ID_BASE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.HazardImpl <em>Hazard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.HazardImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.FaultTreePackageImpl#getHazard()
	 * @generated
	 */
	int HAZARD = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD__ID = EVENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD__DESCRIPTION = EVENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Input Gate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD__INPUT_GATE = EVENT__INPUT_GATE;

	/**
	 * The feature id for the '<em><b>Output Gate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD__OUTPUT_GATE = EVENT__OUTPUT_GATE;

	/**
	 * The feature id for the '<em><b>Root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD__ROOT = EVENT__ROOT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>In Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD__IN_EVENT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hazard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_FEATURE_COUNT = EVENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.GateImpl <em>Gate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.GateImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.FaultTreePackageImpl#getGate()
	 * @generated
	 */
	int GATE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__ID = CommonBasePackage.ID_BASE__ID;

	/**
	 * The feature id for the '<em><b>Input Gates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__INPUT_GATES = CommonBasePackage.ID_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__INPUT_EVENTS = CommonBasePackage.ID_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output Gate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__OUTPUT_GATE = CommonBasePackage.ID_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Output Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__OUTPUT_EVENT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__ROOT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE_FEATURE_COUNT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.IntermediateEventImpl <em>Intermediate Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.IntermediateEventImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.FaultTreePackageImpl#getIntermediateEvent()
	 * @generated
	 */
	int INTERMEDIATE_EVENT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_EVENT__ID = EVENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_EVENT__DESCRIPTION = EVENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Input Gate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_EVENT__INPUT_GATE = EVENT__INPUT_GATE;

	/**
	 * The feature id for the '<em><b>Output Gate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_EVENT__OUTPUT_GATE = EVENT__OUTPUT_GATE;

	/**
	 * The feature id for the '<em><b>Root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_EVENT__ROOT = EVENT__ROOT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_EVENT__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_EVENT__INSTANCE = EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_EVENT__IN_EVENT = EVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Out Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_EVENT__OUT_EVENT = EVENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Intermediate Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.FailureTypeImpl <em>Failure Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.FailureTypeImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.FaultTreePackageImpl#getFailureType()
	 * @generated
	 */
	int FAILURE_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_TYPE__ID = CommonBasePackage.ID_BASE__ID;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_TYPE__INSTANCE = CommonBasePackage.ID_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_TYPE__ROOT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_TYPE__NAME = CommonBasePackage.ID_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Failure Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_TYPE_FEATURE_COUNT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.FailureInstanceImpl <em>Failure Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.FailureInstanceImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.FaultTreePackageImpl#getFailureInstance()
	 * @generated
	 */
	int FAILURE_INSTANCE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_INSTANCE__ID = CommonBasePackage.ID_BASE__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_INSTANCE__TYPE = CommonBasePackage.ID_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_INSTANCE__ROOT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Previous Failure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_INSTANCE__PREVIOUS_FAILURE = CommonBasePackage.ID_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Previous Error</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_INSTANCE__PREVIOUS_ERROR = CommonBasePackage.ID_BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_INSTANCE__EVENT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_INSTANCE__NAME = CommonBasePackage.ID_BASE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Failure Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_INSTANCE_FEATURE_COUNT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.BasicEventImpl <em>Basic Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.BasicEventImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.FaultTreePackageImpl#getBasicEvent()
	 * @generated
	 */
	int BASIC_EVENT = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_EVENT__ID = EVENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_EVENT__DESCRIPTION = EVENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Input Gate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_EVENT__INPUT_GATE = EVENT__INPUT_GATE;

	/**
	 * The feature id for the '<em><b>Output Gate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_EVENT__OUTPUT_GATE = EVENT__OUTPUT_GATE;

	/**
	 * The feature id for the '<em><b>Root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_EVENT__ROOT = EVENT__ROOT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_EVENT__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_EVENT__INSTANCE = EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_EVENT__PROBABILITY = EVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Out Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_EVENT__OUT_EVENT = EVENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Basic Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.UndevelopedEventImpl <em>Undeveloped Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.UndevelopedEventImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.FaultTreePackageImpl#getUndevelopedEvent()
	 * @generated
	 */
	int UNDEVELOPED_EVENT = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDEVELOPED_EVENT__ID = EVENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDEVELOPED_EVENT__DESCRIPTION = EVENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Input Gate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDEVELOPED_EVENT__INPUT_GATE = EVENT__INPUT_GATE;

	/**
	 * The feature id for the '<em><b>Output Gate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDEVELOPED_EVENT__OUTPUT_GATE = EVENT__OUTPUT_GATE;

	/**
	 * The feature id for the '<em><b>Root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDEVELOPED_EVENT__ROOT = EVENT__ROOT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDEVELOPED_EVENT__NAME = EVENT__NAME;

	/**
	 * The number of structural features of the '<em>Undeveloped Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDEVELOPED_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.ErrorTypeImpl <em>Error Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.ErrorTypeImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.FaultTreePackageImpl#getErrorType()
	 * @generated
	 */
	int ERROR_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TYPE__ID = CommonBasePackage.ID_BASE__ID;

	/**
	 * The feature id for the '<em><b>Error</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TYPE__ERROR = CommonBasePackage.ID_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TYPE__ROOT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TYPE__NAME = CommonBasePackage.ID_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Error Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TYPE_FEATURE_COUNT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.ErrorInstanceImpl <em>Error Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.ErrorInstanceImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.FaultTreePackageImpl#getErrorInstance()
	 * @generated
	 */
	int ERROR_INSTANCE = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_INSTANCE__ID = CommonBasePackage.ID_BASE__ID;

	/**
	 * The feature id for the '<em><b>Error</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_INSTANCE__ERROR = CommonBasePackage.ID_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_INSTANCE__TYPE = CommonBasePackage.ID_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_INSTANCE__ROOT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_INSTANCE__NAME = CommonBasePackage.ID_BASE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Error Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_INSTANCE_FEATURE_COUNT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.ORImpl <em>OR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.ORImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.FaultTreePackageImpl#getOR()
	 * @generated
	 */
	int OR = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__ID = GATE__ID;

	/**
	 * The feature id for the '<em><b>Input Gates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__INPUT_GATES = GATE__INPUT_GATES;

	/**
	 * The feature id for the '<em><b>Input Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__INPUT_EVENTS = GATE__INPUT_EVENTS;

	/**
	 * The feature id for the '<em><b>Output Gate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__OUTPUT_GATE = GATE__OUTPUT_GATE;

	/**
	 * The feature id for the '<em><b>Output Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__OUTPUT_EVENT = GATE__OUTPUT_EVENT;

	/**
	 * The feature id for the '<em><b>Root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__ROOT = GATE__ROOT;

	/**
	 * The number of structural features of the '<em>OR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_COUNT = GATE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.ANDImpl <em>AND</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.ANDImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.FaultTreePackageImpl#getAND()
	 * @generated
	 */
	int AND = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__ID = GATE__ID;

	/**
	 * The feature id for the '<em><b>Input Gates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__INPUT_GATES = GATE__INPUT_GATES;

	/**
	 * The feature id for the '<em><b>Input Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__INPUT_EVENTS = GATE__INPUT_EVENTS;

	/**
	 * The feature id for the '<em><b>Output Gate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__OUTPUT_GATE = GATE__OUTPUT_GATE;

	/**
	 * The feature id for the '<em><b>Output Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__OUTPUT_EVENT = GATE__OUTPUT_EVENT;

	/**
	 * The feature id for the '<em><b>Root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__ROOT = GATE__ROOT;

	/**
	 * The number of structural features of the '<em>AND</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FEATURE_COUNT = GATE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.XORImpl <em>XOR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.XORImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.FaultTreePackageImpl#getXOR()
	 * @generated
	 */
	int XOR = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR__ID = GATE__ID;

	/**
	 * The feature id for the '<em><b>Input Gates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR__INPUT_GATES = GATE__INPUT_GATES;

	/**
	 * The feature id for the '<em><b>Input Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR__INPUT_EVENTS = GATE__INPUT_EVENTS;

	/**
	 * The feature id for the '<em><b>Output Gate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR__OUTPUT_GATE = GATE__OUTPUT_GATE;

	/**
	 * The feature id for the '<em><b>Output Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR__OUTPUT_EVENT = GATE__OUTPUT_EVENT;

	/**
	 * The feature id for the '<em><b>Root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR__ROOT = GATE__ROOT;

	/**
	 * The number of structural features of the '<em>XOR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_FEATURE_COUNT = GATE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.PriorANDImpl <em>Prior AND</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.PriorANDImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.FaultTreePackageImpl#getPriorAND()
	 * @generated
	 */
	int PRIOR_AND = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIOR_AND__ID = GATE__ID;

	/**
	 * The feature id for the '<em><b>Input Gates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIOR_AND__INPUT_GATES = GATE__INPUT_GATES;

	/**
	 * The feature id for the '<em><b>Input Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIOR_AND__INPUT_EVENTS = GATE__INPUT_EVENTS;

	/**
	 * The feature id for the '<em><b>Output Gate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIOR_AND__OUTPUT_GATE = GATE__OUTPUT_GATE;

	/**
	 * The feature id for the '<em><b>Output Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIOR_AND__OUTPUT_EVENT = GATE__OUTPUT_EVENT;

	/**
	 * The feature id for the '<em><b>Root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIOR_AND__ROOT = GATE__ROOT;

	/**
	 * The number of structural features of the '<em>Prior AND</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIOR_AND_FEATURE_COUNT = GATE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.InhibitImpl <em>Inhibit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.InhibitImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.FaultTreePackageImpl#getInhibit()
	 * @generated
	 */
	int INHIBIT = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHIBIT__ID = GATE__ID;

	/**
	 * The feature id for the '<em><b>Input Gates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHIBIT__INPUT_GATES = GATE__INPUT_GATES;

	/**
	 * The feature id for the '<em><b>Input Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHIBIT__INPUT_EVENTS = GATE__INPUT_EVENTS;

	/**
	 * The feature id for the '<em><b>Output Gate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHIBIT__OUTPUT_GATE = GATE__OUTPUT_GATE;

	/**
	 * The feature id for the '<em><b>Output Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHIBIT__OUTPUT_EVENT = GATE__OUTPUT_EVENT;

	/**
	 * The feature id for the '<em><b>Root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHIBIT__ROOT = GATE__ROOT;

	/**
	 * The number of structural features of the '<em>Inhibit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHIBIT_FEATURE_COUNT = GATE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.FaultTreeImpl <em>Fault Tree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.FaultTreeImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.FaultTreePackageImpl#getFaultTree()
	 * @generated
	 */
	int FAULT_TREE = 15;

	/**
	 * The feature id for the '<em><b>Hazard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_TREE__HAZARD = 0;

	/**
	 * The feature id for the '<em><b>Gate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_TREE__GATE = 1;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_TREE__EVENT = 2;

	/**
	 * The feature id for the '<em><b>Failure instance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_TREE__FAILURE_INSTANCE = 3;

	/**
	 * The feature id for the '<em><b>Failure type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_TREE__FAILURE_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Error instance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_TREE__ERROR_INSTANCE = 5;

	/**
	 * The feature id for the '<em><b>Error type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_TREE__ERROR_TYPE = 6;

	/**
	 * The number of structural features of the '<em>Fault Tree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_TREE_FEATURE_COUNT = 7;

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.Hazard <em>Hazard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hazard</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.Hazard
	 * @generated
	 */
	EClass getHazard();

	/**
	 * Returns the meta object for the reference '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.Hazard#getInEvent <em>In Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>In Event</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.Hazard#getInEvent()
	 * @see #getHazard()
	 * @generated
	 */
	EReference getHazard_InEvent();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.Gate <em>Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gate</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.Gate
	 * @generated
	 */
	EClass getGate();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.Gate#getInputGates <em>Input Gates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input Gates</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.Gate#getInputGates()
	 * @see #getGate()
	 * @generated
	 */
	EReference getGate_InputGates();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.Gate#getInputEvents <em>Input Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input Events</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.Gate#getInputEvents()
	 * @see #getGate()
	 * @generated
	 */
	EReference getGate_InputEvents();

	/**
	 * Returns the meta object for the reference '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.Gate#getOutputGate <em>Output Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output Gate</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.Gate#getOutputGate()
	 * @see #getGate()
	 * @generated
	 */
	EReference getGate_OutputGate();

	/**
	 * Returns the meta object for the reference '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.Gate#getOutputEvent <em>Output Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output Event</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.Gate#getOutputEvent()
	 * @see #getGate()
	 * @generated
	 */
	EReference getGate_OutputEvent();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.Gate#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Root</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.Gate#getRoot()
	 * @see #getGate()
	 * @generated
	 */
	EReference getGate_Root();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.Event#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.Event#getDescription()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Description();

	/**
	 * Returns the meta object for the reference '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.Event#getInputGate <em>Input Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input Gate</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.Event#getInputGate()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_InputGate();

	/**
	 * Returns the meta object for the reference '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.Event#getOutputGate <em>Output Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output Gate</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.Event#getOutputGate()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_OutputGate();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.Event#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Root</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.Event#getRoot()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_Root();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.Event#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.Event#getName()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Name();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.IntermediateEvent <em>Intermediate Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intermediate Event</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.IntermediateEvent
	 * @generated
	 */
	EClass getIntermediateEvent();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.IntermediateEvent#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Instance</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.IntermediateEvent#getInstance()
	 * @see #getIntermediateEvent()
	 * @generated
	 */
	EReference getIntermediateEvent_Instance();

	/**
	 * Returns the meta object for the reference '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.IntermediateEvent#getInEvent <em>In Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>In Event</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.IntermediateEvent#getInEvent()
	 * @see #getIntermediateEvent()
	 * @generated
	 */
	EReference getIntermediateEvent_InEvent();

	/**
	 * Returns the meta object for the reference '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.IntermediateEvent#getOutEvent <em>Out Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Out Event</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.IntermediateEvent#getOutEvent()
	 * @see #getIntermediateEvent()
	 * @generated
	 */
	EReference getIntermediateEvent_OutEvent();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.FailureType <em>Failure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Failure Type</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.FailureType
	 * @generated
	 */
	EClass getFailureType();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.FailureType#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Instance</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.FailureType#getInstance()
	 * @see #getFailureType()
	 * @generated
	 */
	EReference getFailureType_Instance();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.FailureType#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Root</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.FailureType#getRoot()
	 * @see #getFailureType()
	 * @generated
	 */
	EReference getFailureType_Root();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.FailureType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.FailureType#getName()
	 * @see #getFailureType()
	 * @generated
	 */
	EAttribute getFailureType_Name();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.FailureInstance <em>Failure Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Failure Instance</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.FailureInstance
	 * @generated
	 */
	EClass getFailureInstance();

	/**
	 * Returns the meta object for the reference '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.FailureInstance#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.FailureInstance#getType()
	 * @see #getFailureInstance()
	 * @generated
	 */
	EReference getFailureInstance_Type();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.FailureInstance#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Root</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.FailureInstance#getRoot()
	 * @see #getFailureInstance()
	 * @generated
	 */
	EReference getFailureInstance_Root();

	/**
	 * Returns the meta object for the reference '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.FailureInstance#getPreviousFailure <em>Previous Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Previous Failure</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.FailureInstance#getPreviousFailure()
	 * @see #getFailureInstance()
	 * @generated
	 */
	EReference getFailureInstance_PreviousFailure();

	/**
	 * Returns the meta object for the reference '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.FailureInstance#getPreviousError <em>Previous Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Previous Error</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.FailureInstance#getPreviousError()
	 * @see #getFailureInstance()
	 * @generated
	 */
	EReference getFailureInstance_PreviousError();

	/**
	 * Returns the meta object for the reference '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.FailureInstance#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Event</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.FailureInstance#getEvent()
	 * @see #getFailureInstance()
	 * @generated
	 */
	EReference getFailureInstance_Event();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.FailureInstance#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.FailureInstance#getName()
	 * @see #getFailureInstance()
	 * @generated
	 */
	EAttribute getFailureInstance_Name();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.BasicEvent <em>Basic Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Event</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.BasicEvent
	 * @generated
	 */
	EClass getBasicEvent();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.BasicEvent#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Instance</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.BasicEvent#getInstance()
	 * @see #getBasicEvent()
	 * @generated
	 */
	EReference getBasicEvent_Instance();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.BasicEvent#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.BasicEvent#getProbability()
	 * @see #getBasicEvent()
	 * @generated
	 */
	EAttribute getBasicEvent_Probability();

	/**
	 * Returns the meta object for the reference '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.BasicEvent#getOutEvent <em>Out Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Out Event</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.BasicEvent#getOutEvent()
	 * @see #getBasicEvent()
	 * @generated
	 */
	EReference getBasicEvent_OutEvent();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.UndevelopedEvent <em>Undeveloped Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Undeveloped Event</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.UndevelopedEvent
	 * @generated
	 */
	EClass getUndevelopedEvent();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.ErrorType <em>Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Type</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.ErrorType
	 * @generated
	 */
	EClass getErrorType();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.ErrorType#getError <em>Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Error</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.ErrorType#getError()
	 * @see #getErrorType()
	 * @generated
	 */
	EReference getErrorType_Error();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.ErrorType#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Root</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.ErrorType#getRoot()
	 * @see #getErrorType()
	 * @generated
	 */
	EReference getErrorType_Root();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.ErrorType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.ErrorType#getName()
	 * @see #getErrorType()
	 * @generated
	 */
	EAttribute getErrorType_Name();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.ErrorInstance <em>Error Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Instance</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.ErrorInstance
	 * @generated
	 */
	EClass getErrorInstance();

	/**
	 * Returns the meta object for the reference '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.ErrorInstance#getError <em>Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Error</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.ErrorInstance#getError()
	 * @see #getErrorInstance()
	 * @generated
	 */
	EReference getErrorInstance_Error();

	/**
	 * Returns the meta object for the reference '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.ErrorInstance#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.ErrorInstance#getType()
	 * @see #getErrorInstance()
	 * @generated
	 */
	EReference getErrorInstance_Type();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.ErrorInstance#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Root</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.ErrorInstance#getRoot()
	 * @see #getErrorInstance()
	 * @generated
	 */
	EReference getErrorInstance_Root();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.ErrorInstance#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.ErrorInstance#getName()
	 * @see #getErrorInstance()
	 * @generated
	 */
	EAttribute getErrorInstance_Name();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.OR <em>OR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OR</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.OR
	 * @generated
	 */
	EClass getOR();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.AND <em>AND</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AND</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.AND
	 * @generated
	 */
	EClass getAND();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.XOR <em>XOR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XOR</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.XOR
	 * @generated
	 */
	EClass getXOR();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.PriorAND <em>Prior AND</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prior AND</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.PriorAND
	 * @generated
	 */
	EClass getPriorAND();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.Inhibit <em>Inhibit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inhibit</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.Inhibit
	 * @generated
	 */
	EClass getInhibit();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTree <em>Fault Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fault Tree</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTree
	 * @generated
	 */
	EClass getFaultTree();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTree#getHazard <em>Hazard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hazard</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTree#getHazard()
	 * @see #getFaultTree()
	 * @generated
	 */
	EReference getFaultTree_Hazard();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTree#getGate <em>Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gate</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTree#getGate()
	 * @see #getFaultTree()
	 * @generated
	 */
	EReference getFaultTree_Gate();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTree#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTree#getEvent()
	 * @see #getFaultTree()
	 * @generated
	 */
	EReference getFaultTree_Event();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTree#getFailure_instance <em>Failure instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Failure instance</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTree#getFailure_instance()
	 * @see #getFaultTree()
	 * @generated
	 */
	EReference getFaultTree_Failure_instance();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTree#getFailure_type <em>Failure type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Failure type</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTree#getFailure_type()
	 * @see #getFaultTree()
	 * @generated
	 */
	EReference getFaultTree_Failure_type();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTree#getError_instance <em>Error instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Error instance</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTree#getError_instance()
	 * @see #getFaultTree()
	 * @generated
	 */
	EReference getFaultTree_Error_instance();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTree#getError_type <em>Error type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Error type</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTree#getError_type()
	 * @see #getFaultTree()
	 * @generated
	 */
	EReference getFaultTree_Error_type();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FaultTreeFactory getFaultTreeFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.HazardImpl <em>Hazard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.HazardImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.FaultTreePackageImpl#getHazard()
		 * @generated
		 */
		EClass HAZARD = eINSTANCE.getHazard();

		/**
		 * The meta object literal for the '<em><b>In Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAZARD__IN_EVENT = eINSTANCE.getHazard_InEvent();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.GateImpl <em>Gate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.GateImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.FaultTreePackageImpl#getGate()
		 * @generated
		 */
		EClass GATE = eINSTANCE.getGate();

		/**
		 * The meta object literal for the '<em><b>Input Gates</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GATE__INPUT_GATES = eINSTANCE.getGate_InputGates();

		/**
		 * The meta object literal for the '<em><b>Input Events</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GATE__INPUT_EVENTS = eINSTANCE.getGate_InputEvents();

		/**
		 * The meta object literal for the '<em><b>Output Gate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GATE__OUTPUT_GATE = eINSTANCE.getGate_OutputGate();

		/**
		 * The meta object literal for the '<em><b>Output Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GATE__OUTPUT_EVENT = eINSTANCE.getGate_OutputEvent();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GATE__ROOT = eINSTANCE.getGate_Root();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.EventImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.FaultTreePackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__DESCRIPTION = eINSTANCE.getEvent_Description();

		/**
		 * The meta object literal for the '<em><b>Input Gate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__INPUT_GATE = eINSTANCE.getEvent_InputGate();

		/**
		 * The meta object literal for the '<em><b>Output Gate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__OUTPUT_GATE = eINSTANCE.getEvent_OutputGate();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__ROOT = eINSTANCE.getEvent_Root();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__NAME = eINSTANCE.getEvent_Name();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.IntermediateEventImpl <em>Intermediate Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.IntermediateEventImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.FaultTreePackageImpl#getIntermediateEvent()
		 * @generated
		 */
		EClass INTERMEDIATE_EVENT = eINSTANCE.getIntermediateEvent();

		/**
		 * The meta object literal for the '<em><b>Instance</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERMEDIATE_EVENT__INSTANCE = eINSTANCE.getIntermediateEvent_Instance();

		/**
		 * The meta object literal for the '<em><b>In Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERMEDIATE_EVENT__IN_EVENT = eINSTANCE.getIntermediateEvent_InEvent();

		/**
		 * The meta object literal for the '<em><b>Out Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERMEDIATE_EVENT__OUT_EVENT = eINSTANCE.getIntermediateEvent_OutEvent();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.FailureTypeImpl <em>Failure Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.FailureTypeImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.FaultTreePackageImpl#getFailureType()
		 * @generated
		 */
		EClass FAILURE_TYPE = eINSTANCE.getFailureType();

		/**
		 * The meta object literal for the '<em><b>Instance</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAILURE_TYPE__INSTANCE = eINSTANCE.getFailureType_Instance();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAILURE_TYPE__ROOT = eINSTANCE.getFailureType_Root();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAILURE_TYPE__NAME = eINSTANCE.getFailureType_Name();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.FailureInstanceImpl <em>Failure Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.FailureInstanceImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.FaultTreePackageImpl#getFailureInstance()
		 * @generated
		 */
		EClass FAILURE_INSTANCE = eINSTANCE.getFailureInstance();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAILURE_INSTANCE__TYPE = eINSTANCE.getFailureInstance_Type();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAILURE_INSTANCE__ROOT = eINSTANCE.getFailureInstance_Root();

		/**
		 * The meta object literal for the '<em><b>Previous Failure</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAILURE_INSTANCE__PREVIOUS_FAILURE = eINSTANCE.getFailureInstance_PreviousFailure();

		/**
		 * The meta object literal for the '<em><b>Previous Error</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAILURE_INSTANCE__PREVIOUS_ERROR = eINSTANCE.getFailureInstance_PreviousError();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAILURE_INSTANCE__EVENT = eINSTANCE.getFailureInstance_Event();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAILURE_INSTANCE__NAME = eINSTANCE.getFailureInstance_Name();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.BasicEventImpl <em>Basic Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.BasicEventImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.FaultTreePackageImpl#getBasicEvent()
		 * @generated
		 */
		EClass BASIC_EVENT = eINSTANCE.getBasicEvent();

		/**
		 * The meta object literal for the '<em><b>Instance</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASIC_EVENT__INSTANCE = eINSTANCE.getBasicEvent_Instance();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_EVENT__PROBABILITY = eINSTANCE.getBasicEvent_Probability();

		/**
		 * The meta object literal for the '<em><b>Out Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASIC_EVENT__OUT_EVENT = eINSTANCE.getBasicEvent_OutEvent();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.UndevelopedEventImpl <em>Undeveloped Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.UndevelopedEventImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.FaultTreePackageImpl#getUndevelopedEvent()
		 * @generated
		 */
		EClass UNDEVELOPED_EVENT = eINSTANCE.getUndevelopedEvent();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.ErrorTypeImpl <em>Error Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.ErrorTypeImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.FaultTreePackageImpl#getErrorType()
		 * @generated
		 */
		EClass ERROR_TYPE = eINSTANCE.getErrorType();

		/**
		 * The meta object literal for the '<em><b>Error</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_TYPE__ERROR = eINSTANCE.getErrorType_Error();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_TYPE__ROOT = eINSTANCE.getErrorType_Root();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR_TYPE__NAME = eINSTANCE.getErrorType_Name();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.ErrorInstanceImpl <em>Error Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.ErrorInstanceImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.FaultTreePackageImpl#getErrorInstance()
		 * @generated
		 */
		EClass ERROR_INSTANCE = eINSTANCE.getErrorInstance();

		/**
		 * The meta object literal for the '<em><b>Error</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_INSTANCE__ERROR = eINSTANCE.getErrorInstance_Error();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_INSTANCE__TYPE = eINSTANCE.getErrorInstance_Type();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_INSTANCE__ROOT = eINSTANCE.getErrorInstance_Root();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR_INSTANCE__NAME = eINSTANCE.getErrorInstance_Name();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.ORImpl <em>OR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.ORImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.FaultTreePackageImpl#getOR()
		 * @generated
		 */
		EClass OR = eINSTANCE.getOR();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.ANDImpl <em>AND</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.ANDImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.FaultTreePackageImpl#getAND()
		 * @generated
		 */
		EClass AND = eINSTANCE.getAND();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.XORImpl <em>XOR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.XORImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.FaultTreePackageImpl#getXOR()
		 * @generated
		 */
		EClass XOR = eINSTANCE.getXOR();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.PriorANDImpl <em>Prior AND</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.PriorANDImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.FaultTreePackageImpl#getPriorAND()
		 * @generated
		 */
		EClass PRIOR_AND = eINSTANCE.getPriorAND();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.InhibitImpl <em>Inhibit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.InhibitImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.FaultTreePackageImpl#getInhibit()
		 * @generated
		 */
		EClass INHIBIT = eINSTANCE.getInhibit();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.FaultTreeImpl <em>Fault Tree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.FaultTreeImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.FaultTreePackageImpl#getFaultTree()
		 * @generated
		 */
		EClass FAULT_TREE = eINSTANCE.getFaultTree();

		/**
		 * The meta object literal for the '<em><b>Hazard</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAULT_TREE__HAZARD = eINSTANCE.getFaultTree_Hazard();

		/**
		 * The meta object literal for the '<em><b>Gate</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAULT_TREE__GATE = eINSTANCE.getFaultTree_Gate();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAULT_TREE__EVENT = eINSTANCE.getFaultTree_Event();

		/**
		 * The meta object literal for the '<em><b>Failure instance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAULT_TREE__FAILURE_INSTANCE = eINSTANCE.getFaultTree_Failure_instance();

		/**
		 * The meta object literal for the '<em><b>Failure type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAULT_TREE__FAILURE_TYPE = eINSTANCE.getFaultTree_Failure_type();

		/**
		 * The meta object literal for the '<em><b>Error instance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAULT_TREE__ERROR_INSTANCE = eINSTANCE.getFaultTree_Error_instance();

		/**
		 * The meta object literal for the '<em><b>Error type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAULT_TREE__ERROR_TYPE = eINSTANCE.getFaultTree_Error_type();

	}

} //FaultTreePackage
