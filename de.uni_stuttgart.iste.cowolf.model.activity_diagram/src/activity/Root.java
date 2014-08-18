/**
 */
package activity;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activity.Root#getStart <em>Start</em>}</li>
 *   <li>{@link activity.Root#getAction <em>Action</em>}</li>
 *   <li>{@link activity.Root#getDecision <em>Decision</em>}</li>
 *   <li>{@link activity.Root#getEnd <em>End</em>}</li>
 *   <li>{@link activity.Root#getSplit <em>Split</em>}</li>
 *   <li>{@link activity.Root#getJoin <em>Join</em>}</li>
 *   <li>{@link activity.Root#getStartArrow <em>Start Arrow</em>}</li>
 *   <li>{@link activity.Root#getAfterActionArrow <em>After Action Arrow</em>}</li>
 *   <li>{@link activity.Root#getDecisionArrow <em>Decision Arrow</em>}</li>
 *   <li>{@link activity.Root#getSplitArrow <em>Split Arrow</em>}</li>
 *   <li>{@link activity.Root#getJoinArrow <em>Join Arrow</em>}</li>
 *   <li>{@link activity.Root#getArrowAfterJoin <em>Arrow After Join</em>}</li>
 * </ul>
 * </p>
 *
 * @see activity.ActivityPackage#getRoot()
 * @model
 * @generated
 */
public interface Root extends EObject {
	/**
	 * Returns the value of the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' containment reference.
	 * @see #setStart(Start)
	 * @see activity.ActivityPackage#getRoot_Start()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Start getStart();

	/**
	 * Sets the value of the '{@link activity.Root#getStart <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' containment reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(Start value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference list.
	 * The list contents are of type {@link activity.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference list.
	 * @see activity.ActivityPackage#getRoot_Action()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getAction();

	/**
	 * Returns the value of the '<em><b>Decision</b></em>' containment reference list.
	 * The list contents are of type {@link activity.Decision}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decision</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decision</em>' containment reference list.
	 * @see activity.ActivityPackage#getRoot_Decision()
	 * @model containment="true"
	 * @generated
	 */
	EList<Decision> getDecision();

	/**
	 * Returns the value of the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' containment reference.
	 * @see #setEnd(End)
	 * @see activity.ActivityPackage#getRoot_End()
	 * @model containment="true" required="true"
	 * @generated
	 */
	End getEnd();

	/**
	 * Sets the value of the '{@link activity.Root#getEnd <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' containment reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(End value);

	/**
	 * Returns the value of the '<em><b>Split</b></em>' containment reference list.
	 * The list contents are of type {@link activity.Split}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Split</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Split</em>' containment reference list.
	 * @see activity.ActivityPackage#getRoot_Split()
	 * @model containment="true"
	 * @generated
	 */
	EList<Split> getSplit();

	/**
	 * Returns the value of the '<em><b>Join</b></em>' containment reference list.
	 * The list contents are of type {@link activity.Join}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Join</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Join</em>' containment reference list.
	 * @see activity.ActivityPackage#getRoot_Join()
	 * @model containment="true"
	 * @generated
	 */
	EList<Join> getJoin();

	/**
	 * Returns the value of the '<em><b>Start Arrow</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Arrow</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Arrow</em>' containment reference.
	 * @see #setStartArrow(ArrowAfterStart)
	 * @see activity.ActivityPackage#getRoot_StartArrow()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ArrowAfterStart getStartArrow();

	/**
	 * Sets the value of the '{@link activity.Root#getStartArrow <em>Start Arrow</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Arrow</em>' containment reference.
	 * @see #getStartArrow()
	 * @generated
	 */
	void setStartArrow(ArrowAfterStart value);

	/**
	 * Returns the value of the '<em><b>After Action Arrow</b></em>' containment reference list.
	 * The list contents are of type {@link activity.AfterActionArrow}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>After Action Arrow</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>After Action Arrow</em>' containment reference list.
	 * @see activity.ActivityPackage#getRoot_AfterActionArrow()
	 * @model containment="true"
	 * @generated
	 */
	EList<AfterActionArrow> getAfterActionArrow();

	/**
	 * Returns the value of the '<em><b>Decision Arrow</b></em>' containment reference list.
	 * The list contents are of type {@link activity.DecisionArrow}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decision Arrow</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decision Arrow</em>' containment reference list.
	 * @see activity.ActivityPackage#getRoot_DecisionArrow()
	 * @model containment="true"
	 * @generated
	 */
	EList<DecisionArrow> getDecisionArrow();

	/**
	 * Returns the value of the '<em><b>Split Arrow</b></em>' containment reference list.
	 * The list contents are of type {@link activity.SplitArrow}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Split Arrow</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Split Arrow</em>' containment reference list.
	 * @see activity.ActivityPackage#getRoot_SplitArrow()
	 * @model containment="true"
	 * @generated
	 */
	EList<SplitArrow> getSplitArrow();

	/**
	 * Returns the value of the '<em><b>Join Arrow</b></em>' containment reference list.
	 * The list contents are of type {@link activity.JoinArrow}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Join Arrow</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Join Arrow</em>' containment reference list.
	 * @see activity.ActivityPackage#getRoot_JoinArrow()
	 * @model containment="true"
	 * @generated
	 */
	EList<JoinArrow> getJoinArrow();

	/**
	 * Returns the value of the '<em><b>Arrow After Join</b></em>' containment reference list.
	 * The list contents are of type {@link activity.ArrowAfterJoin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arrow After Join</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arrow After Join</em>' containment reference list.
	 * @see activity.ActivityPackage#getRoot_ArrowAfterJoin()
	 * @model containment="true"
	 * @generated
	 */
	EList<ArrowAfterJoin> getArrowAfterJoin();

} // Root
