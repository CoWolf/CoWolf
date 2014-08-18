package de.uni_stuttgart.iste.cowolf.model.activity;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import de.uni_stuttgart.iste.cowolf.model.AbstractQoSModelManager;
import de.uni_stuttgart.iste.cowolf.model.IAnalysisListener;
import de.uni_stuttgart.iste.cowolf.model.ModelTypeInfo;
import de.uni_stuttgart.iste.cowolf.model.activity.impl.ActionImpl;
import de.uni_stuttgart.iste.cowolf.model.activity.impl.ActivityPackageImpl;
import de.uni_stuttgart.iste.cowolf.model.activity.impl.AfterActionArrowImpl;
import de.uni_stuttgart.iste.cowolf.model.activity.impl.ArrowAfterJoinImpl;
import de.uni_stuttgart.iste.cowolf.model.activity.impl.ArrowAfterStartImpl;
import de.uni_stuttgart.iste.cowolf.model.activity.impl.DecisionArrowImpl;
import de.uni_stuttgart.iste.cowolf.model.activity.impl.DecisionImpl;
import de.uni_stuttgart.iste.cowolf.model.activity.impl.EndImpl;
import de.uni_stuttgart.iste.cowolf.model.activity.impl.JoinArrowImpl;
import de.uni_stuttgart.iste.cowolf.model.activity.impl.NodesImpl;
import de.uni_stuttgart.iste.cowolf.model.activity.impl.NodesWithoutJoinImpl;
import de.uni_stuttgart.iste.cowolf.model.activity.impl.RootImpl;
import de.uni_stuttgart.iste.cowolf.model.activity.impl.SplitArrowImpl;
import de.uni_stuttgart.iste.cowolf.model.activity.impl.SplitImpl;
import de.uni_stuttgart.iste.cowolf.model.activity.impl.StartImpl;

public class ActivityModelManager extends AbstractQoSModelManager {

	@Override
	public String analyze(Resource model, Map<String, Object> parameters,
			IAnalysisListener listener) {
		// TODO write analyse method
		return null;
	}

	@Override
	public ModelTypeInfo getModelTypeInfo() {

		List<Class<?>> propercontents = new ArrayList<Class<?>>();

		// create the allowed EClasses
		propercontents.add(ActionImpl.class);
		propercontents.add(ActivityPackageImpl.class);
		propercontents.add(AfterActionArrowImpl.class);
		propercontents.add(ArrowAfterJoinImpl.class);
		propercontents.add(ArrowAfterStartImpl.class);
		propercontents.add(DecisionArrowImpl.class);
		propercontents.add(DecisionImpl.class);
		propercontents.add(EndImpl.class);
		propercontents.add(JoinArrowImpl.class);
		propercontents.add(NodesImpl.class);
		propercontents.add(NodesWithoutJoinImpl.class);
		propercontents.add(RootImpl.class);
		propercontents.add(SplitArrowImpl.class);
		propercontents.add(SplitImpl.class);
		propercontents.add(StartImpl.class);

		ModelTypeInfo mti = new ModelTypeInfo("activity", propercontents);
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
