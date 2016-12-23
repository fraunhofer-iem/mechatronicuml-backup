package org.muml.pm.hardware.resource.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;
import org.muml.pm.hardware.resource.diagram.edit.commands.CommunicationProtocolRepositoryCreateCommand;
import org.muml.pm.hardware.resource.diagram.edit.commands.DeviceCreateCommand;
import org.muml.pm.hardware.resource.diagram.edit.commands.StructuredResourceCreateCommand;
import org.muml.pm.hardware.resource.diagram.providers.HardwareElementTypes;

/**
 * @generated
 */
public class ResourceRepositoryItemSemanticEditPolicy extends HardwareBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ResourceRepositoryItemSemanticEditPolicy() {
		super(HardwareElementTypes.ResourceRepository_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (HardwareElementTypes.Device_2006 == req.getElementType()) {
			return getGEFWrapper(new DeviceCreateCommand(req));
		}
		if (HardwareElementTypes.StructuredResource_2007 == req.getElementType()) {
			return getGEFWrapper(new StructuredResourceCreateCommand(req));
		}
		if (HardwareElementTypes.CommunicationProtocolRepository_2008 == req.getElementType()) {
			return getGEFWrapper(new CommunicationProtocolRepositoryCreateCommand(req));
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
