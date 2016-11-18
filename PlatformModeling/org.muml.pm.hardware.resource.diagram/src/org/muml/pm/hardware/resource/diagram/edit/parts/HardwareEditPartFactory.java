package org.muml.pm.hardware.resource.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;
import org.muml.pm.hardware.resource.diagram.part.HardwareVisualIDRegistry;

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

			case ResourceRepositoryEditPart.VISUAL_ID:
				return new ResourceRepositoryEditPart(view);

			case DeviceEditPart.VISUAL_ID:
				return new DeviceEditPart(view);

			case DeviceNameEditPart.VISUAL_ID:
				return new DeviceNameEditPart(view);

			case WrappingLabelEditPart.VISUAL_ID:
				return new WrappingLabelEditPart(view);

			case WrappingLabel2EditPart.VISUAL_ID:
				return new WrappingLabel2EditPart(view);

			case StructuredResourceEditPart.VISUAL_ID:
				return new StructuredResourceEditPart(view);

			case StructuredResourceNameEditPart.VISUAL_ID:
				return new StructuredResourceNameEditPart(view);

			case WrappingLabel3EditPart.VISUAL_ID:
				return new WrappingLabel3EditPart(view);

			case WrappingLabel4EditPart.VISUAL_ID:
				return new WrappingLabel4EditPart(view);

			case CommunicationProtocolRepositoryEditPart.VISUAL_ID:
				return new CommunicationProtocolRepositoryEditPart(view);

			case CommunicationProtocolRepositoryNameEditPart.VISUAL_ID:
				return new CommunicationProtocolRepositoryNameEditPart(view);

			case CommunicationResourceEditPart.VISUAL_ID:
				return new CommunicationResourceEditPart(view);

			case HWPortLabelEditPart.VISUAL_ID:
				return new HWPortLabelEditPart(view);

			case CommunicationResource2EditPart.VISUAL_ID:
				return new CommunicationResource2EditPart(view);

			case CommunicationResourceNameEditPart.VISUAL_ID:
				return new CommunicationResourceNameEditPart(view);

			case WrappingLabel5EditPart.VISUAL_ID:
				return new WrappingLabel5EditPart(view);

			case WrappingLabel6EditPart.VISUAL_ID:
				return new WrappingLabel6EditPart(view);

			case CacheEditPart.VISUAL_ID:
				return new CacheEditPart(view);

			case CacheNameEditPart.VISUAL_ID:
				return new CacheNameEditPart(view);

			case WrappingLabel7EditPart.VISUAL_ID:
				return new WrappingLabel7EditPart(view);

			case WrappingLabel8EditPart.VISUAL_ID:
				return new WrappingLabel8EditPart(view);

			case WrappingLabel9EditPart.VISUAL_ID:
				return new WrappingLabel9EditPart(view);

			case WrappingLabel10EditPart.VISUAL_ID:
				return new WrappingLabel10EditPart(view);

			case ProcessorEditPart.VISUAL_ID:
				return new ProcessorEditPart(view);

			case WrappingLabel11EditPart.VISUAL_ID:
				return new WrappingLabel11EditPart(view);

			case ProcessorNameEditPart.VISUAL_ID:
				return new ProcessorNameEditPart(view);

			case WrappingLabel12EditPart.VISUAL_ID:
				return new WrappingLabel12EditPart(view);

			case WrappingLabel13EditPart.VISUAL_ID:
				return new WrappingLabel13EditPart(view);

			case WrappingLabel14EditPart.VISUAL_ID:
				return new WrappingLabel14EditPart(view);

			case ProgrammableLogicDeviceEditPart.VISUAL_ID:
				return new ProgrammableLogicDeviceEditPart(view);

			case ProgrammableLogicDeviceNameEditPart.VISUAL_ID:
				return new ProgrammableLogicDeviceNameEditPart(view);

			case WrappingLabel15EditPart.VISUAL_ID:
				return new WrappingLabel15EditPart(view);

			case WrappingLabel16EditPart.VISUAL_ID:
				return new WrappingLabel16EditPart(view);

			case MemoryResourceEditPart.VISUAL_ID:
				return new MemoryResourceEditPart(view);

			case MemoryResourceNameEditPart.VISUAL_ID:
				return new MemoryResourceNameEditPart(view);

			case WrappingLabel17EditPart.VISUAL_ID:
				return new WrappingLabel17EditPart(view);

			case WrappingLabel18EditPart.VISUAL_ID:
				return new WrappingLabel18EditPart(view);

			case WrappingLabel19EditPart.VISUAL_ID:
				return new WrappingLabel19EditPart(view);

			case WrappingLabel20EditPart.VISUAL_ID:
				return new WrappingLabel20EditPart(view);

			case BusProtocolEditPart.VISUAL_ID:
				return new BusProtocolEditPart(view);

			case BusProtocolNameEditPart.VISUAL_ID:
				return new BusProtocolNameEditPart(view);

			case LinkProtocolEditPart.VISUAL_ID:
				return new LinkProtocolEditPart(view);

			case LinkProtocolNameEditPart.VISUAL_ID:
				return new LinkProtocolNameEditPart(view);

			case StructuredResourceStructuredResourceCompartmentEditPart.VISUAL_ID:
				return new StructuredResourceStructuredResourceCompartmentEditPart(view);

			case CommunicationProtocolRepositoryProtocolRepositoryCompartmentEditPart.VISUAL_ID:
				return new CommunicationProtocolRepositoryProtocolRepositoryCompartmentEditPart(view);

			case ProcessorOwnedCacheEditPart.VISUAL_ID:
				return new ProcessorOwnedCacheEditPart(view);

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
