package de.uni_paderborn.fujaba.muml.properties.realtimestatechart.editor;

/**
 * @generated
 */
public abstract class StateConnectionPointEditor
		extends
			de.uni_paderborn.fujaba.muml.properties.realtimestatechart.editor.VertexEditor {

	/**
	 * @generated
	 */
	public StateConnectionPointEditor(String tab,
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

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addStateConnectionPointStateEditor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addStateConnectionPointStateEditor(String category,
			boolean front) {
		addEditorToCategory(category, createStateConnectionPointStateEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createStateConnectionPointStateEditor() {
		de.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getStateConnectionPoint_State());

		return editor;

	}

}
