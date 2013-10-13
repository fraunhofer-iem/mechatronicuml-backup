package de.fujaba.properties.properties.properties.editor;

/**
 * @generated
 */
public class SpinnerPropertyEditorEditor
		extends
			de.fujaba.properties.properties.properties.editor.PropertyEditorEditor {

	/**
	 * @generated
	 */
	public SpinnerPropertyEditorEditor(String tab,
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
			addSpinnerPropertyEditorDigitsEditor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addSpinnerPropertyEditorDigitsEditor(String category,
			boolean front) {
		addEditorToCategory(category,
				createSpinnerPropertyEditorDigitsEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createSpinnerPropertyEditorDigitsEditor() {
		return new de.fujaba.properties.runtime.editors.SpinnerPropertyEditor(
				adapterFactory,
				de.fujaba.properties.PropertiesPackage.eINSTANCE
						.getSpinnerPropertyEditor_Digits(), 0);

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public SpinnerPropertyEditorEditor(String tab) {
		this(tab, de.fujaba.properties.properties.util.PropertiesUtil.INSTANCE
				.getAdapterFactory(),
				de.fujaba.properties.PropertiesPackage.eINSTANCE
						.getSpinnerPropertyEditor());
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
			return new SpinnerPropertyEditorEditor(tab);
		}
	}

}
