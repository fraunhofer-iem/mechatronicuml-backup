package de.uni_paderborn.fujaba.muml.reconfiguration.ui.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.core.providers.IViewProvider;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateDiagramViewOperation;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateEdgeViewOperation;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateNodeViewOperation;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateViewForKindOperation;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateViewOperation;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants;
import org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities;
import org.eclipse.gmf.runtime.emf.core.util.EMFCoreUtil;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.notation.DecorationNode;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.FontStyle;
import org.eclipse.gmf.runtime.notation.Location;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.Shape;
import org.eclipse.gmf.runtime.notation.TitleStyle;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.FontData;

import de.uni_paderborn.fujaba.muml.component.diagram.providers.MumlViewProvider;

public class ReconfigurationViewProvider extends MumlViewProvider implements
		IViewProvider {

	// TODO implement other 3 cases

	// basically copied from
	// /de.uni_paderborn.fujaba.muml.component.diagram/src/de/uni_paderborn/fujaba/muml/component/diagram/providers/MumlViewProvider.java
	protected boolean provides(CreateNodeViewOperation op) {
		if (op.getContainerView() == null) {
			return false;
		}
		IElementType elementType = getSemanticElementType(op
				.getSemanticAdapter());
		EObject domainElement = getSemanticElement(op.getSemanticAdapter());
		int visualID;
		if (op.getSemanticHint() == null) {
			// Semantic hint is not specified. Can be a result of call from
			// CanonicalEditPolicy.
			// In this situation there should be NO elementType, visualID will
			// be determined
			// by VisualIDRegistry.getNodeVisualID() for domainElement.
			if (elementType != null || domainElement == null) {
				return false;
			}
			visualID = de.uni_paderborn.fujaba.muml.reconfiguration.ui.part.ReconfigurationVisualIDRegistry
					.getNodeVisualID(op.getContainerView(), domainElement);
		} else {
			visualID = de.uni_paderborn.fujaba.muml.reconfiguration.ui.part.ReconfigurationVisualIDRegistry
					.getVisualID(op.getSemanticHint());
			if (elementType != null) {
				if (!de.uni_paderborn.fujaba.muml.reconfiguration.ui.providers.ReconfigurationElementTypes
						.isKnownElementType(elementType)
						|| (!(elementType instanceof IHintedType))) {
					return false; // foreign element type
				}
				String elementTypeHint = ((IHintedType) elementType)
						.getSemanticHint();
				if (!op.getSemanticHint().equals(elementTypeHint)) {
					return false; // if semantic hint is specified it should be
									// the same as in element type
				}
				if (domainElement != null
						&& visualID != de.uni_paderborn.fujaba.muml.reconfiguration.ui.part.ReconfigurationVisualIDRegistry
								.getNodeVisualID(op.getContainerView(),
										domainElement)) {
					return false; // visual id for node EClass should match
									// visual id from element type
				}
			} else {
				// TODO ??
				if (!de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.ModelElementCategoryEditPart.MODEL_ID
						.equals(de.uni_paderborn.fujaba.muml.component.diagram.part.MumlVisualIDRegistry
								.getModelID(op.getContainerView()))) {
					return false; // foreign diagram
				}
				switch (visualID) {
				// case
				// de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.AtomicComponentEditPart.VISUAL_ID:
				case de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.ReconfigurableStructuredComponentEditPart.VISUAL_ID:
				case de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.ReconfigurationMessagePortEditPart.VISUAL_ID:
					// case
					// de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.ContinuousPortEditPart.VISUAL_ID:
					// case
					// de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.HybridPortEditPart.VISUAL_ID:
					// case
					// de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.ComponentPartEditPart.VISUAL_ID:
					// case
					// de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.PortPartEditPart.VISUAL_ID:
					// case
					// de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.CoordinationProtocolOccurrenceEditPart.VISUAL_ID:
					if (domainElement == null
							|| visualID != de.uni_paderborn.fujaba.muml.reconfiguration.ui.part.ReconfigurationVisualIDRegistry
									.getNodeVisualID(op.getContainerView(),
											domainElement)) {
						return false; // visual id in semantic hint should match
										// visual id for domain element
					}
					break;
				default:
					return false;
				}
			}
		}
		return de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.ReconfigurableStructuredComponentEditPart.VISUAL_ID == visualID
				|| de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.ReconfigurationMessagePortEditPart.VISUAL_ID == visualID
		// ||
		// de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.ContinuousPortEditPart.VISUAL_ID
		// == visualID
		// ||
		// de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.HybridPortEditPart.VISUAL_ID
		// == visualID
		// ||
		// de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.ComponentPartEditPart.VISUAL_ID
		// == visualID
		// ||
		// de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.PortPartEditPart.VISUAL_ID
		// == visualID
		// ||
		// de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.CoordinationProtocolOccurrenceEditPart.VISUAL_ID
		// == visualID
		;
	}

	// copied from
	// /de.uni_paderborn.fujaba.muml.component.diagram/src/de/uni_paderborn/fujaba/muml/component/diagram/providers/MumlViewProvider.java
	protected boolean provides(CreateDiagramViewOperation op) {
		return super.provides(op);
	}

	@Override
	public Diagram createDiagram(IAdaptable semanticAdapter,
			String diagramKind, PreferencesHint preferencesHint) {
		return super.createDiagram(semanticAdapter, diagramKind,
				preferencesHint);
	}

	@Override
	public Edge createEdge(IAdaptable semanticAdapter, View containerView,
			String semanticHint, int index, boolean persisted,
			PreferencesHint preferencesHint) {

		return super.createEdge(semanticAdapter, containerView, semanticHint,
				index, persisted, preferencesHint);
	}

	// basically copied from
	// /de.uni_paderborn.fujaba.muml.component.diagram/src/de/uni_paderborn/fujaba/muml/component/diagram/providers/MumlViewProvider.java
	public Node createNode(IAdaptable semanticAdapter, View containerView,
			String semanticHint, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		final EObject domainElement = getSemanticElement(semanticAdapter);
		final int visualID;
		if (semanticHint == null) {
			visualID = de.uni_paderborn.fujaba.muml.component.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		} else {
			visualID = de.uni_paderborn.fujaba.muml.component.diagram.part.MumlVisualIDRegistry
					.getVisualID(semanticHint);
		}
		switch (visualID) {

		case de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.ReconfigurableStructuredComponentEditPart.VISUAL_ID:
			return createReconfigurableStructuredComponent_2076(domainElement,
					containerView, index, persisted, preferencesHint);

		case de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.ReconfigurationMessagePortEditPart.VISUAL_ID:
			return createReconfigurationMessagePort_3076(domainElement,
					containerView, index, persisted, preferencesHint);

		default:
			return super.createNode(semanticAdapter, containerView,
					semanticHint, index, persisted, preferencesHint);
		}
	}

	/**
	 * @generated
	 */
	public Node createReconfigurableStructuredComponent_2076(
			EObject domainElement, View containerView, int index,
			boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(de.uni_paderborn.fujaba.muml.reconfiguration.ui.part.ReconfigurationVisualIDRegistry
				.getType(de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.ReconfigurableStructuredComponentEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		stampShortcut(containerView, node);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label5021 = createLabel(
				node,
				de.uni_paderborn.fujaba.muml.reconfiguration.ui.part.ReconfigurationVisualIDRegistry
						.getType(de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.StaticStructuredComponentNameEditPart.VISUAL_ID));
		// XXX .getType into ReconfigurationVisualIDRegistry
		createCompartment(
				node,
				de.uni_paderborn.fujaba.muml.component.diagram.part.MumlVisualIDRegistry
						.getType(de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.StaticStructuredComponentComponentCompartmentEditPart.VISUAL_ID),
				false, false, false, false);
		return node;
	}

	public Node createReconfigurationMessagePort_3076(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(de.uni_paderborn.fujaba.muml.reconfiguration.ui.part.ReconfigurationVisualIDRegistry
				.getType(de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.ReconfigurationMessagePortEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label5012 = createLabel(
				node,
				de.uni_paderborn.fujaba.muml.component.diagram.part.MumlVisualIDRegistry
						.getType(de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.DiscretePortNameEditPart.VISUAL_ID));
		label5012.setLayoutConstraint(NotationFactory.eINSTANCE
				.createLocation());
		Location location5012 = (Location) label5012.getLayoutConstraint();
		location5012.setX(0);
		location5012.setY(5);
		Node label5025 = createLabel(
				node,
				de.uni_paderborn.fujaba.muml.component.diagram.part.MumlVisualIDRegistry
						.getType(de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID));
		label5025.setLayoutConstraint(NotationFactory.eINSTANCE
				.createLocation());
		Location location5025 = (Location) label5025.getLayoutConstraint();
		location5025.setX(0);
		location5025.setY(5);
		return node;
	}

	// copied from
	// /de.uni_paderborn.fujaba.muml.component.diagram/src/de/uni_paderborn/fujaba/muml/component/diagram/providers/MumlViewProvider.java
	private EObject getSemanticElement(IAdaptable semanticAdapter) {
		if (semanticAdapter == null) {
			return null;
		}
		EObject eObject = (EObject) semanticAdapter.getAdapter(EObject.class);
		if (eObject != null) {
			return EMFCoreUtil.resolve(
					TransactionUtil.getEditingDomain(eObject), eObject);
		}
		return null;
	}

	// copied from
	// /de.uni_paderborn.fujaba.muml.component.diagram/src/de/uni_paderborn/fujaba/muml/component/diagram/providers/MumlViewProvider.java
	private IElementType getSemanticElementType(IAdaptable semanticAdapter) {
		if (semanticAdapter == null) {
			return null;
		}
		return (IElementType) semanticAdapter.getAdapter(IElementType.class);
	}

	// copied from
	// /de.uni_paderborn.fujaba.muml.component.diagram/src/de/uni_paderborn/fujaba/muml/component/diagram/providers/MumlViewProvider.java
	private void stampShortcut(View containerView, Node target) {
		if (!de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.ModelElementCategoryEditPart.MODEL_ID
				.equals(de.uni_paderborn.fujaba.muml.component.diagram.part.MumlVisualIDRegistry
						.getModelID(containerView))) {
			EAnnotation shortcutAnnotation = EcoreFactory.eINSTANCE
					.createEAnnotation();
			shortcutAnnotation.setSource("Shortcut"); //$NON-NLS-1$
			shortcutAnnotation
					.getDetails()
					.put("modelID", de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.ModelElementCategoryEditPart.MODEL_ID); //$NON-NLS-1$
			target.getEAnnotations().add(shortcutAnnotation);
		}
	}

	// copied from
	// /de.uni_paderborn.fujaba.muml.component.diagram/src/de/uni_paderborn/fujaba/muml/component/diagram/providers/MumlViewProvider.java
	private Node createLabel(View owner, String hint) {
		DecorationNode rv = NotationFactory.eINSTANCE.createDecorationNode();
		rv.setType(hint);
		ViewUtil.insertChildView(owner, rv, ViewUtil.APPEND, true);
		return rv;
	}

	// copied from
	// /de.uni_paderborn.fujaba.muml.component.diagram/src/de/uni_paderborn/fujaba/muml/component/diagram/providers/MumlViewProvider.java
	private Node createCompartment(View owner, String hint,
			boolean canCollapse, boolean hasTitle, boolean canSort,
			boolean canFilter) {
		// SemanticListCompartment rv =
		// NotationFactory.eINSTANCE.createSemanticListCompartment();
		// rv.setShowTitle(showTitle);
		// rv.setCollapsed(isCollapsed);
		Node rv;
		if (canCollapse) {
			rv = NotationFactory.eINSTANCE.createBasicCompartment();
		} else {
			rv = NotationFactory.eINSTANCE.createDecorationNode();
		}
		if (hasTitle) {
			TitleStyle ts = NotationFactory.eINSTANCE.createTitleStyle();
			ts.setShowTitle(true);
			rv.getStyles().add(ts);
		}
		if (canSort) {
			rv.getStyles().add(NotationFactory.eINSTANCE.createSortingStyle());
		}
		if (canFilter) {
			rv.getStyles()
					.add(NotationFactory.eINSTANCE.createFilteringStyle());
		}
		rv.setType(hint);
		ViewUtil.insertChildView(owner, rv, ViewUtil.APPEND, true);
		return rv;
	}
}
