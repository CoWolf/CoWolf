/**
 *
 * $Id$
 */
package de.uni_stuttgart.iste.cowolf.model.LqnCore.validation;

import java.util.List;

/**
 * A sample validator interface for {@link de.uni_stuttgart.iste.cowolf.model.LqnCore.OutPortType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface OutPortTypeValidator {
	boolean validate();

	boolean validateConnectTo(List<String> value);
	boolean validateDescription(String value);
	boolean validateName(String value);
}
