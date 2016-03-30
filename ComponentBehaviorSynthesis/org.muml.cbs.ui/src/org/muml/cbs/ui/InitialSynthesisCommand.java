package org.muml.cbs.ui;

import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;
import org.muml.cbs.jobs.InitialSynthesisJob;
import org.muml.pim.component.AtomicComponent;
import org.muml.pim.protocol.CoordinationProtocol;

public class InitialSynthesisCommand extends AbstractHandler {

	private CoordinationProtocol protocol;

	public Object execute(ExecutionEvent event) throws ExecutionException {
		AtomicComponent comp=null;
		// get and process current selection
		ISelection selection = HandlerUtil.getCurrentSelection(event);

		// collect all StaticStructureComponents from the selection
		Iterator<?> iter = ((IStructuredSelection) selection).iterator();
		while (iter.hasNext()) {
			Object obj = iter.next();
			if(obj instanceof IAdaptable) {
				EObject eObj = (EObject)((IAdaptable)obj).getAdapter(EObject.class) ;
				if(eObj instanceof AtomicComponent){
					comp = (AtomicComponent) eObj;
					break;
				}
			}
			if(obj instanceof AtomicComponent){
				comp = (AtomicComponent) obj;
				break;
			}
		}
		if(comp.eResource().isModified()){
			CommandResult.newErrorCommandResult("The current resource must be saved.");
		}
		
		if(comp!=null){		
			Job job = new InitialSynthesisJob(comp);
			job.addJobChangeListener(new SynthesisJobChangeAdapter());
			job.schedule();
			
			return CommandResult.newOKCommandResult();
		}
												
		return CommandResult.newErrorCommandResult("No Atomic Component selected.");
	}
}