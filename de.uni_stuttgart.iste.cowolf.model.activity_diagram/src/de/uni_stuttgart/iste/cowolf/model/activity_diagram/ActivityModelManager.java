package de.uni_stuttgart.iste.cowolf.model.activity_diagram;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import de.uni_stuttgart.iste.cowolf.model.AbstractArchitectureModelManager;
import de.uni_stuttgart.iste.cowolf.model.ModelTypeInfo;
import de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.ActionImpl;
import de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.Activity_diagramPackageImpl;
import de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.AfterActionArrowImpl;
import de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.ArrowAfterJoinImpl;
import de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.ArrowAfterStartImpl;
import de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.DecisionArrowImpl;
import de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.DecisionImpl;
import de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.EndImpl;
import de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.JoinArrowImpl;
import de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.NodesImpl;
import de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.NodesWithoutJoinImpl;
import de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.ActivityDiagramImpl;
import de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.SplitArrowImpl;
import de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.SplitImpl;
import de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.StartImpl;

public class ActivityModelManager extends AbstractArchitectureModelManager {



	@Override
	public ModelTypeInfo getModelTypeInfo() {

		List<Class<?>> propercontents = new ArrayList<Class<?>>();

		// create the allowed EClasses
		propercontents.add(ActionImpl.class);
		propercontents.add(Activity_diagramPackageImpl.class);
		propercontents.add(AfterActionArrowImpl.class);
		propercontents.add(ArrowAfterJoinImpl.class);
		propercontents.add(ArrowAfterStartImpl.class);
		propercontents.add(DecisionArrowImpl.class);
		propercontents.add(DecisionImpl.class);
		propercontents.add(EndImpl.class);
		propercontents.add(JoinArrowImpl.class);
		propercontents.add(NodesImpl.class);
		propercontents.add(NodesWithoutJoinImpl.class);
		propercontents.add(ActivityDiagramImpl.class);
		propercontents.add(SplitArrowImpl.class);
		propercontents.add(SplitImpl.class);
		propercontents.add(StartImpl.class);

		ModelTypeInfo mti = new ModelTypeInfo("activity", propercontents, Activity_diagramPackage.eNS_URI);
		return mti;
	}

	@Override
	public boolean isManaged(Resource model) {
		if (model == null) {
			return false;
		}
		if (model.getContents() == null || model.getContents().isEmpty()) {
			return false;
		}
		for (EObject theEObject : model.getContents()) {
			// check if the current eobject is part of the allowed classes list
			boolean match = false;
			for (Class<?> theEClass : this.getModelTypeInfo().PROPER_CONTENTS) {
				if (theEObject.getClass() == theEClass) {
					match = true;
				}
			}
			// return false if the current theEObject dosn`t match to the items
			// in the theEClass list
			if (!match) {
				return false;
			}
		}
		return true;
	}

}
