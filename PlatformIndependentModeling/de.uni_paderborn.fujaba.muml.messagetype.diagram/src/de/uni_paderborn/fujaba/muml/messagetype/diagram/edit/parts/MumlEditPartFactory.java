package de.uni_paderborn.fujaba.muml.messagetype.diagram.edit.parts;

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
			switch (de.uni_paderborn.fujaba.muml.messagetype.diagram.part.MumlVisualIDRegistry
					.getVisualID(view)) {

			case de.uni_paderborn.fujaba.muml.messagetype.diagram.edit.parts.MessageInterfaceDiagramEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.messagetype.diagram.edit.parts.MessageInterfaceDiagramEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.messagetype.diagram.edit.parts.MessageTypeRepositoryEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.messagetype.diagram.edit.parts.MessageTypeRepositoryEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.messagetype.diagram.edit.parts.MessageTypeRepositoryNameEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.messagetype.diagram.edit.parts.MessageTypeRepositoryNameEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.messagetype.diagram.edit.parts.MessageTypeEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.messagetype.diagram.edit.parts.MessageTypeEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.messagetype.diagram.edit.parts.MessageTypeNameEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.messagetype.diagram.edit.parts.MessageTypeNameEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.messagetype.diagram.edit.parts.ParameterEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.messagetype.diagram.edit.parts.ParameterEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.messagetype.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.messagetype.diagram.edit.parts.WrappingLabelEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.messagetype.diagram.edit.parts.MessageTypeRepositoryMessageTypesCompartmentEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.messagetype.diagram.edit.parts.MessageTypeRepositoryMessageTypesCompartmentEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.messagetype.diagram.edit.parts.MessageTypeParametersCompartmentEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.messagetype.diagram.edit.parts.MessageTypeParametersCompartmentEditPart(
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
