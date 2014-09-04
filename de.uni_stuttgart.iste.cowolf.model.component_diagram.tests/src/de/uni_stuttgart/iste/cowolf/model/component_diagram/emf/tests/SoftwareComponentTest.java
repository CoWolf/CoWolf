/**
 */
package de.uni_stuttgart.iste.cowolf.model.component_diagram.emf.tests;

import de.uni_stuttgart.iste.cowolf.model.component_diagram.Component_diagramFactory;
import de.uni_stuttgart.iste.cowolf.model.component_diagram.SoftwareComponent;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Software Component</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SoftwareComponentTest extends ComponentTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SoftwareComponentTest.class);
	}

	/**
	 * Constructs a new Software Component test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareComponentTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Software Component test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SoftwareComponent getFixture() {
		return (SoftwareComponent)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Component_diagramFactory.eINSTANCE.createSoftwareComponent());
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

} //SoftwareComponentTest
