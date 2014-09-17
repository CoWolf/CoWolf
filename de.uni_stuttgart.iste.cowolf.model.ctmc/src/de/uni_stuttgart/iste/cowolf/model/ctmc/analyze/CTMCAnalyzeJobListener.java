/**
 *
 */
package de.uni_stuttgart.iste.cowolf.model.ctmc.analyze;

import java.io.ByteArrayInputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.IJobChangeListener;
import org.eclipse.emf.ecore.resource.Resource;

import de.uni_stuttgart.iste.cowolf.model.AnalysisResultUtil;
import de.uni_stuttgart.iste.cowolf.model.IAnalysisListener;
import de.uni_stuttgart.iste.cowolf.model.ctmc.analyze.CTMCAnalyzeJob.Result;

/**
 * @author philipp
 *
 */
public class CTMCAnalyzeJobListener implements IJobChangeListener {

	private final IAnalysisListener listener;

	public CTMCAnalyzeJobListener(final IAnalysisListener listener) {
		this.listener = listener;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.core.runtime.jobs.IJobChangeListener#aboutToRun(org.eclipse
	 * .core.runtime.jobs.IJobChangeEvent)
	 */
	@Override
	public void aboutToRun(final IJobChangeEvent event) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.core.runtime.jobs.IJobChangeListener#awake(org.eclipse.core
	 * .runtime.jobs.IJobChangeEvent)
	 */
	@Override
	public void awake(final IJobChangeEvent event) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.core.runtime.jobs.IJobChangeListener#done(org.eclipse.core
	 * .runtime.jobs.IJobChangeEvent)
	 */
	@Override
	public void done(final IJobChangeEvent event) {
		if (!(event.getJob() instanceof CTMCAnalyzeJob)) {
			return;
		}
		if (!event.getResult().isOK()) {
			// no error handling yet.
		}
		CTMCAnalyzeJob job = (CTMCAnalyzeJob) event.getJob();

		Resource resource = job.getModel();

		IFile modelfile = ResourcesPlugin.getWorkspace().getRoot()
				.getFile(new Path(resource.getURI().toPlatformString(true)));

		IFile resultfile = ResourcesPlugin.getWorkspace().getRoot()
					.getFile(modelfile.getFullPath().addFileExtension("analysis.html"));
		
		// When performing a verification, reachability and probability are
		// evaluated. When performing a simulation, only reachability is
		// evaluated.
		StringBuilder sb = new StringBuilder();
		sb.append("<h1>PRISM Analysis Results for CTMC</h1>\n\n");
		if (job.getAnalysis().size() > 0) {
			sb.append("<table>\n")
			  .append("<thead>\n")
			  .append("<tr><th>Property</th><th>Description</th><th>Result</th></tr>\n")
			  .append("</thead>\n")
			  .append("<tbody>\n");

			for (Result entry : job.getAnalysis()) {
				sb.append("  <tr>\n")
				  .append("    <td><pre>" + entry.property + "</pre></td>\n")
				  .append("    <td>" + entry.name + "</td>\n")
				  .append("    <td>" + entry.value + "</td>\n")
				  .append("  </tr>\n");
			}

			sb.append("</tbody>\n")
			  .append("</table>");
		} else {
			sb.append("<p>No analysis results.</p>");
		}

		try {
			String html = AnalysisResultUtil.encapsulateHTML(sb.toString());
			
			ByteArrayInputStream in = new ByteArrayInputStream(html.getBytes());

			if (resultfile.exists()) {
				resultfile.setContents(in, true, false, null);
			} else {
				resultfile.create(in, true, null);
			}

		} catch (CoreException e) {
			System.out.println("Error saving result to html. Is result html file from previous run still open?");
		}
		
		if (this.listener != null) {
			this.listener.finished(resource, resultfile);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.core.runtime.jobs.IJobChangeListener#running(org.eclipse.
	 * core.runtime.jobs.IJobChangeEvent)
	 */
	@Override
	public void running(final IJobChangeEvent event) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.core.runtime.jobs.IJobChangeListener#scheduled(org.eclipse
	 * .core.runtime.jobs.IJobChangeEvent)
	 */
	@Override
	public void scheduled(final IJobChangeEvent event) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.core.runtime.jobs.IJobChangeListener#sleeping(org.eclipse
	 * .core.runtime.jobs.IJobChangeEvent)
	 */
	@Override
	public void sleeping(final IJobChangeEvent event) {
		// TODO Auto-generated method stub

	}

}
