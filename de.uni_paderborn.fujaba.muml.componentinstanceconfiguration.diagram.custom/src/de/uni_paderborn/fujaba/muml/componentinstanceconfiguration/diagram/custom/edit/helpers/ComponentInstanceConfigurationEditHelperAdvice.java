package de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.custom.edit.helpers;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;

import de.uni_paderborn.fujaba.muml.instance.ComponentInstanceConfiguration;

/**
 * An EditHelperAdvice for the DiscreteMultiPortInstance.
 * 
 * @author bingo
 * 
 */
public class ComponentInstanceConfigurationEditHelperAdvice extends AbstractEditHelperAdvice {
	@Override
	protected ICommand getAfterConfigureCommand(ConfigureRequest request) {
		// TODO Auto-generated method stub
		return super.getAfterConfigureCommand(request);
	}
	
	@Override
	public ICommand getAfterEditCommand(IEditCommandRequest request) {
		// TODO Auto-generated method stub
		return super.getAfterEditCommand(request);
	}
	
	@Override
	protected ICommand getAfterCreateCommand(final CreateElementRequest request) {
//		
//		return new EditElementCommand("Set default name for Component Instance Configuration", request.getNewElement(), request) {
//
//			@Override
//			protected CommandResult doExecuteWithResult(
//					IProgressMonitor monitor, IAdaptable info)
//					throws ExecutionException {
//				//ComponentInstanceConfiguration cic = (ComponentInstanceConfiguration) request.getNewElement();
//				//cic.setName("Test");
//				
//				return CommandResult.newOKCommandResult(request.getNewElement());
//			} 
//		};
		return super.getAfterCreateCommand(request);
	}

}
