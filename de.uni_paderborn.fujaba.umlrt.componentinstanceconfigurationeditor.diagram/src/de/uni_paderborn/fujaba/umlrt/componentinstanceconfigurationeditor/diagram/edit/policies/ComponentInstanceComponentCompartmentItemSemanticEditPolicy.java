package de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class ComponentInstanceComponentCompartmentItemSemanticEditPolicy
		extends
		de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.edit.policies.MumlinstanceBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ComponentInstanceComponentCompartmentItemSemanticEditPolicy() {
		super(
				de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.providers.MumlinstanceElementTypes.ComponentInstance_2004);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.providers.MumlinstanceElementTypes.ComponentInstance_3006 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.edit.commands.ComponentInstance2CreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
