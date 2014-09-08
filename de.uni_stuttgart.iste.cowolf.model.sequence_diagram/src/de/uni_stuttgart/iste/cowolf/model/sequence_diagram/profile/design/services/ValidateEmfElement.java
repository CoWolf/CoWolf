/*******************************************************************************
 * Copyright (c) 2013 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package de.uni_stuttgart.iste.cowolf.model.sequence_diagram.profile.design.services;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.edit.ui.action.ValidateAction;

/**
 * Used to invoke EMF validator.
 * 
 * @author Mohamed-Lamine BOUKHANOUFA <a
 *         href="mailto:mohamed-lamine.boukhanoufa@obeo.fr"
 *         >mohamed-lamine.boukhanoufa@obeo.fr</a>
 */
public class ValidateEmfElement extends ValidateAction {
	boolean diagnosticResult = false;

	/**
	 * 
	 */
	public ValidateEmfElement() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void handleDiagnostic(Diagnostic diagnostic) {
		// TODO Auto-generated method stub
		super.handleDiagnostic(diagnostic);
		diagnosticResult = diagnostic.getSeverity() == Diagnostic.OK;
	}

	public boolean getDiagnisticResult() {
		return diagnosticResult;
	}
}
