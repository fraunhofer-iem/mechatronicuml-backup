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
public class MumlModelingAssistantProviderOfCoordinationPatternEditPart
		extends de.uni_paderborn.fujaba.muml.pattern.diagram.providers.MumlModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource(
				(de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.CoordinationPatternEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(
			de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.CoordinationPatternEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(
				de.uni_paderborn.fujaba.muml.pattern.diagram.providers.MumlElementTypes.AbstractCoordinationSpecificationRoles_4002);
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
				(de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.CoordinationPatternEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.CoordinationPatternEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.RoleEditPart) {
			types.add(
					de.uni_paderborn.fujaba.muml.pattern.diagram.providers.MumlElementTypes.AbstractCoordinationSpecificationRoles_4002);
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
				(de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.CoordinationPatternEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(
			de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.CoordinationPatternEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == de.uni_paderborn.fujaba.muml.pattern.diagram.providers.MumlElementTypes.AbstractCoordinationSpecificationRoles_4002) {
			types.add(de.uni_paderborn.fujaba.muml.pattern.diagram.providers.MumlElementTypes.Role_3002);
		}
		return types;
	}

}
