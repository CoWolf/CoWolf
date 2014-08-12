/**
 */
package de.uni_stuttgart.iste.cowolf.model.fault_tree.emf.tests;

import de.uni_stuttgart.iste.cowolf.model.fault_tree.FailureType;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTreeFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Failure Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FailureTypeTest extends TestCase {

	/**
	 * The fixture for this Failure Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FailureType fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FailureTypeTest.class);
	}

	/**
	 * Constructs a new Failure Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailureTypeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Failure Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(FailureType fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Failure Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FailureType getFixture() {
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
		setFixture(FaultTreeFactory.eINSTANCE.createFailureType());
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

} //FailureTypeTest
