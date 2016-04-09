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
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ActivityFinalNodeEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentStoryNodeEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ControllerExchangeNodeEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.InitialNodeEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.JunctionNodeEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes;
import org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramModelingAssistantProvider;

/**
 * @generated
 */
public class ComponentStoryDiagramModelingAssistantProviderOfComponentStoryNodeEditPart
		extends ComponentStoryDiagramModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(ComponentStoryDiagramElementTypes.ComponentStoryPattern_3011);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((ComponentStoryNodeEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(ComponentStoryNodeEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(ComponentStoryDiagramElementTypes.ActivityEdge_4001);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((ComponentStoryNodeEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(ComponentStoryNodeEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof ComponentStoryNodeEditPart) {
			types.add(ComponentStoryDiagramElementTypes.ActivityEdge_4001);
		}
		if (targetEditPart instanceof InitialNodeEditPart) {
			types.add(ComponentStoryDiagramElementTypes.ActivityEdge_4001);
		}
		if (targetEditPart instanceof JunctionNodeEditPart) {
			types.add(ComponentStoryDiagramElementTypes.ActivityEdge_4001);
		}
		if (targetEditPart instanceof ActivityFinalNodeEditPart) {
			types.add(ComponentStoryDiagramElementTypes.ActivityEdge_4001);
		}
		if (targetEditPart instanceof ControllerExchangeNodeEditPart) {
			types.add(ComponentStoryDiagramElementTypes.ActivityEdge_4001);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((ComponentStoryNodeEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(ComponentStoryNodeEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == ComponentStoryDiagramElementTypes.ActivityEdge_4001) {
			types.add(ComponentStoryDiagramElementTypes.ComponentStoryNode_3001);
			types.add(ComponentStoryDiagramElementTypes.InitialNode_3007);
			types.add(ComponentStoryDiagramElementTypes.JunctionNode_3008);
			types.add(ComponentStoryDiagramElementTypes.ActivityFinalNode_3010);
			types.add(ComponentStoryDiagramElementTypes.ControllerExchangeNode_3021);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((ComponentStoryNodeEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(ComponentStoryNodeEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(ComponentStoryDiagramElementTypes.ActivityEdge_4001);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((ComponentStoryNodeEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(ComponentStoryNodeEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == ComponentStoryDiagramElementTypes.ActivityEdge_4001) {
			types.add(ComponentStoryDiagramElementTypes.ComponentStoryNode_3001);
			types.add(ComponentStoryDiagramElementTypes.InitialNode_3007);
			types.add(ComponentStoryDiagramElementTypes.JunctionNode_3008);
			types.add(ComponentStoryDiagramElementTypes.ActivityFinalNode_3010);
			types.add(ComponentStoryDiagramElementTypes.ControllerExchangeNode_3021);
		}
		return types;
	}

}
