package de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.custom.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;

import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart;
import de.uni_paderborn.fujaba.muml.realtimestatechart.Vertex;
import de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.commands.TransitionCreateCommand;

public class CustomTransitionCreateCommand extends TransitionCreateCommand {

	public CustomTransitionCreateCommand(CreateRelationshipRequest request,
			EObject source, EObject target) {
		super(request, source, target);
	}
	
	@Override
	public RealtimeStatechart getContainer() {
		RealtimeStatechart container = TransitionContainmentUtil.getStatechart(getSource(), getTarget());
		if (container != null) {
			return container;
		}
		return super.getContainer();
	}
	
}
