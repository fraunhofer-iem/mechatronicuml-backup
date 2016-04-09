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
package org.muml.reconfiguration.verification.sdd.componentsdd.diagram.part;

import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes;

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
		PaletteGroup paletteContainer = new PaletteGroup(Messages.SDDTools1Group_title);
		paletteContainer.setId("createSDDTools1Group"); //$NON-NLS-1$
		paletteContainer.setDescription(Messages.SDDTools1Group_desc);
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
		PaletteGroup paletteContainer = new PaletteGroup(Messages.Misreferencedtools2Group_title);
		paletteContainer.setId("createMisreferencedtools2Group"); //$NON-NLS-1$
		paletteContainer.setDescription(Messages.Misreferencedtools2Group_desc);
		paletteContainer.add(createPartVariable1CreationTool());
		paletteContainer.add(createMultiPortVariable2CreationTool());
		paletteContainer.add(createSinglePortVariable3CreationTool());
		paletteContainer.add(createFadingComponentPartVariable4CreationTool());
		paletteContainer.add(createInitialNode5CreationTool());
		paletteContainer.add(createAssemblyVariable6CreationTool());
		paletteContainer.add(createDelegationVariable7CreationTool());
		paletteContainer.add(createMultiPortOrderConstraint8CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEdge1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Edge1CreationTool_title,
				Messages.Edge1CreationTool_desc, Collections.singletonList(ComponentSDDElementTypes.Edge_4001));
		entry.setId("createEdge1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ComponentSDDDiagramEditorPlugin
				.findImageDescriptor("/org.muml.storydiagram.verification.sdd.edit/icons/full/obj16/Edge.gif")); //$NON-NLS-1$
		entry.setLargeIcon(ComponentSDDDiagramEditorPlugin
				.findImageDescriptor("/org.muml.storydiagram.verification.sdd.edit/icons/full/obj16/Edge.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLeafNode2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.LeafNode2CreationTool_title,
				Messages.LeafNode2CreationTool_desc, Collections.singletonList(ComponentSDDElementTypes.LeafNode_2002));
		entry.setId("createLeafNode2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ComponentSDDDiagramEditorPlugin
				.findImageDescriptor("/org.muml.storydiagram.verification.sdd.edit/icons/full/obj16/LeafNode.gif")); //$NON-NLS-1$
		entry.setLargeIcon(ComponentSDDDiagramEditorPlugin
				.findImageDescriptor("/org.muml.storydiagram.verification.sdd.edit/icons/full/obj16/LeafNode.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPatternNode3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.PatternNode3CreationTool_title,
				Messages.PatternNode3CreationTool_desc,
				Collections.singletonList(ComponentSDDElementTypes.ComponentStoryPatternNode_2003));
		entry.setId("createPatternNode3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ComponentSDDDiagramEditorPlugin
				.findImageDescriptor("/org.muml.storydiagram.verification.sdd.edit/icons/full/obj16/PatternNode.gif")); //$NON-NLS-1$
		entry.setLargeIcon(ComponentSDDDiagramEditorPlugin
				.findImageDescriptor("/org.muml.storydiagram.verification.sdd.edit/icons/full/obj16/PatternNode.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPartVariable1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.PartVariable1CreationTool_title,
				Messages.PartVariable1CreationTool_desc,
				Collections.singletonList(ComponentSDDElementTypes.ComponentPartVariable_3003));
		entry.setId("createPartVariable1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				ComponentSDDDiagramEditorPlugin.findImageDescriptor("/org.muml.pim.common/icons/ComponentPart.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMultiPortVariable2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ComponentSDDElementTypes.MultiPortVariable_3004);
		types.add(ComponentSDDElementTypes.MultiPortVariable_3007);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.MultiPortVariable2CreationTool_title,
				Messages.MultiPortVariable2CreationTool_desc, types);
		entry.setId("createMultiPortVariable2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ComponentSDDDiagramEditorPlugin.findImageDescriptor("/org.muml.pim.common/icons/Port.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSinglePortVariable3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(ComponentSDDElementTypes.SinglePortVariable_3005);
		types.add(ComponentSDDElementTypes.SinglePortVariable_3006);
		types.add(ComponentSDDElementTypes.SinglePortVariable_3008);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.SinglePortVariable3CreationTool_title,
				Messages.SinglePortVariable3CreationTool_desc, types);
		entry.setId("createSinglePortVariable3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ComponentSDDDiagramEditorPlugin.findImageDescriptor("/org.muml.pim.common/icons/Port.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFadingComponentPartVariable4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.FadingComponentPartVariable4CreationTool_title,
				Messages.FadingComponentPartVariable4CreationTool_desc,
				Collections.singletonList(ComponentSDDElementTypes.FadingComponentPartVariable_3009));
		entry.setId("createFadingComponentPartVariable4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				ComponentSDDElementTypes.getImageDescriptor(ComponentSDDElementTypes.FadingComponentPartVariable_3009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInitialNode5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.InitialNode5CreationTool_title,
				Messages.InitialNode5CreationTool_desc,
				Collections.singletonList(ComponentSDDElementTypes.InitialNode_2004));
		entry.setId("createInitialNode5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ComponentSDDElementTypes.getImageDescriptor(ComponentSDDElementTypes.InitialNode_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAssemblyVariable6CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.AssemblyVariable6CreationTool_title,
				Messages.AssemblyVariable6CreationTool_desc,
				Collections.singletonList(ComponentSDDElementTypes.AssemblyVariable_4002));
		entry.setId("createAssemblyVariable6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				ComponentSDDDiagramEditorPlugin.findImageDescriptor("/org.muml.pim.common/icons/Assembly.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDelegationVariable7CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.DelegationVariable7CreationTool_title,
				Messages.DelegationVariable7CreationTool_desc,
				Collections.singletonList(ComponentSDDElementTypes.DelegationVariable_4003));
		entry.setId("createDelegationVariable7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				ComponentSDDDiagramEditorPlugin.findImageDescriptor("/org.muml.pim.common/icons/Delegation.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMultiPortOrderConstraint8CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.MultiPortOrderConstraint8CreationTool_title,
				Messages.MultiPortOrderConstraint8CreationTool_desc,
				Collections.singletonList(ComponentSDDElementTypes.MultiPortOrderConstraint_4004));
		entry.setId("createMultiPortOrderConstraint8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				ComponentSDDElementTypes.getImageDescriptor(ComponentSDDElementTypes.MultiPortOrderConstraint_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}
}
