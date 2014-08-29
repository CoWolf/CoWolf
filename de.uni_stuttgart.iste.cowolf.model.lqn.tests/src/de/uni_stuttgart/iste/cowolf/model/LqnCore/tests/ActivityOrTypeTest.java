/**
 */
package de.uni_stuttgart.iste.cowolf.model.LqnCore.tests;

import de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityOrType;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Activity Or Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ActivityOrTypeTest extends ActivityTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ActivityOrTypeTest.class);
	}

	/**
	 * Constructs a new Activity Or Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityOrTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Activity Or Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ActivityOrType getFixture() {
		return (ActivityOrType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(LQNFactory.eINSTANCE.createActivityOrType());
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

} //ActivityOrTypeTest
