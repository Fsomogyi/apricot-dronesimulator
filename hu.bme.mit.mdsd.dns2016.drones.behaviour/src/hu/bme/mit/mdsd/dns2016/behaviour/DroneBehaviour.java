/**
 */
package hu.bme.mit.mdsd.dns2016.behaviour;

import hu.bme.mit.mdsd.dns2016.drones.Drone;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Drone Behaviour</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.mdsd.dns2016.behaviour.DroneBehaviour#getInstructions <em>Instructions</em>}</li>
 *   <li>{@link hu.bme.mit.mdsd.dns2016.behaviour.DroneBehaviour#getDrones <em>Drones</em>}</li>
 *   <li>{@link hu.bme.mit.mdsd.dns2016.behaviour.DroneBehaviour#isCanBeInterrupted <em>Can Be Interrupted</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.mdsd.dns2016.behaviour.BehaviourPackage#getDroneBehaviour()
 * @model
 * @generated
 */
public interface DroneBehaviour extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Instructions</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.mdsd.dns2016.behaviour.Instruction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instructions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instructions</em>' containment reference list.
	 * @see hu.bme.mit.mdsd.dns2016.behaviour.BehaviourPackage#getDroneBehaviour_Instructions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Instruction> getInstructions();

	/**
	 * Returns the value of the '<em><b>Drones</b></em>' reference list.
	 * The list contents are of type {@link hu.bme.mit.mdsd.dns2016.drones.Drone}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Drones</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drones</em>' reference list.
	 * @see hu.bme.mit.mdsd.dns2016.behaviour.BehaviourPackage#getDroneBehaviour_Drones()
	 * @model required="true"
	 * @generated
	 */
	EList<Drone> getDrones();

	/**
	 * Returns the value of the '<em><b>Can Be Interrupted</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Can Be Interrupted</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Can Be Interrupted</em>' attribute.
	 * @see #setCanBeInterrupted(boolean)
	 * @see hu.bme.mit.mdsd.dns2016.behaviour.BehaviourPackage#getDroneBehaviour_CanBeInterrupted()
	 * @model default="false"
	 * @generated
	 */
	boolean isCanBeInterrupted();

	/**
	 * Sets the value of the '{@link hu.bme.mit.mdsd.dns2016.behaviour.DroneBehaviour#isCanBeInterrupted <em>Can Be Interrupted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Can Be Interrupted</em>' attribute.
	 * @see #isCanBeInterrupted()
	 * @generated
	 */
	void setCanBeInterrupted(boolean value);

} // DroneBehaviour
