/*
 * <copyright>
 * Copyright (c) 2013 Software Engineering Group, Heinz Nixdorf Institute, University of Paderborn, Germany.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Software Engineering Group - initial API and implementation
 * </copyright>
 */
package org.muml.pim.realtimestatechart.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;
import org.muml.pim.realtimestatechart.diagram.providers.MumlElementTypes;

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
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.RealTimeStatechart1Group_title);
		paletteContainer.setId("createRealTimeStatechart1Group"); //$NON-NLS-1$
		paletteContainer.setDescription(Messages.RealTimeStatechart1Group_desc);
		paletteContainer.add(createState1CreationTool());
		paletteContainer.add(createTransition2CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Real-Time State" palette tool group
	 * @generated
	 */
	private PaletteContainer createRealTimeState2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.RealTimeState2Group_title);
		paletteContainer.setId("createRealTimeState2Group"); //$NON-NLS-1$
		paletteContainer.setDescription(Messages.RealTimeState2Group_desc);
		paletteContainer.add(createEntryAction1CreationTool());
		paletteContainer.add(createDoAction2CreationTool());
		paletteContainer.add(createExitAction3CreationTool());
		paletteContainer.add(createRegion4CreationTool());
		paletteContainer.add(createEntryPoint5CreationTool());
		paletteContainer.add(createExitPoint6CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createState1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.State1CreationTool_title,
				Messages.State1CreationTool_desc, Collections.singletonList(MumlElementTypes.State_3032));
		entry.setId("createState1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RealtimestatechartDiagramEditorPlugin
				.findImageDescriptor("/org.muml.pim.realtimestatechart.diagram/icon/c_state16.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTransition2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Transition2CreationTool_title,
				Messages.Transition2CreationTool_desc, Collections.singletonList(MumlElementTypes.Transition_4003));
		entry.setId("createTransition2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RealtimestatechartDiagramEditorPlugin
				.findImageDescriptor("/org.muml.pim.realtimestatechart.diagram/icon/transition16.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEntryAction1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.EntryAction1CreationTool_title,
				Messages.EntryAction1CreationTool_desc, Collections.singletonList(MumlElementTypes.EntryEvent_3033));
		entry.setId("createEntryAction1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RealtimestatechartDiagramEditorPlugin
				.findImageDescriptor("/org.muml.pim.realtimestatechart.diagram/icon/entry_action16.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDoAction2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.DoAction2CreationTool_title,
				Messages.DoAction2CreationTool_desc, Collections.singletonList(MumlElementTypes.DoEvent_3034));
		entry.setId("createDoAction2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RealtimestatechartDiagramEditorPlugin
				.findImageDescriptor("/org.muml.pim.realtimestatechart.diagram/icon/do_action16.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createExitAction3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ExitAction3CreationTool_title,
				Messages.ExitAction3CreationTool_desc, Collections.singletonList(MumlElementTypes.ExitEvent_3035));
		entry.setId("createExitAction3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RealtimestatechartDiagramEditorPlugin
				.findImageDescriptor("/org.muml.pim.realtimestatechart.diagram/icon/exit_action16.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRegion4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Region4CreationTool_title,
				Messages.Region4CreationTool_desc, Collections.singletonList(MumlElementTypes.Region_3042));
		entry.setId("createRegion4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RealtimestatechartDiagramEditorPlugin
				.findImageDescriptor("/org.muml.pim.realtimestatechart.diagram/icon/region.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEntryPoint5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.EntryPoint5CreationTool_title,
				Messages.EntryPoint5CreationTool_desc, Collections.singletonList(MumlElementTypes.EntryPoint_3040));
		entry.setId("createEntryPoint5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RealtimestatechartDiagramEditorPlugin
				.findImageDescriptor("/org.muml.pim.realtimestatechart.diagram/icon/state_entry_point.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createExitPoint6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ExitPoint6CreationTool_title,
				Messages.ExitPoint6CreationTool_desc, Collections.singletonList(MumlElementTypes.ExitPoint_3041));
		entry.setId("createExitPoint6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RealtimestatechartDiagramEditorPlugin
				.findImageDescriptor("/org.muml.pim.realtimestatechart.diagram/icon/state_exit_point.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
