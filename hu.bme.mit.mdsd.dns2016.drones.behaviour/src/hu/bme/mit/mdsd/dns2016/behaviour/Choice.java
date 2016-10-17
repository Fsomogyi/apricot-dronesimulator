/**
 */
package hu.bme.mit.mdsd.dns2016.behaviour;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Choice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.mdsd.dns2016.behaviour.Choice#getCondition <em>Condition</em>}</li>
 *   <li>{@link hu.bme.mit.mdsd.dns2016.behaviour.Choice#getTrueBranch <em>True Branch</em>}</li>
 *   <li>{@link hu.bme.mit.mdsd.dns2016.behaviour.Choice#getFalseBranch <em>False Branch</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.mdsd.dns2016.behaviour.BehaviourPackage#getChoice()
 * @model
 * @generated
 */
public interface Choice extends Instruction {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Condition)
	 * @see hu.bme.mit.mdsd.dns2016.behaviour.BehaviourPackage#getChoice_Condition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Condition getCondition();

	/**
	 * Sets the value of the '{@link hu.bme.mit.mdsd.dns2016.behaviour.Choice#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Condition value);

	/**
	 * Returns the value of the '<em><b>True Branch</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.mdsd.dns2016.behaviour.Instruction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>True Branch</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>True Branch</em>' containment reference list.
	 * @see hu.bme.mit.mdsd.dns2016.behaviour.BehaviourPackage#getChoice_TrueBranch()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Instruction> getTrueBranch();

	/**
	 * Returns the value of the '<em><b>False Branch</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.mdsd.dns2016.behaviour.Instruction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>False Branch</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>False Branch</em>' containment reference list.
	 * @see hu.bme.mit.mdsd.dns2016.behaviour.BehaviourPackage#getChoice_FalseBranch()
	 * @model containment="true"
	 * @generated
	 */
	EList<Instruction> getFalseBranch();

} // Choice
