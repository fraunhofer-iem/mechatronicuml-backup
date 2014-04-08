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

import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.MessageInTransitExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.PredicatesFactory;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.PredicatesPackage;

import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.QuantifiersFactory;

import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.SetsFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

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
 * This is the item provider adapter for a {@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.MessageInTransitExpr} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MessageInTransitExprItemProvider
	extends DynamicPredicateExprItemProvider
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
	public MessageInTransitExprItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE);
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
	 * This returns MessageInTransitExpr.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MessageInTransitExpr"));
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
		String label = ((MessageInTransitExpr)object).getComment();
		return label == null || label.length() == 0 ?
			getString("_UI_MessageInTransitExpr_type") :
			getString("_UI_MessageInTransitExpr_type") + " " + label;
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

		switch (notification.getFeatureID(MessageInTransitExpr.class)) {
			case PredicatesPackage.MESSAGE_IN_TRANSIT_EXPR__MESSAGE:
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
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 PredicatesFactory.eINSTANCE.createPredicateExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 PredicatesFactory.eINSTANCE.createDeadlockExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 PredicatesFactory.eINSTANCE.createBufferOverflowExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 PredicatesFactory.eINSTANCE.createComparisonExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 PredicatesFactory.eINSTANCE.createMessageInBufferExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 PredicatesFactory.eINSTANCE.createMessageInTransitExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 PredicatesFactory.eINSTANCE.createStateActiveExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 PredicatesFactory.eINSTANCE.createSubstateOfExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 PredicatesFactory.eINSTANCE.createTransitionFiringExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 PredicatesFactory.eINSTANCE.createTrueExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 PredicatesFactory.eINSTANCE.createFalseExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 MtctlFactory.eINSTANCE.createPropertyRepository()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 QuantifiersFactory.eINSTANCE.createAFExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 QuantifiersFactory.eINSTANCE.createAGExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 QuantifiersFactory.eINSTANCE.createEFExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 QuantifiersFactory.eINSTANCE.createEGExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 QuantifiersFactory.eINSTANCE.createExistenceQuantExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 QuantifiersFactory.eINSTANCE.createBoundVariable()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 QuantifiersFactory.eINSTANCE.createUniversalQuantExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 QuantifiersFactory.eINSTANCE.createLeadsToExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 QuantifiersFactory.eINSTANCE.createTimeIntervalExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 SetsFactory.eINSTANCE.createClockSetExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 SetsFactory.eINSTANCE.createIntervalSetExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 SetsFactory.eINSTANCE.createMessageSetExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 SetsFactory.eINSTANCE.createStateSetExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 SetsFactory.eINSTANCE.createTransitionSetExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 SetsFactory.eINSTANCE.createBufferSetExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 BooleanLogicFactory.eINSTANCE.createAndExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 BooleanLogicFactory.eINSTANCE.createImplyExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 BooleanLogicFactory.eINSTANCE.createNotExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 BooleanLogicFactory.eINSTANCE.createOrExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 ComparablesFactory.eINSTANCE.createBufferMsgCountExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 ComparablesFactory.eINSTANCE.createConstExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 ComparablesFactory.eINSTANCE.createMumlElemExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 ComparablesFactory.eINSTANCE.createSourceStateExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 ComparablesFactory.eINSTANCE.createTargetStateExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 ExpressionsFactory.eINSTANCE.createTextualExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 CommonExpressionsFactory.eINSTANCE.createUnaryExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 CommonExpressionsFactory.eINSTANCE.createComparisonExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 CommonExpressionsFactory.eINSTANCE.createArithmeticExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 CommonExpressionsFactory.eINSTANCE.createLogicalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 CommonExpressionsFactory.eINSTANCE.createLiteralExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 ComponentFactory.eINSTANCE.createContinuousPort()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 ComponentFactory.eINSTANCE.createDiscretePort()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 ComponentFactory.eINSTANCE.createComponentPart()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 ComponentFactory.eINSTANCE.createStaticStructuredComponent()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 ComponentFactory.eINSTANCE.createAssemblyConnector()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 ComponentFactory.eINSTANCE.createDelegationConnector()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 ComponentFactory.eINSTANCE.createHybridPort()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 ComponentFactory.eINSTANCE.createCoordinationProtocolPart()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 ComponentFactory.eINSTANCE.createPortPart()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 ComponentFactory.eINSTANCE.createStaticAtomicComponent()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 InstanceFactory.eINSTANCE.createAssemblyConnectorInstance()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 InstanceFactory.eINSTANCE.createDelegationConnectorInstance()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 InstanceFactory.eINSTANCE.createComponentInstanceConfiguration()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 InstanceFactory.eINSTANCE.createContinuousPortInstance()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 InstanceFactory.eINSTANCE.createHybridPortInstance()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 InstanceFactory.eINSTANCE.createDiscreteSinglePortInstance()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 InstanceFactory.eINSTANCE.createDiscreteMultiPortInstance()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 InstanceFactory.eINSTANCE.createCoordinationProtocolInstance()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 InstanceFactory.eINSTANCE.createStructuredComponentInstance()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 InstanceFactory.eINSTANCE.createAtomicComponentInstance()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 ProtocolFactory.eINSTANCE.createCoordinationProtocol()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 ProtocolFactory.eINSTANCE.createRole()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 ProtocolFactory.eINSTANCE.createRoleConnector()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 ProtocolFactory.eINSTANCE.createConnectorQualityOfServiceAssumptions()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 RealtimestatechartFactory.eINSTANCE.createAbsoluteDeadline()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 RealtimestatechartFactory.eINSTANCE.createRelativeDeadline()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 RealtimestatechartFactory.eINSTANCE.createClock()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 RealtimestatechartFactory.eINSTANCE.createRegion()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 RealtimestatechartFactory.eINSTANCE.createState()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 RealtimestatechartFactory.eINSTANCE.createTransition()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 RealtimestatechartFactory.eINSTANCE.createClockConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 RealtimestatechartFactory.eINSTANCE.createAction()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 RealtimestatechartFactory.eINSTANCE.createAsynchronousMessageEvent()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 RealtimestatechartFactory.eINSTANCE.createDoEvent()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 RealtimestatechartFactory.eINSTANCE.createSynchronizationChannel()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 RealtimestatechartFactory.eINSTANCE.createSynchronization()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 RealtimestatechartFactory.eINSTANCE.createRealtimeStatechart()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 RealtimestatechartFactory.eINSTANCE.createMessage()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 RealtimestatechartFactory.eINSTANCE.createEntryEvent()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 RealtimestatechartFactory.eINSTANCE.createExitEvent()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 RealtimestatechartFactory.eINSTANCE.createEntryPoint()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 RealtimestatechartFactory.eINSTANCE.createExitPoint()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 MsgtypeFactory.eINSTANCE.createMessageType()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 MsgtypeFactory.eINSTANCE.createMessageTypeRepository()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 TypesFactory.eINSTANCE.createArrayDataType()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 TypesFactory.eINSTANCE.createPrimitiveDataType()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 TypesFactory.eINSTANCE.createRangedPrimitiveDataType()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 ConnectorFactory.eINSTANCE.createMessageBuffer()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 ValuetypeFactory.eINSTANCE.createCardinality()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 ValuetypeFactory.eINSTANCE.createTimeValue()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 ValuetypeFactory.eINSTANCE.createNaturalNumber()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 ValuetypeFactory.eINSTANCE.createRange()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 BehaviorFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 BehaviorFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 BehaviorFactory.eINSTANCE.createParameterBinding()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.MESSAGE_IN_TRANSIT_EXPR__MESSAGE,
				 BehaviorFactory.eINSTANCE.createVariable()));
	}

}
