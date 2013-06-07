package de.uni_paderborn.fujaba.muml.component.diagram.edit.parts;

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
			switch (de.uni_paderborn.fujaba.muml.component.diagram.part.MumlVisualIDRegistry
					.getVisualID(view)) {

			case de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.ModelElementCategoryEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.ModelElementCategoryEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.AtomicComponentEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.AtomicComponentEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.AtomicComponentNameEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.AtomicComponentNameEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.StaticStructuredComponentEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.StaticStructuredComponentEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.StaticStructuredComponentNameEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.StaticStructuredComponentNameEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.DiscretePortEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.DiscretePortEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.DiscretePortNameEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.DiscretePortNameEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.WrappingLabelEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.ContinuousPortEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.ContinuousPortEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.ContinuousPortNameEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.ContinuousPortNameEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.HybridPortEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.HybridPortEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.HybridPortNameEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.HybridPortNameEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.ComponentPartEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.ComponentPartEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.WrappingLabel2EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.PortPartEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.PortPartEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.PortPartNameEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.PortPartNameEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.CoordinationProtocolOccurrenceEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.CoordinationProtocolOccurrenceEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.WrappingLabel3EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.StaticStructuredComponentComponentCompartmentEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.StaticStructuredComponentComponentCompartmentEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.AssemblyConnectorEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.AssemblyConnectorEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.DelegationConnectorEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.DelegationConnectorEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.PortPartCoordinationProtocolOccurenceEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.PortPartCoordinationProtocolOccurenceEditPart(
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
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
