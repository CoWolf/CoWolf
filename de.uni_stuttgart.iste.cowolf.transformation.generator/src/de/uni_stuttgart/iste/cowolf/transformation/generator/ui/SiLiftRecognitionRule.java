package de.uni_stuttgart.iste.cowolf.transformation.generator.ui;

public class SiLiftRecognitionRule {

	private SiLiftRulebase siLiftRulebase;

	private String name;
	private String id;
	private String description;

	public SiLiftRecognitionRule(String name, String id, String description,
			SiLiftRulebase rulebase) {
		this.siLiftRulebase = rulebase;
		this.name = name;
		this.id = id;
		this.description = description;
	}

	public String getName() {
		return this.name;
	}

	public String getId() {
		return this.id;
	}

	public String getDescription() {
		return this.description;
	}

	public SiLiftRulebase getRulebase() {
		return this.siLiftRulebase;
	}

}
