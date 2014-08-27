package de.uni_stuttgart.iste.cowolf.transformation.component_diagram_fault_tree;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import de.uni_stuttgart.iste.cowolf.model.component_diagram.ComponentDiagram;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTree;
import de.uni_stuttgart.iste.cowolf.transformation.AbstractTransformationManager;
import de.uni_stuttgart.iste.cowolf.transformation.TransformationTypeInfo;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.resource.Resource;
import org.osgi.framework.Bundle;

/**
 * @author David K
 *
 */
public class ComponentDiagramFaultTreeTransformationManager extends AbstractTransformationManager {

	private static final String RULE_DIRECTORY = "de.uni_stuttgart.iste.cowolf.transformation.ctmc_dtmc.rules";
	/**
	 * Key for extension point identification.
	 */
	private final static String KEY = "componentdiagram_faulttree";
	private final static Class<?> FIRST_MODEL = ComponentDiagram.class;
	private final static Class<?> SECOND_MODEL = FaultTree.class;
	
	@Override
	public boolean isManaged(Resource source, Resource target) {
		if ((source == null) || (target == null)) {
			return false;
		}
		if ((source.getContents() == null) || source.getContents().isEmpty()
				|| (target.getContents() == null)
				|| target.getContents().isEmpty()) {
			return false;
		}

		return (((FIRST_MODEL.isAssignableFrom(source.getContents().get(0)
				.getClass())) && (SECOND_MODEL.isAssignableFrom(target
				.getContents().get(0).getClass()))) || ((SECOND_MODEL
				.isAssignableFrom(source.getContents().get(0).getClass())) && (FIRST_MODEL
				.isAssignableFrom(target.getContents().get(0).getClass()))));
	}

	@Override
	public TransformationTypeInfo getTransformationTypeInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String getKey() {
		return KEY;
	}

	@Override
	protected File getRuleDirectory() {
		Bundle root = Platform.getBundle(RULE_DIRECTORY);
		URL url = FileLocator.find(root, new Path(File.separator + "rules"
				+ File.separator), null);
		File ruleDirectory = null;
		try {
			url = FileLocator.toFileURL(url);
			ruleDirectory = new File(new java.net.URI(url.getProtocol(),
					url.getPath(), null));

		} catch (IOException | URISyntaxException e1) {
			System.out.println(e1);
			return null;
		}

		return ruleDirectory;
	}

}
