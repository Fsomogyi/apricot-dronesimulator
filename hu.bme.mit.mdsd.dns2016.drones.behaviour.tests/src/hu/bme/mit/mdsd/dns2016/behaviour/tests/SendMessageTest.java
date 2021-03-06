/**
 */
package hu.bme.mit.mdsd.dns2016.behaviour.tests;

import hu.bme.mit.mdsd.dns2016.behaviour.BehaviourFactory;
import hu.bme.mit.mdsd.dns2016.behaviour.SendMessage;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Send Message</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SendMessageTest extends InstructionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SendMessageTest.class);
	}

	/**
	 * Constructs a new Send Message test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SendMessageTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Send Message test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SendMessage getFixture() {
		return (SendMessage)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BehaviourFactory.eINSTANCE.createSendMessage());
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

} //SendMessageTest
