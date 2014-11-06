package org.storydriven.storydiagrams.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.storydriven.storydiagrams.diagram.edit.parts.ActivityCallNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ActivityFinalNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.FlowFinalNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.InitialNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.JunctionNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.MatchingStoryNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.ModifyingStoryNodeEditPart;
import org.storydriven.storydiagrams.diagram.edit.parts.StatementNodeEditPart;
import org.storydriven.storydiagrams.diagram.providers.StorydiagramsElementTypes;
import org.storydriven.storydiagrams.diagram.providers.StorydiagramsModelingAssistantProvider;

/**
 * @generated
 */
public class StorydiagramsModelingAssistantProviderOfFlowFinalNodeEditPart
		extends StorydiagramsModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((FlowFinalNodeEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(FlowFinalNodeEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(StorydiagramsElementTypes.ActivityEdge_4001);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget(
				(FlowFinalNodeEditPart) sourceEditPart, targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			FlowFinalNodeEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof ActivityCallNodeEditPart) {
			types.add(StorydiagramsElementTypes.ActivityEdge_4001);
		}
		if (targetEditPart instanceof StatementNodeEditPart) {
			types.add(StorydiagramsElementTypes.ActivityEdge_4001);
		}
		if (targetEditPart instanceof ModifyingStoryNodeEditPart) {
			types.add(StorydiagramsElementTypes.ActivityEdge_4001);
		}
		if (targetEditPart instanceof MatchingStoryNodeEditPart) {
			types.add(StorydiagramsElementTypes.ActivityEdge_4001);
		}
		if (targetEditPart instanceof InitialNodeEditPart) {
			types.add(StorydiagramsElementTypes.ActivityEdge_4001);
		}
		if (targetEditPart instanceof JunctionNodeEditPart) {
			types.add(StorydiagramsElementTypes.ActivityEdge_4001);
		}
		if (targetEditPart instanceof FlowFinalNodeEditPart) {
			types.add(StorydiagramsElementTypes.ActivityEdge_4001);
		}
		if (targetEditPart instanceof ActivityFinalNodeEditPart) {
			types.add(StorydiagramsElementTypes.ActivityEdge_4001);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((FlowFinalNodeEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(FlowFinalNodeEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == StorydiagramsElementTypes.ActivityEdge_4001) {
			types.add(StorydiagramsElementTypes.ActivityCallNode_2001);
			types.add(StorydiagramsElementTypes.StatementNode_2002);
			types.add(StorydiagramsElementTypes.ModifyingStoryNode_2003);
			types.add(StorydiagramsElementTypes.MatchingStoryNode_2004);
			types.add(StorydiagramsElementTypes.InitialNode_2005);
			types.add(StorydiagramsElementTypes.JunctionNode_2006);
			types.add(StorydiagramsElementTypes.FlowFinalNode_2007);
			types.add(StorydiagramsElementTypes.ActivityFinalNode_2008);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((FlowFinalNodeEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(FlowFinalNodeEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(StorydiagramsElementTypes.ActivityEdge_4001);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((FlowFinalNodeEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(FlowFinalNodeEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == StorydiagramsElementTypes.ActivityEdge_4001) {
			types.add(StorydiagramsElementTypes.ActivityCallNode_2001);
			types.add(StorydiagramsElementTypes.StatementNode_2002);
			types.add(StorydiagramsElementTypes.ModifyingStoryNode_2003);
			types.add(StorydiagramsElementTypes.MatchingStoryNode_2004);
			types.add(StorydiagramsElementTypes.InitialNode_2005);
			types.add(StorydiagramsElementTypes.JunctionNode_2006);
			types.add(StorydiagramsElementTypes.FlowFinalNode_2007);
			types.add(StorydiagramsElementTypes.ActivityFinalNode_2008);
		}
		return types;
	}

}
