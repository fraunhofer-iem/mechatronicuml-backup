package de.uni_paderborn.fujaba.muml.component.diagram.custom.edit.commands;

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
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.ui.handlers.HandlerUtil;

import de.uni_paderborn.fujaba.modelinstance.RootNode;
import de.uni_paderborn.fujaba.muml.component.DiscretePort;
import de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.DiscretePortEditPart;

public class CopyRolePropertiesToPort extends AbstractHandler {

	public CopyRolePropertiesToPort() {
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		//get and process current selection
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		
		//collect all StaticStructureComponents from the selection
		Iterator iter = ((IStructuredSelection) selection).iterator();
		while(iter.hasNext()){
			GraphicalEditPart editPart = (GraphicalEditPart) iter.next();
			
			//add StaticStructuredComponent to list
			if(editPart instanceof DiscretePortEditPart){
				DiscretePort port = (DiscretePort) ((View) editPart.getModel()).getElement();

				if (port.getRefinedRole() == null)
					continue;
				
				ICommandProxy cmd = new ICommandProxy(
						new PortChangeCommand(editPart
								.getEditingDomain(), port));
				cmd.execute();
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
	class PortChangeCommand extends AbstractTransactionalCommand {
		DiscretePort thePort = null;

		public PortChangeCommand(
				TransactionalEditingDomain editingDomain, DiscretePort source) {
			super(editingDomain, "Copy role properties to port", null);
			this.thePort = source;
		}

		@Override
		protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
				IAdaptable info) throws ExecutionException {

			URI transformationURI = URI
					.createPlatformPluginURI(
							"/de.uni_paderborn.fujaba.muml.component.diagram.custom/transforms/CopyRolePropertiesToPort.qvto",
							true);
			// create executor and execution context
			TransformationExecutor executor = new TransformationExecutor(
					transformationURI);
			ExecutionContextImpl context = new ExecutionContextImpl();

			//create model extent
			BasicModelExtent portInput = new BasicModelExtent();
			portInput.add(thePort);
			portInput.add(getRootNode(thePort));

			// execute transformation
			ExecutionDiagnostic result = executor.execute(context, portInput);
			if (result.getSeverity() != ExecutionDiagnostic.OK) {
				String message = "QVT-O ERROR on rule transformation. Message was:" + result.getMessage();
				return CommandResult.newErrorCommandResult(message);
			}
			
			return CommandResult.newOKCommandResult();
		}
		
		/**
		 * Returns the root node of the resource the contains the port given as a parameter.
		 * @param thePort
		 * @return
		 */
		private RootNode getRootNode(DiscretePort thePort){
			return (RootNode) thePort.getComponent().eContainer().eContainer();
		}
	}

}
