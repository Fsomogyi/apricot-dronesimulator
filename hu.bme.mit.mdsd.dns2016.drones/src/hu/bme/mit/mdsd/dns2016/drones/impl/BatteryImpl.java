/**
 */
package hu.bme.mit.mdsd.dns2016.drones.impl;

import hu.bme.mit.mdsd.dns2016.drones.Battery;
import hu.bme.mit.mdsd.dns2016.drones.DronesPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Battery</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.mdsd.dns2016.drones.impl.BatteryImpl#getLifeTime <em>Life Time</em>}</li>
 *   <li>{@link hu.bme.mit.mdsd.dns2016.drones.impl.BatteryImpl#getRechargeRate <em>Recharge Rate</em>}</li>
 *   <li>{@link hu.bme.mit.mdsd.dns2016.drones.impl.BatteryImpl#getCharge <em>Charge</em>}</li>
 *   <li>{@link hu.bme.mit.mdsd.dns2016.drones.impl.BatteryImpl#getRemainingLifeTime <em>Remaining Life Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BatteryImpl extends TemporalContainmentProxyImpl implements Battery {
	/**
	 * The default value of the '{@link #getLifeTime() <em>Life Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLifeTime()
	 * @generated
	 * @ordered
	 */
	protected static final float LIFE_TIME_EDEFAULT = 900.0F;

	/**
	 * The cached value of the '{@link #getLifeTime() <em>Life Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLifeTime()
	 * @generated
	 * @ordered
	 */
	protected float lifeTime = LIFE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRechargeRate() <em>Recharge Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRechargeRate()
	 * @generated
	 * @ordered
	 */
	protected static final float RECHARGE_RATE_EDEFAULT = 0.5F;

	/**
	 * The cached value of the '{@link #getRechargeRate() <em>Recharge Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRechargeRate()
	 * @generated
	 * @ordered
	 */
	protected float rechargeRate = RECHARGE_RATE_EDEFAULT;

	/**
	 * The cached setting delegate for the '{@link #getCharge() <em>Charge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharge()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate CHARGE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)DronesPackage.Literals.BATTERY__CHARGE).getSettingDelegate();

	/**
	 * The default value of the '{@link #getRemainingLifeTime() <em>Remaining Life Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemainingLifeTime()
	 * @generated
	 * @ordered
	 */
	protected static final float REMAINING_LIFE_TIME_EDEFAULT = 900.0F;

	/**
	 * The cached value of the '{@link #getRemainingLifeTime() <em>Remaining Life Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemainingLifeTime()
	 * @generated
	 * @ordered
	 */
	protected float remainingLifeTime = REMAINING_LIFE_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BatteryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DronesPackage.Literals.BATTERY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLifeTime() {
		return lifeTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLifeTime(float newLifeTime) {
		float oldLifeTime = lifeTime;
		lifeTime = newLifeTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronesPackage.BATTERY__LIFE_TIME, oldLifeTime, lifeTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRechargeRate() {
		return rechargeRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRechargeRate(float newRechargeRate) {
		float oldRechargeRate = rechargeRate;
		rechargeRate = newRechargeRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronesPackage.BATTERY__RECHARGE_RATE, oldRechargeRate, rechargeRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCharge() {
		return (Float)CHARGE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRemainingLifeTime() {
		return remainingLifeTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemainingLifeTime(float newRemainingLifeTime) {
		float oldRemainingLifeTime = remainingLifeTime;
		remainingLifeTime = newRemainingLifeTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronesPackage.BATTERY__REMAINING_LIFE_TIME, oldRemainingLifeTime, remainingLifeTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DronesPackage.BATTERY__LIFE_TIME:
				return getLifeTime();
			case DronesPackage.BATTERY__RECHARGE_RATE:
				return getRechargeRate();
			case DronesPackage.BATTERY__CHARGE:
				return getCharge();
			case DronesPackage.BATTERY__REMAINING_LIFE_TIME:
				return getRemainingLifeTime();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DronesPackage.BATTERY__LIFE_TIME:
				setLifeTime((Float)newValue);
				return;
			case DronesPackage.BATTERY__RECHARGE_RATE:
				setRechargeRate((Float)newValue);
				return;
			case DronesPackage.BATTERY__REMAINING_LIFE_TIME:
				setRemainingLifeTime((Float)newValue);
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
			case DronesPackage.BATTERY__LIFE_TIME:
				setLifeTime(LIFE_TIME_EDEFAULT);
				return;
			case DronesPackage.BATTERY__RECHARGE_RATE:
				setRechargeRate(RECHARGE_RATE_EDEFAULT);
				return;
			case DronesPackage.BATTERY__REMAINING_LIFE_TIME:
				setRemainingLifeTime(REMAINING_LIFE_TIME_EDEFAULT);
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
			case DronesPackage.BATTERY__LIFE_TIME:
				return lifeTime != LIFE_TIME_EDEFAULT;
			case DronesPackage.BATTERY__RECHARGE_RATE:
				return rechargeRate != RECHARGE_RATE_EDEFAULT;
			case DronesPackage.BATTERY__CHARGE:
				return CHARGE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case DronesPackage.BATTERY__REMAINING_LIFE_TIME:
				return remainingLifeTime != REMAINING_LIFE_TIME_EDEFAULT;
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
		result.append(" (lifeTime: ");
		result.append(lifeTime);
		result.append(", rechargeRate: ");
		result.append(rechargeRate);
		result.append(", remainingLifeTime: ");
		result.append(remainingLifeTime);
		result.append(')');
		return result.toString();
	}

} //BatteryImpl
