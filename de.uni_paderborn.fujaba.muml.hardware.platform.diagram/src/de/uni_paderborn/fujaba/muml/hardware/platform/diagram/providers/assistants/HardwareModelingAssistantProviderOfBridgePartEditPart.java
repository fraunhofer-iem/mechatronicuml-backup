package de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class HardwareModelingAssistantProviderOfBridgePartEditPart
		extends
		de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.BridgePartEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(
			de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.BridgePartEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.Delegation_4028);
		types.add(de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.LinkPart_4029);
		types.add(de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.BusConnector_4030);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget(
				(de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.BridgePartEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.BridgePartEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.BusPartEditPart) {
			types.add(de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.Delegation_4028);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.BridgePartEditPart) {
			types.add(de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.Delegation_4028);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPortPartEditPart) {
			types.add(de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.Delegation_4028);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.DelegationHWPortEditPart) {
			types.add(de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.Delegation_4028);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.BusPartEditPart) {
			types.add(de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.LinkPart_4029);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.BridgePartEditPart) {
			types.add(de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.LinkPart_4029);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPortPartEditPart) {
			types.add(de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.LinkPart_4029);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.DelegationHWPortEditPart) {
			types.add(de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.LinkPart_4029);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.BusPartEditPart) {
			types.add(de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.BusConnector_4030);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.BridgePartEditPart) {
			types.add(de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.BusConnector_4030);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPortPartEditPart) {
			types.add(de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.BusConnector_4030);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.DelegationHWPortEditPart) {
			types.add(de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.BusConnector_4030);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget(
				(de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.BridgePartEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(
			de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.BridgePartEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.Delegation_4028) {
			types.add(de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.BusPart_3014);
			types.add(de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.BridgePart_3015);
			types.add(de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.HWPortPart_3022);
			types.add(de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.DelegationHWPort_3018);
		} else if (relationshipType == de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.LinkPart_4029) {
			types.add(de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.BusPart_3014);
			types.add(de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.BridgePart_3015);
			types.add(de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.HWPortPart_3022);
			types.add(de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.DelegationHWPort_3018);
		} else if (relationshipType == de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.BusConnector_4030) {
			types.add(de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.BusPart_3014);
			types.add(de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.BridgePart_3015);
			types.add(de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.HWPortPart_3022);
			types.add(de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.DelegationHWPort_3018);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.BridgePartEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(
			de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.BridgePartEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.Delegation_4028);
		types.add(de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.LinkPart_4029);
		types.add(de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.BusConnector_4030);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource(
				(de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.BridgePartEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(
			de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.BridgePartEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.Delegation_4028) {
			types.add(de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.BusPart_3014);
			types.add(de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.BridgePart_3015);
			types.add(de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.HWPortPart_3022);
			types.add(de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.DelegationHWPort_3018);
		} else if (relationshipType == de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.LinkPart_4029) {
			types.add(de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.BusPart_3014);
			types.add(de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.BridgePart_3015);
			types.add(de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.HWPortPart_3022);
			types.add(de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.DelegationHWPort_3018);
		} else if (relationshipType == de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.BusConnector_4030) {
			types.add(de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.BusPart_3014);
			types.add(de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.BridgePart_3015);
			types.add(de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.HWPortPart_3022);
			types.add(de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.DelegationHWPort_3018);
		}
		return types;
	}

}
