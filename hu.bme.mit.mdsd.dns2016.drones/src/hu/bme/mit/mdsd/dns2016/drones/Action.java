/**
 */
package hu.bme.mit.mdsd.dns2016.drones;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.mdsd.dns2016.drones.Action#getOperation <em>Operation</em>}</li>
 *   <li>{@link hu.bme.mit.mdsd.dns2016.drones.Action#getKey <em>Key</em>}</li>
 *   <li>{@link hu.bme.mit.mdsd.dns2016.drones.Action#getValue <em>Value</em>}</li>
 *   <li>{@link hu.bme.mit.mdsd.dns2016.drones.Action#getRange <em>Range</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.mdsd.dns2016.drones.DronesPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends TemporalContainmentProxy, NamedElement {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link hu.bme.mit.mdsd.dns2016.drones.ActionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' attribute.
	 * @see hu.bme.mit.mdsd.dns2016.drones.ActionKind
	 * @see #setOperation(ActionKind)
	 * @see hu.bme.mit.mdsd.dns2016.drones.DronesPackage#getAction_Operation()
	 * @model
	 * @generated
	 */
	ActionKind getOperation();

	/**
	 * Sets the value of the '{@link hu.bme.mit.mdsd.dns2016.drones.Action#getOperation <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' attribute.
	 * @see hu.bme.mit.mdsd.dns2016.drones.ActionKind
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(ActionKind value);

	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see hu.bme.mit.mdsd.dns2016.drones.DronesPackage#getAction_Key()
	 * @model
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link hu.bme.mit.mdsd.dns2016.drones.Action#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see hu.bme.mit.mdsd.dns2016.drones.DronesPackage#getAction_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link hu.bme.mit.mdsd.dns2016.drones.Action#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Range</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' attribute.
	 * @see #setRange(float)
	 * @see hu.bme.mit.mdsd.dns2016.drones.DronesPackage#getAction_Range()
	 * @model default="1.0"
	 * @generated
	 */
	float getRange();

	/**
	 * Sets the value of the '{@link hu.bme.mit.mdsd.dns2016.drones.Action#getRange <em>Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' attribute.
	 * @see #getRange()
	 * @generated
	 */
	void setRange(float value);

} // Action
