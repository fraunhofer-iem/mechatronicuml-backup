package de.fujaba.properties.properties.properties.editor;

/**
 * @generated
 */
public class CustomTransformationEditor
		extends
			de.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public CustomTransformationEditor(String tab,
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

		addSubCategory("de.fujaba.properties.category.Booleans", "Booleans",
				org.eclipse.swt.SWT.HORIZONTAL, true);

		if (getTab() == null
				|| "de.fujaba.properties.tab.general".equals(getTab())) {
			addCustomTransformationUriEditor(null, true);
		}

		if (getTab() == null
				|| "de.fujaba.properties.tab.general".equals(getTab())) {
			addCustomTransformationEnabledEditor(
					"de.fujaba.properties.category.Booleans", true);
		}

		if (getTab() == null
				|| "de.fujaba.properties.tab.general".equals(getTab())) {
			addCustomTransformationPositionEditor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addCustomTransformationUriEditor(String category,
			boolean front) {
		addEditorToCategory(category, createCustomTransformationUriEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createCustomTransformationUriEditor() {
		return new de.fujaba.properties.runtime.editors.TextPropertyEditor(
				adapterFactory,
				de.fujaba.properties.PropertiesPackage.eINSTANCE
						.getCustomTransformation_Uri(), false);

	}
	/**
	 * @generated
	 */
	protected void addCustomTransformationEnabledEditor(String category,
			boolean front) {
		addEditorToCategory(category,
				createCustomTransformationEnabledEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createCustomTransformationEnabledEditor() {
		return new de.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				adapterFactory,
				de.fujaba.properties.PropertiesPackage.eINSTANCE
						.getCustomTransformation_Enabled());

	}
	/**
	 * @generated
	 */
	protected void addCustomTransformationPositionEditor(String category,
			boolean front) {
		addEditorToCategory(category,
				createCustomTransformationPositionEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createCustomTransformationPositionEditor() {
		return new de.fujaba.properties.runtime.editors.OptionPropertyEditor(
				adapterFactory,
				de.fujaba.properties.PropertiesPackage.eINSTANCE
						.getCustomTransformation_Position());

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public CustomTransformationEditor(String tab) {
		this(tab, de.fujaba.properties.properties.util.PropertiesUtil.INSTANCE
				.getAdapterFactory(),
				de.fujaba.properties.PropertiesPackage.eINSTANCE
						.getCustomTransformation());
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
			return new CustomTransformationEditor(tab);
		}
	}

}
