/**
 */
package hu.bme.mit.mdsd.dns2016.drones;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Drone</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.mdsd.dns2016.drones.Drone#getBattery <em>Battery</em>}</li>
 *   <li>{@link hu.bme.mit.mdsd.dns2016.drones.Drone#getChargeStation <em>Charge Station</em>}</li>
 *   <li>{@link hu.bme.mit.mdsd.dns2016.drones.Drone#getCpuFrequency <em>Cpu Frequency</em>}</li>
 *   <li>{@link hu.bme.mit.mdsd.dns2016.drones.Drone#getMemory <em>Memory</em>}</li>
 *   <li>{@link hu.bme.mit.mdsd.dns2016.drones.Drone#getMaxPayload <em>Max Payload</em>}</li>
 *   <li>{@link hu.bme.mit.mdsd.dns2016.drones.Drone#getCommunicationRange <em>Communication Range</em>}</li>
 *   <li>{@link hu.bme.mit.mdsd.dns2016.drones.Drone#getMinSpeed <em>Min Speed</em>}</li>
 *   <li>{@link hu.bme.mit.mdsd.dns2016.drones.Drone#getMaxSpeed <em>Max Speed</em>}</li>
 *   <li>{@link hu.bme.mit.mdsd.dns2016.drones.Drone#getSupportedActions <em>Supported Actions</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.mdsd.dns2016.drones.DronesPackage#getDrone()
 * @model
 * @generated
 */
public interface Drone extends NamedElement, SizedElement {
	/**
	 * Returns the value of the '<em><b>Battery</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Battery</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Battery</em>' containment reference.
	 * @see #setBattery(Battery)
	 * @see hu.bme.mit.mdsd.dns2016.drones.DronesPackage#getDrone_Battery()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Battery getBattery();

	/**
	 * Sets the value of the '{@link hu.bme.mit.mdsd.dns2016.drones.Drone#getBattery <em>Battery</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Battery</em>' containment reference.
	 * @see #getBattery()
	 * @generated
	 */
	void setBattery(Battery value);

	/**
	 * Returns the value of the '<em><b>Charge Station</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Charge Station</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charge Station</em>' reference.
	 * @see #setChargeStation(ChargeStation)
	 * @see hu.bme.mit.mdsd.dns2016.drones.DronesPackage#getDrone_ChargeStation()
	 * @model required="true"
	 * @generated
	 */
	ChargeStation getChargeStation();

	/**
	 * Sets the value of the '{@link hu.bme.mit.mdsd.dns2016.drones.Drone#getChargeStation <em>Charge Station</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charge Station</em>' reference.
	 * @see #getChargeStation()
	 * @generated
	 */
	void setChargeStation(ChargeStation value);

	/**
	 * Returns the value of the '<em><b>Cpu Frequency</b></em>' attribute.
	 * The default value is <code>"2250"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cpu Frequency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cpu Frequency</em>' attribute.
	 * @see #setCpuFrequency(int)
	 * @see hu.bme.mit.mdsd.dns2016.drones.DronesPackage#getDrone_CpuFrequency()
	 * @model default="2250"
	 * @generated
	 */
	int getCpuFrequency();

	/**
	 * Sets the value of the '{@link hu.bme.mit.mdsd.dns2016.drones.Drone#getCpuFrequency <em>Cpu Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cpu Frequency</em>' attribute.
	 * @see #getCpuFrequency()
	 * @generated
	 */
	void setCpuFrequency(int value);

	/**
	 * Returns the value of the '<em><b>Memory</b></em>' attribute.
	 * The default value is <code>"4"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory</em>' attribute.
	 * @see #setMemory(int)
	 * @see hu.bme.mit.mdsd.dns2016.drones.DronesPackage#getDrone_Memory()
	 * @model default="4"
	 * @generated
	 */
	int getMemory();

	/**
	 * Sets the value of the '{@link hu.bme.mit.mdsd.dns2016.drones.Drone#getMemory <em>Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory</em>' attribute.
	 * @see #getMemory()
	 * @generated
	 */
	void setMemory(int value);

	/**
	 * Returns the value of the '<em><b>Max Payload</b></em>' attribute.
	 * The default value is <code>"2.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Payload</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Payload</em>' attribute.
	 * @see #setMaxPayload(float)
	 * @see hu.bme.mit.mdsd.dns2016.drones.DronesPackage#getDrone_MaxPayload()
	 * @model default="2.0"
	 * @generated
	 */
	float getMaxPayload();

	/**
	 * Sets the value of the '{@link hu.bme.mit.mdsd.dns2016.drones.Drone#getMaxPayload <em>Max Payload</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Payload</em>' attribute.
	 * @see #getMaxPayload()
	 * @generated
	 */
	void setMaxPayload(float value);

	/**
	 * Returns the value of the '<em><b>Communication Range</b></em>' attribute.
	 * The default value is <code>"50.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communication Range</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Range</em>' attribute.
	 * @see #setCommunicationRange(float)
	 * @see hu.bme.mit.mdsd.dns2016.drones.DronesPackage#getDrone_CommunicationRange()
	 * @model default="50.0"
	 * @generated
	 */
	float getCommunicationRange();

	/**
	 * Sets the value of the '{@link hu.bme.mit.mdsd.dns2016.drones.Drone#getCommunicationRange <em>Communication Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Communication Range</em>' attribute.
	 * @see #getCommunicationRange()
	 * @generated
	 */
	void setCommunicationRange(float value);

	/**
	 * Returns the value of the '<em><b>Min Speed</b></em>' attribute.
	 * The default value is <code>"5"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Speed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Speed</em>' attribute.
	 * @see #setMinSpeed(float)
	 * @see hu.bme.mit.mdsd.dns2016.drones.DronesPackage#getDrone_MinSpeed()
	 * @model default="5"
	 * @generated
	 */
	float getMinSpeed();

	/**
	 * Sets the value of the '{@link hu.bme.mit.mdsd.dns2016.drones.Drone#getMinSpeed <em>Min Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Speed</em>' attribute.
	 * @see #getMinSpeed()
	 * @generated
	 */
	void setMinSpeed(float value);

	/**
	 * Returns the value of the '<em><b>Max Speed</b></em>' attribute.
	 * The default value is <code>"20"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Speed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Speed</em>' attribute.
	 * @see #setMaxSpeed(float)
	 * @see hu.bme.mit.mdsd.dns2016.drones.DronesPackage#getDrone_MaxSpeed()
	 * @model default="20"
	 * @generated
	 */
	float getMaxSpeed();

	/**
	 * Sets the value of the '{@link hu.bme.mit.mdsd.dns2016.drones.Drone#getMaxSpeed <em>Max Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Speed</em>' attribute.
	 * @see #getMaxSpeed()
	 * @generated
	 */
	void setMaxSpeed(float value);

	/**
	 * Returns the value of the '<em><b>Supported Actions</b></em>' reference list.
	 * The list contents are of type {@link hu.bme.mit.mdsd.dns2016.drones.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supported Actions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supported Actions</em>' reference list.
	 * @see hu.bme.mit.mdsd.dns2016.drones.DronesPackage#getDrone_SupportedActions()
	 * @model
	 * @generated
	 */
	EList<Action> getSupportedActions();

} // Drone
