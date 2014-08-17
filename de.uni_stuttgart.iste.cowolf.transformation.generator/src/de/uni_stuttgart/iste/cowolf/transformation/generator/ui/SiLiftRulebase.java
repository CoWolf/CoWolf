package de.uni_stuttgart.iste.cowolf.transformation.generator.ui;

public class SiLiftRulebase {

	private String name;

	private SiLiftRecognitionRule[] recognitionRules;

	public SiLiftRulebase(String name, SiLiftRecognitionRule[] recognitionRules) {
		this.name = name;
		this.recognitionRules = recognitionRules;
	}

	public SiLiftRecognitionRule[] getRecognitionRules() {
		return this.recognitionRules;
		// .toArray(new SiLiftRecognitionRule[this.recognitionRules.size()]);
	}

	private String getName() {
		return this.name;
	}

}
