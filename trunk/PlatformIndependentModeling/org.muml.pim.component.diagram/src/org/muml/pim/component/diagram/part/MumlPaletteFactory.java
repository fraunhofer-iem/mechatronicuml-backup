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
package org.muml.pim.component.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;
import org.muml.pim.component.diagram.providers.MumlElementTypes;

/**
 * @generated
 */
public class MumlPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createComponents1Group());
		paletteRoot.add(createPorts2Group());
		paletteRoot.add(createConnectors3Group());
	}

	/**
	 * Creates "Components" palette tool group
	 * @generated
	 */
	private PaletteContainer createComponents1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Components1Group_title);
		paletteContainer.setId("createComponents1Group"); //$NON-NLS-1$
		paletteContainer.add(createAtomicComponent1CreationTool());
		paletteContainer.add(createStructuredComponent2CreationTool());
		paletteContainer.add(createComponentPart3CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Ports" palette tool group
	 * @generated
	 */
	private PaletteContainer createPorts2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Ports2Group_title);
		paletteContainer.setId("createPorts2Group"); //$NON-NLS-1$
		paletteContainer.add(createDiscretePort1CreationTool());
		paletteContainer.add(createContinuousPort2CreationTool());
		paletteContainer.add(createHybridPort3CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Connectors" palette tool group
	 * @generated
	 */
	private PaletteContainer createConnectors3Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Connectors3Group_title);
		paletteContainer.setId("createConnectors3Group"); //$NON-NLS-1$
		paletteContainer.setDescription(Messages.Connectors3Group_desc);
		paletteContainer.add(createAssembly1CreationTool());
		paletteContainer.add(createDelegation2CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAtomicComponent1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.AtomicComponent1CreationTool_title,
				Messages.AtomicComponent1CreationTool_desc,
				Collections.singletonList(MumlElementTypes.StaticAtomicComponent_2006));
		entry.setId("createAtomicComponent1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				ComponentDiagramEditorPlugin.findImageDescriptor("/org.muml.pim.common/icons/AtomicComponent.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStructuredComponent2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.StructuredComponent2CreationTool_title,
				Messages.StructuredComponent2CreationTool_desc,
				Collections.singletonList(MumlElementTypes.StaticStructuredComponent_2005));
		entry.setId("createStructuredComponent2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				ComponentDiagramEditorPlugin.findImageDescriptor("/org.muml.pim.common/icons/StructuredComponent.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createComponentPart3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ComponentPart3CreationTool_title,
				Messages.ComponentPart3CreationTool_desc,
				Collections.singletonList(MumlElementTypes.ComponentPart_3012));
		entry.setId("createComponentPart3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				ComponentDiagramEditorPlugin.findImageDescriptor("/org.muml.pim.common/icons/ComponentPart.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDiscretePort1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.DiscretePort1CreationTool_title,
				Messages.DiscretePort1CreationTool_desc, Collections.singletonList(MumlElementTypes.DiscretePort_3010));
		entry.setId("createDiscretePort1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				ComponentDiagramEditorPlugin.findImageDescriptor("/org.muml.pim.common/icons/DiscretePort.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createContinuousPort2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ContinuousPort2CreationTool_title,
				Messages.ContinuousPort2CreationTool_desc,
				Collections.singletonList(MumlElementTypes.ContinuousPort_3011));
		entry.setId("createContinuousPort2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				ComponentDiagramEditorPlugin.findImageDescriptor("/org.muml.pim.common/icons/ContinuousPort.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHybridPort3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.HybridPort3CreationTool_title,
				Messages.HybridPort3CreationTool_desc, Collections.singletonList(MumlElementTypes.HybridPort_3013));
		entry.setId("createHybridPort3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				ComponentDiagramEditorPlugin.findImageDescriptor("/org.muml.pim.common/icons/HybridPort.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAssembly1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Assembly1CreationTool_title,
				Messages.Assembly1CreationTool_desc,
				Collections.singletonList(MumlElementTypes.AssemblyConnector_4001));
		entry.setId("createAssembly1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ComponentDiagramEditorPlugin.findImageDescriptor("/org.muml.pim.common/icons/Assembly.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDelegation2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Delegation2CreationTool_title,
				Messages.Delegation2CreationTool_desc,
				Collections.singletonList(MumlElementTypes.DelegationConnector_4002));
		entry.setId("createDelegation2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				ComponentDiagramEditorPlugin.findImageDescriptor("/org.muml.pim.common/icons/Delegation.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
