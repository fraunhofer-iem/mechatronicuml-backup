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
	public RangeEditor(
			org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		super.createProperties();

		addRangeLowerBoundEditor(null, true);

		addRangeUpperBoundEditor(null, true);

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
						.getRange_LowerBound(), false);

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
						.getRange_UpperBound(), false);

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public RangeEditor() {
		this(
				de.uni_paderborn.fujaba.muml.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage.eINSTANCE
						.getRange());
	}

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
