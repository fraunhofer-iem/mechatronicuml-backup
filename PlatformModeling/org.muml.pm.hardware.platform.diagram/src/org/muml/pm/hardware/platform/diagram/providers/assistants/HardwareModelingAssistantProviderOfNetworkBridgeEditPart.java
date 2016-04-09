package org.muml.pm.hardware.platform.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.muml.pm.hardware.platform.diagram.edit.parts.BusEditPart;
import org.muml.pm.hardware.platform.diagram.edit.parts.DelegationHWPortEditPart;
import org.muml.pm.hardware.platform.diagram.edit.parts.HWPortPartEditPart;
import org.muml.pm.hardware.platform.diagram.edit.parts.NetworkBridgeEditPart;
import org.muml.pm.hardware.platform.diagram.providers.HardwareElementTypes;
import org.muml.pm.hardware.platform.diagram.providers.HardwareModelingAssistantProvider;

/**
 * @generated
 */
public class HardwareModelingAssistantProviderOfNetworkBridgeEditPart extends HardwareModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((NetworkBridgeEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(NetworkBridgeEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(HardwareElementTypes.NetworkConnector_4032);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((NetworkBridgeEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(NetworkBridgeEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof BusEditPart) {
			types.add(HardwareElementTypes.NetworkConnector_4032);
		}
		if (targetEditPart instanceof NetworkBridgeEditPart) {
			types.add(HardwareElementTypes.NetworkConnector_4032);
		}
		if (targetEditPart instanceof HWPortPartEditPart) {
			types.add(HardwareElementTypes.NetworkConnector_4032);
		}
		if (targetEditPart instanceof DelegationHWPortEditPart) {
			types.add(HardwareElementTypes.NetworkConnector_4032);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((NetworkBridgeEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(NetworkBridgeEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == HardwareElementTypes.NetworkConnector_4032) {
			types.add(HardwareElementTypes.Bus_3025);
			types.add(HardwareElementTypes.NetworkBridge_3026);
			types.add(HardwareElementTypes.HWPortPart_3028);
			types.add(HardwareElementTypes.DelegationHWPort_3029);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((NetworkBridgeEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(NetworkBridgeEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(HardwareElementTypes.NetworkConnector_4032);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((NetworkBridgeEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(NetworkBridgeEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == HardwareElementTypes.NetworkConnector_4032) {
			types.add(HardwareElementTypes.Bus_3025);
			types.add(HardwareElementTypes.NetworkBridge_3026);
			types.add(HardwareElementTypes.HWPortPart_3028);
			types.add(HardwareElementTypes.DelegationHWPort_3029);
		}
		return types;
	}

}
