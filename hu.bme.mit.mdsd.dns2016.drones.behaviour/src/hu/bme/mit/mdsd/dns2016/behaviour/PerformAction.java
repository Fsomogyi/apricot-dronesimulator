/**
 */
package hu.bme.mit.mdsd.dns2016.behaviour;

import hu.bme.mit.mdsd.dns2016.drones.Action;
import hu.bme.mit.mdsd.dns2016.drones.FieldObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Perform Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.mdsd.dns2016.behaviour.PerformAction#getAction <em>Action</em>}</li>
 *   <li>{@link hu.bme.mit.mdsd.dns2016.behaviour.PerformAction#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.mdsd.dns2016.behaviour.BehaviourPackage#getPerformAction()
 * @model
 * @generated
 */
public interface PerformAction extends Instruction {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' reference.
	 * @see #setAction(Action)
	 * @see hu.bme.mit.mdsd.dns2016.behaviour.BehaviourPackage#getPerformAction_Action()
	 * @model required="true"
	 * @generated
	 */
	Action getAction();

	/**
	 * Sets the value of the '{@link hu.bme.mit.mdsd.dns2016.behaviour.PerformAction#getAction <em>Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(Action value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(FieldObject)
	 * @see hu.bme.mit.mdsd.dns2016.behaviour.BehaviourPackage#getPerformAction_Target()
	 * @model required="true"
	 * @generated
	 */
	FieldObject getTarget();

	/**
	 * Sets the value of the '{@link hu.bme.mit.mdsd.dns2016.behaviour.PerformAction#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(FieldObject value);

} // PerformAction
