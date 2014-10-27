package pattern.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import pattern.PatternPackage;
import pattern.diagram.edit.parts.CoordinationPattern2EditPart;
import pattern.diagram.edit.parts.CoordinationPatternEditPart;
import pattern.diagram.edit.parts.CoordinationPatternPatternCompartment2EditPart;
import pattern.diagram.edit.parts.CoordinationPatternPatternCompartmentEditPart;
import pattern.diagram.edit.parts.ModelElementCategoryEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class Pattern2VisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "de.uni_paderborn.fujaba.muml.pattern.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (ModelElementCategoryEditPart.MODEL_ID.equals(view.getType())) {
				return ModelElementCategoryEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return pattern.diagram.part.Pattern2VisualIDRegistry.getVisualID(view
				.getType());
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
				Pattern2DiagramEditorPlugin.getInstance().logError(
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
		if (de.uni_paderborn.fujaba.modelinstance.ModelinstancePackage.eINSTANCE
				.getModelElementCategory()
				.isSuperTypeOf(domainElement.eClass())
				&& isDiagram((de.uni_paderborn.fujaba.modelinstance.ModelElementCategory) domainElement)) {
			return ModelElementCategoryEditPart.VISUAL_ID;
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
		String containerModelID = pattern.diagram.part.Pattern2VisualIDRegistry
				.getModelID(containerView);
		if (!ModelElementCategoryEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (ModelElementCategoryEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = pattern.diagram.part.Pattern2VisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ModelElementCategoryEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case ModelElementCategoryEditPart.VISUAL_ID:
			if (PatternPackage.eINSTANCE.getCoordinationPattern()
					.isSuperTypeOf(domainElement.eClass())) {
				return CoordinationPatternEditPart.VISUAL_ID;
			}
			break;
		case CoordinationPatternPatternCompartmentEditPart.VISUAL_ID:
			if (PatternPackage.eINSTANCE.getCoordinationPattern()
					.isSuperTypeOf(domainElement.eClass())) {
				return CoordinationPattern2EditPart.VISUAL_ID;
			}
			break;
		case CoordinationPatternPatternCompartment2EditPart.VISUAL_ID:
			if (PatternPackage.eINSTANCE.getCoordinationPattern()
					.isSuperTypeOf(domainElement.eClass())) {
				return CoordinationPattern2EditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = pattern.diagram.part.Pattern2VisualIDRegistry
				.getModelID(containerView);
		if (!ModelElementCategoryEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (ModelElementCategoryEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = pattern.diagram.part.Pattern2VisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ModelElementCategoryEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case ModelElementCategoryEditPart.VISUAL_ID:
			if (CoordinationPatternEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CoordinationPatternEditPart.VISUAL_ID:
			if (CoordinationPatternPatternCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CoordinationPattern2EditPart.VISUAL_ID:
			if (CoordinationPatternPatternCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CoordinationPatternPatternCompartmentEditPart.VISUAL_ID:
			if (CoordinationPattern2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CoordinationPatternPatternCompartment2EditPart.VISUAL_ID:
			if (CoordinationPattern2EditPart.VISUAL_ID == nodeVisualID) {
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
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(
			de.uni_paderborn.fujaba.modelinstance.ModelElementCategory element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case CoordinationPatternPatternCompartmentEditPart.VISUAL_ID:
		case CoordinationPatternPatternCompartment2EditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case ModelElementCategoryEditPart.VISUAL_ID:
			return false;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return pattern.diagram.part.Pattern2VisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return pattern.diagram.part.Pattern2VisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return pattern.diagram.part.Pattern2VisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return pattern.diagram.part.Pattern2VisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return pattern.diagram.part.Pattern2VisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return pattern.diagram.part.Pattern2VisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
