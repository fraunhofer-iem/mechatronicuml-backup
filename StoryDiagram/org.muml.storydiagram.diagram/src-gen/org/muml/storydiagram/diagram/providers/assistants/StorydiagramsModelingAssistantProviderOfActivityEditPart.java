package org.muml.storydiagram.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.muml.storydiagram.diagram.providers.StorydiagramsElementTypes;
import org.muml.storydiagram.diagram.providers.StorydiagramsModelingAssistantProvider;

/**
 * @generated
 */
public class StorydiagramsModelingAssistantProviderOfActivityEditPart extends StorydiagramsModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(8);
		types.add(StorydiagramsElementTypes.ActivityCallNode_2001);
		types.add(StorydiagramsElementTypes.StatementNode_2002);
		types.add(StorydiagramsElementTypes.ModifyingStoryNode_2003);
		types.add(StorydiagramsElementTypes.MatchingStoryNode_2004);
		types.add(StorydiagramsElementTypes.InitialNode_2005);
		types.add(StorydiagramsElementTypes.JunctionNode_2006);
		types.add(StorydiagramsElementTypes.FlowFinalNode_2007);
		types.add(StorydiagramsElementTypes.ActivityFinalNode_2008);
		return types;
	}

}
