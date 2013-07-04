package de.uni_paderborn.fujaba.muml.properties.instance.editor;

public class StructuredComponentInstanceEditor
		extends
			de.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public StructuredComponentInstanceEditor() {
	}

	/**
	 * @generated
	 */
	public void initialize() {

		addStructuredComponentInstanceEmbeddedCICEditor(null, true);

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
				de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
						.getStructuredComponentInstance_EmbeddedCIC());

	}

	//
	// Overwritten property settings
	//

}
