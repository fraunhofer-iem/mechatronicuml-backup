package de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.custom.edit.policies;

import de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.policies.StructuredComponentDiagramCanonicalEditPolicy;

public class CustomStructuredComponentDiagramCanonicalEditPolicy extends
		StructuredComponentDiagramCanonicalEditPolicy {

	@Override
	public boolean isTopLevelCanonical() {
		return false;
	}

}
