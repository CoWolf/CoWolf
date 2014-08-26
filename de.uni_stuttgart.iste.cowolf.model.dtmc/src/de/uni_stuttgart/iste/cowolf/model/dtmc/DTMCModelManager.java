package de.uni_stuttgart.iste.cowolf.model.dtmc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.resource.Resource;
import de.uni_stuttgart.iste.cowolf.model.AbstractQoSModelManager;
import de.uni_stuttgart.iste.cowolf.model.IAnalysisListener;
import de.uni_stuttgart.iste.cowolf.model.ModelTypeInfo;
import de.uni_stuttgart.iste.cowolf.model.dtmc.analyze.DTMCAnalyzeJob;
import de.uni_stuttgart.iste.cowolf.model.dtmc.analyze.DTMCAnalyzeJobListener;
import de.uni_stuttgart.iste.cowolf.model.dtmc.impl.DTMCImpl;
import de.uni_stuttgart.iste.cowolf.model.dtmc.impl.LabelImpl;
import de.uni_stuttgart.iste.cowolf.model.dtmc.impl.StateImpl;

public class DTMCModelManager extends AbstractQoSModelManager {

	public DTMCModelManager() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public ModelTypeInfo getModelTypeInfo() {
		
		List<Class<?>> properContents = new ArrayList<Class<?>>();

		// create the allowed EClasses
		properContents.add(Transition.class);
		properContents.add(StateImpl.class);
		properContents.add(LabelImpl.class);
		properContents.add(DTMCImpl.class);
		ModelTypeInfo mti = new ModelTypeInfo("dtmc", properContents, DTMCPackage.eNS_URI);
		
		return mti;
	}

	@Override
	public String analyze(final Resource model,
			final Map<String, Object> parameters, final IAnalysisListener listener) {

		// TODO Add return values
		final DTMCAnalyzeJob job = new DTMCAnalyzeJob(model, parameters);
		job.addJobChangeListener(new DTMCAnalyzeJobListener(listener));
		job.setPriority(Job.LONG);
		job.schedule();
		return null;
	}

	@Override
	public boolean isManaged(final Resource model) {
		if (model == null || model.getContents() == null
				|| model.getContents().size() == 0)
			return false;
		else
			return (model.getContents().get(0) instanceof DTMC);

	}
	
}
