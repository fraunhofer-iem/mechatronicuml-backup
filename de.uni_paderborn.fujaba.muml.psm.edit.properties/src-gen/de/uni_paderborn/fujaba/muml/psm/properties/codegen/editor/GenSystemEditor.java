
package de.uni_paderborn.fujaba.muml.psm.properties.codegen.editor;

/**
 * @generated
 */
public class GenSystemEditor extends de.uni_paderborn.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public GenSystemEditor(String tab, org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		if (tab == null) {

			addPropertyEditor(createEditorGenECUs_PSMTab_Editor(), false);

		} else if ("property.tab.psm".equals(tab)) { // Tab PSM

			addPropertyEditor(createEditorGenECUs_PSMTab_Editor(), false);

		} else if ("property.tab.general".equals(tab)) { // Tab General

		} else if ("property.tab.documentation".equals(tab)) { // Tab Documentation

		} else if ("property.tab.extensions".equals(tab)) { // Tab Extensions

		} else if ("property.tab.constraint".equals(tab)) { // Tab Constraint

		} else if ("property.tab.constraint".equals(tab)) { // Tab Constraint

		} else {
		}
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorGenECUs_PSMTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorGenECUs_PSMTab_Editor() {
		if (this.editorGenECUs_PSMTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.psm.codegen.CodegenPackage.eINSTANCE
					.getGenSystem_GenECUs();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			this.editorGenECUs_PSMTab = editor;
		}
		return this.editorGenECUs_PSMTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public GenSystemEditor(String tab) {
		this(tab, de.uni_paderborn.fujaba.muml.psm.properties.util.PropertiesUtil.INSTANCE.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.psm.codegen.CodegenPackage.eINSTANCE.getGenSystem());
	}

	/**
	 * @generated
	 */
	public static class Factory implements de.uni_paderborn.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new GenSystemEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(new java.lang.String[]{"property.tab.psm"}).contains(tab);
		}
	}

}
