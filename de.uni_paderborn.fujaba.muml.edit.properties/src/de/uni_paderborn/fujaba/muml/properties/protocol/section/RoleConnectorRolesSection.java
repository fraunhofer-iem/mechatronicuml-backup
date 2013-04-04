package de.uni_paderborn.fujaba.muml.properties.protocol.section;

public class RoleConnectorRolesSection
		extends
			de.upb.swt.core.ui.properties.sections.AbstractComboSection<Object> {

	@Override
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage.eINSTANCE
				.getRoleConnector_Roles();
	}

	@Override
	protected String getLabelText() {
		return "Roles";
	}

	@Override
	protected java.util.List<Object> getItems() {
		return new java.util.ArrayList<Object>();
	}

}
