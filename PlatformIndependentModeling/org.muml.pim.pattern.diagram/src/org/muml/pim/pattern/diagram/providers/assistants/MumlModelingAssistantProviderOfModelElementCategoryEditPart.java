package org.muml.pim.pattern.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.muml.pim.pattern.diagram.providers.MumlElementTypes;
import org.muml.pim.pattern.diagram.providers.MumlModelingAssistantProvider;

/**
 * @generated
 */
public class MumlModelingAssistantProviderOfModelElementCategoryEditPart extends MumlModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(MumlElementTypes.CoordinationPattern_2001);
		types.add(MumlElementTypes.CoordinationPatternVariant_2002);
		return types;
	}

}
