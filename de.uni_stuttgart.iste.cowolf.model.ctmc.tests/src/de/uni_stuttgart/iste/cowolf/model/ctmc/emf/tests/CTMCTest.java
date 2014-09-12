/**
 */
package de.uni_stuttgart.iste.cowolf.model.ctmc.emf.tests;

import de.uni_stuttgart.iste.cowolf.model.ctmc.CTMC;
import de.uni_stuttgart.iste.cowolf.model.ctmc.CtmcFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>CTMC</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CTMCTest extends TestCase {

	/**
	 * The fixture for this CTMC test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CTMC fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CTMCTest.class);
	}

	/**
	 * Constructs a new CTMC test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CTMCTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this CTMC test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(CTMC fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this CTMC test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CTMC getFixture() {
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
		setFixture(CtmcFactory.eINSTANCE.createCTMC());
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

} //CTMCTest
