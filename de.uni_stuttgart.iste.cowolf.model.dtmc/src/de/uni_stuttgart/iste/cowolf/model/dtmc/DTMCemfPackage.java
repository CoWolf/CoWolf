/**
 */
package de.uni_stuttgart.iste.cowolf.model.dtmc;

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
 * @see de.uni_stuttgart.iste.cowolf.model.dtmc.DTMCemfFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import commonBase='../../de.uni_stuttgart.iste.cowolf.model/model/CommonBase.ecore#/' ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
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
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.dtmc.impl.DTMCImpl <em>DTMC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.dtmc.impl.DTMCImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.dtmc.impl.DTMCemfPackageImpl#getDTMC()
	 * @generated
	 */
	int DTMC = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTMC__ID = CommonBasePackage.ID_BASE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTMC__NAME = CommonBasePackage.ID_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTMC__STATES = CommonBasePackage.ID_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Initial State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTMC__INITIAL_STATE = CommonBasePackage.ID_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>DTMC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTMC_FEATURE_COUNT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>DTMC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTMC_OPERATION_COUNT = CommonBasePackage.ID_BASE_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ID = CommonBasePackage.ID_BASE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = CommonBasePackage.ID_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INCOMING = CommonBasePackage.ID_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__OUTGOING = CommonBasePackage.ID_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__LABELS = CommonBasePackage.ID_BASE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = CommonBasePackage.ID_BASE_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ID = CommonBasePackage.ID_BASE__ID;

	/**
	 * The feature id for the '<em><b>From</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__FROM = CommonBasePackage.ID_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TO = CommonBasePackage.ID_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Prob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__PROB = CommonBasePackage.ID_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = CommonBasePackage.ID_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.dtmc.impl.LabelImpl <em>Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.dtmc.impl.LabelImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.dtmc.impl.DTMCemfPackageImpl#getLabel()
	 * @generated
	 */
	int LABEL = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__ID = CommonBasePackage.ID_BASE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__NAME = CommonBasePackage.ID_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__STATE = CommonBasePackage.ID_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_FEATURE_COUNT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_OPERATION_COUNT = CommonBasePackage.ID_BASE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.dtmc.DTMC <em>DTMC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DTMC</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.dtmc.DTMC
	 * @generated
	 */
	EClass getDTMC();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.dtmc.DTMC#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.dtmc.DTMC#getName()
	 * @see #getDTMC()
	 * @generated
	 */
	EAttribute getDTMC_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_stuttgart.iste.cowolf.model.dtmc.DTMC#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.dtmc.DTMC#getStates()
	 * @see #getDTMC()
	 * @generated
	 */
	EReference getDTMC_States();

	/**
	 * Returns the meta object for the reference '{@link de.uni_stuttgart.iste.cowolf.model.dtmc.DTMC#getInitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initial State</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.dtmc.DTMC#getInitialState()
	 * @see #getDTMC()
	 * @generated
	 */
	EReference getDTMC_InitialState();

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
	 * Returns the meta object for the containment reference list '{@link de.uni_stuttgart.iste.cowolf.model.dtmc.State#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outgoing</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.dtmc.State#getOutgoing()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Outgoing();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_stuttgart.iste.cowolf.model.dtmc.State#getLabels <em>Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Labels</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.dtmc.State#getLabels()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Labels();

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
	 * Returns the meta object for the container reference '{@link de.uni_stuttgart.iste.cowolf.model.dtmc.Transition#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>From</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.dtmc.Transition#getFrom()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_From();

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
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.dtmc.Transition#getProb <em>Prob</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prob</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.dtmc.Transition#getProb()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Prob();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.dtmc.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.dtmc.Label
	 * @generated
	 */
	EClass getLabel();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.dtmc.Label#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.dtmc.Label#getName()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Name();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_stuttgart.iste.cowolf.model.dtmc.Label#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>State</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.dtmc.Label#getState()
	 * @see #getLabel()
	 * @generated
	 */
	EReference getLabel_State();

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
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.dtmc.impl.DTMCImpl <em>DTMC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.dtmc.impl.DTMCImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.dtmc.impl.DTMCemfPackageImpl#getDTMC()
		 * @generated
		 */
		EClass DTMC = eINSTANCE.getDTMC();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DTMC__NAME = eINSTANCE.getDTMC_Name();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DTMC__STATES = eINSTANCE.getDTMC_States();

		/**
		 * The meta object literal for the '<em><b>Initial State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DTMC__INITIAL_STATE = eINSTANCE.getDTMC_InitialState();

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
		 * The meta object literal for the '<em><b>Incoming</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__INCOMING = eINSTANCE.getState_Incoming();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__OUTGOING = eINSTANCE.getState_Outgoing();

		/**
		 * The meta object literal for the '<em><b>Labels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__LABELS = eINSTANCE.getState_Labels();

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
		 * The meta object literal for the '<em><b>From</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__FROM = eINSTANCE.getTransition_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TO = eINSTANCE.getTransition_To();

		/**
		 * The meta object literal for the '<em><b>Prob</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__PROB = eINSTANCE.getTransition_Prob();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.dtmc.impl.LabelImpl <em>Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.dtmc.impl.LabelImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.dtmc.impl.DTMCemfPackageImpl#getLabel()
		 * @generated
		 */
		EClass LABEL = eINSTANCE.getLabel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__NAME = eINSTANCE.getLabel_Name();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LABEL__STATE = eINSTANCE.getLabel_State();

	}

} //DTMCemfPackage
