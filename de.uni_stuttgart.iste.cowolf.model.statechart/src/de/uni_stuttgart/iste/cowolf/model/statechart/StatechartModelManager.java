package de.uni_stuttgart.iste.cowolf.model.statechart;

import java.util.ArrayList;
import java.util.List;

import de.uni_stuttgart.iste.cowolf.model.AbstractArchitectureModelManager;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import de.uni_stuttgart.iste.cowolf.model.ModelTypeInfo;
import de.uni_stuttgart.iste.cowolf.model.statechart.Statechart.impl.BooleanExpressionImpl;
import de.uni_stuttgart.iste.cowolf.model.statechart.Statechart.impl.CompositeStateImpl;
import de.uni_stuttgart.iste.cowolf.model.statechart.Statechart.impl.EventImpl;
import de.uni_stuttgart.iste.cowolf.model.statechart.Statechart.impl.GuardImpl;
import de.uni_stuttgart.iste.cowolf.model.statechart.Statechart.impl.StateImpl;
import de.uni_stuttgart.iste.cowolf.model.statechart.Statechart.impl.StateMachineImpl;
import de.uni_stuttgart.iste.cowolf.model.statechart.Statechart.impl.StateVertexImpl;
import de.uni_stuttgart.iste.cowolf.model.statechart.Statechart.impl.TransitionImpl;


public class StatechartModelManager extends AbstractArchitectureModelManager {
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
			for (Class theEClass : this.getModelTypeInfo().PROPER_CONTENTS) {
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


	@Override
	public ModelTypeInfo getModelTypeInfo() {

		List<Class<?>> propercontents = new ArrayList<Class<?>>();

		// create the allowed EClasses
		propercontents.add(BooleanExpressionImpl.class);
		propercontents.add(CompositeStateImpl.class);
		propercontents.add(EventImpl.class);
		propercontents.add(GuardImpl.class);
		propercontents.add(StateImpl.class);
		propercontents.add(StateMachineImpl.class);
		propercontents.add(StateVertexImpl.class);
		propercontents.add(TransitionImpl.class);
		ModelTypeInfo mti = new ModelTypeInfo("statechart", propercontents);
		return mti;
	}
}
