package de.uni_paderborn.fujaba.muml.properties.component.editor;

/**
 * @generated
 */
public class PortPartEditor
		extends
			de.uni_paderborn.fujaba.muml.properties.types.editor.DataTypeEditor {

	/**
	 * @generated
	 */
	public PortPartEditor(String tab,
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

		if (getTab() == null || "property.tab.experimental".equals(getTab())) {
			addPortPartPortTypeEditor(null, true);
		}

		if (getTab() == null || "property.tab.experimental".equals(getTab())) {
			addPortPartComponentPartEditor(null, true);
		}

		if (getTab() == null || "property.tab.experimental".equals(getTab())) {
			addPortPartCoordinationProtocolOccurenceEditor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addPortPartPortTypeEditor(String category, boolean front) {
		addEditorToCategory(category, createPortPartPortTypeEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createPortPartPortTypeEditor() {
		return new de.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
						.getPortPart_PortType());

	}
	/**
	 * @generated
	 */
	protected void addPortPartComponentPartEditor(String category, boolean front) {
		addEditorToCategory(category, createPortPartComponentPartEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createPortPartComponentPartEditor() {
		return new de.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
						.getPortPart_ComponentPart());

	}
	/**
	 * @generated
	 */
	protected void addPortPartCoordinationProtocolOccurenceEditor(
			String category, boolean front) {
		addEditorToCategory(category,
				createPortPartCoordinationProtocolOccurenceEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createPortPartCoordinationProtocolOccurenceEditor() {
		return new de.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
						.getPortPart_CoordinationProtocolOccurence());

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public PortPartEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.muml.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
						.getPortPart());
	}

	/**
	 * @generated
	 */
	public static class Factory
			implements
				de.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor(
				String tab) {
			return new PortPartEditor(tab);
		}
	}

}
