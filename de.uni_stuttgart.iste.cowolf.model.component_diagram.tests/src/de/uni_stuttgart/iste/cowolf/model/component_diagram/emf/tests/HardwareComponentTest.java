/**
 */
package de.uni_stuttgart.iste.cowolf.model.component_diagram.emf.tests;

import de.uni_stuttgart.iste.cowolf.model.component_diagram.Component_diagramFactory;
import de.uni_stuttgart.iste.cowolf.model.component_diagram.HardwareComponent;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Hardware Component</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HardwareComponentTest extends ComponentTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(HardwareComponentTest.class);
	}

	/**
	 * Constructs a new Hardware Component test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareComponentTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Hardware Component test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected HardwareComponent getFixture() {
		return (HardwareComponent)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Component_diagramFactory.eINSTANCE.createHardwareComponent());
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

} //HardwareComponentTest
