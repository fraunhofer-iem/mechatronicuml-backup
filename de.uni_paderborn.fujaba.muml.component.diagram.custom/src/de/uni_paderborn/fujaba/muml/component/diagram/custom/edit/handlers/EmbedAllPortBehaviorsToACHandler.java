package de.uni_paderborn.fujaba.muml.component.diagram.custom.edit.handlers;

import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import de.uni_paderborn.fujaba.muml.behavior.Behavior;
import de.uni_paderborn.fujaba.muml.component.AtomicComponent;
import de.uni_paderborn.fujaba.muml.component.StaticAtomicComponent;
import de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.AtomicComponentEditPart;
import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage;

public class EmbedAllPortBehaviorsToACHandler extends AbstractHandler {

	public EmbedAllPortBehaviorsToACHandler() {
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil
				.getActiveWorkbenchWindowChecked(event);

		// get and process current selection
		ISelection selection = HandlerUtil.getCurrentSelection(event);

		// collect all StaticAtomicComponents from the selection
		Iterator iter = ((IStructuredSelection) selection).iterator();
		while (iter.hasNext()) {
			GraphicalEditPart editPart = (GraphicalEditPart) iter.next();

			// add StaticAtomicComponent to list
			if (editPart instanceof AtomicComponentEditPart) {
				StaticAtomicComponent atomicComponent = (StaticAtomicComponent) ((View) editPart
						.getModel()).getElement();

				Behavior behavior = atomicComponent.getBehavior();
				if (behavior == null || !RealtimestatechartPackage.Literals.REALTIME_STATECHART.isSuperTypeOf(behavior.eClass())) {
					MessageDialog
							.openInformation(window.getShell(),
									"Behavior not specified",
									"A Real-Time Statechart must be set as behavior for the atomic component.");
				} else {
					ICommandProxy cmd = new ICommandProxy(
							new EmbedPortBehaviorCommand(editPart.getEditingDomain(),
									atomicComponent));
					cmd.execute();
				}
			}

		}

		return null;
	}

	/**
	 * Helper class to edit the resource/model.
	 * 
	 * Direct manipulation would lead to a "java.lang.IllegalStateException:
	 * Cannot modify resource set without a write transaction"
	 * 
	 */
	class EmbedPortBehaviorCommand extends AbstractTransactionalCommand {
		AtomicComponent atomicComponent = null;

		public EmbedPortBehaviorCommand (TransactionalEditingDomain editingDomain,
				AtomicComponent component) {
			super(editingDomain, "Embed Ports behavior to Component", null);
			this.atomicComponent = component;
		}

		@Override
		protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
				IAdaptable info) throws ExecutionException {

			URI transformationURI = URI
					.createPlatformPluginURI(
							"/de.uni_paderborn.fujaba.muml.component.diagram.custom/transforms/EmbedAllPortBehaviorInAC.qvto",
							true);
			// create executor and execution context
			TransformationExecutor executor = new TransformationExecutor(
					transformationURI);
			ExecutionContextImpl context = new ExecutionContextImpl();

			// create model extent
			BasicModelExtent modelExtent = new BasicModelExtent();
			modelExtent.add(atomicComponent);

			// execute transformation
			ExecutionDiagnostic result = executor.execute(context, modelExtent);
			if (result.getSeverity() != ExecutionDiagnostic.OK) {
				String message = "QVT-O ERROR on rule transformation. Message was:"
						+ result.getMessage();
				return CommandResult.newErrorCommandResult(message);
			}

			return CommandResult.newOKCommandResult();
		}

		
	}

}
