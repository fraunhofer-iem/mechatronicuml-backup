package org.muml.testlanguage.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.muml.testlanguage.diagram.providers.TestLanguageElementTypes;
import org.muml.testlanguage.diagram.providers.TestLanguageModelingAssistantProvider;

/**
 * @generated
 */
public class TestLanguageModelingAssistantProviderOfNodeEditPart extends TestLanguageModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(TestLanguageElementTypes.Input_3001);
		types.add(TestLanguageElementTypes.Output_3002);
		return types;
	}

}
