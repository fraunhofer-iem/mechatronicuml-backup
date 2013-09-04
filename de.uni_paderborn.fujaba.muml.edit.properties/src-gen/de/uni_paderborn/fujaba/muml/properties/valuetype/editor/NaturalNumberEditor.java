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
	public NaturalNumberEditor(
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

		addSubCategory("de.fujaba.properties.category.Booleans", "Booleans",
				org.eclipse.swt.SWT.HORIZONTAL, true);

		addNaturalNumberValueEditor(null, true);

		addNaturalNumberInfinityEditor(
				"de.fujaba.properties.category.Booleans", true);

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
				adapterFactory,
				de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage.eINSTANCE
						.getNaturalNumber_Value(), false);

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
				adapterFactory,
				de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage.eINSTANCE
						.getNaturalNumber_Infinity());

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public NaturalNumberEditor() {
		this(
				de.uni_paderborn.fujaba.muml.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage.eINSTANCE
						.getNaturalNumber());
	}

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
