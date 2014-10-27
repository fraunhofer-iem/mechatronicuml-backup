package pattern.diagram.part;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;
import org.storydriven.core.ExtendableElement;

import pattern.CoordinationPattern;
import pattern.diagram.edit.parts.CoordinationPattern2EditPart;
import pattern.diagram.edit.parts.CoordinationPatternEditPart;
import pattern.diagram.edit.parts.CoordinationPatternPatternCompartment2EditPart;
import pattern.diagram.edit.parts.CoordinationPatternPatternCompartmentEditPart;
import pattern.diagram.edit.parts.ModelElementCategoryEditPart;

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
		case CoordinationPatternPatternCompartment2EditPart.VISUAL_ID:
			return getCoordinationPatternPatternCompartment_7002SemanticChildren(view);
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

		return result;
	}

	/**
	 * @generated
	 */
	public static List<Pattern2NodeDescriptor> getCoordinationPatternPatternCompartment_7002SemanticChildren(
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
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Pattern2LinkDescriptor> getCoordinationPattern_3001ContainedLinks(
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
	public static List<Pattern2LinkDescriptor> getCoordinationPattern_2001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Pattern2LinkDescriptor> getCoordinationPattern_3001OutgoingLinks(
			View view) {
		return Collections.emptyList();
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
