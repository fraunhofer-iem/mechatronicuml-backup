package de.fujaba.properties.properties.properties.editor;

/**
 * @generated
 */
public class PropertyTabEditor
		extends
			de.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public PropertyTabEditor(String tab,
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
			addPropertyTabIdEditor(null, true);
		}

		if (getTab() == null
				|| "de.fujaba.properties.tab.general".equals(getTab())) {
			addPropertyTabNameEditor(null, true);
		}

		if (getTab() == null
				|| "de.fujaba.properties.tab.general".equals(getTab())) {
			addPropertyTabAfterTabEditor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addPropertyTabIdEditor(String category, boolean front) {
		addEditorToCategory(category, createPropertyTabIdEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyTabIdEditor() {
		return new de.fujaba.properties.runtime.editors.TextPropertyEditor(
				adapterFactory,
				de.fujaba.properties.PropertiesPackage.eINSTANCE
						.getPropertyTab_Id(), false);

	}
	/**
	 * @generated
	 */
	protected void addPropertyTabNameEditor(String category, boolean front) {
		addEditorToCategory(category, createPropertyTabNameEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyTabNameEditor() {
		return new de.fujaba.properties.runtime.editors.TextPropertyEditor(
				adapterFactory,
				de.fujaba.properties.PropertiesPackage.eINSTANCE
						.getPropertyTab_Name(), false);

	}
	/**
	 * @generated
	 */
	protected void addPropertyTabAfterTabEditor(String category, boolean front) {
		addEditorToCategory(category, createPropertyTabAfterTabEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyTabAfterTabEditor() {
		return new de.fujaba.properties.runtime.editors.TextPropertyEditor(
				adapterFactory,
				de.fujaba.properties.PropertiesPackage.eINSTANCE
						.getPropertyTab_AfterTab(), false);

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public PropertyTabEditor(String tab) {
		this(tab, de.fujaba.properties.properties.util.PropertiesUtil.INSTANCE
				.getAdapterFactory(),
				de.fujaba.properties.PropertiesPackage.eINSTANCE
						.getPropertyTab());
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
			return new PropertyTabEditor(tab);
		}
	}

}
