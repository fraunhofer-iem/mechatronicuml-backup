package patterneditor.diagram.part;

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

import patterneditor.PatternDiagram;
import patterneditor.diagram.edit.parts.ConstrainableElementConstraint2EditPart;
import patterneditor.diagram.edit.parts.ConstrainableElementConstraintEditPart;
import patterneditor.diagram.edit.parts.CoordinationPatternEditPart;
import patterneditor.diagram.edit.parts.PatternDiagramEditPart;
import patterneditor.diagram.edit.parts.RoleConnectorEditPart;
import patterneditor.diagram.edit.parts.RoleEditPart;
import patterneditor.diagram.edit.parts.RolePatternEditPart;
import patterneditor.diagram.edit.parts.TextualConstraintEditPart;
import patterneditor.diagram.providers.PatternElementTypes;

/**
 * @generated
 */
public class PatternDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<PatternNodeDescriptor> getSemanticChildren(View view) {
		switch (PatternVisualIDRegistry.getVisualID(view)) {
		case PatternDiagramEditPart.VISUAL_ID:
			return getPatternDiagram_1001SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PatternNodeDescriptor> getPatternDiagram_1001SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		PatternDiagram modelElement = (PatternDiagram) view.getElement();
		LinkedList<PatternNodeDescriptor> result = new LinkedList<PatternNodeDescriptor>();
		{
			de.uni_paderborn.fujaba.umlrt.model.pattern.CoordinationPattern childElement = modelElement
					.getCoordinationPattern();
			int visualID = PatternVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CoordinationPatternEditPart.VISUAL_ID) {
				result.add(new PatternNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator<?> it = modelElement.getRoles().iterator(); it.hasNext();) {
			de.uni_paderborn.fujaba.umlrt.model.pattern.Role childElement = (de.uni_paderborn.fujaba.umlrt.model.pattern.Role) it
					.next();
			int visualID = PatternVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == RoleEditPart.VISUAL_ID) {
				result.add(new PatternNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getTextualConstraints().iterator(); it
				.hasNext();) {
			de.uni_paderborn.fujaba.umlrt.model.constraint.TextualConstraint childElement = (de.uni_paderborn.fujaba.umlrt.model.constraint.TextualConstraint) it
					.next();
			int visualID = PatternVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TextualConstraintEditPart.VISUAL_ID) {
				result.add(new PatternNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PatternLinkDescriptor> getContainedLinks(View view) {
		switch (PatternVisualIDRegistry.getVisualID(view)) {
		case PatternDiagramEditPart.VISUAL_ID:
			return getPatternDiagram_1001ContainedLinks(view);
		case CoordinationPatternEditPart.VISUAL_ID:
			return getCoordinationPattern_2101ContainedLinks(view);
		case RoleEditPart.VISUAL_ID:
			return getRole_2102ContainedLinks(view);
		case TextualConstraintEditPart.VISUAL_ID:
			return getTextualConstraint_2103ContainedLinks(view);
		case RoleConnectorEditPart.VISUAL_ID:
			return getRoleConnector_4101ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PatternLinkDescriptor> getIncomingLinks(View view) {
		switch (PatternVisualIDRegistry.getVisualID(view)) {
		case CoordinationPatternEditPart.VISUAL_ID:
			return getCoordinationPattern_2101IncomingLinks(view);
		case RoleEditPart.VISUAL_ID:
			return getRole_2102IncomingLinks(view);
		case TextualConstraintEditPart.VISUAL_ID:
			return getTextualConstraint_2103IncomingLinks(view);
		case RoleConnectorEditPart.VISUAL_ID:
			return getRoleConnector_4101IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PatternLinkDescriptor> getOutgoingLinks(View view) {
		switch (PatternVisualIDRegistry.getVisualID(view)) {
		case CoordinationPatternEditPart.VISUAL_ID:
			return getCoordinationPattern_2101OutgoingLinks(view);
		case RoleEditPart.VISUAL_ID:
			return getRole_2102OutgoingLinks(view);
		case TextualConstraintEditPart.VISUAL_ID:
			return getTextualConstraint_2103OutgoingLinks(view);
		case RoleConnectorEditPart.VISUAL_ID:
			return getRoleConnector_4101OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PatternLinkDescriptor> getPatternDiagram_1001ContainedLinks(
			View view) {
		PatternDiagram modelElement = (PatternDiagram) view.getElement();
		LinkedList<PatternLinkDescriptor> result = new LinkedList<PatternLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_RoleConnector_4101(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PatternLinkDescriptor> getCoordinationPattern_2101ContainedLinks(
			View view) {
		de.uni_paderborn.fujaba.umlrt.model.pattern.CoordinationPattern modelElement = (de.uni_paderborn.fujaba.umlrt.model.pattern.CoordinationPattern) view
				.getElement();
		LinkedList<PatternLinkDescriptor> result = new LinkedList<PatternLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ConstrainableElement_Constraint_4103(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ConstrainableElement_Constraint_4104(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PatternLinkDescriptor> getRole_2102ContainedLinks(
			View view) {
		de.uni_paderborn.fujaba.umlrt.model.pattern.Role modelElement = (de.uni_paderborn.fujaba.umlrt.model.pattern.Role) view
				.getElement();
		LinkedList<PatternLinkDescriptor> result = new LinkedList<PatternLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Role_Pattern_4102(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ConstrainableElement_Constraint_4103(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ConstrainableElement_Constraint_4104(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PatternLinkDescriptor> getTextualConstraint_2103ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PatternLinkDescriptor> getRoleConnector_4101ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PatternLinkDescriptor> getCoordinationPattern_2101IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.umlrt.model.pattern.CoordinationPattern modelElement = (de.uni_paderborn.fujaba.umlrt.model.pattern.CoordinationPattern) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PatternLinkDescriptor> result = new LinkedList<PatternLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Role_Pattern_4102(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PatternLinkDescriptor> getRole_2102IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.umlrt.model.pattern.Role modelElement = (de.uni_paderborn.fujaba.umlrt.model.pattern.Role) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PatternLinkDescriptor> result = new LinkedList<PatternLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_RoleConnector_4101(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PatternLinkDescriptor> getTextualConstraint_2103IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.umlrt.model.constraint.TextualConstraint modelElement = (de.uni_paderborn.fujaba.umlrt.model.constraint.TextualConstraint) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PatternLinkDescriptor> result = new LinkedList<PatternLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_ConstrainableElement_Constraint_4103(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_ConstrainableElement_Constraint_4104(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PatternLinkDescriptor> getRoleConnector_4101IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PatternLinkDescriptor> getCoordinationPattern_2101OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.umlrt.model.pattern.CoordinationPattern modelElement = (de.uni_paderborn.fujaba.umlrt.model.pattern.CoordinationPattern) view
				.getElement();
		LinkedList<PatternLinkDescriptor> result = new LinkedList<PatternLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ConstrainableElement_Constraint_4103(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ConstrainableElement_Constraint_4104(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PatternLinkDescriptor> getRole_2102OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.umlrt.model.pattern.Role modelElement = (de.uni_paderborn.fujaba.umlrt.model.pattern.Role) view
				.getElement();
		LinkedList<PatternLinkDescriptor> result = new LinkedList<PatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_RoleConnector_4101(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Role_Pattern_4102(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ConstrainableElement_Constraint_4103(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ConstrainableElement_Constraint_4104(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PatternLinkDescriptor> getTextualConstraint_2103OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PatternLinkDescriptor> getRoleConnector_4101OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<PatternLinkDescriptor> getContainedTypeModelFacetLinks_RoleConnector_4101(
			PatternDiagram container) {
		LinkedList<PatternLinkDescriptor> result = new LinkedList<PatternLinkDescriptor>();
		for (Iterator<?> links = container.getRoleConnectors().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_paderborn.fujaba.umlrt.model.pattern.RoleConnector) {
				continue;
			}
			de.uni_paderborn.fujaba.umlrt.model.pattern.RoleConnector link = (de.uni_paderborn.fujaba.umlrt.model.pattern.RoleConnector) linkObject;
			if (RoleConnectorEditPart.VISUAL_ID != PatternVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			de.uni_paderborn.fujaba.umlrt.model.pattern.Role dst = link
					.getTarget();
			de.uni_paderborn.fujaba.umlrt.model.pattern.Role src = link
					.getSource();
			result.add(new PatternLinkDescriptor(src, dst, link,
					PatternElementTypes.RoleConnector_4101,
					RoleConnectorEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<PatternLinkDescriptor> getIncomingTypeModelFacetLinks_RoleConnector_4101(
			de.uni_paderborn.fujaba.umlrt.model.pattern.Role target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<PatternLinkDescriptor> result = new LinkedList<PatternLinkDescriptor>();
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
			if (RoleConnectorEditPart.VISUAL_ID != PatternVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			de.uni_paderborn.fujaba.umlrt.model.pattern.Role src = link
					.getSource();
			result.add(new PatternLinkDescriptor(src, target, link,
					PatternElementTypes.RoleConnector_4101,
					RoleConnectorEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<PatternLinkDescriptor> getIncomingFeatureModelFacetLinks_Role_Pattern_4102(
			de.uni_paderborn.fujaba.umlrt.model.pattern.CoordinationPattern target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<PatternLinkDescriptor> result = new LinkedList<PatternLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == de.uni_paderborn.fujaba.umlrt.model.pattern.PatternPackage.eINSTANCE
					.getRole_Pattern()) {
				result.add(new PatternLinkDescriptor(setting.getEObject(),
						target, PatternElementTypes.RolePattern_4102,
						RolePatternEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<PatternLinkDescriptor> getIncomingFeatureModelFacetLinks_ConstrainableElement_Constraint_4103(
			de.uni_paderborn.fujaba.umlrt.model.constraint.Constraint target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<PatternLinkDescriptor> result = new LinkedList<PatternLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == de.uni_paderborn.fujaba.umlrt.model.core.CorePackage.eINSTANCE
					.getConstrainableElement_Constraint()) {
				result.add(new PatternLinkDescriptor(
						setting.getEObject(),
						target,
						PatternElementTypes.ConstrainableElementConstraint_4103,
						ConstrainableElementConstraintEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<PatternLinkDescriptor> getIncomingFeatureModelFacetLinks_ConstrainableElement_Constraint_4104(
			de.uni_paderborn.fujaba.umlrt.model.constraint.Constraint target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<PatternLinkDescriptor> result = new LinkedList<PatternLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == de.uni_paderborn.fujaba.umlrt.model.core.CorePackage.eINSTANCE
					.getConstrainableElement_Constraint()) {
				result.add(new PatternLinkDescriptor(
						setting.getEObject(),
						target,
						PatternElementTypes.ConstrainableElementConstraint_4104,
						ConstrainableElementConstraint2EditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<PatternLinkDescriptor> getOutgoingTypeModelFacetLinks_RoleConnector_4101(
			de.uni_paderborn.fujaba.umlrt.model.pattern.Role source) {
		PatternDiagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof PatternDiagram) {
				container = (PatternDiagram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<PatternLinkDescriptor> result = new LinkedList<PatternLinkDescriptor>();
		for (Iterator<?> links = container.getRoleConnectors().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_paderborn.fujaba.umlrt.model.pattern.RoleConnector) {
				continue;
			}
			de.uni_paderborn.fujaba.umlrt.model.pattern.RoleConnector link = (de.uni_paderborn.fujaba.umlrt.model.pattern.RoleConnector) linkObject;
			if (RoleConnectorEditPart.VISUAL_ID != PatternVisualIDRegistry
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
			result.add(new PatternLinkDescriptor(src, dst, link,
					PatternElementTypes.RoleConnector_4101,
					RoleConnectorEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<PatternLinkDescriptor> getOutgoingFeatureModelFacetLinks_Role_Pattern_4102(
			de.uni_paderborn.fujaba.umlrt.model.pattern.Role source) {
		LinkedList<PatternLinkDescriptor> result = new LinkedList<PatternLinkDescriptor>();
		de.uni_paderborn.fujaba.umlrt.model.pattern.CoordinationPattern destination = source
				.getPattern();
		if (destination == null) {
			return result;
		}
		result.add(new PatternLinkDescriptor(source, destination,
				PatternElementTypes.RolePattern_4102,
				RolePatternEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<PatternLinkDescriptor> getOutgoingFeatureModelFacetLinks_ConstrainableElement_Constraint_4103(
			de.uni_paderborn.fujaba.umlrt.model.core.ConstrainableElement source) {
		LinkedList<PatternLinkDescriptor> result = new LinkedList<PatternLinkDescriptor>();
		for (Iterator<?> destinations = source.getConstraint().iterator(); destinations
				.hasNext();) {
			de.uni_paderborn.fujaba.umlrt.model.constraint.Constraint destination = (de.uni_paderborn.fujaba.umlrt.model.constraint.Constraint) destinations
					.next();
			result.add(new PatternLinkDescriptor(source, destination,
					PatternElementTypes.ConstrainableElementConstraint_4103,
					ConstrainableElementConstraintEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<PatternLinkDescriptor> getOutgoingFeatureModelFacetLinks_ConstrainableElement_Constraint_4104(
			de.uni_paderborn.fujaba.umlrt.model.core.ConstrainableElement source) {
		LinkedList<PatternLinkDescriptor> result = new LinkedList<PatternLinkDescriptor>();
		for (Iterator<?> destinations = source.getConstraint().iterator(); destinations
				.hasNext();) {
			de.uni_paderborn.fujaba.umlrt.model.constraint.Constraint destination = (de.uni_paderborn.fujaba.umlrt.model.constraint.Constraint) destinations
					.next();
			result.add(new PatternLinkDescriptor(source, destination,
					PatternElementTypes.ConstrainableElementConstraint_4104,
					ConstrainableElementConstraint2EditPart.VISUAL_ID));
		}
		return result;
	}

}
