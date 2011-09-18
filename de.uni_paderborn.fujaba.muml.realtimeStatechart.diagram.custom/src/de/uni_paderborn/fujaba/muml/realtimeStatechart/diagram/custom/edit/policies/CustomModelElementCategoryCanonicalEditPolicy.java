package de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.custom.edit.policies;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;

import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.policies.ModelElementCategoryCanonicalEditPolicy;

public class CustomModelElementCategoryCanonicalEditPolicy extends
		ModelElementCategoryCanonicalEditPolicy {

	@Override
	protected void refreshSemantic() {
		Collection<IAdaptable> createdConnectionViews = refreshConnections();
		List<IAdaptable> createdViews = new ArrayList<IAdaptable>(createdConnectionViews);
		makeViewsImmutable(createdViews);
	}

}
