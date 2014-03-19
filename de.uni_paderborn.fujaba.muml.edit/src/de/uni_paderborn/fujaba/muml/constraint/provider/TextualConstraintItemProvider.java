/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.constraint.provider;


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
import org.storydriven.core.expressions.ExpressionsPackage;

import de.uni_paderborn.fujaba.common.descriptor.DefaultChainedPropertyDescriptor;
import de.uni_paderborn.fujaba.common.descriptor.IChainedPropertyDescriptor;
import de.uni_paderborn.fujaba.muml.constraint.ConstraintPackage;
import de.uni_paderborn.fujaba.muml.constraint.Correctness;
import de.uni_paderborn.fujaba.muml.constraint.TextualConstraint;

/**
 * This is the item provider adapter for a {@link de.uni_paderborn.fujaba.muml.constraint.TextualConstraint} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TextualConstraintItemProvider
	extends VerifiableConstraintItemProvider
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
	public TextualConstraintItemProvider(AdapterFactory adapterFactory) {
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

			addTextualExpressionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

/**
	 * This adds a property descriptor for the Textual Expression feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addTextualExpressionPropertyDescriptor(Object object) {
		IChainedPropertyDescriptor rootPropertyDescriptor = new DefaultChainedPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TextualConstraint_textualExpression_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TextualConstraint_textualExpression_feature", "_UI_TextualConstraint_type"),
				 ConstraintPackage.Literals.TEXTUAL_CONSTRAINT__TEXTUAL_EXPRESSION,
				 true,
				 false,
				 false,
				 null,
				 getString("_UI_TextualExpressionPropertyCategory"),
				 null);

		itemPropertyDescriptors
				.add(new DefaultChainedPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_TextualExpression_expressionText_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_TextualExpression_expressionText_feature",
								"_UI_TextualExpression_type"),
						ExpressionsPackage.Literals.TEXTUAL_EXPRESSION__EXPRESSION_TEXT,
						true,
						false,
						false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
						getString("_UI_TextualExpressionPropertyCategory"),
						null,
						rootPropertyDescriptor));

		itemPropertyDescriptors
				.add(new DefaultChainedPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_TextualExpression_language_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_TextualExpression_language_feature",
								"_UI_TextualExpression_type"),
						ExpressionsPackage.Literals.TEXTUAL_EXPRESSION__LANGUAGE,
						true,
						false,
						false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
						getString("_UI_TextualExpressionPropertyCategory"),
						null,
						rootPropertyDescriptor));

		itemPropertyDescriptors
				.add(new DefaultChainedPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_TextualExpression_languageVersion_feature"),
						getString(
								"_UI_PropertyDescriptor_description",
								"_UI_TextualExpression_languageVersion_feature",
								"_UI_TextualExpression_type"),
						ExpressionsPackage.Literals.TEXTUAL_EXPRESSION__LANGUAGE_VERSION,
						true,
						false,
						false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
						getString("_UI_TextualExpressionPropertyCategory"),
						null,
						rootPropertyDescriptor));

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
			childrenFeatures.add(ConstraintPackage.Literals.TEXTUAL_CONSTRAINT__TEXTUAL_EXPRESSION);
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
	 * This returns TextualConstraint.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TextualConstraint"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		Correctness labelValue = ((TextualConstraint)object).getCorrectness();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_TextualConstraint_type") :
			getString("_UI_TextualConstraint_type") + " " + label;
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

		switch (notification.getFeatureID(TextualConstraint.class)) {
			case ConstraintPackage.TEXTUAL_CONSTRAINT__TEXTUAL_EXPRESSION:
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
				(ConstraintPackage.Literals.TEXTUAL_CONSTRAINT__TEXTUAL_EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createTextualExpression()));
	}

}
