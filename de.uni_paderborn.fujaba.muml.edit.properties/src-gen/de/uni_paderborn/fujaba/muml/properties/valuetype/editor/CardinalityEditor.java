package de.uni_paderborn.fujaba.muml.properties.valuetype.editor;

/**
 * @generated
 */
public class CardinalityEditor
		extends
			de.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public CardinalityEditor(String tab,
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

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addCardinalityLowerBoundEditor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addCardinalityUpperBoundEditor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addCardinalityLowerBoundEditor(String category, boolean front) {
		addEditorToCategory(category, createCardinalityLowerBoundEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createCardinalityLowerBoundEditor() {
		de.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.fujaba.properties.runtime.editors.TextPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage.eINSTANCE
						.getCardinality_LowerBound(), false);

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addCardinalityUpperBoundEditor(String category, boolean front) {
		addEditorToCategory(category, createCardinalityUpperBoundEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createCardinalityUpperBoundEditor() {
		de.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.fujaba.properties.runtime.editors.TextPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage.eINSTANCE
						.getCardinality_UpperBound(), false);

		return editor;

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public CardinalityEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.muml.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage.eINSTANCE
						.getCardinality());
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
			return new CardinalityEditor(tab);
		}
	}

}
