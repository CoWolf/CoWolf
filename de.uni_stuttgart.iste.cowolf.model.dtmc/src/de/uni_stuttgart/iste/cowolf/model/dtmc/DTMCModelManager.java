package de.uni_stuttgart.iste.cowolf.model.dtmc;

import java.util.Map;

import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.EPackage;

import de.uni_stuttgart.iste.cowolf.model.IQoSModelManager;
import de.uni_stuttgart.iste.cowolf.model.ModelTypeInfo;
import de.uni_stuttgart.iste.cowolf.model.dtmc.analyse.DTMCAnalyseJob;

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
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String certificate(EPackage model, Map<String, Object> parameters) {

		// TODO Add return values
		final DTMCAnalyseJob job = new DTMCAnalyseJob(model, parameters);
		job.setPriority(Job.LONG);
		job.schedule();
		return null;
	}

}
