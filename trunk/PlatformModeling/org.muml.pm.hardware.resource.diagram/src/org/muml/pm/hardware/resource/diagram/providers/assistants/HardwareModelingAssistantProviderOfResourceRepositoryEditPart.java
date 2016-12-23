package org.muml.pm.hardware.resource.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.muml.pm.hardware.resource.diagram.providers.HardwareElementTypes;
import org.muml.pm.hardware.resource.diagram.providers.HardwareModelingAssistantProvider;

/**
 * @generated
 */
public class HardwareModelingAssistantProviderOfResourceRepositoryEditPart extends HardwareModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(HardwareElementTypes.Device_2006);
		types.add(HardwareElementTypes.StructuredResource_2007);
		types.add(HardwareElementTypes.CommunicationProtocolRepository_2008);
		return types;
	}

}
