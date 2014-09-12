/*******************************************************************************
 * Copyright (c) 2014 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package de.uni_stuttgart.iste.cowolf.model.sequence_diagram.sirius.editor.design.ui.extension.commands;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.PlatformUI;

import de.uni_stuttgart.iste.cowolf.model.sequence_diagram.sirius.editor.design.ui.wizards.newmodel.UMLProjectWizard;

/**
 * Create a new UML project command handler.
 * 
 * @author Melanie Bats <a href="mailto:melanie.bats@obeo.fr">melanie.bats@obeo.fr</a>
 */
public class NewUmlProject extends AbstractHandler {

	public Object execute(ExecutionEvent event) throws ExecutionException {
		// Open the new uml project wizard
		IWizard wizard = new UMLProjectWizard();
		WizardDialog dialog = new WizardDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow()
				.getShell(), wizard);
		dialog.open();
		return null;
	}
}
