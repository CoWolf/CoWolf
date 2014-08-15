/**
 */
package activity.impl;

import activity.Action;
import activity.ActivityPackage;
import activity.Arrow;
import activity.Decision;
import activity.End;
import activity.Join;
import activity.Split;
import activity.Start;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arrow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link activity.impl.ArrowImpl#getEReference0 <em>EReference0</em>}</li>
 *   <li>{@link activity.impl.ArrowImpl#getFromStart <em>From Start</em>}</li>
 *   <li>{@link activity.impl.ArrowImpl#getToEnd <em>To End</em>}</li>
 *   <li>{@link activity.impl.ArrowImpl#getFromAction <em>From Action</em>}</li>
 *   <li>{@link activity.impl.ArrowImpl#getToAction <em>To Action</em>}</li>
 *   <li>{@link activity.impl.ArrowImpl#getFromSplit <em>From Split</em>}</li>
 *   <li>{@link activity.impl.ArrowImpl#getToSplit <em>To Split</em>}</li>
 *   <li>{@link activity.impl.ArrowImpl#getToJoin <em>To Join</em>}</li>
 *   <li>{@link activity.impl.ArrowImpl#getFromJoin <em>From Join</em>}</li>
 *   <li>{@link activity.impl.ArrowImpl#getToDecision <em>To Decision</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArrowImpl extends MinimalEObjectImpl.Container implements Arrow {
	/**
	 * The cached value of the '{@link #getEReference0() <em>EReference0</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference0()
	 * @generated
	 * @ordered
	 */
	protected Start eReference0;

	/**
	 * The cached value of the '{@link #getFromStart() <em>From Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromStart()
	 * @generated
	 * @ordered
	 */
	protected Start fromStart;

	/**
	 * The cached value of the '{@link #getToEnd() <em>To End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToEnd()
	 * @generated
	 * @ordered
	 */
	protected End toEnd;

	/**
	 * The cached value of the '{@link #getFromAction() <em>From Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromAction()
	 * @generated
	 * @ordered
	 */
	protected Action fromAction;

	/**
	 * The cached value of the '{@link #getToAction() <em>To Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToAction()
	 * @generated
	 * @ordered
	 */
	protected Action toAction;

	/**
	 * The cached value of the '{@link #getFromSplit() <em>From Split</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromSplit()
	 * @generated
	 * @ordered
	 */
	protected Split fromSplit;

	/**
	 * The cached value of the '{@link #getToSplit() <em>To Split</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToSplit()
	 * @generated
	 * @ordered
	 */
	protected Split toSplit;

	/**
	 * The cached value of the '{@link #getToJoin() <em>To Join</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToJoin()
	 * @generated
	 * @ordered
	 */
	protected Join toJoin;

	/**
	 * The cached value of the '{@link #getFromJoin() <em>From Join</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromJoin()
	 * @generated
	 * @ordered
	 */
	protected Join fromJoin;

	/**
	 * The cached value of the '{@link #getToDecision() <em>To Decision</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToDecision()
	 * @generated
	 * @ordered
	 */
	protected Decision toDecision;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivityPackage.Literals.ARROW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Start getEReference0() {
		if (eReference0 != null && eReference0.eIsProxy()) {
			InternalEObject oldEReference0 = (InternalEObject)eReference0;
			eReference0 = (Start)eResolveProxy(oldEReference0);
			if (eReference0 != oldEReference0) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivityPackage.ARROW__EREFERENCE0, oldEReference0, eReference0));
			}
		}
		return eReference0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Start basicGetEReference0() {
		return eReference0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEReference0(Start newEReference0) {
		Start oldEReference0 = eReference0;
		eReference0 = newEReference0;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityPackage.ARROW__EREFERENCE0, oldEReference0, eReference0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Start getFromStart() {
		if (fromStart != null && fromStart.eIsProxy()) {
			InternalEObject oldFromStart = (InternalEObject)fromStart;
			fromStart = (Start)eResolveProxy(oldFromStart);
			if (fromStart != oldFromStart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivityPackage.ARROW__FROM_START, oldFromStart, fromStart));
			}
		}
		return fromStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Start basicGetFromStart() {
		return fromStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFromStart(Start newFromStart, NotificationChain msgs) {
		Start oldFromStart = fromStart;
		fromStart = newFromStart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActivityPackage.ARROW__FROM_START, oldFromStart, newFromStart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromStart(Start newFromStart) {
		if (newFromStart != fromStart) {
			NotificationChain msgs = null;
			if (fromStart != null)
				msgs = ((InternalEObject)fromStart).eInverseRemove(this, ActivityPackage.START__OUTGOING_FROM_START, Start.class, msgs);
			if (newFromStart != null)
				msgs = ((InternalEObject)newFromStart).eInverseAdd(this, ActivityPackage.START__OUTGOING_FROM_START, Start.class, msgs);
			msgs = basicSetFromStart(newFromStart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityPackage.ARROW__FROM_START, newFromStart, newFromStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public End getToEnd() {
		if (toEnd != null && toEnd.eIsProxy()) {
			InternalEObject oldToEnd = (InternalEObject)toEnd;
			toEnd = (End)eResolveProxy(oldToEnd);
			if (toEnd != oldToEnd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivityPackage.ARROW__TO_END, oldToEnd, toEnd));
			}
		}
		return toEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public End basicGetToEnd() {
		return toEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToEnd(End newToEnd, NotificationChain msgs) {
		End oldToEnd = toEnd;
		toEnd = newToEnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActivityPackage.ARROW__TO_END, oldToEnd, newToEnd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToEnd(End newToEnd) {
		if (newToEnd != toEnd) {
			NotificationChain msgs = null;
			if (toEnd != null)
				msgs = ((InternalEObject)toEnd).eInverseRemove(this, ActivityPackage.END__INCOMING_TO_END, End.class, msgs);
			if (newToEnd != null)
				msgs = ((InternalEObject)newToEnd).eInverseAdd(this, ActivityPackage.END__INCOMING_TO_END, End.class, msgs);
			msgs = basicSetToEnd(newToEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityPackage.ARROW__TO_END, newToEnd, newToEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getFromAction() {
		if (fromAction != null && fromAction.eIsProxy()) {
			InternalEObject oldFromAction = (InternalEObject)fromAction;
			fromAction = (Action)eResolveProxy(oldFromAction);
			if (fromAction != oldFromAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivityPackage.ARROW__FROM_ACTION, oldFromAction, fromAction));
			}
		}
		return fromAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action basicGetFromAction() {
		return fromAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFromAction(Action newFromAction, NotificationChain msgs) {
		Action oldFromAction = fromAction;
		fromAction = newFromAction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActivityPackage.ARROW__FROM_ACTION, oldFromAction, newFromAction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromAction(Action newFromAction) {
		if (newFromAction != fromAction) {
			NotificationChain msgs = null;
			if (fromAction != null)
				msgs = ((InternalEObject)fromAction).eInverseRemove(this, ActivityPackage.ACTION__OUTGOING_FROM_ACTION_ACTION, Action.class, msgs);
			if (newFromAction != null)
				msgs = ((InternalEObject)newFromAction).eInverseAdd(this, ActivityPackage.ACTION__OUTGOING_FROM_ACTION_ACTION, Action.class, msgs);
			msgs = basicSetFromAction(newFromAction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityPackage.ARROW__FROM_ACTION, newFromAction, newFromAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getToAction() {
		if (toAction != null && toAction.eIsProxy()) {
			InternalEObject oldToAction = (InternalEObject)toAction;
			toAction = (Action)eResolveProxy(oldToAction);
			if (toAction != oldToAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivityPackage.ARROW__TO_ACTION, oldToAction, toAction));
			}
		}
		return toAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action basicGetToAction() {
		return toAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToAction(Action newToAction, NotificationChain msgs) {
		Action oldToAction = toAction;
		toAction = newToAction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActivityPackage.ARROW__TO_ACTION, oldToAction, newToAction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToAction(Action newToAction) {
		if (newToAction != toAction) {
			NotificationChain msgs = null;
			if (toAction != null)
				msgs = ((InternalEObject)toAction).eInverseRemove(this, ActivityPackage.ACTION__INCOMING_TO_ACTION, Action.class, msgs);
			if (newToAction != null)
				msgs = ((InternalEObject)newToAction).eInverseAdd(this, ActivityPackage.ACTION__INCOMING_TO_ACTION, Action.class, msgs);
			msgs = basicSetToAction(newToAction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityPackage.ARROW__TO_ACTION, newToAction, newToAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Split getFromSplit() {
		if (fromSplit != null && fromSplit.eIsProxy()) {
			InternalEObject oldFromSplit = (InternalEObject)fromSplit;
			fromSplit = (Split)eResolveProxy(oldFromSplit);
			if (fromSplit != oldFromSplit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivityPackage.ARROW__FROM_SPLIT, oldFromSplit, fromSplit));
			}
		}
		return fromSplit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Split basicGetFromSplit() {
		return fromSplit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFromSplit(Split newFromSplit, NotificationChain msgs) {
		Split oldFromSplit = fromSplit;
		fromSplit = newFromSplit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActivityPackage.ARROW__FROM_SPLIT, oldFromSplit, newFromSplit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromSplit(Split newFromSplit) {
		if (newFromSplit != fromSplit) {
			NotificationChain msgs = null;
			if (fromSplit != null)
				msgs = ((InternalEObject)fromSplit).eInverseRemove(this, ActivityPackage.SPLIT__OUTGOING_FROM_SPLIT, Split.class, msgs);
			if (newFromSplit != null)
				msgs = ((InternalEObject)newFromSplit).eInverseAdd(this, ActivityPackage.SPLIT__OUTGOING_FROM_SPLIT, Split.class, msgs);
			msgs = basicSetFromSplit(newFromSplit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityPackage.ARROW__FROM_SPLIT, newFromSplit, newFromSplit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Split getToSplit() {
		if (toSplit != null && toSplit.eIsProxy()) {
			InternalEObject oldToSplit = (InternalEObject)toSplit;
			toSplit = (Split)eResolveProxy(oldToSplit);
			if (toSplit != oldToSplit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivityPackage.ARROW__TO_SPLIT, oldToSplit, toSplit));
			}
		}
		return toSplit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Split basicGetToSplit() {
		return toSplit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToSplit(Split newToSplit, NotificationChain msgs) {
		Split oldToSplit = toSplit;
		toSplit = newToSplit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActivityPackage.ARROW__TO_SPLIT, oldToSplit, newToSplit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToSplit(Split newToSplit) {
		if (newToSplit != toSplit) {
			NotificationChain msgs = null;
			if (toSplit != null)
				msgs = ((InternalEObject)toSplit).eInverseRemove(this, ActivityPackage.SPLIT__INCOMING_TO_SPLIT, Split.class, msgs);
			if (newToSplit != null)
				msgs = ((InternalEObject)newToSplit).eInverseAdd(this, ActivityPackage.SPLIT__INCOMING_TO_SPLIT, Split.class, msgs);
			msgs = basicSetToSplit(newToSplit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityPackage.ARROW__TO_SPLIT, newToSplit, newToSplit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Join getToJoin() {
		if (toJoin != null && toJoin.eIsProxy()) {
			InternalEObject oldToJoin = (InternalEObject)toJoin;
			toJoin = (Join)eResolveProxy(oldToJoin);
			if (toJoin != oldToJoin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivityPackage.ARROW__TO_JOIN, oldToJoin, toJoin));
			}
		}
		return toJoin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Join basicGetToJoin() {
		return toJoin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToJoin(Join newToJoin, NotificationChain msgs) {
		Join oldToJoin = toJoin;
		toJoin = newToJoin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActivityPackage.ARROW__TO_JOIN, oldToJoin, newToJoin);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToJoin(Join newToJoin) {
		if (newToJoin != toJoin) {
			NotificationChain msgs = null;
			if (toJoin != null)
				msgs = ((InternalEObject)toJoin).eInverseRemove(this, ActivityPackage.JOIN__INCOMING_TO_JOIN, Join.class, msgs);
			if (newToJoin != null)
				msgs = ((InternalEObject)newToJoin).eInverseAdd(this, ActivityPackage.JOIN__INCOMING_TO_JOIN, Join.class, msgs);
			msgs = basicSetToJoin(newToJoin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityPackage.ARROW__TO_JOIN, newToJoin, newToJoin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Join getFromJoin() {
		if (fromJoin != null && fromJoin.eIsProxy()) {
			InternalEObject oldFromJoin = (InternalEObject)fromJoin;
			fromJoin = (Join)eResolveProxy(oldFromJoin);
			if (fromJoin != oldFromJoin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivityPackage.ARROW__FROM_JOIN, oldFromJoin, fromJoin));
			}
		}
		return fromJoin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Join basicGetFromJoin() {
		return fromJoin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFromJoin(Join newFromJoin, NotificationChain msgs) {
		Join oldFromJoin = fromJoin;
		fromJoin = newFromJoin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActivityPackage.ARROW__FROM_JOIN, oldFromJoin, newFromJoin);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromJoin(Join newFromJoin) {
		if (newFromJoin != fromJoin) {
			NotificationChain msgs = null;
			if (fromJoin != null)
				msgs = ((InternalEObject)fromJoin).eInverseRemove(this, ActivityPackage.JOIN__OUTGOING_FROM_JOIN, Join.class, msgs);
			if (newFromJoin != null)
				msgs = ((InternalEObject)newFromJoin).eInverseAdd(this, ActivityPackage.JOIN__OUTGOING_FROM_JOIN, Join.class, msgs);
			msgs = basicSetFromJoin(newFromJoin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityPackage.ARROW__FROM_JOIN, newFromJoin, newFromJoin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decision getToDecision() {
		if (toDecision != null && toDecision.eIsProxy()) {
			InternalEObject oldToDecision = (InternalEObject)toDecision;
			toDecision = (Decision)eResolveProxy(oldToDecision);
			if (toDecision != oldToDecision) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivityPackage.ARROW__TO_DECISION, oldToDecision, toDecision));
			}
		}
		return toDecision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decision basicGetToDecision() {
		return toDecision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToDecision(Decision newToDecision, NotificationChain msgs) {
		Decision oldToDecision = toDecision;
		toDecision = newToDecision;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActivityPackage.ARROW__TO_DECISION, oldToDecision, newToDecision);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToDecision(Decision newToDecision) {
		if (newToDecision != toDecision) {
			NotificationChain msgs = null;
			if (toDecision != null)
				msgs = ((InternalEObject)toDecision).eInverseRemove(this, ActivityPackage.DECISION__INCOMING_TO_DECISION, Decision.class, msgs);
			if (newToDecision != null)
				msgs = ((InternalEObject)newToDecision).eInverseAdd(this, ActivityPackage.DECISION__INCOMING_TO_DECISION, Decision.class, msgs);
			msgs = basicSetToDecision(newToDecision, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityPackage.ARROW__TO_DECISION, newToDecision, newToDecision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActivityPackage.ARROW__FROM_START:
				if (fromStart != null)
					msgs = ((InternalEObject)fromStart).eInverseRemove(this, ActivityPackage.START__OUTGOING_FROM_START, Start.class, msgs);
				return basicSetFromStart((Start)otherEnd, msgs);
			case ActivityPackage.ARROW__TO_END:
				if (toEnd != null)
					msgs = ((InternalEObject)toEnd).eInverseRemove(this, ActivityPackage.END__INCOMING_TO_END, End.class, msgs);
				return basicSetToEnd((End)otherEnd, msgs);
			case ActivityPackage.ARROW__FROM_ACTION:
				if (fromAction != null)
					msgs = ((InternalEObject)fromAction).eInverseRemove(this, ActivityPackage.ACTION__OUTGOING_FROM_ACTION_ACTION, Action.class, msgs);
				return basicSetFromAction((Action)otherEnd, msgs);
			case ActivityPackage.ARROW__TO_ACTION:
				if (toAction != null)
					msgs = ((InternalEObject)toAction).eInverseRemove(this, ActivityPackage.ACTION__INCOMING_TO_ACTION, Action.class, msgs);
				return basicSetToAction((Action)otherEnd, msgs);
			case ActivityPackage.ARROW__FROM_SPLIT:
				if (fromSplit != null)
					msgs = ((InternalEObject)fromSplit).eInverseRemove(this, ActivityPackage.SPLIT__OUTGOING_FROM_SPLIT, Split.class, msgs);
				return basicSetFromSplit((Split)otherEnd, msgs);
			case ActivityPackage.ARROW__TO_SPLIT:
				if (toSplit != null)
					msgs = ((InternalEObject)toSplit).eInverseRemove(this, ActivityPackage.SPLIT__INCOMING_TO_SPLIT, Split.class, msgs);
				return basicSetToSplit((Split)otherEnd, msgs);
			case ActivityPackage.ARROW__TO_JOIN:
				if (toJoin != null)
					msgs = ((InternalEObject)toJoin).eInverseRemove(this, ActivityPackage.JOIN__INCOMING_TO_JOIN, Join.class, msgs);
				return basicSetToJoin((Join)otherEnd, msgs);
			case ActivityPackage.ARROW__FROM_JOIN:
				if (fromJoin != null)
					msgs = ((InternalEObject)fromJoin).eInverseRemove(this, ActivityPackage.JOIN__OUTGOING_FROM_JOIN, Join.class, msgs);
				return basicSetFromJoin((Join)otherEnd, msgs);
			case ActivityPackage.ARROW__TO_DECISION:
				if (toDecision != null)
					msgs = ((InternalEObject)toDecision).eInverseRemove(this, ActivityPackage.DECISION__INCOMING_TO_DECISION, Decision.class, msgs);
				return basicSetToDecision((Decision)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActivityPackage.ARROW__FROM_START:
				return basicSetFromStart(null, msgs);
			case ActivityPackage.ARROW__TO_END:
				return basicSetToEnd(null, msgs);
			case ActivityPackage.ARROW__FROM_ACTION:
				return basicSetFromAction(null, msgs);
			case ActivityPackage.ARROW__TO_ACTION:
				return basicSetToAction(null, msgs);
			case ActivityPackage.ARROW__FROM_SPLIT:
				return basicSetFromSplit(null, msgs);
			case ActivityPackage.ARROW__TO_SPLIT:
				return basicSetToSplit(null, msgs);
			case ActivityPackage.ARROW__TO_JOIN:
				return basicSetToJoin(null, msgs);
			case ActivityPackage.ARROW__FROM_JOIN:
				return basicSetFromJoin(null, msgs);
			case ActivityPackage.ARROW__TO_DECISION:
				return basicSetToDecision(null, msgs);
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
			case ActivityPackage.ARROW__EREFERENCE0:
				if (resolve) return getEReference0();
				return basicGetEReference0();
			case ActivityPackage.ARROW__FROM_START:
				if (resolve) return getFromStart();
				return basicGetFromStart();
			case ActivityPackage.ARROW__TO_END:
				if (resolve) return getToEnd();
				return basicGetToEnd();
			case ActivityPackage.ARROW__FROM_ACTION:
				if (resolve) return getFromAction();
				return basicGetFromAction();
			case ActivityPackage.ARROW__TO_ACTION:
				if (resolve) return getToAction();
				return basicGetToAction();
			case ActivityPackage.ARROW__FROM_SPLIT:
				if (resolve) return getFromSplit();
				return basicGetFromSplit();
			case ActivityPackage.ARROW__TO_SPLIT:
				if (resolve) return getToSplit();
				return basicGetToSplit();
			case ActivityPackage.ARROW__TO_JOIN:
				if (resolve) return getToJoin();
				return basicGetToJoin();
			case ActivityPackage.ARROW__FROM_JOIN:
				if (resolve) return getFromJoin();
				return basicGetFromJoin();
			case ActivityPackage.ARROW__TO_DECISION:
				if (resolve) return getToDecision();
				return basicGetToDecision();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ActivityPackage.ARROW__EREFERENCE0:
				setEReference0((Start)newValue);
				return;
			case ActivityPackage.ARROW__FROM_START:
				setFromStart((Start)newValue);
				return;
			case ActivityPackage.ARROW__TO_END:
				setToEnd((End)newValue);
				return;
			case ActivityPackage.ARROW__FROM_ACTION:
				setFromAction((Action)newValue);
				return;
			case ActivityPackage.ARROW__TO_ACTION:
				setToAction((Action)newValue);
				return;
			case ActivityPackage.ARROW__FROM_SPLIT:
				setFromSplit((Split)newValue);
				return;
			case ActivityPackage.ARROW__TO_SPLIT:
				setToSplit((Split)newValue);
				return;
			case ActivityPackage.ARROW__TO_JOIN:
				setToJoin((Join)newValue);
				return;
			case ActivityPackage.ARROW__FROM_JOIN:
				setFromJoin((Join)newValue);
				return;
			case ActivityPackage.ARROW__TO_DECISION:
				setToDecision((Decision)newValue);
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
			case ActivityPackage.ARROW__EREFERENCE0:
				setEReference0((Start)null);
				return;
			case ActivityPackage.ARROW__FROM_START:
				setFromStart((Start)null);
				return;
			case ActivityPackage.ARROW__TO_END:
				setToEnd((End)null);
				return;
			case ActivityPackage.ARROW__FROM_ACTION:
				setFromAction((Action)null);
				return;
			case ActivityPackage.ARROW__TO_ACTION:
				setToAction((Action)null);
				return;
			case ActivityPackage.ARROW__FROM_SPLIT:
				setFromSplit((Split)null);
				return;
			case ActivityPackage.ARROW__TO_SPLIT:
				setToSplit((Split)null);
				return;
			case ActivityPackage.ARROW__TO_JOIN:
				setToJoin((Join)null);
				return;
			case ActivityPackage.ARROW__FROM_JOIN:
				setFromJoin((Join)null);
				return;
			case ActivityPackage.ARROW__TO_DECISION:
				setToDecision((Decision)null);
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
			case ActivityPackage.ARROW__EREFERENCE0:
				return eReference0 != null;
			case ActivityPackage.ARROW__FROM_START:
				return fromStart != null;
			case ActivityPackage.ARROW__TO_END:
				return toEnd != null;
			case ActivityPackage.ARROW__FROM_ACTION:
				return fromAction != null;
			case ActivityPackage.ARROW__TO_ACTION:
				return toAction != null;
			case ActivityPackage.ARROW__FROM_SPLIT:
				return fromSplit != null;
			case ActivityPackage.ARROW__TO_SPLIT:
				return toSplit != null;
			case ActivityPackage.ARROW__TO_JOIN:
				return toJoin != null;
			case ActivityPackage.ARROW__FROM_JOIN:
				return fromJoin != null;
			case ActivityPackage.ARROW__TO_DECISION:
				return toDecision != null;
		}
		return super.eIsSet(featureID);
	}

} //ArrowImpl
