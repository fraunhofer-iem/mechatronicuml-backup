/**
 */
package org.muml.testlanguage.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

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
import org.muml.testlanguage.Node;
import org.muml.testlanguage.TestLanguageFactory;
import org.muml.testlanguage.TestLanguagePackage;
import org.muml.testlanguage.specification.SpecificationFactory;

/**
 * This is the item provider adapter for a {@link org.muml.testlanguage.Node}
 * object. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class NodeItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NodeItemProvider(AdapterFactory adapterFactory) {
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

			addInputsPropertyDescriptor(object);
			addOutputsPropertyDescriptor(object);
			addLabelPropertyDescriptor(object);
			addSpecificationClassNamePropertyDescriptor(object);
			addInputCachePropertyDescriptor(object);
			addOutputCachePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Inputs feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addInputsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Node_inputs_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Node_inputs_feature", "_UI_Node_type"),
						TestLanguagePackage.Literals.NODE__INPUTS, false, false, false, null,
						getString("_UI_PortsPropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Outputs feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addOutputsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Node_outputs_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Node_outputs_feature", "_UI_Node_type"),
						TestLanguagePackage.Literals.NODE__OUTPUTS, false, false, false, null,
						getString("_UI_PortsPropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Label feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Node_label_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Node_label_feature", "_UI_Node_type"),
						TestLanguagePackage.Literals.NODE__LABEL, false, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, getString("_UI_VisualPropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Specification Class Name feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addSpecificationClassNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Node_specificationClassName_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Node_specificationClassName_feature",
						"_UI_Node_type"),
				TestLanguagePackage.Literals.NODE__SPECIFICATION_CLASS_NAME, false, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, getString("_UI_InternalPropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Input Cache feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addInputCachePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Node_inputCache_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Node_inputCache_feature", "_UI_Node_type"),
						TestLanguagePackage.Literals.NODE__INPUT_CACHE, false, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, getString("_UI_InternalPropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Output Cache feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addOutputCachePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Node_outputCache_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Node_outputCache_feature",
								"_UI_Node_type"),
						TestLanguagePackage.Literals.NODE__OUTPUT_CACHE, false, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, getString("_UI_InternalPropertyCategory"), null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to
	 * deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand},
	 * {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in
	 * {@link #createCommand}. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(TestLanguagePackage.Literals.NODE__INPUTS);
			childrenFeatures.add(TestLanguagePackage.Literals.NODE__OUTPUTS);
			childrenFeatures.add(TestLanguagePackage.Literals.NODE__SPECIFICATION);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper
		// feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Node.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Node"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Node) object).getSpecificationClassName();
		return label == null || label.length() == 0 ? getString("_UI_Node_type")
				: getString("_UI_Node_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to
	 * update any cached children and by creating a viewer notification, which
	 * it passes to {@link #fireNotifyChanged}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Node.class)) {
		case TestLanguagePackage.NODE__LABEL:
		case TestLanguagePackage.NODE__SPECIFICATION_CLASS_NAME:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case TestLanguagePackage.NODE__INPUTS:
		case TestLanguagePackage.NODE__OUTPUTS:
		case TestLanguagePackage.NODE__SPECIFICATION:
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
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(TestLanguagePackage.Literals.NODE__INPUTS,
				TestLanguageFactory.eINSTANCE.createInput()));

		newChildDescriptors.add(createChildParameter(TestLanguagePackage.Literals.NODE__OUTPUTS,
				TestLanguageFactory.eINSTANCE.createOutput()));

		newChildDescriptors.add(createChildParameter(TestLanguagePackage.Literals.NODE__SPECIFICATION,
				SpecificationFactory.eINSTANCE.createDefault()));

		newChildDescriptors.add(createChildParameter(TestLanguagePackage.Literals.NODE__SPECIFICATION,
				SpecificationFactory.eINSTANCE.createLoadModel()));

		newChildDescriptors.add(createChildParameter(TestLanguagePackage.Literals.NODE__SPECIFICATION,
				SpecificationFactory.eINSTANCE.createCompareModels()));

		newChildDescriptors.add(createChildParameter(TestLanguagePackage.Literals.NODE__SPECIFICATION,
				SpecificationFactory.eINSTANCE.createValidateModel()));

		newChildDescriptors.add(createChildParameter(TestLanguagePackage.Literals.NODE__SPECIFICATION,
				SpecificationFactory.eINSTANCE.createSaveModel()));

		newChildDescriptors.add(createChildParameter(TestLanguagePackage.Literals.NODE__SPECIFICATION,
				SpecificationFactory.eINSTANCE.createTransformation()));

		newChildDescriptors.add(createChildParameter(TestLanguagePackage.Literals.NODE__SPECIFICATION,
				SpecificationFactory.eINSTANCE.createExecuteUPPAAL()));

		newChildDescriptors.add(createChildParameter(TestLanguagePackage.Literals.NODE__SPECIFICATION,
				SpecificationFactory.eINSTANCE.createPrimitiveString()));

		newChildDescriptors.add(createChildParameter(TestLanguagePackage.Literals.NODE__SPECIFICATION,
				SpecificationFactory.eINSTANCE.createAssertBool()));

		newChildDescriptors.add(createChildParameter(TestLanguagePackage.Literals.NODE__SPECIFICATION,
				SpecificationFactory.eINSTANCE.createAssertDiagnosticTrace()));

		newChildDescriptors.add(createChildParameter(TestLanguagePackage.Literals.NODE__SPECIFICATION,
				SpecificationFactory.eINSTANCE.createAssertResult()));

		newChildDescriptors.add(createChildParameter(TestLanguagePackage.Literals.NODE__SPECIFICATION,
				SpecificationFactory.eINSTANCE.createCheckMTCTL()));
	}

	/**
	 * Return the resource locator for this item provider's resources. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return TestLanguageEditPlugin.INSTANCE;
	}

}
