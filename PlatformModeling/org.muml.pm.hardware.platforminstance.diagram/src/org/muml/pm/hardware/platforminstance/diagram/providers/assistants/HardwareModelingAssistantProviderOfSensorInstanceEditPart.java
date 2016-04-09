package org.muml.pm.hardware.platforminstance.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.muml.pm.hardware.platforminstance.diagram.providers.HardwareElementTypes;
import org.muml.pm.hardware.platforminstance.diagram.providers.HardwareModelingAssistantProvider;

/**
 * @generated
 */
public class HardwareModelingAssistantProviderOfSensorInstanceEditPart extends HardwareModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(HardwareElementTypes.HWPortInstance_3043);
		return types;
	}

}
