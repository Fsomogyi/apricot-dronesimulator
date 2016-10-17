/**
 */
package hu.bme.mit.mdsd.dns2016.behaviour.tests;

import hu.bme.mit.mdsd.dns2016.behaviour.BehaviourFactory;
import hu.bme.mit.mdsd.dns2016.behaviour.Lift;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Lift</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LiftTest extends InstructionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LiftTest.class);
	}

	/**
	 * Constructs a new Lift test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiftTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Lift test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Lift getFixture() {
		return (Lift)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BehaviourFactory.eINSTANCE.createLift());
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

} //LiftTest
