package de.uni_paderborn.fujaba.muml.reconfiguration.ui.commands;

import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.StaticStructuredComponentEditPart;
import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurableStructuredComponent;

public class GenerateManagerAndExecutorImplementationCommand extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		//get and process current selection
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		
		//collect all StaticStructureComponents from the selection
		Iterator iter = ((IStructuredSelection) selection).iterator();
		while(iter.hasNext()){
			GraphicalEditPart editPart = (GraphicalEditPart) iter.next();
			
			//add StaticStructuredComponent to list
			if(editPart instanceof StaticStructuredComponentEditPart){
				ReconfigurableStructuredComponent sc = (ReconfigurableStructuredComponent) ((View) editPart.getModel()).getElement();

				ICommandProxy cmd = new ICommandProxy(
						new GenerateManagerAndExecutorImplementationTransformationCommand(editPart
								.getEditingDomain(), sc));
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
	class GenerateManagerAndExecutorImplementationTransformationCommand extends AbstractTransactionalCommand {
		
		private ReconfigurableStructuredComponent sc;
		
		public GenerateManagerAndExecutorImplementationTransformationCommand(
				TransactionalEditingDomain editingDomain, ReconfigurableStructuredComponent comp) {
			super(editingDomain, "Make Structured Component Reconfigurable", null);
			this.sc = comp;
		}

		@Override
		protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
				IAdaptable info) throws ExecutionException {

			
			

			return CommandResult.newOKCommandResult();
		}
	}
}
