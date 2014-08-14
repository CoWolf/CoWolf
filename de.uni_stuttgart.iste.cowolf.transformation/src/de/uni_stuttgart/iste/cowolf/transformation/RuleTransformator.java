package de.uni_stuttgart.iste.cowolf.transformation;

import java.util.List;
import java.util.Map;
import java.util.Vector;

import org.eclipse.emf.henshin.model.Rule;
import org.sidiff.difference.symmetric.SemanticChangeSet;
import org.sidiff.difference.symmetric.SymmetricDifference;

public class RuleTransformator {

    /**
     * difference to transform.
     */
    private SymmetricDifference difference;

    private Map<String, Rule> diffToRule;

    /**
     * 
     * @param difference
     *            Difference to transform.
     * @param diffToRule
     *            map to
     */
    public RuleTransformator(SymmetricDifference difference,
            Map<String, Rule> diffToRule) {
        this.difference = difference;
        this.diffToRule = diffToRule;
    }

    public List<Rule> doTransformation() {
        List<SemanticChangeSet> changeSets = this.difference.getChangeSets();
        List<Rule> rules = new Vector<>();
        for (SemanticChangeSet changeSet : changeSets) {
            Rule rule = this.diffToRule.get(changeSet.getName());
            rules.add(rule);
        }
        return rules;
    }
}
