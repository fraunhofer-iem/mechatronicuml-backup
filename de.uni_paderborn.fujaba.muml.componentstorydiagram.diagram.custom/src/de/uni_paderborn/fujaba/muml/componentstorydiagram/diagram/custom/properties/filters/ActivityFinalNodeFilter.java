package de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.custom.properties.filters;

import org.eclipse.emf.ecore.EObject;
import org.storydriven.storydiagrams.activities.ActivityFinalNode;
import org.storydriven.storydiagrams.activities.FlowFinalNode;

import de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.custom.properties.AbstractFilter;

public class ActivityFinalNodeFilter extends AbstractFilter {
	@Override
	protected boolean select(EObject element) {
		return element instanceof ActivityFinalNode && !(element instanceof FlowFinalNode);
	}
}
