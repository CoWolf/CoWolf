package de.uni_stuttgart.iste.cowolf.transformation.generator.ui;

import java.util.ArrayList;
import java.util.List;

public class SiLiftRulebases {

	List<SiLiftRulebase> rulebases;
	
	public SiLiftRulebases(List<SiLiftRulebase> rulebases) {
		this.rulebases = rulebases;
	}
	
	public SiLiftRulebases() {
		this.rulebases = new ArrayList<SiLiftRulebase>();
	}
	
	public List<SiLiftRulebase> getRulebases() {
		return rulebases;
	}
	
	
	
}
