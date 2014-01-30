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
			addEStringToStringMapEntryKey_DefaultTab_Editor(null, true);
		}

		if (getTab() == null || "tab.default".equals(getTab())) {
			addEStringToStringMapEntryValue_DefaultTab_Editor(null, true);
		}

		if (getTab() == null || "tab.ocl".equals(getTab())) {
			addEStringToStringMapEntryValue_OCLTab_Editor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addEStringToStringMapEntryKey_DefaultTab_Editor(
			String category, boolean front) {
		addEditorToCategory(category,
				createEStringToStringMapEntryKey_DefaultTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createEStringToStringMapEntryKey_DefaultTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
				adapterFactory,
				org.eclipse.emf.ecore.EcorePackage.eINSTANCE
						.getEStringToStringMapEntry_Key(), false);

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addEStringToStringMapEntryValue_DefaultTab_Editor(
			String category, boolean front) {
		addEditorToCategory(category,
				createEStringToStringMapEntryValue_DefaultTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createEStringToStringMapEntryValue_DefaultTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
				adapterFactory,
				org.eclipse.emf.ecore.EcorePackage.eINSTANCE
						.getEStringToStringMapEntry_Value(), true);

		editor.addVisibilityFilter(
				"not eContainer().oclIsKindOf(ecore::EAnnotation) or eContainer().oclAsType(ecore::EAnnotation).source <> 'http://www.eclipse.org/emf/2002/Ecore/OCL'",
				getEClass());

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addEStringToStringMapEntryValue_OCLTab_Editor(
			String category, boolean front) {
		addEditorToCategory(category,
				createEStringToStringMapEntryValue_OCLTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createEStringToStringMapEntryValue_OCLTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.eclipse.emf.ecore.properties.ecore.editor.CustomOCLPropertyEditor(
				adapterFactory,
				org.eclipse.emf.ecore.EcorePackage.eINSTANCE
						.getEStringToStringMapEntry_Value());

		editor.addVisibilityFilter(
				"eContainer().oclIsKindOf(ecore::EAnnotation) and eContainer().oclAsType(ecore::EAnnotation).source = 'http://www.eclipse.org/emf/2002/Ecore/OCL'",
				getEClass());

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
					new java.lang.String[]{"tab.default", "tab.default",
							"tab.ocl"}).contains(tab);
		}
	}

}
