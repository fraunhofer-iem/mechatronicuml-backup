package structuredcomponenteditor.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import structuredcomponenteditor.diagram.edit.commands.ComponentPartCreateCommand;
import structuredcomponenteditor.diagram.providers.StructuredcomponentElementTypes;

/**
 * @generated
 */
public class StructuredComponentComponentCompartmentItemSemanticEditPolicy
		extends StructuredcomponentBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public StructuredComponentComponentCompartmentItemSemanticEditPolicy() {
		super(StructuredcomponentElementTypes.StructuredComponent_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (StructuredcomponentElementTypes.ComponentPart_3002 == req
				.getElementType()) {
			return getGEFWrapper(new ComponentPartCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
