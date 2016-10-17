/**
 */
package hu.bme.mit.mdsd.dns2016.drones;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Movable Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.mdsd.dns2016.drones.MovableObject#getWeight <em>Weight</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.mdsd.dns2016.drones.DronesPackage#getMovableObject()
 * @model
 * @generated
 */
public interface MovableObject extends FieldObject {
	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(float)
	 * @see hu.bme.mit.mdsd.dns2016.drones.DronesPackage#getMovableObject_Weight()
	 * @model default="1.0"
	 * @generated
	 */
	float getWeight();

	/**
	 * Sets the value of the '{@link hu.bme.mit.mdsd.dns2016.drones.MovableObject#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(float value);

} // MovableObject
