/**
 */
package hu.bme.mit.mdsd.dns2016.behaviour.impl;

import hu.bme.mit.mdsd.dns2016.behaviour.BehaviourPackage;
import hu.bme.mit.mdsd.dns2016.behaviour.DroneBehaviour;
import hu.bme.mit.mdsd.dns2016.behaviour.Instruction;

import hu.bme.mit.mdsd.dns2016.drones.Drone;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Drone Behaviour</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.mdsd.dns2016.behaviour.impl.DroneBehaviourImpl#getInstructions <em>Instructions</em>}</li>
 *   <li>{@link hu.bme.mit.mdsd.dns2016.behaviour.impl.DroneBehaviourImpl#getDrones <em>Drones</em>}</li>
 *   <li>{@link hu.bme.mit.mdsd.dns2016.behaviour.impl.DroneBehaviourImpl#isCanBeInterrupted <em>Can Be Interrupted</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DroneBehaviourImpl extends NamedElementImpl implements DroneBehaviour {
	/**
	 * The cached value of the '{@link #getInstructions() <em>Instructions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructions()
	 * @generated
	 * @ordered
	 */
	protected EList<Instruction> instructions;

	/**
	 * The cached value of the '{@link #getDrones() <em>Drones</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrones()
	 * @generated
	 * @ordered
	 */
	protected EList<Drone> drones;

	/**
	 * The default value of the '{@link #isCanBeInterrupted() <em>Can Be Interrupted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanBeInterrupted()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CAN_BE_INTERRUPTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCanBeInterrupted() <em>Can Be Interrupted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanBeInterrupted()
	 * @generated
	 * @ordered
	 */
	protected boolean canBeInterrupted = CAN_BE_INTERRUPTED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DroneBehaviourImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviourPackage.Literals.DRONE_BEHAVIOUR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Instruction> getInstructions() {
		if (instructions == null) {
			instructions = new EObjectContainmentEList<Instruction>(Instruction.class, this, BehaviourPackage.DRONE_BEHAVIOUR__INSTRUCTIONS);
		}
		return instructions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Drone> getDrones() {
		if (drones == null) {
			drones = new EObjectResolvingEList<Drone>(Drone.class, this, BehaviourPackage.DRONE_BEHAVIOUR__DRONES);
		}
		return drones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCanBeInterrupted() {
		return canBeInterrupted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCanBeInterrupted(boolean newCanBeInterrupted) {
		boolean oldCanBeInterrupted = canBeInterrupted;
		canBeInterrupted = newCanBeInterrupted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.DRONE_BEHAVIOUR__CAN_BE_INTERRUPTED, oldCanBeInterrupted, canBeInterrupted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviourPackage.DRONE_BEHAVIOUR__INSTRUCTIONS:
				return ((InternalEList<?>)getInstructions()).basicRemove(otherEnd, msgs);
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
			case BehaviourPackage.DRONE_BEHAVIOUR__INSTRUCTIONS:
				return getInstructions();
			case BehaviourPackage.DRONE_BEHAVIOUR__DRONES:
				return getDrones();
			case BehaviourPackage.DRONE_BEHAVIOUR__CAN_BE_INTERRUPTED:
				return isCanBeInterrupted();
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
			case BehaviourPackage.DRONE_BEHAVIOUR__INSTRUCTIONS:
				getInstructions().clear();
				getInstructions().addAll((Collection<? extends Instruction>)newValue);
				return;
			case BehaviourPackage.DRONE_BEHAVIOUR__DRONES:
				getDrones().clear();
				getDrones().addAll((Collection<? extends Drone>)newValue);
				return;
			case BehaviourPackage.DRONE_BEHAVIOUR__CAN_BE_INTERRUPTED:
				setCanBeInterrupted((Boolean)newValue);
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
			case BehaviourPackage.DRONE_BEHAVIOUR__INSTRUCTIONS:
				getInstructions().clear();
				return;
			case BehaviourPackage.DRONE_BEHAVIOUR__DRONES:
				getDrones().clear();
				return;
			case BehaviourPackage.DRONE_BEHAVIOUR__CAN_BE_INTERRUPTED:
				setCanBeInterrupted(CAN_BE_INTERRUPTED_EDEFAULT);
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
			case BehaviourPackage.DRONE_BEHAVIOUR__INSTRUCTIONS:
				return instructions != null && !instructions.isEmpty();
			case BehaviourPackage.DRONE_BEHAVIOUR__DRONES:
				return drones != null && !drones.isEmpty();
			case BehaviourPackage.DRONE_BEHAVIOUR__CAN_BE_INTERRUPTED:
				return canBeInterrupted != CAN_BE_INTERRUPTED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (canBeInterrupted: ");
		result.append(canBeInterrupted);
		result.append(')');
		return result.toString();
	}

} //DroneBehaviourImpl
