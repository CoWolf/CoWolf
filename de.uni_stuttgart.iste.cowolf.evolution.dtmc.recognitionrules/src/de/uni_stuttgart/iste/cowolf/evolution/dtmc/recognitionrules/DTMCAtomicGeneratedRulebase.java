package de.uni_stuttgart.iste.cowolf.evolution.dtmc.recognitionrules;

import org.sidiff.difference.rulebase.extension.AbstractRuleBase;

public class DTMCAtomicGeneratedRulebase extends AbstractRuleBase {

	public static final String BUNDLE_ID = "de.uni_stuttgart.iste.cowolf.evolution.dtmc.recognitionrules";
	public static final String RULE_BASE_DIR = "rulebase";
	public static final String RULE_BASE_NAME = "DTMCGenerated";
	public static final String RULE_BASE_EXT = ".rulebase";

	public static final String EDIT_RULES_PLUGIN = "de.uni_stuttgart.iste.cowolf.evolution.dtmc.editrules";

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