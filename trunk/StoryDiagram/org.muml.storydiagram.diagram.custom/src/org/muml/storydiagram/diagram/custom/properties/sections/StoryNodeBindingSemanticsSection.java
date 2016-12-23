package org.muml.storydiagram.diagram.custom.properties.sections;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.muml.storydiagram.activities.StoryNode;
import org.muml.storydiagram.patterns.BindingSemantics;
import org.muml.storydiagram.patterns.PatternsPackage;

import de.upb.swt.core.ui.properties.sections.AbstractRadioGroupSection;

public class StoryNodeBindingSemanticsSection extends AbstractRadioGroupSection<BindingSemantics> {
	@Override
	protected String getLabelText() {
		return "Binding Semantics";
	}

	@Override
	protected EObject getElement() {
		StoryNode storyNode = (StoryNode) super.getElement();
		if (storyNode != null) {
			return storyNode.getStoryPattern();
		}
		return super.getElement();
	}

	@Override
	protected EStructuralFeature getFeature() {
		return PatternsPackage.Literals.STORY_PATTERN__BINDING_SEMANTICS;
	}

	@Override
	protected List<BindingSemantics> getValues() {
		return BindingSemantics.VALUES;
	}
}
