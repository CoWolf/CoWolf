package de.uni_stuttgart.iste.cowolf.transformation.generator.ui;

import org.eclipse.emf.henshin.model.Module;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;
import org.sidiff.difference.rulebase.RecognitionRule;
import org.sidiff.difference.rulebase.extension.IRuleBase;
import org.sidiff.difference.rulebase.impl.RecognitionRuleImpl;
import org.silift.common.util.emf.EMFStorage;

public class SiLiftRecognitionRulesLabelProvider implements ILabelProvider {

	@Override
	public void addListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isLabelProperty(Object element, String property) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void removeListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub

	}

	@Override
	public Image getImage(Object element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getText(Object element) {
		if (element instanceof IRuleBase) {
			IRuleBase ruleBase = (IRuleBase) element;
			return ruleBase.getName();
		} else if (element instanceof RecognitionRule) {
			RecognitionRule recognitionRule = (RecognitionRule) element;
			
			Module recognitionModule = recognitionRule.getRecognitionModule();

			if (recognitionModule != null) {

				String recognitionRulePlatformPath = recognitionModule
						.eResource().getURI().toString();
				String recognitionRuleName = recognitionRulePlatformPath
						.substring(
								recognitionRulePlatformPath.lastIndexOf('/') + 1,
								recognitionRulePlatformPath
										.lastIndexOf("_execute"));
				return recognitionRuleName;

			}
		}
		
		return null;
		
	}
}
