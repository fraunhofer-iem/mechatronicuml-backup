package org.muml.pm.hardware.resourceinstance.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class HardwareModelingAssistantProviderOfResourceInstanceRepositoryEditPart extends
		org.muml.pm.hardware.resourceinstance.diagram.providers.HardwareModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(
				org.muml.pm.hardware.resourceinstance.diagram.providers.HardwareElementTypes.SensorInstance_2007);
		types.add(
				org.muml.pm.hardware.resourceinstance.diagram.providers.HardwareElementTypes.ActuatorInstance_2008);
		types.add(
				org.muml.pm.hardware.resourceinstance.diagram.providers.HardwareElementTypes.StructuredResourceInstance_2009);
		return types;
	}

}
