package de.uni_stuttgart.iste.cowolf.model.fault_tree;

import java.util.Map;

import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.resource.Resource;

import de.uni_stuttgart.iste.cowolf.model.AbstractQoSModelManager;
import de.uni_stuttgart.iste.cowolf.model.IAnalysisListener;
import de.uni_stuttgart.iste.cowolf.model.ModelTypeInfo;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.analyze.FaultTreeAnalyzeJob;

public class FaultTreeModelManager extends AbstractQoSModelManager {

	@Override
	public ModelTypeInfo getModelTypeInfo() {
		return null;
	}

	@Override
	public boolean isManaged(Resource model) {
		return true;
	}

	@Override
	public String analyze(Resource model, Map<String, Object> parameters,
			final IAnalysisListener listener) {
		final FaultTreeAnalyzeJob job = new FaultTreeAnalyzeJob(model,
				parameters);
		job.setPriority(Job.LONG);
		job.schedule();

		return null;
	}
}
