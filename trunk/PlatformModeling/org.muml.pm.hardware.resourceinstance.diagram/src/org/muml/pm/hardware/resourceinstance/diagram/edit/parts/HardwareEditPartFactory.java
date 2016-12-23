package org.muml.pm.hardware.resourceinstance.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;
import org.muml.pm.hardware.resourceinstance.diagram.part.HardwareVisualIDRegistry;

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

			case ResourceInstanceRepositoryEditPart.VISUAL_ID:
				return new ResourceInstanceRepositoryEditPart(view);

			case SensorInstanceEditPart.VISUAL_ID:
				return new SensorInstanceEditPart(view);

			case SensorInstanceNameEditPart.VISUAL_ID:
				return new SensorInstanceNameEditPart(view);

			case WrappingLabelEditPart.VISUAL_ID:
				return new WrappingLabelEditPart(view);

			case WrappingLabel2EditPart.VISUAL_ID:
				return new WrappingLabel2EditPart(view);

			case ActuatorInstanceEditPart.VISUAL_ID:
				return new ActuatorInstanceEditPart(view);

			case ActuatorInstanceNameEditPart.VISUAL_ID:
				return new ActuatorInstanceNameEditPart(view);

			case WrappingLabel3EditPart.VISUAL_ID:
				return new WrappingLabel3EditPart(view);

			case WrappingLabel4EditPart.VISUAL_ID:
				return new WrappingLabel4EditPart(view);

			case StructuredResourceInstanceEditPart.VISUAL_ID:
				return new StructuredResourceInstanceEditPart(view);

			case StructuredResourceInstanceNameEditPart.VISUAL_ID:
				return new StructuredResourceInstanceNameEditPart(view);

			case WrappingLabel5EditPart.VISUAL_ID:
				return new WrappingLabel5EditPart(view);

			case WrappingLabel6EditPart.VISUAL_ID:
				return new WrappingLabel6EditPart(view);

			case HWPortEditPart.VISUAL_ID:
				return new HWPortEditPart(view);

			case HWPortLabelEditPart.VISUAL_ID:
				return new HWPortLabelEditPart(view);

			case CacheInstanceEditPart.VISUAL_ID:
				return new CacheInstanceEditPart(view);

			case CacheInstanceNameEditPart.VISUAL_ID:
				return new CacheInstanceNameEditPart(view);

			case WrappingLabel7EditPart.VISUAL_ID:
				return new WrappingLabel7EditPart(view);

			case WrappingLabel8EditPart.VISUAL_ID:
				return new WrappingLabel8EditPart(view);

			case WrappingLabel9EditPart.VISUAL_ID:
				return new WrappingLabel9EditPart(view);

			case ProgrammableLogicDeviceInstanceEditPart.VISUAL_ID:
				return new ProgrammableLogicDeviceInstanceEditPart(view);

			case ProgrammableLogicDeviceInstanceNameEditPart.VISUAL_ID:
				return new ProgrammableLogicDeviceInstanceNameEditPart(view);

			case WrappingLabel10EditPart.VISUAL_ID:
				return new WrappingLabel10EditPart(view);

			case WrappingLabel11EditPart.VISUAL_ID:
				return new WrappingLabel11EditPart(view);

			case WrappingLabel12EditPart.VISUAL_ID:
				return new WrappingLabel12EditPart(view);

			case ProcessorInstanceEditPart.VISUAL_ID:
				return new ProcessorInstanceEditPart(view);

			case ProcessorInstanceNameEditPart.VISUAL_ID:
				return new ProcessorInstanceNameEditPart(view);

			case WrappingLabel13EditPart.VISUAL_ID:
				return new WrappingLabel13EditPart(view);

			case WrappingLabel14EditPart.VISUAL_ID:
				return new WrappingLabel14EditPart(view);

			case WrappingLabel15EditPart.VISUAL_ID:
				return new WrappingLabel15EditPart(view);

			case WrappingLabel16EditPart.VISUAL_ID:
				return new WrappingLabel16EditPart(view);

			case ProcessingMemoryInstanceEditPart.VISUAL_ID:
				return new ProcessingMemoryInstanceEditPart(view);

			case ProcessingMemoryInstanceNameEditPart.VISUAL_ID:
				return new ProcessingMemoryInstanceNameEditPart(view);

			case WrappingLabel17EditPart.VISUAL_ID:
				return new WrappingLabel17EditPart(view);

			case WrappingLabel18EditPart.VISUAL_ID:
				return new WrappingLabel18EditPart(view);

			case WrappingLabel19EditPart.VISUAL_ID:
				return new WrappingLabel19EditPart(view);

			case WrappingLabel20EditPart.VISUAL_ID:
				return new WrappingLabel20EditPart(view);

			case StorageMemoryInstanceEditPart.VISUAL_ID:
				return new StorageMemoryInstanceEditPart(view);

			case StorageMemoryInstanceNameEditPart.VISUAL_ID:
				return new StorageMemoryInstanceNameEditPart(view);

			case WrappingLabel21EditPart.VISUAL_ID:
				return new WrappingLabel21EditPart(view);

			case WrappingLabel22EditPart.VISUAL_ID:
				return new WrappingLabel22EditPart(view);

			case WrappingLabel23EditPart.VISUAL_ID:
				return new WrappingLabel23EditPart(view);

			case WrappingLabel24EditPart.VISUAL_ID:
				return new WrappingLabel24EditPart(view);

			case StructuredResourceInstanceStructuredResourceCompartmentEditPart.VISUAL_ID:
				return new StructuredResourceInstanceStructuredResourceCompartmentEditPart(view);

			case ProcessorInstanceOwnedCacheInstanceEditPart.VISUAL_ID:
				return new ProcessorInstanceOwnedCacheInstanceEditPart(view);

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
