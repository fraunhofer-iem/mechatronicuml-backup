package de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.custom.edit.policies;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;

import de.uni_paderborn.fujaba.umlrt.model.component.ComponentPart;
import de.uni_paderborn.fujaba.umlrt.model.component.StructuredComponent;
import de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.custom.edit.commands.CustomAssemblyCreateCommand;
import de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.custom.edit.commands.CustomDelegationCreateCommand;
import de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.Port2EditPart;
import de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.PortEditPart;

/**
 * This class contains all logic that is common between
 * CustomPortItemSemanticEditPolicy and CustomPort2ItemSemanticEditPolicy.
 * 
 * @author bingo
 */
public class CustomPortItemSemanticDelegation {

	/**
	 * This request parameter stores the target model element that an editpart
	 * is stored for.
	 */
	public static final String PARAMETER_SOURCE = "Parameter_Source";

	/**
	 * This request parameter stores the source model element that an editpart
	 * is stored for.
	 */
	public static final String PARAMETER_TARGET = "Parameter_Target";

	/**
	 * This request parameter stores the EditPart for the given source element.
	 */
	public static final String PARAMETER_SOURCE_EDITPART = "Parameter_SourceEditPart";

	/**
	 * This request parameter stores the EditPart for the given target element.
	 */
	public static final String PARAMETER_TARGET_EDITPART = "Parameter_TargetEditPart";

	/**
	 * Creates a CustomDelegationCreateCommand.
	 * 
	 * @param req
	 *            The Request, which should also contain values for Parameters
	 *            PARAMETER_SOURCE_EDITPART, PARAMETER_TARGET_EDITPART, if
	 *            available.
	 * @return the CustomDelegationCreateCommand.
	 */
	public CustomDelegationCreateCommand getDelegationCreateCommand(
			CreateRelationshipRequest req) {

		List<EditPart> editParts = new LinkedList<EditPart>();
		Object sourceEditPart = req.getParameter(PARAMETER_SOURCE_EDITPART);
		if (sourceEditPart instanceof EditPart) {
			editParts.add((EditPart) sourceEditPart);
		}

		Object targetEditPart = req.getParameter(PARAMETER_TARGET_EDITPART);
		if (targetEditPart instanceof EditPart) {
			editParts.add((EditPart) targetEditPart);
		}

		// Now get the parent elements
		ComponentPart componentPart = null;
		StructuredComponent structuredComponent = null;
		for (EditPart editPart : editParts) {
			if (editPart instanceof PortEditPart) {
				structuredComponent = (StructuredComponent) getParentElement(editPart);
			} else if (editPart instanceof Port2EditPart) {
				componentPart = (ComponentPart) getParentElement(editPart);
			}
		}

		return new CustomDelegationCreateCommand(req, req.getSource(),
				req.getTarget(), componentPart, structuredComponent);
	}

	/**
	 * Creates a CustomAssemblyCreateCommand.
	 * 
	 * @param req
	 *            The Request, which should also contain values for Parameters
	 *            PARAMETER_SOURCE_EDITPART, PARAMETER_TARGET_EDITPART, if
	 *            available.
	 * @return the CustomAssemblyCreateCommand.
	 */
	public CustomAssemblyCreateCommand getAssemblyCreateCommand(
			CreateRelationshipRequest req) {

		EObject sourceComponentPart = null;
		if (req.getSource() != null) {
			Object sourceEditPart = req.getParameter(PARAMETER_SOURCE_EDITPART);
			if (sourceEditPart instanceof EditPart) {
				sourceComponentPart = getParentElement((EditPart) sourceEditPart);
			}
		}

		EObject targetComponentPart = null;
		if (req.getTarget() != null) {
			Object targetEditPart = req.getParameter(PARAMETER_TARGET_EDITPART);
			if (targetEditPart instanceof EditPart) {
				targetComponentPart = getParentElement((EditPart) targetEditPart);
			}
		}

		return new CustomAssemblyCreateCommand(req, req.getSource(),
				req.getTarget(), sourceComponentPart, targetComponentPart);
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

	public EditElementCommand getCreateRelationshipCommand(CreateRelationshipRequest req, EditPart host) {
		if (req.getSource() != req
				.getParameter(CustomPortItemSemanticDelegation.PARAMETER_SOURCE)) {
			req.setParameter(
					CustomPortItemSemanticDelegation.PARAMETER_SOURCE,
					req.getSource());
			req.setParameter(
					CustomPortItemSemanticDelegation.PARAMETER_SOURCE_EDITPART,
					host);
		}
		if (req.getTarget() != req
				.getParameter(CustomPortItemSemanticDelegation.PARAMETER_TARGET)) {
			req.setParameter(
					CustomPortItemSemanticDelegation.PARAMETER_TARGET,
					req.getTarget());
			req.setParameter(
					CustomPortItemSemanticDelegation.PARAMETER_TARGET_EDITPART,
					host);
		}

		if (de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.providers.StructuredcomponentElementTypes.Delegation_4001 == req
				.getElementType()) {

			return getDelegationCreateCommand(req);
		}
		if (de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.providers.StructuredcomponentElementTypes.Assembly_4002 == req
				.getElementType()) {
			return getAssemblyCreateCommand(req);
		}
		return null;
	}

}
