/**
 */
package de.uni_stuttgart.iste.cowolf.model.statechart.Statechart.tests;

import de.uni_stuttgart.iste.cowolf.model.statechart.Statechart.Guard;
import de.uni_stuttgart.iste.cowolf.model.statechart.Statechart.StatechartemfFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Guard</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GuardTest extends TestCase {

	/**
	 * The fixture for this Guard test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Guard fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GuardTest.class);
	}

	/**
	 * Constructs a new Guard test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuardTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Guard test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Guard fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Guard test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Guard getFixture() {
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
		setFixture(StatechartemfFactory.eINSTANCE.createGuard());
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

} //GuardTest
