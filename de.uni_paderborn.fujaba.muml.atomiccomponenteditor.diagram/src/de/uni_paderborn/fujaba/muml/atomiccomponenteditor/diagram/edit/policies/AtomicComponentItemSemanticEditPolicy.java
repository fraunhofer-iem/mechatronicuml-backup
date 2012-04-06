package de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class AtomicComponentItemSemanticEditPolicy
		extends
		de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.edit.policies.MumlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public AtomicComponentItemSemanticEditPolicy() {
		super(
				de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.providers.MumlElementTypes.AtomicComponent_2004);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.providers.MumlElementTypes.HybridPort_3005 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.edit.commands.HybridPortCreateCommand(
					req));
		}
		if (de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.providers.MumlElementTypes.DiscretePort_3006 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.edit.commands.DiscretePortCreateCommand(
					req));
		}
		if (de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.providers.MumlElementTypes.ContinuousPort_3007 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.edit.commands.ContinuousPortCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
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
		for (Iterator<?> nit = view.getChildren().iterator(); nit.hasNext();) {
			Node node = (Node) nit.next();
			switch (de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.MumlVisualIDRegistry
					.getVisualID(node)) {
			case de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.edit.parts.HybridPortEditPart.VISUAL_ID:
				cmd.add(new DestroyElementCommand(new DestroyElementRequest(
						getEditingDomain(), node.getElement(), false))); // directlyOwned: true
				// don't need explicit deletion of node as parent's view deletion would clean child views as well 
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));
				break;
			case de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.edit.parts.DiscretePortEditPart.VISUAL_ID:
				cmd.add(new DestroyElementCommand(new DestroyElementRequest(
						getEditingDomain(), node.getElement(), false))); // directlyOwned: true
				// don't need explicit deletion of node as parent's view deletion would clean child views as well 
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));
				break;
			case de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.edit.parts.ContinuousPortEditPart.VISUAL_ID:
				cmd.add(new DestroyElementCommand(new DestroyElementRequest(
						getEditingDomain(), node.getElement(), false))); // directlyOwned: true
				// don't need explicit deletion of node as parent's view deletion would clean child views as well 
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));
				break;
			}
		}
	}

}
