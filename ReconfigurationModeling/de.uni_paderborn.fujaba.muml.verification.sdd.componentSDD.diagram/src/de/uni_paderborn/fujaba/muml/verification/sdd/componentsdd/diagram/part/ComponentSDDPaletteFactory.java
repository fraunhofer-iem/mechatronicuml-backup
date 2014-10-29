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
package de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part;

import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

/**
 * @generated
 */
public class ComponentSDDPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createSDDTools1Group());
		paletteRoot.add(createMisreferencedtools2Group());
	}

	/**
	 * Creates "SDD Tools" palette tool group
	 * @generated
	 */
	private PaletteContainer createSDDTools1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.Messages.SDDTools1Group_title);
		paletteContainer.setId("createSDDTools1Group"); //$NON-NLS-1$
		paletteContainer
				.setDescription(de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.Messages.SDDTools1Group_desc);
		paletteContainer.add(createEdge1CreationTool());
		paletteContainer.add(createLeafNode2CreationTool());
		paletteContainer.add(createPatternNode3CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "-- Mis-referenced tools --" palette tool group
	 * @generated
	 */
	private PaletteContainer createMisreferencedtools2Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.Messages.Misreferencedtools2Group_title);
		paletteContainer.setId("createMisreferencedtools2Group"); //$NON-NLS-1$
		paletteContainer
				.setDescription(de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.Messages.Misreferencedtools2Group_desc);
		paletteContainer.add(createPartVariable1CreationTool());
		paletteContainer.add(createMultiPortVariable2CreationTool());
		paletteContainer.add(createSinglePortVariable3CreationTool());
		paletteContainer.add(createFadingComponentPartVariable4CreationTool());
		paletteContainer.add(createAssemblyVariable5CreationTool());
		paletteContainer.add(createDelegationVariable6CreationTool());
		paletteContainer.add(createMultiPortOrderConstraint7CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEdge1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.Messages.Edge1CreationTool_title,
				de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.Messages.Edge1CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes.Edge_4001));
		entry.setId("createEdge1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.pgSafeBots.verification.constraints.sdd/icons/edge.gif")); //$NON-NLS-1$
		entry.setLargeIcon(de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.pgSafeBots.verification.constraints.sdd/icons/edge.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLeafNode2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.Messages.LeafNode2CreationTool_title,
				de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.Messages.LeafNode2CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes.LeafNode_2002));
		entry.setId("createLeafNode2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.pgSafeBots.verification.constraints.sdd/icons/leaf_node.gif")); //$NON-NLS-1$
		entry.setLargeIcon(de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.pgSafeBots.verification.constraints.sdd/icons/leaf_node.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPatternNode3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.Messages.PatternNode3CreationTool_title,
				de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.Messages.PatternNode3CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes.ComponentStoryPatternNode_2003));
		entry.setId("createPatternNode3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.pgSafeBots.verification.constraints.sdd/icons/pattern_node.gif")); //$NON-NLS-1$
		entry.setLargeIcon(de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.pgSafeBots.verification.constraints.sdd/icons/pattern_node.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPartVariable1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.Messages.PartVariable1CreationTool_title,
				de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.Messages.PartVariable1CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes.ComponentPartVariable_3003));
		entry.setId("createPartVariable1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.common/icons/ComponentPart.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMultiPortVariable2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes.MultiPortVariable_3004);
		types.add(de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes.MultiPortVariable_3007);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.Messages.MultiPortVariable2CreationTool_title,
				de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.Messages.MultiPortVariable2CreationTool_desc,
				types);
		entry.setId("createMultiPortVariable2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.common/icons/Port.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSinglePortVariable3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes.SinglePortVariable_3005);
		types.add(de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes.SinglePortVariable_3006);
		types.add(de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes.SinglePortVariable_3008);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.Messages.SinglePortVariable3CreationTool_title,
				de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.Messages.SinglePortVariable3CreationTool_desc,
				types);
		entry.setId("createSinglePortVariable3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.common/icons/Port.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFadingComponentPartVariable4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.Messages.FadingComponentPartVariable4CreationTool_title,
				de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.Messages.FadingComponentPartVariable4CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes.FadingComponentPartVariable_3009));
		entry.setId("createFadingComponentPartVariable4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes
				.getImageDescriptor(de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes.FadingComponentPartVariable_3009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAssemblyVariable5CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.Messages.AssemblyVariable5CreationTool_title,
				de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.Messages.AssemblyVariable5CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes.AssemblyVariable_4002));
		entry.setId("createAssemblyVariable5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.common/icons/Assembly.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDelegationVariable6CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.Messages.DelegationVariable6CreationTool_title,
				de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.Messages.DelegationVariable6CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes.DelegationVariable_4003));
		entry.setId("createDelegationVariable6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.ComponentSDDDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.common/icons/Delegation.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMultiPortOrderConstraint7CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.Messages.MultiPortOrderConstraint7CreationTool_title,
				de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.part.Messages.MultiPortOrderConstraint7CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes.MultiPortOrderConstraint_4004));
		entry.setId("createMultiPortOrderConstraint7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes
				.getImageDescriptor(de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes.MultiPortOrderConstraint_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}
}
