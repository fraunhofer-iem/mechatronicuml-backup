package de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class MessageInterfaceSuperTypeItemSemanticEditPolicy
		extends
		de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.edit.policies.UmlrtBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public MessageInterfaceSuperTypeItemSemanticEditPolicy() {
		super(
				de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.providers.UmlrtElementTypes.MessageInterfaceSuperType_4003);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
