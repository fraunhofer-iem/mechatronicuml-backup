package de.uni_paderborn.fujaba.muml.operationrepository.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class MumlModelingAssistantProviderOfModelElementCategoryEditPart
		extends
		de.uni_paderborn.fujaba.muml.operationrepository.diagram.providers.MumlModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(de.uni_paderborn.fujaba.muml.operationrepository.diagram.providers.MumlElementTypes.OperationRepository_2001);
		return types;
	}

}
