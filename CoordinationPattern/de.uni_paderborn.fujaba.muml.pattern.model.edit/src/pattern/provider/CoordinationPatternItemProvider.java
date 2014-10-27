/**
 */
package pattern.provider;


import de.uni_paderborn.fujaba.muml.behavior.BehaviorFactory;

import de.uni_paderborn.fujaba.muml.protocol.provider.AbstractCoordinationSpecificationItemProvider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.storydriven.core.CorePackage;

import pattern.CoordinationPattern;
import pattern.PatternFactory;
import pattern.PatternPackage;

/**
 * This is the item provider adapter for a {@link pattern.CoordinationPattern} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CoordinationPatternItemProvider extends AbstractCoordinationSpecificationItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinationPatternItemProvider(AdapterFactory adapterFactory) {
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

			addCombineablePatternsPropertyDescriptor(object);
			addAlternativePatternsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Combineable Patterns feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCombineablePatternsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CoordinationPattern_combineablePatterns_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CoordinationPattern_combineablePatterns_feature", "_UI_CoordinationPattern_type"),
				 PatternPackage.Literals.COORDINATION_PATTERN__COMBINEABLE_PATTERNS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Alternative Patterns feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAlternativePatternsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CoordinationPattern_alternativePatterns_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CoordinationPattern_alternativePatterns_feature", "_UI_CoordinationPattern_type"),
				 PatternPackage.Literals.COORDINATION_PATTERN__ALTERNATIVE_PATTERNS,
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
			childrenFeatures.add(PatternPackage.Literals.COORDINATION_PATTERN__DESCRIPTION_ASPECTS);
			childrenFeatures.add(PatternPackage.Literals.COORDINATION_PATTERN__LEGAL_CONFIGURATIONS);
			childrenFeatures.add(PatternPackage.Literals.COORDINATION_PATTERN__PATTERN_PARAMETERS);
			childrenFeatures.add(PatternPackage.Literals.COORDINATION_PATTERN__GMF_COORDINATION_PATTERN);
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
	 * This returns CoordinationPattern.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CoordinationPattern"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CoordinationPattern)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_CoordinationPattern_type") :
			getString("_UI_CoordinationPattern_type") + " " + label;
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

		switch (notification.getFeatureID(CoordinationPattern.class)) {
			case PatternPackage.COORDINATION_PATTERN__DESCRIPTION_ASPECTS:
			case PatternPackage.COORDINATION_PATTERN__LEGAL_CONFIGURATIONS:
			case PatternPackage.COORDINATION_PATTERN__PATTERN_PARAMETERS:
			case PatternPackage.COORDINATION_PATTERN__GMF_COORDINATION_PATTERN:
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
				(CorePackage.Literals.EXTENDABLE_ELEMENT__EXTENSION,
				 PatternFactory.eINSTANCE.createAdaptedFromCoordinationPattern()));

		newChildDescriptors.add
			(createChildParameter
				(PatternPackage.Literals.COORDINATION_PATTERN__DESCRIPTION_ASPECTS,
				 PatternFactory.eINSTANCE.createPlainTextualDescriptionAspects()));

		newChildDescriptors.add
			(createChildParameter
				(PatternPackage.Literals.COORDINATION_PATTERN__LEGAL_CONFIGURATIONS,
				 PatternFactory.eINSTANCE.createLegalConfiguration()));

		newChildDescriptors.add
			(createChildParameter
				(PatternPackage.Literals.COORDINATION_PATTERN__PATTERN_PARAMETERS,
				 BehaviorFactory.eINSTANCE.createParameter()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Pattern2EditPlugin.INSTANCE;
	}

}
