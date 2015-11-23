
package de.uni_paderborn.fujaba.muml.psm.properties.codegen.editor;

/**
 * @generated
 */
public class GenTaskEditor extends de.uni_paderborn.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public GenTaskEditor(String tab, org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		if (tab == null) {

			addPropertyEditor(createEditorGenComponentInstances_PSMTab_Editor(), false);

		} else if ("property.tab.psm".equals(tab)) { // Tab PSM

			addPropertyEditor(createEditorGenComponentInstances_PSMTab_Editor(), false);

		} else if ("property.tab.general".equals(tab)) { // Tab General

		} else if ("property.tab.documentation".equals(tab)) { // Tab Documentation

		} else if ("property.tab.extensions".equals(tab)) { // Tab Extensions

		} else if ("property.tab.constraint".equals(tab)) { // Tab Constraint

		} else if ("property.tab.descriptionAspects".equals(tab)) { // Tab Description_Aspects

		} else if ("property.tab.constraint".equals(tab)) { // Tab Constraint

		} else {
		}
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorGenComponentInstances_PSMTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorGenComponentInstances_PSMTab_Editor() {
		if (this.editorGenComponentInstances_PSMTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.psm.codegen.CodegenPackage.eINSTANCE
					.getGenTask_GenComponentInstances();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			this.editorGenComponentInstances_PSMTab = editor;
		}
		return this.editorGenComponentInstances_PSMTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public GenTaskEditor(String tab) {
		this(tab, de.uni_paderborn.fujaba.muml.psm.properties.util.PropertiesUtil.INSTANCE.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.psm.codegen.CodegenPackage.eINSTANCE.getGenTask());
	}

	/**
	 * @generated
	 */
	public static class Factory implements de.uni_paderborn.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new GenTaskEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(new java.lang.String[]{"property.tab.psm"}).contains(tab);
		}
	}

}
