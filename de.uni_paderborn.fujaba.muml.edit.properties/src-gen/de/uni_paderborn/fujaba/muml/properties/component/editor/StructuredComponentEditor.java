package de.uni_paderborn.fujaba.muml.properties.component.editor;

/**
 * @generated
 */
public abstract class StructuredComponentEditor
		extends
			de.uni_paderborn.fujaba.muml.properties.component.editor.ComponentEditor {

	/**
	 * @generated
	 */
	public StructuredComponentEditor(String tab,
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
			addStructuredComponentConnectorsEditor(
					"de.uni_paderborn.fujaba.properties.category.Lists", true);
		}

	}

	/**
	 * @generated
	 */
	protected void addStructuredComponentConnectorsEditor(String category,
			boolean front) {
		addEditorToCategory(category,
				createStructuredComponentConnectorsEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createStructuredComponentConnectorsEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
						.getStructuredComponent_Connectors());

		editor.setTooltipMessage("The connectors this structured component contains. These can either be delegations or assemblies.");

		return editor;

	}

}
