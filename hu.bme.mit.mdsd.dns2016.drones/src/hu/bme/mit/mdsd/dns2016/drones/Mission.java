/**
 */
package hu.bme.mit.mdsd.dns2016.drones;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mission</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.mdsd.dns2016.drones.Mission#getFieldObjects <em>Field Objects</em>}</li>
 *   <li>{@link hu.bme.mit.mdsd.dns2016.drones.Mission#getDrones <em>Drones</em>}</li>
 *   <li>{@link hu.bme.mit.mdsd.dns2016.drones.Mission#getTemporalObjects <em>Temporal Objects</em>}</li>
 *   <li>{@link hu.bme.mit.mdsd.dns2016.drones.Mission#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.mdsd.dns2016.drones.DronesPackage#getMission()
 * @model
 * @generated
 */
public interface Mission extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Field Objects</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.mdsd.dns2016.drones.FieldObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field Objects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Objects</em>' containment reference list.
	 * @see hu.bme.mit.mdsd.dns2016.drones.DronesPackage#getMission_FieldObjects()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<FieldObject> getFieldObjects();

	/**
	 * Returns the value of the '<em><b>Drones</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.mdsd.dns2016.drones.Drone}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Drones</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drones</em>' containment reference list.
	 * @see hu.bme.mit.mdsd.dns2016.drones.DronesPackage#getMission_Drones()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Drone> getDrones();

	/**
	 * Returns the value of the '<em><b>Temporal Objects</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.mdsd.dns2016.drones.TemporalContainmentProxy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temporal Objects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temporal Objects</em>' containment reference list.
	 * @see hu.bme.mit.mdsd.dns2016.drones.DronesPackage#getMission_TemporalObjects()
	 * @model containment="true"
	 * @generated
	 */
	EList<TemporalContainmentProxy> getTemporalObjects();

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.mdsd.dns2016.drones.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see hu.bme.mit.mdsd.dns2016.drones.DronesPackage#getMission_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getActions();

} // Mission
