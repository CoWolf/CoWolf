/**
 */
package de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl;

import de.uni_stuttgart.iste.cowolf.model.activity_diagram.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Activity_diagramFactoryImpl extends EFactoryImpl implements Activity_diagramFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Activity_diagramFactory init() {
		try {
			Activity_diagramFactory theActivity_diagramFactory = (Activity_diagramFactory)EPackage.Registry.INSTANCE.getEFactory(Activity_diagramPackage.eNS_URI);
			if (theActivity_diagramFactory != null) {
				return theActivity_diagramFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Activity_diagramFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity_diagramFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Activity_diagramPackage.ACTIVITY_DIAGRAM: return createActivityDiagram();
			case Activity_diagramPackage.START: return createStart();
			case Activity_diagramPackage.ACTION: return createAction();
			case Activity_diagramPackage.DECISION: return createDecision();
			case Activity_diagramPackage.SPLIT: return createSplit();
			case Activity_diagramPackage.JOIN: return createJoin();
			case Activity_diagramPackage.END: return createEnd();
			case Activity_diagramPackage.ARROW_AFTER_START: return createArrowAfterStart();
			case Activity_diagramPackage.DECISION_ARROW: return createDecisionArrow();
			case Activity_diagramPackage.AFTER_ACTION_ARROW: return createAfterActionArrow();
			case Activity_diagramPackage.SPLIT_ARROW: return createSplitArrow();
			case Activity_diagramPackage.JOIN_ARROW: return createJoinArrow();
			case Activity_diagramPackage.ARROW_AFTER_JOIN: return createArrowAfterJoin();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityDiagram createActivityDiagram() {
		ActivityDiagramImpl activityDiagram = new ActivityDiagramImpl();
		return activityDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Start createStart() {
		StartImpl start = new StartImpl();
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decision createDecision() {
		DecisionImpl decision = new DecisionImpl();
		return decision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Split createSplit() {
		SplitImpl split = new SplitImpl();
		return split;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Join createJoin() {
		JoinImpl join = new JoinImpl();
		return join;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public End createEnd() {
		EndImpl end = new EndImpl();
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrowAfterStart createArrowAfterStart() {
		ArrowAfterStartImpl arrowAfterStart = new ArrowAfterStartImpl();
		return arrowAfterStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionArrow createDecisionArrow() {
		DecisionArrowImpl decisionArrow = new DecisionArrowImpl();
		return decisionArrow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AfterActionArrow createAfterActionArrow() {
		AfterActionArrowImpl afterActionArrow = new AfterActionArrowImpl();
		return afterActionArrow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SplitArrow createSplitArrow() {
		SplitArrowImpl splitArrow = new SplitArrowImpl();
		return splitArrow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinArrow createJoinArrow() {
		JoinArrowImpl joinArrow = new JoinArrowImpl();
		return joinArrow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrowAfterJoin createArrowAfterJoin() {
		ArrowAfterJoinImpl arrowAfterJoin = new ArrowAfterJoinImpl();
		return arrowAfterJoin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity_diagramPackage getActivity_diagramPackage() {
		return (Activity_diagramPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Activity_diagramPackage getPackage() {
		return Activity_diagramPackage.eINSTANCE;
	}

} //Activity_diagramFactoryImpl
