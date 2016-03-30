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
package org.muml.reconfiguration.componentstorydiagram.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class ComponentStoryDiagramModelingAssistantProviderOfInitialNodeEditPart
		extends
		org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.InitialNodeEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(
			org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.InitialNodeEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.ActivityEdge_4001);
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
				(org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.InitialNodeEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.InitialNodeEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentStoryNodeEditPart) {
			types.add(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.ActivityEdge_4001);
		}
		if (targetEditPart instanceof org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.InitialNodeEditPart) {
			types.add(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.ActivityEdge_4001);
		}
		if (targetEditPart instanceof org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.JunctionNodeEditPart) {
			types.add(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.ActivityEdge_4001);
		}
		if (targetEditPart instanceof org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ActivityFinalNodeEditPart) {
			types.add(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.ActivityEdge_4001);
		}
		if (targetEditPart instanceof org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ControllerExchangeNodeEditPart) {
			types.add(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.ActivityEdge_4001);
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
				(org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.InitialNodeEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(
			org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.InitialNodeEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.ActivityEdge_4001) {
			types.add(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.ComponentStoryNode_3001);
			types.add(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.InitialNode_3007);
			types.add(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.JunctionNode_3008);
			types.add(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.ActivityFinalNode_3010);
			types.add(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.ControllerExchangeNode_3021);
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
		return doGetRelTypesOnTarget((org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.InitialNodeEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(
			org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.InitialNodeEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.ActivityEdge_4001);
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
				(org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.InitialNodeEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(
			org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.InitialNodeEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.ActivityEdge_4001) {
			types.add(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.ComponentStoryNode_3001);
			types.add(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.InitialNode_3007);
			types.add(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.JunctionNode_3008);
			types.add(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.ActivityFinalNode_3010);
			types.add(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.ControllerExchangeNode_3021);
		}
		return types;
	}

}
