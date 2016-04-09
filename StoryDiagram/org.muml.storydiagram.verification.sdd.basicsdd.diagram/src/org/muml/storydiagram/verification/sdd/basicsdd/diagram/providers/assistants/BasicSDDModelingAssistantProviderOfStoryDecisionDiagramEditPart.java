package org.muml.storydiagram.verification.sdd.basicsdd.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.providers.BasicSDDElementTypes;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.providers.BasicSDDModelingAssistantProvider;

/**
 * @generated
 */
public class BasicSDDModelingAssistantProviderOfStoryDecisionDiagramEditPart extends BasicSDDModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(BasicSDDElementTypes.StoryPatternNode_2003);
		types.add(BasicSDDElementTypes.LeafNode_2004);
		return types;
	}

}
