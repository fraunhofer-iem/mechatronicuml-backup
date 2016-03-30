package org.muml.pm.hardware.resource.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class HardwareModelingAssistantProviderOfResourceRepositoryEditPart
		extends org.muml.pm.hardware.resource.diagram.providers.HardwareModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(org.muml.pm.hardware.resource.diagram.providers.HardwareElementTypes.Device_2006);
		types.add(
				org.muml.pm.hardware.resource.diagram.providers.HardwareElementTypes.StructuredResource_2007);
		types.add(
				org.muml.pm.hardware.resource.diagram.providers.HardwareElementTypes.CommunicationProtocolRepository_2008);
		return types;
	}

}
