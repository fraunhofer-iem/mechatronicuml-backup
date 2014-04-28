/**
 */
package de.uni_paderborn.fujaba.muml.psm.realtimestatechart.realtimestatechartparameter.provider;


import de.uni_paderborn.fujaba.muml.actionlanguage.ActionlanguageFactory;

import de.uni_paderborn.fujaba.muml.behavior.BehaviorFactory;
import de.uni_paderborn.fujaba.muml.behavior.BehaviorPackage;

import de.uni_paderborn.fujaba.muml.psm.api.apiexpressions.ApiexpressionsFactory;

import de.uni_paderborn.fujaba.muml.psm.realtimestatechart.realtimestatechartparameter.APICallSignature;
import de.uni_paderborn.fujaba.muml.psm.realtimestatechart.realtimestatechartparameter.RealtimestatechartparameterFactory;
import de.uni_paderborn.fujaba.muml.psm.realtimestatechart.realtimestatechartparameter.RealtimestatechartparameterPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.storydriven.core.expressions.ExpressionsFactory;

import org.storydriven.core.expressions.common.CommonExpressionsFactory;

/**
 * This is the item provider adapter for a {@link de.uni_paderborn.fujaba.muml.psm.realtimestatechart.realtimestatechartparameter.APICallSignature} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class APICallSignatureItemProvider
	extends RealtimeStatechartParameterItemProvider
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
	public APICallSignatureItemProvider(AdapterFactory adapterFactory) {
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

			addImplementationsPropertyDescriptor(object);
			addParametersPropertyDescriptor(object);
			addReturnTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Implementations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImplementationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Operation_implementations_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Operation_implementations_feature", "_UI_Operation_type"),
				 BehaviorPackage.Literals.OPERATION__IMPLEMENTATIONS,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameters feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParametersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Operation_parameters_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Operation_parameters_feature", "_UI_Operation_type"),
				 BehaviorPackage.Literals.OPERATION__PARAMETERS,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Return Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReturnTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Operation_returnType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Operation_returnType_feature", "_UI_Operation_type"),
				 BehaviorPackage.Literals.OPERATION__RETURN_TYPE,
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
			childrenFeatures.add(BehaviorPackage.Literals.OPERATION__IMPLEMENTATIONS);
			childrenFeatures.add(BehaviorPackage.Literals.OPERATION__PARAMETERS);
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
	 * This returns APICallSignature.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/APICallSignature"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((APICallSignature)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_APICallSignature_type") :
			getString("_UI_APICallSignature_type") + " " + label;
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

		switch (notification.getFeatureID(APICallSignature.class)) {
			case RealtimestatechartparameterPackage.API_CALL_SIGNATURE__IMPLEMENTATIONS:
			case RealtimestatechartparameterPackage.API_CALL_SIGNATURE__PARAMETERS:
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
				(BehaviorPackage.Literals.OPERATION__IMPLEMENTATIONS,
				 RealtimestatechartparameterFactory.eINSTANCE.createAPICallExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.OPERATION__IMPLEMENTATIONS,
				 ApiexpressionsFactory.eINSTANCE.createAPICall()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.OPERATION__IMPLEMENTATIONS,
				 ApiexpressionsFactory.eINSTANCE.createEnumerationValueExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.OPERATION__IMPLEMENTATIONS,
				 ApiexpressionsFactory.eINSTANCE.createContinuousPortExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.OPERATION__IMPLEMENTATIONS,
				 ActionlanguageFactory.eINSTANCE.createBlock()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.OPERATION__IMPLEMENTATIONS,
				 ActionlanguageFactory.eINSTANCE.createWhileLoop()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.OPERATION__IMPLEMENTATIONS,
				 ActionlanguageFactory.eINSTANCE.createDoWhileLoop()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.OPERATION__IMPLEMENTATIONS,
				 ActionlanguageFactory.eINSTANCE.createAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.OPERATION__IMPLEMENTATIONS,
				 ActionlanguageFactory.eINSTANCE.createForLoop()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.OPERATION__IMPLEMENTATIONS,
				 ActionlanguageFactory.eINSTANCE.createIfStatement()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.OPERATION__IMPLEMENTATIONS,
				 ActionlanguageFactory.eINSTANCE.createOperationCall()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.OPERATION__IMPLEMENTATIONS,
				 ActionlanguageFactory.eINSTANCE.createReturnStatement()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.OPERATION__IMPLEMENTATIONS,
				 ActionlanguageFactory.eINSTANCE.createTriggerMessageExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.OPERATION__IMPLEMENTATIONS,
				 ActionlanguageFactory.eINSTANCE.createDiscreteInteractionEndpointReference()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.OPERATION__IMPLEMENTATIONS,
				 ActionlanguageFactory.eINSTANCE.createPositionSelector()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.OPERATION__IMPLEMENTATIONS,
				 ActionlanguageFactory.eINSTANCE.createLocalVariableDeclarationStatement()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.OPERATION__IMPLEMENTATIONS,
				 ActionlanguageFactory.eINSTANCE.createTypedNamedElementExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.OPERATION__IMPLEMENTATIONS,
				 ActionlanguageFactory.eINSTANCE.createArrayInitializeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.OPERATION__IMPLEMENTATIONS,
				 ActionlanguageFactory.eINSTANCE.createNondeterministicChoiceExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.OPERATION__IMPLEMENTATIONS,
				 ExpressionsFactory.eINSTANCE.createTextualExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.OPERATION__IMPLEMENTATIONS,
				 CommonExpressionsFactory.eINSTANCE.createUnaryExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.OPERATION__IMPLEMENTATIONS,
				 CommonExpressionsFactory.eINSTANCE.createComparisonExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.OPERATION__IMPLEMENTATIONS,
				 CommonExpressionsFactory.eINSTANCE.createArithmeticExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.OPERATION__IMPLEMENTATIONS,
				 CommonExpressionsFactory.eINSTANCE.createLogicalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.OPERATION__IMPLEMENTATIONS,
				 CommonExpressionsFactory.eINSTANCE.createLiteralExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.OPERATION__PARAMETERS,
				 BehaviorFactory.eINSTANCE.createParameter()));
	}

}
