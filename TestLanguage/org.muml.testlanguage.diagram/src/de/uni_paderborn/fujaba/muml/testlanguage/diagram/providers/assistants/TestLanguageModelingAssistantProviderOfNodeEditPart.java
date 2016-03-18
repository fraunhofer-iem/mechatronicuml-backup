package de.uni_paderborn.fujaba.muml.testlanguage.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class TestLanguageModelingAssistantProviderOfNodeEditPart
		extends
		de.uni_paderborn.fujaba.muml.testlanguage.diagram.providers.TestLanguageModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(de.uni_paderborn.fujaba.muml.testlanguage.diagram.providers.TestLanguageElementTypes.Input_3001);
		types.add(de.uni_paderborn.fujaba.muml.testlanguage.diagram.providers.TestLanguageElementTypes.Output_3002);
		return types;
	}

}
