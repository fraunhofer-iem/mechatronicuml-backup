/**
 */
package de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.provider;


import de.uni_paderborn.fujaba.muml.behavior.BehaviorFactory;

import de.uni_paderborn.fujaba.muml.component.ComponentFactory;

import de.uni_paderborn.fujaba.muml.connector.ConnectorFactory;

import de.uni_paderborn.fujaba.muml.instance.InstanceFactory;

import de.uni_paderborn.fujaba.muml.msgtype.MsgtypeFactory;

import de.uni_paderborn.fujaba.muml.protocol.ProtocolFactory;

import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartFactory;

import de.uni_paderborn.fujaba.muml.types.TypesFactory;

import de.uni_paderborn.fujaba.muml.valuetype.ValuetypeFactory;

import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.BooleanLogic.BooleanLogicFactory;

import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.ComparablesFactory;

import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.MtctlFactory;

import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.ComparisonExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.PredicatesFactory;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.PredicatesPackage;

import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.QuantifiersFactory;

import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.SetsFactory;

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
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.storydriven.core.expressions.ExpressionsFactory;

import org.storydriven.core.expressions.common.CommonExpressionsFactory;

/**
 * This is the item provider adapter for a {@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.ComparisonExpr} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComparisonExprItemProvider
	extends PredicateExprItemProvider
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
	public ComparisonExprItemProvider(AdapterFactory adapterFactory) {
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

			addOpPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Op feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOpPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComparisonExpr_op_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComparisonExpr_op_feature", "_UI_ComparisonExpr_type"),
				 PredicatesPackage.Literals.COMPARISON_EXPR__OP,
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
			childrenFeatures.add(PredicatesPackage.Literals.COMPARISON_EXPR__LHS);
			childrenFeatures.add(PredicatesPackage.Literals.COMPARISON_EXPR__RHS);
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
	 * This returns ComparisonExpr.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ComparisonExpr"));
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ComparisonExpr)object).getComment();
		return label == null || label.length() == 0 ?
			getString("_UI_ComparisonExpr_type") :
			getString("_UI_ComparisonExpr_type") + " " + label;
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

		switch (notification.getFeatureID(ComparisonExpr.class)) {
			case PredicatesPackage.COMPARISON_EXPR__OP:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case PredicatesPackage.COMPARISON_EXPR__LHS:
			case PredicatesPackage.COMPARISON_EXPR__RHS:
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
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 PredicatesFactory.eINSTANCE.createPredicateExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 PredicatesFactory.eINSTANCE.createDeadlockExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 PredicatesFactory.eINSTANCE.createBufferOverflowExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 PredicatesFactory.eINSTANCE.createComparisonExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 PredicatesFactory.eINSTANCE.createMessageInBufferExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 PredicatesFactory.eINSTANCE.createMessageInTransitExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 PredicatesFactory.eINSTANCE.createStateActiveExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 PredicatesFactory.eINSTANCE.createSubstateOfExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 PredicatesFactory.eINSTANCE.createTransitionFiringExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 PredicatesFactory.eINSTANCE.createTrueExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 PredicatesFactory.eINSTANCE.createFalseExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 MtctlFactory.eINSTANCE.createPropertyRepository()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 QuantifiersFactory.eINSTANCE.createAFExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 QuantifiersFactory.eINSTANCE.createAGExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 QuantifiersFactory.eINSTANCE.createEFExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 QuantifiersFactory.eINSTANCE.createEGExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 QuantifiersFactory.eINSTANCE.createExistenceQuantExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 QuantifiersFactory.eINSTANCE.createBoundVariable()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 QuantifiersFactory.eINSTANCE.createUniversalQuantExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 QuantifiersFactory.eINSTANCE.createLeadsToExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 QuantifiersFactory.eINSTANCE.createTimeIntervalExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 SetsFactory.eINSTANCE.createClockSetExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 SetsFactory.eINSTANCE.createIntervalSetExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 SetsFactory.eINSTANCE.createMessageSetExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 SetsFactory.eINSTANCE.createStateSetExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 SetsFactory.eINSTANCE.createTransitionSetExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 SetsFactory.eINSTANCE.createBufferSetExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 BooleanLogicFactory.eINSTANCE.createAndExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 BooleanLogicFactory.eINSTANCE.createImplyExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 BooleanLogicFactory.eINSTANCE.createNotExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 BooleanLogicFactory.eINSTANCE.createOrExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 ComparablesFactory.eINSTANCE.createBufferMsgCountExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 ComparablesFactory.eINSTANCE.createConstExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 ComparablesFactory.eINSTANCE.createMumlElemExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 ComparablesFactory.eINSTANCE.createSourceStateExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 ComparablesFactory.eINSTANCE.createTargetStateExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 ExpressionsFactory.eINSTANCE.createTextualExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 CommonExpressionsFactory.eINSTANCE.createUnaryExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 CommonExpressionsFactory.eINSTANCE.createComparisonExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 CommonExpressionsFactory.eINSTANCE.createArithmeticExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 CommonExpressionsFactory.eINSTANCE.createLogicalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 CommonExpressionsFactory.eINSTANCE.createLiteralExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 ComponentFactory.eINSTANCE.createContinuousPort()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 ComponentFactory.eINSTANCE.createDiscretePort()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 ComponentFactory.eINSTANCE.createComponentPart()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 ComponentFactory.eINSTANCE.createStaticStructuredComponent()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 ComponentFactory.eINSTANCE.createAssemblyConnector()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 ComponentFactory.eINSTANCE.createDelegationConnector()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 ComponentFactory.eINSTANCE.createHybridPort()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 ComponentFactory.eINSTANCE.createCoordinationProtocolPart()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 ComponentFactory.eINSTANCE.createPortPart()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 ComponentFactory.eINSTANCE.createStaticAtomicComponent()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 InstanceFactory.eINSTANCE.createAssemblyConnectorInstance()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 InstanceFactory.eINSTANCE.createDelegationConnectorInstance()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 InstanceFactory.eINSTANCE.createComponentInstanceConfiguration()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 InstanceFactory.eINSTANCE.createContinuousPortInstance()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 InstanceFactory.eINSTANCE.createHybridPortInstance()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 InstanceFactory.eINSTANCE.createDiscreteSinglePortInstance()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 InstanceFactory.eINSTANCE.createDiscreteMultiPortInstance()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 InstanceFactory.eINSTANCE.createCoordinationProtocolInstance()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 InstanceFactory.eINSTANCE.createStructuredComponentInstance()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 InstanceFactory.eINSTANCE.createAtomicComponentInstance()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 ProtocolFactory.eINSTANCE.createCoordinationProtocol()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 ProtocolFactory.eINSTANCE.createRole()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 ProtocolFactory.eINSTANCE.createRoleConnector()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 ProtocolFactory.eINSTANCE.createConnectorQualityOfServiceAssumptions()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 RealtimestatechartFactory.eINSTANCE.createAbsoluteDeadline()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 RealtimestatechartFactory.eINSTANCE.createRelativeDeadline()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 RealtimestatechartFactory.eINSTANCE.createClock()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 RealtimestatechartFactory.eINSTANCE.createRegion()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 RealtimestatechartFactory.eINSTANCE.createState()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 RealtimestatechartFactory.eINSTANCE.createTransition()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 RealtimestatechartFactory.eINSTANCE.createClockConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 RealtimestatechartFactory.eINSTANCE.createAction()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 RealtimestatechartFactory.eINSTANCE.createAsynchronousMessageEvent()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 RealtimestatechartFactory.eINSTANCE.createDoEvent()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 RealtimestatechartFactory.eINSTANCE.createSynchronizationChannel()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 RealtimestatechartFactory.eINSTANCE.createSynchronization()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 RealtimestatechartFactory.eINSTANCE.createRealtimeStatechart()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 RealtimestatechartFactory.eINSTANCE.createMessage()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 RealtimestatechartFactory.eINSTANCE.createEntryEvent()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 RealtimestatechartFactory.eINSTANCE.createExitEvent()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 RealtimestatechartFactory.eINSTANCE.createEntryPoint()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 RealtimestatechartFactory.eINSTANCE.createExitPoint()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 MsgtypeFactory.eINSTANCE.createMessageType()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 MsgtypeFactory.eINSTANCE.createMessageTypeRepository()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 TypesFactory.eINSTANCE.createArrayDataType()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 TypesFactory.eINSTANCE.createPrimitiveDataType()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 TypesFactory.eINSTANCE.createRangedPrimitiveDataType()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 ConnectorFactory.eINSTANCE.createMessageBuffer()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 ValuetypeFactory.eINSTANCE.createCardinality()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 ValuetypeFactory.eINSTANCE.createTimeValue()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 ValuetypeFactory.eINSTANCE.createNaturalNumber()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 ValuetypeFactory.eINSTANCE.createRange()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 BehaviorFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 BehaviorFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 BehaviorFactory.eINSTANCE.createParameterBinding()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__LHS,
				 BehaviorFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 PredicatesFactory.eINSTANCE.createPredicateExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 PredicatesFactory.eINSTANCE.createDeadlockExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 PredicatesFactory.eINSTANCE.createBufferOverflowExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 PredicatesFactory.eINSTANCE.createComparisonExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 PredicatesFactory.eINSTANCE.createMessageInBufferExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 PredicatesFactory.eINSTANCE.createMessageInTransitExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 PredicatesFactory.eINSTANCE.createStateActiveExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 PredicatesFactory.eINSTANCE.createSubstateOfExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 PredicatesFactory.eINSTANCE.createTransitionFiringExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 PredicatesFactory.eINSTANCE.createTrueExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 PredicatesFactory.eINSTANCE.createFalseExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 MtctlFactory.eINSTANCE.createPropertyRepository()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 QuantifiersFactory.eINSTANCE.createAFExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 QuantifiersFactory.eINSTANCE.createAGExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 QuantifiersFactory.eINSTANCE.createEFExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 QuantifiersFactory.eINSTANCE.createEGExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 QuantifiersFactory.eINSTANCE.createExistenceQuantExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 QuantifiersFactory.eINSTANCE.createBoundVariable()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 QuantifiersFactory.eINSTANCE.createUniversalQuantExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 QuantifiersFactory.eINSTANCE.createLeadsToExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 QuantifiersFactory.eINSTANCE.createTimeIntervalExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 SetsFactory.eINSTANCE.createClockSetExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 SetsFactory.eINSTANCE.createIntervalSetExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 SetsFactory.eINSTANCE.createMessageSetExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 SetsFactory.eINSTANCE.createStateSetExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 SetsFactory.eINSTANCE.createTransitionSetExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 SetsFactory.eINSTANCE.createBufferSetExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 BooleanLogicFactory.eINSTANCE.createAndExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 BooleanLogicFactory.eINSTANCE.createImplyExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 BooleanLogicFactory.eINSTANCE.createNotExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 BooleanLogicFactory.eINSTANCE.createOrExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 ComparablesFactory.eINSTANCE.createBufferMsgCountExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 ComparablesFactory.eINSTANCE.createConstExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 ComparablesFactory.eINSTANCE.createMumlElemExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 ComparablesFactory.eINSTANCE.createSourceStateExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 ComparablesFactory.eINSTANCE.createTargetStateExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 ExpressionsFactory.eINSTANCE.createTextualExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 CommonExpressionsFactory.eINSTANCE.createUnaryExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 CommonExpressionsFactory.eINSTANCE.createComparisonExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 CommonExpressionsFactory.eINSTANCE.createArithmeticExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 CommonExpressionsFactory.eINSTANCE.createLogicalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 CommonExpressionsFactory.eINSTANCE.createLiteralExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 ComponentFactory.eINSTANCE.createContinuousPort()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 ComponentFactory.eINSTANCE.createDiscretePort()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 ComponentFactory.eINSTANCE.createComponentPart()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 ComponentFactory.eINSTANCE.createStaticStructuredComponent()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 ComponentFactory.eINSTANCE.createAssemblyConnector()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 ComponentFactory.eINSTANCE.createDelegationConnector()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 ComponentFactory.eINSTANCE.createHybridPort()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 ComponentFactory.eINSTANCE.createCoordinationProtocolPart()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 ComponentFactory.eINSTANCE.createPortPart()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 ComponentFactory.eINSTANCE.createStaticAtomicComponent()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 InstanceFactory.eINSTANCE.createAssemblyConnectorInstance()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 InstanceFactory.eINSTANCE.createDelegationConnectorInstance()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 InstanceFactory.eINSTANCE.createComponentInstanceConfiguration()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 InstanceFactory.eINSTANCE.createContinuousPortInstance()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 InstanceFactory.eINSTANCE.createHybridPortInstance()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 InstanceFactory.eINSTANCE.createDiscreteSinglePortInstance()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 InstanceFactory.eINSTANCE.createDiscreteMultiPortInstance()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 InstanceFactory.eINSTANCE.createCoordinationProtocolInstance()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 InstanceFactory.eINSTANCE.createStructuredComponentInstance()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 InstanceFactory.eINSTANCE.createAtomicComponentInstance()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 ProtocolFactory.eINSTANCE.createCoordinationProtocol()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 ProtocolFactory.eINSTANCE.createRole()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 ProtocolFactory.eINSTANCE.createRoleConnector()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 ProtocolFactory.eINSTANCE.createConnectorQualityOfServiceAssumptions()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 RealtimestatechartFactory.eINSTANCE.createAbsoluteDeadline()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 RealtimestatechartFactory.eINSTANCE.createRelativeDeadline()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 RealtimestatechartFactory.eINSTANCE.createClock()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 RealtimestatechartFactory.eINSTANCE.createRegion()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 RealtimestatechartFactory.eINSTANCE.createState()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 RealtimestatechartFactory.eINSTANCE.createTransition()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 RealtimestatechartFactory.eINSTANCE.createClockConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 RealtimestatechartFactory.eINSTANCE.createAction()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 RealtimestatechartFactory.eINSTANCE.createAsynchronousMessageEvent()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 RealtimestatechartFactory.eINSTANCE.createDoEvent()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 RealtimestatechartFactory.eINSTANCE.createSynchronizationChannel()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 RealtimestatechartFactory.eINSTANCE.createSynchronization()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 RealtimestatechartFactory.eINSTANCE.createRealtimeStatechart()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 RealtimestatechartFactory.eINSTANCE.createMessage()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 RealtimestatechartFactory.eINSTANCE.createEntryEvent()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 RealtimestatechartFactory.eINSTANCE.createExitEvent()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 RealtimestatechartFactory.eINSTANCE.createEntryPoint()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 RealtimestatechartFactory.eINSTANCE.createExitPoint()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 MsgtypeFactory.eINSTANCE.createMessageType()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 MsgtypeFactory.eINSTANCE.createMessageTypeRepository()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 TypesFactory.eINSTANCE.createArrayDataType()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 TypesFactory.eINSTANCE.createPrimitiveDataType()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 TypesFactory.eINSTANCE.createRangedPrimitiveDataType()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 ConnectorFactory.eINSTANCE.createMessageBuffer()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 ValuetypeFactory.eINSTANCE.createCardinality()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 ValuetypeFactory.eINSTANCE.createTimeValue()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 ValuetypeFactory.eINSTANCE.createNaturalNumber()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 ValuetypeFactory.eINSTANCE.createRange()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 BehaviorFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 BehaviorFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 BehaviorFactory.eINSTANCE.createParameterBinding()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.COMPARISON_EXPR__RHS,
				 BehaviorFactory.eINSTANCE.createVariable()));
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
			childFeature == PredicatesPackage.Literals.COMPARISON_EXPR__LHS ||
			childFeature == PredicatesPackage.Literals.COMPARISON_EXPR__RHS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
