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

import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.PredicatesFactory;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.PredicatesPackage;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.SubstateOfExpr;

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
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.storydriven.core.expressions.ExpressionsFactory;

import org.storydriven.core.expressions.common.CommonExpressionsFactory;

/**
 * This is the item provider adapter for a {@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.SubstateOfExpr} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SubstateOfExprItemProvider
	extends StaticPredicateExprItemProvider
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
	public SubstateOfExprItemProvider(AdapterFactory adapterFactory) {
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

			addSuperstatePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Superstate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSuperstatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SubstateOfExpr_superstate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SubstateOfExpr_superstate_feature", "_UI_SubstateOfExpr_type"),
				 PredicatesPackage.Literals.SUBSTATE_OF_EXPR__SUPERSTATE,
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
			childrenFeatures.add(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE);
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
	 * This returns SubstateOfExpr.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SubstateOfExpr"));
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
		String label = ((SubstateOfExpr)object).getComment();
		return label == null || label.length() == 0 ?
			getString("_UI_SubstateOfExpr_type") :
			getString("_UI_SubstateOfExpr_type") + " " + label;
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

		switch (notification.getFeatureID(SubstateOfExpr.class)) {
			case PredicatesPackage.SUBSTATE_OF_EXPR__STATE:
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
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 PredicatesFactory.eINSTANCE.createPredicateExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 PredicatesFactory.eINSTANCE.createDeadlockExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 PredicatesFactory.eINSTANCE.createBufferOverflowExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 PredicatesFactory.eINSTANCE.createComparisonExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 PredicatesFactory.eINSTANCE.createMessageInBufferExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 PredicatesFactory.eINSTANCE.createMessageInTransitExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 PredicatesFactory.eINSTANCE.createStateActiveExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 PredicatesFactory.eINSTANCE.createSubstateOfExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 PredicatesFactory.eINSTANCE.createTransitionFiringExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 PredicatesFactory.eINSTANCE.createTrueExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 PredicatesFactory.eINSTANCE.createFalseExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 MtctlFactory.eINSTANCE.createPropertyRepository()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 QuantifiersFactory.eINSTANCE.createAFExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 QuantifiersFactory.eINSTANCE.createAGExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 QuantifiersFactory.eINSTANCE.createEFExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 QuantifiersFactory.eINSTANCE.createEGExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 QuantifiersFactory.eINSTANCE.createExistenceQuantExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 QuantifiersFactory.eINSTANCE.createBoundVariable()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 QuantifiersFactory.eINSTANCE.createUniversalQuantExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 QuantifiersFactory.eINSTANCE.createLeadsToExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 QuantifiersFactory.eINSTANCE.createTimeIntervalExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 SetsFactory.eINSTANCE.createClockSetExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 SetsFactory.eINSTANCE.createIntervalSetExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 SetsFactory.eINSTANCE.createMessageSetExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 SetsFactory.eINSTANCE.createStateSetExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 SetsFactory.eINSTANCE.createTransitionSetExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 SetsFactory.eINSTANCE.createBufferSetExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 BooleanLogicFactory.eINSTANCE.createAndExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 BooleanLogicFactory.eINSTANCE.createImplyExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 BooleanLogicFactory.eINSTANCE.createNotExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 BooleanLogicFactory.eINSTANCE.createOrExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 ComparablesFactory.eINSTANCE.createBufferMsgCountExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 ComparablesFactory.eINSTANCE.createConstExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 ComparablesFactory.eINSTANCE.createMumlElemExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 ComparablesFactory.eINSTANCE.createSourceStateExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 ComparablesFactory.eINSTANCE.createTargetStateExpr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 ExpressionsFactory.eINSTANCE.createTextualExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 CommonExpressionsFactory.eINSTANCE.createUnaryExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 CommonExpressionsFactory.eINSTANCE.createComparisonExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 CommonExpressionsFactory.eINSTANCE.createArithmeticExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 CommonExpressionsFactory.eINSTANCE.createLogicalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 CommonExpressionsFactory.eINSTANCE.createLiteralExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 ComponentFactory.eINSTANCE.createContinuousPort()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 ComponentFactory.eINSTANCE.createDiscretePort()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 ComponentFactory.eINSTANCE.createComponentPart()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 ComponentFactory.eINSTANCE.createStaticStructuredComponent()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 ComponentFactory.eINSTANCE.createAssemblyConnector()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 ComponentFactory.eINSTANCE.createDelegationConnector()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 ComponentFactory.eINSTANCE.createHybridPort()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 ComponentFactory.eINSTANCE.createCoordinationProtocolPart()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 ComponentFactory.eINSTANCE.createPortPart()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 ComponentFactory.eINSTANCE.createStaticAtomicComponent()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 InstanceFactory.eINSTANCE.createAssemblyConnectorInstance()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 InstanceFactory.eINSTANCE.createDelegationConnectorInstance()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 InstanceFactory.eINSTANCE.createComponentInstanceConfiguration()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 InstanceFactory.eINSTANCE.createContinuousPortInstance()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 InstanceFactory.eINSTANCE.createHybridPortInstance()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 InstanceFactory.eINSTANCE.createDiscreteSinglePortInstance()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 InstanceFactory.eINSTANCE.createDiscreteMultiPortInstance()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 InstanceFactory.eINSTANCE.createCoordinationProtocolInstance()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 InstanceFactory.eINSTANCE.createStructuredComponentInstance()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 InstanceFactory.eINSTANCE.createAtomicComponentInstance()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 ProtocolFactory.eINSTANCE.createCoordinationProtocol()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 ProtocolFactory.eINSTANCE.createRole()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 ProtocolFactory.eINSTANCE.createRoleConnector()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 ProtocolFactory.eINSTANCE.createConnectorQualityOfServiceAssumptions()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 RealtimestatechartFactory.eINSTANCE.createAbsoluteDeadline()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 RealtimestatechartFactory.eINSTANCE.createRelativeDeadline()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 RealtimestatechartFactory.eINSTANCE.createClock()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 RealtimestatechartFactory.eINSTANCE.createRegion()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 RealtimestatechartFactory.eINSTANCE.createState()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 RealtimestatechartFactory.eINSTANCE.createTransition()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 RealtimestatechartFactory.eINSTANCE.createClockConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 RealtimestatechartFactory.eINSTANCE.createAction()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 RealtimestatechartFactory.eINSTANCE.createAsynchronousMessageEvent()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 RealtimestatechartFactory.eINSTANCE.createDoEvent()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 RealtimestatechartFactory.eINSTANCE.createSynchronizationChannel()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 RealtimestatechartFactory.eINSTANCE.createSynchronization()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 RealtimestatechartFactory.eINSTANCE.createRealtimeStatechart()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 RealtimestatechartFactory.eINSTANCE.createMessage()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 RealtimestatechartFactory.eINSTANCE.createEntryEvent()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 RealtimestatechartFactory.eINSTANCE.createExitEvent()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 RealtimestatechartFactory.eINSTANCE.createEntryPoint()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 RealtimestatechartFactory.eINSTANCE.createExitPoint()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 MsgtypeFactory.eINSTANCE.createMessageType()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 MsgtypeFactory.eINSTANCE.createMessageTypeRepository()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 TypesFactory.eINSTANCE.createArrayDataType()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 TypesFactory.eINSTANCE.createPrimitiveDataType()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 TypesFactory.eINSTANCE.createRangedPrimitiveDataType()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 ConnectorFactory.eINSTANCE.createMessageBuffer()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 ValuetypeFactory.eINSTANCE.createCardinality()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 ValuetypeFactory.eINSTANCE.createTimeValue()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 ValuetypeFactory.eINSTANCE.createNaturalNumber()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 ValuetypeFactory.eINSTANCE.createRange()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 BehaviorFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 BehaviorFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 BehaviorFactory.eINSTANCE.createParameterBinding()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatesPackage.Literals.SUBSTATE_OF_EXPR__STATE,
				 BehaviorFactory.eINSTANCE.createVariable()));
	}

}
