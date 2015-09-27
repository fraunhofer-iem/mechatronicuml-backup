package de.uni_paderborn.fujaba.muml.pattern.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class MumlModelingAssistantProviderOfRoleEditPart
		extends de.uni_paderborn.fujaba.muml.pattern.diagram.providers.MumlModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource(
				(de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.RoleEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(
			de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.RoleEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(de.uni_paderborn.fujaba.muml.pattern.diagram.providers.MumlElementTypes.RoleConnector_4001);
		types.add(
				de.uni_paderborn.fujaba.muml.pattern.diagram.providers.MumlElementTypes.DiscreteInteractionEndpointReceiverMessageBuffer_4003);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget(
				(de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.RoleEditPart) sourceEditPart, targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.RoleEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.RoleEditPart) {
			types.add(de.uni_paderborn.fujaba.muml.pattern.diagram.providers.MumlElementTypes.RoleConnector_4001);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.MessageBufferEditPart) {
			types.add(
					de.uni_paderborn.fujaba.muml.pattern.diagram.providers.MumlElementTypes.DiscreteInteractionEndpointReceiverMessageBuffer_4003);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget(
				(de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.RoleEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(
			de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.RoleEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == de.uni_paderborn.fujaba.muml.pattern.diagram.providers.MumlElementTypes.RoleConnector_4001) {
			types.add(de.uni_paderborn.fujaba.muml.pattern.diagram.providers.MumlElementTypes.Role_3002);
		} else
			if (relationshipType == de.uni_paderborn.fujaba.muml.pattern.diagram.providers.MumlElementTypes.DiscreteInteractionEndpointReceiverMessageBuffer_4003) {
			types.add(de.uni_paderborn.fujaba.muml.pattern.diagram.providers.MumlElementTypes.MessageBuffer_3004);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget(
				(de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.RoleEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(
			de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.RoleEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(
				de.uni_paderborn.fujaba.muml.pattern.diagram.providers.MumlElementTypes.AbstractCoordinationSpecificationRoles_4002);
		types.add(de.uni_paderborn.fujaba.muml.pattern.diagram.providers.MumlElementTypes.RoleConnector_4001);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource(
				(de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.RoleEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(
			de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.RoleEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == de.uni_paderborn.fujaba.muml.pattern.diagram.providers.MumlElementTypes.AbstractCoordinationSpecificationRoles_4002) {
			types.add(de.uni_paderborn.fujaba.muml.pattern.diagram.providers.MumlElementTypes.CoordinationPattern_2001);
			types.add(de.uni_paderborn.fujaba.muml.pattern.diagram.providers.MumlElementTypes.CoordinationPattern_3003);
		} else
			if (relationshipType == de.uni_paderborn.fujaba.muml.pattern.diagram.providers.MumlElementTypes.RoleConnector_4001) {
			types.add(de.uni_paderborn.fujaba.muml.pattern.diagram.providers.MumlElementTypes.Role_3002);
		}
		return types;
	}

}
