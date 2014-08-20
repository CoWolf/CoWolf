package de.uni_stuttgart.iste.cowolf.transformation.generator.ui;

import org.eclipse.emf.henshin.model.Unit;
import org.sidiff.difference.rulebase.RecognitionRule;

public class TransformationMapping {

	private RecognitionRule recognitionRule;
	
	private Unit unit;

	public TransformationMapping(RecognitionRule recognitionRule, Unit unit) {
		this.recognitionRule = recognitionRule;
		this.unit = unit;
	}
	
	
	/**
	 * @return the recognitionRule
	 */
	public RecognitionRule getRecognitionRule() {
		return recognitionRule;
	}

	/**
	 * @param recognitionRule the recognitionRule to set
	 */
	public void setRecognitionRule(RecognitionRule recognitionRule) {
		this.recognitionRule = recognitionRule;
	}

	/**
	 * @return the unit
	 */
	public Unit getUnit() {
		return unit;
	}

	/**
	 * @param unit the unit to set
	 */
	public void setUnit(Unit unit) {
		this.unit = unit;
	}
	 
	
}
