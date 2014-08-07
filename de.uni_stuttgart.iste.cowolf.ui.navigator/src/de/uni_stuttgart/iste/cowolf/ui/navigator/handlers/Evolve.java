package de.uni_stuttgart.iste.cowolf.ui.navigator.handlers;

import javax.swing.JOptionPane;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.HandlerEvent;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import de.uni_stuttgart.iste.cowolf.ui.navigator.externalizedStrings.Messages;

public class Evolve extends AbstractHandler implements IHandler{
 
	public void addHandlerListener(IHandlerListener handlerListener) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		JOptionPane.showMessageDialog(null, Messages.Evolve_evolve_menu);
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
		return true;
	}

	@Override
	public void removeHandlerListener(IHandlerListener handlerListener) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setEnabled(Object evaluationContext) {
		HandlerEvent handlerEvent = new HandlerEvent(this, true, false);
		fireHandlerChanged(handlerEvent);
		
	}


}
