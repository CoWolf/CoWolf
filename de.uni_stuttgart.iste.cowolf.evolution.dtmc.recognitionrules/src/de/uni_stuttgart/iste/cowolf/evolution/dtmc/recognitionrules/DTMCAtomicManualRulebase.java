package de.uni_stuttgart.iste.cowolf.evolution.dtmc.recognitionrules;

import org.sidiff.difference.rulebase.extension.AbstractRuleBase;

public class DTMCAtomicManualRulebase extends AbstractRuleBase {

	public static final String BUNDLE_ID = "org.sidiff.ecore.recognitionrules.atomic";
	public static final String RULE_BASE_DIR = "rulebase";
	public static final String RULE_BASE_NAME = "EcoreAtomicManual";
	public static final String RULE_BASE_EXT = ".rulebase";
	
	public static final String EDIT_RULES_PLUGIN = "org.sidiff.ecore.editrules.atomic";
	
	@Override
	protected String getRuleBaseURI() {
		return "/" + BUNDLE_ID + "/" + RULE_BASE_DIR + "/" + RULE_BASE_NAME + RULE_BASE_EXT;
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