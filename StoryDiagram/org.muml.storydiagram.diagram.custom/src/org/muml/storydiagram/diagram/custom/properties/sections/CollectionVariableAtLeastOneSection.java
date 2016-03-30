package org.muml.storydiagram.diagram.custom.properties.sections;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.muml.storydiagram.patterns.PatternsPackage;

import de.upb.swt.core.ui.properties.sections.AbstractCheckboxSection;

public class CollectionVariableAtLeastOneSection extends AbstractCheckboxSection {
	@Override
	protected EStructuralFeature getFeature() {
		return PatternsPackage.Literals.COLLECTION_VARIABLE__AT_LEAST_ONE;
	}

	@Override
	protected String getLabelText() {
		return "At Least One Match";
	}
}
