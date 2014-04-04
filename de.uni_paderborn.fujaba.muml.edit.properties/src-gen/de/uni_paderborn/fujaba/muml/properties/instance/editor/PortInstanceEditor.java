package de.uni_paderborn.fujaba.muml.properties.instance.editor;

/**
 * @generated
 */
public abstract class PortInstanceEditor
		extends
			de.uni_paderborn.fujaba.muml.properties.connector.editor.ConnectorEndpointInstanceEditor {

	/**
	 * @generated
	 */
	public PortInstanceEditor(String tab,
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

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addPortInstanceComponentInstanceEditor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addPortInstanceComponentInstanceEditor(String category,
			boolean front) {
		addEditorToCategory(category,
				createPortInstanceComponentInstanceEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createPortInstanceComponentInstanceEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
						.getPortInstance_ComponentInstance());

		editor.setTooltipMessage("The component instance this port instance belongs to.");

		return editor;

	}

}
