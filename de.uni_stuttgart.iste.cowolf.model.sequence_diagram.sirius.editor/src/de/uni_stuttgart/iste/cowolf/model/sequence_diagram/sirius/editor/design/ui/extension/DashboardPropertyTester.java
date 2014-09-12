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
package de.uni_stuttgart.iste.cowolf.model.sequence_diagram.sirius.editor.design.ui.extension;

import org.eclipse.core.expressions.PropertyTester;

import de.uni_stuttgart.iste.cowolf.model.sequence_diagram.sirius.editor.design.services.DashboardServices;

/**
 * Check if dashboards exist (dashboard viewpoint is activated and the representation was created).
 * 
 * @author Melanie Bats <a href="mailto:melanie.bats@obeo.fr">melanie.bats@obeo.fr</a>
 */
public class DashboardPropertyTester extends PropertyTester {

	public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
		DashboardServices service = new DashboardServices();
		return !service.getUmlModelsWithDashboard().isEmpty();
	}
}
