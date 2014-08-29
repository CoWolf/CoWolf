/**
 */
package de.uni_stuttgart.iste.cowolf.model.LqnCore.tests;

import de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityLoopType;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Activity Loop Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ActivityLoopTypeTest extends ActivityTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ActivityLoopTypeTest.class);
	}

	/**
	 * Constructs a new Activity Loop Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityLoopTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Activity Loop Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ActivityLoopType getFixture() {
		return (ActivityLoopType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(LQNFactory.eINSTANCE.createActivityLoopType());
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

} //ActivityLoopTypeTest
