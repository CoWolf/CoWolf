package de.uni_stuttgart.iste.cowolf.ui.navigator.handler;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandlerListener;

import de.uni_stuttgart.iste.cowolf.ui.wizards.NewProjectWizard;

public class NewProjectHandler extends AbstractHandler {

	@Override
	public void addHandlerListener(IHandlerListener handlerListener) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	  public Object execute(ExecutionEvent event) throws ExecutionException {
	 NewProjectWizard wizard = new NewProjectWizard();
	 wizard.init(null, null);
	    return null;
	  }

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isHandled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void removeHandlerListener(IHandlerListener handlerListener) {
		// TODO Auto-generated method stub

	}

}
