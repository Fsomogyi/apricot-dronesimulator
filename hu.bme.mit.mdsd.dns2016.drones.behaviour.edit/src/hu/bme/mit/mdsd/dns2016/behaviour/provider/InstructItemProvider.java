/**
 */
package hu.bme.mit.mdsd.dns2016.behaviour.provider;


import hu.bme.mit.mdsd.dns2016.behaviour.BehaviourFactory;
import hu.bme.mit.mdsd.dns2016.behaviour.BehaviourPackage;
import hu.bme.mit.mdsd.dns2016.behaviour.Instruct;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link hu.bme.mit.mdsd.dns2016.behaviour.Instruct} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class InstructItemProvider extends InstructionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstructItemProvider(AdapterFactory adapterFactory) {
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

			addInstructionsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Instructions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInstructionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Instruct_instructions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Instruct_instructions_feature", "_UI_Instruct_type"),
				 BehaviourPackage.Literals.INSTRUCT__INSTRUCTIONS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
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
			childrenFeatures.add(BehaviourPackage.Literals.INSTRUCT__INSTRUCTIONS);
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
	 * This returns Instruct.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Instruct"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Instruct_type");
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

		switch (notification.getFeatureID(Instruct.class)) {
			case BehaviourPackage.INSTRUCT__INSTRUCTIONS:
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
				(BehaviourPackage.Literals.INSTRUCT__INSTRUCTIONS,
				 BehaviourFactory.eINSTANCE.createMoveTo()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourPackage.Literals.INSTRUCT__INSTRUCTIONS,
				 BehaviourFactory.eINSTANCE.createPause()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourPackage.Literals.INSTRUCT__INSTRUCTIONS,
				 BehaviourFactory.eINSTANCE.createPerformAction()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourPackage.Literals.INSTRUCT__INSTRUCTIONS,
				 BehaviourFactory.eINSTANCE.createChoice()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourPackage.Literals.INSTRUCT__INSTRUCTIONS,
				 BehaviourFactory.eINSTANCE.createWaitForMessage()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourPackage.Literals.INSTRUCT__INSTRUCTIONS,
				 BehaviourFactory.eINSTANCE.createWhile()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourPackage.Literals.INSTRUCT__INSTRUCTIONS,
				 BehaviourFactory.eINSTANCE.createInstruct()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourPackage.Literals.INSTRUCT__INSTRUCTIONS,
				 BehaviourFactory.eINSTANCE.createLift()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourPackage.Literals.INSTRUCT__INSTRUCTIONS,
				 BehaviourFactory.eINSTANCE.createPlaceObject()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourPackage.Literals.INSTRUCT__INSTRUCTIONS,
				 BehaviourFactory.eINSTANCE.createSendMessage()));
	}

}
