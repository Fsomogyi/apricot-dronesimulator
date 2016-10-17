/**
 */
package hu.bme.mit.mdsd.dns2016.behaviour;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wait For Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.mdsd.dns2016.behaviour.WaitForMessage#getType <em>Type</em>}</li>
 *   <li>{@link hu.bme.mit.mdsd.dns2016.behaviour.WaitForMessage#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link hu.bme.mit.mdsd.dns2016.behaviour.WaitForMessage#getWhenArrived <em>When Arrived</em>}</li>
 *   <li>{@link hu.bme.mit.mdsd.dns2016.behaviour.WaitForMessage#getWhenLost <em>When Lost</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.mdsd.dns2016.behaviour.BehaviourPackage#getWaitForMessage()
 * @model
 * @generated
 */
public interface WaitForMessage extends Instruction {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see hu.bme.mit.mdsd.dns2016.behaviour.BehaviourPackage#getWaitForMessage_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link hu.bme.mit.mdsd.dns2016.behaviour.WaitForMessage#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timeout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timeout</em>' attribute.
	 * @see #setTimeout(float)
	 * @see hu.bme.mit.mdsd.dns2016.behaviour.BehaviourPackage#getWaitForMessage_Timeout()
	 * @model
	 * @generated
	 */
	float getTimeout();

	/**
	 * Sets the value of the '{@link hu.bme.mit.mdsd.dns2016.behaviour.WaitForMessage#getTimeout <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeout</em>' attribute.
	 * @see #getTimeout()
	 * @generated
	 */
	void setTimeout(float value);

	/**
	 * Returns the value of the '<em><b>When Arrived</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.mdsd.dns2016.behaviour.Instruction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>When Arrived</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>When Arrived</em>' containment reference list.
	 * @see hu.bme.mit.mdsd.dns2016.behaviour.BehaviourPackage#getWaitForMessage_WhenArrived()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Instruction> getWhenArrived();

	/**
	 * Returns the value of the '<em><b>When Lost</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.mdsd.dns2016.behaviour.Instruction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>When Lost</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>When Lost</em>' containment reference list.
	 * @see hu.bme.mit.mdsd.dns2016.behaviour.BehaviourPackage#getWaitForMessage_WhenLost()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Instruction> getWhenLost();

} // WaitForMessage
