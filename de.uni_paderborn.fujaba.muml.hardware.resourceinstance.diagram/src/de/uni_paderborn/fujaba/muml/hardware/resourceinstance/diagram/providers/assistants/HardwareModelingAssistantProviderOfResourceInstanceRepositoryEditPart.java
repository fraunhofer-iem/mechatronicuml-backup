package de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class HardwareModelingAssistantProviderOfResourceInstanceRepositoryEditPart
		extends
		de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.providers.HardwareModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.providers.HardwareElementTypes.SensorInstance_2004);
		types.add(de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.providers.HardwareElementTypes.ActuatorInstance_2005);
		types.add(de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.providers.HardwareElementTypes.StructuredResourceInstance_2006);
		return types;
	}

}
