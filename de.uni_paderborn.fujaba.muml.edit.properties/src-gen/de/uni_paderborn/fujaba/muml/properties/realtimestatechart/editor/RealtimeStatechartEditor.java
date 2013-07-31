package de.uni_paderborn.fujaba.muml.properties.realtimestatechart.editor;

/**
 * @generated
 */
public class RealtimeStatechartEditor
		extends
			de.uni_paderborn.fujaba.muml.properties.behavior.editor.BehaviorEditor {

	/**
	 * @generated
	 */
	public RealtimeStatechartEditor() {
		this(
				de.uni_paderborn.fujaba.muml.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory());
	}

	/**
	 * @generated
	 */
	public RealtimeStatechartEditor(
			org.eclipse.emf.common.notify.AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * @generated
	 */
	public void initialize() {

		addSubCategory("de.fujaba.properties.category.Lists", "Lists",
				org.eclipse.swt.SWT.HORIZONTAL, true);

		addRealtimeStatechartTransitionsEditor(
				"de.fujaba.properties.category.Lists", true);

		addRealtimeStatechartStatesEditor(
				"de.fujaba.properties.category.Lists", true);

		addRealtimeStatechartClocksEditor(
				"de.fujaba.properties.category.Lists", true);

		super.initialize();
	}

	/**
	 * @generated
	 */
	protected void addRealtimeStatechartTransitionsEditor(String category,
			boolean front) {
		addEditorToCategory(category,
				createRealtimeStatechartTransitionsEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createRealtimeStatechartTransitionsEditor() {
		return new de.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getRealtimeStatechart_Transitions());

	}
	/**
	 * @generated
	 */
	protected void addRealtimeStatechartStatesEditor(String category,
			boolean front) {
		addEditorToCategory(category, createRealtimeStatechartStatesEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createRealtimeStatechartStatesEditor() {
		return new de.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getRealtimeStatechart_States());

	}
	/**
	 * @generated
	 */
	protected void addRealtimeStatechartClocksEditor(String category,
			boolean front) {
		addEditorToCategory(category, createRealtimeStatechartClocksEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createRealtimeStatechartClocksEditor() {
		return new de.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getRealtimeStatechart_Clocks());

	}

	/**
	 * @generated
	 */
	public static class Factory
			implements
				de.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor() {
			return new RealtimeStatechartEditor();
		}
	}

}
