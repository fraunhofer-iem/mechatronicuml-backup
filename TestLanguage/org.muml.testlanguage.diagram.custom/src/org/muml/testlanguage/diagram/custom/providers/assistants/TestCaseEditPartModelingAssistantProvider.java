package org.muml.testlanguage.diagram.custom.providers.assistants;

import java.util.Collections;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.muml.testlanguage.diagram.providers.TestLanguageModelingAssistantProvider;

public class TestCaseEditPartModelingAssistantProvider extends
		TestLanguageModelingAssistantProvider {
	
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		return Collections.emptyList();
	}

}
