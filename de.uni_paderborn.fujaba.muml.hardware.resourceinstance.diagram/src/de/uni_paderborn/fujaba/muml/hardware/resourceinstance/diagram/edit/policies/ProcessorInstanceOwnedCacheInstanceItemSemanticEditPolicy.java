package de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class ProcessorInstanceOwnedCacheInstanceItemSemanticEditPolicy
		extends
		de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.policies.HardwareBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ProcessorInstanceOwnedCacheInstanceItemSemanticEditPolicy() {
		super(
				de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.providers.HardwareElementTypes.ProcessorInstanceOwnedCacheInstance_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
