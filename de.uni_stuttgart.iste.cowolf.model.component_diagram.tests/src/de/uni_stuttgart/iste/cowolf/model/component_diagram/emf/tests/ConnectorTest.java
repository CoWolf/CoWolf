/**
 */
package de.uni_stuttgart.iste.cowolf.model.component_diagram.emf.tests;

import de.uni_stuttgart.iste.cowolf.model.component_diagram.Component_diagramFactory;
import de.uni_stuttgart.iste.cowolf.model.component_diagram.Connector;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConnectorTest extends TestCase {

	/**
	 * The fixture for this Connector test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Connector fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ConnectorTest.class);
	}

	/**
	 * Constructs a new Connector test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Connector test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Connector fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Connector test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Connector getFixture() {
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
		setFixture(Component_diagramFactory.eINSTANCE.createConnector());
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

} //ConnectorTest
