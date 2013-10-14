package de.uni_paderborn.fujaba.muml.properties.component.editor;

/**
 * @generated
 */
public class CoordinationProtocolOccurrenceEditor
		extends
			org.storydriven.core.properties.core.editor.CommentableElementEditor {

	/**
	 * @generated
	 */
	public CoordinationProtocolOccurrenceEditor(String tab,
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

		addSubCategory("de.fujaba.properties.category.Lists", "Lists",
				org.eclipse.swt.SWT.HORIZONTAL, true);

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addCoordinationProtocolOccurrenceCoordinationProtocolEditor(null,
					true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addCoordinationProtocolOccurrencePortPartsEditor(
					"de.fujaba.properties.category.Lists", true);
		}

	}

	/**
	 * @generated
	 */
	protected void addCoordinationProtocolOccurrenceCoordinationProtocolEditor(
			String category, boolean front) {
		addEditorToCategory(
				category,
				createCoordinationProtocolOccurrenceCoordinationProtocolEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createCoordinationProtocolOccurrenceCoordinationProtocolEditor() {
		de.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
						.getCoordinationProtocolOccurrence_CoordinationProtocol());

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addCoordinationProtocolOccurrencePortPartsEditor(
			String category, boolean front) {
		addEditorToCategory(category,
				createCoordinationProtocolOccurrencePortPartsEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createCoordinationProtocolOccurrencePortPartsEditor() {
		de.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
						.getCoordinationProtocolOccurrence_PortParts());

		return editor;

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public CoordinationProtocolOccurrenceEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.muml.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
						.getCoordinationProtocolOccurrence());
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
			return new CoordinationProtocolOccurrenceEditor(tab);
		}
	}

}
