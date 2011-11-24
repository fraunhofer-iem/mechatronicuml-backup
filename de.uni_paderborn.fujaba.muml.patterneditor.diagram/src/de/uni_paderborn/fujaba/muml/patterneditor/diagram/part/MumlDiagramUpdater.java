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
import org.storydriven.modeling.ExtendableElement;

import de.fujaba.modelinstance.ModelElementCategory;

/**
 * @generated
 */
public class MumlDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlNodeDescriptor> getSemanticChildren(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.ModelElementCategoryEditPart.VISUAL_ID:
			return getModelElementCategory_1000SemanticChildren(view);
		case de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.CoordinationPatternCoordinationPatternContainerCompartmentEditPart.VISUAL_ID:
			return getCoordinationPatternCoordinationPatternContainerCompartment_7001SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlNodeDescriptor> getModelElementCategory_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ModelElementCategory modelElement = (ModelElementCategory) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getModelElements().iterator(); it
				.hasNext();) {
			ExtendableElement childElement = (ExtendableElement) it.next();
			int visualID = de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.CoordinationPatternEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlNodeDescriptor> getCoordinationPatternCoordinationPatternContainerCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.muml.model.pattern.CoordinationPattern modelElement = (de.uni_paderborn.fujaba.muml.model.pattern.CoordinationPattern) containerView
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlNodeDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlNodeDescriptor>();
		{
			de.uni_paderborn.fujaba.muml.model.pattern.CoordinationPattern childElement = modelElement
					.getPattern();
			int visualID = de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.CoordinationPattern2EditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
			}
		}
		for (Iterator<?> it = modelElement.getRoles().iterator(); it.hasNext();) {
			de.uni_paderborn.fujaba.muml.model.pattern.Role childElement = (de.uni_paderborn.fujaba.muml.model.pattern.Role) it
					.next();
			int visualID = de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.RoleEditPart.VISUAL_ID) {
				result.add(new de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor> getContainedLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.ModelElementCategoryEditPart.VISUAL_ID:
			return getModelElementCategory_1000ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.CoordinationPatternEditPart.VISUAL_ID:
			return getCoordinationPattern_2001ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.CoordinationPattern2EditPart.VISUAL_ID:
			return getCoordinationPattern_3001ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.RoleEditPart.VISUAL_ID:
			return getRole_3002ContainedLinks(view);
		case de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID:
			return getRoleConnector_4002ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor> getIncomingLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.CoordinationPatternEditPart.VISUAL_ID:
			return getCoordinationPattern_2001IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.CoordinationPattern2EditPart.VISUAL_ID:
			return getCoordinationPattern_3001IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.RoleEditPart.VISUAL_ID:
			return getRole_3002IncomingLinks(view);
		case de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID:
			return getRoleConnector_4002IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.CoordinationPatternEditPart.VISUAL_ID:
			return getCoordinationPattern_2001OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.CoordinationPattern2EditPart.VISUAL_ID:
			return getCoordinationPattern_3001OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.RoleEditPart.VISUAL_ID:
			return getRole_3002OutgoingLinks(view);
		case de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID:
			return getRoleConnector_4002OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor> getModelElementCategory_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor> getCoordinationPattern_2001ContainedLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.pattern.CoordinationPattern modelElement = (de.uni_paderborn.fujaba.muml.model.pattern.CoordinationPattern) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_CoordinationPattern_Roles_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_RoleConnector_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor> getCoordinationPattern_3001ContainedLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.pattern.CoordinationPattern modelElement = (de.uni_paderborn.fujaba.muml.model.pattern.CoordinationPattern) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_CoordinationPattern_Roles_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_RoleConnector_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor> getRole_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor> getRoleConnector_4002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor> getCoordinationPattern_2001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor> getCoordinationPattern_3001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor> getRole_3002IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.pattern.Role modelElement = (de.uni_paderborn.fujaba.muml.model.pattern.Role) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_CoordinationPattern_Roles_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_RoleConnector_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor> getRoleConnector_4002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor> getCoordinationPattern_2001OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.pattern.CoordinationPattern modelElement = (de.uni_paderborn.fujaba.muml.model.pattern.CoordinationPattern) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_CoordinationPattern_Roles_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor> getCoordinationPattern_3001OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.pattern.CoordinationPattern modelElement = (de.uni_paderborn.fujaba.muml.model.pattern.CoordinationPattern) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_CoordinationPattern_Roles_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor> getRole_3002OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.model.pattern.Role modelElement = (de.uni_paderborn.fujaba.muml.model.pattern.Role) view
				.getElement();
		LinkedList<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_RoleConnector_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor> getRoleConnector_4002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor> getContainedTypeModelFacetLinks_RoleConnector_4002(
			de.uni_paderborn.fujaba.muml.model.pattern.CoordinationPattern container) {
		LinkedList<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor>();
		de.uni_paderborn.fujaba.muml.model.pattern.RoleConnector link = container
				.getConnector();
		if (de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlVisualIDRegistry
				.getLinkWithClassVisualID(link)) {
			return result;
		}
		de.uni_paderborn.fujaba.muml.model.pattern.Role dst = link.getTarget();
		de.uni_paderborn.fujaba.muml.model.pattern.Role src = link.getSource();
		result.add(new de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor(
				src,
				dst,
				link,
				de.uni_paderborn.fujaba.muml.patterneditor.diagram.providers.MumlElementTypes.RoleConnector_4002,
				de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor> getIncomingFeatureModelFacetLinks_CoordinationPattern_Roles_4001(
			de.uni_paderborn.fujaba.muml.model.pattern.Role target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == de.uni_paderborn.fujaba.muml.model.pattern.PatternPackage.eINSTANCE
					.getCoordinationPattern_Roles()) {
				result.add(new de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor(
						setting.getEObject(),
						target,
						de.uni_paderborn.fujaba.muml.patterneditor.diagram.providers.MumlElementTypes.CoordinationPatternRoles_4001,
						de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.CoordinationPatternRolesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor> getIncomingTypeModelFacetLinks_RoleConnector_4002(
			de.uni_paderborn.fujaba.muml.model.pattern.Role target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor>();
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
			if (de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.model.pattern.Role src = link
					.getSource();
			result.add(new de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor(
					src,
					target,
					link,
					de.uni_paderborn.fujaba.muml.patterneditor.diagram.providers.MumlElementTypes.RoleConnector_4002,
					de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor> getOutgoingFeatureModelFacetLinks_CoordinationPattern_Roles_4001(
			de.uni_paderborn.fujaba.muml.model.pattern.CoordinationPattern source) {
		LinkedList<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor>();
		for (Iterator<?> destinations = source.getRoles().iterator(); destinations
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.model.pattern.Role destination = (de.uni_paderborn.fujaba.muml.model.pattern.Role) destinations
					.next();
			result.add(new de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor(
					source,
					destination,
					de.uni_paderborn.fujaba.muml.patterneditor.diagram.providers.MumlElementTypes.CoordinationPatternRoles_4001,
					de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.CoordinationPatternRolesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor> getOutgoingTypeModelFacetLinks_RoleConnector_4002(
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
		LinkedList<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor> result = new LinkedList<de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor>();
		de.uni_paderborn.fujaba.muml.model.pattern.RoleConnector link = container
				.getConnector();
		if (de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID != de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlVisualIDRegistry
				.getLinkWithClassVisualID(link)) {
			return result;
		}
		de.uni_paderborn.fujaba.muml.model.pattern.Role dst = link.getTarget();
		de.uni_paderborn.fujaba.muml.model.pattern.Role src = link.getSource();
		if (src != source) {
			return result;
		}
		result.add(new de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlLinkDescriptor(
				src,
				dst,
				link,
				de.uni_paderborn.fujaba.muml.patterneditor.diagram.providers.MumlElementTypes.RoleConnector_4002,
				de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID));
		return result;
	}

}
