package de.uni_paderborn.fujaba.muml.properties.realtimestatechart.editor;

/**
 * @generated
 */
public abstract class PrioritizedElementEditor
		extends
			de.uni_paderborn.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public PrioritizedElementEditor(String tab,
			org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {

		if (tab == null || "property.tab.constraint".equals(getTab())) { // Tab Constraint

		} else if (tab == null || "property.tab.general".equals(getTab())) { // Tab General

			addPropertyEditor(createPriority_GeneralTab_Editor(), false);

		} else if (tab == null || "property.tab.documentation".equals(getTab())) { // Tab Documentation

		} else if (tab == null || "property.tab.extensions".equals(getTab())) { // Tab Extensions

		}

	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorPriority_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createPriority_GeneralTab_Editor() {
		if (this.editorPriority_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getPrioritizedElement_Priority();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.SpinnerPropertyEditor(
					adapterFactory, feature, 0);

			editor.setTooltipMessage("The integer value that represents the priority.");

			this.editorPriority_GeneralTab = editor;
		}
		return this.editorPriority_GeneralTab;
	}

}
