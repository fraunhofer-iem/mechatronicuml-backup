/**
 * <copyright>
 * Copyright (c) 2013 Software Engineering Group, Heinz Nixdorf Institute, University of Paderborn, Germany.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Software Engineering Group - initial API and implementation
 * </copyright>
 */
package org.muml.pim.pattern.provider;


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
import org.muml.pim.pattern.DescriptionAspects;
import org.muml.pim.pattern.PatternPackage;
import org.muml.pim.provider.MumlEditPlugin;

/**
 * This is the item provider adapter for a {@link org.muml.pim.pattern.DescriptionAspects} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DescriptionAspectsItemProvider 
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
	public DescriptionAspectsItemProvider(AdapterFactory adapterFactory) {
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
			addAlsoKnownAsPropertyDescriptor(object);
			addVerification_propertiesPropertyDescriptor(object);
			addSearchTermsPropertyDescriptor(object);
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
				 getString("_UI_DescriptionAspects_overview_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DescriptionAspects_overview_feature", "_UI_DescriptionAspects_type"),
				 PatternPackage.Literals.DESCRIPTION_ASPECTS__OVERVIEW,
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
				 getString("_UI_DescriptionAspects_context_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DescriptionAspects_context_feature", "_UI_DescriptionAspects_type"),
				 PatternPackage.Literals.DESCRIPTION_ASPECTS__CONTEXT,
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
				 getString("_UI_DescriptionAspects_problem_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DescriptionAspects_problem_feature", "_UI_DescriptionAspects_type"),
				 PatternPackage.Literals.DESCRIPTION_ASPECTS__PROBLEM,
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
				 getString("_UI_DescriptionAspects_solution_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DescriptionAspects_solution_feature", "_UI_DescriptionAspects_type"),
				 PatternPackage.Literals.DESCRIPTION_ASPECTS__SOLUTION,
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
				 getString("_UI_DescriptionAspects_structure_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DescriptionAspects_structure_feature", "_UI_DescriptionAspects_type"),
				 PatternPackage.Literals.DESCRIPTION_ASPECTS__STRUCTURE,
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
				 getString("_UI_DescriptionAspects_behavior_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DescriptionAspects_behavior_feature", "_UI_DescriptionAspects_type"),
				 PatternPackage.Literals.DESCRIPTION_ASPECTS__BEHAVIOR,
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
				 getString("_UI_DescriptionAspects_examples_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DescriptionAspects_examples_feature", "_UI_DescriptionAspects_type"),
				 PatternPackage.Literals.DESCRIPTION_ASPECTS__EXAMPLES,
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
				 getString("_UI_DescriptionAspects_consequences_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DescriptionAspects_consequences_feature", "_UI_DescriptionAspects_type"),
				 PatternPackage.Literals.DESCRIPTION_ASPECTS__CONSEQUENCES,
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
				 getString("_UI_DescriptionAspects_combineability_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DescriptionAspects_combineability_feature", "_UI_DescriptionAspects_type"),
				 PatternPackage.Literals.DESCRIPTION_ASPECTS__COMBINEABILITY,
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
				 getString("_UI_DescriptionAspects_variants_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DescriptionAspects_variants_feature", "_UI_DescriptionAspects_type"),
				 PatternPackage.Literals.DESCRIPTION_ASPECTS__VARIANTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Also Known As feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAlsoKnownAsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DescriptionAspects_alsoKnownAs_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DescriptionAspects_alsoKnownAs_feature", "_UI_DescriptionAspects_type"),
				 PatternPackage.Literals.DESCRIPTION_ASPECTS__ALSO_KNOWN_AS,
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
				 getString("_UI_DescriptionAspects_alternatives_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DescriptionAspects_alternatives_feature", "_UI_DescriptionAspects_type"),
				 PatternPackage.Literals.DESCRIPTION_ASPECTS__ALTERNATIVES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Verification properties feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVerification_propertiesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DescriptionAspects_verification_properties_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DescriptionAspects_verification_properties_feature", "_UI_DescriptionAspects_type"),
				 PatternPackage.Literals.DESCRIPTION_ASPECTS__VERIFICATION_PROPERTIES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Search Terms feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSearchTermsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DescriptionAspects_searchTerms_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DescriptionAspects_searchTerms_feature", "_UI_DescriptionAspects_type"),
				 PatternPackage.Literals.DESCRIPTION_ASPECTS__SEARCH_TERMS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns DescriptionAspects.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DescriptionAspects"));
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
		String label = ((DescriptionAspects)object).getOverview();
		return label == null || label.length() == 0 ?
			getString("_UI_DescriptionAspects_type") :
			getString("_UI_DescriptionAspects_type") + " " + label;
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

		switch (notification.getFeatureID(DescriptionAspects.class)) {
			case PatternPackage.DESCRIPTION_ASPECTS__OVERVIEW:
			case PatternPackage.DESCRIPTION_ASPECTS__CONTEXT:
			case PatternPackage.DESCRIPTION_ASPECTS__PROBLEM:
			case PatternPackage.DESCRIPTION_ASPECTS__SOLUTION:
			case PatternPackage.DESCRIPTION_ASPECTS__STRUCTURE:
			case PatternPackage.DESCRIPTION_ASPECTS__BEHAVIOR:
			case PatternPackage.DESCRIPTION_ASPECTS__EXAMPLES:
			case PatternPackage.DESCRIPTION_ASPECTS__CONSEQUENCES:
			case PatternPackage.DESCRIPTION_ASPECTS__COMBINEABILITY:
			case PatternPackage.DESCRIPTION_ASPECTS__VARIANTS:
			case PatternPackage.DESCRIPTION_ASPECTS__ALSO_KNOWN_AS:
			case PatternPackage.DESCRIPTION_ASPECTS__VERIFICATION_PROPERTIES:
			case PatternPackage.DESCRIPTION_ASPECTS__SEARCH_TERMS:
			case PatternPackage.DESCRIPTION_ASPECTS__ALTERNATIVES:
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
		return MumlEditPlugin.INSTANCE;
	}

}
