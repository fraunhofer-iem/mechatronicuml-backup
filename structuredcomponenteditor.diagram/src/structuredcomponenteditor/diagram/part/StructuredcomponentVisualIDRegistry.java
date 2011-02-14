package structuredcomponenteditor.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

import structuredcomponenteditor.ComponenteditorPackage;
import structuredcomponenteditor.StructuredComponentDiagram;
import structuredcomponenteditor.diagram.edit.parts.AssemblyEditPart;
import structuredcomponenteditor.diagram.edit.parts.ComponentPartEditPart;
import structuredcomponenteditor.diagram.edit.parts.DelegationEditPart;
import structuredcomponenteditor.diagram.edit.parts.Port2EditPart;
import structuredcomponenteditor.diagram.edit.parts.PortEditPart;
import structuredcomponenteditor.diagram.edit.parts.StructuredComponentComponentCompartmentEditPart;
import structuredcomponenteditor.diagram.edit.parts.StructuredComponentDiagramEditPart;
import structuredcomponenteditor.diagram.edit.parts.StructuredComponentEditPart;
import structuredcomponenteditor.diagram.edit.parts.StructuredComponentNameEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class StructuredcomponentVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "structuredcomponenteditor.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (StructuredComponentDiagramEditPart.MODEL_ID.equals(view
					.getType())) {
				return StructuredComponentDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return structuredcomponenteditor.diagram.part.StructuredcomponentVisualIDRegistry
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
				StructuredcomponentDiagramEditorPlugin.getInstance().logError(
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
		if (ComponenteditorPackage.eINSTANCE.getStructuredComponentDiagram()
				.isSuperTypeOf(domainElement.eClass())
				&& isDiagram((StructuredComponentDiagram) domainElement)) {
			return StructuredComponentDiagramEditPart.VISUAL_ID;
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
		String containerModelID = structuredcomponenteditor.diagram.part.StructuredcomponentVisualIDRegistry
				.getModelID(containerView);
		if (!StructuredComponentDiagramEditPart.MODEL_ID
				.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (StructuredComponentDiagramEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = structuredcomponenteditor.diagram.part.StructuredcomponentVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = StructuredComponentDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case StructuredComponentDiagramEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.umlrt.model.component.ComponentPackage.eINSTANCE
					.getStructuredComponent().isSuperTypeOf(
							domainElement.eClass())) {
				return StructuredComponentEditPart.VISUAL_ID;
			}
			break;
		case StructuredComponentEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.umlrt.model.component.ComponentPackage.eINSTANCE
					.getPort().isSuperTypeOf(domainElement.eClass())) {
				return PortEditPart.VISUAL_ID;
			}
			break;
		case ComponentPartEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.umlrt.model.component.ComponentPackage.eINSTANCE
					.getPort().isSuperTypeOf(domainElement.eClass())) {
				return Port2EditPart.VISUAL_ID;
			}
			break;
		case StructuredComponentComponentCompartmentEditPart.VISUAL_ID:
			if (de.uni_paderborn.fujaba.umlrt.model.component.ComponentPackage.eINSTANCE
					.getComponentPart().isSuperTypeOf(domainElement.eClass())) {
				return ComponentPartEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = structuredcomponenteditor.diagram.part.StructuredcomponentVisualIDRegistry
				.getModelID(containerView);
		if (!StructuredComponentDiagramEditPart.MODEL_ID
				.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (StructuredComponentDiagramEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = structuredcomponenteditor.diagram.part.StructuredcomponentVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = StructuredComponentDiagramEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case StructuredComponentDiagramEditPart.VISUAL_ID:
			if (StructuredComponentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StructuredComponentEditPart.VISUAL_ID:
			if (StructuredComponentNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StructuredComponentComponentCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComponentPartEditPart.VISUAL_ID:
			if (Port2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StructuredComponentComponentCompartmentEditPart.VISUAL_ID:
			if (ComponentPartEditPart.VISUAL_ID == nodeVisualID) {
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
		if (de.uni_paderborn.fujaba.umlrt.model.component.ComponentPackage.eINSTANCE
				.getDelegation().isSuperTypeOf(domainElement.eClass())) {
			return DelegationEditPart.VISUAL_ID;
		}
		if (de.uni_paderborn.fujaba.umlrt.model.component.ComponentPackage.eINSTANCE
				.getAssembly().isSuperTypeOf(domainElement.eClass())) {
			return AssemblyEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(StructuredComponentDiagram element) {
		return true;
	}

}
