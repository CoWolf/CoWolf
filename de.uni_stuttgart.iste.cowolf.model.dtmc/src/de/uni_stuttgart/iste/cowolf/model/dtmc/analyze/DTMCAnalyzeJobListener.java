/**
 *
 */
package de.uni_stuttgart.iste.cowolf.model.dtmc.analyze;

import java.io.ByteArrayInputStream;
import java.util.Map.Entry;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.IJobChangeListener;
import org.eclipse.emf.ecore.resource.Resource;

import de.uni_stuttgart.iste.cowolf.model.AnalysisResultUtil;
import de.uni_stuttgart.iste.cowolf.model.IAnalysisListener;
import de.uni_stuttgart.iste.cowolf.model.dtmc.State;

/**
 * @author philipp
 *
 */
public class DTMCAnalyzeJobListener implements IJobChangeListener {

	private final IAnalysisListener listener;

	public DTMCAnalyzeJobListener(final IAnalysisListener listener) {
		this.listener = listener;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.core.runtime.jobs.IJobChangeListener#aboutToRun(org.eclipse.core.runtime.jobs.IJobChangeEvent)
	 */
	@Override
	public void aboutToRun(final IJobChangeEvent event) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see org.eclipse.core.runtime.jobs.IJobChangeListener#awake(org.eclipse.core.runtime.jobs.IJobChangeEvent)
	 */
	@Override
	public void awake(final IJobChangeEvent event) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see org.eclipse.core.runtime.jobs.IJobChangeListener#done(org.eclipse.core.runtime.jobs.IJobChangeEvent)
	 */
	@Override
	public void done(final IJobChangeEvent event) {
		if (!(event.getJob() instanceof DTMCAnalyzeJob)) {
			return;
		}
		if (!event.getResult().isOK()) {
			// no error handling yet.
		}
		DTMCAnalyzeJob job = (DTMCAnalyzeJob) event.getJob();

		Resource resource = job.getModel();

		IFile modelfile = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(resource.getURI().toPlatformString(true)));

		IFile resultfile = ResourcesPlugin.getWorkspace().getRoot().getFile(modelfile.getFullPath().addFileExtension("analysis.html"));
		
		StringBuilder sb = new StringBuilder();
		sb.append("<h1>PRISM Analysis Results for DTMC</h1>\n\n");
		
		if (job.getAnalysis().size() > 0) {
			sb.append("<h2>Reachability Analysis</h2>\n\n");
			
			sb.append("<table>\n")
			  .append("<thead>\n")
			  .append("<tr><th>State</th><th>Probability</th></tr>\n")
			  .append("</thead>\n")
			  .append("<tbody>\n");

			for(Entry<Object, String> entry : job.getAnalysis().entrySet()) {
				String key = "";
				if (entry.getKey() instanceof State) {
					key = "State: <b>" + ((State) entry.getKey()).getName() + "</b>";
				} else if (entry.getKey() instanceof String) {
					key = "Label: <b>" + (String) entry.getKey() + "</b>";
				}
				sb.append("  <tr>\n")
				  .append("    <td>" + key + "</td>\n")
				  .append("    <td>" + entry.getValue().toString() + "</td>\n")
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (this.listener != null) {
			this.listener.finished(resource, resultfile);
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.core.runtime.jobs.IJobChangeListener#running(org.eclipse.core.runtime.jobs.IJobChangeEvent)
	 */
	@Override
	public void running(final IJobChangeEvent event) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see org.eclipse.core.runtime.jobs.IJobChangeListener#scheduled(org.eclipse.core.runtime.jobs.IJobChangeEvent)
	 */
	@Override
	public void scheduled(final IJobChangeEvent event) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see org.eclipse.core.runtime.jobs.IJobChangeListener#sleeping(org.eclipse.core.runtime.jobs.IJobChangeEvent)
	 */
	@Override
	public void sleeping(final IJobChangeEvent event) {
		// TODO Auto-generated method stub

	}

}
