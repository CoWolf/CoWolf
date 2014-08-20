package de.uni_stuttgart.iste.cowolf.transformation.generator.ui;

import java.util.Collections;
import java.util.List;

import org.eclipse.jface.viewers.ArrayContentProvider;

public class MappingTableContentProvider extends ArrayContentProvider {

	@Override
	public Object[] getElements(Object inputElement) {
		
		return super.getElements((Collections) inputElement);
		
	}

	// @Override
	// public void dispose() {
	// // TODO Auto-generated method stub
	//
	// }
	//
	// @Override
	// public void inputChanged(Viewer viewer, Object oldInput, Object newInput)
	// {
	// // TODO Auto-generated method stub
	//
	// }
	//
	// @Override
	// public Object[] getElements(Object inputElement) {
	// // TODO Auto-generated method stub
	// return Map<RecognitionRule, Unit>;
	// }

}
