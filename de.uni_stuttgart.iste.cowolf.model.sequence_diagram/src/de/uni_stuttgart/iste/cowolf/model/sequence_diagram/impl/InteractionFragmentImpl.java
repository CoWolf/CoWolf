/**
 */
package de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl;

import de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Interaction;
import de.uni_stuttgart.iste.cowolf.model.sequence_diagram.InteractionFragment;
import de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Sequence_diagramPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.GeneralOrdering;
import org.eclipse.uml2.uml.InteractionOperand;
import org.eclipse.uml2.uml.Lifeline;

import org.eclipse.uml2.uml.internal.impl.NamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction Fragment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.InteractionFragmentImpl#getCovered <em>Covered</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.InteractionFragmentImpl#getEnclosingOperand <em>Enclosing Operand</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.InteractionFragmentImpl#getEnclosingInteraction <em>Enclosing Interaction</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.InteractionFragmentImpl#getGeneralOrdering <em>General Ordering</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class InteractionFragmentImpl extends NamedElementImpl implements InteractionFragment {
	/**
	 * The cached value of the '{@link #getCovered() <em>Covered</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCovered()
	 * @generated
	 * @ordered
	 */
	protected EList<Lifeline> covered;

	/**
	 * The cached value of the '{@link #getEnclosingOperand() <em>Enclosing Operand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnclosingOperand()
	 * @generated
	 * @ordered
	 */
	protected InteractionOperand enclosingOperand;

	/**
	 * The cached value of the '{@link #getEnclosingInteraction() <em>Enclosing Interaction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnclosingInteraction()
	 * @generated
	 * @ordered
	 */
	protected Interaction enclosingInteraction;

	/**
	 * The cached value of the '{@link #getGeneralOrdering() <em>General Ordering</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralOrdering()
	 * @generated
	 * @ordered
	 */
	protected EList<GeneralOrdering> generalOrdering;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractionFragmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Sequence_diagramPackage.Literals.INTERACTION_FRAGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Lifeline> getCovered() {
		if (covered == null) {
			covered = new EObjectResolvingEList<Lifeline>(Lifeline.class, this, Sequence_diagramPackage.INTERACTION_FRAGMENT__COVERED);
		}
		return covered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionOperand getEnclosingOperand() {
		if (enclosingOperand != null && enclosingOperand.eIsProxy()) {
			InternalEObject oldEnclosingOperand = (InternalEObject)enclosingOperand;
			enclosingOperand = (InteractionOperand)eResolveProxy(oldEnclosingOperand);
			if (enclosingOperand != oldEnclosingOperand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Sequence_diagramPackage.INTERACTION_FRAGMENT__ENCLOSING_OPERAND, oldEnclosingOperand, enclosingOperand));
			}
		}
		return enclosingOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionOperand basicGetEnclosingOperand() {
		return enclosingOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnclosingOperand(InteractionOperand newEnclosingOperand) {
		InteractionOperand oldEnclosingOperand = enclosingOperand;
		enclosingOperand = newEnclosingOperand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Sequence_diagramPackage.INTERACTION_FRAGMENT__ENCLOSING_OPERAND, oldEnclosingOperand, enclosingOperand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interaction getEnclosingInteraction() {
		if (enclosingInteraction != null && enclosingInteraction.eIsProxy()) {
			InternalEObject oldEnclosingInteraction = (InternalEObject)enclosingInteraction;
			enclosingInteraction = (Interaction)eResolveProxy(oldEnclosingInteraction);
			if (enclosingInteraction != oldEnclosingInteraction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Sequence_diagramPackage.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION, oldEnclosingInteraction, enclosingInteraction));
			}
		}
		return enclosingInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interaction basicGetEnclosingInteraction() {
		return enclosingInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnclosingInteraction(Interaction newEnclosingInteraction) {
		Interaction oldEnclosingInteraction = enclosingInteraction;
		enclosingInteraction = newEnclosingInteraction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Sequence_diagramPackage.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION, oldEnclosingInteraction, enclosingInteraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneralOrdering> getGeneralOrdering() {
		if (generalOrdering == null) {
			generalOrdering = new EObjectContainmentEList<GeneralOrdering>(GeneralOrdering.class, this, Sequence_diagramPackage.INTERACTION_FRAGMENT__GENERAL_ORDERING);
		}
		return generalOrdering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Sequence_diagramPackage.INTERACTION_FRAGMENT__GENERAL_ORDERING:
				return ((InternalEList<?>)getGeneralOrdering()).basicRemove(otherEnd, msgs);
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
			case Sequence_diagramPackage.INTERACTION_FRAGMENT__COVERED:
				return getCovered();
			case Sequence_diagramPackage.INTERACTION_FRAGMENT__ENCLOSING_OPERAND:
				if (resolve) return getEnclosingOperand();
				return basicGetEnclosingOperand();
			case Sequence_diagramPackage.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION:
				if (resolve) return getEnclosingInteraction();
				return basicGetEnclosingInteraction();
			case Sequence_diagramPackage.INTERACTION_FRAGMENT__GENERAL_ORDERING:
				return getGeneralOrdering();
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
			case Sequence_diagramPackage.INTERACTION_FRAGMENT__COVERED:
				getCovered().clear();
				getCovered().addAll((Collection<? extends Lifeline>)newValue);
				return;
			case Sequence_diagramPackage.INTERACTION_FRAGMENT__ENCLOSING_OPERAND:
				setEnclosingOperand((InteractionOperand)newValue);
				return;
			case Sequence_diagramPackage.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION:
				setEnclosingInteraction((Interaction)newValue);
				return;
			case Sequence_diagramPackage.INTERACTION_FRAGMENT__GENERAL_ORDERING:
				getGeneralOrdering().clear();
				getGeneralOrdering().addAll((Collection<? extends GeneralOrdering>)newValue);
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
			case Sequence_diagramPackage.INTERACTION_FRAGMENT__COVERED:
				getCovered().clear();
				return;
			case Sequence_diagramPackage.INTERACTION_FRAGMENT__ENCLOSING_OPERAND:
				setEnclosingOperand((InteractionOperand)null);
				return;
			case Sequence_diagramPackage.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION:
				setEnclosingInteraction((Interaction)null);
				return;
			case Sequence_diagramPackage.INTERACTION_FRAGMENT__GENERAL_ORDERING:
				getGeneralOrdering().clear();
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
			case Sequence_diagramPackage.INTERACTION_FRAGMENT__COVERED:
				return covered != null && !covered.isEmpty();
			case Sequence_diagramPackage.INTERACTION_FRAGMENT__ENCLOSING_OPERAND:
				return enclosingOperand != null;
			case Sequence_diagramPackage.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION:
				return enclosingInteraction != null;
			case Sequence_diagramPackage.INTERACTION_FRAGMENT__GENERAL_ORDERING:
				return generalOrdering != null && !generalOrdering.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InteractionFragmentImpl
