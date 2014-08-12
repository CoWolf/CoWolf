package de.uni_stuttgart.iste.cowolf.model.fault_tree.analyze;

import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.parser.IEncodingProvider;
import org.eclipse.xtext.service.AbstractGenericModule;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class FaultTreeAnalyzeJob extends Job {

	private final Resource model;
	private final Map<String, Object> parameters;

	public FaultTreeAnalyzeJob(final Resource model,
			final Map<String, Object> parameters) {
		super("Fault Tree Analysys Job");
		this.model = model;
		this.parameters = parameters;
	}

	@Override
	protected IStatus run(IProgressMonitor monitor) {
		XFTAGenerator generator = new XFTAGenerator();
		Injector i = Guice.createInjector(new AbstractGenericModule() {
			@SuppressWarnings("all")
			public Class<? extends IEncodingProvider> bindIEncodingProvider() {
				return IEncodingProvider.Runtime.class;
			}
		});
		JavaIoFileSystemAccess writer = i
				.getInstance(JavaIoFileSystemAccess.class);
		writer.setOutputPath("/home/desarrollo/tmp");
		generator.doGenerate(model, writer);
		return Status.OK_STATUS;
	}

}
