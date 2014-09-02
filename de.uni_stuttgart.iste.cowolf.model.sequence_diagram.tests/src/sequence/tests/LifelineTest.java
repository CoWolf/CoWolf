/**
 */
package sequence.tests;

import commonBase.tests.IDBaseTest;

import junit.textui.TestRunner;

import sequence.Lifeline;
import sequence.SequenceFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Lifeline</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LifelineTest extends IDBaseTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LifelineTest.class);
	}

	/**
	 * Constructs a new Lifeline test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LifelineTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Lifeline test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Lifeline getFixture() {
		return (Lifeline)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SequenceFactory.eINSTANCE.createLifeline());
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

} //LifelineTest
