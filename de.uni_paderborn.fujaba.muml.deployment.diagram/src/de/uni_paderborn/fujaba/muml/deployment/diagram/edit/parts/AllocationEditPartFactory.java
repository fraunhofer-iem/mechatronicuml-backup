package de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class AllocationEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (de.uni_paderborn.fujaba.muml.deployment.diagram.part.AllocationVisualIDRegistry
					.getVisualID(view)) {

			case de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.DeploymentEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.DeploymentEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.HardwareNodeEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.HardwareNodeEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.HardwareNodeNameEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.HardwareNodeNameEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.HardwarePortEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.HardwarePortEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.HardwarePortNameEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.HardwarePortNameEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.CommunicationLinkEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.CommunicationLinkEditPart(
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
