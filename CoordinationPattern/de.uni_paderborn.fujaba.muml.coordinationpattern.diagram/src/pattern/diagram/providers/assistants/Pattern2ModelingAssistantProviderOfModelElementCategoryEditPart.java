package pattern.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import pattern.diagram.providers.Pattern2ElementTypes;
import pattern.diagram.providers.Pattern2ModelingAssistantProvider;

/**
 * @generated
 */
public class Pattern2ModelingAssistantProviderOfModelElementCategoryEditPart
		extends Pattern2ModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(Pattern2ElementTypes.CoordinationPattern_2001);
		return types;
	}

}
