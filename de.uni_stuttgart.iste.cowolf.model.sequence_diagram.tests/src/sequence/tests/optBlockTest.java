/**
 */
package sequence.tests;

import junit.textui.TestRunner;

import sequence.SequenceFactory;
import sequence.optBlock;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>opt Block</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class optBlockTest extends BlockTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(optBlockTest.class);
	}

	/**
	 * Constructs a new opt Block test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public optBlockTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this opt Block test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected optBlock getFixture() {
		return (optBlock)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SequenceFactory.eINSTANCE.createoptBlock());
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

} //optBlockTest
