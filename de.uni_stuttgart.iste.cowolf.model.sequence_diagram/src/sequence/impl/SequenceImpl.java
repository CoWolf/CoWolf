/**
 */
package sequence.impl;

import commonBase.impl.IDBaseImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import sequence.Sequence;
import sequence.SequencePackage;
import sequence.topLayer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sequence.impl.SequenceImpl#getTopLayer <em>Top Layer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SequenceImpl extends IDBaseImpl implements Sequence {
	/**
	 * The cached value of the '{@link #getTopLayer() <em>Top Layer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopLayer()
	 * @generated
	 * @ordered
	 */
	protected topLayer topLayer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SequencePackage.Literals.SEQUENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public topLayer getTopLayer() {
		return topLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTopLayer(topLayer newTopLayer, NotificationChain msgs) {
		topLayer oldTopLayer = topLayer;
		topLayer = newTopLayer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SequencePackage.SEQUENCE__TOP_LAYER, oldTopLayer, newTopLayer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopLayer(topLayer newTopLayer) {
		if (newTopLayer != topLayer) {
			NotificationChain msgs = null;
			if (topLayer != null)
				msgs = ((InternalEObject)topLayer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SequencePackage.SEQUENCE__TOP_LAYER, null, msgs);
			if (newTopLayer != null)
				msgs = ((InternalEObject)newTopLayer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SequencePackage.SEQUENCE__TOP_LAYER, null, msgs);
			msgs = basicSetTopLayer(newTopLayer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SequencePackage.SEQUENCE__TOP_LAYER, newTopLayer, newTopLayer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SequencePackage.SEQUENCE__TOP_LAYER:
				return basicSetTopLayer(null, msgs);
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
			case SequencePackage.SEQUENCE__TOP_LAYER:
				return getTopLayer();
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
			case SequencePackage.SEQUENCE__TOP_LAYER:
				setTopLayer((topLayer)newValue);
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
			case SequencePackage.SEQUENCE__TOP_LAYER:
				setTopLayer((topLayer)null);
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
			case SequencePackage.SEQUENCE__TOP_LAYER:
				return topLayer != null;
		}
		return super.eIsSet(featureID);
	}

} //SequenceImpl
