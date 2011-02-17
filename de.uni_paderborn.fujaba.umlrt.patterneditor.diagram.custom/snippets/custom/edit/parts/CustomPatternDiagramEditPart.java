package patterneditor.diagram.custom.edit.parts;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.SemanticEditPolicy;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;

import patterneditor.diagram.edit.parts.PatternDiagramEditPart;
import patterneditor.diagram.providers.PatternElementTypes;

public class CustomPatternDiagramEditPart extends PatternDiagramEditPart {

	public CustomPatternDiagramEditPart(View view) {
		super(view);
	}

	@Override
	protected void createDefaultEditPolicies() {
//		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
//				new SemanticEditPolicy() {
//					protected Command getCreateCommand(CreateElementRequest req) {
//						if (PatternElementTypes.Role_2002 == req
//								.getElementType()) {
//							return new ICommandProxy(new CustomRoleCreateCommand(req));
//
//						}
//						return null;
//					}
//				});
		super.createDefaultEditPolicies();
	}

}
