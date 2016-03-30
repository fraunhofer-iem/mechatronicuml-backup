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
package org.muml.reconfiguration.verification.sdd.componentsdd.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class ComponentSDDModelingAssistantProviderOfMultiPortVariable2EditPart
		extends
		org.muml.reconfiguration.verification.sdd.componentsdd.diagram.providers.ComponentSDDModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(org.muml.reconfiguration.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes.SinglePortVariable_3005);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.MultiPortVariable2EditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(
			org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.MultiPortVariable2EditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(org.muml.reconfiguration.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes.AssemblyVariable_4002);
		types.add(org.muml.reconfiguration.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes.DelegationVariable_4003);
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
				(org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.MultiPortVariable2EditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.MultiPortVariable2EditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.MultiPortVariableEditPart) {
			types.add(org.muml.reconfiguration.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes.AssemblyVariable_4002);
		}
		if (targetEditPart instanceof org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.SinglePortVariableEditPart) {
			types.add(org.muml.reconfiguration.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes.AssemblyVariable_4002);
		}
		if (targetEditPart instanceof org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.SinglePortVariable2EditPart) {
			types.add(org.muml.reconfiguration.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes.AssemblyVariable_4002);
		}
		if (targetEditPart instanceof org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.MultiPortVariable2EditPart) {
			types.add(org.muml.reconfiguration.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes.AssemblyVariable_4002);
		}
		if (targetEditPart instanceof org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.SinglePortVariable3EditPart) {
			types.add(org.muml.reconfiguration.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes.AssemblyVariable_4002);
		}
		if (targetEditPart instanceof org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.MultiPortVariableEditPart) {
			types.add(org.muml.reconfiguration.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes.DelegationVariable_4003);
		}
		if (targetEditPart instanceof org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.SinglePortVariableEditPart) {
			types.add(org.muml.reconfiguration.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes.DelegationVariable_4003);
		}
		if (targetEditPart instanceof org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.SinglePortVariable2EditPart) {
			types.add(org.muml.reconfiguration.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes.DelegationVariable_4003);
		}
		if (targetEditPart instanceof org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.MultiPortVariable2EditPart) {
			types.add(org.muml.reconfiguration.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes.DelegationVariable_4003);
		}
		if (targetEditPart instanceof org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.SinglePortVariable3EditPart) {
			types.add(org.muml.reconfiguration.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes.DelegationVariable_4003);
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
				(org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.MultiPortVariable2EditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(
			org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.MultiPortVariable2EditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == org.muml.reconfiguration.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes.AssemblyVariable_4002) {
			types.add(org.muml.reconfiguration.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes.MultiPortVariable_3004);
			types.add(org.muml.reconfiguration.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes.SinglePortVariable_3005);
			types.add(org.muml.reconfiguration.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes.SinglePortVariable_3006);
			types.add(org.muml.reconfiguration.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes.MultiPortVariable_3007);
			types.add(org.muml.reconfiguration.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes.SinglePortVariable_3008);
		} else if (relationshipType == org.muml.reconfiguration.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes.DelegationVariable_4003) {
			types.add(org.muml.reconfiguration.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes.MultiPortVariable_3004);
			types.add(org.muml.reconfiguration.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes.SinglePortVariable_3005);
			types.add(org.muml.reconfiguration.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes.SinglePortVariable_3006);
			types.add(org.muml.reconfiguration.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes.MultiPortVariable_3007);
			types.add(org.muml.reconfiguration.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes.SinglePortVariable_3008);
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
		return doGetRelTypesOnTarget((org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.MultiPortVariable2EditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(
			org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.MultiPortVariable2EditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(org.muml.reconfiguration.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes.AssemblyVariable_4002);
		types.add(org.muml.reconfiguration.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes.DelegationVariable_4003);
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
				(org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.MultiPortVariable2EditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(
			org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.MultiPortVariable2EditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == org.muml.reconfiguration.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes.AssemblyVariable_4002) {
			types.add(org.muml.reconfiguration.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes.MultiPortVariable_3004);
			types.add(org.muml.reconfiguration.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes.SinglePortVariable_3005);
			types.add(org.muml.reconfiguration.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes.SinglePortVariable_3006);
			types.add(org.muml.reconfiguration.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes.MultiPortVariable_3007);
			types.add(org.muml.reconfiguration.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes.SinglePortVariable_3008);
		} else if (relationshipType == org.muml.reconfiguration.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes.DelegationVariable_4003) {
			types.add(org.muml.reconfiguration.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes.MultiPortVariable_3004);
			types.add(org.muml.reconfiguration.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes.SinglePortVariable_3005);
			types.add(org.muml.reconfiguration.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes.SinglePortVariable_3006);
			types.add(org.muml.reconfiguration.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes.MultiPortVariable_3007);
			types.add(org.muml.reconfiguration.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes.SinglePortVariable_3008);
		}
		return types;
	}

}
