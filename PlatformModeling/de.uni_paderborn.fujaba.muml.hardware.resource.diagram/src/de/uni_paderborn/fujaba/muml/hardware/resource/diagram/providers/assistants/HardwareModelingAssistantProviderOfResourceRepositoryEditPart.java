package de.uni_paderborn.fujaba.muml.hardware.resource.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class HardwareModelingAssistantProviderOfResourceRepositoryEditPart
		extends
		de.uni_paderborn.fujaba.muml.hardware.resource.diagram.providers.HardwareModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(de.uni_paderborn.fujaba.muml.hardware.resource.diagram.providers.HardwareElementTypes.Device_2006);
		types.add(de.uni_paderborn.fujaba.muml.hardware.resource.diagram.providers.HardwareElementTypes.StructuredResource_2007);
		types.add(de.uni_paderborn.fujaba.muml.hardware.resource.diagram.providers.HardwareElementTypes.CommunicationProtocolRepository_2008);
		return types;
	}

}
