package org.muml.pm.hardware.platform.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.muml.pm.hardware.platform.diagram.providers.HardwareElementTypes;
import org.muml.pm.hardware.platform.diagram.providers.HardwareModelingAssistantProvider;

/**
 * @generated
 */
public class HardwareModelingAssistantProviderOfHWPlatformEditPart extends HardwareModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(HardwareElementTypes.HWPlatform_2009);
		return types;
	}

}
