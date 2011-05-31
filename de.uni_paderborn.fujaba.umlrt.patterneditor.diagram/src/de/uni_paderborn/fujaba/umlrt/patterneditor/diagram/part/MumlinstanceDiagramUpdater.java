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
import org.storydriven.modeling.ExtendableElement;

/**
 * @generated
 */
public class MumlinstanceDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.MumlinstanceNodeDescriptor> getSemanticChildren(
			View view) {
		switch (de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.MumlinstanceVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.edit.parts.PatternDiagramEditPart.VISUAL_ID:
			return getModelElementCategory_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.MumlinstanceNodeDescriptor> getModelElementCategory_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.modelinstance.ModelElementCategory modelElement = (de.uni_paderborn.fujaba.modelinstance.ModelElementCategory) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.MumlinstanceNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.MumlinstanceNodeDescriptor>();
		for (Iterator<?> it = modelElement.getModelElements().iterator(); it
				.hasNext();) {
			ExtendableElement childElement = (ExtendableElement) it.next();
			int visualID = de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.MumlinstanceVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.edit.parts.CoordinationPatternEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.MumlinstanceNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.edit.parts.RoleEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.MumlinstanceNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.edit.parts.TextualConstraintEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.MumlinstanceNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.MumlinstanceLinkDescriptor> getContainedLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.MumlinstanceVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.edit.parts.PatternDiagramEditPart.VISUAL_ID:
			return getModelElementCategory_1000ContainedLinks(view);
		case de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.edit.parts.CoordinationPatternEditPart.VISUAL_ID:
			return getCoordinationPattern_2004ContainedLinks(view);
		case de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.edit.parts.RoleEditPart.VISUAL_ID:
			return getRole_2005ContainedLinks(view);
		case de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.edit.parts.TextualConstraintEditPart.VISUAL_ID:
			return getTextualConstraint_2006ContainedLinks(view);
		case de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID:
			return getRoleConnector_4004ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.MumlinstanceLinkDescriptor> getIncomingLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.MumlinstanceVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.edit.parts.CoordinationPatternEditPart.VISUAL_ID:
			return getCoordinationPattern_2004IncomingLinks(view);
		case de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.edit.parts.RoleEditPart.VISUAL_ID:
			return getRole_2005IncomingLinks(view);
		case de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.edit.parts.TextualConstraintEditPart.VISUAL_ID:
			return getTextualConstraint_2006IncomingLinks(view);
		case de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID:
			return getRoleConnector_4004IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.MumlinstanceLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.MumlinstanceVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.edit.parts.CoordinationPatternEditPart.VISUAL_ID:
			return getCoordinationPattern_2004OutgoingLinks(view);
		case de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.edit.parts.RoleEditPart.VISUAL_ID:
			return getRole_2005OutgoingLinks(view);
		case de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.edit.parts.TextualConstraintEditPart.VISUAL_ID:
			return getTextualConstraint_2006OutgoingLinks(view);
		case de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID:
			return getRoleConnector_4004OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.MumlinstanceLinkDescriptor> getModelElementCategory_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.MumlinstanceLinkDescriptor> getCoordinationPattern_2004ContainedLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.pattern.CoordinationPattern modelElement = (de.uni_paderborn.fujaba.muml.model.pattern.CoordinationPattern) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.MumlinstanceLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.MumlinstanceLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_RoleConnector_4004(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ConstrainableElement_Constraint_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.MumlinstanceLinkDescriptor> getRole_2005ContainedLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.pattern.Role modelElement = (de.uni_paderborn.fujaba.muml.model.pattern.Role) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.MumlinstanceLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.MumlinstanceLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Role_Pattern_4005(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ConstrainableElement_Constraint_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.MumlinstanceLinkDescriptor> getTextualConstraint_2006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.MumlinstanceLinkDescriptor> getRoleConnector_4004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.MumlinstanceLinkDescriptor> getCoordinationPattern_2004IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.pattern.CoordinationPattern modelElement = (de.uni_paderborn.fujaba.muml.model.pattern.CoordinationPattern) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.MumlinstanceLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.MumlinstanceLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Role_Pattern_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.MumlinstanceLinkDescriptor> getRole_2005IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.pattern.Role modelElement = (de.uni_paderborn.fujaba.muml.model.pattern.Role) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.MumlinstanceLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.MumlinstanceLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_RoleConnector_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.MumlinstanceLinkDescriptor> getTextualConstraint_2006IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.constraint.TextualConstraint modelElement = (de.uni_paderborn.fujaba.muml.model.constraint.TextualConstraint) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.MumlinstanceLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.MumlinstanceLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_ConstrainableElement_Constraint_4006(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.MumlinstanceLinkDescriptor> getRoleConnector_4004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.MumlinstanceLinkDescriptor> getCoordinationPattern_2004OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.pattern.CoordinationPattern modelElement = (de.uni_paderborn.fujaba.muml.model.pattern.CoordinationPattern) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.MumlinstanceLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.MumlinstanceLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ConstrainableElement_Constraint_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.MumlinstanceLinkDescriptor> getRole_2005OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.pattern.Role modelElement = (de.uni_paderborn.fujaba.muml.model.pattern.Role) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.MumlinstanceLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.MumlinstanceLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_RoleConnector_4004(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Role_Pattern_4005(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ConstrainableElement_Constraint_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.MumlinstanceLinkDescriptor> getTextualConstraint_2006OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.MumlinstanceLinkDescriptor> getRoleConnector_4004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.MumlinstanceLinkDescriptor> getContainedTypeModelFacetLinks_RoleConnector_4004(
			de.uni_paderborn.fujaba.muml.model.pattern.CoordinationPattern container) {
		LinkedList<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.MumlinstanceLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.MumlinstanceLinkDescriptor>();
		de.uni_paderborn.fujaba.muml.model.pattern.RoleConnector link = container
				.getConnectors();
		if (de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID != de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.MumlinstanceVisualIDRegistry
				.getLinkWithClassVisualID(link)) {
			return result;
		}
		de.uni_paderborn.fujaba.muml.model.pattern.Role dst = link.getTarget();
		de.uni_paderborn.fujaba.muml.model.pattern.Role src = link.getSource();
		result.add(new de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.MumlinstanceLinkDescriptor(
				src,
				dst,
				link,
				de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.providers.MumlinstanceElementTypes.RoleConnector_4004,
				de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.MumlinstanceLinkDescriptor> getIncomingTypeModelFacetLinks_RoleConnector_4004(
			de.uni_paderborn.fujaba.muml.model.pattern.Role target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.MumlinstanceLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.MumlinstanceLinkDescriptor>();
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
			if (de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID != de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.MumlinstanceVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.pattern.Role src = link
					.getSource();
			result.add(new de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.MumlinstanceLinkDescriptor(
					src,
					target,
					link,
					de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.providers.MumlinstanceElementTypes.RoleConnector_4004,
					de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.MumlinstanceLinkDescriptor> getIncomingFeatureModelFacetLinks_Role_Pattern_4005(
			de.uni_paderborn.fujaba.muml.model.pattern.CoordinationPattern target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.MumlinstanceLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.MumlinstanceLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == de.uni_paderborn.fujaba.muml.model.pattern.PatternPackage.eINSTANCE
					.getRole_Pattern()) {
				result.add(new de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.MumlinstanceLinkDescriptor(
						setting.getEObject(),
						target,
						de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.providers.MumlinstanceElementTypes.RolePattern_4005,
						de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.edit.parts.RolePatternEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.MumlinstanceLinkDescriptor> getIncomingFeatureModelFacetLinks_ConstrainableElement_Constraint_4006(
			de.uni_paderborn.fujaba.muml.model.constraint.Constraint target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.MumlinstanceLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.MumlinstanceLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == de.uni_paderborn.fujaba.muml.model.core.CorePackage.eINSTANCE
					.getConstrainableElement_Constraint()) {
				result.add(new de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.MumlinstanceLinkDescriptor(
						setting.getEObject(),
						target,
						de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.providers.MumlinstanceElementTypes.ConstrainableElementConstraint_4006,
						de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.edit.parts.ConstrainableElementConstraintEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.MumlinstanceLinkDescriptor> getOutgoingTypeModelFacetLinks_RoleConnector_4004(
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
		LinkedList<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.MumlinstanceLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.MumlinstanceLinkDescriptor>();
		de.uni_paderborn.fujaba.muml.model.pattern.RoleConnector link = container
				.getConnectors();
		if (de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID != de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.MumlinstanceVisualIDRegistry
				.getLinkWithClassVisualID(link)) {
			return result;
		}
		de.uni_paderborn.fujaba.muml.model.pattern.Role dst = link.getTarget();
		de.uni_paderborn.fujaba.muml.model.pattern.Role src = link.getSource();
		if (src != source) {
			return result;
		}
		result.add(new de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.MumlinstanceLinkDescriptor(
				src,
				dst,
				link,
				de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.providers.MumlinstanceElementTypes.RoleConnector_4004,
				de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.MumlinstanceLinkDescriptor> getOutgoingFeatureModelFacetLinks_Role_Pattern_4005(
			de.uni_paderborn.fujaba.muml.model.pattern.Role source) {
		LinkedList<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.MumlinstanceLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.MumlinstanceLinkDescriptor>();
		de.uni_paderborn.fujaba.muml.model.pattern.CoordinationPattern destination = source
				.getPattern();
		if (destination == null) {
			return result;
		}
		result.add(new de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.MumlinstanceLinkDescriptor(
				source,
				destination,
				de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.providers.MumlinstanceElementTypes.RolePattern_4005,
				de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.edit.parts.RolePatternEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.MumlinstanceLinkDescriptor> getOutgoingFeatureModelFacetLinks_ConstrainableElement_Constraint_4006(
			de.uni_paderborn.fujaba.muml.model.core.ConstrainableElement source) {
		LinkedList<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.MumlinstanceLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.MumlinstanceLinkDescriptor>();
		for (Iterator<?> destinations = source.getConstraint().iterator(); destinations
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.model.constraint.Constraint destination = (de.uni_paderborn.fujaba.muml.model.constraint.Constraint) destinations
					.next();
			result.add(new de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.MumlinstanceLinkDescriptor(
					source,
					destination,
					de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.providers.MumlinstanceElementTypes.ConstrainableElementConstraint_4006,
					de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.edit.parts.ConstrainableElementConstraintEditPart.VISUAL_ID));
		}
		return result;
	}

}
