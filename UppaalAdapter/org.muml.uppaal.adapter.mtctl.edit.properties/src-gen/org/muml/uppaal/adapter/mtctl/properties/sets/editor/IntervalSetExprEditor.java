
package org.muml.uppaal.adapter.mtctl.properties.sets.editor;

/**
 * @generated
 */
public class IntervalSetExprEditor extends org.muml.ape.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public IntervalSetExprEditor(String tab, org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		if (tab == null) {

			addPropertyEditor(createEditorLowerVal_property_tab_mtctlTab_Editor(), false);

			addPropertyEditor(createEditorUpperVal_property_tab_mtctlTab_Editor(), false);

		} else if ("property.tab.mtctl".equals(tab)) { // Tab Mtctl

			addPropertyEditor(createEditorLowerVal_property_tab_mtctlTab_Editor(), false);

			addPropertyEditor(createEditorUpperVal_property_tab_mtctlTab_Editor(), false);

		} else {
		}
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorLowerVal_property_tab_mtctlTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorLowerVal_property_tab_mtctlTab_Editor() {
		if (this.editorLowerVal_property_tab_mtctlTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.uppaal.adapter.mtctl.sets.SetsPackage.eINSTANCE
					.getIntervalSetExpr_LowerVal();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.SpinnerPropertyEditor(
					adapterFactory, feature, 0);

			this.editorLowerVal_property_tab_mtctlTab = editor;
		}
		return this.editorLowerVal_property_tab_mtctlTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorUpperVal_property_tab_mtctlTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorUpperVal_property_tab_mtctlTab_Editor() {
		if (this.editorUpperVal_property_tab_mtctlTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.uppaal.adapter.mtctl.sets.SetsPackage.eINSTANCE
					.getIntervalSetExpr_UpperVal();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.SpinnerPropertyEditor(
					adapterFactory, feature, 0);

			this.editorUpperVal_property_tab_mtctlTab = editor;
		}
		return this.editorUpperVal_property_tab_mtctlTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public IntervalSetExprEditor(String tab) {
		this(tab, org.muml.uppaal.adapter.mtctl.properties.util.PropertiesUtil.INSTANCE.getAdapterFactory(),
				org.muml.uppaal.adapter.mtctl.sets.SetsPackage.eINSTANCE.getIntervalSetExpr());
	}

	/**
	 * @generated
	 */
	public static class Factory implements org.muml.ape.runtime.factory.IPropertyEditorFactory {
		@Override
		public org.muml.ape.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new IntervalSetExprEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(new java.lang.String[]{"property.tab.mtctl", "property.tab.mtctl"})
					.contains(tab);
		}
	}

}
