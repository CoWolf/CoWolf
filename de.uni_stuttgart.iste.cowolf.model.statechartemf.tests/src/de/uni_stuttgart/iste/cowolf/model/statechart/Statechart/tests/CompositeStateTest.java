/**
 */
package de.uni_stuttgart.iste.cowolf.model.statechart.Statechart.tests;

import de.uni_stuttgart.iste.cowolf.model.statechart.Statechart.CompositeState;
import de.uni_stuttgart.iste.cowolf.model.statechart.Statechart.StatechartemfFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Composite State</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CompositeStateTest extends StateTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CompositeStateTest.class);
	}

	/**
	 * Constructs a new Composite State test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeStateTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Composite State test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CompositeState getFixture() {
		return (CompositeState)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(StatechartemfFactory.eINSTANCE.createCompositeState());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //CompositeStateTest
