package org.muml.cbs.dependencylanguage.ui.commands;

import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;
import org.muml.cbs.dependencylanguage.DependencylanguageFactory;
import org.muml.cbs.dependencylanguage.SynthesizableBehavior;
import org.muml.mumlcore.CorePackage;
import org.muml.pim.component.AtomicComponent;

public class CreateSynthesizableBehaviorCommand extends AbstractHandler {

	public CreateSynthesizableBehaviorCommand() {
		
	}

	public Object execute(ExecutionEvent event) {
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
		if(comp!=null){
			SynthesizableBehavior syn = DependencylanguageFactory.eINSTANCE.createSynthesizableBehavior();
			EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(comp);
			if(domain!=null){
				Command set = SetCommand.create(domain,syn,CorePackage.Literals.EXTENSION__EXTENDABLE_BASE,comp);
				domain.getCommandStack().execute(set);
			}
			else{
				syn.eSet(CorePackage.Literals.EXTENSION__EXTENDABLE_BASE,comp);
			}
		}
		return null;
	}
}