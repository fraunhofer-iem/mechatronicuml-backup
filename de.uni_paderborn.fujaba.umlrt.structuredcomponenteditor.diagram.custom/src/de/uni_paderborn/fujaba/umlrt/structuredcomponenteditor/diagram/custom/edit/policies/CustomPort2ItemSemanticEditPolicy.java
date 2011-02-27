package de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.custom.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.policies.Port2ItemSemanticEditPolicy;

public class CustomPort2ItemSemanticEditPolicy extends Port2ItemSemanticEditPolicy {
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return UnexecutableCommand.INSTANCE;
	}
}
