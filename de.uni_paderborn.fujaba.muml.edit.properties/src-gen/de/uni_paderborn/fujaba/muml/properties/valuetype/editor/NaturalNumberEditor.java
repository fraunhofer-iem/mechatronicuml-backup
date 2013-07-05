package de.uni_paderborn.fujaba.muml.properties.valuetype.editor;

/**
 * @generated
 */
public class NaturalNumberEditor
		extends
			de.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public NaturalNumberEditor() {
	}

	/**
	 * @generated
	 */
	public void initialize() {

		addNaturalNumberValueEditor(null, true);

		addNaturalNumberInfinityEditor(null, true);

		super.initialize();
	}

	/**
	 * @generated
	 */
	protected void addNaturalNumberValueEditor(String category, boolean front) {
		addEditorToCategory(category, createNaturalNumberValueEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createNaturalNumberValueEditor() {
		return new de.fujaba.properties.runtime.editors.TextPropertyEditor(
				de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage.eINSTANCE
						.getNaturalNumber_Value());

	}
	/**
	 * @generated
	 */
	protected void addNaturalNumberInfinityEditor(String category, boolean front) {
		addEditorToCategory(category, createNaturalNumberInfinityEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createNaturalNumberInfinityEditor() {
		return new de.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage.eINSTANCE
						.getNaturalNumber_Infinity());

	}

	//
	// Overwritten property settings
	//

	/**
	 * @generated
	 */
	public static class Factory
			implements
				de.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor() {
			return new NaturalNumberEditor();
		}
	}

}
