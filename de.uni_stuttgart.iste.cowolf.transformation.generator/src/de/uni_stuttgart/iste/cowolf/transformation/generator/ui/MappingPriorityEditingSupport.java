package de.uni_stuttgart.iste.cowolf.transformation.generator.ui;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.TableViewer;

import de.uni_stuttgart.iste.cowolf.transformation.model.Mapping;

public class MappingPriorityEditingSupport extends EditingSupport {

	private final SpinnerCellEditor CELL_EDITOR;
	private final TransformationMappingEditor EDITOR;
	public MappingPriorityEditingSupport(ColumnViewer viewer, TransformationMappingEditor editor) {
		super(viewer);
		this.EDITOR = editor;
		CELL_EDITOR = new SpinnerCellEditor(((TableViewer) viewer).getTable());
	}

	@Override
	protected CellEditor getCellEditor(Object viewer) {
		return CELL_EDITOR;
	}

	@Override
	protected boolean canEdit(Object element) {
		return true;
	}

	@Override
	protected Object getValue(Object element) {
		if (element instanceof Mapping) {
			return ((Mapping) element).getPriority();
		}
		return null;
	}

	@Override
	protected void setValue(Object element, Object value) {
		if (element instanceof Mapping) {
			
			Mapping mapping = (Mapping) element;
			Integer intValue= (Integer) value;
			
			if (!intValue.equals(mapping.getPriority())) {
				mapping.setPriority(intValue);
				getViewer().update(mapping, null);
				EDITOR.newUnsavedChanges();
			}	
			
		}
	}

}
