/**
 */
package de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl;

import de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Interaction;
import de.uni_stuttgart.iste.cowolf.model.sequence_diagram.InteractionFragment;
import de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Lifeline;
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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.uml2.uml.ConnectableElement;
import org.eclipse.uml2.uml.PartDecomposition;
import org.eclipse.uml2.uml.ValueSpecification;

import org.eclipse.uml2.uml.internal.impl.NamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lifeline</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.LifelineImpl#getDecomposedAs <em>Decomposed As</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.LifelineImpl#getInteraction <em>Interaction</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.LifelineImpl#getRepresents <em>Represents</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.LifelineImpl#getSelector <em>Selector</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.LifelineImpl#getCoveredBy <em>Covered By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LifelineImpl extends NamedElementImpl implements Lifeline {
	/**
	 * The cached value of the '{@link #getDecomposedAs() <em>Decomposed As</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecomposedAs()
	 * @generated
	 * @ordered
	 */
	protected PartDecomposition decomposedAs;

	/**
	 * The cached value of the '{@link #getInteraction() <em>Interaction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteraction()
	 * @generated
	 * @ordered
	 */
	protected Interaction interaction;

	/**
	 * The cached value of the '{@link #getRepresents() <em>Represents</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresents()
	 * @generated
	 * @ordered
	 */
	protected ConnectableElement represents;

	/**
	 * The cached value of the '{@link #getSelector() <em>Selector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelector()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification selector;

	/**
	 * The cached value of the '{@link #getCoveredBy() <em>Covered By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoveredBy()
	 * @generated
	 * @ordered
	 */
	protected EList<InteractionFragment> coveredBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LifelineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Sequence_diagramPackage.Literals.LIFELINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartDecomposition getDecomposedAs() {
		if (decomposedAs != null && decomposedAs.eIsProxy()) {
			InternalEObject oldDecomposedAs = (InternalEObject)decomposedAs;
			decomposedAs = (PartDecomposition)eResolveProxy(oldDecomposedAs);
			if (decomposedAs != oldDecomposedAs) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Sequence_diagramPackage.LIFELINE__DECOMPOSED_AS, oldDecomposedAs, decomposedAs));
			}
		}
		return decomposedAs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartDecomposition basicGetDecomposedAs() {
		return decomposedAs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecomposedAs(PartDecomposition newDecomposedAs) {
		PartDecomposition oldDecomposedAs = decomposedAs;
		decomposedAs = newDecomposedAs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Sequence_diagramPackage.LIFELINE__DECOMPOSED_AS, oldDecomposedAs, decomposedAs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interaction getInteraction() {
		if (interaction != null && interaction.eIsProxy()) {
			InternalEObject oldInteraction = (InternalEObject)interaction;
			interaction = (Interaction)eResolveProxy(oldInteraction);
			if (interaction != oldInteraction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Sequence_diagramPackage.LIFELINE__INTERACTION, oldInteraction, interaction));
			}
		}
		return interaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interaction basicGetInteraction() {
		return interaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInteraction(Interaction newInteraction) {
		Interaction oldInteraction = interaction;
		interaction = newInteraction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Sequence_diagramPackage.LIFELINE__INTERACTION, oldInteraction, interaction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectableElement getRepresents() {
		if (represents != null && represents.eIsProxy()) {
			InternalEObject oldRepresents = (InternalEObject)represents;
			represents = (ConnectableElement)eResolveProxy(oldRepresents);
			if (represents != oldRepresents) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Sequence_diagramPackage.LIFELINE__REPRESENTS, oldRepresents, represents));
			}
		}
		return represents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectableElement basicGetRepresents() {
		return represents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresents(ConnectableElement newRepresents) {
		ConnectableElement oldRepresents = represents;
		represents = newRepresents;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Sequence_diagramPackage.LIFELINE__REPRESENTS, oldRepresents, represents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getSelector() {
		return selector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelector(ValueSpecification newSelector, NotificationChain msgs) {
		ValueSpecification oldSelector = selector;
		selector = newSelector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Sequence_diagramPackage.LIFELINE__SELECTOR, oldSelector, newSelector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelector(ValueSpecification newSelector) {
		if (newSelector != selector) {
			NotificationChain msgs = null;
			if (selector != null)
				msgs = ((InternalEObject)selector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Sequence_diagramPackage.LIFELINE__SELECTOR, null, msgs);
			if (newSelector != null)
				msgs = ((InternalEObject)newSelector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Sequence_diagramPackage.LIFELINE__SELECTOR, null, msgs);
			msgs = basicSetSelector(newSelector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Sequence_diagramPackage.LIFELINE__SELECTOR, newSelector, newSelector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InteractionFragment> getCoveredBy() {
		if (coveredBy == null) {
			coveredBy = new EObjectResolvingEList<InteractionFragment>(InteractionFragment.class, this, Sequence_diagramPackage.LIFELINE__COVERED_BY);
		}
		return coveredBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean selector_specified(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 Sequence_diagramValidator.LIFELINE__SELECTOR_SPECIFIED,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "selector_specified", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean interaction_uses_share_lifeline(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 Sequence_diagramValidator.LIFELINE__INTERACTION_USES_SHARE_LIFELINE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "interaction_uses_share_lifeline", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean same_classifier(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 Sequence_diagramValidator.LIFELINE__SAME_CLASSIFIER,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "same_classifier", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean selector_int_or_string(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 Sequence_diagramValidator.LIFELINE__SELECTOR_INT_OR_STRING,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "selector_int_or_string", EObjectValidator.getObjectLabel(this, context) }),
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
			case Sequence_diagramPackage.LIFELINE__SELECTOR:
				return basicSetSelector(null, msgs);
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
			case Sequence_diagramPackage.LIFELINE__DECOMPOSED_AS:
				if (resolve) return getDecomposedAs();
				return basicGetDecomposedAs();
			case Sequence_diagramPackage.LIFELINE__INTERACTION:
				if (resolve) return getInteraction();
				return basicGetInteraction();
			case Sequence_diagramPackage.LIFELINE__REPRESENTS:
				if (resolve) return getRepresents();
				return basicGetRepresents();
			case Sequence_diagramPackage.LIFELINE__SELECTOR:
				return getSelector();
			case Sequence_diagramPackage.LIFELINE__COVERED_BY:
				return getCoveredBy();
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
			case Sequence_diagramPackage.LIFELINE__DECOMPOSED_AS:
				setDecomposedAs((PartDecomposition)newValue);
				return;
			case Sequence_diagramPackage.LIFELINE__INTERACTION:
				setInteraction((Interaction)newValue);
				return;
			case Sequence_diagramPackage.LIFELINE__REPRESENTS:
				setRepresents((ConnectableElement)newValue);
				return;
			case Sequence_diagramPackage.LIFELINE__SELECTOR:
				setSelector((ValueSpecification)newValue);
				return;
			case Sequence_diagramPackage.LIFELINE__COVERED_BY:
				getCoveredBy().clear();
				getCoveredBy().addAll((Collection<? extends InteractionFragment>)newValue);
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
			case Sequence_diagramPackage.LIFELINE__DECOMPOSED_AS:
				setDecomposedAs((PartDecomposition)null);
				return;
			case Sequence_diagramPackage.LIFELINE__INTERACTION:
				setInteraction((Interaction)null);
				return;
			case Sequence_diagramPackage.LIFELINE__REPRESENTS:
				setRepresents((ConnectableElement)null);
				return;
			case Sequence_diagramPackage.LIFELINE__SELECTOR:
				setSelector((ValueSpecification)null);
				return;
			case Sequence_diagramPackage.LIFELINE__COVERED_BY:
				getCoveredBy().clear();
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
			case Sequence_diagramPackage.LIFELINE__DECOMPOSED_AS:
				return decomposedAs != null;
			case Sequence_diagramPackage.LIFELINE__INTERACTION:
				return interaction != null;
			case Sequence_diagramPackage.LIFELINE__REPRESENTS:
				return represents != null;
			case Sequence_diagramPackage.LIFELINE__SELECTOR:
				return selector != null;
			case Sequence_diagramPackage.LIFELINE__COVERED_BY:
				return coveredBy != null && !coveredBy.isEmpty();
		}
		return super.eIsSet(featureID);
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
			case Sequence_diagramPackage.LIFELINE___SELECTOR_SPECIFIED__DIAGNOSTICCHAIN_MAP:
				return selector_specified((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Sequence_diagramPackage.LIFELINE___INTERACTION_USES_SHARE_LIFELINE__DIAGNOSTICCHAIN_MAP:
				return interaction_uses_share_lifeline((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Sequence_diagramPackage.LIFELINE___SAME_CLASSIFIER__DIAGNOSTICCHAIN_MAP:
				return same_classifier((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Sequence_diagramPackage.LIFELINE___SELECTOR_INT_OR_STRING__DIAGNOSTICCHAIN_MAP:
				return selector_int_or_string((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //LifelineImpl
