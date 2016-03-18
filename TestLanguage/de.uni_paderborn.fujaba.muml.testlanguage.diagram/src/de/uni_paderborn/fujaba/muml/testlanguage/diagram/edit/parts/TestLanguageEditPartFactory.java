package de.uni_paderborn.fujaba.muml.testlanguage.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

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
			switch (de.uni_paderborn.fujaba.muml.testlanguage.diagram.part.TestLanguageVisualIDRegistry
					.getVisualID(view)) {

			case de.uni_paderborn.fujaba.muml.testlanguage.diagram.edit.parts.TestCaseEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.testlanguage.diagram.edit.parts.TestCaseEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.testlanguage.diagram.edit.parts.NodeEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.testlanguage.diagram.edit.parts.NodeEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.testlanguage.diagram.edit.parts.NodeLabelEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.testlanguage.diagram.edit.parts.NodeLabelEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.testlanguage.diagram.edit.parts.InputEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.testlanguage.diagram.edit.parts.InputEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.testlanguage.diagram.edit.parts.InputNameEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.testlanguage.diagram.edit.parts.InputNameEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.testlanguage.diagram.edit.parts.OutputEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.testlanguage.diagram.edit.parts.OutputEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.testlanguage.diagram.edit.parts.OutputNameEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.testlanguage.diagram.edit.parts.OutputNameEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.testlanguage.diagram.edit.parts.NodeNodeFigureCompartmentEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.testlanguage.diagram.edit.parts.NodeNodeFigureCompartmentEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.testlanguage.diagram.edit.parts.OutputTargetsEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.testlanguage.diagram.edit.parts.OutputTargetsEditPart(
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
