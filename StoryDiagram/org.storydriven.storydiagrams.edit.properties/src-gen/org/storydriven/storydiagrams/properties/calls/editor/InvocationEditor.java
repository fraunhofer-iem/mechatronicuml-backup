
package org.storydriven.storydiagrams.properties.calls.editor;

/**
 * @generated
 */
public abstract class InvocationEditor extends de.uni_paderborn.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public InvocationEditor(String tab, org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		if (tab == null) {

			addPropertyEditor(createEditorCallee_property_tab_generalTab_Editor(), false);

		} else if ("property.tab.constraint".equals(tab)) { // Tab Constraint

		} else if ("property.tab.descriptionAspects".equals(tab)) { // Tab Description Aspects

		} else if ("property.tab.general".equals(tab)) { // Tab General

			addPropertyEditor(createEditorCallee_property_tab_generalTab_Editor(), false);

		} else if ("property.tab.documentation".equals(tab)) { // Tab Documentation

		} else if ("property.tab.extensions".equals(tab)) { // Tab Extensions

		} else {
		}
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorCallee_property_tab_generalTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorCallee_property_tab_generalTab_Editor() {
		if (this.editorCallee_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.storydriven.storydiagrams.calls.CallsPackage.eINSTANCE
					.getInvocation_Callee();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			this.editorCallee_property_tab_generalTab = editor;
		}
		return this.editorCallee_property_tab_generalTab;
	}

}
