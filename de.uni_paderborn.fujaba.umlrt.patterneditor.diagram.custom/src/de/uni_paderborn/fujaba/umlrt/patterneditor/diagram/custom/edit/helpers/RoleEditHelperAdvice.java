package de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.custom.edit.helpers;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.ConfigureElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;

import de.uni_paderborn.fujaba.umlrt.model.pattern.Role;
import de.uni_paderborn.fujaba.umlrt.patterneditor.PatternDiagram;

/**
 * An EditHelperAdvice for Roles. It makes sure newly created Roles are
 * automatically connected to the CoordinationPattern.
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
				EObject eContainer = role.eContainer();
				if (eContainer instanceof PatternDiagram) {
					PatternDiagram patternDiagram = (PatternDiagram) eContainer;
					role.setPattern(patternDiagram.getCoordinationPattern());
				}
				return CommandResult.newOKCommandResult(role);
			}

		};

	}
}
