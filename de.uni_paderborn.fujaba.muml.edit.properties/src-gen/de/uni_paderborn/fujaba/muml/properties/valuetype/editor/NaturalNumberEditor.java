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
	public NaturalNumberEditor(String tab,
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

		if (getTab() == null || "property.tab.experimental".equals(getTab())) {
			addNaturalNumberValueEditor(null, true);
		}

		if (getTab() == null || "property.tab.experimental".equals(getTab())) {
			addNaturalNumberInfinityEditor(
					"de.fujaba.properties.category.Booleans", true);
		}

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
		return new de.fujaba.properties.runtime.editors.SpinnerPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage.eINSTANCE
						.getNaturalNumber_Value(), 0);

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
	public NaturalNumberEditor(String tab) {
		this(
				tab,
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
		public de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor(
				String tab) {
			return new NaturalNumberEditor(tab);
		}
	}

}
