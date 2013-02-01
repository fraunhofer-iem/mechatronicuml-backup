package de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.custom.edit.parts;

import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ComponentStoryPattern2EditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ControllerExchangeNodeControllerExchangeNodeCompartmentEditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ControllerExchangeNodeEditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.policies.ComponentStoryPatternItemSemanticEditPolicy;

public class CustomComponentStoryPattern2EditPart extends
		ComponentStoryPattern2EditPart {

	public CustomComponentStoryPattern2EditPart(View view) {
		super(view);

		EditPolicy resizePolicy = new NonResizableEditPolicy() {
			@Override
			protected Command getMoveCommand(ChangeBoundsRequest request) {
				return UnexecutableCommand.INSTANCE;
			}

			@Override
			public boolean isDragAllowed() {
				return false;
			}
		};

		installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE, resizePolicy);
	}

	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ComponentStoryPatternItemSemanticEditPolicy() {
					protected Command getSemanticCommand(
							IEditCommandRequest request) {
						if (request instanceof DestroyRequest) {
							return null;
						}
						return super.getSemanticCommand(request);
					}

				});

	}

	//needed to display pattern and componentVariable correctly at reopening
	@Override
	public void refresh() {
		super.refresh();
//		updateFigure();
	}
	
	private void updateFigure(){
		ControllerExchangeNodeControllerExchangeNodeCompartmentEditPart compartmentEditPart = (ControllerExchangeNodeControllerExchangeNodeCompartmentEditPart) this.getParent();
		ControllerExchangeNodeEditPart controllerExchangeNodeEditPart = (ControllerExchangeNodeEditPart) compartmentEditPart
				.getParent();

		RectangleFigure patternRectangle = controllerExchangeNodeEditPart
				.getPrimaryShape()
				.getFigureControllerExchangeNodePatternContainer();
		if (!patternRectangle.getChildren().isEmpty()) {
			ResizableCompartmentFigure patternCompartment = (ResizableCompartmentFigure) patternRectangle
					.getChildren().get(0);
			
			//add the Pattern figure to the StoryNode's compartment
			patternCompartment.add(this.getFigure(), BorderLayout.CENTER);
		}
	}

}
