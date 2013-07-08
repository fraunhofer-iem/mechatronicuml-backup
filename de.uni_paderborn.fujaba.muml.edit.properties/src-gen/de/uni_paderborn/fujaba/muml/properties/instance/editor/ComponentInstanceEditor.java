package de.uni_paderborn.fujaba.muml.properties.instance.editor;

/**
 * @generated
 */
public class ComponentInstanceEditor
		extends
			org.storydriven.core.properties.core.editor.NamedElementEditor {

	/**
	 * @generated
	 */
	public ComponentInstanceEditor() {
	}

	/**
	 * @generated
	 */
	public void initialize() {

		addComponentInstancePortInstancesEditor(null, true);

		super.initialize();
	}

	/**
	 * @generated
	 */
	protected void addComponentInstancePortInstancesEditor(String category,
			boolean front) {
		addEditorToCategory(category,
				createComponentInstancePortInstancesEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createComponentInstancePortInstancesEditor() {
		return new de.fujaba.properties.runtime.editors.ListPropertyEditor(
				de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
						.getComponentInstance_PortInstances());

	}

	//
	// Overwritten property settings
	//

	/**
	 * @generated
	 */
	public static class Factory
			implements
				de.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor() {
			return new ComponentInstanceEditor();
		}
	}

}
