package org.muml.pim.realtimestatechart.diagram.custom.edit.helpers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.ConfigureElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.MoveRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.muml.pim.realtimestatechart.RealtimeStatechart;
import org.muml.pim.realtimestatechart.Region;
import org.muml.pim.realtimestatechart.State;
import org.muml.pim.realtimestatechart.Transition;

public class TransitionContainerAdaptionEditHelperAdvice extends AbstractEditHelperAdvice {

	@Override
	protected ICommand getAfterReorientRelationshipCommand(
			final ReorientRelationshipRequest request) {
		return new EditElementCommand(request.getLabel(), request.getRelationship(), request) {

			@Override
			protected CommandResult doExecuteWithResult(
					IProgressMonitor monitor, IAdaptable info)
					throws ExecutionException {

				Transition transition = (Transition) request.getRelationship();
				adaptContainer(transition);
				
				return CommandResult.newOKCommandResult(transition);
			}


		};
	}

	@Override
	protected ICommand getAfterConfigureCommand(final ConfigureRequest request) {
		if (request.getElementToConfigure() instanceof Transition) {
			return new ConfigureElementCommand(request) {
	
				@Override
				protected CommandResult doExecuteWithResult(
						IProgressMonitor monitor, IAdaptable info)
						throws ExecutionException {
	
					Transition transition = (Transition) request.getElementToConfigure();
					adaptContainer(transition);
				
					return CommandResult.newOKCommandResult(transition);
				}
	
			};
		}
		return super.getAfterConfigureCommand(request);
	}
	

	/**
	 * We will register this EditHelperAdvice also in class State, Region and Realtimestatechart (diagram pane);
	 * so moving those updates
	 */
	@Override
	protected ICommand getAfterMoveCommand(final MoveRequest request) {
		return new EditElementCommand(request.getLabel(), request.getTargetContainer(), request) {

			@Override
			protected CommandResult doExecuteWithResult(
					IProgressMonitor monitor, IAdaptable info)
					throws org.eclipse.core.commands.ExecutionException {
				
				List<Transition> transitions = new ArrayList<Transition>(); 
				for (Object element : request.getElementsToMove().keySet()) {
					transitions.addAll(getTransitions(element));
				}
				for (Transition transition : transitions) {
					adaptContainer(transition);
				}
				return CommandResult.newOKCommandResult();
			}

		};
	}
	
	

	protected Collection<Transition> getTransitions(Object element) {
		if (element instanceof Region) {
			return getTransitions((Region) element);
		} else if (element instanceof State) {
			return getTransitions((State) element);
		} else if (element instanceof RealtimeStatechart) {
			return getTransitions((RealtimeStatechart) element);
		}
		return Collections.emptyList();
	}

	protected Collection<Transition> getTransitions(Region element) {
		if (element.getEmbeddedStatechart() != null) {
			return getTransitions(element.getEmbeddedStatechart());
		}
		return Collections.emptyList();
	}
	
	protected Collection<Transition> getTransitions(RealtimeStatechart element) {
		List<Transition> transitions = new ArrayList<Transition>();
		for (State state : element.getStates()) {
			transitions.addAll(getTransitions(state));
		}
		return transitions;
	}
	
	protected Collection<Transition> getTransitions(State state) {
		List<Transition> transitions = new ArrayList<Transition>();
		transitions.addAll(state.getIncomingTransitions());
		transitions.addAll(state.getOutgoingTransitions());
		return transitions;
	}

	public static void adaptContainer(Transition transition) {

		RealtimeStatechart statechart = transition.getStatechart();
		if (statechart != null && transition.eContainer() != statechart) {
			statechart.getTransitions().add(transition);
		}
				
	}
}
