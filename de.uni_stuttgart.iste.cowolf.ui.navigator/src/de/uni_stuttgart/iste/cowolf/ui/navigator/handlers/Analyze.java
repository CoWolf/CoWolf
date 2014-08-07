package de.uni_stuttgart.iste.cowolf.ui.navigator.handlers;

import javax.swing.JOptionPane;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;

import de.uni_stuttgart.iste.cowolf.ui.navigator.externalizedStrings.Messages;

public class Analyze implements IHandler {

	@Override
	public void addHandlerListener(final IHandlerListener handlerListener) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public Object execute(final ExecutionEvent event) throws ExecutionException {
		JOptionPane.showMessageDialog(null, Messages.Analyze_analyze_menu);
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	@Override
	public boolean isHandled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void removeHandlerListener(final IHandlerListener handlerListener) {
		// TODO Auto-generated method stub

	}

}
