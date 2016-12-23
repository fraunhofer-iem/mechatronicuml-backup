package org.muml.pm.hardware.common.edit.policies.container;

import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.AbstractEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.l10n.DiagramUIMessages;


public class AutoSizeContainerEditPolicy extends AbstractEditPolicy {

	@Override
	public Command getCommand(Request request) {

		if (request instanceof AutoSizeContainerRequest) {
			return new ICommandProxy(new AutoSizeContainerCommand(
					((IGraphicalEditPart) getHost()).getEditingDomain(),
					DiagramUIMessages.SetAutoSizeCommand_Label, null,
					(IGraphicalEditPart) getHost()));
		} else {

			return null;
		}
	}

}
