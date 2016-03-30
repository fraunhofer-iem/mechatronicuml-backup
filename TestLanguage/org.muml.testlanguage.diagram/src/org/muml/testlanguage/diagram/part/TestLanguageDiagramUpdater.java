package org.muml.testlanguage.diagram.part;

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

/**
 * @generated
 */
public class TestLanguageDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<org.muml.testlanguage.diagram.part.TestLanguageNodeDescriptor> getSemanticChildren(
			View view) {
		switch (org.muml.testlanguage.diagram.part.TestLanguageVisualIDRegistry
				.getVisualID(view)) {
		case org.muml.testlanguage.diagram.edit.parts.TestCaseEditPart.VISUAL_ID:
			return getTestCase_1000SemanticChildren(view);
		case org.muml.testlanguage.diagram.edit.parts.NodeNodeFigureCompartmentEditPart.VISUAL_ID:
			return getNodeNodeFigureCompartment_7001SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.testlanguage.diagram.part.TestLanguageNodeDescriptor> getTestCase_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		org.muml.testlanguage.TestCase modelElement = (org.muml.testlanguage.TestCase) view
				.getElement();
		LinkedList<org.muml.testlanguage.diagram.part.TestLanguageNodeDescriptor> result = new LinkedList<org.muml.testlanguage.diagram.part.TestLanguageNodeDescriptor>();
		for (Iterator<?> it = modelElement.getNodes().iterator(); it.hasNext();) {
			org.muml.testlanguage.Node childElement = (org.muml.testlanguage.Node) it
					.next();
			int visualID = org.muml.testlanguage.diagram.part.TestLanguageVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == org.muml.testlanguage.diagram.edit.parts.NodeEditPart.VISUAL_ID) {
				result.add(new org.muml.testlanguage.diagram.part.TestLanguageNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.testlanguage.diagram.part.TestLanguageNodeDescriptor> getNodeNodeFigureCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		org.muml.testlanguage.Node modelElement = (org.muml.testlanguage.Node) containerView
				.getElement();
		LinkedList<org.muml.testlanguage.diagram.part.TestLanguageNodeDescriptor> result = new LinkedList<org.muml.testlanguage.diagram.part.TestLanguageNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInputs().iterator(); it.hasNext();) {
			org.muml.testlanguage.Input childElement = (org.muml.testlanguage.Input) it
					.next();
			int visualID = org.muml.testlanguage.diagram.part.TestLanguageVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == org.muml.testlanguage.diagram.edit.parts.InputEditPart.VISUAL_ID) {
				result.add(new org.muml.testlanguage.diagram.part.TestLanguageNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getOutputs().iterator(); it
				.hasNext();) {
			org.muml.testlanguage.Output childElement = (org.muml.testlanguage.Output) it
					.next();
			int visualID = org.muml.testlanguage.diagram.part.TestLanguageVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == org.muml.testlanguage.diagram.edit.parts.OutputEditPart.VISUAL_ID) {
				result.add(new org.muml.testlanguage.diagram.part.TestLanguageNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.testlanguage.diagram.part.TestLanguageLinkDescriptor> getContainedLinks(
			View view) {
		switch (org.muml.testlanguage.diagram.part.TestLanguageVisualIDRegistry
				.getVisualID(view)) {
		case org.muml.testlanguage.diagram.edit.parts.TestCaseEditPart.VISUAL_ID:
			return getTestCase_1000ContainedLinks(view);
		case org.muml.testlanguage.diagram.edit.parts.NodeEditPart.VISUAL_ID:
			return getNode_2001ContainedLinks(view);
		case org.muml.testlanguage.diagram.edit.parts.InputEditPart.VISUAL_ID:
			return getInput_3001ContainedLinks(view);
		case org.muml.testlanguage.diagram.edit.parts.OutputEditPart.VISUAL_ID:
			return getOutput_3002ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.testlanguage.diagram.part.TestLanguageLinkDescriptor> getIncomingLinks(
			View view) {
		switch (org.muml.testlanguage.diagram.part.TestLanguageVisualIDRegistry
				.getVisualID(view)) {
		case org.muml.testlanguage.diagram.edit.parts.NodeEditPart.VISUAL_ID:
			return getNode_2001IncomingLinks(view);
		case org.muml.testlanguage.diagram.edit.parts.InputEditPart.VISUAL_ID:
			return getInput_3001IncomingLinks(view);
		case org.muml.testlanguage.diagram.edit.parts.OutputEditPart.VISUAL_ID:
			return getOutput_3002IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.testlanguage.diagram.part.TestLanguageLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (org.muml.testlanguage.diagram.part.TestLanguageVisualIDRegistry
				.getVisualID(view)) {
		case org.muml.testlanguage.diagram.edit.parts.NodeEditPart.VISUAL_ID:
			return getNode_2001OutgoingLinks(view);
		case org.muml.testlanguage.diagram.edit.parts.InputEditPart.VISUAL_ID:
			return getInput_3001OutgoingLinks(view);
		case org.muml.testlanguage.diagram.edit.parts.OutputEditPart.VISUAL_ID:
			return getOutput_3002OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.testlanguage.diagram.part.TestLanguageLinkDescriptor> getTestCase_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.testlanguage.diagram.part.TestLanguageLinkDescriptor> getNode_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.testlanguage.diagram.part.TestLanguageLinkDescriptor> getInput_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.testlanguage.diagram.part.TestLanguageLinkDescriptor> getOutput_3002ContainedLinks(
			View view) {
		org.muml.testlanguage.Output modelElement = (org.muml.testlanguage.Output) view
				.getElement();
		LinkedList<org.muml.testlanguage.diagram.part.TestLanguageLinkDescriptor> result = new LinkedList<org.muml.testlanguage.diagram.part.TestLanguageLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Output_Targets_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.testlanguage.diagram.part.TestLanguageLinkDescriptor> getNode_2001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.testlanguage.diagram.part.TestLanguageLinkDescriptor> getInput_3001IncomingLinks(
			View view) {
		org.muml.testlanguage.Input modelElement = (org.muml.testlanguage.Input) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<org.muml.testlanguage.diagram.part.TestLanguageLinkDescriptor> result = new LinkedList<org.muml.testlanguage.diagram.part.TestLanguageLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Output_Targets_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.muml.testlanguage.diagram.part.TestLanguageLinkDescriptor> getOutput_3002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.testlanguage.diagram.part.TestLanguageLinkDescriptor> getNode_2001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.testlanguage.diagram.part.TestLanguageLinkDescriptor> getInput_3001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.muml.testlanguage.diagram.part.TestLanguageLinkDescriptor> getOutput_3002OutgoingLinks(
			View view) {
		org.muml.testlanguage.Output modelElement = (org.muml.testlanguage.Output) view
				.getElement();
		LinkedList<org.muml.testlanguage.diagram.part.TestLanguageLinkDescriptor> result = new LinkedList<org.muml.testlanguage.diagram.part.TestLanguageLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Output_Targets_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<org.muml.testlanguage.diagram.part.TestLanguageLinkDescriptor> getIncomingFeatureModelFacetLinks_Output_Targets_4001(
			org.muml.testlanguage.Input target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<org.muml.testlanguage.diagram.part.TestLanguageLinkDescriptor> result = new LinkedList<org.muml.testlanguage.diagram.part.TestLanguageLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == org.muml.testlanguage.TestLanguagePackage.eINSTANCE
					.getOutput_Targets()) {
				result.add(new org.muml.testlanguage.diagram.part.TestLanguageLinkDescriptor(
						setting.getEObject(),
						target,
						org.muml.testlanguage.diagram.providers.TestLanguageElementTypes.OutputTargets_4001,
						org.muml.testlanguage.diagram.edit.parts.OutputTargetsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<org.muml.testlanguage.diagram.part.TestLanguageLinkDescriptor> getOutgoingFeatureModelFacetLinks_Output_Targets_4001(
			org.muml.testlanguage.Output source) {
		LinkedList<org.muml.testlanguage.diagram.part.TestLanguageLinkDescriptor> result = new LinkedList<org.muml.testlanguage.diagram.part.TestLanguageLinkDescriptor>();
		for (Iterator<?> destinations = source.getTargets().iterator(); destinations
				.hasNext();) {
			org.muml.testlanguage.Input destination = (org.muml.testlanguage.Input) destinations
					.next();
			result.add(new org.muml.testlanguage.diagram.part.TestLanguageLinkDescriptor(
					source,
					destination,
					org.muml.testlanguage.diagram.providers.TestLanguageElementTypes.OutputTargets_4001,
					org.muml.testlanguage.diagram.edit.parts.OutputTargetsEditPart.VISUAL_ID));
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
		public List<org.muml.testlanguage.diagram.part.TestLanguageNodeDescriptor> getSemanticChildren(
				View view) {
			return TestLanguageDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<org.muml.testlanguage.diagram.part.TestLanguageLinkDescriptor> getContainedLinks(
				View view) {
			return TestLanguageDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<org.muml.testlanguage.diagram.part.TestLanguageLinkDescriptor> getIncomingLinks(
				View view) {
			return TestLanguageDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<org.muml.testlanguage.diagram.part.TestLanguageLinkDescriptor> getOutgoingLinks(
				View view) {
			return TestLanguageDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
