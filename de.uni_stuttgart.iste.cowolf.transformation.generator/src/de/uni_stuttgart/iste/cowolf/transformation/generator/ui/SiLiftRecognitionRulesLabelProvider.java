package de.uni_stuttgart.iste.cowolf.transformation.generator.ui;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.henshin.model.Module;
import org.eclipse.emf.henshin.model.resource.HenshinResourceSet;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;
import org.sidiff.difference.rulebase.RecognitionRule;
import org.sidiff.difference.rulebase.extension.IRuleBase;

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

				URI recognitionRulePlatformURI = recognitionModule.eResource()
						.getURI();

				System.out.println("+++" + recognitionRulePlatformURI);

				HenshinResourceSet rulesResourceSet = new HenshinResourceSet();

				// System.out.println("test1");
				//
				// Module module = (Module) EMFStorage
				// .eLoad(recognitionRulePlatformURI);

				Module module = rulesResourceSet.getModule(
						recognitionRulePlatformURI, true);

				System.out.println("test2");

				System.out.println("++++" + module.eAllContents().next());
				System.out.println("----" + module.eAllContents().next());
				// String recognitionRuleName = recognitionRulePlatformPath
				// .substring(
				// recognitionRulePlatformPath.lastIndexOf('/') + 1,
				// recognitionRulePlatformPath
				// .lastIndexOf("_execute"));
				return "sfdf";

			}
		}

		return null;

	}
}
