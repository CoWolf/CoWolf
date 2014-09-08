/**
 */
package de.uni_stuttgart.iste.cowolf.model.sequence_diagram;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.uml2.uml.OccurrenceSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execution Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An ExecutionSpecification is a specification of the execution of a unit of Behavior or Action within the Lifeline. The duration of an ExecutionSpecification is represented by two OccurrenceSpecifications, the start OccurrenceSpecification and the finish OccurrenceSpecification.
 * <p>From package UML::Interactions.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.sequence_diagram.ExecutionSpecification#getFinish <em>Finish</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.sequence_diagram.ExecutionSpecification#getStart <em>Start</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Sequence_diagramPackage#getExecutionSpecification()
 * @model abstract="true"
 * @generated
 */
public interface ExecutionSpecification extends InteractionFragment {
	/**
	 * Returns the value of the '<em><b>Finish</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the OccurrenceSpecification that designates the finish of the Action or Behavior.
	 * <p>From package UML::Interactions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Finish</em>' reference.
	 * @see #setFinish(OccurrenceSpecification)
	 * @see de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Sequence_diagramPackage#getExecutionSpecification_Finish()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	OccurrenceSpecification getFinish();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.sequence_diagram.ExecutionSpecification#getFinish <em>Finish</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finish</em>' reference.
	 * @see #getFinish()
	 * @generated
	 */
	void setFinish(OccurrenceSpecification value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the OccurrenceSpecification that designates the start of the Action or Behavior.
	 * <p>From package UML::Interactions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start</em>' reference.
	 * @see #setStart(OccurrenceSpecification)
	 * @see de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Sequence_diagramPackage#getExecutionSpecification_Start()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	OccurrenceSpecification getStart();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.sequence_diagram.ExecutionSpecification#getStart <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(OccurrenceSpecification value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The startEvent and the finishEvent must be on the same Lifeline.
	 * start.covered = finish.covered
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean same_lifeline(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ExecutionSpecification
