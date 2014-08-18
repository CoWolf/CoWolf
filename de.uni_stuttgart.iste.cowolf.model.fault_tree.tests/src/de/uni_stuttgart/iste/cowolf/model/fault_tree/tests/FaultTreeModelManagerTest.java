package de.uni_stuttgart.iste.cowolf.model.fault_tree.tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import java.io.File;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.junit.Before;
import org.junit.Test;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTreeModelManager;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTreePackage;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.FaultTreePackageImpl;

public class FaultTreeModelManagerTest {
	private FaultTreeModelManager faultTreeModelManager;
	private Resource model;

	@Before
	public void setUp() throws Exception {
		faultTreeModelManager = new FaultTreeModelManager();
		FaultTreePackageImpl.init();
		FaultTreePackage.eINSTANCE.eClass();
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet
				.getResourceFactoryRegistry()
				.getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION,
						new XMIResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
				"xml", new XMLResourceFactoryImpl());
		resourceSet.getPackageRegistry().put(FaultTreePackage.eNS_URI,
				FaultTreePackage.eINSTANCE);
		String f = "model/scenario_02.faulttree";
		File file = new File(f);
		URI uri = file.isFile() ? URI.createFileURI(file.getAbsolutePath())
				: URI.createURI(f);
		model = resourceSet.getResource(uri, true);
	}

	@Test
	public void testGetModelTypeInfo() {
		FaultTreeModelManager faultTreeModelManager = new FaultTreeModelManager();
		assertNotNull("Model type info shouldn't be null",
				faultTreeModelManager.getModelTypeInfo());
	}

	@Test
	public void testIsManaged() {
		FaultTreeModelManager faultTreeModelManager = new FaultTreeModelManager();
		assertTrue("FaultTreeManager.isManaged() should be true",
				faultTreeModelManager.isManaged(model));
	}

	@Test
	public void testAnalyze() {
		try {
			faultTreeModelManager.analyze(model, null, null);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
}
