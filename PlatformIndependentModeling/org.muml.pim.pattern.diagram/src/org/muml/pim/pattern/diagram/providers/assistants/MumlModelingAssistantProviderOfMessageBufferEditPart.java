package org.muml.pim.pattern.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class MumlModelingAssistantProviderOfMessageBufferEditPart
		extends org.muml.pim.pattern.diagram.providers.MumlModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(org.muml.pim.pattern.diagram.providers.MumlElementTypes.MessageType_3005);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget(
				(org.muml.pim.pattern.diagram.edit.parts.MessageBufferEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(
			org.muml.pim.pattern.diagram.edit.parts.MessageBufferEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(
				org.muml.pim.pattern.diagram.providers.MumlElementTypes.DiscreteInteractionEndpointReceiverMessageBuffer_4003);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource(
				(org.muml.pim.pattern.diagram.edit.parts.MessageBufferEditPart) targetEditPart,
				relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(
			org.muml.pim.pattern.diagram.edit.parts.MessageBufferEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == org.muml.pim.pattern.diagram.providers.MumlElementTypes.DiscreteInteractionEndpointReceiverMessageBuffer_4003) {
			types.add(org.muml.pim.pattern.diagram.providers.MumlElementTypes.Role_3002);
		}
		return types;
	}

}
