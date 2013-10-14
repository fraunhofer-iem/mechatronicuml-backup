package de.uni_paderborn.fujaba.muml.properties.realtimestatechart.editor;

/**
 * @generated
 */
public class SynchronizationEditor
		extends
			org.storydriven.core.properties.core.editor.ExtendableElementEditor {

	/**
	 * @generated
	 */
	public SynchronizationEditor(String tab,
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
			addSynchronizationSyncChannelEditor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addSynchronizationKindEditor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addSynchronizationSelectorExpressionEditor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addSynchronizationSyncChannelEditor(String category,
			boolean front) {
		addEditorToCategory(category, createSynchronizationSyncChannelEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createSynchronizationSyncChannelEditor() {
		de.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getSynchronization_SyncChannel());

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addSynchronizationKindEditor(String category, boolean front) {
		addEditorToCategory(category, createSynchronizationKindEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createSynchronizationKindEditor() {
		de.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.fujaba.properties.runtime.editors.OptionPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getSynchronization_Kind());

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addSynchronizationSelectorExpressionEditor(String category,
			boolean front) {
		addEditorToCategory(category,
				createSynchronizationSelectorExpressionEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createSynchronizationSelectorExpressionEditor() {
		de.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.muml.ui.properties.XtextPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getSynchronization_SelectorExpression());

		return editor;

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public SynchronizationEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.muml.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getSynchronization());
	}

	/**
	 * @generated
	 */
	public static class Factory
			implements
				de.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor(
				String tab) {
			return new SynchronizationEditor(tab);
		}
	}

}
