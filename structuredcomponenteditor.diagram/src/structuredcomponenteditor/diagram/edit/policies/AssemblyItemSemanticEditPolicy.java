package structuredcomponenteditor.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import structuredcomponenteditor.diagram.providers.StructuredcomponentElementTypes;

/**
 * @generated
 */
public class AssemblyItemSemanticEditPolicy extends
		StructuredcomponentBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public AssemblyItemSemanticEditPolicy() {
		super(StructuredcomponentElementTypes.Assembly_4002);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
