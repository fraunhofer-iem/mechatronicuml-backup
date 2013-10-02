package de.uni_paderborn.fujaba.muml.properties.valuetype.editor;

/**
 * @generated
 */
public class TimeValueEditor
		extends
			org.storydriven.core.properties.core.editor.ExtendableElementEditor {

	/**
	 * @generated
	 */
	public TimeValueEditor(String tab,
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

		if (getTab() == null || "property.tab.experimental".equals(getTab())) {
			addTimeValueValueEditor(null, true);
		}

		if (getTab() == null || "property.tab.experimental".equals(getTab())) {
			addTimeValueUnitEditor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addTimeValueValueEditor(String category, boolean front) {
		addEditorToCategory(category, createTimeValueValueEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createTimeValueValueEditor() {
		return new de.uni_paderborn.fujaba.muml.common.properties.NaturalNumberTextEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage.eINSTANCE
						.getTimeValue_Value());

	}
	/**
	 * @generated
	 */
	protected void addTimeValueUnitEditor(String category, boolean front) {
		addEditorToCategory(category, createTimeValueUnitEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createTimeValueUnitEditor() {
		return new de.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage.eINSTANCE
						.getTimeValue_Unit());

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public TimeValueEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.muml.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage.eINSTANCE
						.getTimeValue());
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
			return new TimeValueEditor(tab);
		}
	}

}
