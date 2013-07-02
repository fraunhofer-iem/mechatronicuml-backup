package de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.custom.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart;
import de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.commands.TransitionReorientCommand;

public class CustomTransitionReorientCommand extends TransitionReorientCommand {

	public CustomTransitionReorientCommand(ReorientRelationshipRequest request) {
		super(request);
	}
	
	public RealtimeStatechart getContainer() {
		if (getLink() == null) {
			return null;
		}
		RealtimeStatechart container = TransitionContainmentUtil.getStatechart(getLink().getSource(), getLink().getTarget());
		if (container != null) {
			return container;
		}
		return getLink().getStatechart();
	}
	
	@Override
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		CommandResult result = super.doExecuteWithResult(monitor, info);
		if (result.getStatus().isOK()) {
			reorientContainer();
		}
		return result;
	}

	protected void reorientContainer() {
		RealtimeStatechart newContainer = getContainer();
		if (newContainer != null && newContainer != getLink().getStatechart()) {
			getLink().setStatechart(newContainer);
		}
	}

}
