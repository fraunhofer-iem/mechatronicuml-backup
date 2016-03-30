package org.muml.pm.hardware.platform.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class HardwareModelingAssistantProviderOfNetworkBridgeEditPart
		extends org.muml.pm.hardware.platform.diagram.providers.HardwareModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource(
				(org.muml.pm.hardware.platform.diagram.edit.parts.NetworkBridgeEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(
			org.muml.pm.hardware.platform.diagram.edit.parts.NetworkBridgeEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(
				org.muml.pm.hardware.platform.diagram.providers.HardwareElementTypes.NetworkConnector_4032);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget(
				(org.muml.pm.hardware.platform.diagram.edit.parts.NetworkBridgeEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			org.muml.pm.hardware.platform.diagram.edit.parts.NetworkBridgeEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof org.muml.pm.hardware.platform.diagram.edit.parts.BusEditPart) {
			types.add(
					org.muml.pm.hardware.platform.diagram.providers.HardwareElementTypes.NetworkConnector_4032);
		}
		if (targetEditPart instanceof org.muml.pm.hardware.platform.diagram.edit.parts.NetworkBridgeEditPart) {
			types.add(
					org.muml.pm.hardware.platform.diagram.providers.HardwareElementTypes.NetworkConnector_4032);
		}
		if (targetEditPart instanceof org.muml.pm.hardware.platform.diagram.edit.parts.HWPortPartEditPart) {
			types.add(
					org.muml.pm.hardware.platform.diagram.providers.HardwareElementTypes.NetworkConnector_4032);
		}
		if (targetEditPart instanceof org.muml.pm.hardware.platform.diagram.edit.parts.DelegationHWPortEditPart) {
			types.add(
					org.muml.pm.hardware.platform.diagram.providers.HardwareElementTypes.NetworkConnector_4032);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget(
				(org.muml.pm.hardware.platform.diagram.edit.parts.NetworkBridgeEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(
			org.muml.pm.hardware.platform.diagram.edit.parts.NetworkBridgeEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == org.muml.pm.hardware.platform.diagram.providers.HardwareElementTypes.NetworkConnector_4032) {
			types.add(org.muml.pm.hardware.platform.diagram.providers.HardwareElementTypes.Bus_3025);
			types.add(
					org.muml.pm.hardware.platform.diagram.providers.HardwareElementTypes.NetworkBridge_3026);
			types.add(
					org.muml.pm.hardware.platform.diagram.providers.HardwareElementTypes.HWPortPart_3028);
			types.add(
					org.muml.pm.hardware.platform.diagram.providers.HardwareElementTypes.DelegationHWPort_3029);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget(
				(org.muml.pm.hardware.platform.diagram.edit.parts.NetworkBridgeEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(
			org.muml.pm.hardware.platform.diagram.edit.parts.NetworkBridgeEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(
				org.muml.pm.hardware.platform.diagram.providers.HardwareElementTypes.NetworkConnector_4032);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource(
				(org.muml.pm.hardware.platform.diagram.edit.parts.NetworkBridgeEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(
			org.muml.pm.hardware.platform.diagram.edit.parts.NetworkBridgeEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == org.muml.pm.hardware.platform.diagram.providers.HardwareElementTypes.NetworkConnector_4032) {
			types.add(org.muml.pm.hardware.platform.diagram.providers.HardwareElementTypes.Bus_3025);
			types.add(
					org.muml.pm.hardware.platform.diagram.providers.HardwareElementTypes.NetworkBridge_3026);
			types.add(
					org.muml.pm.hardware.platform.diagram.providers.HardwareElementTypes.HWPortPart_3028);
			types.add(
					org.muml.pm.hardware.platform.diagram.providers.HardwareElementTypes.DelegationHWPort_3029);
		}
		return types;
	}

}
