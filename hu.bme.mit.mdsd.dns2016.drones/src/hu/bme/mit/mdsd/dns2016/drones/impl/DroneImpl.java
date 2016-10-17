/**
 */
package hu.bme.mit.mdsd.dns2016.drones.impl;

import hu.bme.mit.mdsd.dns2016.drones.Action;
import hu.bme.mit.mdsd.dns2016.drones.Battery;
import hu.bme.mit.mdsd.dns2016.drones.ChargeStation;
import hu.bme.mit.mdsd.dns2016.drones.Drone;
import hu.bme.mit.mdsd.dns2016.drones.DronesPackage;
import hu.bme.mit.mdsd.dns2016.drones.SizedElement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Drone</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.mdsd.dns2016.drones.impl.DroneImpl#getLength <em>Length</em>}</li>
 *   <li>{@link hu.bme.mit.mdsd.dns2016.drones.impl.DroneImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link hu.bme.mit.mdsd.dns2016.drones.impl.DroneImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link hu.bme.mit.mdsd.dns2016.drones.impl.DroneImpl#getX <em>X</em>}</li>
 *   <li>{@link hu.bme.mit.mdsd.dns2016.drones.impl.DroneImpl#getY <em>Y</em>}</li>
 *   <li>{@link hu.bme.mit.mdsd.dns2016.drones.impl.DroneImpl#getZ <em>Z</em>}</li>
 *   <li>{@link hu.bme.mit.mdsd.dns2016.drones.impl.DroneImpl#getBattery <em>Battery</em>}</li>
 *   <li>{@link hu.bme.mit.mdsd.dns2016.drones.impl.DroneImpl#getChargeStation <em>Charge Station</em>}</li>
 *   <li>{@link hu.bme.mit.mdsd.dns2016.drones.impl.DroneImpl#getCpuFrequency <em>Cpu Frequency</em>}</li>
 *   <li>{@link hu.bme.mit.mdsd.dns2016.drones.impl.DroneImpl#getMemory <em>Memory</em>}</li>
 *   <li>{@link hu.bme.mit.mdsd.dns2016.drones.impl.DroneImpl#getMaxPayload <em>Max Payload</em>}</li>
 *   <li>{@link hu.bme.mit.mdsd.dns2016.drones.impl.DroneImpl#getCommunicationRange <em>Communication Range</em>}</li>
 *   <li>{@link hu.bme.mit.mdsd.dns2016.drones.impl.DroneImpl#getMinSpeed <em>Min Speed</em>}</li>
 *   <li>{@link hu.bme.mit.mdsd.dns2016.drones.impl.DroneImpl#getMaxSpeed <em>Max Speed</em>}</li>
 *   <li>{@link hu.bme.mit.mdsd.dns2016.drones.impl.DroneImpl#getSupportedActions <em>Supported Actions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DroneImpl extends NamedElementImpl implements Drone {
	/**
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final float LENGTH_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected float length = LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final float HEIGHT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected float height = HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final float WIDTH_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected float width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final float X_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected float x = X_EDEFAULT;

	/**
	 * The default value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected static final float Y_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected float y = Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getZ() <em>Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZ()
	 * @generated
	 * @ordered
	 */
	protected static final float Z_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getZ() <em>Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZ()
	 * @generated
	 * @ordered
	 */
	protected float z = Z_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBattery() <em>Battery</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBattery()
	 * @generated
	 * @ordered
	 */
	protected Battery battery;

	/**
	 * The cached value of the '{@link #getChargeStation() <em>Charge Station</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChargeStation()
	 * @generated
	 * @ordered
	 */
	protected ChargeStation chargeStation;

	/**
	 * The default value of the '{@link #getCpuFrequency() <em>Cpu Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpuFrequency()
	 * @generated
	 * @ordered
	 */
	protected static final int CPU_FREQUENCY_EDEFAULT = 2250;

	/**
	 * The cached value of the '{@link #getCpuFrequency() <em>Cpu Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpuFrequency()
	 * @generated
	 * @ordered
	 */
	protected int cpuFrequency = CPU_FREQUENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMemory() <em>Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemory()
	 * @generated
	 * @ordered
	 */
	protected static final int MEMORY_EDEFAULT = 4;

	/**
	 * The cached value of the '{@link #getMemory() <em>Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemory()
	 * @generated
	 * @ordered
	 */
	protected int memory = MEMORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxPayload() <em>Max Payload</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxPayload()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_PAYLOAD_EDEFAULT = 2.0F;

	/**
	 * The cached value of the '{@link #getMaxPayload() <em>Max Payload</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxPayload()
	 * @generated
	 * @ordered
	 */
	protected float maxPayload = MAX_PAYLOAD_EDEFAULT;

	/**
	 * The default value of the '{@link #getCommunicationRange() <em>Communication Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationRange()
	 * @generated
	 * @ordered
	 */
	protected static final float COMMUNICATION_RANGE_EDEFAULT = 50.0F;

	/**
	 * The cached value of the '{@link #getCommunicationRange() <em>Communication Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationRange()
	 * @generated
	 * @ordered
	 */
	protected float communicationRange = COMMUNICATION_RANGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinSpeed() <em>Min Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final float MIN_SPEED_EDEFAULT = 5.0F;

	/**
	 * The cached value of the '{@link #getMinSpeed() <em>Min Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinSpeed()
	 * @generated
	 * @ordered
	 */
	protected float minSpeed = MIN_SPEED_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxSpeed() <em>Max Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_SPEED_EDEFAULT = 20.0F;

	/**
	 * The cached value of the '{@link #getMaxSpeed() <em>Max Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSpeed()
	 * @generated
	 * @ordered
	 */
	protected float maxSpeed = MAX_SPEED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSupportedActions() <em>Supported Actions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> supportedActions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DroneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DronesPackage.Literals.DRONE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength(float newLength) {
		float oldLength = length;
		length = newLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronesPackage.DRONE__LENGTH, oldLength, length));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(float newHeight) {
		float oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronesPackage.DRONE__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(float newWidth) {
		float oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronesPackage.DRONE__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX(float newX) {
		float oldX = x;
		x = newX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronesPackage.DRONE__X, oldX, x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getY() {
		return y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY(float newY) {
		float oldY = y;
		y = newY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronesPackage.DRONE__Y, oldY, y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getZ() {
		return z;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZ(float newZ) {
		float oldZ = z;
		z = newZ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronesPackage.DRONE__Z, oldZ, z));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Battery getBattery() {
		return battery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBattery(Battery newBattery, NotificationChain msgs) {
		Battery oldBattery = battery;
		battery = newBattery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DronesPackage.DRONE__BATTERY, oldBattery, newBattery);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBattery(Battery newBattery) {
		if (newBattery != battery) {
			NotificationChain msgs = null;
			if (battery != null)
				msgs = ((InternalEObject)battery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DronesPackage.DRONE__BATTERY, null, msgs);
			if (newBattery != null)
				msgs = ((InternalEObject)newBattery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DronesPackage.DRONE__BATTERY, null, msgs);
			msgs = basicSetBattery(newBattery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronesPackage.DRONE__BATTERY, newBattery, newBattery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChargeStation getChargeStation() {
		if (chargeStation != null && chargeStation.eIsProxy()) {
			InternalEObject oldChargeStation = (InternalEObject)chargeStation;
			chargeStation = (ChargeStation)eResolveProxy(oldChargeStation);
			if (chargeStation != oldChargeStation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DronesPackage.DRONE__CHARGE_STATION, oldChargeStation, chargeStation));
			}
		}
		return chargeStation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChargeStation basicGetChargeStation() {
		return chargeStation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChargeStation(ChargeStation newChargeStation) {
		ChargeStation oldChargeStation = chargeStation;
		chargeStation = newChargeStation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronesPackage.DRONE__CHARGE_STATION, oldChargeStation, chargeStation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCpuFrequency() {
		return cpuFrequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCpuFrequency(int newCpuFrequency) {
		int oldCpuFrequency = cpuFrequency;
		cpuFrequency = newCpuFrequency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronesPackage.DRONE__CPU_FREQUENCY, oldCpuFrequency, cpuFrequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMemory() {
		return memory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemory(int newMemory) {
		int oldMemory = memory;
		memory = newMemory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronesPackage.DRONE__MEMORY, oldMemory, memory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMaxPayload() {
		return maxPayload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxPayload(float newMaxPayload) {
		float oldMaxPayload = maxPayload;
		maxPayload = newMaxPayload;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronesPackage.DRONE__MAX_PAYLOAD, oldMaxPayload, maxPayload));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCommunicationRange() {
		return communicationRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommunicationRange(float newCommunicationRange) {
		float oldCommunicationRange = communicationRange;
		communicationRange = newCommunicationRange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronesPackage.DRONE__COMMUNICATION_RANGE, oldCommunicationRange, communicationRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMinSpeed() {
		return minSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinSpeed(float newMinSpeed) {
		float oldMinSpeed = minSpeed;
		minSpeed = newMinSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronesPackage.DRONE__MIN_SPEED, oldMinSpeed, minSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMaxSpeed() {
		return maxSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxSpeed(float newMaxSpeed) {
		float oldMaxSpeed = maxSpeed;
		maxSpeed = newMaxSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronesPackage.DRONE__MAX_SPEED, oldMaxSpeed, maxSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getSupportedActions() {
		if (supportedActions == null) {
			supportedActions = new EObjectResolvingEList<Action>(Action.class, this, DronesPackage.DRONE__SUPPORTED_ACTIONS);
		}
		return supportedActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DronesPackage.DRONE__BATTERY:
				return basicSetBattery(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DronesPackage.DRONE__LENGTH:
				return getLength();
			case DronesPackage.DRONE__HEIGHT:
				return getHeight();
			case DronesPackage.DRONE__WIDTH:
				return getWidth();
			case DronesPackage.DRONE__X:
				return getX();
			case DronesPackage.DRONE__Y:
				return getY();
			case DronesPackage.DRONE__Z:
				return getZ();
			case DronesPackage.DRONE__BATTERY:
				return getBattery();
			case DronesPackage.DRONE__CHARGE_STATION:
				if (resolve) return getChargeStation();
				return basicGetChargeStation();
			case DronesPackage.DRONE__CPU_FREQUENCY:
				return getCpuFrequency();
			case DronesPackage.DRONE__MEMORY:
				return getMemory();
			case DronesPackage.DRONE__MAX_PAYLOAD:
				return getMaxPayload();
			case DronesPackage.DRONE__COMMUNICATION_RANGE:
				return getCommunicationRange();
			case DronesPackage.DRONE__MIN_SPEED:
				return getMinSpeed();
			case DronesPackage.DRONE__MAX_SPEED:
				return getMaxSpeed();
			case DronesPackage.DRONE__SUPPORTED_ACTIONS:
				return getSupportedActions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DronesPackage.DRONE__LENGTH:
				setLength((Float)newValue);
				return;
			case DronesPackage.DRONE__HEIGHT:
				setHeight((Float)newValue);
				return;
			case DronesPackage.DRONE__WIDTH:
				setWidth((Float)newValue);
				return;
			case DronesPackage.DRONE__X:
				setX((Float)newValue);
				return;
			case DronesPackage.DRONE__Y:
				setY((Float)newValue);
				return;
			case DronesPackage.DRONE__Z:
				setZ((Float)newValue);
				return;
			case DronesPackage.DRONE__BATTERY:
				setBattery((Battery)newValue);
				return;
			case DronesPackage.DRONE__CHARGE_STATION:
				setChargeStation((ChargeStation)newValue);
				return;
			case DronesPackage.DRONE__CPU_FREQUENCY:
				setCpuFrequency((Integer)newValue);
				return;
			case DronesPackage.DRONE__MEMORY:
				setMemory((Integer)newValue);
				return;
			case DronesPackage.DRONE__MAX_PAYLOAD:
				setMaxPayload((Float)newValue);
				return;
			case DronesPackage.DRONE__COMMUNICATION_RANGE:
				setCommunicationRange((Float)newValue);
				return;
			case DronesPackage.DRONE__MIN_SPEED:
				setMinSpeed((Float)newValue);
				return;
			case DronesPackage.DRONE__MAX_SPEED:
				setMaxSpeed((Float)newValue);
				return;
			case DronesPackage.DRONE__SUPPORTED_ACTIONS:
				getSupportedActions().clear();
				getSupportedActions().addAll((Collection<? extends Action>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DronesPackage.DRONE__LENGTH:
				setLength(LENGTH_EDEFAULT);
				return;
			case DronesPackage.DRONE__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case DronesPackage.DRONE__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case DronesPackage.DRONE__X:
				setX(X_EDEFAULT);
				return;
			case DronesPackage.DRONE__Y:
				setY(Y_EDEFAULT);
				return;
			case DronesPackage.DRONE__Z:
				setZ(Z_EDEFAULT);
				return;
			case DronesPackage.DRONE__BATTERY:
				setBattery((Battery)null);
				return;
			case DronesPackage.DRONE__CHARGE_STATION:
				setChargeStation((ChargeStation)null);
				return;
			case DronesPackage.DRONE__CPU_FREQUENCY:
				setCpuFrequency(CPU_FREQUENCY_EDEFAULT);
				return;
			case DronesPackage.DRONE__MEMORY:
				setMemory(MEMORY_EDEFAULT);
				return;
			case DronesPackage.DRONE__MAX_PAYLOAD:
				setMaxPayload(MAX_PAYLOAD_EDEFAULT);
				return;
			case DronesPackage.DRONE__COMMUNICATION_RANGE:
				setCommunicationRange(COMMUNICATION_RANGE_EDEFAULT);
				return;
			case DronesPackage.DRONE__MIN_SPEED:
				setMinSpeed(MIN_SPEED_EDEFAULT);
				return;
			case DronesPackage.DRONE__MAX_SPEED:
				setMaxSpeed(MAX_SPEED_EDEFAULT);
				return;
			case DronesPackage.DRONE__SUPPORTED_ACTIONS:
				getSupportedActions().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DronesPackage.DRONE__LENGTH:
				return length != LENGTH_EDEFAULT;
			case DronesPackage.DRONE__HEIGHT:
				return height != HEIGHT_EDEFAULT;
			case DronesPackage.DRONE__WIDTH:
				return width != WIDTH_EDEFAULT;
			case DronesPackage.DRONE__X:
				return x != X_EDEFAULT;
			case DronesPackage.DRONE__Y:
				return y != Y_EDEFAULT;
			case DronesPackage.DRONE__Z:
				return z != Z_EDEFAULT;
			case DronesPackage.DRONE__BATTERY:
				return battery != null;
			case DronesPackage.DRONE__CHARGE_STATION:
				return chargeStation != null;
			case DronesPackage.DRONE__CPU_FREQUENCY:
				return cpuFrequency != CPU_FREQUENCY_EDEFAULT;
			case DronesPackage.DRONE__MEMORY:
				return memory != MEMORY_EDEFAULT;
			case DronesPackage.DRONE__MAX_PAYLOAD:
				return maxPayload != MAX_PAYLOAD_EDEFAULT;
			case DronesPackage.DRONE__COMMUNICATION_RANGE:
				return communicationRange != COMMUNICATION_RANGE_EDEFAULT;
			case DronesPackage.DRONE__MIN_SPEED:
				return minSpeed != MIN_SPEED_EDEFAULT;
			case DronesPackage.DRONE__MAX_SPEED:
				return maxSpeed != MAX_SPEED_EDEFAULT;
			case DronesPackage.DRONE__SUPPORTED_ACTIONS:
				return supportedActions != null && !supportedActions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == SizedElement.class) {
			switch (derivedFeatureID) {
				case DronesPackage.DRONE__LENGTH: return DronesPackage.SIZED_ELEMENT__LENGTH;
				case DronesPackage.DRONE__HEIGHT: return DronesPackage.SIZED_ELEMENT__HEIGHT;
				case DronesPackage.DRONE__WIDTH: return DronesPackage.SIZED_ELEMENT__WIDTH;
				case DronesPackage.DRONE__X: return DronesPackage.SIZED_ELEMENT__X;
				case DronesPackage.DRONE__Y: return DronesPackage.SIZED_ELEMENT__Y;
				case DronesPackage.DRONE__Z: return DronesPackage.SIZED_ELEMENT__Z;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == SizedElement.class) {
			switch (baseFeatureID) {
				case DronesPackage.SIZED_ELEMENT__LENGTH: return DronesPackage.DRONE__LENGTH;
				case DronesPackage.SIZED_ELEMENT__HEIGHT: return DronesPackage.DRONE__HEIGHT;
				case DronesPackage.SIZED_ELEMENT__WIDTH: return DronesPackage.DRONE__WIDTH;
				case DronesPackage.SIZED_ELEMENT__X: return DronesPackage.DRONE__X;
				case DronesPackage.SIZED_ELEMENT__Y: return DronesPackage.DRONE__Y;
				case DronesPackage.SIZED_ELEMENT__Z: return DronesPackage.DRONE__Z;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (length: ");
		result.append(length);
		result.append(", height: ");
		result.append(height);
		result.append(", width: ");
		result.append(width);
		result.append(", x: ");
		result.append(x);
		result.append(", y: ");
		result.append(y);
		result.append(", z: ");
		result.append(z);
		result.append(", cpuFrequency: ");
		result.append(cpuFrequency);
		result.append(", memory: ");
		result.append(memory);
		result.append(", maxPayload: ");
		result.append(maxPayload);
		result.append(", communicationRange: ");
		result.append(communicationRange);
		result.append(", minSpeed: ");
		result.append(minSpeed);
		result.append(", maxSpeed: ");
		result.append(maxSpeed);
		result.append(')');
		return result.toString();
	}

} //DroneImpl
