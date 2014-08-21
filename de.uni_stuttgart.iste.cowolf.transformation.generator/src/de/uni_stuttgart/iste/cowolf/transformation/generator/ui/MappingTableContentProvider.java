package de.uni_stuttgart.iste.cowolf.transformation.generator.ui;

import java.util.Collection;

import org.eclipse.jface.viewers.ArrayContentProvider;

/**
 * 
 * @author Rene Trefft
 *
 */
public class MappingTableContentProvider extends ArrayContentProvider {

	@Override
	public Object[] getElements(Object inputElement) {
		if (inputElement instanceof Collection<?>) {
			return super.getElements(inputElement);
		}
		return new Object[0];
	}

}
