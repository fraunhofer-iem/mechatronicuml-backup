package structuredcomponenteditor.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

import structuredcomponenteditor.diagram.edit.commands.AssemblyCreateCommand;
import structuredcomponenteditor.diagram.edit.commands.AssemblyReorientCommand;
import structuredcomponenteditor.diagram.edit.commands.DelegationCreateCommand;
import structuredcomponenteditor.diagram.edit.commands.DelegationReorientCommand;
import structuredcomponenteditor.diagram.edit.parts.AssemblyEditPart;
import structuredcomponenteditor.diagram.edit.parts.DelegationEditPart;
import structuredcomponenteditor.diagram.part.StructuredcomponentVisualIDRegistry;
import structuredcomponenteditor.diagram.providers.StructuredcomponentElementTypes;

/**
 * @generated
 */
public class Port2ItemSemanticEditPolicy extends
		StructuredcomponentBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public Port2ItemSemanticEditPolicy() {
		super(StructuredcomponentElementTypes.Port_3003);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (StructuredcomponentVisualIDRegistry.getVisualID(incomingLink) == DelegationEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (StructuredcomponentVisualIDRegistry.getVisualID(incomingLink) == AssemblyEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (StructuredcomponentVisualIDRegistry.getVisualID(outgoingLink) == DelegationEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (StructuredcomponentVisualIDRegistry.getVisualID(outgoingLink) == AssemblyEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
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
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (StructuredcomponentElementTypes.Delegation_4001 == req
				.getElementType()) {
			return getGEFWrapper(new DelegationCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (StructuredcomponentElementTypes.Assembly_4002 == req
				.getElementType()) {
			return getGEFWrapper(new AssemblyCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (StructuredcomponentElementTypes.Delegation_4001 == req
				.getElementType()) {
			return getGEFWrapper(new DelegationCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (StructuredcomponentElementTypes.Assembly_4002 == req
				.getElementType()) {
			return getGEFWrapper(new AssemblyCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case DelegationEditPart.VISUAL_ID:
			return getGEFWrapper(new DelegationReorientCommand(req));
		case AssemblyEditPart.VISUAL_ID:
			return getGEFWrapper(new AssemblyReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
