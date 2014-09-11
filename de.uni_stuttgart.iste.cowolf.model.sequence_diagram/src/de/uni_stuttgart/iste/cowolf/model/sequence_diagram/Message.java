/**
 */
package de.uni_stuttgart.iste.cowolf.model.sequence_diagram;

import de.uni_stuttgart.iste.cowolf.model.commonBase.IDBase;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Message defines a particular communication between Lifelines of an Interaction.
 * <p>From package UML::Interactions.</p>
 * <!-- end-model-doc -->
 *
 *
 * @see de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Sequence_diagramPackage#getMessage()
 * @model
 * @generated
 */
public interface Message extends org.eclipse.uml2.uml.Message, IDBase {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isDistinguishableFrom() specifies that any two Messages may coexist in the same Namespace, regardless of their names.
	 * result = (true)
	 * <p>From package UML::Interactions.</p>
	 * <!-- end-model-doc -->
	 * @model required="true" nRequired="true" nsRequired="true"
	 * @generated
	 */
	boolean isDistinguishableFrom(NamedElement n, Namespace ns);
} // Message
