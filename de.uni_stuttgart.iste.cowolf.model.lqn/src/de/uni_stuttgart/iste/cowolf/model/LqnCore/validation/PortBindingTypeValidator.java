/**
 *
 * $Id$
 */
package de.uni_stuttgart.iste.cowolf.model.LqnCore.validation;


/**
 * A sample validator interface for {@link de.uni_stuttgart.iste.cowolf.model.LqnCore.PortBindingType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface PortBindingTypeValidator {
	boolean validate();

	boolean validateSource(String value);
	boolean validateTarget(String value);
}
