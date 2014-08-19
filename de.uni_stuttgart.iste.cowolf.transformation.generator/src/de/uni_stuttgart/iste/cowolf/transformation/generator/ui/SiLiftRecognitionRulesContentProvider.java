package de.uni_stuttgart.iste.cowolf.transformation.generator.ui;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.henshin.model.Module;
import org.eclipse.emf.henshin.model.Node;
import org.eclipse.emf.henshin.model.Rule;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.sidiff.common.henshin.HenshinModuleAnalysis;
import org.sidiff.difference.rulebase.RecognitionRule;
import org.sidiff.difference.rulebase.RuleBase;
import org.sidiff.difference.rulebase.RuleBaseItem;
import org.sidiff.difference.rulebase.extension.IRuleBase;
import org.sidiff.difference.rulebase.wrapper.RuleBaseItemWrapper;
import org.sidiff.difference.symmetric.SymmetricPackage;

public class SiLiftRecognitionRulesContentProvider implements
		ITreeContentProvider {

	@Override
	public void dispose() {

	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {

	}

	@Override
	public Object[] getElements(Object ruleBases) {
		if (ruleBases instanceof IRuleBase[]) {
			return (IRuleBase[]) ruleBases;
		}
		return null;
	}

	@Override
	public Object[] getChildren(Object parentElement) {

		List<RecognitionRule> recognitionRules = new ArrayList<RecognitionRule>();

		if (parentElement instanceof IRuleBase) {
			for (RuleBaseItem ruleBaseItem : ((IRuleBase) parentElement)
					.getAllRuleBaseItems()) {

				System.out.println(ruleBaseItem);

				RecognitionRule recognitionRule = ruleBaseItem
						.getRecognitionRule();

				if (recognitionRule != null) {

					recognitionRules.add(recognitionRule);

				}

			}

			return recognitionRules
					.toArray(new RecognitionRule[recognitionRules.size()]);
		}

		return new Object[0];

	}

	@Override
	public Object getParent(Object element) {

		if (element instanceof RecognitionRule) {

			RuleBase ruleBase = ((RecognitionRule) element).getRuleBaseItem()
					.getRuleBase();
			return ruleBase;
		}

		return null;

	}

	@Override
	public boolean hasChildren(Object element) {

		if (element instanceof IRuleBase) {

			for (RuleBaseItem ruleBaseItem : ((IRuleBase) element)
					.getAllRuleBaseItems()) {

				RecognitionRule recognitionRule = ruleBaseItem
						.getRecognitionRule();

				// Module recognitionModule =
				// recognitionRule.getRecognitionModule();
				//
				// for (Rule rule :
				// HenshinModuleAnalysis.getAllRules(recognitionModule)) {
				// for (Node node : rule.getRhs().getNodes()) {
				// if (node.getType() ==
				// SymmetricPackage.eINSTANCE.getSemanticChangeSet()) {
				// System.out.println(node.eContainer().eResource().getURI());
				// }
				// }
				// }

				if (recognitionRule != null) {
					return true;
				}

			}

		}

		return false;
	}

	// @Override
	// public Object[] getElements(Object inputElement) {
	// return (File[]) inputElement;
	// }
	//
	// @Override
	// public Object[] getChildren(Object parentElement) {
	// File file = (File) parentElement;
	// return file.listFiles();
	// }
	//
	// @Override
	// public Object getParent(Object element) {
	// File file = (File) element;
	// return file.getParentFile();
	// }
	//
	// @Override
	// public boolean hasChildren(Object element) {
	// File file = (File) element;
	// if (file.isDirectory()) {
	// return true;
	// }
	// return false;
	// }

}
