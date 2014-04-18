package de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part;

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
				de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.Messages.Communication1Group_title);
		paletteContainer.setId("createCommunication1Group"); //$NON-NLS-1$
		paletteContainer.add(createDelegation1CreationTool());
		paletteContainer.add(createBus2CreationTool());
		paletteContainer.add(createToBus3CreationTool());
		paletteContainer.add(createLink4CreationTool());
		paletteContainer.add(createBridge5CreationTool());
		paletteContainer.add(createBusPortInstance6CreationTool());
		paletteContainer.add(createLinkPortInstance7CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Hardware-Platform" palette tool group
	 * @generated
	 */
	private PaletteContainer createHardwarePlatform2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.Messages.HardwarePlatform2Group_title);
		paletteContainer.setId("createHardwarePlatform2Group"); //$NON-NLS-1$
		paletteContainer.add(createHWPlatformPart1CreationTool());
		paletteContainer.add(createResourceInstancePart2CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDelegation1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.Messages.Delegation1CreationTool_title,
				de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.Messages.Delegation1CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.Delegation_4028));
		entry.setId("createDelegation1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.PlatformDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/delegation_small.gif")); //$NON-NLS-1$
		entry.setLargeIcon(de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.PlatformDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/delegation_large.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBus2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.Messages.Bus2CreationTool_title,
				de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.Messages.Bus2CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.BusPart_3014));
		entry.setId("createBus2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.PlatformDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/bus_small.gif")); //$NON-NLS-1$
		entry.setLargeIcon(de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.PlatformDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/bus_large.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createToBus3CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.Messages.ToBus3CreationTool_title,
				de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.Messages.ToBus3CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.BusConnector_4030));
		entry.setId("createToBus3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.PlatformDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/toBus_small.gif")); //$NON-NLS-1$
		entry.setLargeIcon(de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.PlatformDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/toBus_large.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLink4CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.Messages.Link4CreationTool_title,
				de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.Messages.Link4CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.LinkPart_4029));
		entry.setId("createLink4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.PlatformDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/link_small.gif")); //$NON-NLS-1$
		entry.setLargeIcon(de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.PlatformDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/link_large.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBridge5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.Messages.Bridge5CreationTool_title,
				de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.Messages.Bridge5CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.BridgePart_3015));
		entry.setId("createBridge5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.PlatformDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/bridge_small.gif")); //$NON-NLS-1$
		entry.setLargeIcon(de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.PlatformDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/bridge_large.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBusPortInstance6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.Messages.BusPortInstance6CreationTool_title,
				de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.Messages.BusPortInstance6CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.DelegationHWPort_3018));
		entry.setId("createBusPortInstance6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.PlatformDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/busport_small.gif")); //$NON-NLS-1$
		entry.setLargeIcon(de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.PlatformDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/busport_large.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLinkPortInstance7CreationTool() {
		ToolEntry entry = new ToolEntry(
				de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.Messages.LinkPortInstance7CreationTool_title,
				de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.Messages.LinkPortInstance7CreationTool_desc,
				null, null) {
		};
		entry.setId("createLinkPortInstance7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.PlatformDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/linkport_small.gif")); //$NON-NLS-1$
		entry.setLargeIcon(de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.PlatformDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/linkport_large.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHWPlatformPart1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.Messages.HWPlatformPart1CreationTool_title,
				de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.Messages.HWPlatformPart1CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.HWPlatformPart_3016));
		entry.setId("createHWPlatformPart1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.PlatformDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/box_small.gif")); //$NON-NLS-1$
		entry.setLargeIcon(de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.PlatformDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/box_large.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createResourceInstancePart2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.Messages.ResourceInstancePart2CreationTool_title,
				de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.Messages.ResourceInstancePart2CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.ResourcePart_3019));
		entry.setId("createResourceInstancePart2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.PlatformDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/box_small.gif")); //$NON-NLS-1$
		entry.setLargeIcon(de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.PlatformDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/box_large.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
