package org.muml.pim.componentinstanceconfiguration.diagram.custom.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LayoutManager;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.notation.View;
import org.muml.pim.componentinstanceconfiguration.diagram.custom.edit.policies.CustomDiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartmentItemSemanticEditPolicy;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartmentEditPart;

/**
 * @generated
 */
public class CustomDiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartmentEditPart
		extends DiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartmentEditPart {

	/**
	 * Constructs this EditPart.
	 * 
	 * @param view
	 *            The graphical model.
	 */
	public CustomDiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartmentEditPart(
			View view) {
		super(view);
	}

	@Override
	public IFigure createFigure() {
		ResizableCompartmentFigure result = (ResizableCompartmentFigure) super
				.createFigure();
		LayoutManager layoutManager = result.getContentPane()
				.getLayoutManager();
		if (layoutManager instanceof ConstrainedToolbarLayout) {
			ConstrainedToolbarLayout constrainedToolbarLayout = (ConstrainedToolbarLayout) layoutManager;
			constrainedToolbarLayout.setHorizontal(true);
		}
		
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
				new CustomDiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartmentItemSemanticEditPolicy());
	}
	
}
