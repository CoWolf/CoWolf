package de.uni_stuttgart.iste.cowolf.transformation.generator.ui;

import org.eclipse.emf.henshin.model.Attribute;
import org.eclipse.emf.henshin.model.Node;
import org.eclipse.emf.henshin.model.Rule;
import org.sidiff.difference.rulebase.RecognitionRule;
import org.sidiff.difference.symmetric.SymmetricPackage;

public class RecognitionRuleUtil {

	public static String getChangeSetName(RecognitionRule recognitionRule) {

		Rule recognitionModule = recognitionRule.getRecognitionMainUnit();

		for (Node node : recognitionModule.getRhs().getNodes()) {

			for (Attribute attribute : node.getAttributes()) {

				if (attribute.getType() == SymmetricPackage.eINSTANCE
						.getSemanticChangeSet_Name()) {
					return (removeDoubleQuotes(attribute.getValue()));
				}

			}

		}
		
		return null;
	}

	private static String removeDoubleQuotes(String str) {

		return str.replaceAll("^\"|\"$", "");

	}

}
