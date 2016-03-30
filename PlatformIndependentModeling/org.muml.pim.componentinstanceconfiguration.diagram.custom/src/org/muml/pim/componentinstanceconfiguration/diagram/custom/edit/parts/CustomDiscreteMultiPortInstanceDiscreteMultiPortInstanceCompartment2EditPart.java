package org.muml.pim.componentinstanceconfiguration.diagram.custom.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.muml.pim.componentinstanceconfiguration.diagram.custom.edit.policies.CustomDiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartment2ItemSemanticEditPolicy;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartment2EditPart;

/**
 * @generated
 */
public class CustomDiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartment2EditPart
		extends DiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartment2EditPart {

	/**
	 * Constructs this EditPart.
	 * 
	 * @param view
	 *            The graphical model.
	 */
	public CustomDiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartment2EditPart(
			View view) {
		super(view);
	}
	
	@Override
	public IFigure createFigure() {
		ResizableCompartmentFigure result = (ResizableCompartmentFigure) super
				.createFigure();
		
		// Begin: Fix for Mechatronic-UML Bug #116
		result.setBorder(null);
		// End Fix
		
		result.setBackgroundColor(null);
		result.setOpaque(false);
		//result.setTransparency(100);


		return result;
	}
	

	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		removeEditPolicy(EditPolicyRoles.SEMANTIC_ROLE);
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new CustomDiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartment2ItemSemanticEditPolicy());
	}
}
