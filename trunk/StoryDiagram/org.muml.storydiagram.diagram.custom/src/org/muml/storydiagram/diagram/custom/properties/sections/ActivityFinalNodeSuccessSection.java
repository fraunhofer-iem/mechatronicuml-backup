package org.muml.storydiagram.diagram.custom.properties.sections;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.muml.storydiagram.activities.ActivitiesPackage;

import de.upb.swt.core.ui.properties.sections.AbstractCheckboxSection;

public class ActivityFinalNodeSuccessSection extends AbstractCheckboxSection {
	@Override
	protected EStructuralFeature getFeature() {
		return ActivitiesPackage.Literals.ACTIVITY_FINAL_NODE__SUCCESS;
	}

	@Override
	protected String getLabelText() {
		return "Success";
	}
}
