package de.uni_paderborn.fujaba.muml.common.emf.edit.provider.org.storydriven.modeling.calls;

import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.storydriven.modeling.calls.CallsPackage;
import org.storydriven.modeling.calls.provider.ParameterBindingItemProvider;
import org.storydriven.modeling.expressions.ExpressionsPackage;

import de.uni_paderborn.fujaba.common.descriptor.DefaultChainedPropertyDescriptor;
import de.uni_paderborn.fujaba.common.descriptor.IChainedPropertyDescriptor;

public class CustomParameterBindingItemProvider extends
		ParameterBindingItemProvider {

	public CustomParameterBindingItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}
	
	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			// Add custom property descriptors here...
			addInvocationPropertyDescriptor(object);
			addValueExpressionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}
	

	/**
	 * This adds a property descriptor for the Invocation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInvocationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			 getResourceLocator(),
			 getString("_UI_ParameterBinding_invocation_feature"),
			 getString("_UI_PropertyDescriptor_description", "_UI_ParameterBinding_invocation_feature", "_UI_ParameterBinding_type"),
			 CallsPackage.Literals.PARAMETER_BINDING__INVOCATION,
			 true,
			 false,
			 false,
			 null,
			 null,
			 null));
	}


	/**
	 * This adds a property descriptor for the Value Expression feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addValueExpressionPropertyDescriptor(Object object) {
		DefaultChainedPropertyDescriptor rootPropertyDescriptor = new DefaultChainedPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			 getResourceLocator(),
			 getString("_UI_ParameterBinding_valueExpression_feature"),
			 getString("_UI_PropertyDescriptor_description", "_UI_ParameterBinding_valueExpression_feature", "_UI_ParameterBinding_type"),
			 CallsPackage.Literals.PARAMETER_BINDING__VALUE_EXPRESSION,
			 true,
			 false,
			 false,
			 null,
			 null,
			 null);
		rootPropertyDescriptor.setInstanceClass(ExpressionsPackage.Literals.LITERAL_EXPRESSION);

		itemPropertyDescriptors.add(new DefaultChainedPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			 getResourceLocator(),
			 getString("_UI_LiteralExpression_value_feature"),
			 getString("_UI_PropertyDescriptor_description", "_UI_LiteralExpression_value_feature", "_UI_LiteralExpression_type"),
			 ExpressionsPackage.Literals.LITERAL_EXPRESSION__VALUE,
			 true,
			 false,
			 false,
			 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
			 null,
			 null,
			 rootPropertyDescriptor));

		itemPropertyDescriptors.add(new DefaultChainedPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			 getResourceLocator(),
			 getString("_UI_LiteralExpression_valueType_feature"),
			 getString("_UI_PropertyDescriptor_description", "_UI_LiteralExpression_valueType_feature", "_UI_LiteralExpression_type"),
			 ExpressionsPackage.Literals.LITERAL_EXPRESSION__VALUE_TYPE,
			 true,
			 false,
			 true,
			 null,
			 null,
			 null,
			 rootPropertyDescriptor));
	}

}
