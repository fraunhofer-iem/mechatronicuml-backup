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
public class ComponentStoryDiagramModelingAssistantProviderOfSinglePortVariableEditPart
		extends
		org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.SinglePortVariableEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(
			org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.SinglePortVariableEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.AssemblyVariable_4004);
		types.add(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.DelegationVariable_4005);
		types.add(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.MultiPortOrderConstraint_4006);
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
				(org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.SinglePortVariableEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.SinglePortVariableEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.MultiPortVariableEditPart) {
			types.add(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.AssemblyVariable_4004);
		}
		if (targetEditPart instanceof org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.SinglePortVariableEditPart) {
			types.add(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.AssemblyVariable_4004);
		}
		if (targetEditPart instanceof org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.SinglePortVariable2EditPart) {
			types.add(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.AssemblyVariable_4004);
		}
		if (targetEditPart instanceof org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.MultiPortVariable2EditPart) {
			types.add(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.AssemblyVariable_4004);
		}
		if (targetEditPart instanceof org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.SinglePortVariable3EditPart) {
			types.add(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.AssemblyVariable_4004);
		}
		if (targetEditPart instanceof org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.MultiPortVariableEditPart) {
			types.add(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.DelegationVariable_4005);
		}
		if (targetEditPart instanceof org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.SinglePortVariableEditPart) {
			types.add(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.DelegationVariable_4005);
		}
		if (targetEditPart instanceof org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.SinglePortVariable2EditPart) {
			types.add(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.DelegationVariable_4005);
		}
		if (targetEditPart instanceof org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.MultiPortVariable2EditPart) {
			types.add(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.DelegationVariable_4005);
		}
		if (targetEditPart instanceof org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.SinglePortVariable3EditPart) {
			types.add(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.DelegationVariable_4005);
		}
		if (targetEditPart instanceof org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.SinglePortVariableEditPart) {
			types.add(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.MultiPortOrderConstraint_4006);
		}
		if (targetEditPart instanceof org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.SinglePortVariable2EditPart) {
			types.add(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.MultiPortOrderConstraint_4006);
		}
		if (targetEditPart instanceof org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.SinglePortVariable3EditPart) {
			types.add(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.MultiPortOrderConstraint_4006);
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
				(org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.SinglePortVariableEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(
			org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.SinglePortVariableEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.AssemblyVariable_4004) {
			types.add(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.MultiPortVariable_3016);
			types.add(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.SinglePortVariable_3017);
			types.add(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.SinglePortVariable_3018);
			types.add(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.MultiPortVariable_3019);
			types.add(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.SinglePortVariable_3020);
		} else if (relationshipType == org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.DelegationVariable_4005) {
			types.add(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.MultiPortVariable_3016);
			types.add(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.SinglePortVariable_3017);
			types.add(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.SinglePortVariable_3018);
			types.add(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.MultiPortVariable_3019);
			types.add(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.SinglePortVariable_3020);
		} else if (relationshipType == org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.MultiPortOrderConstraint_4006) {
			types.add(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.SinglePortVariable_3017);
			types.add(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.SinglePortVariable_3018);
			types.add(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.SinglePortVariable_3020);
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
		return doGetRelTypesOnTarget((org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.SinglePortVariableEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(
			org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.SinglePortVariableEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.AssemblyVariable_4004);
		types.add(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.DelegationVariable_4005);
		types.add(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.MultiPortOrderConstraint_4006);
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
				(org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.SinglePortVariableEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(
			org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.SinglePortVariableEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.AssemblyVariable_4004) {
			types.add(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.MultiPortVariable_3016);
			types.add(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.SinglePortVariable_3017);
			types.add(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.SinglePortVariable_3018);
			types.add(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.MultiPortVariable_3019);
			types.add(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.SinglePortVariable_3020);
		} else if (relationshipType == org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.DelegationVariable_4005) {
			types.add(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.MultiPortVariable_3016);
			types.add(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.SinglePortVariable_3017);
			types.add(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.SinglePortVariable_3018);
			types.add(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.MultiPortVariable_3019);
			types.add(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.SinglePortVariable_3020);
		} else if (relationshipType == org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.MultiPortOrderConstraint_4006) {
			types.add(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.SinglePortVariable_3017);
			types.add(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.SinglePortVariable_3018);
			types.add(org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.SinglePortVariable_3020);
		}
		return types;
	}

}
