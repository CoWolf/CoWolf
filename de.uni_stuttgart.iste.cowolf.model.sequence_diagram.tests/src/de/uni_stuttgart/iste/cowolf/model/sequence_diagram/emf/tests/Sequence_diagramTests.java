/**
 */
package de.uni_stuttgart.iste.cowolf.model.sequence_diagram.emf.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>sequence_diagram</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class Sequence_diagramTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new Sequence_diagramTests("sequence_diagram Tests");
		suite.addTestSuite(PackageTest.class);
		suite.addTestSuite(ClassTest.class);
		suite.addTestSuite(InteractionTest.class);
		suite.addTestSuite(ActorTest.class);
		suite.addTestSuite(OperationTest.class);
		suite.addTestSuite(MessageTest.class);
		suite.addTestSuite(MessageOccurenceSpecificationTest.class);
		suite.addTestSuite(BehaviorExecutionSpecificationTest.class);
		suite.addTestSuite(OpaqueBehaviorTest.class);
		suite.addTestSuite(ActorLifelineTest.class);
		suite.addTestSuite(LifelineTest.class);
		suite.addTestSuite(PropertyTest.class);
		suite.addTestSuite(ExecutionSpecifiactionTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequence_diagramTests(String name) {
		super(name);
	}

} //Sequence_diagramTests
