package de.uni_stuttgart.iste.cowolf.transformation.component_diagram_fault_tree;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.sidiff.difference.symmetric.SymmetricDifference;

import de.uni_stuttgart.iste.cowolf.model.component_diagram.Architecture;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTree;
import de.uni_stuttgart.iste.cowolf.transformation.AbstractTransformationManager;

/**
 * @author David K
 *
 */
public class ComponentDiagramFaultTreeTransformationManager extends AbstractTransformationManager {

	/**
	 * Key for extension point identification.
	 */
	private final static String KEY = "componentdiagram_faulttree";
	private final static String REVERSE_KEY = "faulttree_componentdiagram";
	private final static Class<?> FIRST_MODEL = Architecture.class;
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
	protected String getKey() {
		return KEY;
	}

	@Override
	public Class<?> getManagedClass1() {
		return FIRST_MODEL;
	}

	@Override
	public Class<?> getManagedClass2() {
		return SECOND_MODEL;
	}
	
	@Override
	public Resource transform(Resource oldSource, Resource source, Resource target, SymmetricDifference difference, URI fileURI) {
		CoWolfConstructTree.init(source, target);
		CoWolfConstructTree.run();
		return target;
	}

	@Override
	protected String getReverseKey() {
		return REVERSE_KEY;
	}
}
