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

/**
 * @generated
 */
public class MumlModelingAssistantProviderOfContinuousPortEditPart
		extends org.muml.pim.component.diagram.providers.MumlModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource(
				(org.muml.pim.component.diagram.edit.parts.ContinuousPortEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(
			org.muml.pim.component.diagram.edit.parts.ContinuousPortEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(org.muml.pim.component.diagram.providers.MumlElementTypes.AssemblyConnector_4001);
		types.add(org.muml.pim.component.diagram.providers.MumlElementTypes.DelegationConnector_4002);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget(
				(org.muml.pim.component.diagram.edit.parts.ContinuousPortEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			org.muml.pim.component.diagram.edit.parts.ContinuousPortEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof org.muml.pim.component.diagram.edit.parts.DiscretePortEditPart) {
			types.add(org.muml.pim.component.diagram.providers.MumlElementTypes.AssemblyConnector_4001);
		}
		if (targetEditPart instanceof org.muml.pim.component.diagram.edit.parts.ContinuousPortEditPart) {
			types.add(org.muml.pim.component.diagram.providers.MumlElementTypes.AssemblyConnector_4001);
		}
		if (targetEditPart instanceof org.muml.pim.component.diagram.edit.parts.HybridPortEditPart) {
			types.add(org.muml.pim.component.diagram.providers.MumlElementTypes.AssemblyConnector_4001);
		}
		if (targetEditPart instanceof org.muml.pim.component.diagram.edit.parts.PortPartEditPart) {
			types.add(org.muml.pim.component.diagram.providers.MumlElementTypes.AssemblyConnector_4001);
		}
		if (targetEditPart instanceof org.muml.pim.component.diagram.edit.parts.DiscretePortEditPart) {
			types.add(
					org.muml.pim.component.diagram.providers.MumlElementTypes.DelegationConnector_4002);
		}
		if (targetEditPart instanceof org.muml.pim.component.diagram.edit.parts.ContinuousPortEditPart) {
			types.add(
					org.muml.pim.component.diagram.providers.MumlElementTypes.DelegationConnector_4002);
		}
		if (targetEditPart instanceof org.muml.pim.component.diagram.edit.parts.HybridPortEditPart) {
			types.add(
					org.muml.pim.component.diagram.providers.MumlElementTypes.DelegationConnector_4002);
		}
		if (targetEditPart instanceof org.muml.pim.component.diagram.edit.parts.PortPartEditPart) {
			types.add(
					org.muml.pim.component.diagram.providers.MumlElementTypes.DelegationConnector_4002);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget(
				(org.muml.pim.component.diagram.edit.parts.ContinuousPortEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(
			org.muml.pim.component.diagram.edit.parts.ContinuousPortEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == org.muml.pim.component.diagram.providers.MumlElementTypes.AssemblyConnector_4001) {
			types.add(org.muml.pim.component.diagram.providers.MumlElementTypes.DiscretePort_3010);
			types.add(org.muml.pim.component.diagram.providers.MumlElementTypes.ContinuousPort_3011);
			types.add(org.muml.pim.component.diagram.providers.MumlElementTypes.HybridPort_3013);
			types.add(org.muml.pim.component.diagram.providers.MumlElementTypes.PortPart_3022);
		} else if (relationshipType == org.muml.pim.component.diagram.providers.MumlElementTypes.DelegationConnector_4002) {
			types.add(org.muml.pim.component.diagram.providers.MumlElementTypes.DiscretePort_3010);
			types.add(org.muml.pim.component.diagram.providers.MumlElementTypes.ContinuousPort_3011);
			types.add(org.muml.pim.component.diagram.providers.MumlElementTypes.HybridPort_3013);
			types.add(org.muml.pim.component.diagram.providers.MumlElementTypes.PortPart_3022);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget(
				(org.muml.pim.component.diagram.edit.parts.ContinuousPortEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(
			org.muml.pim.component.diagram.edit.parts.ContinuousPortEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(org.muml.pim.component.diagram.providers.MumlElementTypes.AssemblyConnector_4001);
		types.add(org.muml.pim.component.diagram.providers.MumlElementTypes.DelegationConnector_4002);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource(
				(org.muml.pim.component.diagram.edit.parts.ContinuousPortEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(
			org.muml.pim.component.diagram.edit.parts.ContinuousPortEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == org.muml.pim.component.diagram.providers.MumlElementTypes.AssemblyConnector_4001) {
			types.add(org.muml.pim.component.diagram.providers.MumlElementTypes.DiscretePort_3010);
			types.add(org.muml.pim.component.diagram.providers.MumlElementTypes.ContinuousPort_3011);
			types.add(org.muml.pim.component.diagram.providers.MumlElementTypes.HybridPort_3013);
			types.add(org.muml.pim.component.diagram.providers.MumlElementTypes.PortPart_3022);
		} else if (relationshipType == org.muml.pim.component.diagram.providers.MumlElementTypes.DelegationConnector_4002) {
			types.add(org.muml.pim.component.diagram.providers.MumlElementTypes.DiscretePort_3010);
			types.add(org.muml.pim.component.diagram.providers.MumlElementTypes.ContinuousPort_3011);
			types.add(org.muml.pim.component.diagram.providers.MumlElementTypes.HybridPort_3013);
			types.add(org.muml.pim.component.diagram.providers.MumlElementTypes.PortPart_3022);
		}
		return types;
	}

}
