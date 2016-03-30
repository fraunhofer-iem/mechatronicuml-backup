package org.muml.pm.hardware.platforminstance.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class HardwareModelingAssistantProviderOfDelegationHWPortInstanceEditPart extends
		org.muml.pm.hardware.platforminstance.diagram.providers.HardwareModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource(
				(org.muml.pm.hardware.platforminstance.diagram.edit.parts.DelegationHWPortInstanceEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(
			org.muml.pm.hardware.platforminstance.diagram.edit.parts.DelegationHWPortInstanceEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(
				org.muml.pm.hardware.platforminstance.diagram.providers.HardwareElementTypes.NetworkConnectorInstance_4012);
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
				(org.muml.pm.hardware.platforminstance.diagram.edit.parts.DelegationHWPortInstanceEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			org.muml.pm.hardware.platforminstance.diagram.edit.parts.DelegationHWPortInstanceEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof org.muml.pm.hardware.platforminstance.diagram.edit.parts.DelegationHWPortInstanceEditPart) {
			types.add(
					org.muml.pm.hardware.platforminstance.diagram.providers.HardwareElementTypes.NetworkConnectorInstance_4012);
		}
		if (targetEditPart instanceof org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPortInstanceEditPart) {
			types.add(
					org.muml.pm.hardware.platforminstance.diagram.providers.HardwareElementTypes.NetworkConnectorInstance_4012);
		}
		if (targetEditPart instanceof org.muml.pm.hardware.platforminstance.diagram.edit.parts.BusInstanceEditPart) {
			types.add(
					org.muml.pm.hardware.platforminstance.diagram.providers.HardwareElementTypes.NetworkConnectorInstance_4012);
		}
		if (targetEditPart instanceof org.muml.pm.hardware.platforminstance.diagram.edit.parts.NetworkBridgeInstanceEditPart) {
			types.add(
					org.muml.pm.hardware.platforminstance.diagram.providers.HardwareElementTypes.NetworkConnectorInstance_4012);
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
				(org.muml.pm.hardware.platforminstance.diagram.edit.parts.DelegationHWPortInstanceEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(
			org.muml.pm.hardware.platforminstance.diagram.edit.parts.DelegationHWPortInstanceEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == org.muml.pm.hardware.platforminstance.diagram.providers.HardwareElementTypes.NetworkConnectorInstance_4012) {
			types.add(
					org.muml.pm.hardware.platforminstance.diagram.providers.HardwareElementTypes.DelegationHWPortInstance_3041);
			types.add(
					org.muml.pm.hardware.platforminstance.diagram.providers.HardwareElementTypes.HWPortInstance_3043);
			types.add(
					org.muml.pm.hardware.platforminstance.diagram.providers.HardwareElementTypes.BusInstance_3046);
			types.add(
					org.muml.pm.hardware.platforminstance.diagram.providers.HardwareElementTypes.NetworkBridgeInstance_3047);
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
				(org.muml.pm.hardware.platforminstance.diagram.edit.parts.DelegationHWPortInstanceEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(
			org.muml.pm.hardware.platforminstance.diagram.edit.parts.DelegationHWPortInstanceEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(
				org.muml.pm.hardware.platforminstance.diagram.providers.HardwareElementTypes.NetworkConnectorInstance_4012);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource(
				(org.muml.pm.hardware.platforminstance.diagram.edit.parts.DelegationHWPortInstanceEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(
			org.muml.pm.hardware.platforminstance.diagram.edit.parts.DelegationHWPortInstanceEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == org.muml.pm.hardware.platforminstance.diagram.providers.HardwareElementTypes.NetworkConnectorInstance_4012) {
			types.add(
					org.muml.pm.hardware.platforminstance.diagram.providers.HardwareElementTypes.DelegationHWPortInstance_3041);
			types.add(
					org.muml.pm.hardware.platforminstance.diagram.providers.HardwareElementTypes.HWPortInstance_3043);
			types.add(
					org.muml.pm.hardware.platforminstance.diagram.providers.HardwareElementTypes.BusInstance_3046);
			types.add(
					org.muml.pm.hardware.platforminstance.diagram.providers.HardwareElementTypes.NetworkBridgeInstance_3047);
		}
		return types;
	}

}
