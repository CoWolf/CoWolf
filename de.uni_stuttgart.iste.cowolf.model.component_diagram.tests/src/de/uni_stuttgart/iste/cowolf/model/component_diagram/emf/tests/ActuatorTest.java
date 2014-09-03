/**
 */
package de.uni_stuttgart.iste.cowolf.model.component_diagram.emf.tests;

import de.uni_stuttgart.iste.cowolf.model.component_diagram.Actuator;
import de.uni_stuttgart.iste.cowolf.model.component_diagram.Component_diagramFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Actuator</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ActuatorTest extends MechanicalDeviceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ActuatorTest.class);
	}

	/**
	 * Constructs a new Actuator test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActuatorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Actuator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Actuator getFixture() {
		return (Actuator)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Component_diagramFactory.eINSTANCE.createActuator());
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

} //ActuatorTest
