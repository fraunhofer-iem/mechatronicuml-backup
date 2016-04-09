package org.muml.storydiagram.verification.sdd.basicsdd.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.LeafNodeEditPart;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.StoryPatternNodeEditPart;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.providers.BasicSDDElementTypes;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.providers.BasicSDDModelingAssistantProvider;

/**
 * @generated
 */
public class BasicSDDModelingAssistantProviderOfStoryPatternNodeEditPart extends BasicSDDModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((StoryPatternNodeEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(StoryPatternNodeEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(BasicSDDElementTypes.Edge_4001);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((StoryPatternNodeEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(StoryPatternNodeEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof StoryPatternNodeEditPart) {
			types.add(BasicSDDElementTypes.Edge_4001);
		}
		if (targetEditPart instanceof LeafNodeEditPart) {
			types.add(BasicSDDElementTypes.Edge_4001);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((StoryPatternNodeEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(StoryPatternNodeEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == BasicSDDElementTypes.Edge_4001) {
			types.add(BasicSDDElementTypes.StoryPatternNode_2003);
			types.add(BasicSDDElementTypes.LeafNode_2004);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((StoryPatternNodeEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(StoryPatternNodeEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(BasicSDDElementTypes.Edge_4001);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((StoryPatternNodeEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(StoryPatternNodeEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == BasicSDDElementTypes.Edge_4001) {
			types.add(BasicSDDElementTypes.StoryPatternNode_2003);
			types.add(BasicSDDElementTypes.LeafNode_2004);
		}
		return types;
	}

}
