package org.muml.pm.hardware.resource.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class HardwareModelingAssistantProviderOfCacheEditPart
		extends org.muml.pm.hardware.resource.diagram.providers.HardwareModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget(
				(org.muml.pm.hardware.resource.diagram.edit.parts.CacheEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(
			org.muml.pm.hardware.resource.diagram.edit.parts.CacheEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(
				org.muml.pm.hardware.resource.diagram.providers.HardwareElementTypes.ProcessorOwnedCache_4002);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource(
				(org.muml.pm.hardware.resource.diagram.edit.parts.CacheEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(
			org.muml.pm.hardware.resource.diagram.edit.parts.CacheEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == org.muml.pm.hardware.resource.diagram.providers.HardwareElementTypes.ProcessorOwnedCache_4002) {
			types.add(
					org.muml.pm.hardware.resource.diagram.providers.HardwareElementTypes.Processor_3014);
		}
		return types;
	}

}
