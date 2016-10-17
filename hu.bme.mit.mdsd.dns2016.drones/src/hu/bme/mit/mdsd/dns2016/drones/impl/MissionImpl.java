/**
 */
package hu.bme.mit.mdsd.dns2016.drones.impl;

import hu.bme.mit.mdsd.dns2016.drones.Action;
import hu.bme.mit.mdsd.dns2016.drones.Drone;
import hu.bme.mit.mdsd.dns2016.drones.DronesPackage;
import hu.bme.mit.mdsd.dns2016.drones.FieldObject;
import hu.bme.mit.mdsd.dns2016.drones.Mission;
import hu.bme.mit.mdsd.dns2016.drones.TemporalContainmentProxy;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mission</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.mdsd.dns2016.drones.impl.MissionImpl#getFieldObjects <em>Field Objects</em>}</li>
 *   <li>{@link hu.bme.mit.mdsd.dns2016.drones.impl.MissionImpl#getDrones <em>Drones</em>}</li>
 *   <li>{@link hu.bme.mit.mdsd.dns2016.drones.impl.MissionImpl#getTemporalObjects <em>Temporal Objects</em>}</li>
 *   <li>{@link hu.bme.mit.mdsd.dns2016.drones.impl.MissionImpl#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MissionImpl extends NamedElementImpl implements Mission {
	/**
	 * The cached value of the '{@link #getFieldObjects() <em>Field Objects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<FieldObject> fieldObjects;

	/**
	 * The cached value of the '{@link #getDrones() <em>Drones</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrones()
	 * @generated
	 * @ordered
	 */
	protected EList<Drone> drones;

	/**
	 * The cached value of the '{@link #getTemporalObjects() <em>Temporal Objects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemporalObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<TemporalContainmentProxy> temporalObjects;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> actions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MissionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DronesPackage.Literals.MISSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FieldObject> getFieldObjects() {
		if (fieldObjects == null) {
			fieldObjects = new EObjectContainmentEList<FieldObject>(FieldObject.class, this, DronesPackage.MISSION__FIELD_OBJECTS);
		}
		return fieldObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Drone> getDrones() {
		if (drones == null) {
			drones = new EObjectContainmentEList<Drone>(Drone.class, this, DronesPackage.MISSION__DRONES);
		}
		return drones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TemporalContainmentProxy> getTemporalObjects() {
		if (temporalObjects == null) {
			temporalObjects = new EObjectContainmentEList<TemporalContainmentProxy>(TemporalContainmentProxy.class, this, DronesPackage.MISSION__TEMPORAL_OBJECTS);
		}
		return temporalObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentEList<Action>(Action.class, this, DronesPackage.MISSION__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DronesPackage.MISSION__FIELD_OBJECTS:
				return ((InternalEList<?>)getFieldObjects()).basicRemove(otherEnd, msgs);
			case DronesPackage.MISSION__DRONES:
				return ((InternalEList<?>)getDrones()).basicRemove(otherEnd, msgs);
			case DronesPackage.MISSION__TEMPORAL_OBJECTS:
				return ((InternalEList<?>)getTemporalObjects()).basicRemove(otherEnd, msgs);
			case DronesPackage.MISSION__ACTIONS:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DronesPackage.MISSION__FIELD_OBJECTS:
				return getFieldObjects();
			case DronesPackage.MISSION__DRONES:
				return getDrones();
			case DronesPackage.MISSION__TEMPORAL_OBJECTS:
				return getTemporalObjects();
			case DronesPackage.MISSION__ACTIONS:
				return getActions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DronesPackage.MISSION__FIELD_OBJECTS:
				getFieldObjects().clear();
				getFieldObjects().addAll((Collection<? extends FieldObject>)newValue);
				return;
			case DronesPackage.MISSION__DRONES:
				getDrones().clear();
				getDrones().addAll((Collection<? extends Drone>)newValue);
				return;
			case DronesPackage.MISSION__TEMPORAL_OBJECTS:
				getTemporalObjects().clear();
				getTemporalObjects().addAll((Collection<? extends TemporalContainmentProxy>)newValue);
				return;
			case DronesPackage.MISSION__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends Action>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DronesPackage.MISSION__FIELD_OBJECTS:
				getFieldObjects().clear();
				return;
			case DronesPackage.MISSION__DRONES:
				getDrones().clear();
				return;
			case DronesPackage.MISSION__TEMPORAL_OBJECTS:
				getTemporalObjects().clear();
				return;
			case DronesPackage.MISSION__ACTIONS:
				getActions().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DronesPackage.MISSION__FIELD_OBJECTS:
				return fieldObjects != null && !fieldObjects.isEmpty();
			case DronesPackage.MISSION__DRONES:
				return drones != null && !drones.isEmpty();
			case DronesPackage.MISSION__TEMPORAL_OBJECTS:
				return temporalObjects != null && !temporalObjects.isEmpty();
			case DronesPackage.MISSION__ACTIONS:
				return actions != null && !actions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MissionImpl
