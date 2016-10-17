/**
 */
package hu.bme.mit.mdsd.dns2016.drones.tests;

import hu.bme.mit.mdsd.dns2016.drones.ChargeStation;
import hu.bme.mit.mdsd.dns2016.drones.DronesFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Charge Station</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ChargeStationTest extends ImmovableObjectTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ChargeStationTest.class);
	}

	/**
	 * Constructs a new Charge Station test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChargeStationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Charge Station test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ChargeStation getFixture() {
		return (ChargeStation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DronesFactory.eINSTANCE.createChargeStation());
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

} //ChargeStationTest
