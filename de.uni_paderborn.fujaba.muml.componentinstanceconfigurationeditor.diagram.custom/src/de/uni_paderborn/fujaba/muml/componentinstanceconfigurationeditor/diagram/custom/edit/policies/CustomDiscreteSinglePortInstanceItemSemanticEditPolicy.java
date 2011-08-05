package de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.custom.edit.policies;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.custom.edit.commands.CustomAssemblyInstanceCreateCommand;
import de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.custom.edit.commands.CustomAssemblyInstanceReorientCommand;
import de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.custom.edit.commands.CustomDelegationInstanceCreateCommand;
import de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.custom.edit.commands.CustomDelegationInstanceReorientCommand;
import de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.policies.DiscreteSinglePortInstanceItemSemanticEditPolicy;
import de.uni_paderborn.fujaba.muml.model.component.ComponentPart;
import de.uni_paderborn.fujaba.muml.model.instance.PortInstance;

/**
 * A customized PortInstanceItemSemanticEditPolicy. We create our customized Delegation
 * and Assembly-CreateCommands here.
 * 
 * @author bingo
 * 
 */
public class CustomDiscreteSinglePortInstanceItemSemanticEditPolicy extends
DiscreteSinglePortInstanceItemSemanticEditPolicy {

	// TODO: Can we forbid deleting the view element.
	/**
	 * Deleting a PartPort also deletes the Port on Type-Layer. So we forbid
	 * deleting this model element; instead only the view object will be
	 * deleted.
	 */
	@Override
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		if (getParentElement(getHost()) instanceof ComponentPart) {
			return UnexecutableCommand.INSTANCE;
		}
		return super.getDestroyElementCommand(req);
	}

	@Override
	public Command getCreateRelationshipCommand(CreateRelationshipRequest req) {

		if (de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlElementTypes.DelegationInstance_4004 == req
				.getElementType()) {
			return getGEFWrapper(getDelegationInstanceCreateCommand(req));
		}
		if (de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlElementTypes.AssemblyInstance_4003 == req
				.getElementType()) {
			return getGEFWrapper(getAssemblyInstanceCreateCommand(req));
		}
		return super.getCreateRelationshipCommand(req);
	}

	@Override
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DelegationInstanceEditPart.VISUAL_ID:
			return getGEFWrapper(getDelegationInstanceReorientCommand(req));
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.AssemblyInstanceEditPart.VISUAL_ID:
			return getGEFWrapper(getAssemblyInstanceReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

	private CustomDelegationInstanceCreateCommand getDelegationInstanceCreateCommand(
			CreateRelationshipRequest req) {

		PortInstance sourcePortInstance = (PortInstance) req.getSource();
		PortInstance targetPortInstance = (PortInstance) req.getTarget();

		return new CustomDelegationInstanceCreateCommand(req, sourcePortInstance, targetPortInstance);
	}

	/**
	 * Creates a CustomAssemblyCreateCommand.
	 * 
	 * @param req
	 * @return the CustomAssemblyCreateCommand.
	 */
	private CustomAssemblyInstanceCreateCommand getAssemblyInstanceCreateCommand(
			CreateRelationshipRequest req) {

		PortInstance sourcePortInstance = (PortInstance) req.getSource();
		PortInstance targetPortInstance = (PortInstance) req.getTarget();

		return new CustomAssemblyInstanceCreateCommand(req, sourcePortInstance, targetPortInstance);
	}

	private CustomDelegationInstanceReorientCommand getDelegationInstanceReorientCommand(
			ReorientRelationshipRequest req) {
		return new CustomDelegationInstanceReorientCommand(req);
	}

	private CustomAssemblyInstanceReorientCommand getAssemblyInstanceReorientCommand(
			ReorientRelationshipRequest req) {
		
		return new CustomAssemblyInstanceReorientCommand(req);
	}

	/**
	 * Retrieves the model element of the editPart's parent EditPart.
	 * 
	 * @param editPart
	 *            the editPart.
	 * @return the model element of the parent EditPart.
	 */
	private EObject getParentElement(EditPart editPart) {
		ShapeNodeEditPart parentEditPart = (ShapeNodeEditPart) editPart
				.getParent();
		return parentEditPart.getNotationView().getElement();
	}

}
