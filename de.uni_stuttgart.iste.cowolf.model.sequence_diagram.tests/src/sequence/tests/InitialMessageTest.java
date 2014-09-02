/**
 */
package sequence.tests;

import junit.textui.TestRunner;

import sequence.InitialMessage;
import sequence.SequenceFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Initial Message</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InitialMessageTest extends MessageBaseTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InitialMessageTest.class);
	}

	/**
	 * Constructs a new Initial Message test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialMessageTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Initial Message test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected InitialMessage getFixture() {
		return (InitialMessage)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SequenceFactory.eINSTANCE.createInitialMessage());
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

} //InitialMessageTest
