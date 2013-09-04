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
	public TimeValueEditor(
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

		addTimeValueValueEditor(null, true);

		addTimeValueUnitEditor(null, true);

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
		return new de.fujaba.properties.runtime.editors.TextPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage.eINSTANCE
						.getTimeValue_Unit(), false);

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public TimeValueEditor() {
		this(
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
		public de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor() {
			return new TimeValueEditor();
		}
	}

}
