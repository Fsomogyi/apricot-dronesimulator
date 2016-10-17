/**
 */
package hu.bme.mit.mdsd.dns2016.behaviour;

import hu.bme.mit.mdsd.dns2016.drones.MovableObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lift</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.mdsd.dns2016.behaviour.Lift#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.mdsd.dns2016.behaviour.BehaviourPackage#getLift()
 * @model
 * @generated
 */
public interface Lift extends Instruction {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(MovableObject)
	 * @see hu.bme.mit.mdsd.dns2016.behaviour.BehaviourPackage#getLift_Target()
	 * @model required="true"
	 * @generated
	 */
	MovableObject getTarget();

	/**
	 * Sets the value of the '{@link hu.bme.mit.mdsd.dns2016.behaviour.Lift#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(MovableObject value);

} // Lift
