/**
 */
package de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl;

import de.uni_stuttgart.iste.cowolf.model.commonBase.impl.IDBaseImpl;

import de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Lifeline;
import de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Message;
import de.uni_stuttgart.iste.cowolf.model.sequence_diagram.MessageBase;
import de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Sequence_diagramPackage;
import de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Task;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.TaskImpl#getOutgoingMessages <em>Outgoing Messages</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.TaskImpl#getLifeline <em>Lifeline</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.TaskImpl#getFrom <em>From</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.TaskImpl#getIn <em>In</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TaskImpl extends IDBaseImpl implements Task {
	/**
	 * The cached value of the '{@link #getOutgoingMessages() <em>Outgoing Messages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingMessages()
	 * @generated
	 * @ordered
	 */
	protected EList<Message> outgoingMessages;

	/**
	 * The cached value of the '{@link #getLifeline() <em>Lifeline</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLifeline()
	 * @generated
	 * @ordered
	 */
	protected Lifeline lifeline;

	/**
	 * The cached value of the '{@link #getIn() <em>In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIn()
	 * @generated
	 * @ordered
	 */
	protected de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Container in;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Sequence_diagramPackage.Literals.TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Message> getOutgoingMessages() {
		if (outgoingMessages == null) {
			outgoingMessages = new EObjectContainmentEList<Message>(Message.class, this, Sequence_diagramPackage.TASK__OUTGOING_MESSAGES);
		}
		return outgoingMessages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lifeline getLifeline() {
		if (lifeline != null && lifeline.eIsProxy()) {
			InternalEObject oldLifeline = (InternalEObject)lifeline;
			lifeline = (Lifeline)eResolveProxy(oldLifeline);
			if (lifeline != oldLifeline) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Sequence_diagramPackage.TASK__LIFELINE, oldLifeline, lifeline));
			}
		}
		return lifeline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lifeline basicGetLifeline() {
		return lifeline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLifeline(Lifeline newLifeline, NotificationChain msgs) {
		Lifeline oldLifeline = lifeline;
		lifeline = newLifeline;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Sequence_diagramPackage.TASK__LIFELINE, oldLifeline, newLifeline);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLifeline(Lifeline newLifeline) {
		if (newLifeline != lifeline) {
			NotificationChain msgs = null;
			if (lifeline != null)
				msgs = ((InternalEObject)lifeline).eInverseRemove(this, Sequence_diagramPackage.LIFELINE__TASKS, Lifeline.class, msgs);
			if (newLifeline != null)
				msgs = ((InternalEObject)newLifeline).eInverseAdd(this, Sequence_diagramPackage.LIFELINE__TASKS, Lifeline.class, msgs);
			msgs = basicSetLifeline(newLifeline, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Sequence_diagramPackage.TASK__LIFELINE, newLifeline, newLifeline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageBase getFrom() {
		if (eContainerFeatureID() != Sequence_diagramPackage.TASK__FROM) return null;
		return (MessageBase)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrom(MessageBase newFrom, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newFrom, Sequence_diagramPackage.TASK__FROM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(MessageBase newFrom) {
		if (newFrom != eInternalContainer() || (eContainerFeatureID() != Sequence_diagramPackage.TASK__FROM && newFrom != null)) {
			if (EcoreUtil.isAncestor(this, newFrom))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFrom != null)
				msgs = ((InternalEObject)newFrom).eInverseAdd(this, Sequence_diagramPackage.MESSAGE_BASE__TO, MessageBase.class, msgs);
			msgs = basicSetFrom(newFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Sequence_diagramPackage.TASK__FROM, newFrom, newFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Container getIn() {
		if (in != null && in.eIsProxy()) {
			InternalEObject oldIn = (InternalEObject)in;
			in = (de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Container)eResolveProxy(oldIn);
			if (in != oldIn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Sequence_diagramPackage.TASK__IN, oldIn, in));
			}
		}
		return in;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Container basicGetIn() {
		return in;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIn(de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Container newIn, NotificationChain msgs) {
		de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Container oldIn = in;
		in = newIn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Sequence_diagramPackage.TASK__IN, oldIn, newIn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIn(de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Container newIn) {
		if (newIn != in) {
			NotificationChain msgs = null;
			if (in != null)
				msgs = ((InternalEObject)in).eInverseRemove(this, Sequence_diagramPackage.CONTAINER__TASKS, de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Container.class, msgs);
			if (newIn != null)
				msgs = ((InternalEObject)newIn).eInverseAdd(this, Sequence_diagramPackage.CONTAINER__TASKS, de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Container.class, msgs);
			msgs = basicSetIn(newIn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Sequence_diagramPackage.TASK__IN, newIn, newIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Sequence_diagramPackage.TASK__LIFELINE:
				if (lifeline != null)
					msgs = ((InternalEObject)lifeline).eInverseRemove(this, Sequence_diagramPackage.LIFELINE__TASKS, Lifeline.class, msgs);
				return basicSetLifeline((Lifeline)otherEnd, msgs);
			case Sequence_diagramPackage.TASK__FROM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetFrom((MessageBase)otherEnd, msgs);
			case Sequence_diagramPackage.TASK__IN:
				if (in != null)
					msgs = ((InternalEObject)in).eInverseRemove(this, Sequence_diagramPackage.CONTAINER__TASKS, de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Container.class, msgs);
				return basicSetIn((de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Container)otherEnd, msgs);
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
			case Sequence_diagramPackage.TASK__OUTGOING_MESSAGES:
				return ((InternalEList<?>)getOutgoingMessages()).basicRemove(otherEnd, msgs);
			case Sequence_diagramPackage.TASK__LIFELINE:
				return basicSetLifeline(null, msgs);
			case Sequence_diagramPackage.TASK__FROM:
				return basicSetFrom(null, msgs);
			case Sequence_diagramPackage.TASK__IN:
				return basicSetIn(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case Sequence_diagramPackage.TASK__FROM:
				return eInternalContainer().eInverseRemove(this, Sequence_diagramPackage.MESSAGE_BASE__TO, MessageBase.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Sequence_diagramPackage.TASK__OUTGOING_MESSAGES:
				return getOutgoingMessages();
			case Sequence_diagramPackage.TASK__LIFELINE:
				if (resolve) return getLifeline();
				return basicGetLifeline();
			case Sequence_diagramPackage.TASK__FROM:
				return getFrom();
			case Sequence_diagramPackage.TASK__IN:
				if (resolve) return getIn();
				return basicGetIn();
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
			case Sequence_diagramPackage.TASK__OUTGOING_MESSAGES:
				getOutgoingMessages().clear();
				getOutgoingMessages().addAll((Collection<? extends Message>)newValue);
				return;
			case Sequence_diagramPackage.TASK__LIFELINE:
				setLifeline((Lifeline)newValue);
				return;
			case Sequence_diagramPackage.TASK__FROM:
				setFrom((MessageBase)newValue);
				return;
			case Sequence_diagramPackage.TASK__IN:
				setIn((de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Container)newValue);
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
			case Sequence_diagramPackage.TASK__OUTGOING_MESSAGES:
				getOutgoingMessages().clear();
				return;
			case Sequence_diagramPackage.TASK__LIFELINE:
				setLifeline((Lifeline)null);
				return;
			case Sequence_diagramPackage.TASK__FROM:
				setFrom((MessageBase)null);
				return;
			case Sequence_diagramPackage.TASK__IN:
				setIn((de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Container)null);
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
			case Sequence_diagramPackage.TASK__OUTGOING_MESSAGES:
				return outgoingMessages != null && !outgoingMessages.isEmpty();
			case Sequence_diagramPackage.TASK__LIFELINE:
				return lifeline != null;
			case Sequence_diagramPackage.TASK__FROM:
				return getFrom() != null;
			case Sequence_diagramPackage.TASK__IN:
				return in != null;
		}
		return super.eIsSet(featureID);
	}

} //TaskImpl
