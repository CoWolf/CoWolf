/**
 */
package de.uni_stuttgart.iste.cowolf.model.fault_tree.emf.tests;

import de.uni_stuttgart.iste.cowolf.model.fault_tree.BasicEvent;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTreeFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Basic Event</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BasicEventTest extends EventTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BasicEventTest.class);
	}

	/**
	 * Constructs a new Basic Event test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicEventTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Basic Event test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BasicEvent getFixture() {
		return (BasicEvent)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FaultTreeFactory.eINSTANCE.createBasicEvent());
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

} //BasicEventTest
