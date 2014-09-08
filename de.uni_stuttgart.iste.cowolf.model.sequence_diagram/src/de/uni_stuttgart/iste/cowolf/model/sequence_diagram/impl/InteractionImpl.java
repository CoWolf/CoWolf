/**
 */
package de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl;

import de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Gate;
import de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Interaction;
import de.uni_stuttgart.iste.cowolf.model.sequence_diagram.InteractionFragment;
import de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Message;
import de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Sequence_diagramPackage;
import de.uni_stuttgart.iste.cowolf.model.sequence_diagram.util.Sequence_diagramValidator;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.uml.Action;
import org.eclipse.uml2.uml.GeneralOrdering;
import org.eclipse.uml2.uml.InteractionOperand;
import org.eclipse.uml2.uml.Lifeline;
import org.eclipse.uml2.uml.internal.impl.BehaviorImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.InteractionImpl#getCovered <em>Covered</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.InteractionImpl#getEnclosingOperand <em>Enclosing Operand</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.InteractionImpl#getEnclosingInteraction <em>Enclosing Interaction</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.InteractionImpl#getGeneralOrdering <em>General Ordering</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.InteractionImpl#getLifeline <em>Lifeline</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.InteractionImpl#getFragment <em>Fragment</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.InteractionImpl#getAction <em>Action</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.InteractionImpl#getFormalGate <em>Formal Gate</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.InteractionImpl#getMessage <em>Message</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InteractionImpl extends BehaviorImpl implements Interaction {
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
	 * The cached value of the '{@link #getLifeline() <em>Lifeline</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLifeline()
	 * @generated
	 * @ordered
	 */
	protected EList<de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Lifeline> lifeline;

	/**
	 * The cached value of the '{@link #getFragment() <em>Fragment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFragment()
	 * @generated
	 * @ordered
	 */
	protected EList<InteractionFragment> fragment;

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
	 * The cached value of the '{@link #getFormalGate() <em>Formal Gate</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormalGate()
	 * @generated
	 * @ordered
	 */
	protected EList<Gate> formalGate;

	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected EList<Message> message;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Sequence_diagramPackage.Literals.INTERACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Lifeline> getCovered() {
		if (covered == null) {
			covered = new EObjectResolvingEList<Lifeline>(Lifeline.class, this, Sequence_diagramPackage.INTERACTION__COVERED);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Sequence_diagramPackage.INTERACTION__ENCLOSING_OPERAND, oldEnclosingOperand, enclosingOperand));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Sequence_diagramPackage.INTERACTION__ENCLOSING_OPERAND, oldEnclosingOperand, enclosingOperand));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Sequence_diagramPackage.INTERACTION__ENCLOSING_INTERACTION, oldEnclosingInteraction, enclosingInteraction));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Sequence_diagramPackage.INTERACTION__ENCLOSING_INTERACTION, oldEnclosingInteraction, enclosingInteraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneralOrdering> getGeneralOrdering() {
		if (generalOrdering == null) {
			generalOrdering = new EObjectContainmentEList<GeneralOrdering>(GeneralOrdering.class, this, Sequence_diagramPackage.INTERACTION__GENERAL_ORDERING);
		}
		return generalOrdering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Lifeline> getLifeline() {
		if (lifeline == null) {
			lifeline = new EObjectContainmentEList<de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Lifeline>(de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Lifeline.class, this, Sequence_diagramPackage.INTERACTION__LIFELINE);
		}
		return lifeline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InteractionFragment> getFragment() {
		if (fragment == null) {
			fragment = new EObjectContainmentEList<InteractionFragment>(InteractionFragment.class, this, Sequence_diagramPackage.INTERACTION__FRAGMENT);
		}
		return fragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getAction() {
		if (action == null) {
			action = new EObjectContainmentEList<Action>(Action.class, this, Sequence_diagramPackage.INTERACTION__ACTION);
		}
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Gate> getFormalGate() {
		if (formalGate == null) {
			formalGate = new EObjectContainmentEList<Gate>(Gate.class, this, Sequence_diagramPackage.INTERACTION__FORMAL_GATE);
		}
		return formalGate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Message> getMessage() {
		if (message == null) {
			message = new EObjectContainmentEList<Message>(Message.class, this, Sequence_diagramPackage.INTERACTION__MESSAGE);
		}
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean not_contained(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Sequence_diagramValidator.DIAGNOSTIC_SOURCE,
						 Sequence_diagramValidator.INTERACTION__NOT_CONTAINED,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "not_contained", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Sequence_diagramPackage.INTERACTION__GENERAL_ORDERING:
				return ((InternalEList<?>)getGeneralOrdering()).basicRemove(otherEnd, msgs);
			case Sequence_diagramPackage.INTERACTION__LIFELINE:
				return ((InternalEList<?>)getLifeline()).basicRemove(otherEnd, msgs);
			case Sequence_diagramPackage.INTERACTION__FRAGMENT:
				return ((InternalEList<?>)getFragment()).basicRemove(otherEnd, msgs);
			case Sequence_diagramPackage.INTERACTION__ACTION:
				return ((InternalEList<?>)getAction()).basicRemove(otherEnd, msgs);
			case Sequence_diagramPackage.INTERACTION__FORMAL_GATE:
				return ((InternalEList<?>)getFormalGate()).basicRemove(otherEnd, msgs);
			case Sequence_diagramPackage.INTERACTION__MESSAGE:
				return ((InternalEList<?>)getMessage()).basicRemove(otherEnd, msgs);
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
			case Sequence_diagramPackage.INTERACTION__COVERED:
				return getCovered();
			case Sequence_diagramPackage.INTERACTION__ENCLOSING_OPERAND:
				if (resolve) return getEnclosingOperand();
				return basicGetEnclosingOperand();
			case Sequence_diagramPackage.INTERACTION__ENCLOSING_INTERACTION:
				if (resolve) return getEnclosingInteraction();
				return basicGetEnclosingInteraction();
			case Sequence_diagramPackage.INTERACTION__GENERAL_ORDERING:
				return getGeneralOrdering();
			case Sequence_diagramPackage.INTERACTION__LIFELINE:
				return getLifeline();
			case Sequence_diagramPackage.INTERACTION__FRAGMENT:
				return getFragment();
			case Sequence_diagramPackage.INTERACTION__ACTION:
				return getAction();
			case Sequence_diagramPackage.INTERACTION__FORMAL_GATE:
				return getFormalGate();
			case Sequence_diagramPackage.INTERACTION__MESSAGE:
				return getMessage();
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
			case Sequence_diagramPackage.INTERACTION__COVERED:
				getCovered().clear();
				getCovered().addAll((Collection<? extends Lifeline>)newValue);
				return;
			case Sequence_diagramPackage.INTERACTION__ENCLOSING_OPERAND:
				setEnclosingOperand((InteractionOperand)newValue);
				return;
			case Sequence_diagramPackage.INTERACTION__ENCLOSING_INTERACTION:
				setEnclosingInteraction((Interaction)newValue);
				return;
			case Sequence_diagramPackage.INTERACTION__GENERAL_ORDERING:
				getGeneralOrdering().clear();
				getGeneralOrdering().addAll((Collection<? extends GeneralOrdering>)newValue);
				return;
			case Sequence_diagramPackage.INTERACTION__LIFELINE:
				getLifeline().clear();
				getLifeline().addAll((Collection<? extends de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Lifeline>)newValue);
				return;
			case Sequence_diagramPackage.INTERACTION__FRAGMENT:
				getFragment().clear();
				getFragment().addAll((Collection<? extends InteractionFragment>)newValue);
				return;
			case Sequence_diagramPackage.INTERACTION__ACTION:
				getAction().clear();
				getAction().addAll((Collection<? extends Action>)newValue);
				return;
			case Sequence_diagramPackage.INTERACTION__FORMAL_GATE:
				getFormalGate().clear();
				getFormalGate().addAll((Collection<? extends Gate>)newValue);
				return;
			case Sequence_diagramPackage.INTERACTION__MESSAGE:
				getMessage().clear();
				getMessage().addAll((Collection<? extends Message>)newValue);
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
			case Sequence_diagramPackage.INTERACTION__COVERED:
				getCovered().clear();
				return;
			case Sequence_diagramPackage.INTERACTION__ENCLOSING_OPERAND:
				setEnclosingOperand((InteractionOperand)null);
				return;
			case Sequence_diagramPackage.INTERACTION__ENCLOSING_INTERACTION:
				setEnclosingInteraction((Interaction)null);
				return;
			case Sequence_diagramPackage.INTERACTION__GENERAL_ORDERING:
				getGeneralOrdering().clear();
				return;
			case Sequence_diagramPackage.INTERACTION__LIFELINE:
				getLifeline().clear();
				return;
			case Sequence_diagramPackage.INTERACTION__FRAGMENT:
				getFragment().clear();
				return;
			case Sequence_diagramPackage.INTERACTION__ACTION:
				getAction().clear();
				return;
			case Sequence_diagramPackage.INTERACTION__FORMAL_GATE:
				getFormalGate().clear();
				return;
			case Sequence_diagramPackage.INTERACTION__MESSAGE:
				getMessage().clear();
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
			case Sequence_diagramPackage.INTERACTION__COVERED:
				return covered != null && !covered.isEmpty();
			case Sequence_diagramPackage.INTERACTION__ENCLOSING_OPERAND:
				return enclosingOperand != null;
			case Sequence_diagramPackage.INTERACTION__ENCLOSING_INTERACTION:
				return enclosingInteraction != null;
			case Sequence_diagramPackage.INTERACTION__GENERAL_ORDERING:
				return generalOrdering != null && !generalOrdering.isEmpty();
			case Sequence_diagramPackage.INTERACTION__LIFELINE:
				return lifeline != null && !lifeline.isEmpty();
			case Sequence_diagramPackage.INTERACTION__FRAGMENT:
				return fragment != null && !fragment.isEmpty();
			case Sequence_diagramPackage.INTERACTION__ACTION:
				return action != null && !action.isEmpty();
			case Sequence_diagramPackage.INTERACTION__FORMAL_GATE:
				return formalGate != null && !formalGate.isEmpty();
			case Sequence_diagramPackage.INTERACTION__MESSAGE:
				return message != null && !message.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == InteractionFragment.class) {
			switch (derivedFeatureID) {
				case Sequence_diagramPackage.INTERACTION__COVERED: return Sequence_diagramPackage.INTERACTION_FRAGMENT__COVERED;
				case Sequence_diagramPackage.INTERACTION__ENCLOSING_OPERAND: return Sequence_diagramPackage.INTERACTION_FRAGMENT__ENCLOSING_OPERAND;
				case Sequence_diagramPackage.INTERACTION__ENCLOSING_INTERACTION: return Sequence_diagramPackage.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION;
				case Sequence_diagramPackage.INTERACTION__GENERAL_ORDERING: return Sequence_diagramPackage.INTERACTION_FRAGMENT__GENERAL_ORDERING;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == InteractionFragment.class) {
			switch (baseFeatureID) {
				case Sequence_diagramPackage.INTERACTION_FRAGMENT__COVERED: return Sequence_diagramPackage.INTERACTION__COVERED;
				case Sequence_diagramPackage.INTERACTION_FRAGMENT__ENCLOSING_OPERAND: return Sequence_diagramPackage.INTERACTION__ENCLOSING_OPERAND;
				case Sequence_diagramPackage.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION: return Sequence_diagramPackage.INTERACTION__ENCLOSING_INTERACTION;
				case Sequence_diagramPackage.INTERACTION_FRAGMENT__GENERAL_ORDERING: return Sequence_diagramPackage.INTERACTION__GENERAL_ORDERING;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Sequence_diagramPackage.INTERACTION___NOT_CONTAINED__DIAGNOSTICCHAIN_MAP:
				return not_contained((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	

} //InteractionImpl
