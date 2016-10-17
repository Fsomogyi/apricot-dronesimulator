/**
 */
package hu.bme.mit.mdsd.dns2016.drones.impl;

import hu.bme.mit.mdsd.dns2016.drones.DronesPackage;
import hu.bme.mit.mdsd.dns2016.drones.FieldObject;
import hu.bme.mit.mdsd.dns2016.drones.Parameter;
import hu.bme.mit.mdsd.dns2016.drones.SizedElement;

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
 * An implementation of the model object '<em><b>Field Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.mdsd.dns2016.drones.impl.FieldObjectImpl#getLength <em>Length</em>}</li>
 *   <li>{@link hu.bme.mit.mdsd.dns2016.drones.impl.FieldObjectImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link hu.bme.mit.mdsd.dns2016.drones.impl.FieldObjectImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link hu.bme.mit.mdsd.dns2016.drones.impl.FieldObjectImpl#getX <em>X</em>}</li>
 *   <li>{@link hu.bme.mit.mdsd.dns2016.drones.impl.FieldObjectImpl#getY <em>Y</em>}</li>
 *   <li>{@link hu.bme.mit.mdsd.dns2016.drones.impl.FieldObjectImpl#getZ <em>Z</em>}</li>
 *   <li>{@link hu.bme.mit.mdsd.dns2016.drones.impl.FieldObjectImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class FieldObjectImpl extends NamedElementImpl implements FieldObject {
	/**
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final float LENGTH_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected float length = LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final float HEIGHT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected float height = HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final float WIDTH_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected float width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final float X_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected float x = X_EDEFAULT;

	/**
	 * The default value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected static final float Y_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected float y = Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getZ() <em>Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZ()
	 * @generated
	 * @ordered
	 */
	protected static final float Z_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getZ() <em>Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZ()
	 * @generated
	 * @ordered
	 */
	protected float z = Z_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DronesPackage.Literals.FIELD_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength(float newLength) {
		float oldLength = length;
		length = newLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronesPackage.FIELD_OBJECT__LENGTH, oldLength, length));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(float newHeight) {
		float oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronesPackage.FIELD_OBJECT__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(float newWidth) {
		float oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronesPackage.FIELD_OBJECT__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX(float newX) {
		float oldX = x;
		x = newX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronesPackage.FIELD_OBJECT__X, oldX, x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getY() {
		return y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY(float newY) {
		float oldY = y;
		y = newY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronesPackage.FIELD_OBJECT__Y, oldY, y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getZ() {
		return z;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZ(float newZ) {
		float oldZ = z;
		z = newZ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronesPackage.FIELD_OBJECT__Z, oldZ, z));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, DronesPackage.FIELD_OBJECT__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DronesPackage.FIELD_OBJECT__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
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
			case DronesPackage.FIELD_OBJECT__LENGTH:
				return getLength();
			case DronesPackage.FIELD_OBJECT__HEIGHT:
				return getHeight();
			case DronesPackage.FIELD_OBJECT__WIDTH:
				return getWidth();
			case DronesPackage.FIELD_OBJECT__X:
				return getX();
			case DronesPackage.FIELD_OBJECT__Y:
				return getY();
			case DronesPackage.FIELD_OBJECT__Z:
				return getZ();
			case DronesPackage.FIELD_OBJECT__PARAMETERS:
				return getParameters();
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
			case DronesPackage.FIELD_OBJECT__LENGTH:
				setLength((Float)newValue);
				return;
			case DronesPackage.FIELD_OBJECT__HEIGHT:
				setHeight((Float)newValue);
				return;
			case DronesPackage.FIELD_OBJECT__WIDTH:
				setWidth((Float)newValue);
				return;
			case DronesPackage.FIELD_OBJECT__X:
				setX((Float)newValue);
				return;
			case DronesPackage.FIELD_OBJECT__Y:
				setY((Float)newValue);
				return;
			case DronesPackage.FIELD_OBJECT__Z:
				setZ((Float)newValue);
				return;
			case DronesPackage.FIELD_OBJECT__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
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
			case DronesPackage.FIELD_OBJECT__LENGTH:
				setLength(LENGTH_EDEFAULT);
				return;
			case DronesPackage.FIELD_OBJECT__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case DronesPackage.FIELD_OBJECT__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case DronesPackage.FIELD_OBJECT__X:
				setX(X_EDEFAULT);
				return;
			case DronesPackage.FIELD_OBJECT__Y:
				setY(Y_EDEFAULT);
				return;
			case DronesPackage.FIELD_OBJECT__Z:
				setZ(Z_EDEFAULT);
				return;
			case DronesPackage.FIELD_OBJECT__PARAMETERS:
				getParameters().clear();
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
			case DronesPackage.FIELD_OBJECT__LENGTH:
				return length != LENGTH_EDEFAULT;
			case DronesPackage.FIELD_OBJECT__HEIGHT:
				return height != HEIGHT_EDEFAULT;
			case DronesPackage.FIELD_OBJECT__WIDTH:
				return width != WIDTH_EDEFAULT;
			case DronesPackage.FIELD_OBJECT__X:
				return x != X_EDEFAULT;
			case DronesPackage.FIELD_OBJECT__Y:
				return y != Y_EDEFAULT;
			case DronesPackage.FIELD_OBJECT__Z:
				return z != Z_EDEFAULT;
			case DronesPackage.FIELD_OBJECT__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == SizedElement.class) {
			switch (derivedFeatureID) {
				case DronesPackage.FIELD_OBJECT__LENGTH: return DronesPackage.SIZED_ELEMENT__LENGTH;
				case DronesPackage.FIELD_OBJECT__HEIGHT: return DronesPackage.SIZED_ELEMENT__HEIGHT;
				case DronesPackage.FIELD_OBJECT__WIDTH: return DronesPackage.SIZED_ELEMENT__WIDTH;
				case DronesPackage.FIELD_OBJECT__X: return DronesPackage.SIZED_ELEMENT__X;
				case DronesPackage.FIELD_OBJECT__Y: return DronesPackage.SIZED_ELEMENT__Y;
				case DronesPackage.FIELD_OBJECT__Z: return DronesPackage.SIZED_ELEMENT__Z;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == SizedElement.class) {
			switch (baseFeatureID) {
				case DronesPackage.SIZED_ELEMENT__LENGTH: return DronesPackage.FIELD_OBJECT__LENGTH;
				case DronesPackage.SIZED_ELEMENT__HEIGHT: return DronesPackage.FIELD_OBJECT__HEIGHT;
				case DronesPackage.SIZED_ELEMENT__WIDTH: return DronesPackage.FIELD_OBJECT__WIDTH;
				case DronesPackage.SIZED_ELEMENT__X: return DronesPackage.FIELD_OBJECT__X;
				case DronesPackage.SIZED_ELEMENT__Y: return DronesPackage.FIELD_OBJECT__Y;
				case DronesPackage.SIZED_ELEMENT__Z: return DronesPackage.FIELD_OBJECT__Z;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (length: ");
		result.append(length);
		result.append(", height: ");
		result.append(height);
		result.append(", width: ");
		result.append(width);
		result.append(", x: ");
		result.append(x);
		result.append(", y: ");
		result.append(y);
		result.append(", z: ");
		result.append(z);
		result.append(')');
		return result.toString();
	}

} //FieldObjectImpl
