package de.uni_stuttgart.iste.cowolf.model.statechart.tests;

import static org.junit.Assert.*;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Test;

import de.uni_stuttgart.iste.cowolf.model.dtmc.DTMCemfFactory;
import de.uni_stuttgart.iste.cowolf.model.dtmc.Root;
import de.uni_stuttgart.iste.cowolf.model.statechart.StatechartModelManager;
import de.uni_stuttgart.iste.cowolf.model.statechart.Statechart.StateMachine;
import de.uni_stuttgart.iste.cowolf.model.statechart.Statechart.StatechartemfFactory;

public class StatechartModelManagerTest {

	@Test
	public void testIsManaged1() {
		
		//create test model
		StatechartemfFactory factory = StatechartemfFactory.eINSTANCE;
		
		StateMachine root = factory.createStateMachine();
		
		// Create a resource set.
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource res = resourceSet.createResource(URI.createFileURI("myTestStatechart.statechartemf"));
		
		res.getContents().add(root);
		
		//create test target
		StatechartModelManager target = new StatechartModelManager();
		
		Assert.isTrue(target.isManaged(res));
		
	}
	
	@Test
	public void testIsManaged2() {
		
		//create test model
		DTMCemfFactory factory = DTMCemfFactory.eINSTANCE;
		
		Root root = factory.createRoot();
		
		// Create a resource set.
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource res = resourceSet.createResource(URI.createFileURI("myTestStatechart.statechartemf"));
		
		res.getContents().add(root);
		
		//create test target
		StatechartModelManager target = new StatechartModelManager();
		
		Assert.isTrue(!target.isManaged(res));
		
	}

}
