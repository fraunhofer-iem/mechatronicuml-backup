package org.muml.pim.pattern.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;
import org.muml.pim.pattern.diagram.edit.commands.CoordinationPatternCreateCommand;
import org.muml.pim.pattern.diagram.edit.commands.CoordinationPatternVariantCreateCommand;
import org.muml.pim.pattern.diagram.providers.MumlElementTypes;

/**
 * @generated
 */
public class ModelElementCategoryItemSemanticEditPolicy extends MumlBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ModelElementCategoryItemSemanticEditPolicy() {
		super(MumlElementTypes.ModelElementCategory_1000);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (MumlElementTypes.CoordinationPattern_2001 == req.getElementType()) {
			return getGEFWrapper(new CoordinationPatternCreateCommand(req));
		}
		if (MumlElementTypes.CoordinationPatternVariant_2002 == req.getElementType()) {
			return getGEFWrapper(new CoordinationPatternVariantCreateCommand(req));
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
