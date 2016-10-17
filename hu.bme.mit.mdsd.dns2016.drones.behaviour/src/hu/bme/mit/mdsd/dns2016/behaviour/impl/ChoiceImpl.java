/**
 */
package hu.bme.mit.mdsd.dns2016.behaviour.impl;

import hu.bme.mit.mdsd.dns2016.behaviour.BehaviourPackage;
import hu.bme.mit.mdsd.dns2016.behaviour.Choice;
import hu.bme.mit.mdsd.dns2016.behaviour.Condition;
import hu.bme.mit.mdsd.dns2016.behaviour.Instruction;

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
 * An implementation of the model object '<em><b>Choice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.mdsd.dns2016.behaviour.impl.ChoiceImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link hu.bme.mit.mdsd.dns2016.behaviour.impl.ChoiceImpl#getTrueBranch <em>True Branch</em>}</li>
 *   <li>{@link hu.bme.mit.mdsd.dns2016.behaviour.impl.ChoiceImpl#getFalseBranch <em>False Branch</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChoiceImpl extends InstructionImpl implements Choice {
	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Condition condition;

	/**
	 * The cached value of the '{@link #getTrueBranch() <em>True Branch</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrueBranch()
	 * @generated
	 * @ordered
	 */
	protected EList<Instruction> trueBranch;

	/**
	 * The cached value of the '{@link #getFalseBranch() <em>False Branch</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFalseBranch()
	 * @generated
	 * @ordered
	 */
	protected EList<Instruction> falseBranch;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChoiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviourPackage.Literals.CHOICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(Condition newCondition, NotificationChain msgs) {
		Condition oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviourPackage.CHOICE__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(Condition newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviourPackage.CHOICE__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviourPackage.CHOICE__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.CHOICE__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Instruction> getTrueBranch() {
		if (trueBranch == null) {
			trueBranch = new EObjectContainmentEList<Instruction>(Instruction.class, this, BehaviourPackage.CHOICE__TRUE_BRANCH);
		}
		return trueBranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Instruction> getFalseBranch() {
		if (falseBranch == null) {
			falseBranch = new EObjectContainmentEList<Instruction>(Instruction.class, this, BehaviourPackage.CHOICE__FALSE_BRANCH);
		}
		return falseBranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviourPackage.CHOICE__CONDITION:
				return basicSetCondition(null, msgs);
			case BehaviourPackage.CHOICE__TRUE_BRANCH:
				return ((InternalEList<?>)getTrueBranch()).basicRemove(otherEnd, msgs);
			case BehaviourPackage.CHOICE__FALSE_BRANCH:
				return ((InternalEList<?>)getFalseBranch()).basicRemove(otherEnd, msgs);
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
			case BehaviourPackage.CHOICE__CONDITION:
				return getCondition();
			case BehaviourPackage.CHOICE__TRUE_BRANCH:
				return getTrueBranch();
			case BehaviourPackage.CHOICE__FALSE_BRANCH:
				return getFalseBranch();
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
			case BehaviourPackage.CHOICE__CONDITION:
				setCondition((Condition)newValue);
				return;
			case BehaviourPackage.CHOICE__TRUE_BRANCH:
				getTrueBranch().clear();
				getTrueBranch().addAll((Collection<? extends Instruction>)newValue);
				return;
			case BehaviourPackage.CHOICE__FALSE_BRANCH:
				getFalseBranch().clear();
				getFalseBranch().addAll((Collection<? extends Instruction>)newValue);
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
			case BehaviourPackage.CHOICE__CONDITION:
				setCondition((Condition)null);
				return;
			case BehaviourPackage.CHOICE__TRUE_BRANCH:
				getTrueBranch().clear();
				return;
			case BehaviourPackage.CHOICE__FALSE_BRANCH:
				getFalseBranch().clear();
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
			case BehaviourPackage.CHOICE__CONDITION:
				return condition != null;
			case BehaviourPackage.CHOICE__TRUE_BRANCH:
				return trueBranch != null && !trueBranch.isEmpty();
			case BehaviourPackage.CHOICE__FALSE_BRANCH:
				return falseBranch != null && !falseBranch.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ChoiceImpl
