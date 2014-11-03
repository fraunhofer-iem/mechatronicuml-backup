package pattern.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import pattern.diagram.edit.parts.CoordinationPatternEditPart;
import pattern.diagram.providers.Pattern2ElementTypes;
import pattern.diagram.providers.Pattern2ModelingAssistantProvider;

/**
 * @generated
 */
public class Pattern2ModelingAssistantProviderOfCoordinationPatternEditPart
		extends Pattern2ModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((CoordinationPatternEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(
			CoordinationPatternEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(Pattern2ElementTypes.RoleCoordinationProtocol_4001);
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
				(CoordinationPatternEditPart) targetEditPart, relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(
			CoordinationPatternEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == Pattern2ElementTypes.RoleCoordinationProtocol_4001) {
			types.add(Pattern2ElementTypes.Role_3002);
		}
		return types;
	}

}
