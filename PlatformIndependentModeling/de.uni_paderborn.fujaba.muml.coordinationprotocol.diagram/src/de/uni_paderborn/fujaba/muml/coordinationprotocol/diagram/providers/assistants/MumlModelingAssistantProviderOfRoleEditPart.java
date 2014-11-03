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
package de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class MumlModelingAssistantProviderOfRoleEditPart
		extends
		de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.providers.MumlModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.parts.RoleEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(
			de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.parts.RoleEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.providers.MumlElementTypes.RoleConnector_4006);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget(
				(de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.parts.RoleEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.parts.RoleEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.parts.RoleEditPart) {
			types.add(de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.providers.MumlElementTypes.RoleConnector_4006);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget(
				(de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.parts.RoleEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(
			de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.parts.RoleEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.providers.MumlElementTypes.RoleConnector_4006) {
			types.add(de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.providers.MumlElementTypes.Role_3006);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.parts.RoleEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(
			de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.parts.RoleEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.providers.MumlElementTypes.AbstractCoordinationSpecificationRoles_4007);
		types.add(de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.providers.MumlElementTypes.RoleConnector_4006);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource(
				(de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.parts.RoleEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(
			de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.parts.RoleEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.providers.MumlElementTypes.AbstractCoordinationSpecificationRoles_4007) {
			types.add(de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.providers.MumlElementTypes.CoordinationProtocol_2005);
			types.add(de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.providers.MumlElementTypes.CoordinationProtocol_3005);
		} else if (relationshipType == de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.providers.MumlElementTypes.RoleConnector_4006) {
			types.add(de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.providers.MumlElementTypes.Role_3006);
		}
		return types;
	}

}
