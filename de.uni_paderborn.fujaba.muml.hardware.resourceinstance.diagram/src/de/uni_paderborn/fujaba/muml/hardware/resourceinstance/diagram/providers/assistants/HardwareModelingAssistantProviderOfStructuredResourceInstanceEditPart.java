package de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class HardwareModelingAssistantProviderOfStructuredResourceInstanceEditPart
		extends
		de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.providers.HardwareModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(6);
		types.add(de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.providers.HardwareElementTypes.CommunicationResource_3008);
		types.add(de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.providers.HardwareElementTypes.CacheInstance_3009);
		types.add(de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.providers.HardwareElementTypes.ProgrammableLogicDeviceInstance_3010);
		types.add(de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.providers.HardwareElementTypes.ProcessorInstance_3011);
		types.add(de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.providers.HardwareElementTypes.ProcessingMemoryInstance_3012);
		types.add(de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.providers.HardwareElementTypes.StorageMemoryInstance_3013);
		return types;
	}

}
