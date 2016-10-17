/**
 */
package hu.bme.mit.mdsd.dns2016.behaviour.impl;

import hu.bme.mit.mdsd.dns2016.behaviour.BehaviourPackage;
import hu.bme.mit.mdsd.dns2016.behaviour.MoveTo;

import hu.bme.mit.mdsd.dns2016.drones.FieldObject;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Move To</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.mdsd.dns2016.behaviour.impl.MoveToImpl#getFieldObject <em>Field Object</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MoveToImpl extends InstructionImpl implements MoveTo {
	/**
	 * The cached value of the '{@link #getFieldObject() <em>Field Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldObject()
	 * @generated
	 * @ordered
	 */
	protected FieldObject fieldObject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MoveToImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviourPackage.Literals.MOVE_TO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldObject getFieldObject() {
		if (fieldObject != null && fieldObject.eIsProxy()) {
			InternalEObject oldFieldObject = (InternalEObject)fieldObject;
			fieldObject = (FieldObject)eResolveProxy(oldFieldObject);
			if (fieldObject != oldFieldObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviourPackage.MOVE_TO__FIELD_OBJECT, oldFieldObject, fieldObject));
			}
		}
		return fieldObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldObject basicGetFieldObject() {
		return fieldObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFieldObject(FieldObject newFieldObject) {
		FieldObject oldFieldObject = fieldObject;
		fieldObject = newFieldObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.MOVE_TO__FIELD_OBJECT, oldFieldObject, fieldObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BehaviourPackage.MOVE_TO__FIELD_OBJECT:
				if (resolve) return getFieldObject();
				return basicGetFieldObject();
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
			case BehaviourPackage.MOVE_TO__FIELD_OBJECT:
				setFieldObject((FieldObject)newValue);
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
			case BehaviourPackage.MOVE_TO__FIELD_OBJECT:
				setFieldObject((FieldObject)null);
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
			case BehaviourPackage.MOVE_TO__FIELD_OBJECT:
				return fieldObject != null;
		}
		return super.eIsSet(featureID);
	}

} //MoveToImpl
