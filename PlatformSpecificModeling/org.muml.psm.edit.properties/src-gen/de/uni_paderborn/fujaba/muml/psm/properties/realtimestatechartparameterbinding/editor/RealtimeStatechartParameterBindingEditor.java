
package de.uni_paderborn.fujaba.muml.psm.properties.realtimestatechartparameterbinding.editor;

/**
 * @generated
 */
public abstract class RealtimeStatechartParameterBindingEditor
		extends
			de.uni_paderborn.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public RealtimeStatechartParameterBindingEditor(String tab,
			org.eclipse.emf.common.notify.AdapterFactory adapterFactory, org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		if (tab == null) {

			addPropertyEditor(createEditorParameter_property_tab_psmTab_Editor(), false);

		} else if ("property.tab.psm".equals(tab)) { // Tab PSM

			addPropertyEditor(createEditorParameter_property_tab_psmTab_Editor(), false);

		} else if ("property.tab.general".equals(tab)) { // Tab General

		} else if ("property.tab.documentation".equals(tab)) { // Tab Documentation

		} else if ("property.tab.extensions".equals(tab)) { // Tab Extensions

		} else if ("property.tab.constraint".equals(tab)) { // Tab Constraint

		} else if ("property.tab.descriptionAspects".equals(tab)) { // Tab Description Aspects

		} else if ("property.tab.constraint".equals(tab)) { // Tab Constraint

		} else {
		}
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorParameter_property_tab_psmTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorParameter_property_tab_psmTab_Editor() {
		if (this.editorParameter_property_tab_psmTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.RealtimestatechartparameterbindingPackage.eINSTANCE
					.getRealtimeStatechartParameterBinding_Parameter();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The parameter, to which a concrete value will be assigned.");

			this.editorParameter_property_tab_psmTab = editor;
		}
		return this.editorParameter_property_tab_psmTab;
	}

}
