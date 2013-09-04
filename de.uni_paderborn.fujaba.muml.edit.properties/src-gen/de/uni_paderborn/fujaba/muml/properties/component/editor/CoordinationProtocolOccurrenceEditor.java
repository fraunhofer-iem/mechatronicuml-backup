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
	public CoordinationProtocolOccurrenceEditor(
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

		addCoordinationProtocolOccurrencePortPartsEditor(
				"de.fujaba.properties.category.Lists", true);

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
		return new de.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
						.getCoordinationProtocolOccurrence_PortParts());

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public CoordinationProtocolOccurrenceEditor() {
		this(
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
		public de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor() {
			return new CoordinationProtocolOccurrenceEditor();
		}
	}

}
