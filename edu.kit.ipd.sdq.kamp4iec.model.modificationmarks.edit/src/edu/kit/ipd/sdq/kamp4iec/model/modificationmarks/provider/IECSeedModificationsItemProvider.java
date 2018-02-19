/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.provider;


import edu.kit.ipd.sdq.kamp.model.modificationmarks.provider.AbstractSeedModificationsItemProvider;
import edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.IECSeedModifications;

import edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.ModificationmarksFactory;
import edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.ModificationmarksPackage;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.IECSeedModifications} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IECSeedModificationsItemProvider extends AbstractSeedModificationsItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECSeedModificationsItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(ModificationmarksPackage.Literals.IEC_SEED_MODIFICATIONS__GLOBAL_VARIABLE_MODIFICATIONS);
			childrenFeatures.add(ModificationmarksPackage.Literals.IEC_SEED_MODIFICATIONS__INTERFACE_MODIFICATIONS);
			childrenFeatures.add(ModificationmarksPackage.Literals.IEC_SEED_MODIFICATIONS__ABSTRACT_METHOD_MODIFICATIONS);
			childrenFeatures.add(ModificationmarksPackage.Literals.IEC_SEED_MODIFICATIONS__ABSTRACT_PROPERTY_MODIFICATIONS);
			childrenFeatures.add(ModificationmarksPackage.Literals.IEC_SEED_MODIFICATIONS__FUNCTION_BLOCK_MODIFICATIONS);
			childrenFeatures.add(ModificationmarksPackage.Literals.IEC_SEED_MODIFICATIONS__METHOD_MODIFICATIONS);
			childrenFeatures.add(ModificationmarksPackage.Literals.IEC_SEED_MODIFICATIONS__PROPERTY_MODIFICATIONS);
			childrenFeatures.add(ModificationmarksPackage.Literals.IEC_SEED_MODIFICATIONS__FUNCTION_MODIFICATIONS);
			childrenFeatures.add(ModificationmarksPackage.Literals.IEC_SEED_MODIFICATIONS__PROGRAM_MODIFICATIONS);
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
	 * This returns IECSeedModifications.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IECSeedModifications"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_IECSeedModifications_type");
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

		switch (notification.getFeatureID(IECSeedModifications.class)) {
			case ModificationmarksPackage.IEC_SEED_MODIFICATIONS__GLOBAL_VARIABLE_MODIFICATIONS:
			case ModificationmarksPackage.IEC_SEED_MODIFICATIONS__INTERFACE_MODIFICATIONS:
			case ModificationmarksPackage.IEC_SEED_MODIFICATIONS__ABSTRACT_METHOD_MODIFICATIONS:
			case ModificationmarksPackage.IEC_SEED_MODIFICATIONS__ABSTRACT_PROPERTY_MODIFICATIONS:
			case ModificationmarksPackage.IEC_SEED_MODIFICATIONS__FUNCTION_BLOCK_MODIFICATIONS:
			case ModificationmarksPackage.IEC_SEED_MODIFICATIONS__METHOD_MODIFICATIONS:
			case ModificationmarksPackage.IEC_SEED_MODIFICATIONS__PROPERTY_MODIFICATIONS:
			case ModificationmarksPackage.IEC_SEED_MODIFICATIONS__FUNCTION_MODIFICATIONS:
			case ModificationmarksPackage.IEC_SEED_MODIFICATIONS__PROGRAM_MODIFICATIONS:
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
				(ModificationmarksPackage.Literals.IEC_SEED_MODIFICATIONS__GLOBAL_VARIABLE_MODIFICATIONS,
				 ModificationmarksFactory.eINSTANCE.createIECModifyGlobalVariable()));

		newChildDescriptors.add
			(createChildParameter
				(ModificationmarksPackage.Literals.IEC_SEED_MODIFICATIONS__INTERFACE_MODIFICATIONS,
				 ModificationmarksFactory.eINSTANCE.createIECModifyInterface()));

		newChildDescriptors.add
			(createChildParameter
				(ModificationmarksPackage.Literals.IEC_SEED_MODIFICATIONS__ABSTRACT_METHOD_MODIFICATIONS,
				 ModificationmarksFactory.eINSTANCE.createIECModifyAbstractMethod()));

		newChildDescriptors.add
			(createChildParameter
				(ModificationmarksPackage.Literals.IEC_SEED_MODIFICATIONS__ABSTRACT_PROPERTY_MODIFICATIONS,
				 ModificationmarksFactory.eINSTANCE.createIECModifyAbstractProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ModificationmarksPackage.Literals.IEC_SEED_MODIFICATIONS__FUNCTION_BLOCK_MODIFICATIONS,
				 ModificationmarksFactory.eINSTANCE.createIECModifyFunctionBlock()));

		newChildDescriptors.add
			(createChildParameter
				(ModificationmarksPackage.Literals.IEC_SEED_MODIFICATIONS__METHOD_MODIFICATIONS,
				 ModificationmarksFactory.eINSTANCE.createIECModifyMethod()));

		newChildDescriptors.add
			(createChildParameter
				(ModificationmarksPackage.Literals.IEC_SEED_MODIFICATIONS__PROPERTY_MODIFICATIONS,
				 ModificationmarksFactory.eINSTANCE.createIECModifyProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ModificationmarksPackage.Literals.IEC_SEED_MODIFICATIONS__FUNCTION_MODIFICATIONS,
				 ModificationmarksFactory.eINSTANCE.createIECModifyFunction()));

		newChildDescriptors.add
			(createChildParameter
				(ModificationmarksPackage.Literals.IEC_SEED_MODIFICATIONS__PROGRAM_MODIFICATIONS,
				 ModificationmarksFactory.eINSTANCE.createIECModifyProgram()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return IECModificationmarksEditPlugin.INSTANCE;
	}

}
