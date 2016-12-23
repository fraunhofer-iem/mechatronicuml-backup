package org.muml.pm.hardware.common.edit.policies.container;




import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateUnspecifiedTypeRequest;


public class CompartmentChildCreationEditPolicy extends CreationEditPolicy {

	public Command getCommand(Request request) {
		if (understandsRequest(request)) {
			if (request instanceof CreateUnspecifiedTypeRequest){
				CompoundCommand command = new CompoundCommand();
				AutoSizeContainerRequest autosizeRequest = new AutoSizeContainerRequest(
						(IGraphicalEditPart) getHost());
				Command autosizecmd = getHost().getCommand(autosizeRequest);
				Command cmd = super.getCommand(request);
				command.add(cmd);
				command.add(autosizecmd);
				return command;
			} else {
				return super.getCommand(request) ;
			}
		}
		return super.getCommand(request);
	}

	
}
