package de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.custom.edit.helpers;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.ConfigureElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;

import de.uni_paderborn.fujaba.muml.protocol.Role;

/**
 * An EditHelperAdvice for Roles. It makes sure newly created Roles are
 * automatically connected to the CoordinationProtocol.
 * 
 * @author bingo
 * 
 */
public class RoleEditHelperAdvice extends AbstractEditHelperAdvice {

	protected ICommand getAfterConfigureCommand(final ConfigureRequest request) {

		return new ConfigureElementCommand(request) {

			@Override
			protected CommandResult doExecuteWithResult(
					IProgressMonitor monitor, IAdaptable info)
					throws ExecutionException {

				Role role = (Role) request.getElementToConfigure();
//				EObject eContainer = role.eContainer();
//				if (eContainer instanceof PatternDiagram) {
//					PatternDiagram patternDiagram = (PatternDiagram) eContainer;
//					role.setPattern(patternDiagram.getCoordinationProtocol());
//				}
				return CommandResult.newOKCommandResult(role);
			}

		};

	}
}
