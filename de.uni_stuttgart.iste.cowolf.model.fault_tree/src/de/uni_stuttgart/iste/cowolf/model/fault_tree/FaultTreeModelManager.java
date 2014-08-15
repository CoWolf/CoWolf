package de.uni_stuttgart.iste.cowolf.model.fault_tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.resource.Resource;

import de.uni_stuttgart.iste.cowolf.model.AbstractQoSModelManager;
import de.uni_stuttgart.iste.cowolf.model.IAnalysisListener;
import de.uni_stuttgart.iste.cowolf.model.ModelTypeInfo;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.analyze.FaultTreeAnalyzeJob;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.analyze.FaultTreeAnalyzeJobListener;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.RootImpl;

public class FaultTreeModelManager extends AbstractQoSModelManager {
	
	public static final String PARAM_PATH_TO_XFTA = "pathToXFTA";

	@SuppressWarnings("rawtypes")
	@Override
	public ModelTypeInfo getModelTypeInfo() {
		String metaModelName = "FaultTree";
		List<Class> properContents = new ArrayList<>();
		properContents.add(RootImpl.class);
		ModelTypeInfo modelTypeInfo = new ModelTypeInfo(metaModelName, properContents);
		return modelTypeInfo;
	}

	@Override
	public boolean isManaged(Resource model) {
		return true;
	}

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
}
