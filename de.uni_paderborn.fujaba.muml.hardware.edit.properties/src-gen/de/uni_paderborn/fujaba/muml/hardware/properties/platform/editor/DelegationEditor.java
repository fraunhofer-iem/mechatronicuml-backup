package de.uni_paderborn.fujaba.muml.hardware.properties.platform.editor;

/**
 * @generated
 */
public class DelegationEditor
		extends
			org.storydriven.core.properties.core.editor.CommentableElementEditor {

	/**
	 * @generated
	 */
	public DelegationEditor(String tab,
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

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addDelegationHwPortInstance_GeneralTab_Editor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addDelegationHwPortPart_GeneralTab_Editor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addDelegationHwPortInstance_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(category,
				createDelegationHwPortInstance_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createDelegationHwPortInstance_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
						.getDelegation_HwPortInstance());

		editor.setTooltipMessage("The HWPortInstances that are connected via this delegation.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addDelegationHwPortPart_GeneralTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category,
				createDelegationHwPortPart_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createDelegationHwPortPart_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
						.getDelegation_HwPortPart());

		editor.setTooltipMessage("The HWPortPart to which this delegation is connected.");

		return editor;

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public DelegationEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.muml.hardware.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
						.getDelegation());
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
			return new DelegationEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"property.tab.general",
							"property.tab.general",
							"property.tab.documentation",
							"property.tab.extensions"}).contains(tab);
		}
	}

}
