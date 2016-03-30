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
package org.muml.reconfiguration.componentstorydiagram.diagram.part;

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
public class ComponentStoryDiagramPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createComponentStoryDiagram1Group());
		paletteRoot.add(createComponentStoryPattern2Group());
	}

	/**
	 * Creates "Component Story Diagram" palette tool group
	 * @generated
	 */
	private PaletteContainer createComponentStoryDiagram1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				org.muml.reconfiguration.componentstorydiagram.diagram.part.Messages.ComponentStoryDiagram1Group_title);
		paletteContainer.setId("createComponentStoryDiagram1Group"); //$NON-NLS-1$
		paletteContainer.add(createActivity1CreationTool());
		paletteContainer.add(createComponentStoryNode2CreationTool());
		paletteContainer.add(createControllerExchangeNode3CreationTool());
		paletteContainer.add(createActivityEdge4CreationTool());
		paletteContainer.add(createInitialNode5CreationTool());
		paletteContainer.add(createJunctionNode6CreationTool());
		paletteContainer.add(createActivityFinalNode7CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Component Story Pattern" palette tool group
	 * @generated
	 */
	private PaletteContainer createComponentStoryPattern2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				org.muml.reconfiguration.componentstorydiagram.diagram.part.Messages.ComponentStoryPattern2Group_title);
		paletteContainer.setId("createComponentStoryPattern2Group"); //$NON-NLS-1$
		paletteContainer.add(createPartVariable1CreationTool());
		paletteContainer.add(createSinglePortVariable2CreationTool());
		paletteContainer.add(createMultiPortVariable3CreationTool());
		paletteContainer.add(createAssemblyVariable4CreationTool());
		paletteContainer.add(createDelegationVariable5CreationTool());
		paletteContainer.add(createFadingComponentPartVariable6CreationTool());
		paletteContainer.add(createMultiPortOrderConstraint7CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createActivity1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				org.muml.reconfiguration.componentstorydiagram.diagram.part.Messages.Activity1CreationTool_title,
				org.muml.reconfiguration.componentstorydiagram.diagram.part.Messages.Activity1CreationTool_desc,
				Collections
						.singletonList(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.Activity_2003));
		entry.setId("createActivity1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes
				.getImageDescriptor(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.Activity_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createComponentStoryNode2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				org.muml.reconfiguration.componentstorydiagram.diagram.part.Messages.ComponentStoryNode2CreationTool_title,
				org.muml.reconfiguration.componentstorydiagram.diagram.part.Messages.ComponentStoryNode2CreationTool_desc,
				Collections
						.singletonList(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.ComponentStoryNode_3001));
		entry.setId("createComponentStoryNode2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(org.muml.reconfiguration.componentstorydiagram.diagram.part.ComponentStoryDiagramDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.custom/icons/ComponentStoryNode.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createControllerExchangeNode3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				org.muml.reconfiguration.componentstorydiagram.diagram.part.Messages.ControllerExchangeNode3CreationTool_title,
				org.muml.reconfiguration.componentstorydiagram.diagram.part.Messages.ControllerExchangeNode3CreationTool_desc,
				Collections
						.singletonList(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.ControllerExchangeNode_3021));
		entry.setId("createControllerExchangeNode3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(org.muml.reconfiguration.componentstorydiagram.diagram.part.ComponentStoryDiagramDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.custom/icons/ControllerExchangeNode.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createActivityEdge4CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				org.muml.reconfiguration.componentstorydiagram.diagram.part.Messages.ActivityEdge4CreationTool_title,
				org.muml.reconfiguration.componentstorydiagram.diagram.part.Messages.ActivityEdge4CreationTool_desc,
				Collections
						.singletonList(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.ActivityEdge_4001));
		entry.setId("createActivityEdge4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes
				.getImageDescriptor(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.ActivityEdge_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInitialNode5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				org.muml.reconfiguration.componentstorydiagram.diagram.part.Messages.InitialNode5CreationTool_title,
				org.muml.reconfiguration.componentstorydiagram.diagram.part.Messages.InitialNode5CreationTool_desc,
				Collections
						.singletonList(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.InitialNode_3007));
		entry.setId("createInitialNode5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes
				.getImageDescriptor(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.InitialNode_3007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createJunctionNode6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				org.muml.reconfiguration.componentstorydiagram.diagram.part.Messages.JunctionNode6CreationTool_title,
				org.muml.reconfiguration.componentstorydiagram.diagram.part.Messages.JunctionNode6CreationTool_desc,
				Collections
						.singletonList(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.JunctionNode_3008));
		entry.setId("createJunctionNode6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes
				.getImageDescriptor(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.JunctionNode_3008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createActivityFinalNode7CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				org.muml.reconfiguration.componentstorydiagram.diagram.part.Messages.ActivityFinalNode7CreationTool_title,
				org.muml.reconfiguration.componentstorydiagram.diagram.part.Messages.ActivityFinalNode7CreationTool_desc,
				Collections
						.singletonList(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.ActivityFinalNode_3010));
		entry.setId("createActivityFinalNode7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes
				.getImageDescriptor(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.ActivityFinalNode_3010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPartVariable1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				org.muml.reconfiguration.componentstorydiagram.diagram.part.Messages.PartVariable1CreationTool_title,
				org.muml.reconfiguration.componentstorydiagram.diagram.part.Messages.PartVariable1CreationTool_desc,
				Collections
						.singletonList(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.ComponentPartVariable_3014));
		entry.setId("createPartVariable1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(org.muml.reconfiguration.componentstorydiagram.diagram.part.ComponentStoryDiagramDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.common/icons/ComponentPart.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSinglePortVariable2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.SinglePortVariable_3017);
		types.add(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.SinglePortVariable_3018);
		types.add(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.SinglePortVariable_3020);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				org.muml.reconfiguration.componentstorydiagram.diagram.part.Messages.SinglePortVariable2CreationTool_title,
				org.muml.reconfiguration.componentstorydiagram.diagram.part.Messages.SinglePortVariable2CreationTool_desc,
				types);
		entry.setId("createSinglePortVariable2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(org.muml.reconfiguration.componentstorydiagram.diagram.part.ComponentStoryDiagramDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.common/icons/Port.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMultiPortVariable3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.MultiPortVariable_3016);
		types.add(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.MultiPortVariable_3019);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				org.muml.reconfiguration.componentstorydiagram.diagram.part.Messages.MultiPortVariable3CreationTool_title,
				org.muml.reconfiguration.componentstorydiagram.diagram.part.Messages.MultiPortVariable3CreationTool_desc,
				types);
		entry.setId("createMultiPortVariable3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(org.muml.reconfiguration.componentstorydiagram.diagram.part.ComponentStoryDiagramDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.common/icons/Port.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAssemblyVariable4CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				org.muml.reconfiguration.componentstorydiagram.diagram.part.Messages.AssemblyVariable4CreationTool_title,
				org.muml.reconfiguration.componentstorydiagram.diagram.part.Messages.AssemblyVariable4CreationTool_desc,
				Collections
						.singletonList(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.AssemblyVariable_4004));
		entry.setId("createAssemblyVariable4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(org.muml.reconfiguration.componentstorydiagram.diagram.part.ComponentStoryDiagramDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.common/icons/Assembly.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDelegationVariable5CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				org.muml.reconfiguration.componentstorydiagram.diagram.part.Messages.DelegationVariable5CreationTool_title,
				org.muml.reconfiguration.componentstorydiagram.diagram.part.Messages.DelegationVariable5CreationTool_desc,
				Collections
						.singletonList(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.DelegationVariable_4005));
		entry.setId("createDelegationVariable5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(org.muml.reconfiguration.componentstorydiagram.diagram.part.ComponentStoryDiagramDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.common/icons/Delegation.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFadingComponentPartVariable6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				org.muml.reconfiguration.componentstorydiagram.diagram.part.Messages.FadingComponentPartVariable6CreationTool_title,
				org.muml.reconfiguration.componentstorydiagram.diagram.part.Messages.FadingComponentPartVariable6CreationTool_desc,
				Collections
						.singletonList(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.FadingComponentPartVariable_3024));
		entry.setId("createFadingComponentPartVariable6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes
				.getImageDescriptor(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.FadingComponentPartVariable_3024));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMultiPortOrderConstraint7CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				org.muml.reconfiguration.componentstorydiagram.diagram.part.Messages.MultiPortOrderConstraint7CreationTool_title,
				org.muml.reconfiguration.componentstorydiagram.diagram.part.Messages.MultiPortOrderConstraint7CreationTool_desc,
				Collections
						.singletonList(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.MultiPortOrderConstraint_4006));
		entry.setId("createMultiPortOrderConstraint7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes
				.getImageDescriptor(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.MultiPortOrderConstraint_4006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}
}
