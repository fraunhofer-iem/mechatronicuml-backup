package de.uni_paderborn.fujaba.muml.testlanguage.custom.validation;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;

import de.uni_paderborn.fujaba.muml.testlanguage.Node;

public class NodeExecutionConstraint extends AbstractModelConstraint {

	@Override
	public IStatus validate(IValidationContext ctx) {
		final Node node = (Node) ctx.getTarget();

		ValidationLog.startNode(node);
		
		IStatus out = ctx.createSuccessStatus();
		
		try {
			node.execute();
		} catch (Exception e) {
			// Create a failure status.
			
			ValidationLog.exception(e);
			
			out = ctx.createFailureStatus(new Object[] { node.getLabel(),
					e.getMessage() });
		}

		ValidationLog.endNode(node, out);
		
		return out;
	}

	/*
	private class ExecuteCommand extends RecordingCommand {
		public String result = null;

		private Node node = null;

		public ExecuteCommand(TransactionalEditingDomain domain, Node node) {
			super(domain);
			this.node = node;
		}

		@Override
		protected void doExecute() {
			this.result = node.execute();
		}

	}
	*/

}
