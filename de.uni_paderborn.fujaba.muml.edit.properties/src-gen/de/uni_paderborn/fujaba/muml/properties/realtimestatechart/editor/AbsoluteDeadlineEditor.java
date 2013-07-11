package de.uni_paderborn.fujaba.muml.properties.realtimestatechart.editor;

/**
 * @generated
 */
public class AbsoluteDeadlineEditor
		extends
			de.uni_paderborn.fujaba.muml.properties.realtimestatechart.editor.DeadlineEditor {

	/**
	 * @generated
	 */
	public AbsoluteDeadlineEditor() {
		this(
				de.uni_paderborn.fujaba.muml.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory());
	}

	/**
	 * @generated
	 */
	public AbsoluteDeadlineEditor(
			org.eclipse.emf.common.notify.AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * @generated
	 */
	public void initialize() {

		super.initialize();
	}

	/**
	 * @generated
	 */
	public static class Factory
			implements
				de.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor() {
			return new AbsoluteDeadlineEditor();
		}
	}

}
