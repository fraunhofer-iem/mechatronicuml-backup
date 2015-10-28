package de.uni_paderborn.fujaba.muml.testlanguage.diagram.custom.providers.assistants;

import java.util.Collections;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import de.uni_paderborn.fujaba.muml.testlanguage.diagram.providers.TestLanguageModelingAssistantProvider;

public class NodeEditPartModelingAssistantProvider extends
		TestLanguageModelingAssistantProvider {

	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		return Collections.emptyList();
	}
	
}
