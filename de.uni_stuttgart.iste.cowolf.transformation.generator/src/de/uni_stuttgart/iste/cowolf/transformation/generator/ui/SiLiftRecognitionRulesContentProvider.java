package de.uni_stuttgart.iste.cowolf.transformation.generator.ui;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

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
		return this.getChildren(ruleBases);
	}

	@Override
	public Object[] getChildren(Object parentElement) {

		if (parentElement instanceof SiLiftRulebase) {
			return ((SiLiftRulebase) parentElement).getRecognitionRules();
		}

		return new Object[0];

	}

	@Override
	public Object getParent(Object element) {

		if (element instanceof SiLiftRecognitionRule) {
			return ((SiLiftRecognitionRule) element).getRulebase();
		}

		return null;

	}

	@Override
	public boolean hasChildren(Object element) {
		if (element instanceof SiLiftRulebase) {

			int numRecognitionRules = ((SiLiftRulebase) element)
					.getRecognitionRules().length;

			return numRecognitionRules > 0;
		}

		return false;
	}
}
