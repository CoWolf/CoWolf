/**
 */
package sequence.tests;

import junit.textui.TestRunner;

import sequence.SequenceFactory;
import sequence.SpecialMessage;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Special Message</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpecialMessageTest extends MessageTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SpecialMessageTest.class);
	}

	/**
	 * Constructs a new Special Message test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecialMessageTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Special Message test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SpecialMessage getFixture() {
		return (SpecialMessage)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SequenceFactory.eINSTANCE.createSpecialMessage());
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

} //SpecialMessageTest
