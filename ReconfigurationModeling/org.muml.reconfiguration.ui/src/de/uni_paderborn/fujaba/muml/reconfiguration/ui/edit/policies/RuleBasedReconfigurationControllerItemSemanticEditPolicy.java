package de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class RuleBasedReconfigurationControllerItemSemanticEditPolicy
		extends
		de.uni_paderborn.fujaba.muml.component.diagram.edit.policies.MumlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public RuleBasedReconfigurationControllerItemSemanticEditPolicy() {
		super(
				de.uni_paderborn.fujaba.muml.reconfiguration.ui.providers.ReconfigurationElementTypes.RuleBasedReconfigurationController_7076);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		// TODO
		// if
		// (de.uni_paderborn.fujaba.muml.component.diagram.providers.MumlElementTypes.ComponentPart_3012
		// == req
		// .getElementType()) {
		// return getGEFWrapper(new
		// de.uni_paderborn.fujaba.muml.component.diagram.edit.commands.ComponentPartCreateCommand(
		// req));
		// }
		// if
		// (de.uni_paderborn.fujaba.muml.component.diagram.providers.MumlElementTypes.CoordinationProtocolOccurrence_3016
		// == req
		// .getElementType()) {
		// return getGEFWrapper(new
		// de.uni_paderborn.fujaba.muml.component.diagram.edit.commands.CoordinationProtocolOccurrenceCreateCommand(
		// req));
		// }
		return super.getCreateCommand(req);
	}

	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands:
			// false
			addDestroyChildNodesCommand(cmd);
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	private void addDestroyChildNodesCommand(ICompositeCommand cmd) {
		View view = (View) getHost().getModel();

		// TODO implement
		for (Iterator<?> nit = view.getChildren().iterator(); nit.hasNext();) {

			Node node = (Node) nit.next();
			switch (de.uni_paderborn.fujaba.muml.reconfiguration.ui.part.ReconfigurationVisualIDRegistry
					.getVisualID(node)) {

			case de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.ManagerEditPart.VISUAL_ID:

				addDestroyReferencedLinks(cmd, node);
				cmd.add(new DestroyElementCommand(new DestroyElementRequest(
						getEditingDomain(), node.getElement(), false)));
				// don't need explicit deletion of node as parent's view
				// deletion would clean child views as well
				// cmd.add(new
				// org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(),
				// node));

				break;

			case de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.ExecutorEditPart.VISUAL_ID:

				addDestroyReferencedLinks(cmd, node);
				cmd.add(new DestroyElementCommand(new DestroyElementRequest(
						getEditingDomain(), node.getElement(), false)));
				// don't need explicit deletion of node as parent's view
				// deletion would clean child views as well
				// cmd.add(new
				// org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(),
				// node));

				break;

			}
		}
	}
	
	private void addDestroyReferencedLinks(ICompositeCommand cmd, Node view){
		
	
		for (Iterator<?> nit = view.getChildren().iterator(); nit.hasNext();) {

			Node node = (Node) nit.next();
			switch (de.uni_paderborn.fujaba.muml.reconfiguration.ui.part.ReconfigurationVisualIDRegistry
					.getVisualID(node)) {
			
			case de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.InternalReconfigurationCommunicationPortEditPart.VISUAL_ID:
				for (Iterator<?> it = node.getTargetEdges().iterator(); it
						.hasNext();) {
					Edge incomingLink = (Edge) it.next();
					if (de.uni_paderborn.fujaba.muml.reconfiguration.ui.part.ReconfigurationVisualIDRegistry
							.getVisualID(incomingLink) == de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.ReconfigurationPortAssemblyConnectorEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								incomingLink));
						continue;
					}
					if (de.uni_paderborn.fujaba.muml.reconfiguration.ui.part.ReconfigurationVisualIDRegistry
							.getVisualID(incomingLink) == de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.ReconfigurationPortDelegationConnectorEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								incomingLink));
						continue;
					}
				}
				for (Iterator<?> it = node.getSourceEdges().iterator(); it
						.hasNext();) {
					Edge outgoingLink = (Edge) it.next();
					if (de.uni_paderborn.fujaba.muml.reconfiguration.ui.part.ReconfigurationVisualIDRegistry
							.getVisualID(outgoingLink) == de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.ReconfigurationPortAssemblyConnectorEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								outgoingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								outgoingLink));
						continue;
					}
					if (de.uni_paderborn.fujaba.muml.reconfiguration.ui.part.ReconfigurationVisualIDRegistry
							.getVisualID(outgoingLink) == de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.ReconfigurationPortDelegationConnectorEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								outgoingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								outgoingLink));
						continue;
					}
				}

				cmd.add(new DestroyElementCommand(new DestroyElementRequest(
						getEditingDomain(), node.getElement(), false)));
				// don't need explicit deletion of node as parent's view deletion would clean child views as well 
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));

				break;
				
			case de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.ReconfigurationMessagePortEditPart.VISUAL_ID:
				for (Iterator<?> it = node.getTargetEdges().iterator(); it
						.hasNext();) {
					Edge incomingLink = (Edge) it.next();
					if (de.uni_paderborn.fujaba.muml.reconfiguration.ui.part.ReconfigurationVisualIDRegistry
							.getVisualID(incomingLink) == de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.ReconfigurationPortAssemblyConnectorEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								incomingLink));
						continue;
					}
					if (de.uni_paderborn.fujaba.muml.reconfiguration.ui.part.ReconfigurationVisualIDRegistry
							.getVisualID(incomingLink) == de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.ReconfigurationPortDelegationConnectorEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								incomingLink));
						continue;
					}
				}
				for (Iterator<?> it = node.getSourceEdges().iterator(); it
						.hasNext();) {
					Edge outgoingLink = (Edge) it.next();
					if (de.uni_paderborn.fujaba.muml.reconfiguration.ui.part.ReconfigurationVisualIDRegistry
							.getVisualID(outgoingLink) == de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.ReconfigurationPortAssemblyConnectorEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								outgoingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								outgoingLink));
						continue;
					}
					if (de.uni_paderborn.fujaba.muml.reconfiguration.ui.part.ReconfigurationVisualIDRegistry
							.getVisualID(outgoingLink) == de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.ReconfigurationPortDelegationConnectorEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								outgoingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								outgoingLink));
						continue;
					}
				}

				cmd.add(new DestroyElementCommand(new DestroyElementRequest(
						getEditingDomain(), node.getElement(), false)));
				// don't need explicit deletion of node as parent's view deletion would clean child views as well 
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));

				break;
				
			case de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.ReconfigurationExecutionPortEditPart.VISUAL_ID:
				for (Iterator<?> it = node.getTargetEdges().iterator(); it
						.hasNext();) {
					Edge incomingLink = (Edge) it.next();
					if (de.uni_paderborn.fujaba.muml.reconfiguration.ui.part.ReconfigurationVisualIDRegistry
							.getVisualID(incomingLink) == de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.ReconfigurationPortAssemblyConnectorEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								incomingLink));
						continue;
					}
					if (de.uni_paderborn.fujaba.muml.reconfiguration.ui.part.ReconfigurationVisualIDRegistry
							.getVisualID(incomingLink) == de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.ReconfigurationPortDelegationConnectorEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								incomingLink));
						continue;
					}
				}
				for (Iterator<?> it = node.getSourceEdges().iterator(); it
						.hasNext();) {
					Edge outgoingLink = (Edge) it.next();
					if (de.uni_paderborn.fujaba.muml.reconfiguration.ui.part.ReconfigurationVisualIDRegistry
							.getVisualID(outgoingLink) == de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.ReconfigurationPortAssemblyConnectorEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								outgoingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								outgoingLink));
						continue;
					}
					if (de.uni_paderborn.fujaba.muml.reconfiguration.ui.part.ReconfigurationVisualIDRegistry
							.getVisualID(outgoingLink) == de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.ReconfigurationPortDelegationConnectorEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								outgoingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								outgoingLink));
						continue;
					}
				}

				cmd.add(new DestroyElementCommand(new DestroyElementRequest(
						getEditingDomain(), node.getElement(), false)));
				// don't need explicit deletion of node as parent's view deletion would clean child views as well 
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));

				break;

			}
		}
	}

}
