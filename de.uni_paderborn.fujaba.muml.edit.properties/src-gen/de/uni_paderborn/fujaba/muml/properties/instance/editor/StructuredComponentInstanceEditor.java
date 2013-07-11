package de.uni_paderborn.fujaba.muml.properties.instance.editor;

/**
 * @generated
 */
public class StructuredComponentInstanceEditor
		extends
			de.uni_paderborn.fujaba.muml.properties.instance.editor.ComponentInstanceEditor {

	/**
	 * @generated
	 */
	public StructuredComponentInstanceEditor() {
		this(
				de.uni_paderborn.fujaba.muml.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory());
	}

	/**
	 * @generated
	 */
	public StructuredComponentInstanceEditor(
			org.eclipse.emf.common.notify.AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * @generated
	 */
	public void initialize() {

		addStructuredComponentInstanceEmbeddedCICEditor(null, false);

		super.initialize();
	}

	/**
	 * @generated
	 */
	protected void addStructuredComponentInstanceEmbeddedCICEditor(
			String category, boolean front) {
		addEditorToCategory(category,
				createStructuredComponentInstanceEmbeddedCICEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createStructuredComponentInstanceEmbeddedCICEditor() {
		return new de.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
						.getStructuredComponentInstance_EmbeddedCIC());

	}

	/**
	 * @generated
	 */
	public static class Factory
			implements
				de.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor() {
			return new StructuredComponentInstanceEditor();
		}
	}

}
