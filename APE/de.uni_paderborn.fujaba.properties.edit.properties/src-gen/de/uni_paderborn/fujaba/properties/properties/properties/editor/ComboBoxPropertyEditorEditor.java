package de.uni_paderborn.fujaba.properties.properties.properties.editor;

/**
 * @generated
 */
public class ComboBoxPropertyEditorEditor
		extends
			de.uni_paderborn.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public ComboBoxPropertyEditorEditor(String tab,
			org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {

		if (tab == null
				|| "de.uni_paderborn.fujaba.properties.tab.general"
						.equals(getTab())) { // Tab General

		}

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public ComboBoxPropertyEditorEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.properties.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.properties.PropertiesPackage.eINSTANCE
						.getComboBoxPropertyEditor());
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
			return new ComboBoxPropertyEditorEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(new java.lang.String[]{}).contains(
					tab);
		}
	}

}
