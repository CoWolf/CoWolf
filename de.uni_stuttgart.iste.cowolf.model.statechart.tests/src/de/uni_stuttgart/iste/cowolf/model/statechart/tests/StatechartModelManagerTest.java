package de.uni_stuttgart.iste.cowolf.model.statechart.tests;


import java.io.IOException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import de.uni_stuttgart.iste.cowolf.model.statechart.StatechartModelManager;
import de.uni_stuttgart.iste.cowolf.model.statechart.Statechart.StateMachine;
import de.uni_stuttgart.iste.cowolf.model.statechart.Statechart.StatechartemfFactory;


public class StatechartModelManagerTest {

	Resource res;
	StateMachine root;

	@Before
	public void machDas() {
		//create test model
		StatechartemfFactory factory = StatechartemfFactory.eINSTANCE;

		this.root = factory.createStateMachine();

		// Create a resource set.
		ResourceSet resourceSet = new ResourceSetImpl();

	}

	@Test
	public void testIsManaged1() throws IOException {

		EList<EObject> bla = this.res.getContents();
		bla.add(this.root);

		//create test target
		StatechartModelManager target = new StatechartModelManager();

		
		Assert.assertTrue((!target.isManaged(res)));

	}

}
