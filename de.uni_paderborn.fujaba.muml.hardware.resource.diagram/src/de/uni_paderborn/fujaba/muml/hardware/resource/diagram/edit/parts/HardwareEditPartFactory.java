package de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts;

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
			switch (de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareVisualIDRegistry
					.getVisualID(view)) {

			case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.ResourceRepositoryEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.ResourceRepositoryEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.DeviceEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.DeviceEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.DeviceNameEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.DeviceNameEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.WrappingLabelEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.WrappingLabel2EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.StructuredResourceEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.StructuredResourceEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.StructuredResourceNameEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.StructuredResourceNameEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.WrappingLabel3EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.WrappingLabel4EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.WrappingLabel4EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.BusEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.BusEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.WrappingLabel19EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.WrappingLabel19EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.WrappingLabel20EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.WrappingLabel20EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.LinkEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.LinkEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.WrappingLabel21EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.WrappingLabel21EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.WrappingLabel22EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.WrappingLabel22EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.CommunicationProtocolRepositoryEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.CommunicationProtocolRepositoryEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.CommunicationProtocolRepositoryNameEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.CommunicationProtocolRepositoryNameEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.CommunicationResourceEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.CommunicationResourceEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.HWPortLabelEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.HWPortLabelEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.CommunicationResource2EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.CommunicationResource2EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.CommunicationResourceNameEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.CommunicationResourceNameEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.WrappingLabel23EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.WrappingLabel23EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.WrappingLabel24EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.WrappingLabel24EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.CacheEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.CacheEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.CacheNameEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.CacheNameEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.WrappingLabel5EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.WrappingLabel5EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.WrappingLabel6EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.WrappingLabel6EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.WrappingLabel7EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.WrappingLabel7EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.WrappingLabel8EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.WrappingLabel8EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.ProcessorEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.ProcessorEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.WrappingLabel9EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.WrappingLabel9EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.ProcessorNameEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.ProcessorNameEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.WrappingLabel10EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.WrappingLabel10EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.WrappingLabel11EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.WrappingLabel11EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.WrappingLabel12EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.WrappingLabel12EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.ProgrammableLogicDeviceEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.ProgrammableLogicDeviceEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.ProgrammableLogicDeviceNameEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.ProgrammableLogicDeviceNameEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.WrappingLabel13EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.WrappingLabel13EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.WrappingLabel14EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.WrappingLabel14EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.MemoryResourceEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.MemoryResourceEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.MemoryResourceNameEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.MemoryResourceNameEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.WrappingLabel15EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.WrappingLabel15EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.WrappingLabel16EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.WrappingLabel16EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.WrappingLabel17EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.WrappingLabel17EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.WrappingLabel18EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.WrappingLabel18EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.BusProtocolEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.BusProtocolEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.BusProtocolNameEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.BusProtocolNameEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.LinkProtocolEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.LinkProtocolEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.LinkProtocolNameEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.LinkProtocolNameEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.StructuredResourceStructuredResourceCompartmentEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.StructuredResourceStructuredResourceCompartmentEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.CommunicationProtocolRepositoryProtocolRepositoryCompartmentEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.CommunicationProtocolRepositoryProtocolRepositoryCompartmentEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.ProcessorOwnedCacheEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.resource.diagram.edit.parts.ProcessorOwnedCacheEditPart(
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
