package org.muml.pim.operationrepository.diagram.edit.parts;

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
			switch (org.muml.pim.operationrepository.diagram.part.MumlVisualIDRegistry
					.getVisualID(view)) {

			case org.muml.pim.operationrepository.diagram.edit.parts.ModelElementCategoryEditPart.VISUAL_ID:
				return new org.muml.pim.operationrepository.diagram.edit.parts.ModelElementCategoryEditPart(
						view);

			case org.muml.pim.operationrepository.diagram.edit.parts.OperationRepositoryEditPart.VISUAL_ID:
				return new org.muml.pim.operationrepository.diagram.edit.parts.OperationRepositoryEditPart(
						view);

			case org.muml.pim.operationrepository.diagram.edit.parts.OperationRepositoryNameEditPart.VISUAL_ID:
				return new org.muml.pim.operationrepository.diagram.edit.parts.OperationRepositoryNameEditPart(
						view);

			case org.muml.pim.operationrepository.diagram.edit.parts.OperationEditPart.VISUAL_ID:
				return new org.muml.pim.operationrepository.diagram.edit.parts.OperationEditPart(view);

			case org.muml.pim.operationrepository.diagram.edit.parts.OperationNameEditPart.VISUAL_ID:
				return new org.muml.pim.operationrepository.diagram.edit.parts.OperationNameEditPart(
						view);

			case org.muml.pim.operationrepository.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID:
				return new org.muml.pim.operationrepository.diagram.edit.parts.WrappingLabelEditPart(
						view);

			case org.muml.pim.operationrepository.diagram.edit.parts.ParameterEditPart.VISUAL_ID:
				return new org.muml.pim.operationrepository.diagram.edit.parts.ParameterEditPart(view);

			case org.muml.pim.operationrepository.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID:
				return new org.muml.pim.operationrepository.diagram.edit.parts.WrappingLabel2EditPart(
						view);

			case org.muml.pim.operationrepository.diagram.edit.parts.OperationRepositoryOperationCompartmentEditPart.VISUAL_ID:
				return new org.muml.pim.operationrepository.diagram.edit.parts.OperationRepositoryOperationCompartmentEditPart(
						view);

			case org.muml.pim.operationrepository.diagram.edit.parts.OperationParametersCompartmentEditPart.VISUAL_ID:
				return new org.muml.pim.operationrepository.diagram.edit.parts.OperationParametersCompartmentEditPart(
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
