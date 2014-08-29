/**
 *
 * $Id$
 */
package de.uni_stuttgart.iste.cowolf.model.LqnCore.validation;

import de.uni_stuttgart.iste.cowolf.model.LqnCore.PlotControlType;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.ProcessorType;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.RunControlType;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.SlotType;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.SolverParamsType;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.XmlDebugType;

import java.math.BigDecimal;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link de.uni_stuttgart.iste.cowolf.model.LqnCore.LqnModelType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface LqnModelTypeValidator {
	boolean validate();

	boolean validateRunControl(RunControlType value);
	boolean validatePlotControl(PlotControlType value);
	boolean validateSolverParams(SolverParamsType value);
	boolean validateProcessor(EList<ProcessorType> value);
	boolean validateSlot(EList<SlotType> value);
	boolean validateDescription(String value);
	boolean validateLqncoreSchemaVersion(BigDecimal value);
	boolean validateLqnSchemaVersion(BigDecimal value);
	boolean validateName(String value);
	boolean validateXmlDebug(XmlDebugType value);
}
