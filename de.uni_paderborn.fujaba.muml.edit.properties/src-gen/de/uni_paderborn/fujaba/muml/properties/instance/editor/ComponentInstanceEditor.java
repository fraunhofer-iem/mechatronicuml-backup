package de.uni_paderborn.fujaba.muml.properties.instance.editor;

/**
 * @generated
 */
public abstract class ComponentInstanceEditor
		extends
			org.storydriven.core.properties.core.editor.NamedElementEditor {

	/**
	 * @generated
	 */
	public ComponentInstanceEditor(
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

		addSubCategory("de.fujaba.properties.category.Lists", "Lists",
				org.eclipse.swt.SWT.HORIZONTAL, true);

		addComponentInstancePortInstancesEditor(
				"de.fujaba.properties.category.Lists", true);

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
				adapterFactory,
				de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
						.getComponentInstance_PortInstances());

	}

}
