package org.muml.pim.realtimestatechart.diagram.custom.edit.policies;





import java.util.Iterator;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.commands.CreateCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.l10n.DiagramUIMessages;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.notation.View;


public class BorderItemCreationEditPolicy extends CreationEditPolicy {

	@Override
	protected Command getCreateCommand(CreateViewRequest request) {
        TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
        .getEditingDomain();
    CompositeTransactionalCommand cc = new CompositeTransactionalCommand(
        editingDomain, DiagramUIMessages.AddCommand_Label);
    
    Iterator descriptors = request.getViewDescriptors().iterator();

	while (descriptors.hasNext()) {
		CreateViewRequest.ViewDescriptor descriptor =
			(CreateViewRequest.ViewDescriptor)descriptors.next();

		CreateCommand createCommand =
				new BorderItemCreateCommand(editingDomain,
				descriptor, 
				(View)(getHost().getModel()),request.getLocation(),(IGraphicalEditPart) getHost());
	
		cc.compose(createCommand);
	}
	return new ICommandProxy(cc.reduce());
	}

	
}
