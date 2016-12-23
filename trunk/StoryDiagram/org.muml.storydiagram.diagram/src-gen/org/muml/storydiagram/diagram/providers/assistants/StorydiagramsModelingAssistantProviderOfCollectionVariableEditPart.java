package org.muml.storydiagram.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.muml.storydiagram.diagram.edit.parts.CollectionVariableEditPart;
import org.muml.storydiagram.diagram.edit.parts.ObjectVariableEditPart;
import org.muml.storydiagram.diagram.providers.StorydiagramsElementTypes;
import org.muml.storydiagram.diagram.providers.StorydiagramsModelingAssistantProvider;

/**
 * @generated
 */
public class StorydiagramsModelingAssistantProviderOfCollectionVariableEditPart
		extends StorydiagramsModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(StorydiagramsElementTypes.Constraint_3004);
		types.add(StorydiagramsElementTypes.AttributeAssignment_3003);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((CollectionVariableEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(CollectionVariableEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(StorydiagramsElementTypes.LinkVariable_4002);
		types.add(StorydiagramsElementTypes.InclusionLink_4003);
		types.add(StorydiagramsElementTypes.MaybeLink_4004);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((CollectionVariableEditPart) sourceEditPart, targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(CollectionVariableEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof CollectionVariableEditPart) {
			types.add(StorydiagramsElementTypes.LinkVariable_4002);
		}
		if (targetEditPart instanceof ObjectVariableEditPart) {
			types.add(StorydiagramsElementTypes.LinkVariable_4002);
		}
		if (targetEditPart instanceof CollectionVariableEditPart) {
			types.add(StorydiagramsElementTypes.InclusionLink_4003);
		}
		if (targetEditPart instanceof ObjectVariableEditPart) {
			types.add(StorydiagramsElementTypes.InclusionLink_4003);
		}
		if (targetEditPart instanceof CollectionVariableEditPart) {
			types.add(StorydiagramsElementTypes.MaybeLink_4004);
		}
		if (targetEditPart instanceof ObjectVariableEditPart) {
			types.add(StorydiagramsElementTypes.MaybeLink_4004);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((CollectionVariableEditPart) sourceEditPart, relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(CollectionVariableEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == StorydiagramsElementTypes.LinkVariable_4002) {
			types.add(StorydiagramsElementTypes.CollectionVariable_3002);
			types.add(StorydiagramsElementTypes.ObjectVariable_3005);
		} else if (relationshipType == StorydiagramsElementTypes.InclusionLink_4003) {
			types.add(StorydiagramsElementTypes.CollectionVariable_3002);
			types.add(StorydiagramsElementTypes.ObjectVariable_3005);
		} else if (relationshipType == StorydiagramsElementTypes.MaybeLink_4004) {
			types.add(StorydiagramsElementTypes.CollectionVariable_3002);
			types.add(StorydiagramsElementTypes.ObjectVariable_3005);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((CollectionVariableEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(CollectionVariableEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(StorydiagramsElementTypes.LinkVariable_4002);
		types.add(StorydiagramsElementTypes.InclusionLink_4003);
		types.add(StorydiagramsElementTypes.MaybeLink_4004);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((CollectionVariableEditPart) targetEditPart, relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(CollectionVariableEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == StorydiagramsElementTypes.LinkVariable_4002) {
			types.add(StorydiagramsElementTypes.CollectionVariable_3002);
			types.add(StorydiagramsElementTypes.ObjectVariable_3005);
		} else if (relationshipType == StorydiagramsElementTypes.InclusionLink_4003) {
			types.add(StorydiagramsElementTypes.CollectionVariable_3002);
			types.add(StorydiagramsElementTypes.ObjectVariable_3005);
		} else if (relationshipType == StorydiagramsElementTypes.MaybeLink_4004) {
			types.add(StorydiagramsElementTypes.CollectionVariable_3002);
			types.add(StorydiagramsElementTypes.ObjectVariable_3005);
		}
		return types;
	}

}
