package de.uni_paderborn.fujaba.properties.properties.properties.editor;

/**
 * @generated
 */
public class PackageEditor
		extends
			de.uni_paderborn.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public PackageEditor(String tab,
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

			addPropertyEditor(createGenPackage_GeneralTab_Editor(), false);

		}

	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorGenPackage_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createGenPackage_GeneralTab_Editor() {
		if (this.editorGenPackage_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.properties.PropertiesPackage.eINSTANCE
					.getPackage_GenPackage();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			this.editorGenPackage_GeneralTab = editor;
		}
		return this.editorGenPackage_GeneralTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public PackageEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.properties.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.properties.PropertiesPackage.eINSTANCE
						.getPackage());
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
			return new PackageEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays
					.asList(new java.lang.String[]{"de.uni_paderborn.fujaba.properties.tab.general"})
					.contains(tab);
		}
	}

}
