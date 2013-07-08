package de.uni_paderborn.fujaba.muml.properties.valuetype.editor;

/**
 * @generated
 */
public class RangeEditor
		extends
			de.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public RangeEditor() {
		super(
				de.uni_paderborn.fujaba.muml.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory());

	}

	/**
	 * @generated
	 */
	public void initialize() {

		addRangeLowerBoundEditor(null, true);

		addRangeUpperBoundEditor(null, true);

		super.initialize();
	}

	/**
	 * @generated
	 */
	protected void addRangeLowerBoundEditor(String category, boolean front) {
		addEditorToCategory(category, createRangeLowerBoundEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createRangeLowerBoundEditor() {
		return new de.fujaba.properties.runtime.editors.TextPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage.eINSTANCE
						.getRange_LowerBound());

	}
	/**
	 * @generated
	 */
	protected void addRangeUpperBoundEditor(String category, boolean front) {
		addEditorToCategory(category, createRangeUpperBoundEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createRangeUpperBoundEditor() {
		return new de.fujaba.properties.runtime.editors.TextPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage.eINSTANCE
						.getRange_UpperBound());

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
			return new RangeEditor();
		}
	}

}
