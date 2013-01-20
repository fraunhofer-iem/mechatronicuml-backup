package de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.custom.edit.helpers;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import de.uni_paderborn.fujaba.muml.model.component.ComponentPart;

public class DiscretePortGmfProtocolEditHelperAdvice extends
		AbstractEditHelperAdvice {
	@Override
	protected ICommand getBeforeCreateCommand(CreateElementRequest request) {
		// TODO Auto-generated method stub
		return super.getBeforeCreateCommand(request);
	}

	@Override
	protected ICommand getBeforeConfigureCommand(ConfigureRequest request) {
		// TODO Auto-generated method stub
		return super.getBeforeConfigureCommand(request);
	}

	@Override
	protected ICommand getAfterCreateCommand(CreateElementRequest request) {
		// TODO Auto-generated method stub
		return super.getAfterCreateCommand(request);
	}

	@Override
	protected ICommand getAfterConfigureCommand(ConfigureRequest request) {
		// TODO Auto-generated method stub
		return super.getAfterConfigureCommand(request);
	}

}
