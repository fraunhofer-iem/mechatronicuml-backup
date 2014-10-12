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
package de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class ComponentSDDModelingAssistantProviderOfLeafNodeEditPart
		extends
		de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.providers.ComponentSDDModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.LeafNodeEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(
			de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.LeafNodeEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes.Edge_4001);
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
				(de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.LeafNodeEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.LeafNodeEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryPatternNodeEditPart) {
			types.add(de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes.Edge_4001);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.LeafNodeEditPart) {
			types.add(de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes.Edge_4001);
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
				(de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.LeafNodeEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(
			de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.LeafNodeEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes.Edge_4001) {
			types.add(de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes.ComponentStoryPatternNode_2003);
			types.add(de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes.LeafNode_2002);
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
		return doGetRelTypesOnTarget((de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.LeafNodeEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(
			de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.LeafNodeEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes.Edge_4001);
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
				(de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.LeafNodeEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(
			de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.edit.parts.LeafNodeEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes.Edge_4001) {
			types.add(de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes.ComponentStoryPatternNode_2003);
			types.add(de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes.LeafNode_2002);
		}
		return types;
	}

}
