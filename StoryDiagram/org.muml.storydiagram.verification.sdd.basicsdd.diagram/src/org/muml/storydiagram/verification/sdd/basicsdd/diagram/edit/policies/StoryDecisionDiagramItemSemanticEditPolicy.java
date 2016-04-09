package org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.commands.LeafNodeCreateCommand;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.commands.StoryPatternNodeCreateCommand;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.providers.BasicSDDElementTypes;

/**
 * @generated
 */
public class StoryDecisionDiagramItemSemanticEditPolicy extends BasicSDDBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public StoryDecisionDiagramItemSemanticEditPolicy() {
		super(BasicSDDElementTypes.StoryDecisionDiagram_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (BasicSDDElementTypes.StoryPatternNode_2003 == req.getElementType()) {
			return getGEFWrapper(new StoryPatternNodeCreateCommand(req));
		}
		if (BasicSDDElementTypes.LeafNode_2004 == req.getElementType()) {
			return getGEFWrapper(new LeafNodeCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(TransactionalEditingDomain editingDomain, DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req.getElementsToBeDuplicated(), req.getAllDuplicatedElementsMap());
		}

	}

}
