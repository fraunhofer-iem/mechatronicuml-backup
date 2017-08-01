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
package org.muml.pim.realtimestatechart.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.muml.pim.realtimestatechart.diagram.edit.parts.EntryPointEditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.ExitPointEditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.StateEditPart;
import org.muml.pim.realtimestatechart.diagram.providers.MumlElementTypes;
import org.muml.pim.realtimestatechart.diagram.providers.MumlModelingAssistantProvider;

/**
 * @generated
 */
public class MumlModelingAssistantProviderOfExitPointEditPart extends MumlModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((ExitPointEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(ExitPointEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(MumlElementTypes.Transition_4003);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((ExitPointEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(ExitPointEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof StateEditPart) {
			types.add(MumlElementTypes.Transition_4003);
		}
		if (targetEditPart instanceof EntryPointEditPart) {
			types.add(MumlElementTypes.Transition_4003);
		}
		if (targetEditPart instanceof ExitPointEditPart) {
			types.add(MumlElementTypes.Transition_4003);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((ExitPointEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(ExitPointEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == MumlElementTypes.Transition_4003) {
			types.add(MumlElementTypes.State_3032);
			types.add(MumlElementTypes.EntryPoint_3040);
			types.add(MumlElementTypes.ExitPoint_3041);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((ExitPointEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(ExitPointEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(MumlElementTypes.Transition_4003);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((ExitPointEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(ExitPointEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == MumlElementTypes.Transition_4003) {
			types.add(MumlElementTypes.State_3032);
			types.add(MumlElementTypes.EntryPoint_3040);
			types.add(MumlElementTypes.ExitPoint_3041);
		}
		return types;
	}

}
