package de.uni_stuttgart.iste.cowolf.transformation;

import java.util.List;
import java.util.Map;
import java.util.Vector;

import org.sidiff.difference.symmetric.SemanticChangeSet;
import org.sidiff.difference.symmetric.SymmetricDifference;

import de.uni_stuttgart.iste.cowolf.transformation.model.TransformationRule;

public class RuleTransformator {

    /**
     * difference to transform.
     */
    private SymmetricDifference difference;

    private Map<String, TransformationRule> diffToRule;

    /**
     * 
     * @param difference
     *            Difference to transform.
     * @param diffToRule
     *            map to
     */
    public RuleTransformator(SymmetricDifference difference,
            Map<String, TransformationRule> diffToRule) {
        this.difference = difference;
        this.diffToRule = diffToRule;
    }

    public List<TransformationRule> doTransformation() {
        List<SemanticChangeSet> changeSets = this.difference.getChangeSets();
        List<TransformationRule> rules = new Vector<>();
        for (SemanticChangeSet changeSet : changeSets) {
            TransformationRule rule = this.diffToRule.get(changeSet.getName());
            rules.add(rule);
        }
        return rules;
    }
}
