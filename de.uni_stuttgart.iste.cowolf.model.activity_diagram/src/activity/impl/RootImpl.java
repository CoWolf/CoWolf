/**
 */
package activity.impl;

import activity.Action;
import activity.ActivityPackage;
import activity.Arrow;
import activity.Bar;
import activity.ConditionArrow;
import activity.Decision;
import activity.End;
import activity.Root;
import activity.Start;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link activity.impl.RootImpl#getStart <em>Start</em>}</li>
 *   <li>{@link activity.impl.RootImpl#getAction <em>Action</em>}</li>
 *   <li>{@link activity.impl.RootImpl#getDecision <em>Decision</em>}</li>
 *   <li>{@link activity.impl.RootImpl#getBar <em>Bar</em>}</li>
 *   <li>{@link activity.impl.RootImpl#getTransition <em>Transition</em>}</li>
 *   <li>{@link activity.impl.RootImpl#getEnd <em>End</em>}</li>
 *   <li>{@link activity.impl.RootImpl#getConditionArrow <em>Condition Arrow</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RootImpl extends MinimalEObjectImpl.Container implements Root {
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
	 * The cached value of the '{@link #getBar() <em>Bar</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBar()
	 * @generated
	 * @ordered
	 */
	protected EList<Bar> bar;

	/**
	 * The cached value of the '{@link #getTransition() <em>Transition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransition()
	 * @generated
	 * @ordered
	 */
	protected EList<Arrow> transition;

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
	 * The cached value of the '{@link #getConditionArrow() <em>Condition Arrow</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionArrow()
	 * @generated
	 * @ordered
	 */
	protected EList<ConditionArrow> conditionArrow;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivityPackage.Literals.ROOT;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActivityPackage.ROOT__START, oldStart, newStart);
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
				msgs = ((InternalEObject)start).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ActivityPackage.ROOT__START, null, msgs);
			if (newStart != null)
				msgs = ((InternalEObject)newStart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ActivityPackage.ROOT__START, null, msgs);
			msgs = basicSetStart(newStart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityPackage.ROOT__START, newStart, newStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getAction() {
		if (action == null) {
			action = new EObjectContainmentEList<Action>(Action.class, this, ActivityPackage.ROOT__ACTION);
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
			decision = new EObjectContainmentEList<Decision>(Decision.class, this, ActivityPackage.ROOT__DECISION);
		}
		return decision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Bar> getBar() {
		if (bar == null) {
			bar = new EObjectContainmentEList<Bar>(Bar.class, this, ActivityPackage.ROOT__BAR);
		}
		return bar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arrow> getTransition() {
		if (transition == null) {
			transition = new EObjectContainmentEList<Arrow>(Arrow.class, this, ActivityPackage.ROOT__TRANSITION);
		}
		return transition;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActivityPackage.ROOT__END, oldEnd, newEnd);
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
				msgs = ((InternalEObject)end).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ActivityPackage.ROOT__END, null, msgs);
			if (newEnd != null)
				msgs = ((InternalEObject)newEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ActivityPackage.ROOT__END, null, msgs);
			msgs = basicSetEnd(newEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityPackage.ROOT__END, newEnd, newEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConditionArrow> getConditionArrow() {
		if (conditionArrow == null) {
			conditionArrow = new EObjectContainmentEList<ConditionArrow>(ConditionArrow.class, this, ActivityPackage.ROOT__CONDITION_ARROW);
		}
		return conditionArrow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActivityPackage.ROOT__START:
				return basicSetStart(null, msgs);
			case ActivityPackage.ROOT__ACTION:
				return ((InternalEList<?>)getAction()).basicRemove(otherEnd, msgs);
			case ActivityPackage.ROOT__DECISION:
				return ((InternalEList<?>)getDecision()).basicRemove(otherEnd, msgs);
			case ActivityPackage.ROOT__BAR:
				return ((InternalEList<?>)getBar()).basicRemove(otherEnd, msgs);
			case ActivityPackage.ROOT__TRANSITION:
				return ((InternalEList<?>)getTransition()).basicRemove(otherEnd, msgs);
			case ActivityPackage.ROOT__END:
				return basicSetEnd(null, msgs);
			case ActivityPackage.ROOT__CONDITION_ARROW:
				return ((InternalEList<?>)getConditionArrow()).basicRemove(otherEnd, msgs);
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
			case ActivityPackage.ROOT__START:
				return getStart();
			case ActivityPackage.ROOT__ACTION:
				return getAction();
			case ActivityPackage.ROOT__DECISION:
				return getDecision();
			case ActivityPackage.ROOT__BAR:
				return getBar();
			case ActivityPackage.ROOT__TRANSITION:
				return getTransition();
			case ActivityPackage.ROOT__END:
				return getEnd();
			case ActivityPackage.ROOT__CONDITION_ARROW:
				return getConditionArrow();
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
			case ActivityPackage.ROOT__START:
				setStart((Start)newValue);
				return;
			case ActivityPackage.ROOT__ACTION:
				getAction().clear();
				getAction().addAll((Collection<? extends Action>)newValue);
				return;
			case ActivityPackage.ROOT__DECISION:
				getDecision().clear();
				getDecision().addAll((Collection<? extends Decision>)newValue);
				return;
			case ActivityPackage.ROOT__BAR:
				getBar().clear();
				getBar().addAll((Collection<? extends Bar>)newValue);
				return;
			case ActivityPackage.ROOT__TRANSITION:
				getTransition().clear();
				getTransition().addAll((Collection<? extends Arrow>)newValue);
				return;
			case ActivityPackage.ROOT__END:
				setEnd((End)newValue);
				return;
			case ActivityPackage.ROOT__CONDITION_ARROW:
				getConditionArrow().clear();
				getConditionArrow().addAll((Collection<? extends ConditionArrow>)newValue);
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
			case ActivityPackage.ROOT__START:
				setStart((Start)null);
				return;
			case ActivityPackage.ROOT__ACTION:
				getAction().clear();
				return;
			case ActivityPackage.ROOT__DECISION:
				getDecision().clear();
				return;
			case ActivityPackage.ROOT__BAR:
				getBar().clear();
				return;
			case ActivityPackage.ROOT__TRANSITION:
				getTransition().clear();
				return;
			case ActivityPackage.ROOT__END:
				setEnd((End)null);
				return;
			case ActivityPackage.ROOT__CONDITION_ARROW:
				getConditionArrow().clear();
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
			case ActivityPackage.ROOT__START:
				return start != null;
			case ActivityPackage.ROOT__ACTION:
				return action != null && !action.isEmpty();
			case ActivityPackage.ROOT__DECISION:
				return decision != null && !decision.isEmpty();
			case ActivityPackage.ROOT__BAR:
				return bar != null && !bar.isEmpty();
			case ActivityPackage.ROOT__TRANSITION:
				return transition != null && !transition.isEmpty();
			case ActivityPackage.ROOT__END:
				return end != null;
			case ActivityPackage.ROOT__CONDITION_ARROW:
				return conditionArrow != null && !conditionArrow.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RootImpl
