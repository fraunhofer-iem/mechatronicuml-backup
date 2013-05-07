package de.uni_paderborn.fujaba.muml.properties.protocol.section;

public class ConnectorQualityOfServiceAssumptionsMessageLossPossibleSection
		extends
			de.upb.swt.core.ui.properties.sections.AbstractCheckboxSection {

	@Override
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage.eINSTANCE
				.getConnectorQualityOfServiceAssumptions_MessageLossPossible();
	}

	@Override
	protected String getLabelText() {
		return "MessageLossPossible";
	}

}
