package de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.custom.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;

import de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.policies.StructuredComponentComponentCompartmentItemSemanticEditPolicy;

public class CustomStructuredComponentComponentCompartmentItemSemanticEditPolicy
		extends StructuredComponentComponentCompartmentItemSemanticEditPolicy {

	protected Command getSemanticCommand(IEditCommandRequest request) {
		if (request instanceof DestroyRequest) {
			return null;
		}
		return super.getSemanticCommand(request);
	}
	
}
