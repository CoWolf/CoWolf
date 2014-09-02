package de.uni_stuttgart.iste.cowolf.evolution.recognitionrules.generator;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.sidiff.difference.rulebase.builder.RuleBaseBuilder;

public class RecognitionRulesGeneratorActivator implements BundleActivator {

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext
	 * )
	 */
	public void start(BundleContext bundleContext) throws Exception {
		RecognitionRulesGeneratorActivator.context = bundleContext;

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

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		RecognitionRulesGeneratorActivator.context = null;
	}

}
