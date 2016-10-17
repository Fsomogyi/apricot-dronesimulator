/**
 */
package hu.bme.mit.mdsd.dns2016.drones.tests;

import hu.bme.mit.mdsd.dns2016.drones.DronesFactory;
import hu.bme.mit.mdsd.dns2016.drones.ImmovableObject;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Immovable Object</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ImmovableObjectTest extends FieldObjectTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ImmovableObjectTest.class);
	}

	/**
	 * Constructs a new Immovable Object test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmovableObjectTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Immovable Object test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ImmovableObject getFixture() {
		return (ImmovableObject)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DronesFactory.eINSTANCE.createImmovableObject());
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

} //ImmovableObjectTest
