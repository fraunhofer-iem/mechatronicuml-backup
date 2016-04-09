package org.muml.pm.hardware.resourceinstance.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.CacheInstanceEditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.ProcessorInstanceEditPart;
import org.muml.pm.hardware.resourceinstance.diagram.providers.HardwareElementTypes;
import org.muml.pm.hardware.resourceinstance.diagram.providers.HardwareModelingAssistantProvider;

/**
 * @generated
 */
public class HardwareModelingAssistantProviderOfProcessorInstanceEditPart extends HardwareModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((ProcessorInstanceEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(ProcessorInstanceEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(HardwareElementTypes.ProcessorInstanceOwnedCacheInstance_4003);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((ProcessorInstanceEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(ProcessorInstanceEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof CacheInstanceEditPart) {
			types.add(HardwareElementTypes.ProcessorInstanceOwnedCacheInstance_4003);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((ProcessorInstanceEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(ProcessorInstanceEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == HardwareElementTypes.ProcessorInstanceOwnedCacheInstance_4003) {
			types.add(HardwareElementTypes.CacheInstance_3018);
		}
		return types;
	}

}
