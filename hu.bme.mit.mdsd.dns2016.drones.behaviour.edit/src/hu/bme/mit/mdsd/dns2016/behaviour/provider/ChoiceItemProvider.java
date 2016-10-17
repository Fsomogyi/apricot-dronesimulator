/**
 */
package hu.bme.mit.mdsd.dns2016.behaviour.provider;


import hu.bme.mit.mdsd.dns2016.behaviour.BehaviourFactory;
import hu.bme.mit.mdsd.dns2016.behaviour.BehaviourPackage;
import hu.bme.mit.mdsd.dns2016.behaviour.Choice;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link hu.bme.mit.mdsd.dns2016.behaviour.Choice} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ChoiceItemProvider extends InstructionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChoiceItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(BehaviourPackage.Literals.CHOICE__CONDITION);
			childrenFeatures.add(BehaviourPackage.Literals.CHOICE__TRUE_BRANCH);
			childrenFeatures.add(BehaviourPackage.Literals.CHOICE__FALSE_BRANCH);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Choice.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Choice"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Choice_type");
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Choice.class)) {
			case BehaviourPackage.CHOICE__CONDITION:
			case BehaviourPackage.CHOICE__TRUE_BRANCH:
			case BehaviourPackage.CHOICE__FALSE_BRANCH:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(BehaviourPackage.Literals.CHOICE__CONDITION,
				 BehaviourFactory.eINSTANCE.createCondition()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourPackage.Literals.CHOICE__TRUE_BRANCH,
				 BehaviourFactory.eINSTANCE.createMoveTo()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourPackage.Literals.CHOICE__TRUE_BRANCH,
				 BehaviourFactory.eINSTANCE.createPause()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourPackage.Literals.CHOICE__TRUE_BRANCH,
				 BehaviourFactory.eINSTANCE.createPerformAction()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourPackage.Literals.CHOICE__TRUE_BRANCH,
				 BehaviourFactory.eINSTANCE.createChoice()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourPackage.Literals.CHOICE__TRUE_BRANCH,
				 BehaviourFactory.eINSTANCE.createWaitForMessage()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourPackage.Literals.CHOICE__TRUE_BRANCH,
				 BehaviourFactory.eINSTANCE.createWhile()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourPackage.Literals.CHOICE__TRUE_BRANCH,
				 BehaviourFactory.eINSTANCE.createInstruct()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourPackage.Literals.CHOICE__TRUE_BRANCH,
				 BehaviourFactory.eINSTANCE.createLift()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourPackage.Literals.CHOICE__TRUE_BRANCH,
				 BehaviourFactory.eINSTANCE.createPlaceObject()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourPackage.Literals.CHOICE__TRUE_BRANCH,
				 BehaviourFactory.eINSTANCE.createSendMessage()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourPackage.Literals.CHOICE__FALSE_BRANCH,
				 BehaviourFactory.eINSTANCE.createMoveTo()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourPackage.Literals.CHOICE__FALSE_BRANCH,
				 BehaviourFactory.eINSTANCE.createPause()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourPackage.Literals.CHOICE__FALSE_BRANCH,
				 BehaviourFactory.eINSTANCE.createPerformAction()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourPackage.Literals.CHOICE__FALSE_BRANCH,
				 BehaviourFactory.eINSTANCE.createChoice()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourPackage.Literals.CHOICE__FALSE_BRANCH,
				 BehaviourFactory.eINSTANCE.createWaitForMessage()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourPackage.Literals.CHOICE__FALSE_BRANCH,
				 BehaviourFactory.eINSTANCE.createWhile()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourPackage.Literals.CHOICE__FALSE_BRANCH,
				 BehaviourFactory.eINSTANCE.createInstruct()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourPackage.Literals.CHOICE__FALSE_BRANCH,
				 BehaviourFactory.eINSTANCE.createLift()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourPackage.Literals.CHOICE__FALSE_BRANCH,
				 BehaviourFactory.eINSTANCE.createPlaceObject()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourPackage.Literals.CHOICE__FALSE_BRANCH,
				 BehaviourFactory.eINSTANCE.createSendMessage()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == BehaviourPackage.Literals.CHOICE__TRUE_BRANCH ||
			childFeature == BehaviourPackage.Literals.CHOICE__FALSE_BRANCH;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
