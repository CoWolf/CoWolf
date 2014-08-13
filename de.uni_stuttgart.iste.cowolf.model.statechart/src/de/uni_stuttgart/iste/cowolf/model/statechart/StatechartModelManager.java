package de.uni_stuttgart.iste.cowolf.model.statechart;

import java.util.ArrayList;
import java.util.List;

import de.uni_stuttgart.iste.cowolf.model.AbstractArchitectureModelManager;
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
