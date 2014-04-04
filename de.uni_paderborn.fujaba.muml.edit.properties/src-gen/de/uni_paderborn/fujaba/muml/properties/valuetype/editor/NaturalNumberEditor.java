package de.uni_paderborn.fujaba.muml.properties.valuetype.editor;

/**
 * @generated
 */
public class NaturalNumberEditor
		extends
			de.uni_paderborn.fujaba.properties.runtime.editors.ClassPropertyEditor {

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

		addSubCategory("de.uni_paderborn.fujaba.properties.category.Booleans",
				"Booleans", org.eclipse.swt.SWT.HORIZONTAL, true);

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addNaturalNumberValueEditor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addNaturalNumberInfinityEditor(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					true);
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
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createNaturalNumberValueEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.SpinnerPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage.eINSTANCE
						.getNaturalNumber_Value(), 0);

		editor.setTooltipMessage("The value of this natural number.");

		return editor;

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
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createNaturalNumberInfinityEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage.eINSTANCE
						.getNaturalNumber_Infinity());

		editor.setTooltipMessage("Determins whether this natural number represents infinity.");

		return editor;

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
				de.uni_paderborn.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor(
				String tab) {
			return new NaturalNumberEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"property.tab.general",
							"property.tab.general"}).contains(tab);
		}
	}

}
