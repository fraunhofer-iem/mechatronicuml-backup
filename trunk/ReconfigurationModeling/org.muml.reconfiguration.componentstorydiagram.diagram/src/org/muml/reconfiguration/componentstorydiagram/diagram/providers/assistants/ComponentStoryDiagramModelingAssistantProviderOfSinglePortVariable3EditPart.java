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
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.MultiPortVariable2EditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.MultiPortVariableEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.SinglePortVariable2EditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.SinglePortVariable3EditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.SinglePortVariableEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes;
import org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramModelingAssistantProvider;

/**
 * @generated
 */
public class ComponentStoryDiagramModelingAssistantProviderOfSinglePortVariable3EditPart
		extends ComponentStoryDiagramModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((SinglePortVariable3EditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(SinglePortVariable3EditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(ComponentStoryDiagramElementTypes.AssemblyVariable_4004);
		types.add(ComponentStoryDiagramElementTypes.DelegationVariable_4005);
		types.add(ComponentStoryDiagramElementTypes.MultiPortOrderConstraint_4006);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((SinglePortVariable3EditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(SinglePortVariable3EditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof MultiPortVariableEditPart) {
			types.add(ComponentStoryDiagramElementTypes.AssemblyVariable_4004);
		}
		if (targetEditPart instanceof SinglePortVariableEditPart) {
			types.add(ComponentStoryDiagramElementTypes.AssemblyVariable_4004);
		}
		if (targetEditPart instanceof SinglePortVariable2EditPart) {
			types.add(ComponentStoryDiagramElementTypes.AssemblyVariable_4004);
		}
		if (targetEditPart instanceof MultiPortVariable2EditPart) {
			types.add(ComponentStoryDiagramElementTypes.AssemblyVariable_4004);
		}
		if (targetEditPart instanceof SinglePortVariable3EditPart) {
			types.add(ComponentStoryDiagramElementTypes.AssemblyVariable_4004);
		}
		if (targetEditPart instanceof MultiPortVariableEditPart) {
			types.add(ComponentStoryDiagramElementTypes.DelegationVariable_4005);
		}
		if (targetEditPart instanceof SinglePortVariableEditPart) {
			types.add(ComponentStoryDiagramElementTypes.DelegationVariable_4005);
		}
		if (targetEditPart instanceof SinglePortVariable2EditPart) {
			types.add(ComponentStoryDiagramElementTypes.DelegationVariable_4005);
		}
		if (targetEditPart instanceof MultiPortVariable2EditPart) {
			types.add(ComponentStoryDiagramElementTypes.DelegationVariable_4005);
		}
		if (targetEditPart instanceof SinglePortVariable3EditPart) {
			types.add(ComponentStoryDiagramElementTypes.DelegationVariable_4005);
		}
		if (targetEditPart instanceof SinglePortVariableEditPart) {
			types.add(ComponentStoryDiagramElementTypes.MultiPortOrderConstraint_4006);
		}
		if (targetEditPart instanceof SinglePortVariable2EditPart) {
			types.add(ComponentStoryDiagramElementTypes.MultiPortOrderConstraint_4006);
		}
		if (targetEditPart instanceof SinglePortVariable3EditPart) {
			types.add(ComponentStoryDiagramElementTypes.MultiPortOrderConstraint_4006);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((SinglePortVariable3EditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(SinglePortVariable3EditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == ComponentStoryDiagramElementTypes.AssemblyVariable_4004) {
			types.add(ComponentStoryDiagramElementTypes.MultiPortVariable_3016);
			types.add(ComponentStoryDiagramElementTypes.SinglePortVariable_3017);
			types.add(ComponentStoryDiagramElementTypes.SinglePortVariable_3018);
			types.add(ComponentStoryDiagramElementTypes.MultiPortVariable_3019);
			types.add(ComponentStoryDiagramElementTypes.SinglePortVariable_3020);
		} else if (relationshipType == ComponentStoryDiagramElementTypes.DelegationVariable_4005) {
			types.add(ComponentStoryDiagramElementTypes.MultiPortVariable_3016);
			types.add(ComponentStoryDiagramElementTypes.SinglePortVariable_3017);
			types.add(ComponentStoryDiagramElementTypes.SinglePortVariable_3018);
			types.add(ComponentStoryDiagramElementTypes.MultiPortVariable_3019);
			types.add(ComponentStoryDiagramElementTypes.SinglePortVariable_3020);
		} else if (relationshipType == ComponentStoryDiagramElementTypes.MultiPortOrderConstraint_4006) {
			types.add(ComponentStoryDiagramElementTypes.SinglePortVariable_3017);
			types.add(ComponentStoryDiagramElementTypes.SinglePortVariable_3018);
			types.add(ComponentStoryDiagramElementTypes.SinglePortVariable_3020);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((SinglePortVariable3EditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(SinglePortVariable3EditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(ComponentStoryDiagramElementTypes.AssemblyVariable_4004);
		types.add(ComponentStoryDiagramElementTypes.DelegationVariable_4005);
		types.add(ComponentStoryDiagramElementTypes.MultiPortOrderConstraint_4006);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((SinglePortVariable3EditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(SinglePortVariable3EditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == ComponentStoryDiagramElementTypes.AssemblyVariable_4004) {
			types.add(ComponentStoryDiagramElementTypes.MultiPortVariable_3016);
			types.add(ComponentStoryDiagramElementTypes.SinglePortVariable_3017);
			types.add(ComponentStoryDiagramElementTypes.SinglePortVariable_3018);
			types.add(ComponentStoryDiagramElementTypes.MultiPortVariable_3019);
			types.add(ComponentStoryDiagramElementTypes.SinglePortVariable_3020);
		} else if (relationshipType == ComponentStoryDiagramElementTypes.DelegationVariable_4005) {
			types.add(ComponentStoryDiagramElementTypes.MultiPortVariable_3016);
			types.add(ComponentStoryDiagramElementTypes.SinglePortVariable_3017);
			types.add(ComponentStoryDiagramElementTypes.SinglePortVariable_3018);
			types.add(ComponentStoryDiagramElementTypes.MultiPortVariable_3019);
			types.add(ComponentStoryDiagramElementTypes.SinglePortVariable_3020);
		} else if (relationshipType == ComponentStoryDiagramElementTypes.MultiPortOrderConstraint_4006) {
			types.add(ComponentStoryDiagramElementTypes.SinglePortVariable_3017);
			types.add(ComponentStoryDiagramElementTypes.SinglePortVariable_3018);
			types.add(ComponentStoryDiagramElementTypes.SinglePortVariable_3020);
		}
		return types;
	}

}
