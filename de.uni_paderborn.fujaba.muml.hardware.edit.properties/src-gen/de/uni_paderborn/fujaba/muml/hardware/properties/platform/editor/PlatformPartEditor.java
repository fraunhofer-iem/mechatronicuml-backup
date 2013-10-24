package de.uni_paderborn.fujaba.muml.hardware.properties.platform.editor;

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
			addPlatformPartParentHWPlatformEditor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addPlatformPartCardinalityEditor(null, false);
		}

	}

	/**
	 * @generated
	 */
	protected void addPlatformPartParentHWPlatformEditor(String category,
			boolean front) {
		addEditorToCategory(category,
				createPlatformPartParentHWPlatformEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createPlatformPartParentHWPlatformEditor() {
		de.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
						.getPlatformPart_ParentHWPlatform());

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addPlatformPartCardinalityEditor(String category,
			boolean front) {
		addEditorToCategory(category, createPlatformPartCardinalityEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createPlatformPartCardinalityEditor() {
		de.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
						.getPlatformPart_Cardinality());

		return editor;

	}

}
