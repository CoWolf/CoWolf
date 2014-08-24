package de.uni_stuttgart.iste.cowolf.transformation.generator.ui;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Spinner;

public class SpinnerCellEditor extends CellEditor {
	private Spinner spinner;

	public SpinnerCellEditor(Composite parent) {
		super(parent, SWT.NONE);
	}

	@Override
	protected Control createControl(Composite parent) {
		spinner = new Spinner(parent, SWT.NONE);
		spinner.setMinimum(0);
		spinner.setIncrement(1);
		spinner.setMaximum(99999);
		return spinner;
	}

	@Override
	protected Object doGetValue() {
		return spinner.getSelection();
	}

	@Override
	protected void doSetFocus() {
		spinner.setFocus();

	}

	@Override
	protected void doSetValue(Object value) {
		spinner.setSelection((Integer) value);

	}
}