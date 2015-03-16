/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.properties.provider;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenFeature;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import de.uni_paderborn.fujaba.properties.OrderedElement;
import de.uni_paderborn.fujaba.properties.PropertiesFactory;
import de.uni_paderborn.fujaba.properties.PropertiesPackage;
import de.uni_paderborn.fujaba.properties.Property;
import de.uni_paderborn.fujaba.properties.PropertyCategory;

/**
 * This is the item provider adapter for a {@link de.uni_paderborn.fujaba.properties.Property} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PropertyItemProvider
	extends OrderedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyItemProvider(AdapterFactory adapterFactory) {
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

			addGenFeaturePropertyDescriptor(object);
			addTabPropertyDescriptor(object);
			addTooltipPropertyDescriptor(object);
			addCategoryPropertyDescriptor(object);
			addReconcilePropertyDescriptor(object);
			addInitializeOCLExpressionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Gen Feature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addGenFeaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Property_genFeature_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Property_genFeature_feature", "_UI_Property_type"),
				 PropertiesPackage.Literals.PROPERTY__GEN_FEATURE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null)
			{
				
				@Override
				public Collection<?> getChoiceOfValues(Object object) {
					Collection<GenFeature> valid = new ArrayList<GenFeature>();
					valid.add(null);
					GenClass genClass = null;
					EObject container = ((Property) object).eContainer();
					if (container instanceof de.uni_paderborn.fujaba.properties.Class) {
						de.uni_paderborn.fujaba.properties.Class _class= (de.uni_paderborn.fujaba.properties.Class) container;
						genClass = _class.getGenClass();
					} else if (container instanceof Property) {
						Property property = (Property) container;
						if (property.getGenFeature() != null) {
							genClass = property.getGenFeature().getTypeGenClass();
						}
					}
					
					
					List<EClass> allowedEClasses = new ArrayList<EClass>();
					if (genClass != null && genClass.getEcoreClass() != null) {
						EClass ecoreClass = genClass.getEcoreClass();
						allowedEClasses.add(ecoreClass);
						for (EClass superType : ecoreClass.getEAllSuperTypes()) {
							allowedEClasses.add(superType);
						}
					}
					for (Object choice : super.getChoiceOfValues(object)) {
						if (choice instanceof GenFeature) {
							GenFeature genFeature = (GenFeature) choice;
							EClass ecoreClass = null;
							if (genFeature.getGenClass() != null) {
								ecoreClass = genFeature.getGenClass().getEcoreClass();
							}
							if (allowedEClasses.contains(ecoreClass)) {
								valid.add(genFeature);
							}
						}
					}
					return valid;
			}
			});
	}

	/**
	 * This adds a property descriptor for the Tab feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTabPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Property_tab_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Property_tab_feature", "_UI_Property_type"),
				 PropertiesPackage.Literals.PROPERTY__TAB,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tooltip feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTooltipPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Property_tooltip_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Property_tooltip_feature", "_UI_Property_type"),
				 PropertiesPackage.Literals.PROPERTY__TOOLTIP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Category feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addCategoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Property_category_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Property_category_feature", "_UI_Property_type"),
				 PropertiesPackage.Literals.PROPERTY__CATEGORY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null) {
			@Override
			public Collection<?> getChoiceOfValues(Object object) {
				return ((Property) object).getClazz().getPropertyCategories();
			}
		});
	}

	/**
	 * This adds a property descriptor for the Reconcile feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReconcilePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Property_reconcile_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Property_reconcile_feature", "_UI_Property_type"),
				 PropertiesPackage.Literals.PROPERTY__RECONCILE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Initialize OCL Expression feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInitializeOCLExpressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Property_initializeOCLExpression_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Property_initializeOCLExpression_feature", "_UI_Property_type"),
				 PropertiesPackage.Literals.PROPERTY__INITIALIZE_OCL_EXPRESSION,
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
			childrenFeatures.add(PropertiesPackage.Literals.PROPERTY__VISIBILITY_FILTERS);
			childrenFeatures.add(PropertiesPackage.Literals.PROPERTY__EDITOR);
			childrenFeatures.add(PropertiesPackage.Literals.PROPERTY__CREATION_CONSTRAINT);
			childrenFeatures.add(PropertiesPackage.Literals.PROPERTY__CREATION_OPPOSITE_CONSTRAINT);
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
	 * This returns Property.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Property"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		de.uni_paderborn.fujaba.properties.Property property = (de.uni_paderborn.fujaba.properties.Property) object;
		if (property != null && property.getGenFeature() != null && property.getGenFeature().getEcoreFeature() != null
				&& property.getGenFeature().getEcoreFeature().getName() != null) {
			StringBuilder builder = new StringBuilder();
			builder.append(property.getGenFeature().getName());
			if (property.getGenFeature().getTypeGenClass() != null) {
				builder.append(" : ");
				builder.append(property.getGenFeature().getTypeGenClass().getName());
			}
			return builder.toString();
		}
		// return getString("_UI_Property_type");
		return "";
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

		switch (notification.getFeatureID(Property.class)) {
			case PropertiesPackage.PROPERTY__GEN_FEATURE:
			case PropertiesPackage.PROPERTY__TOOLTIP:
			case PropertiesPackage.PROPERTY__RECONCILE:
			case PropertiesPackage.PROPERTY__INITIALIZE_OCL_EXPRESSION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case PropertiesPackage.PROPERTY__VISIBILITY_FILTERS:
			case PropertiesPackage.PROPERTY__EDITOR:
			case PropertiesPackage.PROPERTY__CREATION_CONSTRAINT:
			case PropertiesPackage.PROPERTY__CREATION_OPPOSITE_CONSTRAINT:
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
				(PropertiesPackage.Literals.PROPERTY__VISIBILITY_FILTERS,
				 PropertiesFactory.eINSTANCE.createOCLFilter()));

		newChildDescriptors.add
			(createChildParameter
				(PropertiesPackage.Literals.PROPERTY__EDITOR,
				 PropertiesFactory.eINSTANCE.createTextPropertyEditor()));

		newChildDescriptors.add
			(createChildParameter
				(PropertiesPackage.Literals.PROPERTY__EDITOR,
				 PropertiesFactory.eINSTANCE.createSpinnerPropertyEditor()));

		newChildDescriptors.add
			(createChildParameter
				(PropertiesPackage.Literals.PROPERTY__EDITOR,
				 PropertiesFactory.eINSTANCE.createComboBoxPropertyEditor()));

		newChildDescriptors.add
			(createChildParameter
				(PropertiesPackage.Literals.PROPERTY__EDITOR,
				 PropertiesFactory.eINSTANCE.createCheckboxPropertyEditor()));

		newChildDescriptors.add
			(createChildParameter
				(PropertiesPackage.Literals.PROPERTY__EDITOR,
				 PropertiesFactory.eINSTANCE.createRadioPropertyEditor()));

		newChildDescriptors.add
			(createChildParameter
				(PropertiesPackage.Literals.PROPERTY__EDITOR,
				 PropertiesFactory.eINSTANCE.createListPropertyEditor()));

		newChildDescriptors.add
			(createChildParameter
				(PropertiesPackage.Literals.PROPERTY__EDITOR,
				 PropertiesFactory.eINSTANCE.createFlattenedListPropertyEditor()));

		newChildDescriptors.add
			(createChildParameter
				(PropertiesPackage.Literals.PROPERTY__EDITOR,
				 PropertiesFactory.eINSTANCE.createObjectPropertyEditor()));

		newChildDescriptors.add
			(createChildParameter
				(PropertiesPackage.Literals.PROPERTY__EDITOR,
				 PropertiesFactory.eINSTANCE.createOCLPropertyEditor()));

		newChildDescriptors.add
			(createChildParameter
				(PropertiesPackage.Literals.PROPERTY__EDITOR,
				 PropertiesFactory.eINSTANCE.createCustomPropertyEditor()));

		newChildDescriptors.add
			(createChildParameter
				(PropertiesPackage.Literals.PROPERTY__CREATION_CONSTRAINT,
				 PropertiesFactory.eINSTANCE.createCreationConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(PropertiesPackage.Literals.PROPERTY__CREATION_OPPOSITE_CONSTRAINT,
				 PropertiesFactory.eINSTANCE.createCreationConstraint()));
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
			childFeature == PropertiesPackage.Literals.PROPERTY__CREATION_CONSTRAINT ||
			childFeature == PropertiesPackage.Literals.PROPERTY__CREATION_OPPOSITE_CONSTRAINT;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
