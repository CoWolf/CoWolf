package de.uni_stuttgart.iste.cowolf.model.lqn.analysis;

import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.IJobChangeListener;

public class LQNAnalyzeJobListener implements IJobChangeListener{

	@Override
	public void aboutToRun(IJobChangeEvent event) {
	}

	@Override
	public void awake(IJobChangeEvent event) {
	}

	@Override
	public void done(IJobChangeEvent event) {
		if (!(event.getJob() instanceof LQNAnalyzeJob)) {
			return;
		}
		if (!event.getResult().isOK()) {
			// TODO Implement error handling
		}
		LQNAnalyzeJob lqnAnalyzeJob = (LQNAnalyzeJob) event
				.getJob();
		lqnAnalyzeJob.writeToResultFile();
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
