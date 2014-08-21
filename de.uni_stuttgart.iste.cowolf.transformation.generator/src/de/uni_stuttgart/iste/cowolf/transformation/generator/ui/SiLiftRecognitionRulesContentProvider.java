package de.uni_stuttgart.iste.cowolf.transformation.generator.ui;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.sidiff.difference.rulebase.RecognitionRule;
import org.sidiff.difference.rulebase.RuleBase;
import org.sidiff.difference.rulebase.RuleBaseItem;
import org.sidiff.difference.rulebase.extension.IRuleBase;

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
		if ((ruleBases instanceof IRuleBase[])
				|| (ruleBases instanceof RuleBase[])) {
			return (Object[]) ruleBases;
		}

		return new Object[0];
	}

	@Override
	public Object[] getChildren(Object parentElement) {

		Iterable<RuleBaseItem> ruleBaseItems = null;

		if (parentElement instanceof IRuleBase) {
			ruleBaseItems = ((IRuleBase) parentElement).getAllRuleBaseItems();
		} else if (parentElement instanceof RuleBase) {
			ruleBaseItems = ((RuleBase) parentElement).getItems();
		}

		if (ruleBaseItems != null) {

			List<RecognitionRule> recognitionRules = new ArrayList<RecognitionRule>();

			for (RuleBaseItem ruleBaseItem : ruleBaseItems) {

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

		Object[] children = this.getChildren(element);

		return children.length > 0;

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
