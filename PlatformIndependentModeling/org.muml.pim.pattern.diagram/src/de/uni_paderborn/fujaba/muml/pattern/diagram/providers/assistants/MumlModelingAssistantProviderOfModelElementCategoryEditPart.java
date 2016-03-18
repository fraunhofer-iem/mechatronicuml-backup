package de.uni_paderborn.fujaba.muml.pattern.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class MumlModelingAssistantProviderOfModelElementCategoryEditPart
		extends de.uni_paderborn.fujaba.muml.pattern.diagram.providers.MumlModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(de.uni_paderborn.fujaba.muml.pattern.diagram.providers.MumlElementTypes.CoordinationPattern_2001);
		types.add(
				de.uni_paderborn.fujaba.muml.pattern.diagram.providers.MumlElementTypes.CoordinationPatternVariant_2002);
		return types;
	}

}