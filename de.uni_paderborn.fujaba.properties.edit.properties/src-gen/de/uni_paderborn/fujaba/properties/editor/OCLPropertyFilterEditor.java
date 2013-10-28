package de.uni_paderborn.fujaba.properties.editor;

/**
 * @generated
 */
public class OCLPropertyFilterEditor
		extends
			de.uni_paderborn.fujaba.properties.editor.PropertyFilterEditor {

	/**
	 * @generated
	 */
	public OCLPropertyFilterEditor(String tab,
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

		if (getTab() == null
				|| "de.uni_paderborn.fujaba.properties.tab.general".equals(getTab())) {
			addOCLPropertyFilterExpressionEditor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addOCLPropertyFilterExpressionEditor(String category,
			boolean front) {
		addEditorToCategory(category,
				createOCLPropertyFilterExpressionEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createOCLPropertyFilterExpressionEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.OCLPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.properties.PropertiesPackage.eINSTANCE
						.getOCLPropertyFilter_Expression());

		return editor;

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public OCLPropertyFilterEditor(String tab) {
		this(tab, de.uni_paderborn.fujaba.properties.util.PropertiesUtil.INSTANCE
				.getAdapterFactory(),
				de.uni_paderborn.fujaba.properties.PropertiesPackage.eINSTANCE
						.getOCLPropertyFilter());
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
			return new OCLPropertyFilterEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"de.uni_paderborn.fujaba.properties.tab.general"})
					.contains(tab);
		}
	}

}
