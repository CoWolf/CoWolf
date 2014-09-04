package de.uni_stuttgart.iste.cowolf.model.component_diagram.emf.presentation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;

public class Component_diagramModelWizardExtension extends Component_diagramModelWizard {
	
	@Override
	protected Collection<String> getInitialObjectNames() {
		if (initialObjectNames == null) {
			initialObjectNames = new ArrayList<String>();
			for (EClassifier eClassifier : component_diagramPackage.getEClassifiers()) {
				if (eClassifier instanceof EClass) {
					EClass eClass = (EClass) eClassifier;
					if (!eClass.isAbstract() && eClass.getName().equalsIgnoreCase("Architecture")) {
						initialObjectNames.add(eClass.getName());
					}
				}
			}
			Collections.sort(initialObjectNames,
					CommonPlugin.INSTANCE.getComparator());
		}
		return initialObjectNames;
	}
}
