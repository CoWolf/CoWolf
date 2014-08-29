/**
 *
 * $Id$
 */
package de.uni_stuttgart.iste.cowolf.model.LqnCore.validation;

import de.uni_stuttgart.iste.cowolf.model.LqnCore.ValidType;

/**
 * A sample validator interface for {@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultGeneralType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ResultGeneralTypeValidator {
	boolean validate();

	boolean validateConvVal(Object value);
	boolean validateElapsedTime(String value);
	boolean validateIterations(Object value);
	boolean validatePlatformInfo(String value);
	boolean validateSolverInfo(String value);
	boolean validateSystemCpuTime(String value);
	boolean validateUserCpuTime(String value);
	boolean validateValid(ValidType value);
}
