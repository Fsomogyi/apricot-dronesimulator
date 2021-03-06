/**
 */
package hu.bme.mit.mdsd.dns2016.behaviour.tests;

import hu.bme.mit.mdsd.dns2016.behaviour.BehaviourFactory;
import hu.bme.mit.mdsd.dns2016.behaviour.Pause;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Pause</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PauseTest extends InstructionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PauseTest.class);
	}

	/**
	 * Constructs a new Pause test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PauseTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Pause test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Pause getFixture() {
		return (Pause)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BehaviourFactory.eINSTANCE.createPause());
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

} //PauseTest
