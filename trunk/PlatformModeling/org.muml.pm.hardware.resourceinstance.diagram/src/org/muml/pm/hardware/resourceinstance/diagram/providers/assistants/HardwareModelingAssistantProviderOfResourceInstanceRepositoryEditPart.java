package org.muml.pm.hardware.resourceinstance.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.muml.pm.hardware.resourceinstance.diagram.providers.HardwareElementTypes;
import org.muml.pm.hardware.resourceinstance.diagram.providers.HardwareModelingAssistantProvider;

/**
 * @generated
 */
public class HardwareModelingAssistantProviderOfResourceInstanceRepositoryEditPart
		extends HardwareModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(HardwareElementTypes.SensorInstance_2007);
		types.add(HardwareElementTypes.ActuatorInstance_2008);
		types.add(HardwareElementTypes.StructuredResourceInstance_2009);
		return types;
	}

}
