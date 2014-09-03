/**
 */
package de.uni_stuttgart.iste.cowolf.model.component_diagram.emf.tests;

import de.uni_stuttgart.iste.cowolf.model.component_diagram.Architecture;
import de.uni_stuttgart.iste.cowolf.model.component_diagram.Component_diagramFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Architecture</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArchitectureTest extends TestCase {

	/**
	 * The fixture for this Architecture test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Architecture fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ArchitectureTest.class);
	}

	/**
	 * Constructs a new Architecture test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchitectureTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Architecture test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Architecture fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Architecture test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Architecture getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Component_diagramFactory.eINSTANCE.createArchitecture());
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

} //ArchitectureTest
