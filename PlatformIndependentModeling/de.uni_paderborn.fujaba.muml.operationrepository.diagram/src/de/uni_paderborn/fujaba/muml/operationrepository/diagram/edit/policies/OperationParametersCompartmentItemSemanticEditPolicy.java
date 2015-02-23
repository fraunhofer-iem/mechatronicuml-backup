package de.uni_paderborn.fujaba.muml.operationrepository.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class OperationParametersCompartmentItemSemanticEditPolicy
		extends
		de.uni_paderborn.fujaba.muml.operationrepository.diagram.edit.policies.MumlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public OperationParametersCompartmentItemSemanticEditPolicy() {
		super(
				de.uni_paderborn.fujaba.muml.operationrepository.diagram.providers.MumlElementTypes.Operation_3001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (de.uni_paderborn.fujaba.muml.operationrepository.diagram.providers.MumlElementTypes.Parameter_3002 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.operationrepository.diagram.edit.commands.ParameterCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
