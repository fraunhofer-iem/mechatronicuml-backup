package de.uni_paderborn.fujaba.muml.properties.instance.editor;

/**
 * @generated
 */
public class CoordinationProtocolInstanceEditor
		extends
			org.storydriven.core.properties.core.editor.NamedElementEditor {

	/**
	 * @generated
	 */
	public CoordinationProtocolInstanceEditor(
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

		addCoordinationProtocolInstancePortInstancesEditor(
				"de.fujaba.properties.category.Lists", true);

		addCoordinationProtocolInstanceCoordinationProtocolOccurrenceEditor(
				null, true);

	}

	/**
	 * @generated
	 */
	protected void addCoordinationProtocolInstancePortInstancesEditor(
			String category, boolean front) {
		addEditorToCategory(category,
				createCoordinationProtocolInstancePortInstancesEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createCoordinationProtocolInstancePortInstancesEditor() {
		return new de.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
						.getCoordinationProtocolInstance_PortInstances());

	}
	/**
	 * @generated
	 */
	protected void addCoordinationProtocolInstanceCoordinationProtocolOccurrenceEditor(
			String category, boolean front) {
		addEditorToCategory(
				category,
				createCoordinationProtocolInstanceCoordinationProtocolOccurrenceEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createCoordinationProtocolInstanceCoordinationProtocolOccurrenceEditor() {
		return new de.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
						.getCoordinationProtocolInstance_CoordinationProtocolOccurrence());

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public CoordinationProtocolInstanceEditor() {
		this(
				de.uni_paderborn.fujaba.muml.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
						.getCoordinationProtocolInstance());
	}

	/**
	 * @generated
	 */
	public static class Factory
			implements
				de.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor() {
			return new CoordinationProtocolInstanceEditor();
		}
	}

}
