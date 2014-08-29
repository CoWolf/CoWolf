/**
 */
package de.uni_stuttgart.iste.cowolf.model.lqn.tests;

import de.uni_stuttgart.iste.cowolf.model.LqnCore.tests.LQNTests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>LQN</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class LQNAllTests extends TestSuite {

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
		TestSuite suite = new LQNAllTests("LQN Tests");
		suite.addTest(LQNTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LQNAllTests(String name) {
		super(name);
	}

} //LQNAllTests
