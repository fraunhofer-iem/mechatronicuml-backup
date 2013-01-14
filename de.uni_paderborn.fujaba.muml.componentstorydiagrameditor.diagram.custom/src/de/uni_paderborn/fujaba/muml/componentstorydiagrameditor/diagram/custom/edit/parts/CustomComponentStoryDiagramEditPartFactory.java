package de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.custom.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ActivityActivityCompartmentEditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ActivityEdgeGuardEditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ActivityEditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ActivityFinalNodeEditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ActivityNameEditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.AssemblyVariableEditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.AssemblyVariableNameEditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ComponentStoryDiagramEditPartFactory;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ComponentStoryNodeComponentStoryNodeCompartmentEditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ComponentStoryNodeEditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ComponentStoryPatternComponentStoryPatternCompartmentEditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ComponentStoryPatternEditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ComponentStoryRuleEditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ComponentVariableComponentVariableCompartmentEditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ComponentVariableEditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ComponentVariableNameEditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ComponentVariableOperatorEditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.DelegationVariableEditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.DelegationVariableNameEditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.MultiPortVariable2EditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.MultiPortVariableEditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.MultiPortVariableName2EditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.MultiPortVariableNameEditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.PartVariableEditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.PortVariableOperator2EditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.PortVariableOperator3EditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.PortVariableOperator4EditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.PortVariableOperatorEditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.SinglePortVariable2EditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.SinglePortVariable3EditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.SinglePortVariableEditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.SinglePortVariableName2EditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.SinglePortVariableNameEditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.WrappingLabel2EditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.WrappingLabel4EditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.WrappingLabelEditPart;

public class CustomComponentStoryDiagramEditPartFactory extends
		ComponentStoryDiagramEditPartFactory {

	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.ComponentStoryDiagramVisualIDRegistry
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

			case ComponentVariableEditPart.VISUAL_ID:
				return new CustomComponentVariableEditPart(view);
			case ComponentVariableOperatorEditPart.VISUAL_ID:
				return new CustomComponentVariableOperatorEditPart(view);
			case ComponentVariableNameEditPart.VISUAL_ID:
				return new CustomComponentVariableNameEditPart(view);
				
			case ComponentVariableComponentVariableCompartmentEditPart.VISUAL_ID:
				return new CustomComponentVariableComponentVariableCompartmentEditPart(view);

			case PartVariableEditPart.VISUAL_ID:
				return new CustomPartVariableEditPart(view);
			case WrappingLabelEditPart.VISUAL_ID:
				return new CustomWrappingLabelEditPart(view);
			case WrappingLabel2EditPart.VISUAL_ID:
				return new CustomWrappingLabel2EditPart(view);

//			case PortVariableEditPart.VISUAL_ID:
//				return new CustomPortVariableEditPart(view);
//			case PortVariable2EditPart.VISUAL_ID:
//				return new CustomPortVariable2EditPart(view);
//			case WrappingLabel5EditPart.VISUAL_ID:
//				return new CustomWrappingLabel5EditPart(view);
//			case PortVariableNameEditPart.VISUAL_ID:
//				return new CustomPortVariableNameEditPart(view);
//			case PortVariableName2EditPart.VISUAL_ID:
//				return new CustomPortVariableName2EditPart(view);
//			case WrappingLabel3EditPart.VISUAL_ID:
//				return new CustomWrappingLabel3EditPart(view);
				
			case MultiPortVariableEditPart.VISUAL_ID:
				return new CustomMultiPortVariableEditPart(view);
			case MultiPortVariableNameEditPart.VISUAL_ID:
				return new CustomMultiPortVariableNameEditPart(view);
			case PortVariableOperatorEditPart.VISUAL_ID:
				return new CustomPortVariableOperatorEditPart(view);
			case MultiPortVariable2EditPart.VISUAL_ID:
				return new CustomMultiPortVariable2EditPart(view);
			case MultiPortVariableName2EditPart.VISUAL_ID:
				return new CustomMultiPortVariableName2EditPart(view);
			case PortVariableOperator3EditPart.VISUAL_ID:
				return new CustomPortVariableOperator3EditPart(view);
				
			case SinglePortVariableEditPart.VISUAL_ID:
				return new CustomSinglePortVariableEditPart(view);
			case SinglePortVariable2EditPart.VISUAL_ID:
				return new CustomSinglePortVariable2EditPart(view);
			case SinglePortVariableNameEditPart.VISUAL_ID:
				return new CustomSinglePortVariableNameEditPart(view);
			case PortVariableOperator2EditPart.VISUAL_ID:
				return new CustomPortVariableOperator2EditPart(view);
			case SinglePortVariable3EditPart.VISUAL_ID:
				return new CustomSinglePortVariable3EditPart(view);
			case SinglePortVariableName2EditPart.VISUAL_ID:
				return new CustomSinglePortVariableName2EditPart(view);
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
