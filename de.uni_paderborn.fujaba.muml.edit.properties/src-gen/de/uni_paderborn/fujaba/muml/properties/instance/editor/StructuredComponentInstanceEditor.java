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
	public StructuredComponentInstanceEditor(
			org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		super.createProperties();

		addStructuredComponentInstanceEmbeddedCICEditor(null, false);

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

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public StructuredComponentInstanceEditor() {
		this(
				de.uni_paderborn.fujaba.muml.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
						.getStructuredComponentInstance());
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
