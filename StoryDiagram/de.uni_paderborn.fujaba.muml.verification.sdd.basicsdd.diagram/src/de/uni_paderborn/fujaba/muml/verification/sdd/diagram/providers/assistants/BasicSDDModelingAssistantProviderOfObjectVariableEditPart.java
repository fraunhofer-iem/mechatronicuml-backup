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
public class BasicSDDModelingAssistantProviderOfObjectVariableEditPart
		extends
		de.uni_paderborn.fujaba.muml.verification.sdd.diagram.providers.BasicSDDModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(de.uni_paderborn.fujaba.muml.verification.sdd.diagram.providers.BasicSDDElementTypes.Constraint_3008);
		types.add(de.uni_paderborn.fujaba.muml.verification.sdd.diagram.providers.BasicSDDElementTypes.AttributeAssignment_3007);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.ObjectVariableEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(
			de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.ObjectVariableEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(de.uni_paderborn.fujaba.muml.verification.sdd.diagram.providers.BasicSDDElementTypes.LinkVariable_4003);
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
				(de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.ObjectVariableEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.ObjectVariableEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.CollectionVariableEditPart) {
			types.add(de.uni_paderborn.fujaba.muml.verification.sdd.diagram.providers.BasicSDDElementTypes.LinkVariable_4003);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.ObjectVariableEditPart) {
			types.add(de.uni_paderborn.fujaba.muml.verification.sdd.diagram.providers.BasicSDDElementTypes.LinkVariable_4003);
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
				(de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.ObjectVariableEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(
			de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.ObjectVariableEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == de.uni_paderborn.fujaba.muml.verification.sdd.diagram.providers.BasicSDDElementTypes.LinkVariable_4003) {
			types.add(de.uni_paderborn.fujaba.muml.verification.sdd.diagram.providers.BasicSDDElementTypes.CollectionVariable_3006);
			types.add(de.uni_paderborn.fujaba.muml.verification.sdd.diagram.providers.BasicSDDElementTypes.ObjectVariable_3009);
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
		return doGetRelTypesOnTarget((de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.ObjectVariableEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(
			de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.ObjectVariableEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(de.uni_paderborn.fujaba.muml.verification.sdd.diagram.providers.BasicSDDElementTypes.LinkVariable_4003);
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
				(de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.ObjectVariableEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(
			de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.ObjectVariableEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == de.uni_paderborn.fujaba.muml.verification.sdd.diagram.providers.BasicSDDElementTypes.LinkVariable_4003) {
			types.add(de.uni_paderborn.fujaba.muml.verification.sdd.diagram.providers.BasicSDDElementTypes.CollectionVariable_3006);
			types.add(de.uni_paderborn.fujaba.muml.verification.sdd.diagram.providers.BasicSDDElementTypes.ObjectVariable_3009);
		}
		return types;
	}

}
