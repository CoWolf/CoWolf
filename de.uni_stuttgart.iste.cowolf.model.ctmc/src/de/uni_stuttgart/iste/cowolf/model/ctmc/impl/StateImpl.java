/**
 */
package de.uni_stuttgart.iste.cowolf.model.ctmc.impl;

import de.uni_stuttgart.iste.cowolf.model.commonBase.impl.IDBaseImpl;

import de.uni_stuttgart.iste.cowolf.model.ctmc.CtmcPackage;
import de.uni_stuttgart.iste.cowolf.model.ctmc.Label;
import de.uni_stuttgart.iste.cowolf.model.ctmc.State;
import de.uni_stuttgart.iste.cowolf.model.ctmc.Transition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.ctmc.impl.StateImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.ctmc.impl.StateImpl#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.ctmc.impl.StateImpl#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.ctmc.impl.StateImpl#getLabels <em>Labels</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.ctmc.impl.StateImpl#getExitRate <em>Exit Rate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateImpl extends IDBaseImpl implements State {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIncoming() <em>Incoming</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncoming()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> incoming;

	/**
	 * The cached value of the '{@link #getOutgoing() <em>Outgoing</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoing()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> outgoing;

	/**
	 * The cached value of the '{@link #getLabels() <em>Labels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabels()
	 * @generated
	 * @ordered
	 */
	protected EList<Label> labels;

	/**
	 * The default value of the '{@link #getExitRate() <em>Exit Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExitRate()
	 * @generated
	 * @ordered
	 */
	protected static final float EXIT_RATE_EDEFAULT = 0.0F;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CtmcPackage.Literals.STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CtmcPackage.STATE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getIncoming() {
		if (incoming == null) {
			incoming = new EObjectWithInverseResolvingEList<Transition>(Transition.class, this, CtmcPackage.STATE__INCOMING, CtmcPackage.TRANSITION__TO);
		}
		return incoming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getOutgoing() {
		if (outgoing == null) {
			outgoing = new EObjectContainmentWithInverseEList<Transition>(Transition.class, this, CtmcPackage.STATE__OUTGOING, CtmcPackage.TRANSITION__FROM);
		}
		return outgoing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Label> getLabels() {
		if (labels == null) {
			labels = new EObjectContainmentWithInverseEList<Label>(Label.class, this, CtmcPackage.STATE__LABELS, CtmcPackage.LABEL__STATE);
		}
		return labels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public float getExitRate() {
		// TODO: implement this method to return the 'Exit Rate' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		float exit = 0;
		for (Transition t : this.getOutgoing()) {
			exit += t.getRate();
		}
		
		return exit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CtmcPackage.STATE__INCOMING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncoming()).basicAdd(otherEnd, msgs);
			case CtmcPackage.STATE__OUTGOING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoing()).basicAdd(otherEnd, msgs);
			case CtmcPackage.STATE__LABELS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLabels()).basicAdd(otherEnd, msgs);
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
			case CtmcPackage.STATE__INCOMING:
				return ((InternalEList<?>)getIncoming()).basicRemove(otherEnd, msgs);
			case CtmcPackage.STATE__OUTGOING:
				return ((InternalEList<?>)getOutgoing()).basicRemove(otherEnd, msgs);
			case CtmcPackage.STATE__LABELS:
				return ((InternalEList<?>)getLabels()).basicRemove(otherEnd, msgs);
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
			case CtmcPackage.STATE__NAME:
				return getName();
			case CtmcPackage.STATE__INCOMING:
				return getIncoming();
			case CtmcPackage.STATE__OUTGOING:
				return getOutgoing();
			case CtmcPackage.STATE__LABELS:
				return getLabels();
			case CtmcPackage.STATE__EXIT_RATE:
				return getExitRate();
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
			case CtmcPackage.STATE__NAME:
				setName((String)newValue);
				return;
			case CtmcPackage.STATE__INCOMING:
				getIncoming().clear();
				getIncoming().addAll((Collection<? extends Transition>)newValue);
				return;
			case CtmcPackage.STATE__OUTGOING:
				getOutgoing().clear();
				getOutgoing().addAll((Collection<? extends Transition>)newValue);
				return;
			case CtmcPackage.STATE__LABELS:
				getLabels().clear();
				getLabels().addAll((Collection<? extends Label>)newValue);
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
			case CtmcPackage.STATE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CtmcPackage.STATE__INCOMING:
				getIncoming().clear();
				return;
			case CtmcPackage.STATE__OUTGOING:
				getOutgoing().clear();
				return;
			case CtmcPackage.STATE__LABELS:
				getLabels().clear();
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
			case CtmcPackage.STATE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CtmcPackage.STATE__INCOMING:
				return incoming != null && !incoming.isEmpty();
			case CtmcPackage.STATE__OUTGOING:
				return outgoing != null && !outgoing.isEmpty();
			case CtmcPackage.STATE__LABELS:
				return labels != null && !labels.isEmpty();
			case CtmcPackage.STATE__EXIT_RATE:
				return getExitRate() != EXIT_RATE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //StateImpl
