package de.uni_stuttgart.iste.cowolf.evolution.recognitionrules.generator;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URISyntaxException;
import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;
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
	 * Generates the recognition rules from the edit rules in all available
	 * SiLift rulebase projects.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Bundle bundle = Platform.getBundle("de.uni_stuttgart.iste.cowolf.evolution.recognitionrules.generator");
		URL fileURL = bundle.getEntry("files/test.txt");
		File file = null;
		try {
		    file = new File(FileLocator.resolve(fileURL).toURI());
		} catch (URISyntaxException e1) {
		    e1.printStackTrace();
		} catch (IOException e1) {
		    e1.printStackTrace();
		}
		
//		URL url;
//		try {
//		        url = new URL("platform:/plugin/de.uni_stuttgart.iste.cowolf.evolution.recognitionrules.generator/files/test.txt");
//		    InputStream inputStream = url.openConnection().getInputStream();
//		    BufferedReader in = new BufferedReader(new InputStreamReader(inputStream));
//		    String inputLine;
//		 
//		    while ((inputLine = in.readLine()) != null) {
//		        System.out.println(inputLine);
//		    }
//		 
//		    in.close();
//		 
//		} catch (IOException e) {
//		    e.printStackTrace();
//		}
		
		
		// RuleBaseBuilder ruleBaseBuilder = new RuleBaseBuilder();
		//
		// // Uses reflection to invoke private build method in SiLift
		// // RuleBaseBuilder bundle
		// try {
		// Method recognitionRulesFullBuildMethod = RuleBaseBuilder.class
		// .getDeclaredMethod("fullBuild", IProgressMonitor.class);
		//
		// recognitionRulesFullBuildMethod.setAccessible(true);
		// recognitionRulesFullBuildMethod.invoke(ruleBaseBuilder,
		// new NullProgressMonitor());
		// } catch (NoSuchMethodException | SecurityException
		// | IllegalAccessException | IllegalArgumentException
		// | InvocationTargetException e) {
		// e.printStackTrace();
		// }

	}

}
