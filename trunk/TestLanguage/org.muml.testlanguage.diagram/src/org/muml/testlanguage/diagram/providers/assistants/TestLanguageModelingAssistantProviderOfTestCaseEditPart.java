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
public class TestLanguageModelingAssistantProviderOfTestCaseEditPart extends TestLanguageModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(TestLanguageElementTypes.Node_2001);
		return types;
	}

}
