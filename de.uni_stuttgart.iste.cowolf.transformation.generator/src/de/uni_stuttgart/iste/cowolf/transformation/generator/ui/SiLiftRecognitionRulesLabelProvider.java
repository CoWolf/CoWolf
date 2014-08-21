package de.uni_stuttgart.iste.cowolf.transformation.generator.ui;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;
import org.sidiff.difference.rulebase.RecognitionRule;
import org.sidiff.difference.rulebase.extension.IRuleBase;

/**
 * 
 * @author Rene Trefft
 *
 */
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

	// private URI transformPlatformResourceToPlatformPluginURI(URI uri) {
	//
	// if (uri.isPlatformResource()) {
	// return URI.createURI(uri.toString().replaceFirst(
	// "platform:/resource", "platform:/plugin"));
	// }
	//
	// return uri;
	//
	// }

	/**
	 * TODO error handling if recognition rule reference in rule base file is
	 * invalid
	 */
	@Override
	public String getText(Object element) {

		if (element instanceof IRuleBase) {

			IRuleBase ruleBase = (IRuleBase) element;
			return ruleBase.getName();

		} else if (element instanceof RecognitionRule) {

			RecognitionRule recognitionRule = (RecognitionRule) element;

			return RecognitionRuleUtil.getRecognitionRuleName(recognitionRule);

			// TODO
			// return "ERROR: Rule "
			// + recognitionRule.getRecognitionMainUnit().getName()
			// + " is invalid or was not found.";

		}

		return null;

	}
}
