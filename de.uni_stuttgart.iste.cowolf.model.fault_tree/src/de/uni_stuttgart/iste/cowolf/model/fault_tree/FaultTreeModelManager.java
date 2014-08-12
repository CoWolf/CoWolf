package de.uni_stuttgart.iste.cowolf.model.fault_tree;

import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.parser.IEncodingProvider;
import org.eclipse.xtext.service.AbstractGenericModule;

import com.google.inject.Guice;
import com.google.inject.Injector;

import de.uni_stuttgart.iste.cowolf.model.AbstractQoSModelManager;
import de.uni_stuttgart.iste.cowolf.model.IAnalysisListener;
import de.uni_stuttgart.iste.cowolf.model.ModelTypeInfo;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.analyze.XFTAGenerator;

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
		// final FaultTreeAnalyzeJob job = new FaultTreeAnalyzeJob(model,
		// parameters);
		// job.setPriority(Job.LONG);
		// job.schedule();

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

		return null;
	}
}
