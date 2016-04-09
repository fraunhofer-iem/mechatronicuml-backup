package org.muml.testlanguage.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;
import org.muml.testlanguage.TestCase;
import org.muml.testlanguage.TestLanguagePackage;
import org.muml.testlanguage.diagram.edit.parts.InputEditPart;
import org.muml.testlanguage.diagram.edit.parts.InputNameEditPart;
import org.muml.testlanguage.diagram.edit.parts.NodeEditPart;
import org.muml.testlanguage.diagram.edit.parts.NodeLabelEditPart;
import org.muml.testlanguage.diagram.edit.parts.NodeNodeFigureCompartmentEditPart;
import org.muml.testlanguage.diagram.edit.parts.OutputEditPart;
import org.muml.testlanguage.diagram.edit.parts.OutputNameEditPart;
import org.muml.testlanguage.diagram.edit.parts.TestCaseEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class TestLanguageVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "org.muml.testlanguage.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (TestCaseEditPart.MODEL_ID.equals(view.getType())) {
				return TestCaseEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return org.muml.testlanguage.diagram.part.TestLanguageVisualIDRegistry.getVisualID(view.getType());
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
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				TestLanguageDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
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
		if (TestLanguagePackage.eINSTANCE.getTestCase().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((TestCase) domainElement)) {
			return TestCaseEditPart.VISUAL_ID;
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
		String containerModelID = org.muml.testlanguage.diagram.part.TestLanguageVisualIDRegistry
				.getModelID(containerView);
		if (!TestCaseEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (TestCaseEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.muml.testlanguage.diagram.part.TestLanguageVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = TestCaseEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case TestCaseEditPart.VISUAL_ID:
			if (TestLanguagePackage.eINSTANCE.getNode().isSuperTypeOf(domainElement.eClass())) {
				return NodeEditPart.VISUAL_ID;
			}
			break;
		case NodeNodeFigureCompartmentEditPart.VISUAL_ID:
			if (TestLanguagePackage.eINSTANCE.getInput().isSuperTypeOf(domainElement.eClass())) {
				return InputEditPart.VISUAL_ID;
			}
			if (TestLanguagePackage.eINSTANCE.getOutput().isSuperTypeOf(domainElement.eClass())) {
				return OutputEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = org.muml.testlanguage.diagram.part.TestLanguageVisualIDRegistry
				.getModelID(containerView);
		if (!TestCaseEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (TestCaseEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.muml.testlanguage.diagram.part.TestLanguageVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = TestCaseEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case TestCaseEditPart.VISUAL_ID:
			if (NodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case NodeEditPart.VISUAL_ID:
			if (NodeLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NodeNodeFigureCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InputEditPart.VISUAL_ID:
			if (InputNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OutputEditPart.VISUAL_ID:
			if (OutputNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case NodeNodeFigureCompartmentEditPart.VISUAL_ID:
			if (InputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OutputEditPart.VISUAL_ID == nodeVisualID) {
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
	private static boolean isDiagram(TestCase element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
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
		case NodeNodeFigureCompartmentEditPart.VISUAL_ID:
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
		case TestCaseEditPart.VISUAL_ID:
			return false;
		case InputEditPart.VISUAL_ID:
		case OutputEditPart.VISUAL_ID:
			return true;
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
			return org.muml.testlanguage.diagram.part.TestLanguageVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return org.muml.testlanguage.diagram.part.TestLanguageVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return org.muml.testlanguage.diagram.part.TestLanguageVisualIDRegistry.getNodeVisualID(containerView,
					domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return org.muml.testlanguage.diagram.part.TestLanguageVisualIDRegistry.checkNodeVisualID(containerView,
					domainElement, candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return org.muml.testlanguage.diagram.part.TestLanguageVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return org.muml.testlanguage.diagram.part.TestLanguageVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
