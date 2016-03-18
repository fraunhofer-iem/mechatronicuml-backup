package de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class HardwareEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareVisualIDRegistry
					.getVisualID(view)) {

			case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPlatformEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPlatformEditPart(view);

			case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPlatform2EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPlatform2EditPart(view);

			case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.WrappingLabelEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.BusEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.BusEditPart(view);

			case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.WrappingLabel2EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.WrappingLabel3EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.NetworkBridgeEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.NetworkBridgeEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.WrappingLabel4EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.WrappingLabel4EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPlatformPartEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPlatformPartEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPlatformPartNameEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPlatformPartNameEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.WrappingLabel5EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.WrappingLabel5EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.WrappingLabel6EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.WrappingLabel6EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPortPartEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPortPartEditPart(view);

			case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPortLabelEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPortLabelEditPart(view);

			case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.DelegationHWPortEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.DelegationHWPortEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.ResourcePartEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.ResourcePartEditPart(view);

			case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.ResourcePartNameEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.ResourcePartNameEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.WrappingLabel7EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.WrappingLabel7EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.WrappingLabel8EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.WrappingLabel8EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.WrappingLabel9EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.WrappingLabel9EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.WrappingLabel10EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.WrappingLabel10EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPlatformHWPlatformCompartmentEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPlatformHWPlatformCompartmentEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.NetworkConnectorEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.NetworkConnectorEditPart(
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
