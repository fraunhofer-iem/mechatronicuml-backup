package org.muml.testlanguage.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class TestLanguageModelingAssistantProviderOfInputEditPart
		extends
		org.muml.testlanguage.diagram.providers.TestLanguageModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((org.muml.testlanguage.diagram.edit.parts.InputEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(
			org.muml.testlanguage.diagram.edit.parts.InputEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(org.muml.testlanguage.diagram.providers.TestLanguageElementTypes.OutputTargets_4001);
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
				(org.muml.testlanguage.diagram.edit.parts.InputEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(
			org.muml.testlanguage.diagram.edit.parts.InputEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == org.muml.testlanguage.diagram.providers.TestLanguageElementTypes.OutputTargets_4001) {
			types.add(org.muml.testlanguage.diagram.providers.TestLanguageElementTypes.Output_3002);
		}
		return types;
	}

}
