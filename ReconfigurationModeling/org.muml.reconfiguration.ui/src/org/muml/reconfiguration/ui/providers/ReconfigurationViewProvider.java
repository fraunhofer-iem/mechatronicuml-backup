package org.muml.reconfiguration.ui.providers;

import java.util.ArrayList;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.core.providers.IViewProvider;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateDiagramViewOperation;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateEdgeViewOperation;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateNodeViewOperation;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants;
import org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities;
import org.eclipse.gmf.runtime.emf.core.util.EMFCoreUtil;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.notation.Connector;
import org.eclipse.gmf.runtime.notation.DecorationNode;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.FontStyle;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.RelativeBendpoints;
import org.eclipse.gmf.runtime.notation.Routing;
import org.eclipse.gmf.runtime.notation.Shape;
import org.eclipse.gmf.runtime.notation.TitleStyle;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.notation.datatype.RelativeBendpoint;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.FontData;
import org.muml.pim.component.diagram.providers.MumlViewProvider;

public class ReconfigurationViewProvider extends MumlViewProvider implements
		IViewProvider {

	// basically copied from
	// /org.muml.pim.component.diagram/src/de/uni_paderborn/fujaba/muml/component/diagram/providers/MumlViewProvider.java
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
			visualID = org.muml.reconfiguration.ui.part.ReconfigurationVisualIDRegistry
					.getNodeVisualID(op.getContainerView(), domainElement);
		} else {
			visualID = org.muml.reconfiguration.ui.part.ReconfigurationVisualIDRegistry
					.getVisualID(op.getSemanticHint());
			if (elementType != null) {
				if (!org.muml.reconfiguration.ui.providers.ReconfigurationElementTypes
						.isKnownElementType(elementType)
						|| (!(elementType instanceof IHintedType))) {
					return false; // foreign element type -> try muml view
									// provider
				}
				String elementTypeHint = ((IHintedType) elementType)
						.getSemanticHint();
				if (!op.getSemanticHint().equals(elementTypeHint)) {
					return false; // if semantic hint is specified it should be
									// the same as in element type
				}
				if (domainElement != null
						&& visualID != org.muml.reconfiguration.ui.part.ReconfigurationVisualIDRegistry
								.getNodeVisualID(op.getContainerView(),
										domainElement)) {
					return false; // visual id for node EClass should match
									// visual id from element type
				}
			} else {
			
				if (!org.muml.pim.component.diagram.edit.parts.ModelElementCategoryEditPart.MODEL_ID
						.equals(org.muml.pim.component.diagram.part.MumlVisualIDRegistry
								.getModelID(op.getContainerView()))) {
					return false; // foreign diagram
				}
				switch (visualID) {
				case org.muml.reconfiguration.ui.edit.parts.ReconfigurableAtomicComponentEditPart.VISUAL_ID:
				case org.muml.reconfiguration.ui.edit.parts.ReconfigurableStructuredComponentEditPart.VISUAL_ID:
				case org.muml.reconfiguration.ui.edit.parts.ReconfigurationMessagePortEditPart.VISUAL_ID:
				case org.muml.reconfiguration.ui.edit.parts.BroadcastPortEditPart.VISUAL_ID:
				case org.muml.reconfiguration.ui.edit.parts.ReconfigurationExecutionPortEditPart.VISUAL_ID:
				case org.muml.reconfiguration.ui.edit.parts.RuleBasedReconfigurationControllerEditPart.VISUAL_ID:
				case org.muml.pim.component.diagram.edit.parts.DiscretePortEditPart.VISUAL_ID:
				case org.muml.pim.component.diagram.edit.parts.ComponentPartEditPart.VISUAL_ID:
				case org.muml.pim.component.diagram.edit.parts.CoordinationProtocolPartEditPart.VISUAL_ID:
				case org.muml.reconfiguration.ui.edit.parts.ManagerEditPart.VISUAL_ID:
				case org.muml.reconfiguration.ui.edit.parts.ExecutorEditPart.VISUAL_ID:
				case org.muml.reconfiguration.ui.edit.parts.InternalReconfigurationCommunicationPortEditPart.VISUAL_ID:
				case org.muml.pim.component.diagram.edit.parts.ContinuousPortEditPart.VISUAL_ID:
				case org.muml.pim.component.diagram.edit.parts.HybridPortEditPart.VISUAL_ID:
				case org.muml.reconfiguration.ui.edit.parts.FadingComponentEditPart.VISUAL_ID:
					
					if (domainElement == null
							|| visualID != org.muml.reconfiguration.ui.part.ReconfigurationVisualIDRegistry
									.getNodeVisualID(op.getContainerView(),
											domainElement)) {
						return false; // visual id in semantic hint should match
										// visual id for domain element
					}
					break;
				}
			}
		}
		if (org.muml.reconfiguration.ui.edit.parts.ReconfigurableStructuredComponentEditPart.VISUAL_ID == visualID
				|| org.muml.reconfiguration.ui.edit.parts.ReconfigurableAtomicComponentEditPart.VISUAL_ID == visualID
				|| org.muml.reconfiguration.ui.edit.parts.ReconfigurationMessagePortEditPart.VISUAL_ID == visualID
				|| org.muml.reconfiguration.ui.edit.parts.BroadcastPortEditPart.VISUAL_ID == visualID
				|| org.muml.reconfiguration.ui.edit.parts.ReconfigurationExecutionPortEditPart.VISUAL_ID == visualID
				|| org.muml.reconfiguration.ui.edit.parts.RuleBasedReconfigurationControllerEditPart.VISUAL_ID == visualID
				|| org.muml.pim.component.diagram.edit.parts.DiscretePortEditPart.VISUAL_ID == visualID
				|| org.muml.pim.component.diagram.edit.parts.ContinuousPortEditPart.VISUAL_ID == visualID
				|| org.muml.pim.component.diagram.edit.parts.HybridPortEditPart.VISUAL_ID == visualID
				|| org.muml.pim.component.diagram.edit.parts.ComponentPartEditPart.VISUAL_ID == visualID
				|| org.muml.pim.component.diagram.edit.parts.CoordinationProtocolPartEditPart.VISUAL_ID == visualID
				|| org.muml.reconfiguration.ui.edit.parts.ManagerEditPart.VISUAL_ID == visualID
				|| org.muml.reconfiguration.ui.edit.parts.ExecutorEditPart.VISUAL_ID == visualID
				|| org.muml.reconfiguration.ui.edit.parts.InternalReconfigurationCommunicationPortEditPart.VISUAL_ID == visualID
				|| org.muml.reconfiguration.ui.edit.parts.FadingComponentEditPart.VISUAL_ID == visualID)

			return true;

		else
			return super.provides(op);

	}

	// copied from
	// /org.muml.pim.component.diagram/src/de/uni_paderborn/fujaba/muml/component/diagram/providers/MumlViewProvider.java
	protected boolean provides(CreateDiagramViewOperation op) {
		return super.provides(op);
	}

	protected boolean provides(CreateEdgeViewOperation op) {
		IElementType elementType = getSemanticElementType(op
				.getSemanticAdapter());
		if (!org.muml.reconfiguration.ui.providers.ReconfigurationElementTypes
				.isKnownElementType(elementType)
				|| (!(elementType instanceof IHintedType))) {
			return super.provides(op); // foreign element type
		}
		String elementTypeHint = ((IHintedType) elementType).getSemanticHint();
		if (elementTypeHint == null
				|| (op.getSemanticHint() != null && !elementTypeHint.equals(op
						.getSemanticHint()))) {
			return false; // our hint is visual id and must be specified, and it
							// should be the same as in element type
		}
		int visualID = org.muml.reconfiguration.ui.part.ReconfigurationVisualIDRegistry
				.getVisualID(elementTypeHint);
		EObject domainElement = getSemanticElement(op.getSemanticAdapter());
		if (domainElement != null
				&& visualID != org.muml.reconfiguration.ui.part.ReconfigurationVisualIDRegistry
						.getLinkWithClassVisualID(domainElement)) {
			return false; // visual id for link EClass should match visual id
							// from element type
		}
		return true;
	}

	// TODO delete call should go to parent anyway
	@Override
	public Diagram createDiagram(IAdaptable semanticAdapter,
			String diagramKind, PreferencesHint preferencesHint) {
		return super.createDiagram(semanticAdapter, diagramKind,
				preferencesHint);
	}

	// TODO delete call should go to parent anyway
	@Override
	public Edge createEdge(IAdaptable semanticAdapter, View containerView,
			String semanticHint, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		IElementType elementType = getSemanticElementType(semanticAdapter);
		String elementTypeHint = ((IHintedType) elementType).getSemanticHint();
		switch (org.muml.pim.component.diagram.part.MumlVisualIDRegistry
				.getVisualID(elementTypeHint)) {
		case org.muml.reconfiguration.ui.edit.parts.ReconfigurationPortDelegationConnectorEditPart.VISUAL_ID:
			return createReconfigurationPortDelegationConnector_4076(
					getSemanticElement(semanticAdapter), containerView, index,
					persisted, preferencesHint);
		case org.muml.reconfiguration.ui.edit.parts.ReconfigurationPortAssemblyConnectorEditPart.VISUAL_ID:
			return createReconfigurationPortAssemblyConnector_4075(
					getSemanticElement(semanticAdapter), containerView, index,
					persisted, preferencesHint);

		default:
			return super.createEdge(semanticAdapter, containerView,
					semanticHint, index, persisted, preferencesHint);
		}
	}

	// basically copied from
	// /org.muml.pim.component.diagram/src/de/uni_paderborn/fujaba/muml/component/diagram/providers/MumlViewProvider.java
	public Node createNode(IAdaptable semanticAdapter, View containerView,
			String semanticHint, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		final EObject domainElement = getSemanticElement(semanticAdapter);
		final int visualID;
		if (semanticHint == null) {
			visualID = org.muml.pim.component.diagram.part.MumlVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		} else {
			visualID = org.muml.pim.component.diagram.part.MumlVisualIDRegistry
					.getVisualID(semanticHint);
		}
		switch (visualID) {

		
		case org.muml.reconfiguration.ui.edit.parts.ReconfigurableAtomicComponentEditPart.VISUAL_ID:
			return createReconfigurableAtomicComponent_2078(domainElement,
					containerView, index, persisted, preferencesHint);
		case org.muml.reconfiguration.ui.edit.parts.ReconfigurableStructuredComponentEditPart.VISUAL_ID:
			return createReconfigurableStructuredComponent_2076(domainElement,
					containerView, index, persisted, preferencesHint);

		case org.muml.reconfiguration.ui.edit.parts.ReconfigurationMessagePortEditPart.VISUAL_ID:
			return createReconfigurationMessagePort_3076(domainElement,
					containerView, index, persisted, preferencesHint);
		case org.muml.reconfiguration.ui.edit.parts.ReconfigurationExecutionPortEditPart.VISUAL_ID:
			return createReconfigurationExecutionPort_3077(domainElement,
					containerView, index, persisted, preferencesHint);
		case org.muml.reconfiguration.ui.edit.parts.BroadcastPortEditPart.VISUAL_ID:
			return createBroadcastPort_3078(domainElement,
					containerView, index, persisted, preferencesHint);
		case org.muml.reconfiguration.ui.edit.parts.InternalReconfigurationCommunicationPortEditPart.VISUAL_ID:
			return createInternalReconfigurationCommunicationPort_3075(
					domainElement, containerView, index, persisted,
					preferencesHint);
		case org.muml.reconfiguration.ui.edit.parts.RuleBasedReconfigurationControllerEditPart.VISUAL_ID:
			return createRuleBasedReconfigurationController_7076(domainElement,
					containerView, index, persisted, preferencesHint);
		case org.muml.reconfiguration.ui.edit.parts.ManagerEditPart.VISUAL_ID:
			return createManager_2075(domainElement, containerView, index,
					persisted, preferencesHint);

		case org.muml.reconfiguration.ui.edit.parts.ExecutorEditPart.VISUAL_ID:
			return createExecutor_2077(domainElement, containerView, index,
					persisted, preferencesHint);

		case org.muml.pim.component.diagram.edit.parts.DiscretePortEditPart.VISUAL_ID:
			return super.createDiscretePort_3010(domainElement, containerView, index,
					persisted, preferencesHint);
		case org.muml.pim.component.diagram.edit.parts.ContinuousPortEditPart.VISUAL_ID:
			return super.createContinuousPort_3011(domainElement, containerView, index,
					persisted, preferencesHint);
		case org.muml.pim.component.diagram.edit.parts.HybridPortEditPart.VISUAL_ID:
			return super.createHybridPort_3013(domainElement, containerView, index,
					persisted, preferencesHint);
		case org.muml.reconfiguration.ui.edit.parts.FadingComponentEditPart.VISUAL_ID:
			return createFadingComponent_2079(domainElement,
					containerView, index, persisted, preferencesHint);

		default:
			return super.createNode(semanticAdapter, containerView,
					semanticHint, index, persisted, preferencesHint);
		}
	}
	
	public Node createReconfigurableAtomicComponent_2078(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(org.muml.reconfiguration.ui.part.ReconfigurationVisualIDRegistry
				.getType(org.muml.reconfiguration.ui.edit.parts.ReconfigurableAtomicComponentEditPart.VISUAL_ID));
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
		Node label5028 = createLabel(
				node,
				org.muml.pim.component.diagram.part.MumlVisualIDRegistry
						.getType(org.muml.pim.component.diagram.edit.parts.StaticAtomicComponentNameEditPart.VISUAL_ID));
		return node;
	}


	public Node createReconfigurableStructuredComponent_2076(
			EObject domainElement, View containerView, int index,
			boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(org.muml.reconfiguration.ui.part.ReconfigurationVisualIDRegistry
				.getType(org.muml.reconfiguration.ui.edit.parts.ReconfigurableStructuredComponentEditPart.VISUAL_ID));
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
				org.muml.reconfiguration.ui.part.ReconfigurationVisualIDRegistry
						.getType(org.muml.pim.component.diagram.edit.parts.StaticStructuredComponentNameEditPart.VISUAL_ID));

		createCompartment(
				node,
				org.muml.reconfiguration.ui.part.ReconfigurationVisualIDRegistry
						.getType(org.muml.reconfiguration.ui.edit.parts.ReconfigurableStructuredComponentCompartmentEditPart.VISUAL_ID),
				false, false, false, false);

		return node;
	}

	
	public Node createFadingComponent_2079(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(org.muml.reconfiguration.ui.part.ReconfigurationVisualIDRegistry
				.getType(org.muml.reconfiguration.ui.edit.parts.FadingComponentEditPart.VISUAL_ID));
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
		Node label5028 = createLabel(
				node,
				org.muml.reconfiguration.ui.part.ReconfigurationVisualIDRegistry
						.getType(org.muml.pim.component.diagram.edit.parts.StaticAtomicComponentNameEditPart.VISUAL_ID));
		return node;
	}
	
	public Node createReconfigurationMessagePort_3076(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(org.muml.reconfiguration.ui.part.ReconfigurationVisualIDRegistry
				.getType(org.muml.reconfiguration.ui.edit.parts.ReconfigurationMessagePortEditPart.VISUAL_ID));
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

		return node;
	}

	public Node createReconfigurationExecutionPort_3077(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(org.muml.reconfiguration.ui.part.ReconfigurationVisualIDRegistry
				.getType(org.muml.reconfiguration.ui.edit.parts.ReconfigurationExecutionPortEditPart.VISUAL_ID));
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

	
		return node;
	}
	
	public Node createBroadcastPort_3078(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(org.muml.reconfiguration.ui.part.ReconfigurationVisualIDRegistry
				.getType(org.muml.reconfiguration.ui.edit.parts.BroadcastPortEditPart.VISUAL_ID));
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


		return node;
	}

	public Node createInternalReconfigurationCommunicationPort_3075(
			EObject domainElement, View containerView, int index,
			boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(org.muml.reconfiguration.ui.part.ReconfigurationVisualIDRegistry
				.getType(org.muml.reconfiguration.ui.edit.parts.InternalReconfigurationCommunicationPortEditPart.VISUAL_ID));
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


		return node;
	}

	public Node createRuleBasedReconfigurationController_7076(
			EObject domainElement, View containerView, int index,
			boolean persisted, PreferencesHint preferencesHint) {

		Node rv = NotationFactory.eINSTANCE.createBasicCompartment();
		rv.setElement(domainElement);
		rv.setType(org.muml.reconfiguration.ui.part.ReconfigurationVisualIDRegistry
				.getType(org.muml.reconfiguration.ui.edit.parts.RuleBasedReconfigurationControllerEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, rv, ViewUtil.APPEND, true);
		return rv;
	}

	public Node createManager_2075(EObject domainElement, View containerView,
			int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(org.muml.reconfiguration.ui.part.ReconfigurationVisualIDRegistry
				.getType(org.muml.reconfiguration.ui.edit.parts.ManagerEditPart.VISUAL_ID));
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

		return node;
	}

	public Node createExecutor_2077(EObject domainElement, View containerView,
			int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(org.muml.reconfiguration.ui.part.ReconfigurationVisualIDRegistry
				.getType(org.muml.reconfiguration.ui.edit.parts.ExecutorEditPart.VISUAL_ID));
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

		return node;
	}

	public Edge createReconfigurationPortDelegationConnector_4076(
			EObject domainElement, View containerView, int index,
			boolean persisted, PreferencesHint preferencesHint) {
		Connector edge = NotationFactory.eINSTANCE.createConnector();
		edge.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		RelativeBendpoints bendpoints = NotationFactory.eINSTANCE
				.createRelativeBendpoints();
		ArrayList<RelativeBendpoint> points = new ArrayList<RelativeBendpoint>(
				2);
		points.add(new RelativeBendpoint());
		points.add(new RelativeBendpoint());
		bendpoints.setPoints(points);
		edge.setBendpoints(bendpoints);
		ViewUtil.insertChildView(containerView, edge, index, persisted);
		edge.setType(org.muml.reconfiguration.ui.part.ReconfigurationVisualIDRegistry
				.getType(org.muml.reconfiguration.ui.edit.parts.ReconfigurationPortDelegationConnectorEditPart.VISUAL_ID));
		edge.setElement(domainElement);
		// initializePreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(edge,
				NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle edgeFontStyle = (FontStyle) edge
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (edgeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			edgeFontStyle.setFontName(fontData.getName());
			edgeFontStyle.setFontHeight(fontData.getHeight());
			edgeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			edgeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			edgeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		Routing routing = Routing.get(prefStore
				.getInt(IPreferenceConstants.PREF_LINE_STYLE));
		if (routing != null) {
			ViewUtil.setStructuralFeatureValue(edge,
					NotationPackage.eINSTANCE.getRoutingStyle_Routing(),
					routing);
		}
		return edge;
	}

	public Edge createReconfigurationPortAssemblyConnector_4075(
			EObject domainElement, View containerView, int index,
			boolean persisted, PreferencesHint preferencesHint) {
		Connector edge = NotationFactory.eINSTANCE.createConnector();
		edge.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		RelativeBendpoints bendpoints = NotationFactory.eINSTANCE
				.createRelativeBendpoints();
		ArrayList<RelativeBendpoint> points = new ArrayList<RelativeBendpoint>(
				2);
		points.add(new RelativeBendpoint());
		points.add(new RelativeBendpoint());
		bendpoints.setPoints(points);
		edge.setBendpoints(bendpoints);
		ViewUtil.insertChildView(containerView, edge, index, persisted);
		edge.setType(org.muml.reconfiguration.ui.part.ReconfigurationVisualIDRegistry
				.getType(org.muml.reconfiguration.ui.edit.parts.ReconfigurationPortAssemblyConnectorEditPart.VISUAL_ID));
		edge.setElement(domainElement);
		// initializePreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(edge,
				NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle edgeFontStyle = (FontStyle) edge
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (edgeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			edgeFontStyle.setFontName(fontData.getName());
			edgeFontStyle.setFontHeight(fontData.getHeight());
			edgeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			edgeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			edgeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		Routing routing = Routing.get(prefStore
				.getInt(IPreferenceConstants.PREF_LINE_STYLE));
		if (routing != null) {
			ViewUtil.setStructuralFeatureValue(edge,
					NotationPackage.eINSTANCE.getRoutingStyle_Routing(),
					routing);
		}
		return edge;
	}


	// copied from
	// /org.muml.pim.component.diagram/src/de/uni_paderborn/fujaba/muml/component/diagram/providers/MumlViewProvider.java
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
	// /org.muml.pim.component.diagram/src/de/uni_paderborn/fujaba/muml/component/diagram/providers/MumlViewProvider.java
	private IElementType getSemanticElementType(IAdaptable semanticAdapter) {
		if (semanticAdapter == null) {
			return null;
		}
		return (IElementType) semanticAdapter.getAdapter(IElementType.class);
	}

	// copied from
	// /org.muml.pim.component.diagram/src/de/uni_paderborn/fujaba/muml/component/diagram/providers/MumlViewProvider.java
	private void stampShortcut(View containerView, Node target) {
		if (!org.muml.pim.component.diagram.edit.parts.ModelElementCategoryEditPart.MODEL_ID
				.equals(org.muml.pim.component.diagram.part.MumlVisualIDRegistry
						.getModelID(containerView))) {
			EAnnotation shortcutAnnotation = EcoreFactory.eINSTANCE
					.createEAnnotation();
			shortcutAnnotation.setSource("Shortcut"); //$NON-NLS-1$
			shortcutAnnotation
					.getDetails()
					.put("modelID", org.muml.pim.component.diagram.edit.parts.ModelElementCategoryEditPart.MODEL_ID); //$NON-NLS-1$
			target.getEAnnotations().add(shortcutAnnotation);
		}
	}

	// copied from
	// /org.muml.pim.component.diagram/src/de/uni_paderborn/fujaba/muml/component/diagram/providers/MumlViewProvider.java
	private Node createLabel(View owner, String hint) {
		DecorationNode rv = NotationFactory.eINSTANCE.createDecorationNode();
		rv.setType(hint);
		ViewUtil.insertChildView(owner, rv, ViewUtil.APPEND, true);
		return rv;
	}

	// copied from
	// /org.muml.pim.component.diagram/src/de/uni_paderborn/fujaba/muml/component/diagram/providers/MumlViewProvider.java
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
