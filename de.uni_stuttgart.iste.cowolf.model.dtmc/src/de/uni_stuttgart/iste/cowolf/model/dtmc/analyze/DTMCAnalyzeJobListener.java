/**
 * 
 */
package de.uni_stuttgart.iste.cowolf.model.dtmc.analyze;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map.Entry;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.URIUtil;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.IJobChangeListener;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

import de.uni_stuttgart.iste.cowolf.core.AnalysisListener;
import de.uni_stuttgart.iste.cowolf.model.dtmc.State;

/**
 * @author philipp
 *
 */
public class DTMCAnalyzeJobListener implements IJobChangeListener {
	
	private final AnalysisListener listener;
	
	public DTMCAnalyzeJobListener(AnalysisListener listener) {
		this.listener = listener;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.core.runtime.jobs.IJobChangeListener#aboutToRun(org.eclipse.core.runtime.jobs.IJobChangeEvent)
	 */
	@Override
	public void aboutToRun(IJobChangeEvent event) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see org.eclipse.core.runtime.jobs.IJobChangeListener#awake(org.eclipse.core.runtime.jobs.IJobChangeEvent)
	 */
	@Override
	public void awake(IJobChangeEvent event) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see org.eclipse.core.runtime.jobs.IJobChangeListener#done(org.eclipse.core.runtime.jobs.IJobChangeEvent)
	 */
	@Override
	public void done(IJobChangeEvent event) {
		if (!(event.getJob() instanceof DTMCAnalyzeJob)) {
			return;
		}
		if (!event.getResult().isOK()) {
			// no error handling yet.
		}
		DTMCAnalyzeJob job = (DTMCAnalyzeJob) event.getJob();
		
		Resource resource = job.getModel();
		
		URI modelfile = resource.getURI();
		
		
		OutputStream out;
		try {
			
			URL resulturl = new URL(modelfile.toString() + ".analysis.csv");
			System.out.println("Write result to file " + FileLocator.resolve(resulturl).toString());
			
			out = new FileOutputStream(new File(FileLocator.resolve(resulturl).toURI()));
	
			out.write("State;Probability\n".getBytes());
			
			for(Entry<State, String> entry : job.getAnalysis().entrySet()) {
				out.write(entry.getKey().getName().getBytes());
				out.write(';');
				out.write(entry.getValue().toString().getBytes());
				out.write('\n');
			}
		
			out.close();
			

			
			if (this.listener != null) {
				this.listener.finished(resource, resulturl.toString());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.core.runtime.jobs.IJobChangeListener#running(org.eclipse.core.runtime.jobs.IJobChangeEvent)
	 */
	@Override
	public void running(IJobChangeEvent event) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see org.eclipse.core.runtime.jobs.IJobChangeListener#scheduled(org.eclipse.core.runtime.jobs.IJobChangeEvent)
	 */
	@Override
	public void scheduled(IJobChangeEvent event) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see org.eclipse.core.runtime.jobs.IJobChangeListener#sleeping(org.eclipse.core.runtime.jobs.IJobChangeEvent)
	 */
	@Override
	public void sleeping(IJobChangeEvent event) {
		// TODO Auto-generated method stub

	}

}
