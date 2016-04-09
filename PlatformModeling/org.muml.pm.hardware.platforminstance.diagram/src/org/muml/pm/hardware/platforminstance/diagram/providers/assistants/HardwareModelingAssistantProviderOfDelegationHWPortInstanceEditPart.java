package org.muml.pm.hardware.platforminstance.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.BusInstanceEditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.DelegationHWPortInstanceEditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPortInstanceEditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.NetworkBridgeInstanceEditPart;
import org.muml.pm.hardware.platforminstance.diagram.providers.HardwareElementTypes;
import org.muml.pm.hardware.platforminstance.diagram.providers.HardwareModelingAssistantProvider;

/**
 * @generated
 */
public class HardwareModelingAssistantProviderOfDelegationHWPortInstanceEditPart
		extends HardwareModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((DelegationHWPortInstanceEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(DelegationHWPortInstanceEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(HardwareElementTypes.NetworkConnectorInstance_4012);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((DelegationHWPortInstanceEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(DelegationHWPortInstanceEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof DelegationHWPortInstanceEditPart) {
			types.add(HardwareElementTypes.NetworkConnectorInstance_4012);
		}
		if (targetEditPart instanceof HWPortInstanceEditPart) {
			types.add(HardwareElementTypes.NetworkConnectorInstance_4012);
		}
		if (targetEditPart instanceof BusInstanceEditPart) {
			types.add(HardwareElementTypes.NetworkConnectorInstance_4012);
		}
		if (targetEditPart instanceof NetworkBridgeInstanceEditPart) {
			types.add(HardwareElementTypes.NetworkConnectorInstance_4012);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((DelegationHWPortInstanceEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(DelegationHWPortInstanceEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == HardwareElementTypes.NetworkConnectorInstance_4012) {
			types.add(HardwareElementTypes.DelegationHWPortInstance_3041);
			types.add(HardwareElementTypes.HWPortInstance_3043);
			types.add(HardwareElementTypes.BusInstance_3046);
			types.add(HardwareElementTypes.NetworkBridgeInstance_3047);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((DelegationHWPortInstanceEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(DelegationHWPortInstanceEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(HardwareElementTypes.NetworkConnectorInstance_4012);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((DelegationHWPortInstanceEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(DelegationHWPortInstanceEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == HardwareElementTypes.NetworkConnectorInstance_4012) {
			types.add(HardwareElementTypes.DelegationHWPortInstance_3041);
			types.add(HardwareElementTypes.HWPortInstance_3043);
			types.add(HardwareElementTypes.BusInstance_3046);
			types.add(HardwareElementTypes.NetworkBridgeInstance_3047);
		}
		return types;
	}

}
