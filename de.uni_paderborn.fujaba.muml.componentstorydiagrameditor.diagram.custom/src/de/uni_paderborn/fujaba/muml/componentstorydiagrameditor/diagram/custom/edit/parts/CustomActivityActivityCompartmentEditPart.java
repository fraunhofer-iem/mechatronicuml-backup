package de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.custom.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ActivityActivityCompartmentEditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.policies.ActivityActivityCompartmentItemSemanticEditPolicy;

public class CustomActivityActivityCompartmentEditPart extends
		ActivityActivityCompartmentEditPart {

	public CustomActivityActivityCompartmentEditPart(View view) {
		super(view);
	}
	
	@Override
	public IFigure createFigure(){
		IFigure result = super.createFigure();
		
		result.setBorder(null);
		
		return result;
	}
	
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new ActivityActivityCompartmentItemSemanticEditPolicy() {
					protected Command getSemanticCommand(
							IEditCommandRequest request) {
						if (request instanceof DestroyRequest) {
							return null;
						}
						return super.getSemanticCommand(request);
					}

				});

	}
	

}
