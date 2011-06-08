package de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part;

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
public class UmlrtPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createRealtimeStatechart1Group());
		paletteRoot.add(createRealtimeState2Group());
	}

	/**
	 * Creates "Realtime Statechart" palette tool group
	 * @generated
	 */
	private PaletteContainer createRealtimeStatechart1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.Messages.RealtimeStatechart1Group_title);
		paletteContainer.setId("createRealtimeStatechart1Group"); //$NON-NLS-1$
		paletteContainer
				.setDescription(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.Messages.RealtimeStatechart1Group_desc);
		paletteContainer.add(createState1CreationTool());
		paletteContainer.add(createStartState2CreationTool());
		paletteContainer.add(createStopState3CreationTool());
		paletteContainer.add(createTransition4CreationTool());
		paletteContainer.add(createClock5CreationTool());
		paletteContainer.add(createHistory6CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Realtime State" palette tool group
	 * @generated
	 */
	private PaletteContainer createRealtimeState2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.Messages.RealtimeState2Group_title);
		paletteContainer.setId("createRealtimeState2Group"); //$NON-NLS-1$
		paletteContainer
				.setDescription(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.Messages.RealtimeState2Group_desc);
		paletteContainer.add(createTimeInvariant1CreationTool());
		paletteContainer.add(createEntryAction2CreationTool());
		paletteContainer.add(createDoAction3CreationTool());
		paletteContainer.add(createExitAction4CreationTool());
		paletteContainer.add(createRegion5CreationTool());
		paletteContainer.add(createSynchronizationChannel6CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createState1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.Messages.State1CreationTool_title,
				de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.Messages.State1CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.UmlrtElementTypes.State_2001));
		entry.setId("createState1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.realtimeStatechart/icon/c_state16.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStartState2CreationTool() {
		ToolEntry entry = new ToolEntry(
				de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.Messages.StartState2CreationTool_title,
				de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.Messages.StartState2CreationTool_desc,
				null, null) {
		};
		entry.setId("createStartState2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.realtimeStatechart/icon/startState16.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStopState3CreationTool() {
		ToolEntry entry = new ToolEntry(
				de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.Messages.StopState3CreationTool_title,
				de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.Messages.StopState3CreationTool_desc,
				null, null) {
		};
		entry.setId("createStopState3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.realtimeStatechart/icon/stopState16.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTransition4CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.Messages.Transition4CreationTool_title,
				de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.Messages.Transition4CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.UmlrtElementTypes.Transition_4001));
		entry.setId("createTransition4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.realtimeStatechart/icon/transition16.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createClock5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.Messages.Clock5CreationTool_title,
				de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.Messages.Clock5CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.UmlrtElementTypes.Clock_2002));
		entry.setId("createClock5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.realtimeStatechart/icon/clock.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHistory6CreationTool() {
		ToolEntry entry = new ToolEntry(
				de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.Messages.History6CreationTool_title,
				de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.Messages.History6CreationTool_desc,
				null, null) {
		};
		entry.setId("createHistory6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.realtimeStatechart/icon/history16.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTimeInvariant1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.Messages.TimeInvariant1CreationTool_title,
				de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.Messages.TimeInvariant1CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.UmlrtElementTypes.ClockConstraint_3004));
		entry.setId("createTimeInvariant1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.realtimeStatechart/icon/clock.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEntryAction2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.Messages.EntryAction2CreationTool_title,
				de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.Messages.EntryAction2CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.UmlrtElementTypes.EntryOrExitEvent_3010));
		entry.setId("createEntryAction2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.realtimeStatechart/icon/entry_action16.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDoAction3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.Messages.DoAction3CreationTool_title,
				de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.Messages.DoAction3CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.UmlrtElementTypes.DoEvent_3008));
		entry.setId("createDoAction3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.realtimeStatechart/icon/do_action16.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createExitAction4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.Messages.ExitAction4CreationTool_title,
				de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.Messages.ExitAction4CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.UmlrtElementTypes.EntryOrExitEvent_3011));
		entry.setId("createExitAction4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.realtimeStatechart/icon/exit_action16.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRegion5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.Messages.Region5CreationTool_title,
				de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.Messages.Region5CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.UmlrtElementTypes.Region_3006));
		entry.setId("createRegion5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.realtimeStatechart/icon/andState.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSynchronizationChannel6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.Messages.SynchronizationChannel6CreationTool_title,
				de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.Messages.SynchronizationChannel6CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.UmlrtElementTypes.SynchronizationChannel_3005));
		entry.setId("createSynchronizationChannel6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.realtimeStatechart/icon/xAction.gif")); //$NON-NLS-1$
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
