/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.provider;


import edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.FieldOfActivityAnnotationsFactory;
import edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.FieldOfActivityAnnotationsPackage;
import edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.FieldOfActivityAnnotationsRepository;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link edu.kit.ipd.sdq.kamp4iec.model.FieldOfActivityAnnotations.FieldOfActivityAnnotationsRepository} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FieldOfActivityAnnotationsRepositoryItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldOfActivityAnnotationsRepositoryItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(FieldOfActivityAnnotationsPackage.Literals.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__DEVELOPMENT_ARTEFACT_SPECIFICATION);
			childrenFeatures.add(FieldOfActivityAnnotationsPackage.Literals.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__BUILD_SPECIFICATION);
			childrenFeatures.add(FieldOfActivityAnnotationsPackage.Literals.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__TEST_SPECIFICATION);
			childrenFeatures.add(FieldOfActivityAnnotationsPackage.Literals.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__RELEASE_SPECIFICATION);
			childrenFeatures.add(FieldOfActivityAnnotationsPackage.Literals.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__DEPLOYMENT_SPECIFICATION);
			childrenFeatures.add(FieldOfActivityAnnotationsPackage.Literals.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__STAFF_SPECIFICATION);
			childrenFeatures.add(FieldOfActivityAnnotationsPackage.Literals.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__TECHNOLOGY_SPECIFICATION);
			childrenFeatures.add(FieldOfActivityAnnotationsPackage.Literals.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__DESIGN_PATTERN_SPECIFICATION);
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
	 * This returns FieldOfActivityAnnotationsRepository.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FieldOfActivityAnnotationsRepository"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_FieldOfActivityAnnotationsRepository_type");
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

		switch (notification.getFeatureID(FieldOfActivityAnnotationsRepository.class)) {
			case FieldOfActivityAnnotationsPackage.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__DEVELOPMENT_ARTEFACT_SPECIFICATION:
			case FieldOfActivityAnnotationsPackage.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__BUILD_SPECIFICATION:
			case FieldOfActivityAnnotationsPackage.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__TEST_SPECIFICATION:
			case FieldOfActivityAnnotationsPackage.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__RELEASE_SPECIFICATION:
			case FieldOfActivityAnnotationsPackage.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__DEPLOYMENT_SPECIFICATION:
			case FieldOfActivityAnnotationsPackage.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__STAFF_SPECIFICATION:
			case FieldOfActivityAnnotationsPackage.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__TECHNOLOGY_SPECIFICATION:
			case FieldOfActivityAnnotationsPackage.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__DESIGN_PATTERN_SPECIFICATION:
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
				(FieldOfActivityAnnotationsPackage.Literals.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__DEVELOPMENT_ARTEFACT_SPECIFICATION,
				 FieldOfActivityAnnotationsFactory.eINSTANCE.createDevelopmentArtefactSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(FieldOfActivityAnnotationsPackage.Literals.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__BUILD_SPECIFICATION,
				 FieldOfActivityAnnotationsFactory.eINSTANCE.createBuildSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(FieldOfActivityAnnotationsPackage.Literals.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__TEST_SPECIFICATION,
				 FieldOfActivityAnnotationsFactory.eINSTANCE.createTestSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(FieldOfActivityAnnotationsPackage.Literals.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__RELEASE_SPECIFICATION,
				 FieldOfActivityAnnotationsFactory.eINSTANCE.createReleaseSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(FieldOfActivityAnnotationsPackage.Literals.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__DEPLOYMENT_SPECIFICATION,
				 FieldOfActivityAnnotationsFactory.eINSTANCE.createDeploymentSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(FieldOfActivityAnnotationsPackage.Literals.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__STAFF_SPECIFICATION,
				 FieldOfActivityAnnotationsFactory.eINSTANCE.createStaffSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(FieldOfActivityAnnotationsPackage.Literals.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__TECHNOLOGY_SPECIFICATION,
				 FieldOfActivityAnnotationsFactory.eINSTANCE.createTechnologySpecification()));

		newChildDescriptors.add
			(createChildParameter
				(FieldOfActivityAnnotationsPackage.Literals.FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__DESIGN_PATTERN_SPECIFICATION,
				 FieldOfActivityAnnotationsFactory.eINSTANCE.createDesignPatternSpecification()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return FieldOfActivityAnnotationsEditPlugin.INSTANCE;
	}

}
