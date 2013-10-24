package de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts;

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
			switch (de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareVisualIDRegistry
					.getVisualID(view)) {

			case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.ResourceTypeRepositoryEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.ResourceTypeRepositoryEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.DeviceEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.DeviceEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.DeviceNameEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.DeviceNameEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.DeviceDeviceTypeEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.DeviceDeviceTypeEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.WrappingLabelEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.StructuredResourceEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.StructuredResourceEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.StructuredResourceNameEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.StructuredResourceNameEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.WrappingLabel2EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.WrappingLabel3EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.HWPortEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.HWPortEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.HWPortLabelEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.HWPortLabelEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.CacheEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.CacheEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.CacheNameEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.CacheNameEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.WrappingLabel4EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.WrappingLabel4EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.WrappingLabel5EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.WrappingLabel5EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.WrappingLabel14EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.WrappingLabel14EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.WrappingLabel15EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.WrappingLabel15EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.ProcessorEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.ProcessorEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.WrappingLabel6EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.WrappingLabel6EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.ProcessorNameEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.ProcessorNameEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.WrappingLabel7EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.WrappingLabel7EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.WrappingLabel8EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.WrappingLabel8EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.WrappingLabel9EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.WrappingLabel9EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.ProgrammableLogicDeviceEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.ProgrammableLogicDeviceEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.ProgrammableLogicDeviceNameEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.ProgrammableLogicDeviceNameEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.WrappingLabel10EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.WrappingLabel10EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.WrappingLabel11EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.WrappingLabel11EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.MemoryResourceEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.MemoryResourceEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.MemoryResourceNameEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.MemoryResourceNameEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.WrappingLabel12EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.WrappingLabel12EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.WrappingLabel13EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.WrappingLabel13EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.MemoryResourceIsVolatileEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.MemoryResourceIsVolatileEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.MemoryResourceIsVolatile2EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.MemoryResourceIsVolatile2EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.StructuredResourceStructuredResourceCompartmentEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.StructuredResourceStructuredResourceCompartmentEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.ProcessorOwnedCacheEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.ProcessorOwnedCacheEditPart(
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
