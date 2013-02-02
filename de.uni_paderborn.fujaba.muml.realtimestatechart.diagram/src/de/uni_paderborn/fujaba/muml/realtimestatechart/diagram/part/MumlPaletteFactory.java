package de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part;

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
public class MumlPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createRealTimeStatechart1Group());
		paletteRoot.add(createRealTimeState2Group());
	}

	/**
	 * Creates "Real-Time Statechart" palette tool group
	 * @generated
	 */
	private PaletteContainer createRealTimeStatechart1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.Messages.RealTimeStatechart1Group_title);
		paletteContainer.setId("createRealTimeStatechart1Group"); //$NON-NLS-1$
		paletteContainer
				.setDescription(de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.Messages.RealTimeStatechart1Group_desc);
		paletteContainer.add(createState1CreationTool());
		paletteContainer.add(createTransition2CreationTool());
		paletteContainer.add(createEntryPoint3CreationTool());
		paletteContainer.add(createExitPoint4CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Real-Time State" palette tool group
	 * @generated
	 */
	private PaletteContainer createRealTimeState2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.Messages.RealTimeState2Group_title);
		paletteContainer.setId("createRealTimeState2Group"); //$NON-NLS-1$
		paletteContainer
				.setDescription(de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.Messages.RealTimeState2Group_desc);
		paletteContainer.add(createEntryAction1CreationTool());
		paletteContainer.add(createDoAction2CreationTool());
		paletteContainer.add(createExitAction3CreationTool());
		paletteContainer.add(createRegion4CreationTool());
		paletteContainer.add(createStateEntryPoint5CreationTool());
		paletteContainer.add(createStateExitPoint6CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createState1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.Messages.State1CreationTool_title,
				de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.Messages.State1CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.providers.MumlElementTypes.State_3032));
		entry.setId("createState1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.realtimestatechart.diagram/icon/c_state16.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTransition2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.Messages.Transition2CreationTool_title,
				de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.Messages.Transition2CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.providers.MumlElementTypes.Transition_4003));
		entry.setId("createTransition2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.realtimestatechart.diagram/icon/transition16.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEntryPoint3CreationTool() {
		ToolEntry entry = new ToolEntry(
				de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.Messages.EntryPoint3CreationTool_title,
				de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.Messages.EntryPoint3CreationTool_desc,
				null, null) {
		};
		entry.setId("createEntryPoint3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.realtimestatechart.diagram/icon/state_entry_point.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createExitPoint4CreationTool() {
		ToolEntry entry = new ToolEntry(
				de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.Messages.ExitPoint4CreationTool_title,
				de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.Messages.ExitPoint4CreationTool_desc,
				null, null) {
		};
		entry.setId("createExitPoint4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.realtimestatechart.diagram/icon/state_exit_point.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEntryAction1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.Messages.EntryAction1CreationTool_title,
				de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.Messages.EntryAction1CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.providers.MumlElementTypes.EntryEvent_3033));
		entry.setId("createEntryAction1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.realtimestatechart.diagram/icon/entry_action16.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDoAction2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.Messages.DoAction2CreationTool_title,
				de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.Messages.DoAction2CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.providers.MumlElementTypes.DoEvent_3034));
		entry.setId("createDoAction2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.realtimestatechart.diagram/icon/do_action16.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createExitAction3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.Messages.ExitAction3CreationTool_title,
				de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.Messages.ExitAction3CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.providers.MumlElementTypes.ExitEvent_3035));
		entry.setId("createExitAction3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.realtimestatechart.diagram/icon/exit_action16.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRegion4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.Messages.Region4CreationTool_title,
				de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.Messages.Region4CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.providers.MumlElementTypes.Region_3038));
		entry.setId("createRegion4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.realtimestatechart.diagram/icon/region.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStateEntryPoint5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.Messages.StateEntryPoint5CreationTool_title,
				de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.Messages.StateEntryPoint5CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.providers.MumlElementTypes.EntryPoint_3040));
		entry.setId("createStateEntryPoint5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.realtimestatechart.diagram/icon/state_entry_point.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStateExitPoint6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.Messages.StateExitPoint6CreationTool_title,
				de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.Messages.StateExitPoint6CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.providers.MumlElementTypes.ExitPoint_3041));
		entry.setId("createStateExitPoint6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.realtimestatechart.diagram/icon/state_exit_point.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
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
