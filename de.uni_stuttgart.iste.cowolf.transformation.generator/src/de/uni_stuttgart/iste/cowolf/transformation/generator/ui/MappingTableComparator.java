package de.uni_stuttgart.iste.cowolf.transformation.generator.ui;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerComparator;

import de.uni_stuttgart.iste.cowolf.transformation.model.Mapping;


public class MappingTableComparator extends ViewerComparator {

	/**
	 * TODO
	 */
	@Override
	public int compare(Viewer viewer, Object e1, Object e2) {
		Mapping m1 = (Mapping) e1;
		Mapping m2 = (Mapping) e2;
		
		return super.compare(viewer, e1, e2);
	}
	
}
