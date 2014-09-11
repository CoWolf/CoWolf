/**
 */
package de.uni_stuttgart.iste.cowolf.model.sequence_diagram.emf.tests;

import de.uni_stuttgart.iste.cowolf.model.sequence_diagram.ActorLifeline;
import de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Sequence_diagramFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Actor Lifeline</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ActorLifelineTest extends TestCase {

	/**
	 * The fixture for this Actor Lifeline test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActorLifeline fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ActorLifelineTest.class);
	}

	/**
	 * Constructs a new Actor Lifeline test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActorLifelineTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Actor Lifeline test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ActorLifeline fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Actor Lifeline test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActorLifeline getFixture() {
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
		setFixture(Sequence_diagramFactory.eINSTANCE.createActorLifeline());
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

} //ActorLifelineTest
