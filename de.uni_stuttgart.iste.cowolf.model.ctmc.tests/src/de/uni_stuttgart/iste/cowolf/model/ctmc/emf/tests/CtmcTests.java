/**
 */
package de.uni_stuttgart.iste.cowolf.model.ctmc.emf.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>ctmc</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class CtmcTests extends TestSuite {

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
		TestSuite suite = new CtmcTests("ctmc Tests");
		suite.addTestSuite(StateTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtmcTests(String name) {
		super(name);
	}

} //CtmcTests
