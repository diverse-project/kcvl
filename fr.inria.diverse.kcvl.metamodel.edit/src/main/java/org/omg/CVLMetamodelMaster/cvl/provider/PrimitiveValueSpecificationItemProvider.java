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
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.omg.CVLMetamodelMaster.cvl.CvlFactory;
import org.omg.CVLMetamodelMaster.cvl.CvlPackage;
import org.omg.CVLMetamodelMaster.cvl.PrimitiveValueSpecification;

/**
 * This is the item provider adapter for a {@link org.omg.CVLMetamodelMaster.cvl.PrimitiveValueSpecification} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PrimitiveValueSpecificationItemProvider extends ValueSpecificationItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveValueSpecificationItemProvider(AdapterFactory adapterFactory) {
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

			addValuePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PrimitiveValueSpecification_value_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PrimitiveValueSpecification_value_feature", "_UI_PrimitiveValueSpecification_type"),
				 CvlPackage.Literals.PRIMITIVE_VALUE_SPECIFICATION__VALUE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(CvlPackage.Literals.PRIMITIVE_VALUE_SPECIFICATION__EXPRESSION);
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
	 * This returns PrimitiveValueSpecification.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PrimitiveValueSpecification"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((PrimitiveValueSpecification)object).getValue();
		return label == null || label.length() == 0 ?
			getString("_UI_PrimitiveValueSpecification_type") :
			getString("_UI_PrimitiveValueSpecification_type") + " " + label;
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

		switch (notification.getFeatureID(PrimitiveValueSpecification.class)) {
			case CvlPackage.PRIMITIVE_VALUE_SPECIFICATION__VALUE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CvlPackage.PRIMITIVE_VALUE_SPECIFICATION__EXPRESSION:
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
				(CvlPackage.Literals.PRIMITIVE_VALUE_SPECIFICATION__EXPRESSION,
				 CvlFactory.eINSTANCE.createOCLExpression()));

		newChildDescriptors.add
			(createChildParameter
				(CvlPackage.Literals.PRIMITIVE_VALUE_SPECIFICATION__EXPRESSION,
				 CvlFactory.eINSTANCE.createVSpecRef()));

		newChildDescriptors.add
			(createChildParameter
				(CvlPackage.Literals.PRIMITIVE_VALUE_SPECIFICATION__EXPRESSION,
				 CvlFactory.eINSTANCE.createOperationCallExp()));

		newChildDescriptors.add
			(createChildParameter
				(CvlPackage.Literals.PRIMITIVE_VALUE_SPECIFICATION__EXPRESSION,
				 CvlFactory.eINSTANCE.createBooleanLiteralExp()));

		newChildDescriptors.add
			(createChildParameter
				(CvlPackage.Literals.PRIMITIVE_VALUE_SPECIFICATION__EXPRESSION,
				 CvlFactory.eINSTANCE.createStringLiteralExp()));

		newChildDescriptors.add
			(createChildParameter
				(CvlPackage.Literals.PRIMITIVE_VALUE_SPECIFICATION__EXPRESSION,
				 CvlFactory.eINSTANCE.createNumericLiteralExp()));

		newChildDescriptors.add
			(createChildParameter
				(CvlPackage.Literals.PRIMITIVE_VALUE_SPECIFICATION__EXPRESSION,
				 CvlFactory.eINSTANCE.createIntegerLiteralExp()));

		newChildDescriptors.add
			(createChildParameter
				(CvlPackage.Literals.PRIMITIVE_VALUE_SPECIFICATION__EXPRESSION,
				 CvlFactory.eINSTANCE.createUnlimitedLiteralExp()));

		newChildDescriptors.add
			(createChildParameter
				(CvlPackage.Literals.PRIMITIVE_VALUE_SPECIFICATION__EXPRESSION,
				 CvlFactory.eINSTANCE.createRealLiteralExp()));
	}

}
