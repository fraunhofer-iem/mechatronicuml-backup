package de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class StoryPatternStoryPatternContentCompartmentItemSemanticEditPolicy
		extends
		de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.policies.BasicSDDBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public StoryPatternStoryPatternContentCompartmentItemSemanticEditPolicy() {
		super(
				de.uni_paderborn.fujaba.muml.verification.sdd.diagram.providers.BasicSDDElementTypes.StoryPattern_3011);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (de.uni_paderborn.fujaba.muml.verification.sdd.diagram.providers.BasicSDDElementTypes.CollectionVariable_3006 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.commands.CollectionVariableCreateCommand(
					req));
		}
		if (de.uni_paderborn.fujaba.muml.verification.sdd.diagram.providers.BasicSDDElementTypes.ObjectVariable_3009 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.commands.ObjectVariableCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
