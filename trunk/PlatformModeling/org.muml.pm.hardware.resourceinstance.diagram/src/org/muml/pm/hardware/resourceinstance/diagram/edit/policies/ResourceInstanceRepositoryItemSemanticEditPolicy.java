package org.muml.pm.hardware.resourceinstance.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;
import org.muml.pm.hardware.resourceinstance.diagram.edit.commands.ActuatorInstanceCreateCommand;
import org.muml.pm.hardware.resourceinstance.diagram.edit.commands.SensorInstanceCreateCommand;
import org.muml.pm.hardware.resourceinstance.diagram.edit.commands.StructuredResourceInstanceCreateCommand;
import org.muml.pm.hardware.resourceinstance.diagram.providers.HardwareElementTypes;

/**
 * @generated
 */
public class ResourceInstanceRepositoryItemSemanticEditPolicy extends HardwareBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ResourceInstanceRepositoryItemSemanticEditPolicy() {
		super(HardwareElementTypes.ResourceInstanceRepository_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (HardwareElementTypes.SensorInstance_2007 == req.getElementType()) {
			return getGEFWrapper(new SensorInstanceCreateCommand(req));
		}
		if (HardwareElementTypes.ActuatorInstance_2008 == req.getElementType()) {
			return getGEFWrapper(new ActuatorInstanceCreateCommand(req));
		}
		if (HardwareElementTypes.StructuredResourceInstance_2009 == req.getElementType()) {
			return getGEFWrapper(new StructuredResourceInstanceCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(TransactionalEditingDomain editingDomain, DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req.getElementsToBeDuplicated(), req.getAllDuplicatedElementsMap());
		}

	}

}
