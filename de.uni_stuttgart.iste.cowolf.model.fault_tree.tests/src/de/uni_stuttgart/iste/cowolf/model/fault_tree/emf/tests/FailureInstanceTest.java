/**
 */
package de.uni_stuttgart.iste.cowolf.model.fault_tree.emf.tests;

import de.uni_stuttgart.iste.cowolf.model.fault_tree.FailureInstance;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTreeFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Failure Instance</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FailureInstanceTest extends TestCase {

	/**
	 * The fixture for this Failure Instance test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FailureInstance fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FailureInstanceTest.class);
	}

	/**
	 * Constructs a new Failure Instance test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailureInstanceTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Failure Instance test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(FailureInstance fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Failure Instance test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FailureInstance getFixture() {
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
		setFixture(FaultTreeFactory.eINSTANCE.createFailureInstance());
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

} //FailureInstanceTest
