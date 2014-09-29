package de.uni_stuttgart.iste.cowolf.transformation.faulttree_ctmc;

import de.uni_stuttgart.iste.cowolf.model.ctmc.CTMC;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTree;
import de.uni_stuttgart.iste.cowolf.transformation.AbstractTransformationManager;

/**
 * 
 * @author Jonas Scheurich
 * 
 * Reverse Direction (CTMC -> FaultTree) not implemented
 *
 */
public class FaultTreeCTMCTransformationManager extends AbstractTransformationManager{

	@Override
	public Class<?> getManagedClass1() {
		return FaultTree.class;
	}

	@Override
	public Class<?> getManagedClass2() {
		return CTMC.class;
	}

	@Override
	protected String getKey() {
		return "faulttree_ctmc";
	}

	/**
	 * Reverse Direction (CTMC -> FaultTree) not implemented
	 */
	@Override
	protected String getReverseKey() {
		return "ctmc_faulttree";
	}
	
	@Override
	public boolean isManaged(Class<?> source, Class<?> target) {

		if (getManagedClass1().isAssignableFrom(source)
				&& getManagedClass2().isAssignableFrom(target)) {
			return true;
		}

		return false;
	}

}
