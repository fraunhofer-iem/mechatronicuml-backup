package de.uni_paderborn.fujaba.muml.properties.protocol.editor;

public class AbstractCoordinationSpecificationEditor
		extends
			de.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public AbstractCoordinationSpecificationEditor() {
	}

	/**
	 * @generated
	 */
	public void initialize() {

		addAbstractCoordinationSpecificationRolesEditor(null, true);

		addAbstractCoordinationSpecificationRoleConnectorEditor(null, true);

		super.initialize();
	}

	/**
	 * @generated
	 */
	protected void addAbstractCoordinationSpecificationRolesEditor(
			String category, boolean front) {
		addEditorToCategory(category,
				createAbstractCoordinationSpecificationRolesEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createAbstractCoordinationSpecificationRolesEditor() {
		return new de.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage.eINSTANCE
						.getAbstractCoordinationSpecification_Roles());

	}
	/**
	 * @generated
	 */
	protected void addAbstractCoordinationSpecificationRoleConnectorEditor(
			String category, boolean front) {
		addEditorToCategory(category,
				createAbstractCoordinationSpecificationRoleConnectorEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createAbstractCoordinationSpecificationRoleConnectorEditor() {
		return new de.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
				de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage.eINSTANCE
						.getAbstractCoordinationSpecification_RoleConnector());

	}

	//
	// Overwritten property settings
	//

}
