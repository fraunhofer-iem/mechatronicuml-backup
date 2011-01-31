package patterneditor.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

import patterneditor.PatternDiagram;
import patterneditor.PatterneditorPackage;
import patterneditor.diagram.edit.parts.CoordinationPatternEditPart;
import patterneditor.diagram.edit.parts.CoordinationPatternNameEditPart;
import patterneditor.diagram.edit.parts.PatternDiagramEditPart;
import patterneditor.diagram.edit.parts.RoleConnectorEditPart;
import patterneditor.diagram.edit.parts.RoleEditPart;
import patterneditor.diagram.edit.parts.RoleNameEditPart;
import patterneditor.diagram.edit.parts.TextualConstraintEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class PatternVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "patterneditor.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (PatternDiagramEditPart.MODEL_ID.equals(view.getType())) {
				return PatternDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return patterneditor.diagram.part.PatternVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				PatternDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (PatterneditorPackage.eINSTANCE.getPatternDiagram().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((PatternDiagram) domainElement)) {
			return PatternDiagramEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = patterneditor.diagram.part.PatternVisualIDRegistry
				.getModelID(containerView);
		if (!PatternDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (PatternDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = patterneditor.diagram.part.PatternVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = PatternDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case PatternDiagramEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.umlrt.model.pattern.PatternPackage.eINSTANCE
					.getCoordinationPattern().isSuperTypeOf(
							domainElement.eClass())) {
				return CoordinationPatternEditPart.VISUAL_ID;
			}
			if (de.uni_paderborn.fujaba.umlrt.model.pattern.PatternPackage.eINSTANCE
					.getRole().isSuperTypeOf(domainElement.eClass())) {
				return RoleEditPart.VISUAL_ID;
			}
			if (de.uni_paderborn.fujaba.umlrt.model.constraint.ConstraintPackage.eINSTANCE
					.getTextualConstraint().isSuperTypeOf(
							domainElement.eClass())) {
				return TextualConstraintEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = patterneditor.diagram.part.PatternVisualIDRegistry
				.getModelID(containerView);
		if (!PatternDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (PatternDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = patterneditor.diagram.part.PatternVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = PatternDiagramEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case PatternDiagramEditPart.VISUAL_ID:
			if (CoordinationPatternEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RoleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TextualConstraintEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CoordinationPatternEditPart.VISUAL_ID:
			if (CoordinationPatternNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RoleEditPart.VISUAL_ID:
			if (RoleNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (de.uni_paderborn.fujaba.umlrt.model.pattern.PatternPackage.eINSTANCE
				.getRoleConnector().isSuperTypeOf(domainElement.eClass())) {
			return RoleConnectorEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(PatternDiagram element) {
		return true;
	}

}
