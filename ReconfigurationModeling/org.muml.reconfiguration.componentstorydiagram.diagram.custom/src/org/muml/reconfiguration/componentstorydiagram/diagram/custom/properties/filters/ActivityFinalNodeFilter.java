package org.muml.reconfiguration.componentstorydiagram.diagram.custom.properties.filters;

import org.eclipse.emf.ecore.EObject;
import org.muml.storydiagram.activities.ActivityFinalNode;
import org.muml.storydiagram.activities.FlowFinalNode;

import de.upb.swt.core.ui.properties.filters.AbstractFilter;

public class ActivityFinalNodeFilter extends AbstractFilter {
	@Override
	protected boolean select(EObject element) {
		return element instanceof ActivityFinalNode && !(element instanceof FlowFinalNode);
	}
}
