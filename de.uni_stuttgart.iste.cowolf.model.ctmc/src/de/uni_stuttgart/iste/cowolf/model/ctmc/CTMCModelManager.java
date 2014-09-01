package de.uni_stuttgart.iste.cowolf.model.ctmc;

import java.util.Map;

import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.resource.Resource;

import de.uni_stuttgart.iste.cowolf.model.AbstractQoSModelManager;
import de.uni_stuttgart.iste.cowolf.model.IAnalysisListener;
import de.uni_stuttgart.iste.cowolf.model.ctmc.analyze.CTMCAnalyzeJob;
import de.uni_stuttgart.iste.cowolf.model.ctmc.analyze.CTMCAnalyzeJobListener;

/**
 * 
 * @author Rene Trefft
 *
 */
public class CTMCModelManager extends AbstractQoSModelManager{
	
	@Override
	public String analyze(final Resource model,
			final Map<String, Object> parameters, final IAnalysisListener listener) {

		// TODO Add return values
		final CTMCAnalyzeJob job = new CTMCAnalyzeJob(model, parameters);
		job.addJobChangeListener(new CTMCAnalyzeJobListener(listener));
		job.setPriority(Job.LONG);
		job.schedule();
		return null;
	}

	@Override
	public Class<?> getManagedClass() {
		return CTMC.class;
	}

	@Override
	public String getModelName() {
		return "CTMC";
	}

	@Override
	public String getModelNamespace() {
		return CtmcPackage.eNS_URI;
	}
	
	@Override
	public String getFileExtension() {
		return "ctmc";
	}
}
