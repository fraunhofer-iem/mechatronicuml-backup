package de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class MumlEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlVisualIDRegistry.getVisualID(view)) {

			case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.ModelElementCategoryEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.ModelElementCategoryEditPart(view);

			case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.CoordinationPatternEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.CoordinationPatternEditPart(view);

			case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.CoordinationPattern2EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.CoordinationPattern2EditPart(view);

			case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.CoordinationPatternNameEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.CoordinationPatternNameEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.RoleEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.RoleEditPart(view);

			case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.RoleNameEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.RoleNameEditPart(view);

			case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.MessageBufferEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.MessageBufferEditPart(view);

			case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.MessageBufferNameEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.MessageBufferNameEditPart(view);

			case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.WrappingLabelEditPart(view);

			case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.WrappingLabel6EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.WrappingLabel6EditPart(view);

			case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.MessageTypeEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.MessageTypeEditPart(view);

			case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.MessageTypeNameEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.MessageTypeNameEditPart(view);

			case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.ParameterEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.ParameterEditPart(view);

			case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.WrappingLabel2EditPart(view);

			case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.ConnectorQualityOfServiceAssumptionsEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.ConnectorQualityOfServiceAssumptionsEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.WrappingLabel3EditPart(view);

			case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.WrappingLabel4EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.WrappingLabel4EditPart(view);

			case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.WrappingLabel5EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.WrappingLabel5EditPart(view);

			case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.CoordinationPatternPatternCompartmentEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.CoordinationPatternPatternCompartmentEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.MessageBufferMessageBufferCompartmentEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.MessageBufferMessageBufferCompartmentEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.MessageTypeParametersCompartmentEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.MessageTypeParametersCompartmentEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.AbstractCoordinationSpecificationRolesEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.AbstractCoordinationSpecificationRolesEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.RoleConnectorEditPart(view);

			case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.DiscreteInteractionEndpointReceiverMessageBufferEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.DiscreteInteractionEndpointReceiverMessageBufferEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.RoleConnectorConnectorQualityOfServiceAssumptionsEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.RoleConnectorConnectorQualityOfServiceAssumptionsEditPart(
						view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
