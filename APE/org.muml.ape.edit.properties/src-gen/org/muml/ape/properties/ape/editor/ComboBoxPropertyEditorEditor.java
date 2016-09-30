
package org.muml.ape.properties.ape.editor;

/**
 * @generated
 */
public class ComboBoxPropertyEditorEditor extends org.muml.ape.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public ComboBoxPropertyEditorEditor(String tab, org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		if (tab == null) {

		} else if ("org.muml.ape.tab.general".equals(tab)) { // Tab General

		} else {
		}
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public ComboBoxPropertyEditorEditor(String tab) {
		this(tab, org.muml.ape.properties.util.PropertiesUtil.INSTANCE.getAdapterFactory(),
				org.muml.ape.PropertiesPackage.eINSTANCE.getComboBoxPropertyEditor());
	}

	/**
	 * @generated
	 */
	public static class Factory implements org.muml.ape.runtime.factory.IPropertyEditorFactory {
		@Override
		public org.muml.ape.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new ComboBoxPropertyEditorEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(new java.lang.String[]{}).contains(tab);
		}
	}

}
