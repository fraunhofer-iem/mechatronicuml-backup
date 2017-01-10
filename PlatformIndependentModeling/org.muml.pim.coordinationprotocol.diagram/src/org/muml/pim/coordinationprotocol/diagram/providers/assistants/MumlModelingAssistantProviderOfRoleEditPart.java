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
package org.muml.pim.coordinationprotocol.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.muml.pim.coordinationprotocol.diagram.edit.parts.MessageBufferEditPart;
import org.muml.pim.coordinationprotocol.diagram.edit.parts.RoleEditPart;
import org.muml.pim.coordinationprotocol.diagram.providers.MumlElementTypes;
import org.muml.pim.coordinationprotocol.diagram.providers.MumlModelingAssistantProvider;

/**
 * @generated
 */
public class MumlModelingAssistantProviderOfRoleEditPart extends MumlModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((RoleEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(RoleEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(MumlElementTypes.RoleConnector_4006);
		types.add(MumlElementTypes.DiscreteInteractionEndpointReceiverMessageBuffer_4008);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((RoleEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(RoleEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof RoleEditPart) {
			types.add(MumlElementTypes.RoleConnector_4006);
		}
		if (targetEditPart instanceof MessageBufferEditPart) {
			types.add(MumlElementTypes.DiscreteInteractionEndpointReceiverMessageBuffer_4008);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((RoleEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(RoleEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == MumlElementTypes.RoleConnector_4006) {
			types.add(MumlElementTypes.Role_3006);
		} else if (relationshipType == MumlElementTypes.DiscreteInteractionEndpointReceiverMessageBuffer_4008) {
			types.add(MumlElementTypes.MessageBuffer_3013);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((RoleEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(RoleEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(MumlElementTypes.AbstractCoordinationSpecificationRoles_4007);
		types.add(MumlElementTypes.RoleConnector_4006);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((RoleEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(RoleEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == MumlElementTypes.AbstractCoordinationSpecificationRoles_4007) {
			types.add(MumlElementTypes.CoordinationProtocol_2005);
			types.add(MumlElementTypes.CoordinationProtocol_3015);
		} else if (relationshipType == MumlElementTypes.RoleConnector_4006) {
			types.add(MumlElementTypes.Role_3006);
		}
		return types;
	}

}
