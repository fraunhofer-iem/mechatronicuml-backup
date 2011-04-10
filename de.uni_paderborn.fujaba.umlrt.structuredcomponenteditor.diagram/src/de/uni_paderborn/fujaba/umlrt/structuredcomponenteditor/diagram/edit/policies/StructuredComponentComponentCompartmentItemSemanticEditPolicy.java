package de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class StructuredComponentComponentCompartmentItemSemanticEditPolicy
		extends
		de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.policies.StructuredcomponentBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public StructuredComponentComponentCompartmentItemSemanticEditPolicy() {
		super(
				de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.providers.StructuredcomponentElementTypes.StructuredComponent_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.providers.StructuredcomponentElementTypes.ComponentPart_3002 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.commands.ComponentPartCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
