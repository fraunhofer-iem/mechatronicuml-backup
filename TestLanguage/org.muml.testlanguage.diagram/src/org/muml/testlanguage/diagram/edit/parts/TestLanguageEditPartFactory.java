package org.muml.testlanguage.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;
import org.muml.testlanguage.diagram.part.TestLanguageVisualIDRegistry;

/**
 * @generated
 */
public class TestLanguageEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (TestLanguageVisualIDRegistry.getVisualID(view)) {

			case TestCaseEditPart.VISUAL_ID:
				return new TestCaseEditPart(view);

			case NodeEditPart.VISUAL_ID:
				return new NodeEditPart(view);

			case NodeLabelEditPart.VISUAL_ID:
				return new NodeLabelEditPart(view);

			case InputEditPart.VISUAL_ID:
				return new InputEditPart(view);

			case InputNameEditPart.VISUAL_ID:
				return new InputNameEditPart(view);

			case OutputEditPart.VISUAL_ID:
				return new OutputEditPart(view);

			case OutputNameEditPart.VISUAL_ID:
				return new OutputNameEditPart(view);

			case NodeNodeFigureCompartmentEditPart.VISUAL_ID:
				return new NodeNodeFigureCompartmentEditPart(view);

			case OutputTargetsEditPart.VISUAL_ID:
				return new OutputTargetsEditPart(view);

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
