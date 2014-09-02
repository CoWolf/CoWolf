package de.uni_stuttgart.iste.cowolf.evolution.recognitionrules.generator;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.sidiff.difference.rulebase.builder.RuleBaseBuilder;

/**
 * 
 * Generates the recognition rules that are needed for the evolution of two
 * model versions.
 * 
 * @author Rene Trefft
 *
 */
public class RecognitionRulesGenerator {

	/**
	 * 
	 * Generates the recognition rules from the edit rules in all available SiLift
	 * rulebase projects.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
RuleBaseBuilder ruleBaseBuilder = new RuleBaseBuilder();

		// Uses reflection to invoke private build method in SiLift
		// RuleBaseBuilder bundle
		try {
			Method recognitionRulesFullBuildMethod = RuleBaseBuilder.class
					.getDeclaredMethod("fullBuild", IProgressMonitor.class);
			
			
			
			recognitionRulesFullBuildMethod.setAccessible(true);
			recognitionRulesFullBuildMethod.invoke(ruleBaseBuilder,
					new NullProgressMonitor());
		} catch (NoSuchMethodException | SecurityException
				| IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			e.printStackTrace();
		}
		

	}

}
