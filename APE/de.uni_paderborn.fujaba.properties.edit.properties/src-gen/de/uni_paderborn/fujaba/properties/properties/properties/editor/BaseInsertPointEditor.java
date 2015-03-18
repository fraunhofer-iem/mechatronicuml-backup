package de.uni_paderborn.fujaba.properties.properties.properties.editor;

/**
 * @generated
 */
public class BaseInsertPointEditor
		extends
			de.uni_paderborn.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public BaseInsertPointEditor(String tab,
			org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {

		if (tab == null
				|| "de.uni_paderborn.fujaba.properties.tab.general"
						.equals(getTab())) { // Tab General

			addPropertyEditor(createBaseClass_GeneralTab_Editor(), false);

		}

	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorBaseClass_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createBaseClass_GeneralTab_Editor() {
		if (this.editorBaseClass_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.properties.PropertiesPackage.eINSTANCE
					.getBaseInsertPoint_BaseClass();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			this.editorBaseClass_GeneralTab = editor;
		}
		return this.editorBaseClass_GeneralTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public BaseInsertPointEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.properties.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.properties.PropertiesPackage.eINSTANCE
						.getBaseInsertPoint());
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
			return new BaseInsertPointEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{
							"de.uni_paderborn.fujaba.properties.tab.general",
							"de.uni_paderborn.fujaba.properties.tab.general"})
					.contains(tab);
		}
	}

}
