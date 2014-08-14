package de.uni_stuttgart.iste.cowolf.ui.navigator.handlers;

import javax.swing.JOptionPane;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import de.uni_stuttgart.iste.cowolf.ui.navigator.externalizedStrings.Messages;

public class CoEvolve extends AbstractHandler {
    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        System.out.println("Hallo");
        JOptionPane.showMessageDialog(null, Messages.CoEvolve_co_evolve_menu);
        // TODO Auto-generated method stub
        return null;
    }

}
