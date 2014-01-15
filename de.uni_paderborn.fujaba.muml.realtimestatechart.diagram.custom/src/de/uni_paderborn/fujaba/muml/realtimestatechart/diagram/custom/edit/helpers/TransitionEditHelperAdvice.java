package de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.custom.edit.helpers;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.ConfigureElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import de.uni_paderborn.fujaba.muml.realtimestatechart.EntryPoint;
import de.uni_paderborn.fujaba.muml.realtimestatechart.ExitPoint;
import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart;
import de.uni_paderborn.fujaba.muml.realtimestatechart.State;
import de.uni_paderborn.fujaba.muml.realtimestatechart.Transition;
import de.uni_paderborn.fujaba.muml.realtimestatechart.Vertex;

public class TransitionEditHelperAdvice extends AbstractEditHelperAdvice {

	@Override
	protected ICommand getAfterReorientRelationshipCommand(
			final ReorientRelationshipRequest request) {
		return new EditElementCommand(request.getLabel(), request.getRelationship(), request) {

			@Override
			protected CommandResult doExecuteWithResult(
					IProgressMonitor monitor, IAdaptable info)
					throws ExecutionException {

				Transition transition = (Transition) request.getRelationship();
				configure(transition);
				
				return CommandResult.newOKCommandResult(transition);
			}


		};
	}

	@Override
	protected ICommand getAfterConfigureCommand(final ConfigureRequest request) {
		return new ConfigureElementCommand(request) {

			@Override
			protected CommandResult doExecuteWithResult(
					IProgressMonitor monitor, IAdaptable info)
					throws ExecutionException {

				Transition transition = (Transition) request.getElementToConfigure();
				configure(transition);

				return CommandResult.newOKCommandResult(transition);
			}

		};
	}
	
	private void configure(Transition transition) {

		RealtimeStatechart statechart = transition.getStatechart();
		if (statechart != null && transition.eContainer() != statechart) {
			statechart.getTransitions().add(transition);
		}
				
	}
}
