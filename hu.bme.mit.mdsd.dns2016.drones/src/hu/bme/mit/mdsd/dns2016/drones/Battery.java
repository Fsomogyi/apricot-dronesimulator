/**
 */
package hu.bme.mit.mdsd.dns2016.drones;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Battery</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.mdsd.dns2016.drones.Battery#getLifeTime <em>Life Time</em>}</li>
 *   <li>{@link hu.bme.mit.mdsd.dns2016.drones.Battery#getRechargeRate <em>Recharge Rate</em>}</li>
 *   <li>{@link hu.bme.mit.mdsd.dns2016.drones.Battery#getCharge <em>Charge</em>}</li>
 *   <li>{@link hu.bme.mit.mdsd.dns2016.drones.Battery#getRemainingLifeTime <em>Remaining Life Time</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.mdsd.dns2016.drones.DronesPackage#getBattery()
 * @model
 * @generated
 */
public interface Battery extends TemporalContainmentProxy {
	/**
	 * Returns the value of the '<em><b>Life Time</b></em>' attribute.
	 * The default value is <code>"900"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Life Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Life Time</em>' attribute.
	 * @see #setLifeTime(float)
	 * @see hu.bme.mit.mdsd.dns2016.drones.DronesPackage#getBattery_LifeTime()
	 * @model default="900"
	 * @generated
	 */
	float getLifeTime();

	/**
	 * Sets the value of the '{@link hu.bme.mit.mdsd.dns2016.drones.Battery#getLifeTime <em>Life Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Life Time</em>' attribute.
	 * @see #getLifeTime()
	 * @generated
	 */
	void setLifeTime(float value);

	/**
	 * Returns the value of the '<em><b>Recharge Rate</b></em>' attribute.
	 * The default value is <code>"0.5"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recharge Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recharge Rate</em>' attribute.
	 * @see #setRechargeRate(float)
	 * @see hu.bme.mit.mdsd.dns2016.drones.DronesPackage#getBattery_RechargeRate()
	 * @model default="0.5"
	 * @generated
	 */
	float getRechargeRate();

	/**
	 * Sets the value of the '{@link hu.bme.mit.mdsd.dns2016.drones.Battery#getRechargeRate <em>Recharge Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recharge Rate</em>' attribute.
	 * @see #getRechargeRate()
	 * @generated
	 */
	void setRechargeRate(float value);

	/**
	 * Returns the value of the '<em><b>Charge</b></em>' attribute.
	 * The default value is <code>"100"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Charge</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charge</em>' attribute.
	 * @see hu.bme.mit.mdsd.dns2016.drones.DronesPackage#getBattery_Charge()
	 * @model default="100" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="org.eclipse.incquery.querybasedfeature patternFQN='hu.bme.mit.mdsd.dns2016.drones.queries.charge'"
	 * @generated
	 */
	float getCharge();

	/**
	 * Returns the value of the '<em><b>Remaining Life Time</b></em>' attribute.
	 * The default value is <code>"900"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remaining Life Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remaining Life Time</em>' attribute.
	 * @see #setRemainingLifeTime(float)
	 * @see hu.bme.mit.mdsd.dns2016.drones.DronesPackage#getBattery_RemainingLifeTime()
	 * @model default="900"
	 * @generated
	 */
	float getRemainingLifeTime();

	/**
	 * Sets the value of the '{@link hu.bme.mit.mdsd.dns2016.drones.Battery#getRemainingLifeTime <em>Remaining Life Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remaining Life Time</em>' attribute.
	 * @see #getRemainingLifeTime()
	 * @generated
	 */
	void setRemainingLifeTime(float value);

} // Battery
