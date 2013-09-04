package de.uni_paderborn.fujaba.muml.properties.instance.editor;

/**
 * @generated
 */
public class ComponentInstanceConfigurationEditor
		extends
			org.storydriven.core.properties.core.editor.NamedElementEditor {

	/**
	 * @generated
	 */
	public ComponentInstanceConfigurationEditor(
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

		addComponentInstanceConfigurationComponentInstancesEditor(
				"de.fujaba.properties.category.Lists", true);

		addComponentInstanceConfigurationPortConnectorInstancesEditor(
				"de.fujaba.properties.category.Lists", true);

		addCommentableElementCommentEditor(null, true);

	}

	/**
	 * @generated
	 */
	protected void addComponentInstanceConfigurationComponentInstancesEditor(
			String category, boolean front) {
		addEditorToCategory(category,
				createComponentInstanceConfigurationComponentInstancesEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createComponentInstanceConfigurationComponentInstancesEditor() {
		return new de.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
						.getComponentInstanceConfiguration_ComponentInstances());

	}
	/**
	 * @generated
	 */
	protected void addComponentInstanceConfigurationPortConnectorInstancesEditor(
			String category, boolean front) {
		addEditorToCategory(
				category,
				createComponentInstanceConfigurationPortConnectorInstancesEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createComponentInstanceConfigurationPortConnectorInstancesEditor() {
		return new de.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
						.getComponentInstanceConfiguration_PortConnectorInstances());

	}
	/**
	 * @generated
	 */
	protected void addCommentableElementCommentEditor(String category,
			boolean front) {
		addEditorToCategory(category, createCommentableElementCommentEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createCommentableElementCommentEditor() {
		return new de.fujaba.properties.runtime.editors.TextPropertyEditor(
				adapterFactory,
				org.storydriven.core.CorePackage.eINSTANCE
						.getCommentableElement_Comment(), false);

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public ComponentInstanceConfigurationEditor() {
		this(
				de.uni_paderborn.fujaba.muml.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
						.getComponentInstanceConfiguration());
	}

	/**
	 * @generated
	 */
	public static class Factory
			implements
				de.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor() {
			return new ComponentInstanceConfigurationEditor();
		}
	}

}
