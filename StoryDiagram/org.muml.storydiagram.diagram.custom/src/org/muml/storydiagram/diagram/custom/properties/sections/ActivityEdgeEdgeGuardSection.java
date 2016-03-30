package org.muml.storydiagram.diagram.custom.properties.sections;

import java.util.List;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.muml.storydiagram.activities.ActivitiesPackage;
import org.muml.storydiagram.activities.ActivityEdge;
import org.muml.storydiagram.activities.EdgeGuard;
import org.muml.storydiagram.diagram.custom.util.ValidationUtil;

import de.upb.swt.core.ui.properties.sections.AbstractRadioGroupSection;

public class ActivityEdgeEdgeGuardSection extends AbstractRadioGroupSection<EdgeGuard> {
	@Override
	protected String getLabelText() {
		return "Edge Guard";
	}

	@Override
	protected EStructuralFeature getFeature() {
		return ActivitiesPackage.Literals.ACTIVITY_EDGE__GUARD;
	}

	@Override
	protected List<EdgeGuard> getValues() {
		return EdgeGuard.VALUES;
	}

	@Override
	protected boolean isEnabled(EdgeGuard guard) {
		ActivityEdge edge = (ActivityEdge) getElement();
		return ValidationUtil.isValid(edge, guard);
	}
}
