package org.muml.pm.hardware.resourceinstance.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.muml.pm.hardware.resourceinstance.diagram.providers.HardwareElementTypes;

/**
 * @generated
 */
public class ProcessorInstanceOwnedCacheInstanceItemSemanticEditPolicy extends HardwareBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ProcessorInstanceOwnedCacheInstanceItemSemanticEditPolicy() {
		super(HardwareElementTypes.ProcessorInstanceOwnedCacheInstance_4003);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
