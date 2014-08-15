package de.uni_stuttgart.iste.cowolf.model.fault_tree.analyze;

import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.IJobChangeListener;

public class FaultTreeAnalyzeJobListener implements IJobChangeListener {

	public FaultTreeAnalyzeJobListener() {
	}

	@Override
	public void aboutToRun(IJobChangeEvent event) {
	}

	@Override
	public void awake(IJobChangeEvent event) {
	}

	@Override
	public void done(IJobChangeEvent event) {
		if (!(event.getJob() instanceof FaultTreeAnalyzeJob)) {
			return;
		}
		if (!event.getResult().isOK()) {
			// TODO Implement error handling
		}
		FaultTreeAnalyzeJob faultTreeAnalyzeJob = (FaultTreeAnalyzeJob) event
				.getJob();
		faultTreeAnalyzeJob.writeToResultFile();
	}

	@Override
	public void running(IJobChangeEvent event) {
	}

	@Override
	public void scheduled(IJobChangeEvent event) {
	}

	@Override
	public void sleeping(IJobChangeEvent event) {
	}
}
