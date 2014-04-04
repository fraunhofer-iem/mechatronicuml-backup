package de.uni_paderborn.fujaba.muml.properties.realtimestatechart.editor;

/**
 * @generated
 */
public class AsynchronousMessageEventEditor
		extends
			de.uni_paderborn.fujaba.muml.properties.realtimestatechart.editor.TransitionEventEditor {

	/**
	 * @generated
	 */
	public AsynchronousMessageEventEditor(String tab,
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
			addAsynchronousMessageEventMessageEditor(null, false);
		}

	}

	/**
	 * @generated
	 */
	protected void addAsynchronousMessageEventMessageEditor(String category,
			boolean front) {
		addEditorToCategory(category,
				createAsynchronousMessageEventMessageEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createAsynchronousMessageEventMessageEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getAsynchronousMessageEvent_Message());

		editor.setTooltipMessage("The message associated with this event. The message is either requested to be\nreceived (trigger event) or it will be sent (raise event).");

		return editor;

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public AsynchronousMessageEventEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.muml.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getAsynchronousMessageEvent());
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
			return new AsynchronousMessageEventEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"property.tab.general",
							"property.tab.general"}).contains(tab);
		}
	}

}
