package de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class RealtimeStatechartItemSemanticEditPolicy
		extends
		de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.policies.RealtimeStatechartBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public RealtimeStatechartItemSemanticEditPolicy() {
		super(
				de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.providers.RealtimeStatechartElementTypes.RealtimeStatechart_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.providers.RealtimeStatechartElementTypes.State_2008 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.commands.StateCreateCommand(
					req));
		}
		if (de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.providers.RealtimeStatechartElementTypes.InitialState_2009 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.commands.InitialStateCreateCommand(
					req));
		}
		if (de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.providers.RealtimeStatechartElementTypes.FinalState_2010 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.commands.FinalStateCreateCommand(
					req));
		}
		if (de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.providers.RealtimeStatechartElementTypes.HistoryState_2011 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.commands.HistoryStateCreateCommand(
					req));
		}
		if (de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.providers.RealtimeStatechartElementTypes.Clock_2012 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.commands.ClockCreateCommand(
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
