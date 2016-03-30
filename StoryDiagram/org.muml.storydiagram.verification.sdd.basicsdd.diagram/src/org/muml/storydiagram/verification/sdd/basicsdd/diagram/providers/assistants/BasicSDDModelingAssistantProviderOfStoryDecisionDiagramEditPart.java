package org.muml.storydiagram.verification.sdd.basicsdd.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class BasicSDDModelingAssistantProviderOfStoryDecisionDiagramEditPart
		extends
		org.muml.storydiagram.verification.sdd.basicsdd.diagram.providers.BasicSDDModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(org.muml.storydiagram.verification.sdd.basicsdd.diagram.providers.BasicSDDElementTypes.StoryPatternNode_2003);
		types.add(org.muml.storydiagram.verification.sdd.basicsdd.diagram.providers.BasicSDDElementTypes.LeafNode_2004);
		return types;
	}

}
