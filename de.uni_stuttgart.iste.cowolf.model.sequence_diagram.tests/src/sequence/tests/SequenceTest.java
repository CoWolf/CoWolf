/**
 */
package sequence.tests;

import commonBase.tests.IDBaseTest;

import junit.textui.TestRunner;

import sequence.Sequence;
import sequence.SequenceFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sequence</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SequenceTest extends IDBaseTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SequenceTest.class);
	}

	/**
	 * Constructs a new Sequence test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Sequence test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Sequence getFixture() {
		return (Sequence)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SequenceFactory.eINSTANCE.createSequence());
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

} //SequenceTest
