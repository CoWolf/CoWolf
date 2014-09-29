package de.uni_stuttgart.iste.cowolf.model.sequence_diagram;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.internal.impl.PackageImpl;

import de.uni_stuttgart.iste.cowolf.model.AbstractArchitectureModelManager;

public class Sequence_DiagramModelManager extends AbstractArchitectureModelManager{

	@Override
	public java.lang.Class<?> getManagedClass() {
		return Package.class;
	}

	@Override
	public String getModelName() {
		return "Sequence Diagram";
	}

	@Override
	public String getModelNamespace() {
		return Sequence_diagramPackage.eNS_URI;
	}

	@Override
	public String getFileExtension() {
		return "sequence_diagram";
	}
	
	@Override
	public EObject getRootObject(Resource resource) {
		Interaction interaction = null;

		EList<PackageableElement> pack = ((PackageImpl) resource
				.getContents().get(0)).getPackagedElements();
		for (PackageableElement element : pack) {
			if (element instanceof Interaction) {
				interaction = (Interaction) element;
			}
		}
		return interaction;
	}
	
	
}
