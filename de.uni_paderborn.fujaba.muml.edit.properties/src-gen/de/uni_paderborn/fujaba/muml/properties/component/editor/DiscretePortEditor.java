package de.uni_paderborn.fujaba.muml.properties.component.editor;

/**
 * @generated
 */
public class DiscretePortEditor
		extends
			de.uni_paderborn.fujaba.muml.properties.component.editor.PortEditor {

	/**
	 * @generated
	 */
	public DiscretePortEditor(String tab,
			org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		super.createProperties();

		addSubCategory("de.fujaba.properties.category.Lists", "Lists",
				org.eclipse.swt.SWT.HORIZONTAL, true);

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addDiscretePortRefinedRoleEditor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addDiscreteInteractionEndpointSenderMessageTypesEditor(
					"de.fujaba.properties.category.Lists", true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addDiscreteInteractionEndpointReceiverMessageTypesEditor(
					"de.fujaba.properties.category.Lists", true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addDiscreteInteractionEndpointAdaptationBehaviorEditor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addDiscreteInteractionEndpointRoleAndAdaptationBehaviorEditor(null,
					true);
		}

		addDiscreteInteractionEndpointCardinalityEditor(null, false);

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addDiscreteInteractionEndpointReceiverMessageBufferEditor(
					"de.fujaba.properties.category.Lists", true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addBehavioralElementBehaviorEditor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addDiscretePortRefinedRoleEditor(String category,
			boolean front) {
		addEditorToCategory(category, createDiscretePortRefinedRoleEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createDiscretePortRefinedRoleEditor() {
		de.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
						.getDiscretePort_RefinedRole());

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addDiscreteInteractionEndpointSenderMessageTypesEditor(
			String category, boolean front) {
		addEditorToCategory(category,
				createDiscreteInteractionEndpointSenderMessageTypesEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createDiscreteInteractionEndpointSenderMessageTypesEditor() {
		de.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
						.getDiscreteInteractionEndpoint_SenderMessageTypes());

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addDiscreteInteractionEndpointReceiverMessageTypesEditor(
			String category, boolean front) {
		addEditorToCategory(category,
				createDiscreteInteractionEndpointReceiverMessageTypesEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createDiscreteInteractionEndpointReceiverMessageTypesEditor() {
		de.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
						.getDiscreteInteractionEndpoint_ReceiverMessageTypes());

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addDiscreteInteractionEndpointAdaptationBehaviorEditor(
			String category, boolean front) {
		addEditorToCategory(category,
				createDiscreteInteractionEndpointAdaptationBehaviorEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createDiscreteInteractionEndpointAdaptationBehaviorEditor() {
		de.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
						.getDiscreteInteractionEndpoint_AdaptationBehavior());

		editor.addVisibilityFilter("cardinality.upperBound.value > 1",
				getEClass());

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addDiscreteInteractionEndpointRoleAndAdaptationBehaviorEditor(
			String category, boolean front) {
		addEditorToCategory(
				category,
				createDiscreteInteractionEndpointRoleAndAdaptationBehaviorEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createDiscreteInteractionEndpointRoleAndAdaptationBehaviorEditor() {
		de.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
						.getDiscreteInteractionEndpoint_RoleAndAdaptationBehavior());

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addDiscreteInteractionEndpointCardinalityEditor(
			String category, boolean front) {
		addEditorToCategory(category,
				createDiscreteInteractionEndpointCardinalityEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createDiscreteInteractionEndpointCardinalityEditor() {
		de.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
						.getDiscreteInteractionEndpoint_Cardinality());

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addDiscreteInteractionEndpointReceiverMessageBufferEditor(
			String category, boolean front) {
		addEditorToCategory(category,
				createDiscreteInteractionEndpointReceiverMessageBufferEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createDiscreteInteractionEndpointReceiverMessageBufferEditor() {
		de.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
						.getDiscreteInteractionEndpoint_ReceiverMessageBuffer());

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addBehavioralElementBehaviorEditor(String category,
			boolean front) {
		addEditorToCategory(category, createBehavioralElementBehaviorEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createBehavioralElementBehaviorEditor() {
		de.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.behavior.BehaviorPackage.eINSTANCE
						.getBehavioralElement_Behavior());

		return editor;

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public DiscretePortEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.muml.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
						.getDiscretePort());
	}

	/**
	 * @generated
	 */
	public static class Factory
			implements
				de.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor(
				String tab) {
			return new DiscretePortEditor(tab);
		}
	}

}
