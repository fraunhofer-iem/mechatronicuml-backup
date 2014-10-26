package de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.custom.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.ActivityActivityCompartmentEditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.ActivityEdgeGuardEditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.ActivityEditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.ActivityFinalNodeEditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.ActivityNameEditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.AssemblyVariableEditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.AssemblyVariableNameEditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.ComponentStoryDiagramEditPartFactory;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.ComponentStoryNodeComponentStoryNodeCompartmentEditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.ComponentStoryNodeEditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.ComponentStoryPattern2EditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.ComponentStoryPatternComponentStoryPatternCompartment2EditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.ComponentStoryPatternComponentStoryPatternCompartmentEditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.ComponentStoryPatternEditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.ComponentStoryRuleEditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.ComponentVariableComponentVariableCompartmentEditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.ComponentVariableEditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.ComponentVariableOperatorEditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.DelegationVariableEditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.DelegationVariableNameEditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.MultiPortVariable2EditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.MultiPortVariableEditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.PortVariableOperator2EditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.PortVariableOperator3EditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.PortVariableOperator4EditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.PortVariableOperatorEditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.WrappingLabel2EditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.WrappingLabel4EditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.WrappingLabel6EditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.WrappingLabelEditPart;

public class CustomComponentStoryDiagramEditPartFactory extends
		ComponentStoryDiagramEditPartFactory {

	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.part.ComponentStoryDiagramVisualIDRegistry
					.getVisualID(view)) {
			
			case ComponentStoryRuleEditPart.VISUAL_ID:
				return new CustomComponentStoryRuleEditPart(view);

			case ActivityEditPart.VISUAL_ID:
				return new CustomActivityEditPart(view);
			case ActivityActivityCompartmentEditPart.VISUAL_ID:
				return new CustomActivityActivityCompartmentEditPart(view);
			case ActivityNameEditPart.VISUAL_ID:
				return new CustomActivityNameEditPart(view);

			case ActivityEdgeGuardEditPart.VISUAL_ID:
				return new CustomActivityEdgeGuardEditPart(view);
			case WrappingLabel4EditPart.VISUAL_ID:
				return new CustomWrappingLabel4EditPart(view);

			case ActivityFinalNodeEditPart.VISUAL_ID:
				return new CustomActivityFinalNodeEditPart(view);

			case ComponentStoryNodeEditPart.VISUAL_ID:
				return new CustomComponentStoryNodeEditPart(view);
			case ComponentStoryNodeComponentStoryNodeCompartmentEditPart.VISUAL_ID:
				return new CustomComponentStoryNodeComponentStoryNodeCompartmentEditPart(
						view);	
			case ComponentStoryPatternEditPart.VISUAL_ID:
				return new CustomComponentStoryPatternEditPart(view);
			case ComponentStoryPatternComponentStoryPatternCompartmentEditPart.VISUAL_ID:
				return new CustomComponentStoryPatternComponentStoryPatternCompartmentEditPart(view);

			case ComponentStoryPattern2EditPart.VISUAL_ID:
				return new CustomComponentStoryPattern2EditPart(view);
			case ComponentStoryPatternComponentStoryPatternCompartment2EditPart.VISUAL_ID:
				return new CustomComponentStoryPatternComponentStoryPatternCompartment2EditPart(view);
				
			case ComponentVariableEditPart.VISUAL_ID:
				return new CustomComponentVariableEditPart(view);
			case ComponentVariableOperatorEditPart.VISUAL_ID:
				return new CustomComponentVariableOperatorEditPart(view);
				
			case ComponentVariableComponentVariableCompartmentEditPart.VISUAL_ID:
				return new CustomComponentVariableComponentVariableCompartmentEditPart(view);

			case WrappingLabelEditPart.VISUAL_ID:
				return new CustomWrappingLabelEditPart(view);
			case WrappingLabel6EditPart.VISUAL_ID:
				return new CustomWrappingLabel6EditPart(view);

				
			case MultiPortVariableEditPart.VISUAL_ID:
				return new CustomMultiPortVariableEditPart(view);
			case PortVariableOperatorEditPart.VISUAL_ID:
				return new CustomPortVariableOperatorEditPart(view);
			case MultiPortVariable2EditPart.VISUAL_ID:
				return new CustomMultiPortVariable2EditPart(view);
			case PortVariableOperator3EditPart.VISUAL_ID:
				return new CustomPortVariableOperator3EditPart(view);
				
			case PortVariableOperator2EditPart.VISUAL_ID:
				return new CustomPortVariableOperator2EditPart(view);
			case PortVariableOperator4EditPart.VISUAL_ID:
				return new CustomPortVariableOperator4EditPart(view);

			case AssemblyVariableEditPart.VISUAL_ID:
				return new CustomAssemblyVariableEditPart(view);
			case AssemblyVariableNameEditPart.VISUAL_ID:
				return new CustomAssemblyVariableNameEditPart(view);
			case DelegationVariableEditPart.VISUAL_ID:
				return new CustomDelegationVariableEditPart(view);
			case DelegationVariableNameEditPart.VISUAL_ID:
				return new CustomDelegationVariableNameEditPart(view);

			}
		}
		return super.createEditPart(context, model);

	}
}
