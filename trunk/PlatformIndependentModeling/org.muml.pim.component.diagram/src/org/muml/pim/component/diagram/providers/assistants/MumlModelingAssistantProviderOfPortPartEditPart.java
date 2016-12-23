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
package org.muml.pim.component.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.muml.pim.component.diagram.edit.parts.ContinuousPortEditPart;
import org.muml.pim.component.diagram.edit.parts.CoordinationProtocolPartEditPart;
import org.muml.pim.component.diagram.edit.parts.DiscretePortEditPart;
import org.muml.pim.component.diagram.edit.parts.HybridPortEditPart;
import org.muml.pim.component.diagram.edit.parts.PortPartEditPart;
import org.muml.pim.component.diagram.providers.MumlElementTypes;
import org.muml.pim.component.diagram.providers.MumlModelingAssistantProvider;

/**
 * @generated
 */
public class MumlModelingAssistantProviderOfPortPartEditPart extends MumlModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((PortPartEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(PortPartEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(MumlElementTypes.AssemblyConnector_4001);
		types.add(MumlElementTypes.DelegationConnector_4002);
		types.add(MumlElementTypes.PortPartCoordinationProtocolPart_4004);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((PortPartEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(PortPartEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof DiscretePortEditPart) {
			types.add(MumlElementTypes.AssemblyConnector_4001);
		}
		if (targetEditPart instanceof ContinuousPortEditPart) {
			types.add(MumlElementTypes.AssemblyConnector_4001);
		}
		if (targetEditPart instanceof HybridPortEditPart) {
			types.add(MumlElementTypes.AssemblyConnector_4001);
		}
		if (targetEditPart instanceof PortPartEditPart) {
			types.add(MumlElementTypes.AssemblyConnector_4001);
		}
		if (targetEditPart instanceof DiscretePortEditPart) {
			types.add(MumlElementTypes.DelegationConnector_4002);
		}
		if (targetEditPart instanceof ContinuousPortEditPart) {
			types.add(MumlElementTypes.DelegationConnector_4002);
		}
		if (targetEditPart instanceof HybridPortEditPart) {
			types.add(MumlElementTypes.DelegationConnector_4002);
		}
		if (targetEditPart instanceof PortPartEditPart) {
			types.add(MumlElementTypes.DelegationConnector_4002);
		}
		if (targetEditPart instanceof CoordinationProtocolPartEditPart) {
			types.add(MumlElementTypes.PortPartCoordinationProtocolPart_4004);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((PortPartEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(PortPartEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == MumlElementTypes.AssemblyConnector_4001) {
			types.add(MumlElementTypes.DiscretePort_3010);
			types.add(MumlElementTypes.ContinuousPort_3011);
			types.add(MumlElementTypes.HybridPort_3013);
			types.add(MumlElementTypes.PortPart_3022);
		} else if (relationshipType == MumlElementTypes.DelegationConnector_4002) {
			types.add(MumlElementTypes.DiscretePort_3010);
			types.add(MumlElementTypes.ContinuousPort_3011);
			types.add(MumlElementTypes.HybridPort_3013);
			types.add(MumlElementTypes.PortPart_3022);
		} else if (relationshipType == MumlElementTypes.PortPartCoordinationProtocolPart_4004) {
			types.add(MumlElementTypes.CoordinationProtocolPart_3016);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((PortPartEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(PortPartEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(MumlElementTypes.AssemblyConnector_4001);
		types.add(MumlElementTypes.DelegationConnector_4002);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((PortPartEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(PortPartEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == MumlElementTypes.AssemblyConnector_4001) {
			types.add(MumlElementTypes.DiscretePort_3010);
			types.add(MumlElementTypes.ContinuousPort_3011);
			types.add(MumlElementTypes.HybridPort_3013);
			types.add(MumlElementTypes.PortPart_3022);
		} else if (relationshipType == MumlElementTypes.DelegationConnector_4002) {
			types.add(MumlElementTypes.DiscretePort_3010);
			types.add(MumlElementTypes.ContinuousPort_3011);
			types.add(MumlElementTypes.HybridPort_3013);
			types.add(MumlElementTypes.PortPart_3022);
		}
		return types;
	}

}
