package de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.custom.edit.policies;

import de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.edit.policies.AtomicComponentDiagramCanonicalEditPolicy;

public class CustomAtomicComponentDiagramCanonicalEditPolicy extends
		AtomicComponentDiagramCanonicalEditPolicy {

	@Override
	public boolean isTopLevelCanonical() {
		return false;
	}

}
