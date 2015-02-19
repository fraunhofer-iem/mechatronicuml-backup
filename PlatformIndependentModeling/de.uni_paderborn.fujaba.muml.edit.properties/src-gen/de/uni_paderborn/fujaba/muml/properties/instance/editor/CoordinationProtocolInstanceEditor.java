package de.uni_paderborn.fujaba.muml.properties.instance.editor;

/**
 * @generated
 */
public class CoordinationProtocolInstanceEditor
		extends
			org.storydriven.core.properties.core.editor.NamedElementEditor {

	/**
	 * @generated
	 */
	public CoordinationProtocolInstanceEditor(String tab,
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

		addSubCategory("de.uni_paderborn.fujaba.properties.category.Lists",
				"Lists", org.eclipse.swt.SWT.HORIZONTAL, true);

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addPortInstances_GeneralTab_Editor(
					"de.uni_paderborn.fujaba.properties.category.Lists", true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addCoordinationProtocolPart_GeneralTab_Editor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addCoordinationProtocol_GeneralTab_Editor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addPortInstances_GeneralTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category, createPortInstances_GeneralTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createPortInstances_GeneralTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
				.getCoordinationProtocolInstance_PortInstances();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory, feature);

		editor.setTooltipMessage("The port instances that use this coordination protocol instance.\n\n\\todosd{I suggest to change this reference so that it references a DiscretePortInstance.}");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addCoordinationProtocolPart_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(category,
				createCoordinationProtocolPart_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createCoordinationProtocolPart_GeneralTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
				.getCoordinationProtocolInstance_CoordinationProtocolPart();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory, feature);

		editor.setTooltipMessage("The optional CoordinationProtocolPart of that instance.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addCoordinationProtocol_GeneralTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category,
				createCoordinationProtocol_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createCoordinationProtocol_GeneralTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
				.getCoordinationProtocolInstance_CoordinationProtocol();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory, feature);

		editor.setTooltipMessage("The type of this instance.");

		return editor;

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public CoordinationProtocolInstanceEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.muml.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
						.getCoordinationProtocolInstance());
	}

	/**
	 * @generated
	 */
	public static class Factory
			implements
				de.uni_paderborn.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor(
				String tab) {
			return new CoordinationProtocolInstanceEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"property.tab.general",
							"property.tab.general", "property.tab.general",
							"property.tab.general", "property.tab.extensions"})
					.contains(tab);
		}
	}

}
