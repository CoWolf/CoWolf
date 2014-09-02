/**
 */
package de.uni_stuttgart.iste.cowolf.model.ctmc.emf.tests;

import de.uni_stuttgart.iste.cowolf.model.ctmc.CtmcFactory;
import de.uni_stuttgart.iste.cowolf.model.ctmc.Label;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Label</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LabelTest extends TestCase {

	/**
	 * The fixture for this Label test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Label fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LabelTest.class);
	}

	/**
	 * Constructs a new Label test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Label test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Label fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Label test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Label getFixture() {
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
		setFixture(CtmcFactory.eINSTANCE.createLabel());
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

} //LabelTest
