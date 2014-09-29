package de.uni_stuttgart.iste.cowolf.model.dtmc;

import java.util.Map;

import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.resource.Resource;

import de.uni_stuttgart.iste.cowolf.model.AbstractQoSModelManager;
import de.uni_stuttgart.iste.cowolf.model.IAnalysisListener;
import de.uni_stuttgart.iste.cowolf.model.dtmc.analyze.DTMCAnalyzeJob;
import de.uni_stuttgart.iste.cowolf.model.dtmc.analyze.DTMCAnalyzeJobListener;

public class DTMCModelManager extends AbstractQoSModelManager {

	@Override
	public String analyze(final Resource model,
			final Map<String, Object> parameters, final IAnalysisListener listener) {

		// TODO Add return values
		final DTMCAnalyzeJob job = new DTMCAnalyzeJob(model, parameters);
		job.addJobChangeListener(new DTMCAnalyzeJobListener(listener));
		job.setPriority(Job.LONG);
		job.setUser(true);
		job.schedule();
		return null;
	}

	@Override
	public Class<?> getManagedClass() {
		return DTMC.class;
	}

	@Override
	public String getModelName() {
		return "dtmc";
	}
	
	@Override
	public String getModelNamespace() {
		return DTMCPackage.eNS_URI;
	}
	
	@Override
	public String getFileExtension() {
		return "dtmc";
	}
}
