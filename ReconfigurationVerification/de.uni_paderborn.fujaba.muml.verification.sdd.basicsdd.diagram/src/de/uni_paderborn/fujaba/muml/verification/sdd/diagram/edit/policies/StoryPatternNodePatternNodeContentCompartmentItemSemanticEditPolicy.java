package de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class StoryPatternNodePatternNodeContentCompartmentItemSemanticEditPolicy
		extends
		de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.policies.BasicSDDBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public StoryPatternNodePatternNodeContentCompartmentItemSemanticEditPolicy() {
		super(
				de.uni_paderborn.fujaba.muml.verification.sdd.diagram.providers.BasicSDDElementTypes.StoryPatternNode_2003);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (de.uni_paderborn.fujaba.muml.verification.sdd.diagram.providers.BasicSDDElementTypes.StoryPattern_3011 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.commands.StoryPatternCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
