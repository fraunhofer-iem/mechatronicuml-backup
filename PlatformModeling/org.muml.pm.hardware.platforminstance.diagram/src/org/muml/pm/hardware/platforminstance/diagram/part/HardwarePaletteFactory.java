package org.muml.pm.hardware.platforminstance.diagram.part;

import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;
import org.muml.pm.hardware.platforminstance.diagram.providers.HardwareElementTypes;

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
		PaletteGroup paletteContainer = new PaletteGroup(Messages.Platforminstance1Group_title);
		paletteContainer.setId("createPlatforminstance1Group"); //$NON-NLS-1$
		paletteContainer.add(createHWPlatformInstance1CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "-- Mis-referenced tools --" palette tool group
	 * @generated
	 */
	private PaletteContainer createMisreferencedtools2Group() {
		PaletteGroup paletteContainer = new PaletteGroup(Messages.Misreferencedtools2Group_title);
		paletteContainer.setId("createMisreferencedtools2Group"); //$NON-NLS-1$
		paletteContainer.setDescription(Messages.Misreferencedtools2Group_desc);
		paletteContainer.add(createStructuredResourceInstance1CreationTool());
		paletteContainer.add(createActuatorInstance2CreationTool());
		paletteContainer.add(createSensorInstance3CreationTool());
		paletteContainer.add(createNetworkConnectorInstance4CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHWPlatformInstance1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(HardwareElementTypes.HWPlatformInstance_2005);
		types.add(HardwareElementTypes.HWPlatformInstance_3040);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.HWPlatformInstance1CreationTool_title,
				Messages.HWPlatformInstance1CreationTool_desc, types);
		entry.setId("createHWPlatformInstance1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PlatformInstanceDiagramEditorPlugin
				.findImageDescriptor("/org.muml.pm.hardware.common/icons/platforminstance_small.gif")); //$NON-NLS-1$
		entry.setLargeIcon(PlatformInstanceDiagramEditorPlugin
				.findImageDescriptor("/org.muml.pm.hardware.common/icons/platforminstance_large.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStructuredResourceInstance1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.StructuredResourceInstance1CreationTool_title,
				Messages.StructuredResourceInstance1CreationTool_desc,
				Collections.singletonList(HardwareElementTypes.StructuredResourceInstance_3042));
		entry.setId("createStructuredResourceInstance1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PlatformInstanceDiagramEditorPlugin
				.findImageDescriptor("/org.muml.pm.hardware.common/icons/box_small.gif")); //$NON-NLS-1$
		entry.setLargeIcon(PlatformInstanceDiagramEditorPlugin
				.findImageDescriptor("/org.muml.pm.hardware.common/icons/box_large.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createActuatorInstance2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ActuatorInstance2CreationTool_title,
				Messages.ActuatorInstance2CreationTool_desc,
				Collections.singletonList(HardwareElementTypes.ActuatorInstance_3044));
		entry.setId("createActuatorInstance2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PlatformInstanceDiagramEditorPlugin
				.findImageDescriptor("/org.muml.pm.hardware.common/icons/actuator_small.gif")); //$NON-NLS-1$
		entry.setLargeIcon(PlatformInstanceDiagramEditorPlugin
				.findImageDescriptor("/org.muml.pm.hardware.common/icons/actuator_large.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSensorInstance3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.SensorInstance3CreationTool_title,
				Messages.SensorInstance3CreationTool_desc,
				Collections.singletonList(HardwareElementTypes.SensorInstance_3045));
		entry.setId("createSensorInstance3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PlatformInstanceDiagramEditorPlugin
				.findImageDescriptor("/org.muml.pm.hardware.common/icons/sensor_small.gif")); //$NON-NLS-1$
		entry.setLargeIcon(PlatformInstanceDiagramEditorPlugin
				.findImageDescriptor("/org.muml.pm.hardware.common/icons/sensor_large.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNetworkConnectorInstance4CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.NetworkConnectorInstance4CreationTool_title,
				null, Collections.singletonList(HardwareElementTypes.NetworkConnectorInstance_4012));
		entry.setId("createNetworkConnectorInstance4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(HardwareElementTypes.getImageDescriptor(HardwareElementTypes.NetworkConnectorInstance_4012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
