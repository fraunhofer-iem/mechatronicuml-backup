package de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.custom.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LayoutManager;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.custom.edit.policies.CustomDiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartmentItemSemanticEditPolicy;
import de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartmentEditPart;

/**
 * @generated
 */
public class CustomDiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartment2EditPart
		extends DiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartmentEditPart {

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
