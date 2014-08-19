/**
 */
package de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl;

import de.uni_stuttgart.iste.cowolf.model.activity_diagram.Action;
import de.uni_stuttgart.iste.cowolf.model.activity_diagram.ActivityDiagram;
import de.uni_stuttgart.iste.cowolf.model.activity_diagram.Activity_diagramPackage;
import de.uni_stuttgart.iste.cowolf.model.activity_diagram.AfterActionArrow;
import de.uni_stuttgart.iste.cowolf.model.activity_diagram.ArrowAfterJoin;
import de.uni_stuttgart.iste.cowolf.model.activity_diagram.ArrowAfterStart;
import de.uni_stuttgart.iste.cowolf.model.activity_diagram.Decision;
import de.uni_stuttgart.iste.cowolf.model.activity_diagram.DecisionArrow;
import de.uni_stuttgart.iste.cowolf.model.activity_diagram.End;
import de.uni_stuttgart.iste.cowolf.model.activity_diagram.Join;
import de.uni_stuttgart.iste.cowolf.model.activity_diagram.JoinArrow;
import de.uni_stuttgart.iste.cowolf.model.activity_diagram.Split;
import de.uni_stuttgart.iste.cowolf.model.activity_diagram.SplitArrow;
import de.uni_stuttgart.iste.cowolf.model.activity_diagram.Start;

