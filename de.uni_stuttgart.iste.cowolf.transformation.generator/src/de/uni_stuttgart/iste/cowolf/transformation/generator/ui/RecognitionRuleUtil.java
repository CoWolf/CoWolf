package de.uni_stuttgart.iste.cowolf.transformation.generator.ui;

import org.eclipse.emf.henshin.model.Attribute;
import org.eclipse.emf.henshin.model.Node;
import org.eclipse.emf.henshin.model.Rule;
import org.sidiff.difference.rulebase.RecognitionRule;
import org.sidiff.difference.symmetric.SymmetricPackage;

/**
 * 
 * @author Rene Trefft
 *
 */
public class RecognitionRuleUtil {

	/**
	 * 
	 * @param recognitionRule
	 * @return
	 */
	public static String getRecognitionRuleName(RecognitionRule recognitionRule) {

		Rule recognitionModule = recognitionRule.getRecognitionMainUnit();

		for (Node node : recognitionModule.getRhs().getNodes()) {

			for (Attribute attribute : node.getAttributes()) {

				// we use the semantic change set name as recognition rule name
				if (attribute.getType() == SymmetricPackage.eINSTANCE
						.getSemanticChangeSet_Name()) {
					return (removeDoubleQuotes(attribute.getValue()));
				}

			}

		}

		return null;
	}

	/**
	 * 
	 * @param str
	 * @return
	 */
	private static String removeDoubleQuotes(String str) {

		return str.replaceAll("^\"|\"$", "");

	}

}
