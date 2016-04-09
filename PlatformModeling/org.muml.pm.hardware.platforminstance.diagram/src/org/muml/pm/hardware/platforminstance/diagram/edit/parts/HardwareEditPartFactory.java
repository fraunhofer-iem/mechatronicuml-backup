package org.muml.pm.hardware.platforminstance.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;
import org.muml.pm.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry;

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

			case HWPlatformInstanceConfigurationEditPart.VISUAL_ID:
				return new HWPlatformInstanceConfigurationEditPart(view);

			case HWPlatformInstanceEditPart.VISUAL_ID:
				return new HWPlatformInstanceEditPart(view);

			case HWPlatformInstanceNameEditPart.VISUAL_ID:
				return new HWPlatformInstanceNameEditPart(view);

			case HWPlatformInstanceConfiguration2EditPart.VISUAL_ID:
				return new HWPlatformInstanceConfiguration2EditPart(view);

			case HWPlatformInstance2EditPart.VISUAL_ID:
				return new HWPlatformInstance2EditPart(view);

			case HWPlatformInstanceName2EditPart.VISUAL_ID:
				return new HWPlatformInstanceName2EditPart(view);

			case DelegationHWPortInstanceEditPart.VISUAL_ID:
				return new DelegationHWPortInstanceEditPart(view);

			case HWPortLabelEditPart.VISUAL_ID:
				return new HWPortLabelEditPart(view);

			case StructuredResourceInstanceEditPart.VISUAL_ID:
				return new StructuredResourceInstanceEditPart(view);

			case StructuredResourceInstanceNameEditPart.VISUAL_ID:
				return new StructuredResourceInstanceNameEditPart(view);

			case WrappingLabel3EditPart.VISUAL_ID:
				return new WrappingLabel3EditPart(view);

			case WrappingLabel4EditPart.VISUAL_ID:
				return new WrappingLabel4EditPart(view);

			case WrappingLabel5EditPart.VISUAL_ID:
				return new WrappingLabel5EditPart(view);

			case WrappingLabel6EditPart.VISUAL_ID:
				return new WrappingLabel6EditPart(view);

			case HWPortInstanceEditPart.VISUAL_ID:
				return new HWPortInstanceEditPart(view);

			case HWPortLabel2EditPart.VISUAL_ID:
				return new HWPortLabel2EditPart(view);

			case ActuatorInstanceEditPart.VISUAL_ID:
				return new ActuatorInstanceEditPart(view);

			case ActuatorInstanceNameEditPart.VISUAL_ID:
				return new ActuatorInstanceNameEditPart(view);

			case WrappingLabel7EditPart.VISUAL_ID:
				return new WrappingLabel7EditPart(view);

			case WrappingLabel8EditPart.VISUAL_ID:
				return new WrappingLabel8EditPart(view);

			case SensorInstanceEditPart.VISUAL_ID:
				return new SensorInstanceEditPart(view);

			case SensorInstanceNameEditPart.VISUAL_ID:
				return new SensorInstanceNameEditPart(view);

			case WrappingLabel9EditPart.VISUAL_ID:
				return new WrappingLabel9EditPart(view);

			case WrappingLabel10EditPart.VISUAL_ID:
				return new WrappingLabel10EditPart(view);

			case BusInstanceEditPart.VISUAL_ID:
				return new BusInstanceEditPart(view);

			case WrappingLabel11EditPart.VISUAL_ID:
				return new WrappingLabel11EditPart(view);

			case WrappingLabel12EditPart.VISUAL_ID:
				return new WrappingLabel12EditPart(view);

			case NetworkBridgeInstanceEditPart.VISUAL_ID:
				return new NetworkBridgeInstanceEditPart(view);

			case WrappingLabel13EditPart.VISUAL_ID:
				return new WrappingLabel13EditPart(view);

			case HWPlatformInstanceHWPlatformCompartmentEditPart.VISUAL_ID:
				return new HWPlatformInstanceHWPlatformCompartmentEditPart(view);

			case HWPlatformInstanceConfigurationHWPInstanceConfigurationContentsCompartmentEditPart.VISUAL_ID:
				return new HWPlatformInstanceConfigurationHWPInstanceConfigurationContentsCompartmentEditPart(view);

			case HWPlatformInstanceHWPlatformCompartment2EditPart.VISUAL_ID:
				return new HWPlatformInstanceHWPlatformCompartment2EditPart(view);

			case NetworkConnectorInstanceEditPart.VISUAL_ID:
				return new NetworkConnectorInstanceEditPart(view);

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
