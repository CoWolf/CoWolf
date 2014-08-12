package de.uni_stuttgart.iste.cowolf.model.statechart.tests;

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

		
		Assert.isTrue(!target.isManaged(res));

	}

}
