package de.uni_paderborn.fujaba.properties.properties.properties.editor;

/**
 * @generated
 */
public abstract class OrderedElementEditor
		extends
			de.uni_paderborn.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public OrderedElementEditor(String tab,
			org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {

		addPropertyEditor(createClazz_GeneralTab_Editor());

		addSubCategory("de.uni_paderborn.fujaba.properties.category.a", "a",
				org.eclipse.swt.SWT.HORIZONTAL, true);

	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createClazz_GeneralTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.properties.PropertiesPackage.eINSTANCE
				.getOrderedElement_Clazz();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory, feature);

		return editor;
	}

}
