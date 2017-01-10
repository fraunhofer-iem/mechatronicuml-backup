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
package org.muml.pim.coordinationprotocol.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;
import org.muml.pim.coordinationprotocol.diagram.providers.MumlElementTypes;

/**
 * @generated
 */
public class MumlPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createDe1Group());
		paletteRoot.add(createMisreferencedtools2Group());
	}

	/**
	 * Creates "de" palette tool group
	 * @generated
	 */
	private PaletteContainer createDe1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(Messages.De1Group_title);
		paletteContainer.setId("createDe1Group"); //$NON-NLS-1$
		paletteContainer.add(createCoordinationProtocol1CreationTool());
		paletteContainer.add(createRoleConnector2CreationTool());
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
		paletteContainer.add(createRole1CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCoordinationProtocol1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.CoordinationProtocol1CreationTool_title,
				Messages.CoordinationProtocol1CreationTool_desc,
				Collections.singletonList(MumlElementTypes.CoordinationProtocol_2005));
		entry.setId("createCoordinationProtocol1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				MumlDiagramEditorPlugin.findImageDescriptor("/org.muml.pim.common/icons/CoordinationProtocol.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRoleConnector2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.RoleConnector2CreationTool_title,
				Messages.RoleConnector2CreationTool_desc,
				Collections.singletonList(MumlElementTypes.RoleConnector_4006));
		entry.setId("createRoleConnector2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MumlElementTypes.getImageDescriptor(MumlElementTypes.RoleConnector_4006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRole1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Role1CreationTool_title,
				Messages.Role1CreationTool_desc, Collections.singletonList(MumlElementTypes.Role_3006));
		entry.setId("createRole1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MumlElementTypes.getImageDescriptor(MumlElementTypes.Role_3006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
