/**
 */
package sequence.tests;

import commonBase.tests.IDBaseTest;

import junit.textui.TestRunner;

import sequence.AltBlock;
import sequence.SequenceFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Alt Block</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AltBlockTest extends IDBaseTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AltBlockTest.class);
	}

	/**
	 * Constructs a new Alt Block test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AltBlockTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Alt Block test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AltBlock getFixture() {
		return (AltBlock)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SequenceFactory.eINSTANCE.createAltBlock());
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

} //AltBlockTest
