/**
 */
package hu.bme.mit.mdsd.dns2016.behaviour;

import hu.bme.mit.mdsd.dns2016.drones.FieldObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Move To</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.mdsd.dns2016.behaviour.MoveTo#getFieldObject <em>Field Object</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.mdsd.dns2016.behaviour.BehaviourPackage#getMoveTo()
 * @model
 * @generated
 */
public interface MoveTo extends Instruction {
	/**
	 * Returns the value of the '<em><b>Field Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Object</em>' reference.
	 * @see #setFieldObject(FieldObject)
	 * @see hu.bme.mit.mdsd.dns2016.behaviour.BehaviourPackage#getMoveTo_FieldObject()
	 * @model required="true"
	 * @generated
	 */
	FieldObject getFieldObject();

	/**
	 * Sets the value of the '{@link hu.bme.mit.mdsd.dns2016.behaviour.MoveTo#getFieldObject <em>Field Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Object</em>' reference.
	 * @see #getFieldObject()
	 * @generated
	 */
	void setFieldObject(FieldObject value);

} // MoveTo
