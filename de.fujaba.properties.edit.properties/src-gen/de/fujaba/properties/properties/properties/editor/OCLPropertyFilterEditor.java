package de.fujaba.properties.properties.properties.editor;

/**
 * @generated
 */
public class OCLPropertyFilterEditor
		extends
			de.fujaba.properties.properties.properties.editor.PropertyFilterEditor {

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
				|| "de.fujaba.properties.tab.general".equals(getTab())) {
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
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createOCLPropertyFilterExpressionEditor() {
		return new de.fujaba.properties.runtime.editors.OCLPropertyEditor(
				adapterFactory,
				de.fujaba.properties.PropertiesPackage.eINSTANCE
						.getOCLPropertyFilter_Expression());

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public OCLPropertyFilterEditor(String tab) {
		this(tab, de.fujaba.properties.properties.util.PropertiesUtil.INSTANCE
				.getAdapterFactory(),
				de.fujaba.properties.PropertiesPackage.eINSTANCE
						.getOCLPropertyFilter());
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
			return new OCLPropertyFilterEditor(tab);
		}
	}

}
