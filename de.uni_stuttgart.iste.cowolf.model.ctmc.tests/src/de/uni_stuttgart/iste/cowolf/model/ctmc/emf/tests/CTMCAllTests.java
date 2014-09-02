/**
 */
package de.uni_stuttgart.iste.cowolf.model.ctmc.emf.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>CTMC</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class CTMCAllTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new CTMCAllTests("CTMC Tests");
		suite.addTest(CtmcTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CTMCAllTests(String name) {
		super(name);
	}

} //CTMCAllTests
