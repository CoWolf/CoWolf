package de.uni_stuttgart.iste.cowolf.transformation.generator.ui;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.TableViewer;

import de.uni_stuttgart.iste.cowolf.transformation.model.Mapping;

public class MappingPriorityEditingSupport extends EditingSupport {

	private final ColumnViewer viewer;
	private final SpinnerCellEditor cellEditor;
	private final TransformationMappingEditor editor;
	public MappingPriorityEditingSupport(ColumnViewer viewer, TransformationMappingEditor editor) {
		super(viewer);
		this.viewer = viewer;
		this.editor = editor;
		cellEditor = new SpinnerCellEditor(((TableViewer) viewer).getTable());
	}

	@Override
	protected CellEditor getCellEditor(Object viewer) {
		return cellEditor;
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
			((Mapping) element).setPriority((Integer) value);
			viewer.update(element, null);
			editor.newUnsavedChanges();
		}
	}

}
