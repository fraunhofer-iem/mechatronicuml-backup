package de.uni_paderborn.fujaba.muml.pattern.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class PatternModelingAssistantProviderOfMessageTypeEditPart
		extends
		de.uni_paderborn.fujaba.muml.pattern.diagram.providers.PatternModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(de.uni_paderborn.fujaba.muml.pattern.diagram.providers.PatternElementTypes.Parameter_3006);
		return types;
	}

}
