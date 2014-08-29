/**
 */
package de.uni_stuttgart.iste.cowolf.model.LqnCore.tests;

import de.uni_stuttgart.iste.cowolf.model.LqnCore.EntryActivityGraph;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Entry Activity Graph</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EntryActivityGraphTest extends ActivityGraphBaseTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EntryActivityGraphTest.class);
	}

	/**
	 * Constructs a new Entry Activity Graph test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryActivityGraphTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Entry Activity Graph test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EntryActivityGraph getFixture() {
		return (EntryActivityGraph)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(LQNFactory.eINSTANCE.createEntryActivityGraph());
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

} //EntryActivityGraphTest
