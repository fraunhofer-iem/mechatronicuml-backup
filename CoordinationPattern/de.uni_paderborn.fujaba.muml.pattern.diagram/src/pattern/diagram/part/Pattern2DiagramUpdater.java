package pattern.diagram.part;

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
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;
import org.storydriven.core.ExtendableElement;

import pattern.CoordinationPattern;
import pattern.diagram.edit.parts.AbstractCoordinationSpecificationRolesEditPart;
import pattern.diagram.edit.parts.CoordinationPattern2EditPart;
import pattern.diagram.edit.parts.CoordinationPatternEditPart;
import pattern.diagram.edit.parts.CoordinationPatternPatternCompartmentEditPart;
import pattern.diagram.edit.parts.ModelElementCategoryEditPart;
import pattern.diagram.edit.parts.RoleConnectorEditPart;
import pattern.diagram.edit.parts.RoleEditPart;
import pattern.diagram.providers.Pattern2ElementTypes;

/**
 * @generated
 */
public class Pattern2DiagramUpdater {

	/**
	 * @generated
	 */
	public static List<Pattern2NodeDescriptor> getSemanticChildren(View view) {
		switch (Pattern2VisualIDRegistry.getVisualID(view)) {
		case ModelElementCategoryEditPart.VISUAL_ID:
			return getModelElementCategory_1000SemanticChildren(view);
		case CoordinationPatternPatternCompartmentEditPart.VISUAL_ID:
			return getCoordinationPatternPatternCompartment_7001SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Pattern2NodeDescriptor> getModelElementCategory_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_paderborn.fujaba.modelinstance.ModelElementCategory modelElement = (de.uni_paderborn.fujaba.modelinstance.ModelElementCategory) view
				.getElement();
		LinkedList<Pattern2NodeDescriptor> result = new LinkedList<Pattern2NodeDescriptor>();
		for (Iterator<?> it = modelElement.getModelElements().iterator(); it
				.hasNext();) {
			ExtendableElement childElement = (ExtendableElement) it.next();
			int visualID = Pattern2VisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CoordinationPatternEditPart.VISUAL_ID) {
				result.add(new Pattern2NodeDescriptor(childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<Pattern2NodeDescriptor> getCoordinationPatternPatternCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		CoordinationPattern modelElement = (CoordinationPattern) containerView
				.getElement();
		LinkedList<Pattern2NodeDescriptor> result = new LinkedList<Pattern2NodeDescriptor>();
		{
			CoordinationPattern childElement = modelElement
					.getGmfCoordinationPattern();
			int visualID = Pattern2VisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CoordinationPattern2EditPart.VISUAL_ID) {
				result.add(new Pattern2NodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator<?> it = modelElement.getRoles().iterator(); it.hasNext();) {
			de.uni_paderborn.fujaba.muml.protocol.Role childElement = (de.uni_paderborn.fujaba.muml.protocol.Role) it
					.next();
			int visualID = Pattern2VisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == RoleEditPart.VISUAL_ID) {
				result.add(new Pattern2NodeDescriptor(childElement, visualID));
				continue;
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public static List<Pattern2LinkDescriptor> getContainedLinks(View view) {
		switch (Pattern2VisualIDRegistry.getVisualID(view)) {
		case ModelElementCategoryEditPart.VISUAL_ID:
			return getModelElementCategory_1000ContainedLinks(view);
		case CoordinationPatternEditPart.VISUAL_ID:
			return getCoordinationPattern_2001ContainedLinks(view);
		case CoordinationPattern2EditPart.VISUAL_ID:
			return getCoordinationPattern_3001ContainedLinks(view);
		case RoleEditPart.VISUAL_ID:
			return getRole_3002ContainedLinks(view);
		case RoleConnectorEditPart.VISUAL_ID:
			return getRoleConnector_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Pattern2LinkDescriptor> getIncomingLinks(View view) {
		switch (Pattern2VisualIDRegistry.getVisualID(view)) {
		case CoordinationPatternEditPart.VISUAL_ID:
			return getCoordinationPattern_2001IncomingLinks(view);
		case CoordinationPattern2EditPart.VISUAL_ID:
			return getCoordinationPattern_3001IncomingLinks(view);
		case RoleEditPart.VISUAL_ID:
			return getRole_3002IncomingLinks(view);
		case RoleConnectorEditPart.VISUAL_ID:
			return getRoleConnector_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Pattern2LinkDescriptor> getOutgoingLinks(View view) {
		switch (Pattern2VisualIDRegistry.getVisualID(view)) {
		case CoordinationPatternEditPart.VISUAL_ID:
			return getCoordinationPattern_2001OutgoingLinks(view);
		case CoordinationPattern2EditPart.VISUAL_ID:
			return getCoordinationPattern_3001OutgoingLinks(view);
		case RoleEditPart.VISUAL_ID:
			return getRole_3002OutgoingLinks(view);
		case RoleConnectorEditPart.VISUAL_ID:
			return getRoleConnector_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Pattern2LinkDescriptor> getModelElementCategory_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Pattern2LinkDescriptor> getCoordinationPattern_2001ContainedLinks(
			View view) {
		CoordinationPattern modelElement = (CoordinationPattern) view
				.getElement();
		LinkedList<Pattern2LinkDescriptor> result = new LinkedList<Pattern2LinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_RoleConnector_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_AbstractCoordinationSpecification_Roles_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Pattern2LinkDescriptor> getCoordinationPattern_3001ContainedLinks(
			View view) {
		CoordinationPattern modelElement = (CoordinationPattern) view
				.getElement();
		LinkedList<Pattern2LinkDescriptor> result = new LinkedList<Pattern2LinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_RoleConnector_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_AbstractCoordinationSpecification_Roles_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Pattern2LinkDescriptor> getRole_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Pattern2LinkDescriptor> getRoleConnector_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Pattern2LinkDescriptor> getCoordinationPattern_2001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Pattern2LinkDescriptor> getCoordinationPattern_3001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Pattern2LinkDescriptor> getRole_3002IncomingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.protocol.Role modelElement = (de.uni_paderborn.fujaba.muml.protocol.Role) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<Pattern2LinkDescriptor> result = new LinkedList<Pattern2LinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_RoleConnector_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_AbstractCoordinationSpecification_Roles_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Pattern2LinkDescriptor> getRoleConnector_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Pattern2LinkDescriptor> getCoordinationPattern_2001OutgoingLinks(
			View view) {
		CoordinationPattern modelElement = (CoordinationPattern) view
				.getElement();
		LinkedList<Pattern2LinkDescriptor> result = new LinkedList<Pattern2LinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_AbstractCoordinationSpecification_Roles_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Pattern2LinkDescriptor> getCoordinationPattern_3001OutgoingLinks(
			View view) {
		CoordinationPattern modelElement = (CoordinationPattern) view
				.getElement();
		LinkedList<Pattern2LinkDescriptor> result = new LinkedList<Pattern2LinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_AbstractCoordinationSpecification_Roles_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Pattern2LinkDescriptor> getRole_3002OutgoingLinks(
			View view) {
		de.uni_paderborn.fujaba.muml.protocol.Role modelElement = (de.uni_paderborn.fujaba.muml.protocol.Role) view
				.getElement();
		LinkedList<Pattern2LinkDescriptor> result = new LinkedList<Pattern2LinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_RoleConnector_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Pattern2LinkDescriptor> getRoleConnector_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<Pattern2LinkDescriptor> getContainedTypeModelFacetLinks_RoleConnector_4001(
			de.uni_paderborn.fujaba.muml.protocol.AbstractCoordinationSpecification container) {
		LinkedList<Pattern2LinkDescriptor> result = new LinkedList<Pattern2LinkDescriptor>();
		de.uni_paderborn.fujaba.muml.protocol.RoleConnector link = container
				.getRoleConnector();
		if (RoleConnectorEditPart.VISUAL_ID != Pattern2VisualIDRegistry
				.getLinkWithClassVisualID(link)) {
			return result;
		}
		List targets = link.getConnectorEndpoints();
		Object theTarget = !targets.isEmpty() ? targets.get(targets.size() - 1)
				: null; // Adapted for MUML-BUG #446
		if (false == theTarget instanceof de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) {
			return result;
		}
		de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint dst = (de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) theTarget;
		List sources = link.getConnectorEndpoints();
		Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
		if (false == theSource instanceof de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) {
			return result;
		}
		de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint src = (de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) theSource;
		result.add(new Pattern2LinkDescriptor(src, dst, link,
				Pattern2ElementTypes.RoleConnector_4001,
				RoleConnectorEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<Pattern2LinkDescriptor> getIncomingTypeModelFacetLinks_RoleConnector_4001(
			de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<Pattern2LinkDescriptor> result = new LinkedList<Pattern2LinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
					.getConnector_ConnectorEndpoints()
					|| false == setting.getEObject() instanceof de.uni_paderborn.fujaba.muml.protocol.RoleConnector) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.protocol.RoleConnector link = (de.uni_paderborn.fujaba.muml.protocol.RoleConnector) setting
					.getEObject();
			if (RoleConnectorEditPart.VISUAL_ID != Pattern2VisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List sources = link.getConnectorEndpoints();
			Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
			if (false == theSource instanceof de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) {
				continue;
			}
			de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint src = (de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) theSource;
			result.add(new Pattern2LinkDescriptor(src, target, link,
					Pattern2ElementTypes.RoleConnector_4001,
					RoleConnectorEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<Pattern2LinkDescriptor> getIncomingFeatureModelFacetLinks_AbstractCoordinationSpecification_Roles_4002(
			de.uni_paderborn.fujaba.muml.protocol.Role target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<Pattern2LinkDescriptor> result = new LinkedList<Pattern2LinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage.eINSTANCE
					.getAbstractCoordinationSpecification_Roles()) {
				result.add(new Pattern2LinkDescriptor(
						setting.getEObject(),
						target,
						Pattern2ElementTypes.AbstractCoordinationSpecificationRoles_4002,
						AbstractCoordinationSpecificationRolesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<Pattern2LinkDescriptor> getOutgoingTypeModelFacetLinks_RoleConnector_4001(
			de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint source) {
		de.uni_paderborn.fujaba.muml.protocol.AbstractCoordinationSpecification container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof de.uni_paderborn.fujaba.muml.protocol.AbstractCoordinationSpecification) {
				container = (de.uni_paderborn.fujaba.muml.protocol.AbstractCoordinationSpecification) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<Pattern2LinkDescriptor> result = new LinkedList<Pattern2LinkDescriptor>();
		de.uni_paderborn.fujaba.muml.protocol.RoleConnector link = container
				.getRoleConnector();
		if (RoleConnectorEditPart.VISUAL_ID != Pattern2VisualIDRegistry
				.getLinkWithClassVisualID(link)) {
			return result;
		}
		List targets = link.getConnectorEndpoints();
		Object theTarget = !targets.isEmpty() ? targets.get(targets.size() - 1)
				: null; // Adapted for MUML-BUG #446
		if (false == theTarget instanceof de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) {
			return result;
		}
		de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint dst = (de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) theTarget;
		List sources = link.getConnectorEndpoints();
		Object theSource = !sources.isEmpty() ? sources.get(0) : null; // Adapted for MUML-BUG #446
		if (false == theSource instanceof de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) {
			return result;
		}
		de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint src = (de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) theSource;
		if (src != source) {
			return result;
		}
		result.add(new Pattern2LinkDescriptor(src, dst, link,
				Pattern2ElementTypes.RoleConnector_4001,
				RoleConnectorEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<Pattern2LinkDescriptor> getOutgoingFeatureModelFacetLinks_AbstractCoordinationSpecification_Roles_4002(
			de.uni_paderborn.fujaba.muml.protocol.AbstractCoordinationSpecification source) {
		LinkedList<Pattern2LinkDescriptor> result = new LinkedList<Pattern2LinkDescriptor>();
		for (Iterator<?> destinations = source.getRoles().iterator(); destinations
				.hasNext();) {
			de.uni_paderborn.fujaba.muml.protocol.Role destination = (de.uni_paderborn.fujaba.muml.protocol.Role) destinations
					.next();
			result.add(new Pattern2LinkDescriptor(
					source,
					destination,
					Pattern2ElementTypes.AbstractCoordinationSpecificationRoles_4002,
					AbstractCoordinationSpecificationRolesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<Pattern2NodeDescriptor> getSemanticChildren(View view) {
			return Pattern2DiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<Pattern2LinkDescriptor> getContainedLinks(View view) {
			return Pattern2DiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<Pattern2LinkDescriptor> getIncomingLinks(View view) {
			return Pattern2DiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<Pattern2LinkDescriptor> getOutgoingLinks(View view) {
			return Pattern2DiagramUpdater.getOutgoingLinks(view);
		}
	};

}
