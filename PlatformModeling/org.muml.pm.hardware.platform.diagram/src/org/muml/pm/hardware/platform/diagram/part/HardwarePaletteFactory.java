package org.muml.pm.hardware.platform.diagram.part;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

/**
 * @generated
 */
public class HardwarePaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createCommunication1Group());
		paletteRoot.add(createHardwarePlatform2Group());
	}

	/**
	 * Creates "Communication" palette tool group
	 * @generated
	 */
	private PaletteContainer createCommunication1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				org.muml.pm.hardware.platform.diagram.part.Messages.Communication1Group_title);
		paletteContainer.setId("createCommunication1Group"); //$NON-NLS-1$
		paletteContainer.add(createNetworkConnector1CreationTool());
		paletteContainer.add(createNetworkBridge2CreationTool());
		paletteContainer.add(createDelegationPort3CreationTool());
		paletteContainer.add(createBus4CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Hardware-Platform" palette tool group
	 * @generated
	 */
	private PaletteContainer createHardwarePlatform2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				org.muml.pm.hardware.platform.diagram.part.Messages.HardwarePlatform2Group_title);
		paletteContainer.setId("createHardwarePlatform2Group"); //$NON-NLS-1$
		paletteContainer.add(createHWPlatformPart1CreationTool());
		paletteContainer.add(createResourceInstancePart2CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNetworkConnector1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				org.muml.pm.hardware.platform.diagram.part.Messages.NetworkConnector1CreationTool_title,
				org.muml.pm.hardware.platform.diagram.part.Messages.NetworkConnector1CreationTool_desc,
				Collections.singletonList(
						org.muml.pm.hardware.platform.diagram.providers.HardwareElementTypes.NetworkConnector_4032));
		entry.setId("createNetworkConnector1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(org.muml.pm.hardware.platform.diagram.part.PlatformDiagramEditorPlugin
				.findImageDescriptor("/org.muml.pm.hardware.common/icons/toBus_small.gif")); //$NON-NLS-1$
		entry.setLargeIcon(org.muml.pm.hardware.platform.diagram.part.PlatformDiagramEditorPlugin
				.findImageDescriptor("/org.muml.pm.hardware.common/icons/toBus_large.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNetworkBridge2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				org.muml.pm.hardware.platform.diagram.part.Messages.NetworkBridge2CreationTool_title,
				org.muml.pm.hardware.platform.diagram.part.Messages.NetworkBridge2CreationTool_desc,
				Collections.singletonList(
						org.muml.pm.hardware.platform.diagram.providers.HardwareElementTypes.NetworkBridge_3026));
		entry.setId("createNetworkBridge2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(org.muml.pm.hardware.platform.diagram.part.PlatformDiagramEditorPlugin
				.findImageDescriptor("/org.muml.pm.hardware.common/icons/bridge_small.gif")); //$NON-NLS-1$
		entry.setLargeIcon(org.muml.pm.hardware.platform.diagram.part.PlatformDiagramEditorPlugin
				.findImageDescriptor("/org.muml.pm.hardware.common/icons/bridge_large.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDelegationPort3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				org.muml.pm.hardware.platform.diagram.part.Messages.DelegationPort3CreationTool_title,
				org.muml.pm.hardware.platform.diagram.part.Messages.DelegationPort3CreationTool_desc,
				Collections.singletonList(
						org.muml.pm.hardware.platform.diagram.providers.HardwareElementTypes.DelegationHWPort_3029));
		entry.setId("createDelegationPort3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(org.muml.pm.hardware.platform.diagram.part.PlatformDiagramEditorPlugin
				.findImageDescriptor("/org.muml.pm.hardware.common/icons/linkport_small.gif")); //$NON-NLS-1$
		entry.setLargeIcon(org.muml.pm.hardware.platform.diagram.part.PlatformDiagramEditorPlugin
				.findImageDescriptor("/org.muml.pm.hardware.common/icons/linkport_large.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBus4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				org.muml.pm.hardware.platform.diagram.part.Messages.Bus4CreationTool_title,
				org.muml.pm.hardware.platform.diagram.part.Messages.Bus4CreationTool_desc,
				Collections.singletonList(
						org.muml.pm.hardware.platform.diagram.providers.HardwareElementTypes.Bus_3025));
		entry.setId("createBus4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(org.muml.pm.hardware.platform.diagram.part.PlatformDiagramEditorPlugin
				.findImageDescriptor("/org.muml.pm.hardware.common/icons/bus_small.gif")); //$NON-NLS-1$
		entry.setLargeIcon(org.muml.pm.hardware.platform.diagram.part.PlatformDiagramEditorPlugin
				.findImageDescriptor("/org.muml.pm.hardware.common/icons/bus_large.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHWPlatformPart1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				org.muml.pm.hardware.platform.diagram.part.Messages.HWPlatformPart1CreationTool_title,
				org.muml.pm.hardware.platform.diagram.part.Messages.HWPlatformPart1CreationTool_desc,
				Collections.singletonList(
						org.muml.pm.hardware.platform.diagram.providers.HardwareElementTypes.HWPlatformPart_3027));
		entry.setId("createHWPlatformPart1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(org.muml.pm.hardware.platform.diagram.part.PlatformDiagramEditorPlugin
				.findImageDescriptor("/org.muml.pm.hardware.common/icons/box_small.gif")); //$NON-NLS-1$
		entry.setLargeIcon(org.muml.pm.hardware.platform.diagram.part.PlatformDiagramEditorPlugin
				.findImageDescriptor("/org.muml.pm.hardware.common/icons/box_large.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createResourceInstancePart2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				org.muml.pm.hardware.platform.diagram.part.Messages.ResourceInstancePart2CreationTool_title,
				org.muml.pm.hardware.platform.diagram.part.Messages.ResourceInstancePart2CreationTool_desc,
				Collections.singletonList(
						org.muml.pm.hardware.platform.diagram.providers.HardwareElementTypes.ResourcePart_3030));
		entry.setId("createResourceInstancePart2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(org.muml.pm.hardware.platform.diagram.part.PlatformDiagramEditorPlugin
				.findImageDescriptor("/org.muml.pm.hardware.common/icons/box_small.gif")); //$NON-NLS-1$
		entry.setLargeIcon(org.muml.pm.hardware.platform.diagram.part.PlatformDiagramEditorPlugin
				.findImageDescriptor("/org.muml.pm.hardware.common/icons/box_large.gif")); //$NON-NLS-1$
		return entry;
	}
}
