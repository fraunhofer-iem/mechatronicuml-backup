package org.eclipse.emf.ecore.properties.ecore.editor;

/**
 * @generated
 */
public class EStringToStringMapEntryEditor
		extends
			de.uni_paderborn.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public EStringToStringMapEntryEditor(String tab,
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

		if (getTab() == null || "tab.default".equals(getTab())) {
			addEStringToStringMapEntryKeyEditor(null, true);
		}

		if (getTab() == null || "tab.default".equals(getTab())) {
			addEStringToStringMapEntryValueEditor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addEStringToStringMapEntryKeyEditor(String category,
			boolean front) {
		addEditorToCategory(category, createEStringToStringMapEntryKeyEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createEStringToStringMapEntryKeyEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
				adapterFactory,
				org.eclipse.emf.ecore.EcorePackage.eINSTANCE
						.getEStringToStringMapEntry_Key(), false);

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addEStringToStringMapEntryValueEditor(String category,
			boolean front) {
		addEditorToCategory(category,
				createEStringToStringMapEntryValueEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createEStringToStringMapEntryValueEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
				adapterFactory,
				org.eclipse.emf.ecore.EcorePackage.eINSTANCE
						.getEStringToStringMapEntry_Value(), true);

		return editor;

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public EStringToStringMapEntryEditor(String tab) {
		this(tab, org.eclipse.emf.ecore.properties.util.PropertiesUtil.INSTANCE
				.getAdapterFactory(),
				org.eclipse.emf.ecore.EcorePackage.eINSTANCE
						.getEStringToStringMapEntry());
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
			return new EStringToStringMapEntryEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"tab.default", "tab.default"})
					.contains(tab);
		}
	}

}
