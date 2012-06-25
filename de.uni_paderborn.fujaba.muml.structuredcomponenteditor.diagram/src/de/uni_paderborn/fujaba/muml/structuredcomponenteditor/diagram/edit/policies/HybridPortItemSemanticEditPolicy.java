package de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.policies;

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

/**
 * @generated
 */
public class HybridPortItemSemanticEditPolicy
		extends
		de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.policies.MumlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public HybridPortItemSemanticEditPolicy() {
		super(
				de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.providers.MumlElementTypes.HybridPort_3009);
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
			if (de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlVisualIDRegistry
					.getVisualID(incomingLink) == de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.DelegationEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlVisualIDRegistry
					.getVisualID(incomingLink) == de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.AssemblyEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlVisualIDRegistry
					.getVisualID(outgoingLink) == de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.DelegationEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.MumlVisualIDRegistry
					.getVisualID(outgoingLink) == de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.AssemblyEditPart.VISUAL_ID) {
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
		if (de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.providers.MumlElementTypes.Delegation_4003 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.commands.DelegationCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.providers.MumlElementTypes.Assembly_4004 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.commands.AssemblyCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.providers.MumlElementTypes.Delegation_4003 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.commands.DelegationCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.providers.MumlElementTypes.Assembly_4004 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.commands.AssemblyCreateCommand(
					req, req.getSource(), req.getTarget()));
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
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.DelegationEditPart.VISUAL_ID:
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.commands.DelegationReorientCommand(
					req));
		case de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.parts.AssemblyEditPart.VISUAL_ID:
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.commands.AssemblyReorientCommand(
					req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
