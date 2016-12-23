package org.muml.storydiagram.diagram.custom.edit.parts;

import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.muml.storydiagram.diagram.custom.edit.policies.CompartmentEditPolicy;
import org.muml.storydiagram.diagram.edit.parts.StoryPatternStoryPatternConstraintsCompartmentEditPart;
import org.muml.storydiagram.patterns.PatternsPackage;

public class CustomStoryPatternConstraintsCompartmentEditPart extends
		StoryPatternStoryPatternConstraintsCompartmentEditPart {
	public CustomStoryPatternConstraintsCompartmentEditPart(View view) {
		super(view);
	}

	@Override
	public IFigure createFigure() {
		ResizableCompartmentFigure rcf = (ResizableCompartmentFigure) super.createFigure();
		FlowLayout layout = new FlowLayout();
		layout.setMajorSpacing(getMapMode().DPtoLP(5));
		layout.setMinorSpacing(getMapMode().DPtoLP(5));
		layout.setHorizontal(false);

		rcf.getContentPane().setLayoutManager(layout);

		rcf.setTitleVisibility(false);

		return rcf;
	}

	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.LAYOUT_ROLE, new CompartmentEditPolicy(
				PatternsPackage.Literals.STORY_PATTERN__CONSTRAINTS));
	}
}
