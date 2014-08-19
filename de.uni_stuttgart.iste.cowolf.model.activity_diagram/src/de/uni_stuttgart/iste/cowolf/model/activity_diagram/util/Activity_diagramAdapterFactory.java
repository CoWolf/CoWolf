/**
 */
package de.uni_stuttgart.iste.cowolf.model.activity_diagram.util;

import de.uni_stuttgart.iste.cowolf.model.activity_diagram.*;

import de.uni_stuttgart.iste.cowolf.model.commonBase.IDBase;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.Activity_diagramPackage
 * @generated
 */
public class Activity_diagramAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Activity_diagramPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity_diagramAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Activity_diagramPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Activity_diagramSwitch<Adapter> modelSwitch =
		new Activity_diagramSwitch<Adapter>() {
			@Override
			public Adapter caseActivityDiagram(ActivityDiagram object) {
				return createActivityDiagramAdapter();
			}
			@Override
			public Adapter caseStart(Start object) {
				return createStartAdapter();
			}
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter caseDecision(Decision object) {
				return createDecisionAdapter();
			}
			@Override
			public Adapter caseSplit(Split object) {
				return createSplitAdapter();
			}
			@Override
			public Adapter caseJoin(Join object) {
				return createJoinAdapter();
			}
			@Override
			public Adapter caseEnd(End object) {
				return createEndAdapter();
			}
			@Override
			public Adapter caseNodesWithoutJoin(NodesWithoutJoin object) {
				return createNodesWithoutJoinAdapter();
			}
			@Override
			public Adapter caseArrowAfterStart(ArrowAfterStart object) {
				return createArrowAfterStartAdapter();
			}
			@Override
			public Adapter caseDecisionArrow(DecisionArrow object) {
				return createDecisionArrowAdapter();
			}
			@Override
			public Adapter caseAfterActionArrow(AfterActionArrow object) {
				return createAfterActionArrowAdapter();
			}
			@Override
			public Adapter caseSplitArrow(SplitArrow object) {
				return createSplitArrowAdapter();
			}
			@Override
			public Adapter caseJoinArrow(JoinArrow object) {
				return createJoinArrowAdapter();
			}
			@Override
			public Adapter caseNodes(Nodes object) {
				return createNodesAdapter();
			}
			@Override
			public Adapter caseArrowAfterJoin(ArrowAfterJoin object) {
				return createArrowAfterJoinAdapter();
			}
			@Override
			public Adapter caseIDBase(IDBase object) {
				return createIDBaseAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.ActivityDiagram <em>Activity Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.ActivityDiagram
	 * @generated
	 */
	public Adapter createActivityDiagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.Start <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.Start
	 * @generated
	 */
	public Adapter createStartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.Decision <em>Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.Decision
	 * @generated
	 */
	public Adapter createDecisionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.Split <em>Split</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.Split
	 * @generated
	 */
	public Adapter createSplitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.Join <em>Join</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.Join
	 * @generated
	 */
	public Adapter createJoinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.End <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.End
	 * @generated
	 */
	public Adapter createEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.NodesWithoutJoin <em>Nodes Without Join</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.NodesWithoutJoin
	 * @generated
	 */
	public Adapter createNodesWithoutJoinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.ArrowAfterStart <em>Arrow After Start</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.ArrowAfterStart
	 * @generated
	 */
	public Adapter createArrowAfterStartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.DecisionArrow <em>Decision Arrow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.DecisionArrow
	 * @generated
	 */
	public Adapter createDecisionArrowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.AfterActionArrow <em>After Action Arrow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.AfterActionArrow
	 * @generated
	 */
	public Adapter createAfterActionArrowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.SplitArrow <em>Split Arrow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.SplitArrow
	 * @generated
	 */
	public Adapter createSplitArrowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.JoinArrow <em>Join Arrow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.JoinArrow
	 * @generated
	 */
	public Adapter createJoinArrowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.Nodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.Nodes
	 * @generated
	 */
	public Adapter createNodesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.ArrowAfterJoin <em>Arrow After Join</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.ArrowAfterJoin
	 * @generated
	 */
	public Adapter createArrowAfterJoinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_stuttgart.iste.cowolf.model.commonBase.IDBase <em>ID Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_stuttgart.iste.cowolf.model.commonBase.IDBase
	 * @generated
	 */
	public Adapter createIDBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Activity_diagramAdapterFactory
