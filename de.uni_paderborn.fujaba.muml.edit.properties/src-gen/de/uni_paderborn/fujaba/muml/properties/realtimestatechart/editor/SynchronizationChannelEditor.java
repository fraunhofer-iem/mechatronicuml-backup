package de.uni_paderborn.fujaba.muml.properties.realtimestatechart.editor;

/**
 * @generated
 */
public class SynchronizationChannelEditor
		extends
			org.storydriven.core.properties.core.editor.CommentableElementEditor {

	/**
	 * @generated
	 */
	public SynchronizationChannelEditor() {
		this(
				de.uni_paderborn.fujaba.muml.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory());
	}

	/**
	 * @generated
	 */
	public SynchronizationChannelEditor(
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
			return new SynchronizationChannelEditor();
		}
	}

}
