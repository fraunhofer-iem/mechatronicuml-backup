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
package org.muml.pim.componentinstanceconfiguration.diagram.part;

import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;
import org.muml.pim.componentinstanceconfiguration.diagram.providers.MumlElementTypes;

/**
 * @generated
 */
public class MumlPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createComponentinstanceconfiguration1Group());
	}

	/**
	 * Creates "componentinstanceconfiguration" palette tool group
	 * @generated
	 */
	private PaletteContainer createComponentinstanceconfiguration1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(Messages.Componentinstanceconfiguration1Group_title);
		paletteContainer.setId("createComponentinstanceconfiguration1Group"); //$NON-NLS-1$
		paletteContainer.add(createAtomicComponentInstance1CreationTool());
		paletteContainer.add(createStructuredComponentInstance2CreationTool());
		paletteContainer.add(createAssemblyInstance3CreationTool());
		paletteContainer.add(createDelegationInstance4CreationTool());
		paletteContainer.add(createDiscreteSinglePortInstance5CreationTool());
		paletteContainer.add(createDiscreteMultiPortInstance6CreationTool());
		paletteContainer.add(createContinuousPortInstance7CreationTool());
		paletteContainer.add(createHybridPortInstance8CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAtomicComponentInstance1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(MumlElementTypes.AtomicComponentInstance_2016);
		types.add(MumlElementTypes.AtomicComponentInstance_3024);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.AtomicComponentInstance1CreationTool_title,
				Messages.AtomicComponentInstance1CreationTool_desc, types);
		entry.setId("createAtomicComponentInstance1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ComponentinstanceconfigurationDiagramEditorPlugin
				.findImageDescriptor("/org.muml.pim.common/icons/ComponentInstance.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStructuredComponentInstance2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(MumlElementTypes.StructuredComponentInstance_2015);
		types.add(MumlElementTypes.StructuredComponentInstance_3025);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.StructuredComponentInstance2CreationTool_title,
				Messages.StructuredComponentInstance2CreationTool_desc, types);
		entry.setId("createStructuredComponentInstance2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ComponentinstanceconfigurationDiagramEditorPlugin
				.findImageDescriptor("/org.muml.pim.common/icons/ComponentInstance.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAssemblyInstance3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.AssemblyInstance3CreationTool_title,
				Messages.AssemblyInstance3CreationTool_desc,
				Collections.singletonList(MumlElementTypes.AssemblyConnectorInstance_4001));
		entry.setId("createAssemblyInstance3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ComponentinstanceconfigurationDiagramEditorPlugin
				.findImageDescriptor("/org.muml.pim.common/icons/Assembly.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDelegationInstance4CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.DelegationInstance4CreationTool_title,
				Messages.DelegationInstance4CreationTool_desc,
				Collections.singletonList(MumlElementTypes.DelegationConnectorInstance_4002));
		entry.setId("createDelegationInstance4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ComponentinstanceconfigurationDiagramEditorPlugin
				.findImageDescriptor("/org.muml.pim.common/icons/Assembly.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDiscreteSinglePortInstance5CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(MumlElementTypes.DiscreteSinglePortInstance_2022);
		types.add(MumlElementTypes.DiscreteSinglePortInstance_3026);
		types.add(MumlElementTypes.DiscreteSinglePortInstance_3032);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.DiscreteSinglePortInstance5CreationTool_title,
				Messages.DiscreteSinglePortInstance5CreationTool_desc, types);
		entry.setId("createDiscreteSinglePortInstance5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ComponentinstanceconfigurationDiagramEditorPlugin
				.findImageDescriptor("/org.muml.pim.common/icons/DiscretePort.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDiscreteMultiPortInstance6CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(MumlElementTypes.DiscreteMultiPortInstance_2023);
		types.add(MumlElementTypes.DiscreteMultiPortInstance_3033);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.DiscreteMultiPortInstance6CreationTool_title,
				Messages.DiscreteMultiPortInstance6CreationTool_desc, types);
		entry.setId("createDiscreteMultiPortInstance6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ComponentinstanceconfigurationDiagramEditorPlugin
				.findImageDescriptor("/org.muml.pim.common/icons/DiscretePort.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createContinuousPortInstance7CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(MumlElementTypes.ContinuousPortInstance_2024);
		types.add(MumlElementTypes.ContinuousPortInstance_3034);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ContinuousPortInstance7CreationTool_title,
				Messages.ContinuousPortInstance7CreationTool_desc, types);
		entry.setId("createContinuousPortInstance7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ComponentinstanceconfigurationDiagramEditorPlugin
				.findImageDescriptor("/org.muml.pim.common/icons/ContinuousPort.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHybridPortInstance8CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(MumlElementTypes.HybridPortInstance_2021);
		types.add(MumlElementTypes.HybridPortInstance_3031);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.HybridPortInstance8CreationTool_title,
				Messages.HybridPortInstance8CreationTool_desc, types);
		entry.setId("createHybridPortInstance8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ComponentinstanceconfigurationDiagramEditorPlugin
				.findImageDescriptor("/org.muml.pim.common/icons/HybridPort.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
