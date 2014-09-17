package de.uni_stuttgart.iste.cowolf.model.lqn;

import java.util.Map;

import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.resource.Resource;

import de.uni_stuttgart.iste.cowolf.model.AbstractQoSModelManager;
import de.uni_stuttgart.iste.cowolf.model.IAnalysisListener;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.LQN;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage;
import de.uni_stuttgart.iste.cowolf.model.lqn.analysis.LQNAnalyzeJob;
import de.uni_stuttgart.iste.cowolf.model.lqn.analysis.LQNAnalyzeJobListener;

public class LQNModelManager extends AbstractQoSModelManager {
	
	public static final String PARAM_PATH_TO_LQN_SOLVER = "pathToLqnSolver";

	@Override
	public Class<?> getManagedClass() {
		return LQN.class;
	}

	@Override
	public String getModelName() {
		return "LQN";
	}

	@Override
	public String getModelNamespace() {
		return LQNPackage.eNS_URI;
	}

	@Override
	public String getFileExtension() {
		return "lqn";
	}

	@Override
	public String analyze(Resource model, Map<String, Object> parameters,
			final IAnalysisListener listener) {
		final LQNAnalyzeJob job = new LQNAnalyzeJob(model,
				parameters, listener);
		job.addJobChangeListener(new LQNAnalyzeJobListener());
		job.setPriority(Job.LONG);
		job.schedule();

		return null;
	}
}