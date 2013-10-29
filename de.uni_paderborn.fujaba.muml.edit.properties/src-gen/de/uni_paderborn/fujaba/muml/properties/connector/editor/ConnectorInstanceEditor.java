package de.uni_paderborn.fujaba.muml.properties.connector.editor;

/**
 * @generated
 */
public abstract class ConnectorInstanceEditor
		extends
			org.storydriven.core.properties.core.editor.CommentableElementEditor {

	/**
	 * @generated
	 */
	public ConnectorInstanceEditor(String tab,
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

		addSubCategory("de.uni_paderborn.fujaba.properties.category.Lists",
				"Lists", org.eclipse.swt.SWT.HORIZONTAL, true);

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addConnectorInstanceTypeEditor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addConnectorInstanceConnectorEndpointInstancesEditor(
					"de.uni_paderborn.fujaba.properties.category.Lists", true);
		}

	}

	/**
	 * @generated
	 */
	protected void addConnectorInstanceTypeEditor(String category, boolean front) {
		addEditorToCategory(category, createConnectorInstanceTypeEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createConnectorInstanceTypeEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
						.getConnectorInstance_Type());

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addConnectorInstanceConnectorEndpointInstancesEditor(
			String category, boolean front) {
		addEditorToCategory(category,
				createConnectorInstanceConnectorEndpointInstancesEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createConnectorInstanceConnectorEndpointInstancesEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
						.getConnectorInstance_ConnectorEndpointInstances());

		return editor;

	}

}
