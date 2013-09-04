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
	public CardinalityEditor(
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

		addCardinalityLowerBoundEditor(null, true);

		addCardinalityUpperBoundEditor(null, true);

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
		return new de.uni_paderborn.fujaba.muml.common.properties.NaturalNumberTextEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage.eINSTANCE
						.getCardinality_LowerBound());

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
		return new de.uni_paderborn.fujaba.muml.common.properties.NaturalNumberTextEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage.eINSTANCE
						.getCardinality_UpperBound());

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public CardinalityEditor() {
		this(
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
		public de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor() {
			return new CardinalityEditor();
		}
	}

}
