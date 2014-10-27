package pattern.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import pattern.diagram.part.Pattern2VisualIDRegistry;

/**
 * @generated
 */
public class Pattern2EditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (Pattern2VisualIDRegistry.getVisualID(view)) {

			case ModelElementCategoryEditPart.VISUAL_ID:
				return new ModelElementCategoryEditPart(view);

			case CoordinationPatternEditPart.VISUAL_ID:
				return new CoordinationPatternEditPart(view);

			case CoordinationPattern2EditPart.VISUAL_ID:
				return new CoordinationPattern2EditPart(view);

			case CoordinationPatternPatternCompartmentEditPart.VISUAL_ID:
				return new CoordinationPatternPatternCompartmentEditPart(view);

			case CoordinationPatternPatternCompartment2EditPart.VISUAL_ID:
				return new CoordinationPatternPatternCompartment2EditPart(view);
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
