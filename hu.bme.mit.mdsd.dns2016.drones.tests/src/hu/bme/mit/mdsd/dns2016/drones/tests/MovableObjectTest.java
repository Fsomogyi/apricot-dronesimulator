/**
 */
package hu.bme.mit.mdsd.dns2016.drones.tests;

import hu.bme.mit.mdsd.dns2016.drones.DronesFactory;
import hu.bme.mit.mdsd.dns2016.drones.MovableObject;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Movable Object</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MovableObjectTest extends FieldObjectTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MovableObjectTest.class);
	}

	/**
	 * Constructs a new Movable Object test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MovableObjectTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Movable Object test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MovableObject getFixture() {
		return (MovableObject)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DronesFactory.eINSTANCE.createMovableObject());
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

} //MovableObjectTest
