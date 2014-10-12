package de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.custom.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.AssemblyVariableEditPart;
import de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.AssemblyVariableNameEditPart;
import de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentSDDEditPartFactory;
import de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryPatternComponentStoryPatternCompartmentEditPart;
import de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryPatternEditPart;
import de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryPatternNodeEditPart;
import de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryPatternNodePatternNodeContentCompartmentEditPart;
import de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryPatternNodeTypeEditPart;
import de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentVariableComponentVariableCompartmentEditPart;
import de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentVariableEditPart;
import de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentVariableOperatorEditPart;
import de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.DelegationVariableEditPart;
import de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.DelegationVariableNameEditPart;
import de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.EdgeEditPart;
import de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.LeafNodeEditPart;
import de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.MultiPortVariable2EditPart;
import de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.MultiPortVariableEditPart;
import de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.PortVariableOperator2EditPart;
import de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.PortVariableOperator3EditPart;
import de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.PortVariableOperator4EditPart;
import de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.PortVariableOperatorEditPart;
import de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.WrappingLabel2EditPart;
import de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDVisualIDRegistry;


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
			case ComponentStoryPatternNodeTypeEditPart.VISUAL_ID:
				return new CustomPatternNodeTypeEditPart(view);
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
