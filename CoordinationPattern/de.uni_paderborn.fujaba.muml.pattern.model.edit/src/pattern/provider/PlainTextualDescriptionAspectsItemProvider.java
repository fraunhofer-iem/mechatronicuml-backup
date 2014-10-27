/**
 */
package pattern.provider;


import java.util.Collection;
import java.util.List;

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
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import pattern.PatternPackage;
import pattern.PlainTextualDescriptionAspects;

/**
 * This is the item provider adapter for a {@link pattern.PlainTextualDescriptionAspects} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PlainTextualDescriptionAspectsItemProvider 
	extends ItemProviderAdapter
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
	public PlainTextualDescriptionAspectsItemProvider(AdapterFactory adapterFactory) {
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

			addOverviewPropertyDescriptor(object);
			addContextPropertyDescriptor(object);
			addProblemPropertyDescriptor(object);
			addSolutionPropertyDescriptor(object);
			addStructurePropertyDescriptor(object);
			addBehaviorPropertyDescriptor(object);
			addExamplesPropertyDescriptor(object);
			addConsequencesPropertyDescriptor(object);
			addCombineabilityPropertyDescriptor(object);
			addVariantsPropertyDescriptor(object);
			addAlternativesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Overview feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOverviewPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PlainTextualDescriptionAspects_overview_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PlainTextualDescriptionAspects_overview_feature", "_UI_PlainTextualDescriptionAspects_type"),
				 PatternPackage.Literals.PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__OVERVIEW,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Context feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContextPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PlainTextualDescriptionAspects_context_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PlainTextualDescriptionAspects_context_feature", "_UI_PlainTextualDescriptionAspects_type"),
				 PatternPackage.Literals.PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__CONTEXT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Problem feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProblemPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PlainTextualDescriptionAspects_problem_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PlainTextualDescriptionAspects_problem_feature", "_UI_PlainTextualDescriptionAspects_type"),
				 PatternPackage.Literals.PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__PROBLEM,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Solution feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSolutionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PlainTextualDescriptionAspects_solution_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PlainTextualDescriptionAspects_solution_feature", "_UI_PlainTextualDescriptionAspects_type"),
				 PatternPackage.Literals.PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__SOLUTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Structure feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStructurePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PlainTextualDescriptionAspects_structure_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PlainTextualDescriptionAspects_structure_feature", "_UI_PlainTextualDescriptionAspects_type"),
				 PatternPackage.Literals.PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__STRUCTURE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Behavior feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBehaviorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PlainTextualDescriptionAspects_behavior_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PlainTextualDescriptionAspects_behavior_feature", "_UI_PlainTextualDescriptionAspects_type"),
				 PatternPackage.Literals.PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__BEHAVIOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Examples feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExamplesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PlainTextualDescriptionAspects_examples_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PlainTextualDescriptionAspects_examples_feature", "_UI_PlainTextualDescriptionAspects_type"),
				 PatternPackage.Literals.PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__EXAMPLES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Consequences feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConsequencesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PlainTextualDescriptionAspects_consequences_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PlainTextualDescriptionAspects_consequences_feature", "_UI_PlainTextualDescriptionAspects_type"),
				 PatternPackage.Literals.PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__CONSEQUENCES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Combineability feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCombineabilityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PlainTextualDescriptionAspects_combineability_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PlainTextualDescriptionAspects_combineability_feature", "_UI_PlainTextualDescriptionAspects_type"),
				 PatternPackage.Literals.PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__COMBINEABILITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Variants feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVariantsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PlainTextualDescriptionAspects_variants_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PlainTextualDescriptionAspects_variants_feature", "_UI_PlainTextualDescriptionAspects_type"),
				 PatternPackage.Literals.PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__VARIANTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Alternatives feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAlternativesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PlainTextualDescriptionAspects_alternatives_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PlainTextualDescriptionAspects_alternatives_feature", "_UI_PlainTextualDescriptionAspects_type"),
				 PatternPackage.Literals.PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__ALTERNATIVES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns PlainTextualDescriptionAspects.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PlainTextualDescriptionAspects"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((PlainTextualDescriptionAspects)object).getOverview();
		return label == null || label.length() == 0 ?
			getString("_UI_PlainTextualDescriptionAspects_type") :
			getString("_UI_PlainTextualDescriptionAspects_type") + " " + label;
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

		switch (notification.getFeatureID(PlainTextualDescriptionAspects.class)) {
			case PatternPackage.PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__OVERVIEW:
			case PatternPackage.PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__CONTEXT:
			case PatternPackage.PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__PROBLEM:
			case PatternPackage.PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__SOLUTION:
			case PatternPackage.PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__STRUCTURE:
			case PatternPackage.PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__BEHAVIOR:
			case PatternPackage.PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__EXAMPLES:
			case PatternPackage.PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__CONSEQUENCES:
			case PatternPackage.PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__COMBINEABILITY:
			case PatternPackage.PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__VARIANTS:
			case PatternPackage.PLAIN_TEXTUAL_DESCRIPTION_ASPECTS__ALTERNATIVES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
