/**
 */
package hu.bme.mit.mdsd.dns2016.drones;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see hu.bme.mit.mdsd.dns2016.drones.DronesFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore settingDelegates='org.eclipse.incquery.querybasedfeature'"
 * @generated
 */
public interface DronesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "drones";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "hu.bme.mit.mdsd.dns2016.drones";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "drones";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DronesPackage eINSTANCE = hu.bme.mit.mdsd.dns2016.drones.impl.DronesPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.bme.mit.mdsd.dns2016.drones.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.mdsd.dns2016.drones.impl.NamedElementImpl
	 * @see hu.bme.mit.mdsd.dns2016.drones.impl.DronesPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.mdsd.dns2016.drones.impl.FieldObjectImpl <em>Field Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.mdsd.dns2016.drones.impl.FieldObjectImpl
	 * @see hu.bme.mit.mdsd.dns2016.drones.impl.DronesPackageImpl#getFieldObject()
	 * @generated
	 */
	int FIELD_OBJECT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OBJECT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OBJECT__LENGTH = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OBJECT__HEIGHT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OBJECT__WIDTH = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OBJECT__X = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OBJECT__Y = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OBJECT__Z = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OBJECT__PARAMETERS = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Field Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OBJECT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Field Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OBJECT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.mdsd.dns2016.drones.impl.DroneImpl <em>Drone</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.mdsd.dns2016.drones.impl.DroneImpl
	 * @see hu.bme.mit.mdsd.dns2016.drones.impl.DronesPackageImpl#getDrone()
	 * @generated
	 */
	int DRONE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE__LENGTH = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE__HEIGHT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE__WIDTH = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE__X = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE__Y = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE__Z = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Battery</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE__BATTERY = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Charge Station</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE__CHARGE_STATION = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Cpu Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE__CPU_FREQUENCY = NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE__MEMORY = NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Max Payload</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE__MAX_PAYLOAD = NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Communication Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE__COMMUNICATION_RANGE = NAMED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Min Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE__MIN_SPEED = NAMED_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Max Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE__MAX_SPEED = NAMED_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Supported Actions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE__SUPPORTED_ACTIONS = NAMED_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Drone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The number of operations of the '<em>Drone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.mdsd.dns2016.drones.impl.TemporalContainmentProxyImpl <em>Temporal Containment Proxy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.mdsd.dns2016.drones.impl.TemporalContainmentProxyImpl
	 * @see hu.bme.mit.mdsd.dns2016.drones.impl.DronesPackageImpl#getTemporalContainmentProxy()
	 * @generated
	 */
	int TEMPORAL_CONTAINMENT_PROXY = 11;

	/**
	 * The number of structural features of the '<em>Temporal Containment Proxy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_CONTAINMENT_PROXY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Temporal Containment Proxy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_CONTAINMENT_PROXY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.mdsd.dns2016.drones.impl.BatteryImpl <em>Battery</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.mdsd.dns2016.drones.impl.BatteryImpl
	 * @see hu.bme.mit.mdsd.dns2016.drones.impl.DronesPackageImpl#getBattery()
	 * @generated
	 */
	int BATTERY = 2;

	/**
	 * The feature id for the '<em><b>Life Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY__LIFE_TIME = TEMPORAL_CONTAINMENT_PROXY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Recharge Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY__RECHARGE_RATE = TEMPORAL_CONTAINMENT_PROXY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Charge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY__CHARGE = TEMPORAL_CONTAINMENT_PROXY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Remaining Life Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY__REMAINING_LIFE_TIME = TEMPORAL_CONTAINMENT_PROXY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Battery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_FEATURE_COUNT = TEMPORAL_CONTAINMENT_PROXY_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Battery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_OPERATION_COUNT = TEMPORAL_CONTAINMENT_PROXY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.mdsd.dns2016.drones.impl.ImmovableObjectImpl <em>Immovable Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.mdsd.dns2016.drones.impl.ImmovableObjectImpl
	 * @see hu.bme.mit.mdsd.dns2016.drones.impl.DronesPackageImpl#getImmovableObject()
	 * @generated
	 */
	int IMMOVABLE_OBJECT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMOVABLE_OBJECT__NAME = FIELD_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMOVABLE_OBJECT__LENGTH = FIELD_OBJECT__LENGTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMOVABLE_OBJECT__HEIGHT = FIELD_OBJECT__HEIGHT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMOVABLE_OBJECT__WIDTH = FIELD_OBJECT__WIDTH;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMOVABLE_OBJECT__X = FIELD_OBJECT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMOVABLE_OBJECT__Y = FIELD_OBJECT__Y;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMOVABLE_OBJECT__Z = FIELD_OBJECT__Z;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMOVABLE_OBJECT__PARAMETERS = FIELD_OBJECT__PARAMETERS;

	/**
	 * The number of structural features of the '<em>Immovable Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMOVABLE_OBJECT_FEATURE_COUNT = FIELD_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Immovable Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMOVABLE_OBJECT_OPERATION_COUNT = FIELD_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.mdsd.dns2016.drones.impl.ChargeStationImpl <em>Charge Station</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.mdsd.dns2016.drones.impl.ChargeStationImpl
	 * @see hu.bme.mit.mdsd.dns2016.drones.impl.DronesPackageImpl#getChargeStation()
	 * @generated
	 */
	int CHARGE_STATION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGE_STATION__NAME = IMMOVABLE_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGE_STATION__LENGTH = IMMOVABLE_OBJECT__LENGTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGE_STATION__HEIGHT = IMMOVABLE_OBJECT__HEIGHT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGE_STATION__WIDTH = IMMOVABLE_OBJECT__WIDTH;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGE_STATION__X = IMMOVABLE_OBJECT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGE_STATION__Y = IMMOVABLE_OBJECT__Y;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGE_STATION__Z = IMMOVABLE_OBJECT__Z;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGE_STATION__PARAMETERS = IMMOVABLE_OBJECT__PARAMETERS;

	/**
	 * The number of structural features of the '<em>Charge Station</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGE_STATION_FEATURE_COUNT = IMMOVABLE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Charge Station</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGE_STATION_OPERATION_COUNT = IMMOVABLE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.mdsd.dns2016.drones.impl.MissionImpl <em>Mission</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.mdsd.dns2016.drones.impl.MissionImpl
	 * @see hu.bme.mit.mdsd.dns2016.drones.impl.DronesPackageImpl#getMission()
	 * @generated
	 */
	int MISSION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Field Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__FIELD_OBJECTS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Drones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__DRONES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Temporal Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__TEMPORAL_OBJECTS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__ACTIONS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Mission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Mission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.mdsd.dns2016.drones.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.mdsd.dns2016.drones.impl.ParameterImpl
	 * @see hu.bme.mit.mdsd.dns2016.drones.impl.DronesPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 5;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__KEY = TEMPORAL_CONTAINMENT_PROXY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VALUE = TEMPORAL_CONTAINMENT_PROXY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = TEMPORAL_CONTAINMENT_PROXY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = TEMPORAL_CONTAINMENT_PROXY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.mdsd.dns2016.drones.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.mdsd.dns2016.drones.impl.ActionImpl
	 * @see hu.bme.mit.mdsd.dns2016.drones.impl.DronesPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = TEMPORAL_CONTAINMENT_PROXY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__OPERATION = TEMPORAL_CONTAINMENT_PROXY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__KEY = TEMPORAL_CONTAINMENT_PROXY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__VALUE = TEMPORAL_CONTAINMENT_PROXY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__RANGE = TEMPORAL_CONTAINMENT_PROXY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = TEMPORAL_CONTAINMENT_PROXY_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = TEMPORAL_CONTAINMENT_PROXY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.mdsd.dns2016.drones.impl.MovableObjectImpl <em>Movable Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.mdsd.dns2016.drones.impl.MovableObjectImpl
	 * @see hu.bme.mit.mdsd.dns2016.drones.impl.DronesPackageImpl#getMovableObject()
	 * @generated
	 */
	int MOVABLE_OBJECT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVABLE_OBJECT__NAME = FIELD_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVABLE_OBJECT__LENGTH = FIELD_OBJECT__LENGTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVABLE_OBJECT__HEIGHT = FIELD_OBJECT__HEIGHT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVABLE_OBJECT__WIDTH = FIELD_OBJECT__WIDTH;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVABLE_OBJECT__X = FIELD_OBJECT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVABLE_OBJECT__Y = FIELD_OBJECT__Y;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVABLE_OBJECT__Z = FIELD_OBJECT__Z;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVABLE_OBJECT__PARAMETERS = FIELD_OBJECT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVABLE_OBJECT__WEIGHT = FIELD_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Movable Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVABLE_OBJECT_FEATURE_COUNT = FIELD_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Movable Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVABLE_OBJECT_OPERATION_COUNT = FIELD_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.mdsd.dns2016.drones.impl.SizedElementImpl <em>Sized Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.mdsd.dns2016.drones.impl.SizedElementImpl
	 * @see hu.bme.mit.mdsd.dns2016.drones.impl.DronesPackageImpl#getSizedElement()
	 * @generated
	 */
	int SIZED_ELEMENT = 9;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZED_ELEMENT__LENGTH = 0;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZED_ELEMENT__HEIGHT = 1;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZED_ELEMENT__WIDTH = 2;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZED_ELEMENT__X = 3;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZED_ELEMENT__Y = 4;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZED_ELEMENT__Z = 5;

	/**
	 * The number of structural features of the '<em>Sized Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZED_ELEMENT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Sized Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.mdsd.dns2016.drones.ActionKind <em>Action Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.mdsd.dns2016.drones.ActionKind
	 * @see hu.bme.mit.mdsd.dns2016.drones.impl.DronesPackageImpl#getActionKind()
	 * @generated
	 */
	int ACTION_KIND = 12;


	/**
	 * Returns the meta object for class '{@link hu.bme.mit.mdsd.dns2016.drones.FieldObject <em>Field Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Object</em>'.
	 * @see hu.bme.mit.mdsd.dns2016.drones.FieldObject
	 * @generated
	 */
	EClass getFieldObject();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.mdsd.dns2016.drones.FieldObject#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see hu.bme.mit.mdsd.dns2016.drones.FieldObject#getParameters()
	 * @see #getFieldObject()
	 * @generated
	 */
	EReference getFieldObject_Parameters();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.mdsd.dns2016.drones.Drone <em>Drone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drone</em>'.
	 * @see hu.bme.mit.mdsd.dns2016.drones.Drone
	 * @generated
	 */
	EClass getDrone();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.mdsd.dns2016.drones.Drone#getBattery <em>Battery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Battery</em>'.
	 * @see hu.bme.mit.mdsd.dns2016.drones.Drone#getBattery()
	 * @see #getDrone()
	 * @generated
	 */
	EReference getDrone_Battery();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.mdsd.dns2016.drones.Drone#getChargeStation <em>Charge Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Charge Station</em>'.
	 * @see hu.bme.mit.mdsd.dns2016.drones.Drone#getChargeStation()
	 * @see #getDrone()
	 * @generated
	 */
	EReference getDrone_ChargeStation();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.mdsd.dns2016.drones.Drone#getCpuFrequency <em>Cpu Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cpu Frequency</em>'.
	 * @see hu.bme.mit.mdsd.dns2016.drones.Drone#getCpuFrequency()
	 * @see #getDrone()
	 * @generated
	 */
	EAttribute getDrone_CpuFrequency();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.mdsd.dns2016.drones.Drone#getMemory <em>Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memory</em>'.
	 * @see hu.bme.mit.mdsd.dns2016.drones.Drone#getMemory()
	 * @see #getDrone()
	 * @generated
	 */
	EAttribute getDrone_Memory();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.mdsd.dns2016.drones.Drone#getMaxPayload <em>Max Payload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Payload</em>'.
	 * @see hu.bme.mit.mdsd.dns2016.drones.Drone#getMaxPayload()
	 * @see #getDrone()
	 * @generated
	 */
	EAttribute getDrone_MaxPayload();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.mdsd.dns2016.drones.Drone#getCommunicationRange <em>Communication Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Communication Range</em>'.
	 * @see hu.bme.mit.mdsd.dns2016.drones.Drone#getCommunicationRange()
	 * @see #getDrone()
	 * @generated
	 */
	EAttribute getDrone_CommunicationRange();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.mdsd.dns2016.drones.Drone#getMinSpeed <em>Min Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Speed</em>'.
	 * @see hu.bme.mit.mdsd.dns2016.drones.Drone#getMinSpeed()
	 * @see #getDrone()
	 * @generated
	 */
	EAttribute getDrone_MinSpeed();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.mdsd.dns2016.drones.Drone#getMaxSpeed <em>Max Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Speed</em>'.
	 * @see hu.bme.mit.mdsd.dns2016.drones.Drone#getMaxSpeed()
	 * @see #getDrone()
	 * @generated
	 */
	EAttribute getDrone_MaxSpeed();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.mit.mdsd.dns2016.drones.Drone#getSupportedActions <em>Supported Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Supported Actions</em>'.
	 * @see hu.bme.mit.mdsd.dns2016.drones.Drone#getSupportedActions()
	 * @see #getDrone()
	 * @generated
	 */
	EReference getDrone_SupportedActions();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.mdsd.dns2016.drones.Battery <em>Battery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Battery</em>'.
	 * @see hu.bme.mit.mdsd.dns2016.drones.Battery
	 * @generated
	 */
	EClass getBattery();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.mdsd.dns2016.drones.Battery#getLifeTime <em>Life Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Life Time</em>'.
	 * @see hu.bme.mit.mdsd.dns2016.drones.Battery#getLifeTime()
	 * @see #getBattery()
	 * @generated
	 */
	EAttribute getBattery_LifeTime();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.mdsd.dns2016.drones.Battery#getRechargeRate <em>Recharge Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recharge Rate</em>'.
	 * @see hu.bme.mit.mdsd.dns2016.drones.Battery#getRechargeRate()
	 * @see #getBattery()
	 * @generated
	 */
	EAttribute getBattery_RechargeRate();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.mdsd.dns2016.drones.Battery#getCharge <em>Charge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Charge</em>'.
	 * @see hu.bme.mit.mdsd.dns2016.drones.Battery#getCharge()
	 * @see #getBattery()
	 * @generated
	 */
	EAttribute getBattery_Charge();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.mdsd.dns2016.drones.Battery#getRemainingLifeTime <em>Remaining Life Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remaining Life Time</em>'.
	 * @see hu.bme.mit.mdsd.dns2016.drones.Battery#getRemainingLifeTime()
	 * @see #getBattery()
	 * @generated
	 */
	EAttribute getBattery_RemainingLifeTime();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.mdsd.dns2016.drones.ChargeStation <em>Charge Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Charge Station</em>'.
	 * @see hu.bme.mit.mdsd.dns2016.drones.ChargeStation
	 * @generated
	 */
	EClass getChargeStation();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.mdsd.dns2016.drones.Mission <em>Mission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mission</em>'.
	 * @see hu.bme.mit.mdsd.dns2016.drones.Mission
	 * @generated
	 */
	EClass getMission();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.mdsd.dns2016.drones.Mission#getFieldObjects <em>Field Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Field Objects</em>'.
	 * @see hu.bme.mit.mdsd.dns2016.drones.Mission#getFieldObjects()
	 * @see #getMission()
	 * @generated
	 */
	EReference getMission_FieldObjects();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.mdsd.dns2016.drones.Mission#getDrones <em>Drones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Drones</em>'.
	 * @see hu.bme.mit.mdsd.dns2016.drones.Mission#getDrones()
	 * @see #getMission()
	 * @generated
	 */
	EReference getMission_Drones();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.mdsd.dns2016.drones.Mission#getTemporalObjects <em>Temporal Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Temporal Objects</em>'.
	 * @see hu.bme.mit.mdsd.dns2016.drones.Mission#getTemporalObjects()
	 * @see #getMission()
	 * @generated
	 */
	EReference getMission_TemporalObjects();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.mdsd.dns2016.drones.Mission#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see hu.bme.mit.mdsd.dns2016.drones.Mission#getActions()
	 * @see #getMission()
	 * @generated
	 */
	EReference getMission_Actions();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.mdsd.dns2016.drones.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see hu.bme.mit.mdsd.dns2016.drones.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.mdsd.dns2016.drones.Parameter#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see hu.bme.mit.mdsd.dns2016.drones.Parameter#getKey()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Key();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.mdsd.dns2016.drones.Parameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see hu.bme.mit.mdsd.dns2016.drones.Parameter#getValue()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Value();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.mdsd.dns2016.drones.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see hu.bme.mit.mdsd.dns2016.drones.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.mdsd.dns2016.drones.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.bme.mit.mdsd.dns2016.drones.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.mdsd.dns2016.drones.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see hu.bme.mit.mdsd.dns2016.drones.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.mdsd.dns2016.drones.Action#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see hu.bme.mit.mdsd.dns2016.drones.Action#getOperation()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Operation();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.mdsd.dns2016.drones.Action#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see hu.bme.mit.mdsd.dns2016.drones.Action#getKey()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Key();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.mdsd.dns2016.drones.Action#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see hu.bme.mit.mdsd.dns2016.drones.Action#getValue()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Value();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.mdsd.dns2016.drones.Action#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Range</em>'.
	 * @see hu.bme.mit.mdsd.dns2016.drones.Action#getRange()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Range();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.mdsd.dns2016.drones.MovableObject <em>Movable Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Movable Object</em>'.
	 * @see hu.bme.mit.mdsd.dns2016.drones.MovableObject
	 * @generated
	 */
	EClass getMovableObject();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.mdsd.dns2016.drones.MovableObject#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see hu.bme.mit.mdsd.dns2016.drones.MovableObject#getWeight()
	 * @see #getMovableObject()
	 * @generated
	 */
	EAttribute getMovableObject_Weight();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.mdsd.dns2016.drones.SizedElement <em>Sized Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sized Element</em>'.
	 * @see hu.bme.mit.mdsd.dns2016.drones.SizedElement
	 * @generated
	 */
	EClass getSizedElement();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.mdsd.dns2016.drones.SizedElement#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see hu.bme.mit.mdsd.dns2016.drones.SizedElement#getLength()
	 * @see #getSizedElement()
	 * @generated
	 */
	EAttribute getSizedElement_Length();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.mdsd.dns2016.drones.SizedElement#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see hu.bme.mit.mdsd.dns2016.drones.SizedElement#getHeight()
	 * @see #getSizedElement()
	 * @generated
	 */
	EAttribute getSizedElement_Height();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.mdsd.dns2016.drones.SizedElement#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see hu.bme.mit.mdsd.dns2016.drones.SizedElement#getWidth()
	 * @see #getSizedElement()
	 * @generated
	 */
	EAttribute getSizedElement_Width();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.mdsd.dns2016.drones.SizedElement#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see hu.bme.mit.mdsd.dns2016.drones.SizedElement#getX()
	 * @see #getSizedElement()
	 * @generated
	 */
	EAttribute getSizedElement_X();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.mdsd.dns2016.drones.SizedElement#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see hu.bme.mit.mdsd.dns2016.drones.SizedElement#getY()
	 * @see #getSizedElement()
	 * @generated
	 */
	EAttribute getSizedElement_Y();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.mdsd.dns2016.drones.SizedElement#getZ <em>Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Z</em>'.
	 * @see hu.bme.mit.mdsd.dns2016.drones.SizedElement#getZ()
	 * @see #getSizedElement()
	 * @generated
	 */
	EAttribute getSizedElement_Z();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.mdsd.dns2016.drones.ImmovableObject <em>Immovable Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Immovable Object</em>'.
	 * @see hu.bme.mit.mdsd.dns2016.drones.ImmovableObject
	 * @generated
	 */
	EClass getImmovableObject();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.mdsd.dns2016.drones.TemporalContainmentProxy <em>Temporal Containment Proxy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temporal Containment Proxy</em>'.
	 * @see hu.bme.mit.mdsd.dns2016.drones.TemporalContainmentProxy
	 * @generated
	 */
	EClass getTemporalContainmentProxy();

	/**
	 * Returns the meta object for enum '{@link hu.bme.mit.mdsd.dns2016.drones.ActionKind <em>Action Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Action Kind</em>'.
	 * @see hu.bme.mit.mdsd.dns2016.drones.ActionKind
	 * @generated
	 */
	EEnum getActionKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DronesFactory getDronesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link hu.bme.mit.mdsd.dns2016.drones.impl.FieldObjectImpl <em>Field Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.mdsd.dns2016.drones.impl.FieldObjectImpl
		 * @see hu.bme.mit.mdsd.dns2016.drones.impl.DronesPackageImpl#getFieldObject()
		 * @generated
		 */
		EClass FIELD_OBJECT = eINSTANCE.getFieldObject();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_OBJECT__PARAMETERS = eINSTANCE.getFieldObject_Parameters();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.mdsd.dns2016.drones.impl.DroneImpl <em>Drone</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.mdsd.dns2016.drones.impl.DroneImpl
		 * @see hu.bme.mit.mdsd.dns2016.drones.impl.DronesPackageImpl#getDrone()
		 * @generated
		 */
		EClass DRONE = eINSTANCE.getDrone();

		/**
		 * The meta object literal for the '<em><b>Battery</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRONE__BATTERY = eINSTANCE.getDrone_Battery();

		/**
		 * The meta object literal for the '<em><b>Charge Station</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRONE__CHARGE_STATION = eINSTANCE.getDrone_ChargeStation();

		/**
		 * The meta object literal for the '<em><b>Cpu Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRONE__CPU_FREQUENCY = eINSTANCE.getDrone_CpuFrequency();

		/**
		 * The meta object literal for the '<em><b>Memory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRONE__MEMORY = eINSTANCE.getDrone_Memory();

		/**
		 * The meta object literal for the '<em><b>Max Payload</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRONE__MAX_PAYLOAD = eINSTANCE.getDrone_MaxPayload();

		/**
		 * The meta object literal for the '<em><b>Communication Range</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRONE__COMMUNICATION_RANGE = eINSTANCE.getDrone_CommunicationRange();

		/**
		 * The meta object literal for the '<em><b>Min Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRONE__MIN_SPEED = eINSTANCE.getDrone_MinSpeed();

		/**
		 * The meta object literal for the '<em><b>Max Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRONE__MAX_SPEED = eINSTANCE.getDrone_MaxSpeed();

		/**
		 * The meta object literal for the '<em><b>Supported Actions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRONE__SUPPORTED_ACTIONS = eINSTANCE.getDrone_SupportedActions();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.mdsd.dns2016.drones.impl.BatteryImpl <em>Battery</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.mdsd.dns2016.drones.impl.BatteryImpl
		 * @see hu.bme.mit.mdsd.dns2016.drones.impl.DronesPackageImpl#getBattery()
		 * @generated
		 */
		EClass BATTERY = eINSTANCE.getBattery();

		/**
		 * The meta object literal for the '<em><b>Life Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BATTERY__LIFE_TIME = eINSTANCE.getBattery_LifeTime();

		/**
		 * The meta object literal for the '<em><b>Recharge Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BATTERY__RECHARGE_RATE = eINSTANCE.getBattery_RechargeRate();

		/**
		 * The meta object literal for the '<em><b>Charge</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BATTERY__CHARGE = eINSTANCE.getBattery_Charge();

		/**
		 * The meta object literal for the '<em><b>Remaining Life Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BATTERY__REMAINING_LIFE_TIME = eINSTANCE.getBattery_RemainingLifeTime();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.mdsd.dns2016.drones.impl.ChargeStationImpl <em>Charge Station</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.mdsd.dns2016.drones.impl.ChargeStationImpl
		 * @see hu.bme.mit.mdsd.dns2016.drones.impl.DronesPackageImpl#getChargeStation()
		 * @generated
		 */
		EClass CHARGE_STATION = eINSTANCE.getChargeStation();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.mdsd.dns2016.drones.impl.MissionImpl <em>Mission</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.mdsd.dns2016.drones.impl.MissionImpl
		 * @see hu.bme.mit.mdsd.dns2016.drones.impl.DronesPackageImpl#getMission()
		 * @generated
		 */
		EClass MISSION = eINSTANCE.getMission();

		/**
		 * The meta object literal for the '<em><b>Field Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MISSION__FIELD_OBJECTS = eINSTANCE.getMission_FieldObjects();

		/**
		 * The meta object literal for the '<em><b>Drones</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MISSION__DRONES = eINSTANCE.getMission_Drones();

		/**
		 * The meta object literal for the '<em><b>Temporal Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MISSION__TEMPORAL_OBJECTS = eINSTANCE.getMission_TemporalObjects();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MISSION__ACTIONS = eINSTANCE.getMission_Actions();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.mdsd.dns2016.drones.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.mdsd.dns2016.drones.impl.ParameterImpl
		 * @see hu.bme.mit.mdsd.dns2016.drones.impl.DronesPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__KEY = eINSTANCE.getParameter_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__VALUE = eINSTANCE.getParameter_Value();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.mdsd.dns2016.drones.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.mdsd.dns2016.drones.impl.NamedElementImpl
		 * @see hu.bme.mit.mdsd.dns2016.drones.impl.DronesPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.mdsd.dns2016.drones.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.mdsd.dns2016.drones.impl.ActionImpl
		 * @see hu.bme.mit.mdsd.dns2016.drones.impl.DronesPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__OPERATION = eINSTANCE.getAction_Operation();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__KEY = eINSTANCE.getAction_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__VALUE = eINSTANCE.getAction_Value();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__RANGE = eINSTANCE.getAction_Range();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.mdsd.dns2016.drones.impl.MovableObjectImpl <em>Movable Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.mdsd.dns2016.drones.impl.MovableObjectImpl
		 * @see hu.bme.mit.mdsd.dns2016.drones.impl.DronesPackageImpl#getMovableObject()
		 * @generated
		 */
		EClass MOVABLE_OBJECT = eINSTANCE.getMovableObject();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVABLE_OBJECT__WEIGHT = eINSTANCE.getMovableObject_Weight();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.mdsd.dns2016.drones.impl.SizedElementImpl <em>Sized Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.mdsd.dns2016.drones.impl.SizedElementImpl
		 * @see hu.bme.mit.mdsd.dns2016.drones.impl.DronesPackageImpl#getSizedElement()
		 * @generated
		 */
		EClass SIZED_ELEMENT = eINSTANCE.getSizedElement();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIZED_ELEMENT__LENGTH = eINSTANCE.getSizedElement_Length();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIZED_ELEMENT__HEIGHT = eINSTANCE.getSizedElement_Height();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIZED_ELEMENT__WIDTH = eINSTANCE.getSizedElement_Width();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIZED_ELEMENT__X = eINSTANCE.getSizedElement_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIZED_ELEMENT__Y = eINSTANCE.getSizedElement_Y();

		/**
		 * The meta object literal for the '<em><b>Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIZED_ELEMENT__Z = eINSTANCE.getSizedElement_Z();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.mdsd.dns2016.drones.impl.ImmovableObjectImpl <em>Immovable Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.mdsd.dns2016.drones.impl.ImmovableObjectImpl
		 * @see hu.bme.mit.mdsd.dns2016.drones.impl.DronesPackageImpl#getImmovableObject()
		 * @generated
		 */
		EClass IMMOVABLE_OBJECT = eINSTANCE.getImmovableObject();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.mdsd.dns2016.drones.impl.TemporalContainmentProxyImpl <em>Temporal Containment Proxy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.mdsd.dns2016.drones.impl.TemporalContainmentProxyImpl
		 * @see hu.bme.mit.mdsd.dns2016.drones.impl.DronesPackageImpl#getTemporalContainmentProxy()
		 * @generated
		 */
		EClass TEMPORAL_CONTAINMENT_PROXY = eINSTANCE.getTemporalContainmentProxy();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.mdsd.dns2016.drones.ActionKind <em>Action Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.mdsd.dns2016.drones.ActionKind
		 * @see hu.bme.mit.mdsd.dns2016.drones.impl.DronesPackageImpl#getActionKind()
		 * @generated
		 */
		EEnum ACTION_KIND = eINSTANCE.getActionKind();

	}

} //DronesPackage
