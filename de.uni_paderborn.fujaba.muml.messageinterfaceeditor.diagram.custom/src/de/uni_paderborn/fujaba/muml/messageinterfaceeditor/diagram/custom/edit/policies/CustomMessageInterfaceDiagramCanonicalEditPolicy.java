package de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.custom.edit.policies;

import de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.edit.policies.MessageInterfaceDiagramCanonicalEditPolicy;

public class CustomMessageInterfaceDiagramCanonicalEditPolicy
		extends MessageInterfaceDiagramCanonicalEditPolicy {

	@Override
	public boolean isTopLevelCanonical() {
		return false;
	}

}