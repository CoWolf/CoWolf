package de.uni_stuttgart.iste.cowolf.model.ctmc.emf.presentation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;

public class CTMCModelWizardExtension extends CtmcModelWizard {
	@Override
	 protected Collection<String> getInitialObjectNames() {
	  if (initialObjectNames == null) {
	   initialObjectNames = new ArrayList<String>();
	   for (EClassifier eClassifier : ctmcPackage.getEClassifiers()) {
	    if (eClassifier instanceof EClass) {
	     EClass eClass = (EClass)eClassifier;
	     if (!eClass.isAbstract() && eClass.getName().equalsIgnoreCase("CTMC")) {
	      initialObjectNames.add(eClass.getName());
	     }
	    }
	   }
	   Collections.sort(initialObjectNames, CommonPlugin.INSTANCE.getComparator());
	  }
	  return initialObjectNames;
	 }
}
