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

import org.omg.CVLMetamodelMaster.cvl.ConfigurableUnit;
import org.omg.CVLMetamodelMaster.cvl.CvlFactory;
import org.omg.CVLMetamodelMaster.cvl.CvlPackage;

/**
 * This is the item provider adapter for a {@link org.omg.CVLMetamodelMaster.cvl.ConfigurableUnit} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConfigurableUnitItemProvider extends CompositeVariationPointItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurableUnitItemProvider(AdapterFactory adapterFactory) {
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

			addUnitInterfacePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Unit Interface feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUnitInterfacePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConfigurableUnit_unitInterface_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConfigurableUnit_unitInterface_feature", "_UI_ConfigurableUnit_type"),
				 CvlPackage.Literals.CONFIGURABLE_UNIT__UNIT_INTERFACE,
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
			childrenFeatures.add(CvlPackage.Literals.CONFIGURABLE_UNIT__OWNED_VSPEC);
			childrenFeatures.add(CvlPackage.Literals.CONFIGURABLE_UNIT__OWNED_VARIATION_POINT);
			childrenFeatures.add(CvlPackage.Literals.CONFIGURABLE_UNIT__OWNED_CONSTRAINT);
			childrenFeatures.add(CvlPackage.Literals.CONFIGURABLE_UNIT__CONFIGURABLE_CONTAINER_OBJECT);
			childrenFeatures.add(CvlPackage.Literals.CONFIGURABLE_UNIT__OWNED_VSPEC_RESOLUTION);
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
	 * This returns ConfigurableUnit.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ConfigurableUnit"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ConfigurableUnit)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ConfigurableUnit_type") :
			getString("_UI_ConfigurableUnit_type") + " " + label;
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

		switch (notification.getFeatureID(ConfigurableUnit.class)) {
			case CvlPackage.CONFIGURABLE_UNIT__OWNED_VSPEC:
			case CvlPackage.CONFIGURABLE_UNIT__OWNED_VARIATION_POINT:
			case CvlPackage.CONFIGURABLE_UNIT__OWNED_CONSTRAINT:
			case CvlPackage.CONFIGURABLE_UNIT__CONFIGURABLE_CONTAINER_OBJECT:
			case CvlPackage.CONFIGURABLE_UNIT__OWNED_VSPEC_RESOLUTION:
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
				(CvlPackage.Literals.CONFIGURABLE_UNIT__OWNED_VSPEC,
				 CvlFactory.eINSTANCE.createChoice()));

		newChildDescriptors.add
			(createChildParameter
				(CvlPackage.Literals.CONFIGURABLE_UNIT__OWNED_VSPEC,
				 CvlFactory.eINSTANCE.createVClassifier()));

		newChildDescriptors.add
			(createChildParameter
				(CvlPackage.Literals.CONFIGURABLE_UNIT__OWNED_VSPEC,
				 CvlFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add
			(createChildParameter
				(CvlPackage.Literals.CONFIGURABLE_UNIT__OWNED_VSPEC,
				 CvlFactory.eINSTANCE.createCVSpec()));

		newChildDescriptors.add
			(createChildParameter
				(CvlPackage.Literals.CONFIGURABLE_UNIT__OWNED_VARIATION_POINT,
				 CvlFactory.eINSTANCE.createFragmentSubstitution()));

		newChildDescriptors.add
			(createChildParameter
				(CvlPackage.Literals.CONFIGURABLE_UNIT__OWNED_VARIATION_POINT,
				 CvlFactory.eINSTANCE.createPlacementFragment()));

		newChildDescriptors.add
			(createChildParameter
				(CvlPackage.Literals.CONFIGURABLE_UNIT__OWNED_VARIATION_POINT,
				 CvlFactory.eINSTANCE.createObjectSubstitution()));

		newChildDescriptors.add
			(createChildParameter
				(CvlPackage.Literals.CONFIGURABLE_UNIT__OWNED_VARIATION_POINT,
				 CvlFactory.eINSTANCE.createSlotAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(CvlPackage.Literals.CONFIGURABLE_UNIT__OWNED_VARIATION_POINT,
				 CvlFactory.eINSTANCE.createObjectExistence()));

		newChildDescriptors.add
			(createChildParameter
				(CvlPackage.Literals.CONFIGURABLE_UNIT__OWNED_VARIATION_POINT,
				 CvlFactory.eINSTANCE.createLinkAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(CvlPackage.Literals.CONFIGURABLE_UNIT__OWNED_VARIATION_POINT,
				 CvlFactory.eINSTANCE.createCompositeVariationPoint()));

		newChildDescriptors.add
			(createChildParameter
				(CvlPackage.Literals.CONFIGURABLE_UNIT__OWNED_VARIATION_POINT,
				 CvlFactory.eINSTANCE.createConfigurableUnit()));

		newChildDescriptors.add
			(createChildParameter
				(CvlPackage.Literals.CONFIGURABLE_UNIT__OWNED_VARIATION_POINT,
				 CvlFactory.eINSTANCE.createLinkExistence()));

		newChildDescriptors.add
			(createChildParameter
				(CvlPackage.Literals.CONFIGURABLE_UNIT__OWNED_VARIATION_POINT,
				 CvlFactory.eINSTANCE.createOpaqueVariationPoint()));

		newChildDescriptors.add
			(createChildParameter
				(CvlPackage.Literals.CONFIGURABLE_UNIT__OWNED_VARIATION_POINT,
				 CvlFactory.eINSTANCE.createSlotValueExistence()));

		newChildDescriptors.add
			(createChildParameter
				(CvlPackage.Literals.CONFIGURABLE_UNIT__OWNED_VARIATION_POINT,
				 CvlFactory.eINSTANCE.createParametricLinkAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(CvlPackage.Literals.CONFIGURABLE_UNIT__OWNED_VARIATION_POINT,
				 CvlFactory.eINSTANCE.createParametricObjectSubstitution()));

		newChildDescriptors.add
			(createChildParameter
				(CvlPackage.Literals.CONFIGURABLE_UNIT__OWNED_VARIATION_POINT,
				 CvlFactory.eINSTANCE.createParametricSlotAssignmet()));

		newChildDescriptors.add
			(createChildParameter
				(CvlPackage.Literals.CONFIGURABLE_UNIT__OWNED_VARIATION_POINT,
				 CvlFactory.eINSTANCE.createConfigurableUnitUsage()));

		newChildDescriptors.add
			(createChildParameter
				(CvlPackage.Literals.CONFIGURABLE_UNIT__OWNED_VARIATION_POINT,
				 CvlFactory.eINSTANCE.createPatternIntegration()));

		newChildDescriptors.add
			(createChildParameter
				(CvlPackage.Literals.CONFIGURABLE_UNIT__OWNED_VARIATION_POINT,
				 CvlFactory.eINSTANCE.createPatternFusion()));

		newChildDescriptors.add
			(createChildParameter
				(CvlPackage.Literals.CONFIGURABLE_UNIT__OWNED_VARIATION_POINT,
				 CvlFactory.eINSTANCE.createStructuralOrganisationalPattern()));

		newChildDescriptors.add
			(createChildParameter
				(CvlPackage.Literals.CONFIGURABLE_UNIT__OWNED_CONSTRAINT,
				 CvlFactory.eINSTANCE.createConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(CvlPackage.Literals.CONFIGURABLE_UNIT__OWNED_CONSTRAINT,
				 CvlFactory.eINSTANCE.createOpaqueConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(CvlPackage.Literals.CONFIGURABLE_UNIT__OWNED_CONSTRAINT,
				 CvlFactory.eINSTANCE.createOCLConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(CvlPackage.Literals.CONFIGURABLE_UNIT__CONFIGURABLE_CONTAINER_OBJECT,
				 CvlFactory.eINSTANCE.createObjectHandle()));

		newChildDescriptors.add
			(createChildParameter
				(CvlPackage.Literals.CONFIGURABLE_UNIT__OWNED_VSPEC_RESOLUTION,
				 CvlFactory.eINSTANCE.createChoiceResolutuion()));

		newChildDescriptors.add
			(createChildParameter
				(CvlPackage.Literals.CONFIGURABLE_UNIT__OWNED_VSPEC_RESOLUTION,
				 CvlFactory.eINSTANCE.createVInstance()));

		newChildDescriptors.add
			(createChildParameter
				(CvlPackage.Literals.CONFIGURABLE_UNIT__OWNED_VSPEC_RESOLUTION,
				 CvlFactory.eINSTANCE.createVariableValueAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(CvlPackage.Literals.CONFIGURABLE_UNIT__OWNED_VSPEC_RESOLUTION,
				 CvlFactory.eINSTANCE.createVConfiguration()));
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
			childFeature == CvlPackage.Literals.COMPOSITE_VARIATION_POINT__CHILDREN ||
			childFeature == CvlPackage.Literals.CONFIGURABLE_UNIT__OWNED_VARIATION_POINT;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
