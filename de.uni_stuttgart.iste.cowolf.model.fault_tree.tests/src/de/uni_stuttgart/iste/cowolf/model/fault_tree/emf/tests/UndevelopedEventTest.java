/**
 */
package de.uni_stuttgart.iste.cowolf.model.fault_tree.emf.tests;

import de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTreeFactory;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.UndevelopedEvent;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Undeveloped Event</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UndevelopedEventTest extends EventTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UndevelopedEventTest.class);
	}

	/**
	 * Constructs a new Undeveloped Event test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UndevelopedEventTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Undeveloped Event test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected UndevelopedEvent getFixture() {
		return (UndevelopedEvent)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FaultTreeFactory.eINSTANCE.createUndevelopedEvent());
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

} //UndevelopedEventTest
