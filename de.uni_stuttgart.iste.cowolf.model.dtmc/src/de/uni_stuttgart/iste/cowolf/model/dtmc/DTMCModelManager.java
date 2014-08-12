package de.uni_stuttgart.iste.cowolf.model.dtmc;

import java.util.Map;

import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.resource.Resource;

import de.uni_stuttgart.iste.cowolf.model.IAnalysisListener;
import de.uni_stuttgart.iste.cowolf.model.IQoSModelManager;
import de.uni_stuttgart.iste.cowolf.model.ModelTypeInfo;
import de.uni_stuttgart.iste.cowolf.model.dtmc.analyze.DTMCAnalyzeJob;
import de.uni_stuttgart.iste.cowolf.model.dtmc.analyze.DTMCAnalyzeJobListener;

public class DTMCModelManager implements IQoSModelManager {

	public DTMCModelManager() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public ModelTypeInfo getModelTypeInfo() {
		// TODO Auto-generated method stub
		return null;
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
			return (model.getContents().get(0) instanceof Root);
	}

}