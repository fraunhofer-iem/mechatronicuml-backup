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
	public TimeValueEditor() {

	}

	/**
	 * @generated
	 */
	public void initialize() {

		addTimeValueValueEditor(null, false);

		addTimeValueUnitEditor(null, true);

		super.initialize();
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
		return new de.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
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
		return new de.fujaba.properties.runtime.editors.TextPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage.eINSTANCE
						.getTimeValue_Unit());

	}

	/**
	 * @generated
	 */
	public static class Factory
			implements
				de.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor() {
			return new TimeValueEditor();
		}
	}

}
