package de.uni_stuttgart.iste.cowolf.model.activity_diagram.emf.presentation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;

import de.uni_stuttgart.iste.cowolf.model.activity_diagram.emf.presentation.Activity_diagramModelWizard;

public class Activity_diagramModelWizardExtension extends Activity_diagramModelWizard {
	@Override
	 protected Collection<String> getInitialObjectNames() {
	  if (initialObjectNames == null) {
	   initialObjectNames = new ArrayList<String>();
	   for (EClassifier eClassifier : activity_diagramPackage.getEClassifiers()) {
	    if (eClassifier instanceof EClass) {
	     EClass eClass = (EClass)eClassifier;
	     if (!eClass.isAbstract() && eClass.getName().equalsIgnoreCase("ActivityDiagram")) {
	      initialObjectNames.add(eClass.getName());
	     }
	    }
	   }
	   Collections.sort(initialObjectNames, CommonPlugin.INSTANCE.getComparator());
	  }
	  return initialObjectNames;
	 }
}
