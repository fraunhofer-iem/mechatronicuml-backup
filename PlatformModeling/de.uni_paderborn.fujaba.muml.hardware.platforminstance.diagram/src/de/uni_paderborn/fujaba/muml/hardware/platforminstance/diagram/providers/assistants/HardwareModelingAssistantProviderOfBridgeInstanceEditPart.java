package de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class HardwareModelingAssistantProviderOfBridgeInstanceEditPart
		extends
		de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.BridgeInstanceEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(
			de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.BridgeInstanceEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.DelegationInstance_4008);
		types.add(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.LinkInstance_4009);
		types.add(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.BusConnectorInstance_4010);
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
				(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.BridgeInstanceEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.BridgeInstanceEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.DelegationHWPortInstanceEditPart) {
			types.add(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.DelegationInstance_4008);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPortInstanceEditPart) {
			types.add(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.DelegationInstance_4008);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.BusInstanceEditPart) {
			types.add(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.DelegationInstance_4008);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.BridgeInstanceEditPart) {
			types.add(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.DelegationInstance_4008);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.DelegationHWPortInstanceEditPart) {
			types.add(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.LinkInstance_4009);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPortInstanceEditPart) {
			types.add(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.LinkInstance_4009);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.BusInstanceEditPart) {
			types.add(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.LinkInstance_4009);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.BridgeInstanceEditPart) {
			types.add(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.LinkInstance_4009);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.DelegationHWPortInstanceEditPart) {
			types.add(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.BusConnectorInstance_4010);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPortInstanceEditPart) {
			types.add(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.BusConnectorInstance_4010);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.BusInstanceEditPart) {
			types.add(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.BusConnectorInstance_4010);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.BridgeInstanceEditPart) {
			types.add(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.BusConnectorInstance_4010);
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
				(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.BridgeInstanceEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(
			de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.BridgeInstanceEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.DelegationInstance_4008) {
			types.add(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.DelegationHWPortInstance_3028);
			types.add(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.HWPortInstance_3030);
			types.add(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.BusInstance_3036);
			types.add(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.BridgeInstance_3037);
		} else if (relationshipType == de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.LinkInstance_4009) {
			types.add(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.DelegationHWPortInstance_3028);
			types.add(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.HWPortInstance_3030);
			types.add(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.BusInstance_3036);
			types.add(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.BridgeInstance_3037);
		} else if (relationshipType == de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.BusConnectorInstance_4010) {
			types.add(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.DelegationHWPortInstance_3028);
			types.add(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.HWPortInstance_3030);
			types.add(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.BusInstance_3036);
			types.add(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.BridgeInstance_3037);
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
		return doGetRelTypesOnTarget((de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.BridgeInstanceEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(
			de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.BridgeInstanceEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.DelegationInstance_4008);
		types.add(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.LinkInstance_4009);
		types.add(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.BusConnectorInstance_4010);
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
				(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.BridgeInstanceEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(
			de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.BridgeInstanceEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.DelegationInstance_4008) {
			types.add(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.DelegationHWPortInstance_3028);
			types.add(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.HWPortInstance_3030);
			types.add(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.BusInstance_3036);
			types.add(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.BridgeInstance_3037);
		} else if (relationshipType == de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.LinkInstance_4009) {
			types.add(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.DelegationHWPortInstance_3028);
			types.add(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.HWPortInstance_3030);
			types.add(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.BusInstance_3036);
			types.add(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.BridgeInstance_3037);
		} else if (relationshipType == de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.BusConnectorInstance_4010) {
			types.add(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.DelegationHWPortInstance_3028);
			types.add(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.HWPortInstance_3030);
			types.add(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.BusInstance_3036);
			types.add(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.BridgeInstance_3037);
		}
		return types;
	}

}
