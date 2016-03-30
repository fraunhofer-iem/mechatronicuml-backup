package org.muml.storydiagram.verification.sdd.basicsdd.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class BasicSDDModelingAssistantProviderOfCollectionVariableEditPart
		extends
		org.muml.storydiagram.verification.sdd.basicsdd.diagram.providers.BasicSDDModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(org.muml.storydiagram.verification.sdd.basicsdd.diagram.providers.BasicSDDElementTypes.Constraint_3008);
		types.add(org.muml.storydiagram.verification.sdd.basicsdd.diagram.providers.BasicSDDElementTypes.AttributeAssignment_3007);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.CollectionVariableEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(
			org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.CollectionVariableEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(org.muml.storydiagram.verification.sdd.basicsdd.diagram.providers.BasicSDDElementTypes.LinkVariable_4003);
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
				(org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.CollectionVariableEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.CollectionVariableEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.CollectionVariableEditPart) {
			types.add(org.muml.storydiagram.verification.sdd.basicsdd.diagram.providers.BasicSDDElementTypes.LinkVariable_4003);
		}
		if (targetEditPart instanceof org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.ObjectVariableEditPart) {
			types.add(org.muml.storydiagram.verification.sdd.basicsdd.diagram.providers.BasicSDDElementTypes.LinkVariable_4003);
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
				(org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.CollectionVariableEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(
			org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.CollectionVariableEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == org.muml.storydiagram.verification.sdd.basicsdd.diagram.providers.BasicSDDElementTypes.LinkVariable_4003) {
			types.add(org.muml.storydiagram.verification.sdd.basicsdd.diagram.providers.BasicSDDElementTypes.CollectionVariable_3006);
			types.add(org.muml.storydiagram.verification.sdd.basicsdd.diagram.providers.BasicSDDElementTypes.ObjectVariable_3009);
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
		return doGetRelTypesOnTarget((org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.CollectionVariableEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(
			org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.CollectionVariableEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(org.muml.storydiagram.verification.sdd.basicsdd.diagram.providers.BasicSDDElementTypes.LinkVariable_4003);
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
				(org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.CollectionVariableEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(
			org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.CollectionVariableEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == org.muml.storydiagram.verification.sdd.basicsdd.diagram.providers.BasicSDDElementTypes.LinkVariable_4003) {
			types.add(org.muml.storydiagram.verification.sdd.basicsdd.diagram.providers.BasicSDDElementTypes.CollectionVariable_3006);
			types.add(org.muml.storydiagram.verification.sdd.basicsdd.diagram.providers.BasicSDDElementTypes.ObjectVariable_3009);
		}
		return types;
	}

}
