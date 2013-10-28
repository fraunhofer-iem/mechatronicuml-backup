package de.fujaba.properties.properties.properties.editor;

/**
 * @generated
 */
public class CustomPropertyEditorEditor
		extends
			de.fujaba.properties.properties.properties.editor.PropertyEditorEditor {

	/**
	 * @generated
	 */
	public CustomPropertyEditorEditor(String tab,
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

		if (getTab() == null
				|| "de.fujaba.properties.tab.general".equals(getTab())) {
			addCustomPropertyEditorFullyQualifiedClassNameEditor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addCustomPropertyEditorFullyQualifiedClassNameEditor(
			String category, boolean front) {
		addEditorToCategory(category,
				createCustomPropertyEditorFullyQualifiedClassNameEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createCustomPropertyEditorFullyQualifiedClassNameEditor() {
		de.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.fujaba.properties.runtime.editors.TextPropertyEditor(
				adapterFactory,
				de.fujaba.properties.PropertiesPackage.eINSTANCE
						.getCustomPropertyEditor_FullyQualifiedClassName(),
				false);

		return editor;

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public CustomPropertyEditorEditor(String tab) {
		this(tab, de.fujaba.properties.properties.util.PropertiesUtil.INSTANCE
				.getAdapterFactory(),
				de.fujaba.properties.PropertiesPackage.eINSTANCE
						.getCustomPropertyEditor());
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
			return new CustomPropertyEditorEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"de.fujaba.properties.tab.general"})
					.contains(tab);
		}
	}

}
