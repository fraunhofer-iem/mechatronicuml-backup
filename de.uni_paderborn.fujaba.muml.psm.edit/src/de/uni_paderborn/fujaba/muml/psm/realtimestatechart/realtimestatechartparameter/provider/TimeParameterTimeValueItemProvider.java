/**
 */
package de.uni_paderborn.fujaba.muml.psm.realtimestatechart.realtimestatechartparameter.provider;


import de.uni_paderborn.fujaba.muml.actionlanguage.ActionlanguageFactory;

import de.uni_paderborn.fujaba.muml.psm.api.apiexpressions.ApiexpressionsFactory;

import de.uni_paderborn.fujaba.muml.psm.provider.PsmEditPlugin;

import de.uni_paderborn.fujaba.muml.psm.realtimestatechart.realtimestatechartparameter.RealtimestatechartparameterFactory;
import de.uni_paderborn.fujaba.muml.psm.realtimestatechart.realtimestatechartparameter.RealtimestatechartparameterPackage;
import de.uni_paderborn.fujaba.muml.psm.realtimestatechart.realtimestatechartparameter.TimeParameterTimeValue;

import de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage;

import de.uni_paderborn.fujaba.muml.valuetype.provider.TimeValueItemProvider;

import java.util.Collection;
import java.util.List;

import java.util.concurrent.TimeUnit;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the item provider adapter for a {@link de.uni_paderborn.fujaba.muml.psm.realtimestatechart.realtimestatechartparameter.TimeParameterTimeValue} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TimeParameterTimeValueItemProvider
	extends TimeValueItemProvider
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
	public TimeParameterTimeValueItemProvider(AdapterFactory adapterFactory) {
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

			addParameterPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TimeParameterTimeValue_parameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TimeParameterTimeValue_parameter_feature", "_UI_TimeParameterTimeValue_type"),
				 RealtimestatechartparameterPackage.Literals.TIME_PARAMETER_TIME_VALUE__PARAMETER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns TimeParameterTimeValue.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TimeParameterTimeValue"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		TimeUnit labelValue = ((TimeParameterTimeValue)object).getUnit();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_TimeParameterTimeValue_type") :
			getString("_UI_TimeParameterTimeValue_type") + " " + label;
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
				(ValuetypePackage.Literals.TIME_VALUE__VALUE,
				 RealtimestatechartparameterFactory.eINSTANCE.createAPICallExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ValuetypePackage.Literals.TIME_VALUE__VALUE,
				 ApiexpressionsFactory.eINSTANCE.createAPICall()));

		newChildDescriptors.add
			(createChildParameter
				(ValuetypePackage.Literals.TIME_VALUE__VALUE,
				 ApiexpressionsFactory.eINSTANCE.createEnumerationValueExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ValuetypePackage.Literals.TIME_VALUE__VALUE,
				 ApiexpressionsFactory.eINSTANCE.createContinuousPortExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ValuetypePackage.Literals.TIME_VALUE__VALUE,
				 ActionlanguageFactory.eINSTANCE.createBlock()));

		newChildDescriptors.add
			(createChildParameter
				(ValuetypePackage.Literals.TIME_VALUE__VALUE,
				 ActionlanguageFactory.eINSTANCE.createWhileLoop()));

		newChildDescriptors.add
			(createChildParameter
				(ValuetypePackage.Literals.TIME_VALUE__VALUE,
				 ActionlanguageFactory.eINSTANCE.createDoWhileLoop()));

		newChildDescriptors.add
			(createChildParameter
				(ValuetypePackage.Literals.TIME_VALUE__VALUE,
				 ActionlanguageFactory.eINSTANCE.createAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(ValuetypePackage.Literals.TIME_VALUE__VALUE,
				 ActionlanguageFactory.eINSTANCE.createForLoop()));

		newChildDescriptors.add
			(createChildParameter
				(ValuetypePackage.Literals.TIME_VALUE__VALUE,
				 ActionlanguageFactory.eINSTANCE.createIfStatement()));

		newChildDescriptors.add
			(createChildParameter
				(ValuetypePackage.Literals.TIME_VALUE__VALUE,
				 ActionlanguageFactory.eINSTANCE.createOperationCall()));

		newChildDescriptors.add
			(createChildParameter
				(ValuetypePackage.Literals.TIME_VALUE__VALUE,
				 ActionlanguageFactory.eINSTANCE.createReturnStatement()));

		newChildDescriptors.add
			(createChildParameter
				(ValuetypePackage.Literals.TIME_VALUE__VALUE,
				 ActionlanguageFactory.eINSTANCE.createTriggerMessageExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ValuetypePackage.Literals.TIME_VALUE__VALUE,
				 ActionlanguageFactory.eINSTANCE.createDiscreteInteractionEndpointReference()));

		newChildDescriptors.add
			(createChildParameter
				(ValuetypePackage.Literals.TIME_VALUE__VALUE,
				 ActionlanguageFactory.eINSTANCE.createPositionSelector()));

		newChildDescriptors.add
			(createChildParameter
				(ValuetypePackage.Literals.TIME_VALUE__VALUE,
				 ActionlanguageFactory.eINSTANCE.createLocalVariableDeclarationStatement()));

		newChildDescriptors.add
			(createChildParameter
				(ValuetypePackage.Literals.TIME_VALUE__VALUE,
				 ActionlanguageFactory.eINSTANCE.createTypedNamedElementExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ValuetypePackage.Literals.TIME_VALUE__VALUE,
				 ActionlanguageFactory.eINSTANCE.createArrayInitializeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ValuetypePackage.Literals.TIME_VALUE__VALUE,
				 ActionlanguageFactory.eINSTANCE.createNondeterministicChoiceExpression()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return PsmEditPlugin.INSTANCE;
	}

}
