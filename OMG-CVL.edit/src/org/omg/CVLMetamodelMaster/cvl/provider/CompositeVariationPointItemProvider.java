/**
 */
package org.omg.CVLMetamodelMaster.cvl.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.omg.CVLMetamodelMaster.cvl.CompositeVariationPoint;
import org.omg.CVLMetamodelMaster.cvl.CvlFactory;
import org.omg.CVLMetamodelMaster.cvl.CvlPackage;

/**
 * This is the item provider adapter for a {@link org.omg.CVLMetamodelMaster.cvl.CompositeVariationPoint} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CompositeVariationPointItemProvider extends VariationPointItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeVariationPointItemProvider(AdapterFactory adapterFactory) {
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

			addBindingCVSpecPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Binding CV Spec feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBindingCVSpecPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CompositeVariationPoint_bindingCVSpec_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CompositeVariationPoint_bindingCVSpec_feature", "_UI_CompositeVariationPoint_type"),
				 CvlPackage.Literals.COMPOSITE_VARIATION_POINT__BINDING_CV_SPEC,
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
			childrenFeatures.add(CvlPackage.Literals.COMPOSITE_VARIATION_POINT__CHILDREN);
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
	 * This returns CompositeVariationPoint.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CompositeVariationPoint"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CompositeVariationPoint)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_CompositeVariationPoint_type") :
			getString("_UI_CompositeVariationPoint_type") + " " + label;
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

		switch (notification.getFeatureID(CompositeVariationPoint.class)) {
			case CvlPackage.COMPOSITE_VARIATION_POINT__CHILDREN:
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
				(CvlPackage.Literals.COMPOSITE_VARIATION_POINT__CHILDREN,
				 CvlFactory.eINSTANCE.createFragmentSubstitution()));

		newChildDescriptors.add
			(createChildParameter
				(CvlPackage.Literals.COMPOSITE_VARIATION_POINT__CHILDREN,
				 CvlFactory.eINSTANCE.createPlacementFragment()));

		newChildDescriptors.add
			(createChildParameter
				(CvlPackage.Literals.COMPOSITE_VARIATION_POINT__CHILDREN,
				 CvlFactory.eINSTANCE.createObjectSubstitution()));

		newChildDescriptors.add
			(createChildParameter
				(CvlPackage.Literals.COMPOSITE_VARIATION_POINT__CHILDREN,
				 CvlFactory.eINSTANCE.createSlotAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(CvlPackage.Literals.COMPOSITE_VARIATION_POINT__CHILDREN,
				 CvlFactory.eINSTANCE.createObjectExistence()));

		newChildDescriptors.add
			(createChildParameter
				(CvlPackage.Literals.COMPOSITE_VARIATION_POINT__CHILDREN,
				 CvlFactory.eINSTANCE.createLinkAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(CvlPackage.Literals.COMPOSITE_VARIATION_POINT__CHILDREN,
				 CvlFactory.eINSTANCE.createCompositeVariationPoint()));

		newChildDescriptors.add
			(createChildParameter
				(CvlPackage.Literals.COMPOSITE_VARIATION_POINT__CHILDREN,
				 CvlFactory.eINSTANCE.createConfigurableUnit()));

		newChildDescriptors.add
			(createChildParameter
				(CvlPackage.Literals.COMPOSITE_VARIATION_POINT__CHILDREN,
				 CvlFactory.eINSTANCE.createLinkExistence()));

		newChildDescriptors.add
			(createChildParameter
				(CvlPackage.Literals.COMPOSITE_VARIATION_POINT__CHILDREN,
				 CvlFactory.eINSTANCE.createOpaqueVariationPoint()));

		newChildDescriptors.add
			(createChildParameter
				(CvlPackage.Literals.COMPOSITE_VARIATION_POINT__CHILDREN,
				 CvlFactory.eINSTANCE.createSlotValueExistence()));

		newChildDescriptors.add
			(createChildParameter
				(CvlPackage.Literals.COMPOSITE_VARIATION_POINT__CHILDREN,
				 CvlFactory.eINSTANCE.createParametricLinkAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(CvlPackage.Literals.COMPOSITE_VARIATION_POINT__CHILDREN,
				 CvlFactory.eINSTANCE.createParametricObjectSubstitution()));

		newChildDescriptors.add
			(createChildParameter
				(CvlPackage.Literals.COMPOSITE_VARIATION_POINT__CHILDREN,
				 CvlFactory.eINSTANCE.createParametricSlotAssignmet()));

		newChildDescriptors.add
			(createChildParameter
				(CvlPackage.Literals.COMPOSITE_VARIATION_POINT__CHILDREN,
				 CvlFactory.eINSTANCE.createConfigurableUnitUsage()));

		newChildDescriptors.add
			(createChildParameter
				(CvlPackage.Literals.COMPOSITE_VARIATION_POINT__CHILDREN,
				 CvlFactory.eINSTANCE.createPatternIntegration()));

		newChildDescriptors.add
			(createChildParameter
				(CvlPackage.Literals.COMPOSITE_VARIATION_POINT__CHILDREN,
				 CvlFactory.eINSTANCE.createPatternFusion()));

		newChildDescriptors.add
			(createChildParameter
				(CvlPackage.Literals.COMPOSITE_VARIATION_POINT__CHILDREN,
				 CvlFactory.eINSTANCE.createStructuralOrganisationalPattern()));
	}

}
