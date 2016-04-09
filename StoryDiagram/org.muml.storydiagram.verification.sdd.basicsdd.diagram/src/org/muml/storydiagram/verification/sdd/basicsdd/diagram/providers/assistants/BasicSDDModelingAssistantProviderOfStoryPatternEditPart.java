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
public class BasicSDDModelingAssistantProviderOfStoryPatternEditPart extends BasicSDDModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(BasicSDDElementTypes.Constraint_3010);
		return types;
	}

}
