package org.muml.pm.hardware.platform.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;
import org.muml.pm.hardware.platform.diagram.part.HardwareVisualIDRegistry;

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
			switch (HardwareVisualIDRegistry.getVisualID(view)) {

			case HWPlatformEditPart.VISUAL_ID:
				return new HWPlatformEditPart(view);

			case HWPlatform2EditPart.VISUAL_ID:
				return new HWPlatform2EditPart(view);

			case WrappingLabelEditPart.VISUAL_ID:
				return new WrappingLabelEditPart(view);

			case BusEditPart.VISUAL_ID:
				return new BusEditPart(view);

			case WrappingLabel2EditPart.VISUAL_ID:
				return new WrappingLabel2EditPart(view);

			case WrappingLabel3EditPart.VISUAL_ID:
				return new WrappingLabel3EditPart(view);

			case NetworkBridgeEditPart.VISUAL_ID:
				return new NetworkBridgeEditPart(view);

			case WrappingLabel4EditPart.VISUAL_ID:
				return new WrappingLabel4EditPart(view);

			case HWPlatformPartEditPart.VISUAL_ID:
				return new HWPlatformPartEditPart(view);

			case HWPlatformPartNameEditPart.VISUAL_ID:
				return new HWPlatformPartNameEditPart(view);

			case WrappingLabel5EditPart.VISUAL_ID:
				return new WrappingLabel5EditPart(view);

			case WrappingLabel6EditPart.VISUAL_ID:
				return new WrappingLabel6EditPart(view);

			case HWPortPartEditPart.VISUAL_ID:
				return new HWPortPartEditPart(view);

			case HWPortLabelEditPart.VISUAL_ID:
				return new HWPortLabelEditPart(view);

			case DelegationHWPortEditPart.VISUAL_ID:
				return new DelegationHWPortEditPart(view);

			case ResourcePartEditPart.VISUAL_ID:
				return new ResourcePartEditPart(view);

			case ResourcePartNameEditPart.VISUAL_ID:
				return new ResourcePartNameEditPart(view);

			case WrappingLabel7EditPart.VISUAL_ID:
				return new WrappingLabel7EditPart(view);

			case WrappingLabel8EditPart.VISUAL_ID:
				return new WrappingLabel8EditPart(view);

			case WrappingLabel9EditPart.VISUAL_ID:
				return new WrappingLabel9EditPart(view);

			case WrappingLabel10EditPart.VISUAL_ID:
				return new WrappingLabel10EditPart(view);

			case HWPlatformHWPlatformCompartmentEditPart.VISUAL_ID:
				return new HWPlatformHWPlatformCompartmentEditPart(view);

			case NetworkConnectorEditPart.VISUAL_ID:
				return new NetworkConnectorEditPart(view);

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
