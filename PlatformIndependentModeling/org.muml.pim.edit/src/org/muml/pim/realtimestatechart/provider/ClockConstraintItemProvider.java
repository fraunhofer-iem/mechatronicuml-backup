/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.realtimestatechart.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.muml.core.common.descriptor.DefaultChainedPropertyDescriptor;
import org.muml.core.common.descriptor.IChainedPropertyDescriptor;
import org.muml.core.provider.ExtendableElementItemProvider;
import org.muml.mumlcore.expressions.common.ComparingOperator;
import org.muml.pim.provider.MumlEditPlugin;
import org.muml.pim.realtimestatechart.ClockConstraint;
import org.muml.pim.realtimestatechart.RealtimestatechartPackage;
import org.muml.pim.realtimestatechart.State;
import org.muml.pim.realtimestatechart.descriptor.ClockPropertyDescriptor;
import org.muml.pim.realtimestatechart.descriptor.EnumerationPropertyDescriptor;
import org.muml.pim.valuetype.ValuetypeFactory;
import org.muml.pim.valuetype.ValuetypePackage;

/**
 * This is the item provider adapter for a {@link org.muml.pim.realtimestatechart.ClockConstraint} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated
 */
public class ClockConstraintItemProvider extends ExtendableElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ClockConstraintItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addBoundPropertyDescriptor(object);
			addClockPropertyDescriptor(object);
			addOperatorPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Bound feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected void addBoundPropertyDescriptor(Object object) {
		IChainedPropertyDescriptor rootPropertyDescriptor = new DefaultChainedPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ClockConstraint_bound_feature"), getString(
						"_UI_PropertyDescriptor_description",
						"_UI_ClockConstraint_bound_feature",
						"_UI_ClockConstraint_type"),
				RealtimestatechartPackage.Literals.CLOCK_CONSTRAINT__BOUND,
				true, false, true, null, null, null);
		

		itemPropertyDescriptors.add
			(new DefaultChainedPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TimeValue_value_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TimeValue_value_feature", "_UI_TimeValue_type"),
				 ValuetypePackage.Literals.TIME_VALUE__VALUE,
				 true,
				 false,
				 false,
				 null,
				 "Bound",
				 null,
				 rootPropertyDescriptor));
	
		itemPropertyDescriptors.add
			(new EnumerationPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TimeValue_unit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TimeValue_unit_feature", "_UI_TimeValue_type"),
				 ValuetypePackage.Literals.TIME_VALUE__UNIT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 "Bound",
				 null,
				 rootPropertyDescriptor));

	}

	/**
	 * This adds a property descriptor for the Clock feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected void addClockPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ClockPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_ClockConstraint_clock_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ClockConstraint_clock_feature",
						"_UI_ClockConstraint_type"),
				RealtimestatechartPackage.Literals.CLOCK_CONSTRAINT__CLOCK,
				true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Operator feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected void addOperatorPropertyDescriptor(Object object) {
		/*itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ClockConstraint_operator_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ClockConstraint_operator_feature", "_UI_ClockConstraint_type"),
				 RealtimestatechartPackage.Literals.CLOCK_CONSTRAINT__OPERATOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
		*/
		// needed for #41 
		itemPropertyDescriptors.add(
				new ItemPropertyDescriptor(
						((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
						 getResourceLocator(),
						 getString("_UI_ClockConstraint_operator_feature"),
						 getString("_UI_PropertyDescriptor_description", "_UI_ClockConstraint_operator_feature", "_UI_ClockConstraint_type"),
						 RealtimestatechartPackage.Literals.CLOCK_CONSTRAINT__OPERATOR,
						 true,
						 false,
						 false,
						 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
						 null,
						 null) {
					public Collection<?> getChoiceOfValues(Object object) {
						if (object instanceof EObject && ((EObject) object).eContainer() instanceof State) {
							List<Enumerator> enumerators = new ArrayList<Enumerator>();
							enumerators.add(org.muml.mumlcore.expressions.common.ComparingOperator.LESS);
							enumerators.add(org.muml.mumlcore.expressions.common.ComparingOperator.LESS_OR_EQUAL);
							return enumerators;
						}
						return super.getChoiceOfValues(object);
					}
				}
		);
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(
			Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(RealtimestatechartPackage.Literals.CLOCK_CONSTRAINT__BOUND);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ClockConstraint.gif.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ClockConstraint"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		StringBuffer sb = new StringBuffer();
		sb.append(getString("_UI_ClockConstraint_type"));
		sb.append(' ');

		ClockConstraint constraint = (ClockConstraint) object;

		if (constraint.getClock() != null
				&& constraint.getClock().getName() != null) {
			sb.append(constraint.getClock().getName());
		} else {
			sb.append("null");
		}

		sb.append(' ');

		if (constraint.getOperator() != null) {
			switch (constraint.getOperator()) {
			case LESS:
				sb.append('<');
				break;
			case LESS_OR_EQUAL:
				sb.append('\u2264'); // used the java-sdk tool "native2ascii"
				break;
			case EQUAL:
				sb.append('=');
				break;

			// These should not be set normally
			case GREATER_OR_EQUAL:
				sb.append('\u2265'); // used the java-sdk tool "native2ascii"
				break;
			case GREATER:
				sb.append('>');
				break;
			case UNEQUAL:
				sb.append('\u2260'); // used the java-sdk tool "native2ascii"
				break;
			case REGULAR_EXPRESSION:
				sb.append("regexp");
				break;
			}
		}

		sb.append(' ');

		if (constraint.getBound() != null) {
			sb.append(constraint.getBound().toString());
		} else {
			sb.append("null");
		}

		return sb.toString();
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ClockConstraint.class)) {
			case RealtimestatechartPackage.CLOCK_CONSTRAINT__OPERATOR:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case RealtimestatechartPackage.CLOCK_CONSTRAINT__BOUND:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s
	 * describing the children that can be created under this object. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(
			Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.CLOCK_CONSTRAINT__BOUND,
				 ValuetypeFactory.eINSTANCE.createTimeValue()));
	}

	/**
	 * Return the resource locator for this item provider's resources. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return MumlEditPlugin.INSTANCE;
	}

}
