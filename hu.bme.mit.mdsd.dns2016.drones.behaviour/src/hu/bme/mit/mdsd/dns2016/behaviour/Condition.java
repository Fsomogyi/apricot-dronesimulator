/**
 */
package hu.bme.mit.mdsd.dns2016.behaviour;

import hu.bme.mit.mdsd.dns2016.drones.FieldObject;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.mdsd.dns2016.behaviour.Condition#getOperation <em>Operation</em>}</li>
 *   <li>{@link hu.bme.mit.mdsd.dns2016.behaviour.Condition#getFieldObject <em>Field Object</em>}</li>
 *   <li>{@link hu.bme.mit.mdsd.dns2016.behaviour.Condition#getKey <em>Key</em>}</li>
 *   <li>{@link hu.bme.mit.mdsd.dns2016.behaviour.Condition#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.mdsd.dns2016.behaviour.BehaviourPackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends EObject {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link hu.bme.mit.mdsd.dns2016.behaviour.ConditionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' attribute.
	 * @see hu.bme.mit.mdsd.dns2016.behaviour.ConditionKind
	 * @see #setOperation(ConditionKind)
	 * @see hu.bme.mit.mdsd.dns2016.behaviour.BehaviourPackage#getCondition_Operation()
	 * @model
	 * @generated
	 */
	ConditionKind getOperation();

	/**
	 * Sets the value of the '{@link hu.bme.mit.mdsd.dns2016.behaviour.Condition#getOperation <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' attribute.
	 * @see hu.bme.mit.mdsd.dns2016.behaviour.ConditionKind
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(ConditionKind value);

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
	 * @see hu.bme.mit.mdsd.dns2016.behaviour.BehaviourPackage#getCondition_FieldObject()
	 * @model required="true"
	 * @generated
	 */
	FieldObject getFieldObject();

	/**
	 * Sets the value of the '{@link hu.bme.mit.mdsd.dns2016.behaviour.Condition#getFieldObject <em>Field Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Object</em>' reference.
	 * @see #getFieldObject()
	 * @generated
	 */
	void setFieldObject(FieldObject value);

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
	 * @see hu.bme.mit.mdsd.dns2016.behaviour.BehaviourPackage#getCondition_Key()
	 * @model
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link hu.bme.mit.mdsd.dns2016.behaviour.Condition#getKey <em>Key</em>}' attribute.
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
	 * @see hu.bme.mit.mdsd.dns2016.behaviour.BehaviourPackage#getCondition_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link hu.bme.mit.mdsd.dns2016.behaviour.Condition#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // Condition
