package de.uni_paderborn.fujaba.muml.verification.sdd.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class BasicSDDModelingAssistantProviderOfStoryPatternNodeEditPart
		extends
		de.uni_paderborn.fujaba.muml.verification.sdd.diagram.providers.BasicSDDModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.StoryPatternNodeEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(
			de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.StoryPatternNodeEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(de.uni_paderborn.fujaba.muml.verification.sdd.diagram.providers.BasicSDDElementTypes.Edge_4001);
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
				(de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.StoryPatternNodeEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.StoryPatternNodeEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.StoryPatternNodeEditPart) {
			types.add(de.uni_paderborn.fujaba.muml.verification.sdd.diagram.providers.BasicSDDElementTypes.Edge_4001);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.LeafNodeEditPart) {
			types.add(de.uni_paderborn.fujaba.muml.verification.sdd.diagram.providers.BasicSDDElementTypes.Edge_4001);
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
				(de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.StoryPatternNodeEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(
			de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.StoryPatternNodeEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == de.uni_paderborn.fujaba.muml.verification.sdd.diagram.providers.BasicSDDElementTypes.Edge_4001) {
			types.add(de.uni_paderborn.fujaba.muml.verification.sdd.diagram.providers.BasicSDDElementTypes.StoryPatternNode_2003);
			types.add(de.uni_paderborn.fujaba.muml.verification.sdd.diagram.providers.BasicSDDElementTypes.LeafNode_2004);
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
		return doGetRelTypesOnTarget((de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.StoryPatternNodeEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(
			de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.StoryPatternNodeEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(de.uni_paderborn.fujaba.muml.verification.sdd.diagram.providers.BasicSDDElementTypes.Edge_4001);
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
				(de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.StoryPatternNodeEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(
			de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.StoryPatternNodeEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == de.uni_paderborn.fujaba.muml.verification.sdd.diagram.providers.BasicSDDElementTypes.Edge_4001) {
			types.add(de.uni_paderborn.fujaba.muml.verification.sdd.diagram.providers.BasicSDDElementTypes.StoryPatternNode_2003);
			types.add(de.uni_paderborn.fujaba.muml.verification.sdd.diagram.providers.BasicSDDElementTypes.LeafNode_2004);
		}
		return types;
	}

}
