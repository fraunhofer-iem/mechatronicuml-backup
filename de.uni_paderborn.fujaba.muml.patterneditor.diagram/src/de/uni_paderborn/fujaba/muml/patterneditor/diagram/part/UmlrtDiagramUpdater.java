package de.uni_paderborn.fujaba.muml.patterneditor.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class UmlrtDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.UmlrtNodeDescriptor> getSemanticChildren(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.UmlrtVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.PatternDiagramEditPart.VISUAL_ID:
			return getCoordinationPattern_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.UmlrtNodeDescriptor> getCoordinationPattern_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.model.pattern.CoordinationPattern modelElement = (de.uni_paderborn.fujaba.muml.model.pattern.CoordinationPattern) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.UmlrtNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.UmlrtNodeDescriptor>();
		for (Iterator<?> it = modelElement.getRoles().iterator(); it.hasNext();) {
			de.uni_paderborn.fujaba.muml.model.pattern.Role childElement = (de.uni_paderborn.fujaba.muml.model.pattern.Role) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.UmlrtVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.CoordinationPatternEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.UmlrtNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getConstraint().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.model.constraint.Constraint childElement = (de.uni_paderborn.fujaba.muml.model.constraint.Constraint) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.UmlrtVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.RectangleEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.UmlrtNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.UmlrtLinkDescriptor> getContainedLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.UmlrtVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.PatternDiagramEditPart.VISUAL_ID:
			return getCoordinationPattern_1000ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.CoordinationPatternEditPart.VISUAL_ID:
			return getRole_2001ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.RectangleEditPart.VISUAL_ID:
			return getTextualConstraint_2002ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID:
			return getRoleConnector_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.UmlrtLinkDescriptor> getIncomingLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.UmlrtVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.CoordinationPatternEditPart.VISUAL_ID:
			return getRole_2001IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.RectangleEditPart.VISUAL_ID:
			return getTextualConstraint_2002IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID:
			return getRoleConnector_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.UmlrtLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.UmlrtVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.CoordinationPatternEditPart.VISUAL_ID:
			return getRole_2001OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.RectangleEditPart.VISUAL_ID:
			return getTextualConstraint_2002OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID:
			return getRoleConnector_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.UmlrtLinkDescriptor> getCoordinationPattern_1000ContainedLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.pattern.CoordinationPattern modelElement = (de.uni_paderborn.fujaba.muml.model.pattern.CoordinationPattern) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.UmlrtLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.UmlrtLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_RoleConnector_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ConstrainableElement_Constraint_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.UmlrtLinkDescriptor> getRole_2001ContainedLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.pattern.Role modelElement = (de.uni_paderborn.fujaba.muml.model.pattern.Role) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.UmlrtLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.UmlrtLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ConstrainableElement_Constraint_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.UmlrtLinkDescriptor> getTextualConstraint_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.UmlrtLinkDescriptor> getRoleConnector_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.UmlrtLinkDescriptor> getRole_2001IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.pattern.Role modelElement = (de.uni_paderborn.fujaba.muml.model.pattern.Role) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.UmlrtLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.UmlrtLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_RoleConnector_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.UmlrtLinkDescriptor> getTextualConstraint_2002IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.constraint.TextualConstraint modelElement = (de.uni_paderborn.fujaba.muml.model.constraint.TextualConstraint) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.UmlrtLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.UmlrtLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_ConstrainableElement_Constraint_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.UmlrtLinkDescriptor> getRoleConnector_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.UmlrtLinkDescriptor> getRole_2001OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.pattern.Role modelElement = (de.uni_paderborn.fujaba.muml.model.pattern.Role) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.UmlrtLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.UmlrtLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_RoleConnector_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ConstrainableElement_Constraint_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.UmlrtLinkDescriptor> getTextualConstraint_2002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.UmlrtLinkDescriptor> getRoleConnector_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.UmlrtLinkDescriptor> getContainedTypeModelFacetLinks_RoleConnector_4001(
			de.uni_paderborn.fujaba.muml.model.pattern.CoordinationPattern container) {
		LinkedList<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.UmlrtLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.UmlrtLinkDescriptor>();
		de.uni_paderborn.fujaba.muml.model.pattern.RoleConnector link = container
				.getConnectors();
		if (de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.UmlrtVisualIDRegistry
				.getLinkWithClassVisualID(link)) {
			return result;
		}
		de.uni_paderborn.fujaba.muml.model.pattern.Role dst = link.getTarget();
		de.uni_paderborn.fujaba.muml.model.pattern.Role src = link.getSource();
		result.add(new de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.UmlrtLinkDescriptor(
				src,
				dst,
				link,
				de.uni_paderborn.fujaba.muml.patterneditor.diagram.providers.UmlrtElementTypes.RoleConnector_4001,
				de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.UmlrtLinkDescriptor> getIncomingTypeModelFacetLinks_RoleConnector_4001(
			de.uni_paderborn.fujaba.muml.model.pattern.Role target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.UmlrtLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.UmlrtLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != de.uni_paderborn.fujaba.muml.model.pattern.PatternPackage.eINSTANCE
					.getRoleConnector_Target()
					|| false == setting.getEObject() instanceof de.uni_paderborn.fujaba.muml.model.pattern.RoleConnector) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.pattern.RoleConnector link = (de.uni_paderborn.fujaba.muml.model.pattern.RoleConnector) setting
					.getEObject();
			if (de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.UmlrtVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.pattern.Role src = link
					.getSource();
			result.add(new de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.UmlrtLinkDescriptor(
					src,
					target,
					link,
					de.uni_paderborn.fujaba.muml.patterneditor.diagram.providers.UmlrtElementTypes.RoleConnector_4001,
					de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.UmlrtLinkDescriptor> getIncomingFeatureModelFacetLinks_ConstrainableElement_Constraint_4002(
			de.uni_paderborn.fujaba.muml.model.constraint.Constraint target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.UmlrtLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.UmlrtLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == de.uni_paderborn.fujaba.muml.model.core.CorePackage.eINSTANCE
					.getConstrainableElement_Constraint()) {
				result.add(new de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.UmlrtLinkDescriptor(
						setting.getEObject(),
						target,
						de.uni_paderborn.fujaba.muml.patterneditor.diagram.providers.UmlrtElementTypes.ConstrainableElementConstraint_4002,
						de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.ConstrainableElementConstraintEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.UmlrtLinkDescriptor> getOutgoingTypeModelFacetLinks_RoleConnector_4001(
			de.uni_paderborn.fujaba.muml.model.pattern.Role source) {
		de.uni_paderborn.fujaba.muml.model.pattern.CoordinationPattern container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof de.uni_paderborn.fujaba.muml.model.pattern.CoordinationPattern) {
				container = (de.uni_paderborn.fujaba.muml.model.pattern.CoordinationPattern) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.UmlrtLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.UmlrtLinkDescriptor>();
		de.uni_paderborn.fujaba.muml.model.pattern.RoleConnector link = container
				.getConnectors();
		if (de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.UmlrtVisualIDRegistry
				.getLinkWithClassVisualID(link)) {
			return result;
		}
		de.uni_paderborn.fujaba.muml.model.pattern.Role dst = link.getTarget();
		de.uni_paderborn.fujaba.muml.model.pattern.Role src = link.getSource();
		if (src != source) {
			return result;
		}
		result.add(new de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.UmlrtLinkDescriptor(
				src,
				dst,
				link,
				de.uni_paderborn.fujaba.muml.patterneditor.diagram.providers.UmlrtElementTypes.RoleConnector_4001,
				de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.UmlrtLinkDescriptor> getOutgoingFeatureModelFacetLinks_ConstrainableElement_Constraint_4002(
			de.uni_paderborn.fujaba.muml.model.core.ConstrainableElement source) {
		LinkedList<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.UmlrtLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.UmlrtLinkDescriptor>();
		for (Iterator<?> destinations = source.getConstraint().iterator(); destinations
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.model.constraint.Constraint destination = (de.uni_paderborn.fujaba.muml.model.constraint.Constraint) destinations
					.next();
			result.add(new de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.UmlrtLinkDescriptor(
					source,
					destination,
					de.uni_paderborn.fujaba.muml.patterneditor.diagram.providers.UmlrtElementTypes.ConstrainableElementConstraint_4002,
					de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.ConstrainableElementConstraintEditPart.VISUAL_ID));
		}
		return result;
	}

}
