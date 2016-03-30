package org.muml.pim.pattern.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class MumlModelingAssistantProviderOfMessageTypeEditPart
		extends org.muml.pim.pattern.diagram.providers.MumlModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(org.muml.pim.pattern.diagram.providers.MumlElementTypes.Parameter_3006);
		return types;
	}

}