import de.uni_stuttgart.iste.cowolf.model.commonBase.impl.IDBaseImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.ActivityDiagramImpl#getStart <em>Start</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.ActivityDiagramImpl#getAction <em>Action</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.ActivityDiagramImpl#getDecision <em>Decision</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.ActivityDiagramImpl#getEnd <em>End</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.ActivityDiagramImpl#getSplit <em>Split</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.ActivityDiagramImpl#getJoin <em>Join</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.ActivityDiagramImpl#getStartArrow <em>Start Arrow</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.ActivityDiagramImpl#getAfterActionArrow <em>After Action Arrow</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.ActivityDiagramImpl#getDecisionArrow <em>Decision Arrow</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.ActivityDiagramImpl#getSplitArrow <em>Split Arrow</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.ActivityDiagramImpl#getJoinArrow <em>Join Arrow</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.ActivityDiagramImpl#getArrowAfterJoin <em>Arrow After Join</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityDiagramImpl extends IDBaseImpl implements ActivityDiagram {
	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected Start start;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> action;

	/**
	 * The cached value of the '{@link #getDecision() <em>Decision</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecision()
	 * @generated
	 * @ordered
	 */
	protected EList<Decision> decision;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected End end;

	/**
	 * The cached value of the '{@link #getSplit() <em>Split</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSplit()
	 * @generated
	 * @ordered
	 */
	protected EList<Split> split;

	/**
	 * The cached value of the '{@link #getJoin() <em>Join</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoin()
	 * @generated
	 * @ordered
	 */
	protected EList<Join> join;

	/**
	 * The cached value of the '{@link #getStartArrow() <em>Start Arrow</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartArrow()
	 * @generated
	 * @ordered
	 */
	protected ArrowAfterStart startArrow;

	/**
	 * The cached value of the '{@link #getAfterActionArrow() <em>After Action Arrow</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAfterActionArrow()
	 * @generated
	 * @ordered
	 */
	protected EList<AfterActionArrow> afterActionArrow;

	/**
	 * The cached value of the '{@link #getDecisionArrow() <em>Decision Arrow</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecisionArrow()
	 * @generated
	 * @ordered
	 */
	protected EList<DecisionArrow> decisionArrow;

	/**
	 * The cached value of the '{@link #getSplitArrow() <em>Split Arrow</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSplitArrow()
	 * @generated
	 * @ordered
	 */
	protected EList<SplitArrow> splitArrow;

	/**
	 * The cached value of the '{@link #getJoinArrow() <em>Join Arrow</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoinArrow()
	 * @generated
	 * @ordered
	 */
	protected EList<JoinArrow> joinArrow;

	/**
	 * The cached value of the '{@link #getArrowAfterJoin() <em>Arrow After Join</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrowAfterJoin()
	 * @generated
	 * @ordered
	 */
	protected EList<ArrowAfterJoin> arrowAfterJoin;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Activity_diagramPackage.Literals.ACTIVITY_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Start getStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStart(Start newStart, NotificationChain msgs) {
		Start oldStart = start;
		start = newStart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Activity_diagramPackage.ACTIVITY_DIAGRAM__START, oldStart, newStart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(Start newStart) {
		if (newStart != start) {
			NotificationChain msgs = null;
			if (start != null)
				msgs = ((InternalEObject)start).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Activity_diagramPackage.ACTIVITY_DIAGRAM__START, null, msgs);
			if (newStart != null)
				msgs = ((InternalEObject)newStart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Activity_diagramPackage.ACTIVITY_DIAGRAM__START, null, msgs);
			msgs = basicSetStart(newStart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Activity_diagramPackage.ACTIVITY_DIAGRAM__START, newStart, newStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getAction() {
		if (action == null) {
			action = new EObjectContainmentEList<Action>(Action.class, this, Activity_diagramPackage.ACTIVITY_DIAGRAM__ACTION);
		}
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Decision> getDecision() {
		if (decision == null) {
			decision = new EObjectContainmentEList<Decision>(Decision.class, this, Activity_diagramPackage.ACTIVITY_DIAGRAM__DECISION);
		}
		return decision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public End getEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnd(End newEnd, NotificationChain msgs) {
		End oldEnd = end;
		end = newEnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Activity_diagramPackage.ACTIVITY_DIAGRAM__END, oldEnd, newEnd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(End newEnd) {
		if (newEnd != end) {
			NotificationChain msgs = null;
			if (end != null)
				msgs = ((InternalEObject)end).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Activity_diagramPackage.ACTIVITY_DIAGRAM__END, null, msgs);
			if (newEnd != null)
				msgs = ((InternalEObject)newEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Activity_diagramPackage.ACTIVITY_DIAGRAM__END, null, msgs);
			msgs = basicSetEnd(newEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Activity_diagramPackage.ACTIVITY_DIAGRAM__END, newEnd, newEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Split> getSplit() {
		if (split == null) {
			split = new EObjectContainmentEList<Split>(Split.class, this, Activity_diagramPackage.ACTIVITY_DIAGRAM__SPLIT);
		}
		return split;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Join> getJoin() {
		if (join == null) {
			join = new EObjectContainmentEList<Join>(Join.class, this, Activity_diagramPackage.ACTIVITY_DIAGRAM__JOIN);
		}
		return join;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrowAfterStart getStartArrow() {
		return startArrow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartArrow(ArrowAfterStart newStartArrow, NotificationChain msgs) {
		ArrowAfterStart oldStartArrow = startArrow;
		startArrow = newStartArrow;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Activity_diagramPackage.ACTIVITY_DIAGRAM__START_ARROW, oldStartArrow, newStartArrow);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartArrow(ArrowAfterStart newStartArrow) {
		if (newStartArrow != startArrow) {
			NotificationChain msgs = null;
			if (startArrow != null)
				msgs = ((InternalEObject)startArrow).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Activity_diagramPackage.ACTIVITY_DIAGRAM__START_ARROW, null, msgs);
			if (newStartArrow != null)
				msgs = ((InternalEObject)newStartArrow).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Activity_diagramPackage.ACTIVITY_DIAGRAM__START_ARROW, null, msgs);
			msgs = basicSetStartArrow(newStartArrow, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Activity_diagramPackage.ACTIVITY_DIAGRAM__START_ARROW, newStartArrow, newStartArrow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AfterActionArrow> getAfterActionArrow() {
		if (afterActionArrow == null) {
			afterActionArrow = new EObjectContainmentEList<AfterActionArrow>(AfterActionArrow.class, this, Activity_diagramPackage.ACTIVITY_DIAGRAM__AFTER_ACTION_ARROW);
		}
		return afterActionArrow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DecisionArrow> getDecisionArrow() {
		if (decisionArrow == null) {
			decisionArrow = new EObjectContainmentEList<DecisionArrow>(DecisionArrow.class, this, Activity_diagramPackage.ACTIVITY_DIAGRAM__DECISION_ARROW);
		}
		return decisionArrow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SplitArrow> getSplitArrow() {
		if (splitArrow == null) {
			splitArrow = new EObjectContainmentEList<SplitArrow>(SplitArrow.class, this, Activity_diagramPackage.ACTIVITY_DIAGRAM__SPLIT_ARROW);
		}
		return splitArrow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JoinArrow> getJoinArrow() {
		if (joinArrow == null) {
			joinArrow = new EObjectContainmentEList<JoinArrow>(JoinArrow.class, this, Activity_diagramPackage.ACTIVITY_DIAGRAM__JOIN_ARROW);
		}
		return joinArrow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArrowAfterJoin> getArrowAfterJoin() {
		if (arrowAfterJoin == null) {
			arrowAfterJoin = new EObjectContainmentEList<ArrowAfterJoin>(ArrowAfterJoin.class, this, Activity_diagramPackage.ACTIVITY_DIAGRAM__ARROW_AFTER_JOIN);
		}
		return arrowAfterJoin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Activity_diagramPackage.ACTIVITY_DIAGRAM__START:
				return basicSetStart(null, msgs);
			case Activity_diagramPackage.ACTIVITY_DIAGRAM__ACTION:
				return ((InternalEList<?>)getAction()).basicRemove(otherEnd, msgs);
			case Activity_diagramPackage.ACTIVITY_DIAGRAM__DECISION:
				return ((InternalEList<?>)getDecision()).basicRemove(otherEnd, msgs);
			case Activity_diagramPackage.ACTIVITY_DIAGRAM__END:
				return basicSetEnd(null, msgs);
			case Activity_diagramPackage.ACTIVITY_DIAGRAM__SPLIT:
				return ((InternalEList<?>)getSplit()).basicRemove(otherEnd, msgs);
			case Activity_diagramPackage.ACTIVITY_DIAGRAM__JOIN:
				return ((InternalEList<?>)getJoin()).basicRemove(otherEnd, msgs);
			case Activity_diagramPackage.ACTIVITY_DIAGRAM__START_ARROW:
				return basicSetStartArrow(null, msgs);
			case Activity_diagramPackage.ACTIVITY_DIAGRAM__AFTER_ACTION_ARROW:
				return ((InternalEList<?>)getAfterActionArrow()).basicRemove(otherEnd, msgs);
			case Activity_diagramPackage.ACTIVITY_DIAGRAM__DECISION_ARROW:
				return ((InternalEList<?>)getDecisionArrow()).basicRemove(otherEnd, msgs);
			case Activity_diagramPackage.ACTIVITY_DIAGRAM__SPLIT_ARROW:
				return ((InternalEList<?>)getSplitArrow()).basicRemove(otherEnd, msgs);
			case Activity_diagramPackage.ACTIVITY_DIAGRAM__JOIN_ARROW:
				return ((InternalEList<?>)getJoinArrow()).basicRemove(otherEnd, msgs);
			case Activity_diagramPackage.ACTIVITY_DIAGRAM__ARROW_AFTER_JOIN:
				return ((InternalEList<?>)getArrowAfterJoin()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Activity_diagramPackage.ACTIVITY_DIAGRAM__START:
				return getStart();
			case Activity_diagramPackage.ACTIVITY_DIAGRAM__ACTION:
				return getAction();
			case Activity_diagramPackage.ACTIVITY_DIAGRAM__DECISION:
				return getDecision();
			case Activity_diagramPackage.ACTIVITY_DIAGRAM__END:
				return getEnd();
			case Activity_diagramPackage.ACTIVITY_DIAGRAM__SPLIT:
				return getSplit();
			case Activity_diagramPackage.ACTIVITY_DIAGRAM__JOIN:
				return getJoin();
			case Activity_diagramPackage.ACTIVITY_DIAGRAM__START_ARROW:
				return getStartArrow();
			case Activity_diagramPackage.ACTIVITY_DIAGRAM__AFTER_ACTION_ARROW:
				return getAfterActionArrow();
			case Activity_diagramPackage.ACTIVITY_DIAGRAM__DECISION_ARROW:
				return getDecisionArrow();
			case Activity_diagramPackage.ACTIVITY_DIAGRAM__SPLIT_ARROW:
				return getSplitArrow();
			case Activity_diagramPackage.ACTIVITY_DIAGRAM__JOIN_ARROW:
				return getJoinArrow();
			case Activity_diagramPackage.ACTIVITY_DIAGRAM__ARROW_AFTER_JOIN:
				return getArrowAfterJoin();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Activity_diagramPackage.ACTIVITY_DIAGRAM__START:
				setStart((Start)newValue);
				return;
			case Activity_diagramPackage.ACTIVITY_DIAGRAM__ACTION:
				getAction().clear();
				getAction().addAll((Collection<? extends Action>)newValue);
				return;
			case Activity_diagramPackage.ACTIVITY_DIAGRAM__DECISION:
				getDecision().clear();
				getDecision().addAll((Collection<? extends Decision>)newValue);
				return;
			case Activity_diagramPackage.ACTIVITY_DIAGRAM__END:
				setEnd((End)newValue);
				return;
			case Activity_diagramPackage.ACTIVITY_DIAGRAM__SPLIT:
				getSplit().clear();
				getSplit().addAll((Collection<? extends Split>)newValue);
				return;
			case Activity_diagramPackage.ACTIVITY_DIAGRAM__JOIN:
				getJoin().clear();
				getJoin().addAll((Collection<? extends Join>)newValue);
				return;
			case Activity_diagramPackage.ACTIVITY_DIAGRAM__START_ARROW:
				setStartArrow((ArrowAfterStart)newValue);
				return;
			case Activity_diagramPackage.ACTIVITY_DIAGRAM__AFTER_ACTION_ARROW:
				getAfterActionArrow().clear();
				getAfterActionArrow().addAll((Collection<? extends AfterActionArrow>)newValue);
				return;
			case Activity_diagramPackage.ACTIVITY_DIAGRAM__DECISION_ARROW:
				getDecisionArrow().clear();
				getDecisionArrow().addAll((Collection<? extends DecisionArrow>)newValue);
				return;
			case Activity_diagramPackage.ACTIVITY_DIAGRAM__SPLIT_ARROW:
				getSplitArrow().clear();
				getSplitArrow().addAll((Collection<? extends SplitArrow>)newValue);
				return;
			case Activity_diagramPackage.ACTIVITY_DIAGRAM__JOIN_ARROW:
				getJoinArrow().clear();
				getJoinArrow().addAll((Collection<? extends JoinArrow>)newValue);
				return;
			case Activity_diagramPackage.ACTIVITY_DIAGRAM__ARROW_AFTER_JOIN:
				getArrowAfterJoin().clear();
				getArrowAfterJoin().addAll((Collection<? extends ArrowAfterJoin>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Activity_diagramPackage.ACTIVITY_DIAGRAM__START:
				setStart((Start)null);
				return;
			case Activity_diagramPackage.ACTIVITY_DIAGRAM__ACTION:
				getAction().clear();
				return;
			case Activity_diagramPackage.ACTIVITY_DIAGRAM__DECISION:
				getDecision().clear();
				return;
			case Activity_diagramPackage.ACTIVITY_DIAGRAM__END:
				setEnd((End)null);
				return;
			case Activity_diagramPackage.ACTIVITY_DIAGRAM__SPLIT:
				getSplit().clear();
				return;
			case Activity_diagramPackage.ACTIVITY_DIAGRAM__JOIN:
				getJoin().clear();
				return;
			case Activity_diagramPackage.ACTIVITY_DIAGRAM__START_ARROW:
				setStartArrow((ArrowAfterStart)null);
				return;
			case Activity_diagramPackage.ACTIVITY_DIAGRAM__AFTER_ACTION_ARROW:
				getAfterActionArrow().clear();
				return;
			case Activity_diagramPackage.ACTIVITY_DIAGRAM__DECISION_ARROW:
				getDecisionArrow().clear();
				return;
			case Activity_diagramPackage.ACTIVITY_DIAGRAM__SPLIT_ARROW:
				getSplitArrow().clear();
				return;
			case Activity_diagramPackage.ACTIVITY_DIAGRAM__JOIN_ARROW:
				getJoinArrow().clear();
				return;
			case Activity_diagramPackage.ACTIVITY_DIAGRAM__ARROW_AFTER_JOIN:
				getArrowAfterJoin().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Activity_diagramPackage.ACTIVITY_DIAGRAM__START:
				return start != null;
			case Activity_diagramPackage.ACTIVITY_DIAGRAM__ACTION:
				return action != null && !action.isEmpty();
			case Activity_diagramPackage.ACTIVITY_DIAGRAM__DECISION:
				return decision != null && !decision.isEmpty();
			case Activity_diagramPackage.ACTIVITY_DIAGRAM__END:
				return end != null;
			case Activity_diagramPackage.ACTIVITY_DIAGRAM__SPLIT:
				return split != null && !split.isEmpty();
			case Activity_diagramPackage.ACTIVITY_DIAGRAM__JOIN:
				return join != null && !join.isEmpty();
			case Activity_diagramPackage.ACTIVITY_DIAGRAM__START_ARROW:
				return startArrow != null;
			case Activity_diagramPackage.ACTIVITY_DIAGRAM__AFTER_ACTION_ARROW:
				return afterActionArrow != null && !afterActionArrow.isEmpty();
			case Activity_diagramPackage.ACTIVITY_DIAGRAM__DECISION_ARROW:
				return decisionArrow != null && !decisionArrow.isEmpty();
			case Activity_diagramPackage.ACTIVITY_DIAGRAM__SPLIT_ARROW:
				return splitArrow != null && !splitArrow.isEmpty();
			case Activity_diagramPackage.ACTIVITY_DIAGRAM__JOIN_ARROW:
				return joinArrow != null && !joinArrow.isEmpty();
			case Activity_diagramPackage.ACTIVITY_DIAGRAM__ARROW_AFTER_JOIN:
				return arrowAfterJoin != null && !arrowAfterJoin.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ActivityDiagramImpl
