package org.eclipse.emf.ecore.properties.ecore.editor;

/**
 * @generated
 */
public class EObjectEditor
		extends
			de.uni_paderborn.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public EObjectEditor(String tab,
			org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {

		if (tab == null || "tab.default".equals(getTab())) { // Tab Default

		} else if (tab == null || "tab.documentation".equals(getTab())) { // Tab Documentation

		} else if (tab == null || "tab.ocl".equals(getTab())) { // Tab OCL

		}

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public EObjectEditor(String tab) {
		this(tab, org.eclipse.emf.ecore.properties.util.PropertiesUtil.INSTANCE
				.getAdapterFactory(),
				org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getEObject());
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
			return new EObjectEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(new java.lang.String[]{}).contains(
					tab);
		}
	}

}
