package de.uni_paderborn.fujaba.muml.properties.component.editor;

/**
 * @generated
 */
public class CoordinationProtocolPartEditor
		extends
			org.storydriven.core.properties.core.editor.CommentableElementEditor {

	/**
	 * @generated
	 */
	public CoordinationProtocolPartEditor(String tab,
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
			addCoordinationProtocolPartCoordinationProtocolEditor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addCoordinationProtocolPartPortPartsEditor(
					"de.uni_paderborn.fujaba.properties.category.Lists", true);
		}

	}

	/**
	 * @generated
	 */
	protected void addCoordinationProtocolPartCoordinationProtocolEditor(
			String category, boolean front) {
		addEditorToCategory(category,
				createCoordinationProtocolPartCoordinationProtocolEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createCoordinationProtocolPartCoordinationProtocolEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
						.getCoordinationProtocolPart_CoordinationProtocol());

		editor.setTooltipMessage("The coordination protocol (pattern) of this CoordinationProtocolPart.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addCoordinationProtocolPartPortPartsEditor(String category,
			boolean front) {
		addEditorToCategory(category,
				createCoordinationProtocolPartPortPartsEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createCoordinationProtocolPartPortPartsEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
						.getCoordinationProtocolPart_PortParts());

		editor.setTooltipMessage("The discrete port parts that take part in this protocol part.");

		return editor;

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public CoordinationProtocolPartEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.muml.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
						.getCoordinationProtocolPart());
	}

	/**
	 * @generated
	 */
	public static class Factory
			implements
				de.uni_paderborn.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor(
				String tab) {
			return new CoordinationProtocolPartEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"property.tab.general",
							"property.tab.general",
							"property.tab.documentation"}).contains(tab);
		}
	}

}
