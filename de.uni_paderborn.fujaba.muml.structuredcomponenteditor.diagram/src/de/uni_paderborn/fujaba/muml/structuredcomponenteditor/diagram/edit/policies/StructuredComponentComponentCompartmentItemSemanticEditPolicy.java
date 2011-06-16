package de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class StructuredComponentComponentCompartmentItemSemanticEditPolicy
		extends
		de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.policies.UmlrtBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public StructuredComponentComponentCompartmentItemSemanticEditPolicy() {
		super(
				de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.providers.UmlrtElementTypes.StructuredComponent_2002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.providers.UmlrtElementTypes.ComponentPart_3005 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.commands.ComponentPartCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
