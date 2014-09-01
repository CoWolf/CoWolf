/**
 */
package de.uni_stuttgart.iste.cowolf.core.ModelAssociation.impl;

import de.uni_stuttgart.iste.cowolf.core.ModelAssociation.Association;
import de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelAssociation;
import de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelAssociationPackage;
import de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelVersion;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.henshin.trace.Trace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.core.ModelAssociation.impl.AssociationImpl#getSource <em>Source</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.core.ModelAssociation.impl.AssociationImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.core.ModelAssociation.impl.AssociationImpl#getTraces <em>Traces</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.core.ModelAssociation.impl.AssociationImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.core.ModelAssociation.impl.AssociationImpl#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssociationImpl extends MinimalEObjectImpl.Container implements Association {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelVersion> source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelVersion> target;

	/**
	 * The cached value of the '{@link #getTraces() <em>Traces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraces()
	 * @generated
	 * @ordered
	 */
	protected EList<Trace> traces;

	/**
	 * The default value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final long TIMESTAMP_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected long timestamp = TIMESTAMP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected ModelAssociation parent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelAssociationPackage.eINSTANCE.getAssociation();
	}
	
	public void setSource(ModelVersion source) {
		if (!getSource().contains(source)) {
			getSource().clear();
			getSource().add(source);
			if (!source.getSourceAssociations().contains(this)) {
				source.getSourceAssociations().add(this);
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelVersion> getSource() {
		if (source == null) {
			source = new EObjectWithInverseResolvingEList.ManyInverse<ModelVersion>(ModelVersion.class, this, ModelAssociationPackage.ASSOCIATION__SOURCE, ModelAssociationPackage.MODEL_VERSION__SOURCE_ASSOCIATIONS);
		}
		return source;
	}
	
	public void setTarget(ModelVersion target) {
		if (!getTarget().contains(target)) {
			getTarget().clear();
			getTarget().add(target);
			if (!target.getTargetAssociations().contains(this)) {
				target.getTargetAssociations().add(this);
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelVersion> getTarget() {
		if (target == null) {
			target = new EObjectWithInverseResolvingEList.ManyInverse<ModelVersion>(ModelVersion.class, this, ModelAssociationPackage.ASSOCIATION__TARGET, ModelAssociationPackage.MODEL_VERSION__TARGET_ASSOCIATIONS);
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Trace> getTraces() {
		if (traces == null) {
			traces = new EObjectResolvingEList<Trace>(Trace.class, this, ModelAssociationPackage.ASSOCIATION__TRACES);
		}
		return traces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTimestamp() {
		return timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimestamp(long newTimestamp) {
		long oldTimestamp = timestamp;
		timestamp = newTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelAssociationPackage.ASSOCIATION__TIMESTAMP, oldTimestamp, timestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelAssociation getParent() {
		if (parent != null && parent.eIsProxy()) {
			InternalEObject oldParent = (InternalEObject)parent;
			parent = (ModelAssociation)eResolveProxy(oldParent);
			if (parent != oldParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelAssociationPackage.ASSOCIATION__PARENT, oldParent, parent));
			}
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelAssociation basicGetParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(ModelAssociation newParent, NotificationChain msgs) {
		ModelAssociation oldParent = parent;
		parent = newParent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelAssociationPackage.ASSOCIATION__PARENT, oldParent, newParent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(ModelAssociation newParent) {
		if (newParent != parent) {
			NotificationChain msgs = null;
			if (parent != null)
				msgs = ((InternalEObject)parent).eInverseRemove(this, ModelAssociationPackage.MODEL_ASSOCIATION__ASSOCIATIONS, ModelAssociation.class, msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, ModelAssociationPackage.MODEL_ASSOCIATION__ASSOCIATIONS, ModelAssociation.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelAssociationPackage.ASSOCIATION__PARENT, newParent, newParent));
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
			case ModelAssociationPackage.ASSOCIATION__SOURCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSource()).basicAdd(otherEnd, msgs);
			case ModelAssociationPackage.ASSOCIATION__TARGET:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTarget()).basicAdd(otherEnd, msgs);
			case ModelAssociationPackage.ASSOCIATION__PARENT:
				if (parent != null)
					msgs = ((InternalEObject)parent).eInverseRemove(this, ModelAssociationPackage.MODEL_ASSOCIATION__ASSOCIATIONS, ModelAssociation.class, msgs);
				return basicSetParent((ModelAssociation)otherEnd, msgs);
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
			case ModelAssociationPackage.ASSOCIATION__SOURCE:
				return ((InternalEList<?>)getSource()).basicRemove(otherEnd, msgs);
			case ModelAssociationPackage.ASSOCIATION__TARGET:
				return ((InternalEList<?>)getTarget()).basicRemove(otherEnd, msgs);
			case ModelAssociationPackage.ASSOCIATION__PARENT:
				return basicSetParent(null, msgs);
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
			case ModelAssociationPackage.ASSOCIATION__SOURCE:
				return getSource();
			case ModelAssociationPackage.ASSOCIATION__TARGET:
				return getTarget();
			case ModelAssociationPackage.ASSOCIATION__TRACES:
				return getTraces();
			case ModelAssociationPackage.ASSOCIATION__TIMESTAMP:
				return getTimestamp();
			case ModelAssociationPackage.ASSOCIATION__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
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
			case ModelAssociationPackage.ASSOCIATION__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends ModelVersion>)newValue);
				return;
			case ModelAssociationPackage.ASSOCIATION__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends ModelVersion>)newValue);
				return;
			case ModelAssociationPackage.ASSOCIATION__TRACES:
				getTraces().clear();
				getTraces().addAll((Collection<? extends Trace>)newValue);
				return;
			case ModelAssociationPackage.ASSOCIATION__TIMESTAMP:
				setTimestamp((Long)newValue);
				return;
			case ModelAssociationPackage.ASSOCIATION__PARENT:
				setParent((ModelAssociation)newValue);
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
			case ModelAssociationPackage.ASSOCIATION__SOURCE:
				getSource().clear();
				return;
			case ModelAssociationPackage.ASSOCIATION__TARGET:
				getTarget().clear();
				return;
			case ModelAssociationPackage.ASSOCIATION__TRACES:
				getTraces().clear();
				return;
			case ModelAssociationPackage.ASSOCIATION__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
				return;
			case ModelAssociationPackage.ASSOCIATION__PARENT:
				setParent((ModelAssociation)null);
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
			case ModelAssociationPackage.ASSOCIATION__SOURCE:
				return source != null && !source.isEmpty();
			case ModelAssociationPackage.ASSOCIATION__TARGET:
				return target != null && !target.isEmpty();
			case ModelAssociationPackage.ASSOCIATION__TRACES:
				return traces != null && !traces.isEmpty();
			case ModelAssociationPackage.ASSOCIATION__TIMESTAMP:
				return timestamp != TIMESTAMP_EDEFAULT;
			case ModelAssociationPackage.ASSOCIATION__PARENT:
				return parent != null;
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
		result.append(" (timestamp: ");
		result.append(timestamp);
		result.append(')');
		return result.toString();
	}

} //AssociationImpl
