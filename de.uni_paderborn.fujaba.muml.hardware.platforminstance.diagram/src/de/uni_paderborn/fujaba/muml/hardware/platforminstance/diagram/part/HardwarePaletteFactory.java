package de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
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
		paletteRoot.add(createPlatforminstance1Group());
		paletteRoot.add(createMisreferencedtools2Group());
	}

	/**
	 * Creates "platforminstance" palette tool group
	 * @generated
	 */
	private PaletteContainer createPlatforminstance1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.Messages.Platforminstance1Group_title);
		paletteContainer.setId("createPlatforminstance1Group"); //$NON-NLS-1$
		paletteContainer.add(createHWPlatformInstance1CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "-- Mis-referenced tools --" palette tool group
	 * @generated
	 */
	private PaletteContainer createMisreferencedtools2Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.Messages.Misreferencedtools2Group_title);
		paletteContainer.setId("createMisreferencedtools2Group"); //$NON-NLS-1$
		paletteContainer
				.setDescription(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.Messages.Misreferencedtools2Group_desc);
		paletteContainer.add(createStructuredResourceInstance1CreationTool());
		paletteContainer.add(createBus2CreationTool());
		paletteContainer.add(createBridge3CreationTool());
		paletteContainer.add(createActuatorInstance4CreationTool());
		paletteContainer.add(createSensorInstance5CreationTool());
		paletteContainer.add(createDelegation6CreationTool());
		paletteContainer.add(createLink7CreationTool());
		paletteContainer.add(createToBus8CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHWPlatformInstance1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.HWPlatformInstance_2001);
		types.add(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.HWPlatformInstance_3011);
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.Messages.HWPlatformInstance1CreationTool_title,
				de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.Messages.HWPlatformInstance1CreationTool_desc,
				types);
		entry.setId("createHWPlatformInstance1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.PlatformInstanceDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/platforminstance_small.gif")); //$NON-NLS-1$
		entry.setLargeIcon(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.PlatformInstanceDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/platforminstance_large.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStructuredResourceInstance1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.Messages.StructuredResourceInstance1CreationTool_title,
				de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.Messages.StructuredResourceInstance1CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.StructuredResourceInstance_3001));
		entry.setId("createStructuredResourceInstance1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.PlatformInstanceDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/box_small.gif")); //$NON-NLS-1$
		entry.setLargeIcon(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.PlatformInstanceDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/box_large.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBus2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.Messages.Bus2CreationTool_title,
				de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.Messages.Bus2CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.Bus_3009));
		entry.setId("createBus2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.PlatformInstanceDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/bus_small.gif")); //$NON-NLS-1$
		entry.setLargeIcon(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.PlatformInstanceDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/bus_large.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBridge3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.Messages.Bridge3CreationTool_title,
				de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.Messages.Bridge3CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.Bridge_3010));
		entry.setId("createBridge3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.PlatformInstanceDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/bridge_small.gif")); //$NON-NLS-1$
		entry.setLargeIcon(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.PlatformInstanceDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/bridge_large.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createActuatorInstance4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.Messages.ActuatorInstance4CreationTool_title,
				de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.Messages.ActuatorInstance4CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.ActuatorInstance_3013));
		entry.setId("createActuatorInstance4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.PlatformInstanceDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/actuator_small.gif")); //$NON-NLS-1$
		entry.setLargeIcon(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.PlatformInstanceDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/actuator_large.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSensorInstance5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.Messages.SensorInstance5CreationTool_title,
				de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.Messages.SensorInstance5CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.SensorInstance_3014));
		entry.setId("createSensorInstance5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.PlatformInstanceDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/sensor_small.gif")); //$NON-NLS-1$
		entry.setLargeIcon(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.PlatformInstanceDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/sensor_large.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDelegation6CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.Messages.Delegation6CreationTool_title,
				de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.Messages.Delegation6CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.Delegation_4001));
		entry.setId("createDelegation6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.PlatformInstanceDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/delegation_small.gif")); //$NON-NLS-1$
		entry.setLargeIcon(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.PlatformInstanceDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/delegation_large.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLink7CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.Link_4002);
		types.add(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.Link_4005);
		LinkToolEntry entry = new LinkToolEntry(
				de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.Messages.Link7CreationTool_title,
				de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.Messages.Link7CreationTool_desc,
				types);
		entry.setId("createLink7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.PlatformInstanceDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/link_small.gif")); //$NON-NLS-1$
		entry.setLargeIcon(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.PlatformInstanceDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/link_large.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createToBus8CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.HWPortInstanceConnectedMedia_4006);
		types.add(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.CommunicationMediaConnectedBridges_4004);
		LinkToolEntry entry = new LinkToolEntry(
				de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.Messages.ToBus8CreationTool_title,
				de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.Messages.ToBus8CreationTool_desc,
				types);
		entry.setId("createToBus8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.PlatformInstanceDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/toBus_small.gif")); //$NON-NLS-1$
		entry.setLargeIcon(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.PlatformInstanceDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/toBus_large.gif")); //$NON-NLS-1$
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
