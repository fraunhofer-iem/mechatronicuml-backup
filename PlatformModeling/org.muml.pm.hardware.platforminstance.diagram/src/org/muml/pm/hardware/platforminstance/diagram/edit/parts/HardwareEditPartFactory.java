package org.muml.pm.hardware.platforminstance.diagram.edit.parts;

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
			switch (org.muml.pm.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
					.getVisualID(view)) {

			case org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceConfigurationEditPart.VISUAL_ID:
				return new org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceConfigurationEditPart(
						view);

			case org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceEditPart.VISUAL_ID:
				return new org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceEditPart(
						view);

			case org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceNameEditPart.VISUAL_ID:
				return new org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceNameEditPart(
						view);

			case org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceConfiguration2EditPart.VISUAL_ID:
				return new org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceConfiguration2EditPart(
						view);

			case org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPlatformInstance2EditPart.VISUAL_ID:
				return new org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPlatformInstance2EditPart(
						view);

			case org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceName2EditPart.VISUAL_ID:
				return new org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceName2EditPart(
						view);

			case org.muml.pm.hardware.platforminstance.diagram.edit.parts.DelegationHWPortInstanceEditPart.VISUAL_ID:
				return new org.muml.pm.hardware.platforminstance.diagram.edit.parts.DelegationHWPortInstanceEditPart(
						view);

			case org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPortLabelEditPart.VISUAL_ID:
				return new org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPortLabelEditPart(
						view);

			case org.muml.pm.hardware.platforminstance.diagram.edit.parts.StructuredResourceInstanceEditPart.VISUAL_ID:
				return new org.muml.pm.hardware.platforminstance.diagram.edit.parts.StructuredResourceInstanceEditPart(
						view);

			case org.muml.pm.hardware.platforminstance.diagram.edit.parts.StructuredResourceInstanceNameEditPart.VISUAL_ID:
				return new org.muml.pm.hardware.platforminstance.diagram.edit.parts.StructuredResourceInstanceNameEditPart(
						view);

			case org.muml.pm.hardware.platforminstance.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID:
				return new org.muml.pm.hardware.platforminstance.diagram.edit.parts.WrappingLabel3EditPart(
						view);

			case org.muml.pm.hardware.platforminstance.diagram.edit.parts.WrappingLabel4EditPart.VISUAL_ID:
				return new org.muml.pm.hardware.platforminstance.diagram.edit.parts.WrappingLabel4EditPart(
						view);

			case org.muml.pm.hardware.platforminstance.diagram.edit.parts.WrappingLabel5EditPart.VISUAL_ID:
				return new org.muml.pm.hardware.platforminstance.diagram.edit.parts.WrappingLabel5EditPart(
						view);

			case org.muml.pm.hardware.platforminstance.diagram.edit.parts.WrappingLabel6EditPart.VISUAL_ID:
				return new org.muml.pm.hardware.platforminstance.diagram.edit.parts.WrappingLabel6EditPart(
						view);

			case org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPortInstanceEditPart.VISUAL_ID:
				return new org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPortInstanceEditPart(
						view);

			case org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPortLabel2EditPart.VISUAL_ID:
				return new org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPortLabel2EditPart(
						view);

			case org.muml.pm.hardware.platforminstance.diagram.edit.parts.ActuatorInstanceEditPart.VISUAL_ID:
				return new org.muml.pm.hardware.platforminstance.diagram.edit.parts.ActuatorInstanceEditPart(
						view);

			case org.muml.pm.hardware.platforminstance.diagram.edit.parts.ActuatorInstanceNameEditPart.VISUAL_ID:
				return new org.muml.pm.hardware.platforminstance.diagram.edit.parts.ActuatorInstanceNameEditPart(
						view);

			case org.muml.pm.hardware.platforminstance.diagram.edit.parts.WrappingLabel7EditPart.VISUAL_ID:
				return new org.muml.pm.hardware.platforminstance.diagram.edit.parts.WrappingLabel7EditPart(
						view);

			case org.muml.pm.hardware.platforminstance.diagram.edit.parts.WrappingLabel8EditPart.VISUAL_ID:
				return new org.muml.pm.hardware.platforminstance.diagram.edit.parts.WrappingLabel8EditPart(
						view);

			case org.muml.pm.hardware.platforminstance.diagram.edit.parts.SensorInstanceEditPart.VISUAL_ID:
				return new org.muml.pm.hardware.platforminstance.diagram.edit.parts.SensorInstanceEditPart(
						view);

			case org.muml.pm.hardware.platforminstance.diagram.edit.parts.SensorInstanceNameEditPart.VISUAL_ID:
				return new org.muml.pm.hardware.platforminstance.diagram.edit.parts.SensorInstanceNameEditPart(
						view);

			case org.muml.pm.hardware.platforminstance.diagram.edit.parts.WrappingLabel9EditPart.VISUAL_ID:
				return new org.muml.pm.hardware.platforminstance.diagram.edit.parts.WrappingLabel9EditPart(
						view);

			case org.muml.pm.hardware.platforminstance.diagram.edit.parts.WrappingLabel10EditPart.VISUAL_ID:
				return new org.muml.pm.hardware.platforminstance.diagram.edit.parts.WrappingLabel10EditPart(
						view);

			case org.muml.pm.hardware.platforminstance.diagram.edit.parts.BusInstanceEditPart.VISUAL_ID:
				return new org.muml.pm.hardware.platforminstance.diagram.edit.parts.BusInstanceEditPart(
						view);

			case org.muml.pm.hardware.platforminstance.diagram.edit.parts.WrappingLabel11EditPart.VISUAL_ID:
				return new org.muml.pm.hardware.platforminstance.diagram.edit.parts.WrappingLabel11EditPart(
						view);

			case org.muml.pm.hardware.platforminstance.diagram.edit.parts.WrappingLabel12EditPart.VISUAL_ID:
				return new org.muml.pm.hardware.platforminstance.diagram.edit.parts.WrappingLabel12EditPart(
						view);

			case org.muml.pm.hardware.platforminstance.diagram.edit.parts.NetworkBridgeInstanceEditPart.VISUAL_ID:
				return new org.muml.pm.hardware.platforminstance.diagram.edit.parts.NetworkBridgeInstanceEditPart(
						view);

			case org.muml.pm.hardware.platforminstance.diagram.edit.parts.WrappingLabel13EditPart.VISUAL_ID:
				return new org.muml.pm.hardware.platforminstance.diagram.edit.parts.WrappingLabel13EditPart(
						view);

			case org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceHWPlatformCompartmentEditPart.VISUAL_ID:
				return new org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceHWPlatformCompartmentEditPart(
						view);

			case org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceConfigurationHWPInstanceConfigurationContentsCompartmentEditPart.VISUAL_ID:
				return new org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceConfigurationHWPInstanceConfigurationContentsCompartmentEditPart(
						view);

			case org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceHWPlatformCompartment2EditPart.VISUAL_ID:
				return new org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceHWPlatformCompartment2EditPart(
						view);

			case org.muml.pm.hardware.platforminstance.diagram.edit.parts.NetworkConnectorInstanceEditPart.VISUAL_ID:
				return new org.muml.pm.hardware.platforminstance.diagram.edit.parts.NetworkConnectorInstanceEditPart(
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
