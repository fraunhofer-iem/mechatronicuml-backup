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
	
	public static RealtimeStatechart getStatechart(Vertex source, Vertex target) {
		// Source
		if (source instanceof ExitPoint) {
			source = ((ExitPoint) source).getState(); // getState() could return null, but the next instanceof will take care of that.
		}
		if (source instanceof State) { // Checking for instanceof also does the null check
			return ((State)source).getParentStatechart();
		}
		
		// Target
		if (target instanceof EntryPoint) {
			target = ((EntryPoint) target).getState(); // getState() could return null, but the next instanceof will take care of that.
		}
		if (target instanceof State) { // Checking for instanceof also does the null check
			return ((State)target).getParentStatechart();
		}
		
		return null;
	}
	
	
	//
	// @Override
	// protected ICommand getBeforeReorientRelationshipCommand(
	// ReorientRelationshipRequest request) {
	// return super.getBeforeReorientRelationshipCommand(request);
	// }

	@Override
	protected ICommand getAfterReorientRelationshipCommand(
			final ReorientRelationshipRequest request) {
		return new EditElementCommand(request.getLabel(), request.getRelationship(), request) {

			@Override
			protected CommandResult doExecuteWithResult(
					IProgressMonitor monitor, IAdaptable info)
					throws ExecutionException {

				Transition transition = (Transition) request.getRelationship();

				RealtimeStatechart statechart = getStatechart(transition.getSource(), transition.getTarget());
				if (statechart != null && statechart != transition.getStatechart()) {
					statechart.getTransitions().add(transition);
				}
				
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

				RealtimeStatechart statechart = getStatechart(transition.getSource(), transition.getTarget());
				if (statechart != null && statechart != transition.getStatechart()) {
					statechart.getTransitions().add(transition);
				}
				
				return CommandResult.newOKCommandResult(transition);
			}

		};
	}
	
}
