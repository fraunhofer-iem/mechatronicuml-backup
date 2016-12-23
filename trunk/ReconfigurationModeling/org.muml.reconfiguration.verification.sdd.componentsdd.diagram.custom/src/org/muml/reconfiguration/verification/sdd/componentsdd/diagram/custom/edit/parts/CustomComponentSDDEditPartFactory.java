package org.muml.reconfiguration.verification.sdd.componentsdd.diagram.custom.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.AssemblyVariableEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.AssemblyVariableNameEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.ComponentSDDEditPartFactory;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryPatternComponentStoryPatternCompartmentEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryPatternEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryPatternNodeEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryPatternNodePatternNodeContentCompartmentEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryPatternNodeTypeEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.ComponentVariableComponentVariableCompartmentEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.ComponentVariableEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.ComponentVariableOperatorEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.DelegationVariableEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.DelegationVariableNameEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.EdgeEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.LeafNodeEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.MultiPortVariable2EditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.MultiPortVariableEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.PortVariableOperator2EditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.PortVariableOperator3EditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.PortVariableOperator4EditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.PortVariableOperatorEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.WrappingLabel2EditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.part.ComponentSDDVisualIDRegistry;


/**
 * The custom EditPartFactory that creates our overridden EditParts.
 * 
 */
public class CustomComponentSDDEditPartFactory extends ComponentSDDEditPartFactory {

	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;

			switch (ComponentSDDVisualIDRegistry.getVisualID(view)) {
			case LeafNodeEditPart.VISUAL_ID:
				return new CustomLeafNodeEditPart(view);
			case EdgeEditPart.VISUAL_ID:
				return new CustomEdgeEditPart(view);
			case AssemblyVariableEditPart.VISUAL_ID:
				return new CustomAssemblyVariableEditPart(view);
			case ComponentStoryPatternEditPart.VISUAL_ID:
				return new CustomComponentStoryPatternEditPart(view);
			case ComponentStoryPatternComponentStoryPatternCompartmentEditPart.VISUAL_ID:
				return new CustomComponentStoryPatternComponentStoryPatternCompartmentEditPart(view);
			case ComponentVariableComponentVariableCompartmentEditPart.VISUAL_ID:
				return new CustomComponentVariableComponentVariableCompartmentEditPart(view);
			case ComponentVariableOperatorEditPart.VISUAL_ID:
				return new CustomComponentVariableOperatorEditPart(view);
			case ComponentVariableEditPart.VISUAL_ID:
				return new CustomComponentVariableEditPart(view);
			case ComponentStoryPatternNodeEditPart.VISUAL_ID:
				return new CustomPatternNodeEditPart(view);
			case ComponentStoryPatternNodePatternNodeContentCompartmentEditPart.VISUAL_ID:
				return new CustomPatternNodePatternNodeContentCompartmentEditPart(view);
			case MultiPortVariable2EditPart.VISUAL_ID:
				return new CustomMultiPortVariable2EditPart(view);
			case MultiPortVariableEditPart.VISUAL_ID:
				return new CustomMultiPortVariableEditPart(view);
			case PortVariableOperator2EditPart.VISUAL_ID:
				return new CustomPortVariableOperator2EditPart(view);
			case PortVariableOperator3EditPart.VISUAL_ID:
				return new CustomPortVariableOperator3EditPart(view);
			case PortVariableOperator4EditPart.VISUAL_ID:
				return new CustomPortVariableOperator4EditPart(view);
			case PortVariableOperatorEditPart.VISUAL_ID:
				return new CustomPortVariableOperatorEditPart(view);
			case WrappingLabel2EditPart.VISUAL_ID:
				return new CustomWrappingLabel2EditPart(view);
			case AssemblyVariableNameEditPart.VISUAL_ID:
				return new CustomAssemblyVariableNameEditPart(view);
			case DelegationVariableEditPart.VISUAL_ID:
				return new CustomDelegationVariableEditPart(view);
			case DelegationVariableNameEditPart.VISUAL_ID:
				return new CustomDelegationVariableNameEditPart(view);
			};
			
			
		}
		return super.createEditPart(context, model);
	}

}
