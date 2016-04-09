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
import org.muml.testlanguage.Input;
import org.muml.testlanguage.Node;
import org.muml.testlanguage.Output;
import org.muml.testlanguage.TestCase;
import org.muml.testlanguage.TestLanguagePackage;
import org.muml.testlanguage.diagram.edit.parts.InputEditPart;
import org.muml.testlanguage.diagram.edit.parts.NodeEditPart;
import org.muml.testlanguage.diagram.edit.parts.NodeNodeFigureCompartmentEditPart;
import org.muml.testlanguage.diagram.edit.parts.OutputEditPart;
import org.muml.testlanguage.diagram.edit.parts.OutputTargetsEditPart;
import org.muml.testlanguage.diagram.edit.parts.TestCaseEditPart;
import org.muml.testlanguage.diagram.providers.TestLanguageElementTypes;

/**
 * @generated
 */
public class TestLanguageDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<TestLanguageNodeDescriptor> getSemanticChildren(View view) {
		switch (TestLanguageVisualIDRegistry.getVisualID(view)) {
		case TestCaseEditPart.VISUAL_ID:
			return getTestCase_1000SemanticChildren(view);
		case NodeNodeFigureCompartmentEditPart.VISUAL_ID:
			return getNodeNodeFigureCompartment_7001SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TestLanguageNodeDescriptor> getTestCase_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		TestCase modelElement = (TestCase) view.getElement();
		LinkedList<TestLanguageNodeDescriptor> result = new LinkedList<TestLanguageNodeDescriptor>();
		for (Iterator<?> it = modelElement.getNodes().iterator(); it.hasNext();) {
			Node childElement = (Node) it.next();
			int visualID = TestLanguageVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == NodeEditPart.VISUAL_ID) {
				result.add(new TestLanguageNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TestLanguageNodeDescriptor> getNodeNodeFigureCompartment_7001SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Node modelElement = (Node) containerView.getElement();
		LinkedList<TestLanguageNodeDescriptor> result = new LinkedList<TestLanguageNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInputs().iterator(); it.hasNext();) {
			Input childElement = (Input) it.next();
			int visualID = TestLanguageVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == InputEditPart.VISUAL_ID) {
				result.add(new TestLanguageNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getOutputs().iterator(); it.hasNext();) {
			Output childElement = (Output) it.next();
			int visualID = TestLanguageVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == OutputEditPart.VISUAL_ID) {
				result.add(new TestLanguageNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TestLanguageLinkDescriptor> getContainedLinks(View view) {
		switch (TestLanguageVisualIDRegistry.getVisualID(view)) {
		case TestCaseEditPart.VISUAL_ID:
			return getTestCase_1000ContainedLinks(view);
		case NodeEditPart.VISUAL_ID:
			return getNode_2001ContainedLinks(view);
		case InputEditPart.VISUAL_ID:
			return getInput_3001ContainedLinks(view);
		case OutputEditPart.VISUAL_ID:
			return getOutput_3002ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TestLanguageLinkDescriptor> getIncomingLinks(View view) {
		switch (TestLanguageVisualIDRegistry.getVisualID(view)) {
		case NodeEditPart.VISUAL_ID:
			return getNode_2001IncomingLinks(view);
		case InputEditPart.VISUAL_ID:
			return getInput_3001IncomingLinks(view);
		case OutputEditPart.VISUAL_ID:
			return getOutput_3002IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TestLanguageLinkDescriptor> getOutgoingLinks(View view) {
		switch (TestLanguageVisualIDRegistry.getVisualID(view)) {
		case NodeEditPart.VISUAL_ID:
			return getNode_2001OutgoingLinks(view);
		case InputEditPart.VISUAL_ID:
			return getInput_3001OutgoingLinks(view);
		case OutputEditPart.VISUAL_ID:
			return getOutput_3002OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TestLanguageLinkDescriptor> getTestCase_1000ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TestLanguageLinkDescriptor> getNode_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TestLanguageLinkDescriptor> getInput_3001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TestLanguageLinkDescriptor> getOutput_3002ContainedLinks(View view) {
		Output modelElement = (Output) view.getElement();
		LinkedList<TestLanguageLinkDescriptor> result = new LinkedList<TestLanguageLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Output_Targets_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TestLanguageLinkDescriptor> getNode_2001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TestLanguageLinkDescriptor> getInput_3001IncomingLinks(View view) {
		Input modelElement = (Input) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<TestLanguageLinkDescriptor> result = new LinkedList<TestLanguageLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Output_Targets_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TestLanguageLinkDescriptor> getOutput_3002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TestLanguageLinkDescriptor> getNode_2001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TestLanguageLinkDescriptor> getInput_3001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TestLanguageLinkDescriptor> getOutput_3002OutgoingLinks(View view) {
		Output modelElement = (Output) view.getElement();
		LinkedList<TestLanguageLinkDescriptor> result = new LinkedList<TestLanguageLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Output_Targets_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<TestLanguageLinkDescriptor> getIncomingFeatureModelFacetLinks_Output_Targets_4001(
			Input target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<TestLanguageLinkDescriptor> result = new LinkedList<TestLanguageLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == TestLanguagePackage.eINSTANCE.getOutput_Targets()) {
				result.add(new TestLanguageLinkDescriptor(setting.getEObject(), target,
						TestLanguageElementTypes.OutputTargets_4001, OutputTargetsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<TestLanguageLinkDescriptor> getOutgoingFeatureModelFacetLinks_Output_Targets_4001(
			Output source) {
		LinkedList<TestLanguageLinkDescriptor> result = new LinkedList<TestLanguageLinkDescriptor>();
		for (Iterator<?> destinations = source.getTargets().iterator(); destinations.hasNext();) {
			Input destination = (Input) destinations.next();
			result.add(new TestLanguageLinkDescriptor(source, destination, TestLanguageElementTypes.OutputTargets_4001,
					OutputTargetsEditPart.VISUAL_ID));
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

		public List<TestLanguageNodeDescriptor> getSemanticChildren(View view) {
			return TestLanguageDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<TestLanguageLinkDescriptor> getContainedLinks(View view) {
			return TestLanguageDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<TestLanguageLinkDescriptor> getIncomingLinks(View view) {
			return TestLanguageDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<TestLanguageLinkDescriptor> getOutgoingLinks(View view) {
			return TestLanguageDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
