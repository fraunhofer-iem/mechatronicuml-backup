package de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.custom.edit.policies;

import de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.edit.policies.ComponentPartItemSemanticEditPolicy;

public class CustomComponentPartItemSemanticEditPolicy extends
		ComponentPartItemSemanticEditPolicy {

	// Disabled this modification, because it seems to produce
	// NullPointerExceptions and prevention of port deletion is done in
	// EditHelper after all.

	// TODO: Reopen #40 -> QA, to make sure this does not affect usability.

	// // Overriden to fix MechatronicUML bug #40
	// protected Command getDestroyElementCommand(DestroyElementRequest req) {
	// View view = (View) getHost().getModel();
	// CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
	// getEditingDomain(), null);
	// cmd.setTransactionNestingEnabled(false);
	//		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
	// if (annotation == null) {
	// // there are indirectly referenced children, need extra commands:
	// // false
	//
	// // BEGIN: Fix for MechatronicUML Bug #40
	// //addDestroyChildNodesCommand(cmd);
	// // END: Fix for MechatronicUML Bug #40
	//
	// addDestroyShortcutsCommand(cmd, view);
	// // delete host element
	// cmd.add(new DestroyElementCommand(req));
	// } else {
	// cmd.add(new DeleteCommand(getEditingDomain(), view));
	// }
	// return getGEFWrapper(cmd.reduce());
	// }

}
