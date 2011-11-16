package de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.custom.edit.policies;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;

import de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.policies.StructuredComponentDiagramCanonicalEditPolicy;

public class CustomStructuredComponentDiagramCanonicalEditPolicy extends
		StructuredComponentDiagramCanonicalEditPolicy {

	@Override
	public boolean isTopLevelCanonical() {
		return false;
	}

}
