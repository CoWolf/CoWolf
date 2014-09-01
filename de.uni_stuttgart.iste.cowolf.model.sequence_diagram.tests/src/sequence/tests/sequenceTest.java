/**
 */
package sequence.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;
import sequence.SequenceFactory;
import sequence.sequence;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>sequence</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class sequenceTest extends TestCase {

	/**
	 * The fixture for this sequence test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected sequence fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(sequenceTest.class);
	}

	/**
	 * Constructs a new sequence test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public sequenceTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this sequence test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(sequence fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this sequence test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected sequence getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SequenceFactory.eINSTANCE.createsequence());
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

} //sequenceTest
