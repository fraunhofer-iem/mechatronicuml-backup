package org.muml.pim.messagetype.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;
import org.muml.pim.messagetype.diagram.part.MumlVisualIDRegistry;

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
			switch (MumlVisualIDRegistry.getVisualID(view)) {

			case MessageInterfaceDiagramEditPart.VISUAL_ID:
				return new MessageInterfaceDiagramEditPart(view);

			case MessageTypeRepositoryEditPart.VISUAL_ID:
				return new MessageTypeRepositoryEditPart(view);

			case MessageTypeRepositoryNameEditPart.VISUAL_ID:
				return new MessageTypeRepositoryNameEditPart(view);

			case MessageTypeEditPart.VISUAL_ID:
				return new MessageTypeEditPart(view);

			case MessageTypeNameEditPart.VISUAL_ID:
				return new MessageTypeNameEditPart(view);

			case ParameterEditPart.VISUAL_ID:
				return new ParameterEditPart(view);

			case WrappingLabelEditPart.VISUAL_ID:
				return new WrappingLabelEditPart(view);

			case MessageTypeRepositoryMessageTypesCompartmentEditPart.VISUAL_ID:
				return new MessageTypeRepositoryMessageTypesCompartmentEditPart(view);

			case MessageTypeParametersCompartmentEditPart.VISUAL_ID:
				return new MessageTypeParametersCompartmentEditPart(view);
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
