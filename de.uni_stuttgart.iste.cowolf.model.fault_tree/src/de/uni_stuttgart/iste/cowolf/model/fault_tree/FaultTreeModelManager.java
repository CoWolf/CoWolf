package de.uni_stuttgart.iste.cowolf.model.fault_tree;

import java.util.Map;

import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.resource.Resource;

import de.uni_stuttgart.iste.cowolf.model.AbstractQoSModelManager;
import de.uni_stuttgart.iste.cowolf.model.IAnalysisListener;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.analyze.FaultTreeAnalyzeJob;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.analyze.FaultTreeAnalyzeJobListener;

public class FaultTreeModelManager extends AbstractQoSModelManager {
	
	public static final String PARAM_PATH_TO_XFTA = "pathToXFTA";

	@Override
	public String analyze(Resource model, Map<String, Object> parameters,
			final IAnalysisListener listener) {
		final FaultTreeAnalyzeJob job = new FaultTreeAnalyzeJob(model,
				parameters, listener);
		job.addJobChangeListener(new FaultTreeAnalyzeJobListener());
		job.setPriority(Job.LONG);
		job.schedule();

		return null;
	}

	@Override
	public Class<?> getManagedClass() {
		return FaultTree.class;
	}

	@Override
	public String getModelName() {
		return "FaultTree";
	}

	@Override
	public String getModelNamespace() {
		return FaultTreePackage.eNS_URI;
	}
}
