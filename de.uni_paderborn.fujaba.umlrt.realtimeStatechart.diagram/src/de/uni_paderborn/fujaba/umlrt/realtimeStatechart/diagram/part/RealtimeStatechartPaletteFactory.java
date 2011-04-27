package de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part;

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

/**
 * @generated
 */
public class RealtimeStatechartPaletteFactory {

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
				de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.Messages.RealtimeStatechart1Group_title);
		paletteContainer.setId("createRealtimeStatechart1Group"); //$NON-NLS-1$
		paletteContainer
				.setDescription(de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.Messages.RealtimeStatechart1Group_desc);
		paletteContainer.add(createState1CreationTool());
		paletteContainer.add(createStartState2CreationTool());
		paletteContainer.add(createStopState3CreationTool());
		paletteContainer.add(createTransition4CreationTool());
		paletteContainer.add(createTestTransition5CreationTool());
		paletteContainer.add(createClock6CreationTool());
		paletteContainer.add(createHistory7CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Realtime State" palette tool group
	 * @generated
	 */
	private PaletteContainer createRealtimeState2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.Messages.RealtimeState2Group_title);
		paletteContainer.setId("createRealtimeState2Group"); //$NON-NLS-1$
		paletteContainer
				.setDescription(de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.Messages.RealtimeState2Group_desc);
		paletteContainer.add(createTimeInvariant1CreationTool());
		paletteContainer.add(createEntryEvent2CreationTool());
		paletteContainer.add(createDoEvent3CreationTool());
		paletteContainer.add(createExitEvent4CreationTool());
		paletteContainer.add(createRegion5CreationTool());
		paletteContainer.add(createSynchronizationChannel6CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createState1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.Messages.State1CreationTool_title,
				de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.Messages.State1CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.providers.RealtimeStatechartElementTypes.State_2008));
		entry.setId("createState1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.umlrt.realtimeStatechart/icon/c_state16.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStartState2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.Messages.StartState2CreationTool_title,
				de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.Messages.StartState2CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.providers.RealtimeStatechartElementTypes.InitialState_2009));
		entry.setId("createStartState2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.umlrt.realtimeStatechart/icon/startState16.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStopState3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.Messages.StopState3CreationTool_title,
				de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.Messages.StopState3CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.providers.RealtimeStatechartElementTypes.FinalState_2010));
		entry.setId("createStopState3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.umlrt.realtimeStatechart/icon/stopState16.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTransition4CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.Messages.Transition4CreationTool_title,
				de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.Messages.Transition4CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.providers.RealtimeStatechartElementTypes.Transition_4001));
		entry.setId("createTransition4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.umlrt.realtimeStatechart/icon/transition16.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTestTransition5CreationTool() {
		ToolEntry entry = new ToolEntry(
				de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.Messages.TestTransition5CreationTool_title,
				de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.Messages.TestTransition5CreationTool_desc,
				null, null) {
		};
		entry.setId("createTestTransition5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.umlrt.realtimeStatechart/icon/transition16.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createClock6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.Messages.Clock6CreationTool_title,
				de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.Messages.Clock6CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.providers.RealtimeStatechartElementTypes.Clock_2012));
		entry.setId("createClock6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.umlrt.realtimeStatechart/icon/clock.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHistory7CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.Messages.History7CreationTool_title,
				de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.Messages.History7CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.providers.RealtimeStatechartElementTypes.HistoryState_2011));
		entry.setId("createHistory7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.umlrt.realtimeStatechart/icon/history16.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTimeInvariant1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.Messages.TimeInvariant1CreationTool_title,
				de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.Messages.TimeInvariant1CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.providers.RealtimeStatechartElementTypes.ClockConstraint_3007));
		entry.setId("createTimeInvariant1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.umlrt.realtimeStatechart/icon/clock.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEntryEvent2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.Messages.EntryEvent2CreationTool_title,
				de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.Messages.EntryEvent2CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.providers.RealtimeStatechartElementTypes.EntryEvent_3005));
		entry.setId("createEntryEvent2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.umlrt.realtimeStatechart/icon/entry_action16.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDoEvent3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.Messages.DoEvent3CreationTool_title,
				de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.Messages.DoEvent3CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.providers.RealtimeStatechartElementTypes.DoEvent_3002));
		entry.setId("createDoEvent3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.umlrt.realtimeStatechart/icon/do_action16.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createExitEvent4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.Messages.ExitEvent4CreationTool_title,
				de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.Messages.ExitEvent4CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.providers.RealtimeStatechartElementTypes.ExitEvent_3006));
		entry.setId("createExitEvent4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.umlrt.realtimeStatechart/icon/exit_action16.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRegion5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.Messages.Region5CreationTool_title,
				de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.Messages.Region5CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.providers.RealtimeStatechartElementTypes.Region_3009));
		entry.setId("createRegion5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.umlrt.realtimeStatechart/icon/andState.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSynchronizationChannel6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.Messages.SynchronizationChannel6CreationTool_title,
				de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.Messages.SynchronizationChannel6CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.providers.RealtimeStatechartElementTypes.SynchronizationChannel_3008));
		entry.setId("createSynchronizationChannel6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.umlrt.realtimeStatechart/icon/xAction.gif")); //$NON-NLS-1$
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
