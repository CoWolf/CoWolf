/**
 */
package de.uni_stuttgart.iste.cowolf.model.LqnCore.impl;

import de.uni_stuttgart.iste.cowolf.model.LqnCore.FirstPlotType;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.PlotControlType;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.PlotType;

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
 * An implementation of the model object '<em><b>Plot Control Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.PlotControlTypeImpl#getFirstPlot <em>First Plot</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.PlotControlTypeImpl#getPlot <em>Plot</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlotControlTypeImpl extends IDBaseImpl implements PlotControlType {
	/**
	 * The cached value of the '{@link #getFirstPlot() <em>First Plot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstPlot()
	 * @generated
	 * @ordered
	 */
	protected FirstPlotType firstPlot;

	/**
	 * The cached value of the '{@link #getPlot() <em>Plot</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlot()
	 * @generated
	 * @ordered
	 */
	protected EList<PlotType> plot;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlotControlTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LQNPackage.Literals.PLOT_CONTROL_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FirstPlotType getFirstPlot() {
		return firstPlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFirstPlot(FirstPlotType newFirstPlot, NotificationChain msgs) {
		FirstPlotType oldFirstPlot = firstPlot;
		firstPlot = newFirstPlot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LQNPackage.PLOT_CONTROL_TYPE__FIRST_PLOT, oldFirstPlot, newFirstPlot);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstPlot(FirstPlotType newFirstPlot) {
		if (newFirstPlot != firstPlot) {
			NotificationChain msgs = null;
			if (firstPlot != null)
				msgs = ((InternalEObject)firstPlot).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LQNPackage.PLOT_CONTROL_TYPE__FIRST_PLOT, null, msgs);
			if (newFirstPlot != null)
				msgs = ((InternalEObject)newFirstPlot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LQNPackage.PLOT_CONTROL_TYPE__FIRST_PLOT, null, msgs);
			msgs = basicSetFirstPlot(newFirstPlot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.PLOT_CONTROL_TYPE__FIRST_PLOT, newFirstPlot, newFirstPlot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlotType> getPlot() {
		if (plot == null) {
			plot = new EObjectContainmentEList<PlotType>(PlotType.class, this, LQNPackage.PLOT_CONTROL_TYPE__PLOT);
		}
		return plot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LQNPackage.PLOT_CONTROL_TYPE__FIRST_PLOT:
				return basicSetFirstPlot(null, msgs);
			case LQNPackage.PLOT_CONTROL_TYPE__PLOT:
				return ((InternalEList<?>)getPlot()).basicRemove(otherEnd, msgs);
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
			case LQNPackage.PLOT_CONTROL_TYPE__FIRST_PLOT:
				return getFirstPlot();
			case LQNPackage.PLOT_CONTROL_TYPE__PLOT:
				return getPlot();
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
			case LQNPackage.PLOT_CONTROL_TYPE__FIRST_PLOT:
				setFirstPlot((FirstPlotType)newValue);
				return;
			case LQNPackage.PLOT_CONTROL_TYPE__PLOT:
				getPlot().clear();
				getPlot().addAll((Collection<? extends PlotType>)newValue);
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
			case LQNPackage.PLOT_CONTROL_TYPE__FIRST_PLOT:
				setFirstPlot((FirstPlotType)null);
				return;
			case LQNPackage.PLOT_CONTROL_TYPE__PLOT:
				getPlot().clear();
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
			case LQNPackage.PLOT_CONTROL_TYPE__FIRST_PLOT:
				return firstPlot != null;
			case LQNPackage.PLOT_CONTROL_TYPE__PLOT:
				return plot != null && !plot.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PlotControlTypeImpl
