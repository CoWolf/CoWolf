/**
 */
package sequence.tests;

import junit.textui.TestRunner;

import sequence.Alternative;
import sequence.SequenceFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Alternative</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AlternativeTest extends BlockTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AlternativeTest.class);
	}

	/**
	 * Constructs a new Alternative test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlternativeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Alternative test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Alternative getFixture() {
		return (Alternative)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SequenceFactory.eINSTANCE.createAlternative());
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

} //AlternativeTest
