package de.uni_stuttgart.iste.cowolf.evolution.ctmc.recognitionrules;

import org.sidiff.difference.rulebase.extension.AbstractRuleBase;

/**
 * 
 * @author Michael Zimmermann
 *
 */
public class CTMCGeneratedRulebase extends AbstractRuleBase {

	public static final String BUNDLE_ID = "de.uni_stuttgart.iste.cowolf.evolution.ctmc.recognitionrules";
	public static final String RULE_BASE_DIR = "rulebase";
	public static final String RULE_BASE_NAME = "CTMCGenerated";
	public static final String RULE_BASE_EXT = ".rulebase";

	public static final String EDIT_RULES_PLUGIN = "de.uni_stuttgart.iste.cowolf.evolution.ctmc.editrules";

	@Override
	protected String getRuleBaseURI() {
		return "/" + BUNDLE_ID + "/" + RULE_BASE_DIR + "/" + RULE_BASE_NAME
				+ RULE_BASE_EXT;
	}

	@Override
	protected String getRecognitionRulesPluginID() {
		return BUNDLE_ID;
	}

	@Override
	protected String getEditRulesPluginID() {
		return EDIT_RULES_PLUGIN;
	}

}
