package org.muml.pm.hardware.resource.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.muml.pm.hardware.resource.diagram.providers.HardwareElementTypes;

/**
 * @generated
 */
public class ProcessorOwnedCacheItemSemanticEditPolicy extends HardwareBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ProcessorOwnedCacheItemSemanticEditPolicy() {
		super(HardwareElementTypes.ProcessorOwnedCache_4002);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
