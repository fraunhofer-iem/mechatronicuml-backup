package de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class MessageInterfaceSuperTypeItemSemanticEditPolicy
		extends
		de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.edit.policies.MumlinstanceBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public MessageInterfaceSuperTypeItemSemanticEditPolicy() {
		super(
				de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.diagram.providers.MumlinstanceElementTypes.MessageInterfaceSuperType_4003);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
