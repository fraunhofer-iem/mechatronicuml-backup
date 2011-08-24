package de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class ComponentInstanceConfigurationDiagramItemSemanticEditPolicy
		extends
		de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.policies.MumlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ComponentInstanceConfigurationDiagramItemSemanticEditPolicy() {
		super(
				de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlElementTypes.ComponentInstanceConfiguration_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlElementTypes.ComponentInstance_2004 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.commands.ComponentInstanceCreateCommand(
					req));
		}
		if (de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlElementTypes.HardwarePortInstance_2006 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.commands.HardwarePortInstance2CreateCommand(
					req));
		}
		if (de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlElementTypes.DiscreteSinglePortInstance_2005 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.commands.DiscreteSinglePortInstance2CreateCommand(
					req));
		}
		if (de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlElementTypes.ContinuousPortInstance_2007 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.commands.ContinuousPortInstance2CreateCommand(
					req));
		}
		if (de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlElementTypes.HybridPortInstance_2008 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.commands.HybridPortInstance2CreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
