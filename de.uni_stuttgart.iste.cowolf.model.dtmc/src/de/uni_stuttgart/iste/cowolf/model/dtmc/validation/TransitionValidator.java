/**
 *
 * $Id$
 */
package de.uni_stuttgart.iste.cowolf.model.dtmc.validation;

import de.uni_stuttgart.iste.cowolf.model.dtmc.State;

/**
 * A sample validator interface for {@link de.uni_stuttgart.iste.cowolf.model.dtmc.Transition}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface TransitionValidator {
	boolean validate();

	boolean validateFrom(State value);
	boolean validateTo(State value);
	boolean validateProb(float value);
}
