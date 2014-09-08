/**
 */
package de.uni_stuttgart.iste.cowolf.model.sequence_diagram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.GeneralOrdering;
import org.eclipse.uml2.uml.InteractionOperand;
import org.eclipse.uml2.uml.Lifeline;
import org.eclipse.uml2.uml.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction Fragment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * InteractionFragment is an abstract notion of the most general interaction unit. An InteractionFragment is a piece of an Interaction. Each InteractionFragment is conceptually like an Interaction by itself.
 * <p>From package UML::Interactions.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.sequence_diagram.InteractionFragment#getCovered <em>Covered</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.sequence_diagram.InteractionFragment#getEnclosingOperand <em>Enclosing Operand</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.sequence_diagram.InteractionFragment#getEnclosingInteraction <em>Enclosing Interaction</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.sequence_diagram.InteractionFragment#getGeneralOrdering <em>General Ordering</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Sequence_diagramPackage#getInteractionFragment()
 * @model abstract="true"
 * @generated
 */
public interface InteractionFragment extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Covered</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Lifeline}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the Lifelines that the InteractionFragment involves.
	 * <p>From package UML::Interactions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Covered</em>' reference list.
	 * @see de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Sequence_diagramPackage#getInteractionFragment_Covered()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Lifeline> getCovered();

	/**
	 * Returns the value of the '<em><b>Enclosing Operand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The operand enclosing this InteractionFragment (they may nest recursively).
	 * <p>From package UML::Interactions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enclosing Operand</em>' reference.
	 * @see #setEnclosingOperand(InteractionOperand)
	 * @see de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Sequence_diagramPackage#getInteractionFragment_EnclosingOperand()
	 * @model ordered="false"
	 * @generated
	 */
	InteractionOperand getEnclosingOperand();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.sequence_diagram.InteractionFragment#getEnclosingOperand <em>Enclosing Operand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enclosing Operand</em>' reference.
	 * @see #getEnclosingOperand()
	 * @generated
	 */
	void setEnclosingOperand(InteractionOperand value);

	/**
	 * Returns the value of the '<em><b>Enclosing Interaction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Interaction enclosing this InteractionFragment.
	 * <p>From package UML::Interactions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enclosing Interaction</em>' reference.
	 * @see #setEnclosingInteraction(Interaction)
	 * @see de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Sequence_diagramPackage#getInteractionFragment_EnclosingInteraction()
	 * @model ordered="false"
	 * @generated
	 */
	Interaction getEnclosingInteraction();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.sequence_diagram.InteractionFragment#getEnclosingInteraction <em>Enclosing Interaction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enclosing Interaction</em>' reference.
	 * @see #getEnclosingInteraction()
	 * @generated
	 */
	void setEnclosingInteraction(Interaction value);

	/**
	 * Returns the value of the '<em><b>General Ordering</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.GeneralOrdering}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The general ordering relationships contained in this fragment.
	 * <p>From package UML::Interactions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>General Ordering</em>' containment reference list.
	 * @see de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Sequence_diagramPackage#getInteractionFragment_GeneralOrdering()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<GeneralOrdering> getGeneralOrdering();

} // InteractionFragment
