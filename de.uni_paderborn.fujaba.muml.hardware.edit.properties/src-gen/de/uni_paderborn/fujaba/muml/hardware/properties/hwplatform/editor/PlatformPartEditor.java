package de.uni_paderborn.fujaba.muml.hardware.properties.hwplatform.editor;

/**
 * @generated
 */
public abstract class PlatformPartEditor
		extends
			org.storydriven.core.properties.core.editor.NamedElementEditor {

	/**
	 * @generated
	 */
	public PlatformPartEditor(String tab,
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
			addPlatformPartParentHWPlatform_GeneralTab_Editor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addPlatformPartParentHWPlatform_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(category,
				createPlatformPartParentHWPlatform_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createPlatformPartParentHWPlatform_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage.eINSTANCE
						.getPlatformPart_ParentHWPlatform());

		editor.setTooltipMessage("The HWPlatform, this PlatformPart belongs to.");

		return editor;

	}

}
