package de.uni_stuttgart.iste.cowolf.transformation.model;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.henshin.model.Unit;

/**
 * Entity to represent a henshin rule and how to get the parameters from a
 * SymmetricDifference object.
 * 
 * @author Michael Müller
 *
 */
public class TransformationRule {

    /**
     * Henshin rule.
     */
    private Unit ruleUnit;

    /**
     * Map containing parameters.
     */
    private Map<String, String[]> parameters = new HashMap<String, String[]>();

    /**
     * @return the ruleUnit
     */
    public Unit getRuleUnit() {
        return ruleUnit;
    }

    /**
     * @param ruleUnit
     *            the ruleUnit to set
     */
    public void setRuleUnit(Unit ruleUnit) {
        this.ruleUnit = ruleUnit;
    }

    /**
     * @return the parameters
     */
    public Map<String, String[]> getParameters() {
        return parameters;
    }

    /**
     * @param parameters
     *            the parameters to set
     */
    public void setParameters(Map<String, String[]> parameters) {
        this.parameters = parameters;
    }

}
