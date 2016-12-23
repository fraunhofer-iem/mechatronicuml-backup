package org.muml.pm.hardware.platform.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;
import org.muml.pm.hardware.platform.diagram.providers.HardwareElementTypes;

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
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Communication1Group_title);
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
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.HardwarePlatform2Group_title);
		paletteContainer.setId("createHardwarePlatform2Group"); //$NON-NLS-1$
		paletteContainer.add(createHWPlatformPart1CreationTool());
		paletteContainer.add(createResourceInstancePart2CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNetworkConnector1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.NetworkConnector1CreationTool_title,
				Messages.NetworkConnector1CreationTool_desc,
				Collections.singletonList(HardwareElementTypes.NetworkConnector_4032));
		entry.setId("createNetworkConnector1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				PlatformDiagramEditorPlugin.findImageDescriptor("/org.muml.pm.hardware.common/icons/toBus_small.gif")); //$NON-NLS-1$
		entry.setLargeIcon(
				PlatformDiagramEditorPlugin.findImageDescriptor("/org.muml.pm.hardware.common/icons/toBus_large.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNetworkBridge2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.NetworkBridge2CreationTool_title,
				Messages.NetworkBridge2CreationTool_desc,
				Collections.singletonList(HardwareElementTypes.NetworkBridge_3026));
		entry.setId("createNetworkBridge2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				PlatformDiagramEditorPlugin.findImageDescriptor("/org.muml.pm.hardware.common/icons/bridge_small.gif")); //$NON-NLS-1$
		entry.setLargeIcon(
				PlatformDiagramEditorPlugin.findImageDescriptor("/org.muml.pm.hardware.common/icons/bridge_large.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDelegationPort3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.DelegationPort3CreationTool_title,
				Messages.DelegationPort3CreationTool_desc,
				Collections.singletonList(HardwareElementTypes.DelegationHWPort_3029));
		entry.setId("createDelegationPort3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PlatformDiagramEditorPlugin
				.findImageDescriptor("/org.muml.pm.hardware.common/icons/linkport_small.gif")); //$NON-NLS-1$
		entry.setLargeIcon(PlatformDiagramEditorPlugin
				.findImageDescriptor("/org.muml.pm.hardware.common/icons/linkport_large.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBus4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Bus4CreationTool_title,
				Messages.Bus4CreationTool_desc, Collections.singletonList(HardwareElementTypes.Bus_3025));
		entry.setId("createBus4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				PlatformDiagramEditorPlugin.findImageDescriptor("/org.muml.pm.hardware.common/icons/bus_small.gif")); //$NON-NLS-1$
		entry.setLargeIcon(
				PlatformDiagramEditorPlugin.findImageDescriptor("/org.muml.pm.hardware.common/icons/bus_large.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHWPlatformPart1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.HWPlatformPart1CreationTool_title,
				Messages.HWPlatformPart1CreationTool_desc,
				Collections.singletonList(HardwareElementTypes.HWPlatformPart_3027));
		entry.setId("createHWPlatformPart1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				PlatformDiagramEditorPlugin.findImageDescriptor("/org.muml.pm.hardware.common/icons/box_small.gif")); //$NON-NLS-1$
		entry.setLargeIcon(
				PlatformDiagramEditorPlugin.findImageDescriptor("/org.muml.pm.hardware.common/icons/box_large.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createResourceInstancePart2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ResourceInstancePart2CreationTool_title,
				Messages.ResourceInstancePart2CreationTool_desc,
				Collections.singletonList(HardwareElementTypes.ResourcePart_3030));
		entry.setId("createResourceInstancePart2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				PlatformDiagramEditorPlugin.findImageDescriptor("/org.muml.pm.hardware.common/icons/box_small.gif")); //$NON-NLS-1$
		entry.setLargeIcon(
				PlatformDiagramEditorPlugin.findImageDescriptor("/org.muml.pm.hardware.common/icons/box_large.gif")); //$NON-NLS-1$
		return entry;
	}
}
