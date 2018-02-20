/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.component.provider;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.muml.core.expressions.ExpressionsFactory;
import org.muml.core.expressions.common.CommonExpressionsFactory;
import org.muml.pim.behavior.BehaviorPackage;
import org.muml.pim.component.ComponentPackage;
import org.muml.pim.component.DirectedTypedPort;
import org.muml.pim.types.ArrayDataType;
import org.muml.pim.types.PrimitiveDataType;


/**
 * This is the item provider adapter for a {@link org.muml.pim.component.DirectedTypedPort} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DirectedTypedPortItemProvider
	extends PortItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectedTypedPortItemProvider(AdapterFactory adapterFactory) {
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

			addDataTypePropertyDescriptor(object);
			addKindPropertyDescriptor(object);
			addOptionalPropertyDescriptor(object);
			addOutPortPropertyDescriptor(object);
			addInPortPropertyDescriptor(object);
			addInitializeExpressionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}
	

	/**
	 * This adds a property descriptor for the Data Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addDataTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
		(new ItemPropertyDescriptor
			(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			 getResourceLocator(),
			 getString("_UI_TypedNamedElement_dataType_feature"),
			 getString("_UI_PropertyDescriptor_description", "_UI_TypedNamedElement_dataType_feature", "_UI_TypedNamedElement_type"),
			 BehaviorPackage.Literals.TYPED_NAMED_ELEMENT__DATA_TYPE,
			 true,
			 false,
			 true,
			 null,
			 null,
			 null) {

		@Override
		public Collection<?> getChoiceOfValues(Object object) {
			Collection<Object> choices = new ArrayList<Object>();
			for (Object value : super.getChoiceOfValues(object)) {
				if (value instanceof PrimitiveDataType || value instanceof ArrayDataType) {
					choices.add(value);
				}
			}
			return choices;
		}
	});
	}

	/**
	 * This adds a property descriptor for the Kind feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKindPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DirectedTypedPort_kind_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DirectedTypedPort_kind_feature", "_UI_DirectedTypedPort_type"),
				 ComponentPackage.Literals.DIRECTED_TYPED_PORT__KIND,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Optional feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOptionalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DirectedTypedPort_optional_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DirectedTypedPort_optional_feature", "_UI_DirectedTypedPort_type"),
				 ComponentPackage.Literals.DIRECTED_TYPED_PORT__OPTIONAL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the In Port feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInPortPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DirectedTypedPort_inPort_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DirectedTypedPort_inPort_feature", "_UI_DirectedTypedPort_type"),
				 ComponentPackage.Literals.DIRECTED_TYPED_PORT__IN_PORT,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Initialize Expression feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInitializeExpressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DirectedTypedPort_initializeExpression_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DirectedTypedPort_initializeExpression_feature", "_UI_DirectedTypedPort_type"),
				 ComponentPackage.Literals.DIRECTED_TYPED_PORT__INITIALIZE_EXPRESSION,
				 true,
				 false,
				 false,
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
			childrenFeatures.add(ComponentPackage.Literals.DIRECTED_TYPED_PORT__INITIALIZE_EXPRESSION);
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This adds a property descriptor for the Out Port feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutPortPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DirectedTypedPort_outPort_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DirectedTypedPort_outPort_feature", "_UI_DirectedTypedPort_type"),
				 ComponentPackage.Literals.DIRECTED_TYPED_PORT__OUT_PORT,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DirectedTypedPort)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_DirectedTypedPort_type") :
			getString("_UI_DirectedTypedPort_type") + " " + label;
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

		switch (notification.getFeatureID(DirectedTypedPort.class)) {
			case ComponentPackage.DIRECTED_TYPED_PORT__KIND:
			case ComponentPackage.DIRECTED_TYPED_PORT__OPTIONAL:
			case ComponentPackage.DIRECTED_TYPED_PORT__OUT_PORT:
			case ComponentPackage.DIRECTED_TYPED_PORT__IN_PORT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ComponentPackage.DIRECTED_TYPED_PORT__INITIALIZE_EXPRESSION:
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
				(ComponentPackage.Literals.DIRECTED_TYPED_PORT__INITIALIZE_EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createTextualExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentPackage.Literals.DIRECTED_TYPED_PORT__INITIALIZE_EXPRESSION,
				 CommonExpressionsFactory.eINSTANCE.createUnaryExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentPackage.Literals.DIRECTED_TYPED_PORT__INITIALIZE_EXPRESSION,
				 CommonExpressionsFactory.eINSTANCE.createComparisonExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentPackage.Literals.DIRECTED_TYPED_PORT__INITIALIZE_EXPRESSION,
				 CommonExpressionsFactory.eINSTANCE.createArithmeticExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentPackage.Literals.DIRECTED_TYPED_PORT__INITIALIZE_EXPRESSION,
				 CommonExpressionsFactory.eINSTANCE.createLogicalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentPackage.Literals.DIRECTED_TYPED_PORT__INITIALIZE_EXPRESSION,
				 CommonExpressionsFactory.eINSTANCE.createLiteralExpression()));
	}

}
