/**
 */
package de.uni_stuttgart.iste.cowolf.model.dtmc.emf.tests;

import de.uni_stuttgart.iste.cowolf.model.dtmc.DTMCemfFactory;
import de.uni_stuttgart.iste.cowolf.model.dtmc.Root;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RootTest extends TestCase {

	/**
	 * The fixture for this Root test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Root fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RootTest.class);
	}

	/**
	 * Constructs a new Root test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RootTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Root test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Root fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Root test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Root getFixture() {
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
		setFixture(DTMCemfFactory.eINSTANCE.createRoot());
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

} //RootTest
