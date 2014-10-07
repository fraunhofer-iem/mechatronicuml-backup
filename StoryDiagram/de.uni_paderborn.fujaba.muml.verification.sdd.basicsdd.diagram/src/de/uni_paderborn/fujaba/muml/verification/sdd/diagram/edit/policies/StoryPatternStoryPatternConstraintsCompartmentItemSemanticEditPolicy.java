package de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class StoryPatternStoryPatternConstraintsCompartmentItemSemanticEditPolicy
		extends
		de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.policies.BasicSDDBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public StoryPatternStoryPatternConstraintsCompartmentItemSemanticEditPolicy() {
		super(
				de.uni_paderborn.fujaba.muml.verification.sdd.diagram.providers.BasicSDDElementTypes.StoryPattern_3011);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (de.uni_paderborn.fujaba.muml.verification.sdd.diagram.providers.BasicSDDElementTypes.Constraint_3010 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.commands.Constraint2CreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
