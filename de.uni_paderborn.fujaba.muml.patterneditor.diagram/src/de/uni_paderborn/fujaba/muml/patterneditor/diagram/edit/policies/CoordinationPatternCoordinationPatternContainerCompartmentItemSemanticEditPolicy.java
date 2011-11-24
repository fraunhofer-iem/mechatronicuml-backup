package de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class CoordinationPatternCoordinationPatternContainerCompartmentItemSemanticEditPolicy
		extends
		de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.policies.MumlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CoordinationPatternCoordinationPatternContainerCompartmentItemSemanticEditPolicy() {
		super(
				de.uni_paderborn.fujaba.muml.patterneditor.diagram.providers.MumlElementTypes.CoordinationPattern_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (de.uni_paderborn.fujaba.muml.patterneditor.diagram.providers.MumlElementTypes.CoordinationPattern_3001 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.commands.CoordinationPattern2CreateCommand(
					req));
		}
		if (de.uni_paderborn.fujaba.muml.patterneditor.diagram.providers.MumlElementTypes.Role_3002 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.commands.RoleCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
