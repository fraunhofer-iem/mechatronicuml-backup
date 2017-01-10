package org.muml.pim.pattern.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.muml.pim.pattern.diagram.edit.parts.CoordinationPattern2EditPart;
import org.muml.pim.pattern.diagram.edit.parts.RoleEditPart;
import org.muml.pim.pattern.diagram.providers.MumlElementTypes;
import org.muml.pim.pattern.diagram.providers.MumlModelingAssistantProvider;

/**
 * @generated
 */
public class MumlModelingAssistantProviderOfCoordinationPattern2EditPart extends MumlModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((CoordinationPattern2EditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(CoordinationPattern2EditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(MumlElementTypes.AbstractCoordinationSpecificationRoles_4002);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((CoordinationPattern2EditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(CoordinationPattern2EditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof RoleEditPart) {
			types.add(MumlElementTypes.AbstractCoordinationSpecificationRoles_4002);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((CoordinationPattern2EditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(CoordinationPattern2EditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == MumlElementTypes.AbstractCoordinationSpecificationRoles_4002) {
			types.add(MumlElementTypes.Role_3002);
		}
		return types;
	}

}
