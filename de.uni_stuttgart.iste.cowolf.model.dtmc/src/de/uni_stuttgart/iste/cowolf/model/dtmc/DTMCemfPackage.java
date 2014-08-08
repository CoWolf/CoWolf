/**
 */
package de.uni_stuttgart.iste.cowolf.model.dtmc;

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
 * @see de.uni_stuttgart.iste.cowolf.model.dtmc.DTMCemfFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 * @generated
 */
public interface DTMCemfPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dtmc";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://dtmc/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dtmc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DTMCemfPackage eINSTANCE = de.uni_stuttgart.iste.cowolf.model.dtmc.impl.DTMCemfPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.dtmc.impl.RootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.dtmc.impl.RootImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.dtmc.impl.DTMCemfPackageImpl#getRoot()
	 * @generated
	 */
	int ROOT = 0;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__STATES = 0;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__TRANSITIONS = 1;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.dtmc.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.dtmc.impl.StateImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.dtmc.impl.DTMCemfPackageImpl#getState()
	 * @generated
	 */
	int STATE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__IS_START = 1;

	/**
	 * The feature id for the '<em><b>Is End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__IS_END = 2;

	/**
	 * The feature id for the '<em><b>Is Fail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__IS_FAIL = 3;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INCOMING = 4;

	/**
	 * The feature id for the '<em><b>Out Going</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__OUT_GOING = 5;

	/**
	 * The feature id for the '<em><b>Formal Param</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__FORMAL_PARAM = 6;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.dtmc.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.dtmc.impl.TransitionImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.dtmc.impl.DTMCemfPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 2;

	/**
	 * The feature id for the '<em><b>Trans Prob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TRANS_PROB = 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TO = 1;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__FROM = 2;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.dtmc.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.dtmc.impl.ParameterImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.dtmc.impl.DTMCemfPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = 1;

	/**
	 * The feature id for the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__STATE = 2;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.dtmc.Root <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.dtmc.Root
	 * @generated
	 */
	EClass getRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_stuttgart.iste.cowolf.model.dtmc.Root#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.dtmc.Root#getStates()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_States();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_stuttgart.iste.cowolf.model.dtmc.Root#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.dtmc.Root#getTransitions()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Transitions();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.dtmc.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.dtmc.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.dtmc.State#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.dtmc.State#getName()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.dtmc.State#isIsStart <em>Is Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Start</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.dtmc.State#isIsStart()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_IsStart();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.dtmc.State#isIsEnd <em>Is End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is End</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.dtmc.State#isIsEnd()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_IsEnd();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.dtmc.State#isIsFail <em>Is Fail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Fail</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.dtmc.State#isIsFail()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_IsFail();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_stuttgart.iste.cowolf.model.dtmc.State#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.dtmc.State#getIncoming()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Incoming();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_stuttgart.iste.cowolf.model.dtmc.State#getOutGoing <em>Out Going</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Out Going</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.dtmc.State#getOutGoing()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_OutGoing();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_stuttgart.iste.cowolf.model.dtmc.State#getFormalParam <em>Formal Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Formal Param</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.dtmc.State#getFormalParam()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_FormalParam();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.dtmc.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.dtmc.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.dtmc.Transition#getTransProb <em>Trans Prob</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trans Prob</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.dtmc.Transition#getTransProb()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_TransProb();

	/**
	 * Returns the meta object for the reference '{@link de.uni_stuttgart.iste.cowolf.model.dtmc.Transition#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.dtmc.Transition#getTo()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_To();

	/**
	 * Returns the meta object for the reference '{@link de.uni_stuttgart.iste.cowolf.model.dtmc.Transition#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.dtmc.Transition#getFrom()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_From();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.dtmc.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.dtmc.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute list '{@link de.uni_stuttgart.iste.cowolf.model.dtmc.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Name</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.dtmc.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for the attribute list '{@link de.uni_stuttgart.iste.cowolf.model.dtmc.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Type</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.dtmc.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Type();

	/**
	 * Returns the meta object for the reference '{@link de.uni_stuttgart.iste.cowolf.model.dtmc.Parameter#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>State</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.dtmc.Parameter#getState()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_State();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DTMCemfFactory getDTMCemfFactory();

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
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.dtmc.impl.RootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.dtmc.impl.RootImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.dtmc.impl.DTMCemfPackageImpl#getRoot()
		 * @generated
		 */
		EClass ROOT = eINSTANCE.getRoot();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__STATES = eINSTANCE.getRoot_States();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__TRANSITIONS = eINSTANCE.getRoot_Transitions();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.dtmc.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.dtmc.impl.StateImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.dtmc.impl.DTMCemfPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__NAME = eINSTANCE.getState_Name();

		/**
		 * The meta object literal for the '<em><b>Is Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__IS_START = eINSTANCE.getState_IsStart();

		/**
		 * The meta object literal for the '<em><b>Is End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__IS_END = eINSTANCE.getState_IsEnd();

		/**
		 * The meta object literal for the '<em><b>Is Fail</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__IS_FAIL = eINSTANCE.getState_IsFail();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__INCOMING = eINSTANCE.getState_Incoming();

		/**
		 * The meta object literal for the '<em><b>Out Going</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__OUT_GOING = eINSTANCE.getState_OutGoing();

		/**
		 * The meta object literal for the '<em><b>Formal Param</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__FORMAL_PARAM = eINSTANCE.getState_FormalParam();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.dtmc.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.dtmc.impl.TransitionImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.dtmc.impl.DTMCemfPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Trans Prob</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__TRANS_PROB = eINSTANCE.getTransition_TransProb();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TO = eINSTANCE.getTransition_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__FROM = eINSTANCE.getTransition_From();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.dtmc.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.dtmc.impl.ParameterImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.dtmc.impl.DTMCemfPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__TYPE = eINSTANCE.getParameter_Type();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__STATE = eINSTANCE.getParameter_State();

	}

} //DTMCemfPackage
