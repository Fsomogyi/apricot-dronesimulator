/**
 */
package hu.bme.mit.mdsd.dns2016.behaviour.impl;

import hu.bme.mit.mdsd.dns2016.behaviour.BehaviourPackage;
import hu.bme.mit.mdsd.dns2016.behaviour.Instruction;
import hu.bme.mit.mdsd.dns2016.behaviour.WaitForMessage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wait For Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.mdsd.dns2016.behaviour.impl.WaitForMessageImpl#getType <em>Type</em>}</li>
 *   <li>{@link hu.bme.mit.mdsd.dns2016.behaviour.impl.WaitForMessageImpl#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link hu.bme.mit.mdsd.dns2016.behaviour.impl.WaitForMessageImpl#getWhenArrived <em>When Arrived</em>}</li>
 *   <li>{@link hu.bme.mit.mdsd.dns2016.behaviour.impl.WaitForMessageImpl#getWhenLost <em>When Lost</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WaitForMessageImpl extends InstructionImpl implements WaitForMessage {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final float TIMEOUT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeout()
	 * @generated
	 * @ordered
	 */
	protected float timeout = TIMEOUT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWhenArrived() <em>When Arrived</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhenArrived()
	 * @generated
	 * @ordered
	 */
	protected EList<Instruction> whenArrived;

	/**
	 * The cached value of the '{@link #getWhenLost() <em>When Lost</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhenLost()
	 * @generated
	 * @ordered
	 */
	protected EList<Instruction> whenLost;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WaitForMessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviourPackage.Literals.WAIT_FOR_MESSAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.WAIT_FOR_MESSAGE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getTimeout() {
		return timeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeout(float newTimeout) {
		float oldTimeout = timeout;
		timeout = newTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.WAIT_FOR_MESSAGE__TIMEOUT, oldTimeout, timeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Instruction> getWhenArrived() {
		if (whenArrived == null) {
			whenArrived = new EObjectContainmentEList<Instruction>(Instruction.class, this, BehaviourPackage.WAIT_FOR_MESSAGE__WHEN_ARRIVED);
		}
		return whenArrived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Instruction> getWhenLost() {
		if (whenLost == null) {
			whenLost = new EObjectContainmentEList<Instruction>(Instruction.class, this, BehaviourPackage.WAIT_FOR_MESSAGE__WHEN_LOST);
		}
		return whenLost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviourPackage.WAIT_FOR_MESSAGE__WHEN_ARRIVED:
				return ((InternalEList<?>)getWhenArrived()).basicRemove(otherEnd, msgs);
			case BehaviourPackage.WAIT_FOR_MESSAGE__WHEN_LOST:
				return ((InternalEList<?>)getWhenLost()).basicRemove(otherEnd, msgs);
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
			case BehaviourPackage.WAIT_FOR_MESSAGE__TYPE:
				return getType();
			case BehaviourPackage.WAIT_FOR_MESSAGE__TIMEOUT:
				return getTimeout();
			case BehaviourPackage.WAIT_FOR_MESSAGE__WHEN_ARRIVED:
				return getWhenArrived();
			case BehaviourPackage.WAIT_FOR_MESSAGE__WHEN_LOST:
				return getWhenLost();
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
			case BehaviourPackage.WAIT_FOR_MESSAGE__TYPE:
				setType((String)newValue);
				return;
			case BehaviourPackage.WAIT_FOR_MESSAGE__TIMEOUT:
				setTimeout((Float)newValue);
				return;
			case BehaviourPackage.WAIT_FOR_MESSAGE__WHEN_ARRIVED:
				getWhenArrived().clear();
				getWhenArrived().addAll((Collection<? extends Instruction>)newValue);
				return;
			case BehaviourPackage.WAIT_FOR_MESSAGE__WHEN_LOST:
				getWhenLost().clear();
				getWhenLost().addAll((Collection<? extends Instruction>)newValue);
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
			case BehaviourPackage.WAIT_FOR_MESSAGE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case BehaviourPackage.WAIT_FOR_MESSAGE__TIMEOUT:
				setTimeout(TIMEOUT_EDEFAULT);
				return;
			case BehaviourPackage.WAIT_FOR_MESSAGE__WHEN_ARRIVED:
				getWhenArrived().clear();
				return;
			case BehaviourPackage.WAIT_FOR_MESSAGE__WHEN_LOST:
				getWhenLost().clear();
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
			case BehaviourPackage.WAIT_FOR_MESSAGE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case BehaviourPackage.WAIT_FOR_MESSAGE__TIMEOUT:
				return timeout != TIMEOUT_EDEFAULT;
			case BehaviourPackage.WAIT_FOR_MESSAGE__WHEN_ARRIVED:
				return whenArrived != null && !whenArrived.isEmpty();
			case BehaviourPackage.WAIT_FOR_MESSAGE__WHEN_LOST:
				return whenLost != null && !whenLost.isEmpty();
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
		result.append(" (type: ");
		result.append(type);
		result.append(", timeout: ");
		result.append(timeout);
		result.append(')');
		return result.toString();
	}

} //WaitForMessageImpl
