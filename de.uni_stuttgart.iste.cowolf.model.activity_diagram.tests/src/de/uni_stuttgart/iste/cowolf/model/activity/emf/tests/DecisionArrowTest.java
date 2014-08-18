/**
 */
package de.uni_stuttgart.iste.cowolf.model.activity.emf.tests;

import de.uni_stuttgart.iste.cowolf.model.activity.ActivityFactory;
import de.uni_stuttgart.iste.cowolf.model.activity.DecisionArrow;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Decision Arrow</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DecisionArrowTest extends TestCase {

	/**
	 * The fixture for this Decision Arrow test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecisionArrow fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DecisionArrowTest.class);
	}

	/**
	 * Constructs a new Decision Arrow test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionArrowTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Decision Arrow test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(DecisionArrow fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Decision Arrow test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecisionArrow getFixture() {
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
		setFixture(ActivityFactory.eINSTANCE.createDecisionArrow());
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

} //DecisionArrowTest
