package de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part;

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
public class PatternDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternNodeDescriptor> getSemanticChildren(
			View view) {
		switch (de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.edit.parts.PatternDiagramEditPart.VISUAL_ID:
			return getPatternDiagram_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternNodeDescriptor> getPatternDiagram_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.umlrt.patterneditor.PatternDiagram modelElement = (de.uni_paderborn.fujaba.umlrt.patterneditor.PatternDiagram) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternNodeDescriptor>();
		{
			de.uni_paderborn.fujaba.umlrt.model.pattern.CoordinationPattern childElement = modelElement
					.getCoordinationPattern();
			int visualID = de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.edit.parts.CoordinationPatternEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternNodeDescriptor(
						childElement, visualID));
			}
		}
		for (Iterator<?> it = modelElement.getRoles().iterator(); it.hasNext();) {
			de.uni_paderborn.fujaba.umlrt.model.pattern.Role childElement = (de.uni_paderborn.fujaba.umlrt.model.pattern.Role) it
					.next();
			int visualID = de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.edit.parts.RoleEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getTextualConstraints().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.umlrt.model.constraint.TextualConstraint childElement = (de.uni_paderborn.fujaba.umlrt.model.constraint.TextualConstraint) it
					.next();
			int visualID = de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.edit.parts.TextualConstraintEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternLinkDescriptor> getContainedLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.edit.parts.PatternDiagramEditPart.VISUAL_ID:
			return getPatternDiagram_1000ContainedLinks(view);
		case de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.edit.parts.CoordinationPatternEditPart.VISUAL_ID:
			return getCoordinationPattern_2001ContainedLinks(view);
		case de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.edit.parts.RoleEditPart.VISUAL_ID:
			return getRole_2002ContainedLinks(view);
		case de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.edit.parts.TextualConstraintEditPart.VISUAL_ID:
			return getTextualConstraint_2003ContainedLinks(view);
		case de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID:
			return getRoleConnector_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternLinkDescriptor> getIncomingLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.edit.parts.CoordinationPatternEditPart.VISUAL_ID:
			return getCoordinationPattern_2001IncomingLinks(view);
		case de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.edit.parts.RoleEditPart.VISUAL_ID:
			return getRole_2002IncomingLinks(view);
		case de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.edit.parts.TextualConstraintEditPart.VISUAL_ID:
			return getTextualConstraint_2003IncomingLinks(view);
		case de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID:
			return getRoleConnector_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.edit.parts.CoordinationPatternEditPart.VISUAL_ID:
			return getCoordinationPattern_2001OutgoingLinks(view);
		case de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.edit.parts.RoleEditPart.VISUAL_ID:
			return getRole_2002OutgoingLinks(view);
		case de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.edit.parts.TextualConstraintEditPart.VISUAL_ID:
			return getTextualConstraint_2003OutgoingLinks(view);
		case de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID:
			return getRoleConnector_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternLinkDescriptor> getPatternDiagram_1000ContainedLinks(
			View view) {
		de.uni_paderborn.fujaba.umlrt.patterneditor.PatternDiagram modelElement = (de.uni_paderborn.fujaba.umlrt.patterneditor.PatternDiagram) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_RoleConnector_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternLinkDescriptor> getCoordinationPattern_2001ContainedLinks(
			View view) {
		de.uni_paderborn.fujaba.umlrt.model.pattern.CoordinationPattern modelElement = (de.uni_paderborn.fujaba.umlrt.model.pattern.CoordinationPattern) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ConstrainableElement_Constraint_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ConstrainableElement_Constraint_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternLinkDescriptor> getRole_2002ContainedLinks(
			View view) {
		de.uni_paderborn.fujaba.umlrt.model.pattern.Role modelElement = (de.uni_paderborn.fujaba.umlrt.model.pattern.Role) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Role_Pattern_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ConstrainableElement_Constraint_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ConstrainableElement_Constraint_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternLinkDescriptor> getTextualConstraint_2003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternLinkDescriptor> getRoleConnector_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternLinkDescriptor> getCoordinationPattern_2001IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.umlrt.model.pattern.CoordinationPattern modelElement = (de.uni_paderborn.fujaba.umlrt.model.pattern.CoordinationPattern) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Role_Pattern_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternLinkDescriptor> getRole_2002IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.umlrt.model.pattern.Role modelElement = (de.uni_paderborn.fujaba.umlrt.model.pattern.Role) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_RoleConnector_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternLinkDescriptor> getTextualConstraint_2003IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.umlrt.model.constraint.TextualConstraint modelElement = (de.uni_paderborn.fujaba.umlrt.model.constraint.TextualConstraint) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_ConstrainableElement_Constraint_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_ConstrainableElement_Constraint_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternLinkDescriptor> getRoleConnector_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternLinkDescriptor> getCoordinationPattern_2001OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.umlrt.model.pattern.CoordinationPattern modelElement = (de.uni_paderborn.fujaba.umlrt.model.pattern.CoordinationPattern) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ConstrainableElement_Constraint_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ConstrainableElement_Constraint_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternLinkDescriptor> getRole_2002OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.umlrt.model.pattern.Role modelElement = (de.uni_paderborn.fujaba.umlrt.model.pattern.Role) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_RoleConnector_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Role_Pattern_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ConstrainableElement_Constraint_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ConstrainableElement_Constraint_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternLinkDescriptor> getTextualConstraint_2003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternLinkDescriptor> getRoleConnector_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternLinkDescriptor> getContainedTypeModelFacetLinks_RoleConnector_4001(
			de.uni_paderborn.fujaba.umlrt.patterneditor.PatternDiagram container) {
		LinkedList<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternLinkDescriptor>();
		for (Iterator<?> links = container.getRoleConnectors().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_paderborn.fujaba.umlrt.model.pattern.RoleConnector) {
				continue;
			}
			de.uni_paderborn.fujaba.umlrt.model.pattern.RoleConnector link = (de.uni_paderborn.fujaba.umlrt.model.pattern.RoleConnector) linkObject;
			if (de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID != de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			de.uni_paderborn.fujaba.umlrt.model.pattern.Role dst = link
					.getTarget();
			de.uni_paderborn.fujaba.umlrt.model.pattern.Role src = link
					.getSource();
			result.add(new de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternLinkDescriptor(
					src,
					dst,
					link,
					de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.providers.PatternElementTypes.RoleConnector_4001,
					de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternLinkDescriptor> getIncomingTypeModelFacetLinks_RoleConnector_4001(
			de.uni_paderborn.fujaba.umlrt.model.pattern.Role target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != de.uni_paderborn.fujaba.umlrt.model.pattern.PatternPackage.eINSTANCE
					.getRoleConnector_Target()
					|| false == setting.getEObject() instanceof de.uni_paderborn.fujaba.umlrt.model.pattern.RoleConnector) {
				continue;
			}
			de.uni_paderborn.fujaba.umlrt.model.pattern.RoleConnector link = (de.uni_paderborn.fujaba.umlrt.model.pattern.RoleConnector) setting
					.getEObject();
			if (de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID != de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			de.uni_paderborn.fujaba.umlrt.model.pattern.Role src = link
					.getSource();
			result.add(new de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternLinkDescriptor(
					src,
					target,
					link,
					de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.providers.PatternElementTypes.RoleConnector_4001,
					de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternLinkDescriptor> getIncomingFeatureModelFacetLinks_Role_Pattern_4002(
			de.uni_paderborn.fujaba.umlrt.model.pattern.CoordinationPattern target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == de.uni_paderborn.fujaba.umlrt.model.pattern.PatternPackage.eINSTANCE
					.getRole_Pattern()) {
				result.add(new de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternLinkDescriptor(
						setting.getEObject(),
						target,
						de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.providers.PatternElementTypes.RolePattern_4002,
						de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.edit.parts.RolePatternEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternLinkDescriptor> getIncomingFeatureModelFacetLinks_ConstrainableElement_Constraint_4003(
			de.uni_paderborn.fujaba.umlrt.model.constraint.Constraint target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == de.uni_paderborn.fujaba.umlrt.model.core.CorePackage.eINSTANCE
					.getConstrainableElement_Constraint()) {
				result.add(new de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternLinkDescriptor(
						setting.getEObject(),
						target,
						de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.providers.PatternElementTypes.ConstrainableElementConstraint_4003,
						de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.edit.parts.ConstrainableElementConstraintEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternLinkDescriptor> getIncomingFeatureModelFacetLinks_ConstrainableElement_Constraint_4004(
			de.uni_paderborn.fujaba.umlrt.model.constraint.Constraint target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == de.uni_paderborn.fujaba.umlrt.model.core.CorePackage.eINSTANCE
					.getConstrainableElement_Constraint()) {
				result.add(new de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternLinkDescriptor(
						setting.getEObject(),
						target,
						de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.providers.PatternElementTypes.ConstrainableElementConstraint_4004,
						de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.edit.parts.ConstrainableElementConstraint2EditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternLinkDescriptor> getOutgoingTypeModelFacetLinks_RoleConnector_4001(
			de.uni_paderborn.fujaba.umlrt.model.pattern.Role source) {
		de.uni_paderborn.fujaba.umlrt.patterneditor.PatternDiagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof de.uni_paderborn.fujaba.umlrt.patterneditor.PatternDiagram) {
				container = (de.uni_paderborn.fujaba.umlrt.patterneditor.PatternDiagram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternLinkDescriptor>();
		for (Iterator<?> links = container.getRoleConnectors().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_paderborn.fujaba.umlrt.model.pattern.RoleConnector) {
				continue;
			}
			de.uni_paderborn.fujaba.umlrt.model.pattern.RoleConnector link = (de.uni_paderborn.fujaba.umlrt.model.pattern.RoleConnector) linkObject;
			if (de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID != de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			de.uni_paderborn.fujaba.umlrt.model.pattern.Role dst = link
					.getTarget();
			de.uni_paderborn.fujaba.umlrt.model.pattern.Role src = link
					.getSource();
			if (src != source) {
				continue;
			}
			result.add(new de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternLinkDescriptor(
					src,
					dst,
					link,
					de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.providers.PatternElementTypes.RoleConnector_4001,
					de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternLinkDescriptor> getOutgoingFeatureModelFacetLinks_Role_Pattern_4002(
			de.uni_paderborn.fujaba.umlrt.model.pattern.Role source) {
		LinkedList<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternLinkDescriptor>();
		de.uni_paderborn.fujaba.umlrt.model.pattern.CoordinationPattern destination = source
				.getPattern();
		if (destination == null) {
			return result;
		}
		result.add(new de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternLinkDescriptor(
				source,
				destination,
				de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.providers.PatternElementTypes.RolePattern_4002,
				de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.edit.parts.RolePatternEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternLinkDescriptor> getOutgoingFeatureModelFacetLinks_ConstrainableElement_Constraint_4003(
			de.uni_paderborn.fujaba.umlrt.model.core.ConstrainableElement source) {
		LinkedList<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternLinkDescriptor>();
		for (Iterator<?> destinations = source.getConstraint().iterator(); destinations
				.hasNext();) {
			de.uni_paderborn.fujaba.umlrt.model.constraint.Constraint destination = (de.uni_paderborn.fujaba.umlrt.model.constraint.Constraint) destinations
					.next();
			result.add(new de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternLinkDescriptor(
					source,
					destination,
					de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.providers.PatternElementTypes.ConstrainableElementConstraint_4003,
					de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.edit.parts.ConstrainableElementConstraintEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternLinkDescriptor> getOutgoingFeatureModelFacetLinks_ConstrainableElement_Constraint_4004(
			de.uni_paderborn.fujaba.umlrt.model.core.ConstrainableElement source) {
		LinkedList<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternLinkDescriptor>();
		for (Iterator<?> destinations = source.getConstraint().iterator(); destinations
				.hasNext();) {
			de.uni_paderborn.fujaba.umlrt.model.constraint.Constraint destination = (de.uni_paderborn.fujaba.umlrt.model.constraint.Constraint) destinations
					.next();
			result.add(new de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternLinkDescriptor(
					source,
					destination,
					de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.providers.PatternElementTypes.ConstrainableElementConstraint_4004,
					de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.edit.parts.ConstrainableElementConstraint2EditPart.VISUAL_ID));
		}
		return result;
	}

}
