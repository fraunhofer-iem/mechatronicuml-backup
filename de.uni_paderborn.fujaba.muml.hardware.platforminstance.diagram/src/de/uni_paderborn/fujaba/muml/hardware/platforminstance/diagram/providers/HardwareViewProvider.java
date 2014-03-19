package de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers;

import java.util.ArrayList;

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
import org.eclipse.gmf.runtime.notation.Connector;
import org.eclipse.gmf.runtime.notation.DecorationNode;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.FontStyle;
import org.eclipse.gmf.runtime.notation.Location;
import org.eclipse.gmf.runtime.notation.MeasurementUnit;
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

/**
 * @generated
 */
public class HardwareViewProvider extends AbstractProvider implements
		IViewProvider {

	/**
	 * @generated
	 */
	public final boolean provides(IOperation operation) {
		if (operation instanceof CreateViewForKindOperation) {
			return provides((CreateViewForKindOperation) operation);
		}
		assert operation instanceof CreateViewOperation;
		if (operation instanceof CreateDiagramViewOperation) {
			return provides((CreateDiagramViewOperation) operation);
		} else if (operation instanceof CreateEdgeViewOperation) {
			return provides((CreateEdgeViewOperation) operation);
		} else if (operation instanceof CreateNodeViewOperation) {
			return provides((CreateNodeViewOperation) operation);
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean provides(CreateViewForKindOperation op) {
		/*
		 if (op.getViewKind() == Node.class)
		 return getNodeViewClass(op.getSemanticAdapter(), op.getContainerView(), op.getSemanticHint()) != null;
		 if (op.getViewKind() == Edge.class)
		 return getEdgeViewClass(op.getSemanticAdapter(), op.getContainerView(), op.getSemanticHint()) != null;
		 */
		return true;
	}

	/**
	 * @generated
	 */
	protected boolean provides(CreateDiagramViewOperation op) {
		return de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceConfigurationEditPart.MODEL_ID
				.equals(op.getSemanticHint())
				&& de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
						.getDiagramVisualID(getSemanticElement(op
								.getSemanticAdapter())) != -1;
	}

	/**
	 * @generated
	 */
	protected boolean provides(CreateNodeViewOperation op) {
		if (op.getContainerView() == null) {
			return false;
		}
		IElementType elementType = getSemanticElementType(op
				.getSemanticAdapter());
		EObject domainElement = getSemanticElement(op.getSemanticAdapter());
		int visualID;
		if (op.getSemanticHint() == null) {
			// Semantic hint is not specified. Can be a result of call from CanonicalEditPolicy.
			// In this situation there should be NO elementType, visualID will be determined
			// by VisualIDRegistry.getNodeVisualID() for domainElement.
			if (elementType != null || domainElement == null) {
				return false;
			}
			visualID = de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
					.getNodeVisualID(op.getContainerView(), domainElement);
		} else {
			visualID = de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
					.getVisualID(op.getSemanticHint());
			if (elementType != null) {
				if (!de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes
						.isKnownElementType(elementType)
						|| (!(elementType instanceof IHintedType))) {
					return false; // foreign element type
				}
				String elementTypeHint = ((IHintedType) elementType)
						.getSemanticHint();
				if (!op.getSemanticHint().equals(elementTypeHint)) {
					return false; // if semantic hint is specified it should be the same as in element type
				}
				if (domainElement != null
						&& visualID != de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
								.getNodeVisualID(op.getContainerView(),
										domainElement)) {
					return false; // visual id for node EClass should match visual id from element type
				}
			} else {
				if (!de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceConfigurationEditPart.MODEL_ID
						.equals(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
								.getModelID(op.getContainerView()))) {
					return false; // foreign diagram
				}
				switch (visualID) {
				case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceEditPart.VISUAL_ID:
				case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.StructuredResourceInstanceEditPart.VISUAL_ID:
				case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.CacheInstanceEditPart.VISUAL_ID:
				case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.ProgrammableLogicDeviceInstanceEditPart.VISUAL_ID:
				case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.ProcessorInstanceEditPart.VISUAL_ID:
				case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.StorageMemoryInstanceEditPart.VISUAL_ID:
				case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.ProcessingMemoryInstanceEditPart.VISUAL_ID:
				case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.BusPortInstanceEditPart.VISUAL_ID:
				case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.LinkPortInstanceEditPart.VISUAL_ID:
				case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.BusEditPart.VISUAL_ID:
				case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.BridgeEditPart.VISUAL_ID:
				case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPortPartEditPart.VISUAL_ID:
				case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.ActuatorInstanceEditPart.VISUAL_ID:
				case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.SensorInstanceEditPart.VISUAL_ID:
				case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPlatformInstance2EditPart.VISUAL_ID:
					if (domainElement == null
							|| visualID != de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
									.getNodeVisualID(op.getContainerView(),
											domainElement)) {
						return false; // visual id in semantic hint should match visual id for domain element
					}
					break;
				default:
					return false;
				}
			}
		}
		return de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceEditPart.VISUAL_ID == visualID
				|| de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.StructuredResourceInstanceEditPart.VISUAL_ID == visualID
				|| de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.CacheInstanceEditPart.VISUAL_ID == visualID
				|| de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.ProgrammableLogicDeviceInstanceEditPart.VISUAL_ID == visualID
				|| de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.ProcessorInstanceEditPart.VISUAL_ID == visualID
				|| de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.StorageMemoryInstanceEditPart.VISUAL_ID == visualID
				|| de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.ProcessingMemoryInstanceEditPart.VISUAL_ID == visualID
				|| de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.BusPortInstanceEditPart.VISUAL_ID == visualID
				|| de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.LinkPortInstanceEditPart.VISUAL_ID == visualID
				|| de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.BusEditPart.VISUAL_ID == visualID
				|| de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.BridgeEditPart.VISUAL_ID == visualID
				|| de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPlatformInstance2EditPart.VISUAL_ID == visualID
				|| de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPortPartEditPart.VISUAL_ID == visualID
				|| de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.ActuatorInstanceEditPart.VISUAL_ID == visualID
				|| de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.SensorInstanceEditPart.VISUAL_ID == visualID;
	}

	/**
	 * @generated
	 */
	protected boolean provides(CreateEdgeViewOperation op) {
		IElementType elementType = getSemanticElementType(op
				.getSemanticAdapter());
		if (!de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes
				.isKnownElementType(elementType)
				|| (!(elementType instanceof IHintedType))) {
			return false; // foreign element type
		}
		String elementTypeHint = ((IHintedType) elementType).getSemanticHint();
		if (elementTypeHint == null
				|| (op.getSemanticHint() != null && !elementTypeHint.equals(op
						.getSemanticHint()))) {
			return false; // our hint is visual id and must be specified, and it should be the same as in element type
		}
		int visualID = de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
				.getVisualID(elementTypeHint);
		EObject domainElement = getSemanticElement(op.getSemanticAdapter());
		if (domainElement != null
				&& visualID != de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
						.getLinkWithClassVisualID(domainElement)) {
			return false; // visual id for link EClass should match visual id from element type
		}
		return true;
	}

	/**
	 * @generated
	 */
	public Diagram createDiagram(IAdaptable semanticAdapter,
			String diagramKind, PreferencesHint preferencesHint) {
		Diagram diagram = NotationFactory.eINSTANCE.createDiagram();
		diagram.getStyles().add(NotationFactory.eINSTANCE.createDiagramStyle());
		diagram.setType(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceConfigurationEditPart.MODEL_ID);
		diagram.setElement(getSemanticElement(semanticAdapter));
		diagram.setMeasurementUnit(MeasurementUnit.PIXEL_LITERAL);
		return diagram;
	}

	/**
	 * @generated
	 */
	public Node createNode(IAdaptable semanticAdapter, View containerView,
			String semanticHint, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		final EObject domainElement = getSemanticElement(semanticAdapter);
		final int visualID;
		if (semanticHint == null) {
			visualID = de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		} else {
			visualID = de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
					.getVisualID(semanticHint);
		}
		switch (visualID) {
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceEditPart.VISUAL_ID:
			return createHWPlatformInstance_2001(domainElement, containerView,
					index, persisted, preferencesHint);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.StructuredResourceInstanceEditPart.VISUAL_ID:
			return createStructuredResourceInstance_3001(domainElement,
					containerView, index, persisted, preferencesHint);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.CacheInstanceEditPart.VISUAL_ID:
			return createCacheInstance_3002(domainElement, containerView,
					index, persisted, preferencesHint);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.ProgrammableLogicDeviceInstanceEditPart.VISUAL_ID:
			return createProgrammableLogicDeviceInstance_3003(domainElement,
					containerView, index, persisted, preferencesHint);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.ProcessorInstanceEditPart.VISUAL_ID:
			return createProcessorInstance_3004(domainElement, containerView,
					index, persisted, preferencesHint);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.StorageMemoryInstanceEditPart.VISUAL_ID:
			return createStorageMemoryInstance_3005(domainElement,
					containerView, index, persisted, preferencesHint);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.ProcessingMemoryInstanceEditPart.VISUAL_ID:
			return createProcessingMemoryInstance_3006(domainElement,
					containerView, index, persisted, preferencesHint);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.BusPortInstanceEditPart.VISUAL_ID:
			return createBusPortInstance_3007(domainElement, containerView,
					index, persisted, preferencesHint);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.LinkPortInstanceEditPart.VISUAL_ID:
			return createLinkPortInstance_3008(domainElement, containerView,
					index, persisted, preferencesHint);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.BusEditPart.VISUAL_ID:
			return createBus_3009(domainElement, containerView, index,
					persisted, preferencesHint);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.BridgeEditPart.VISUAL_ID:
			return createBridge_3010(domainElement, containerView, index,
					persisted, preferencesHint);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPlatformInstance2EditPart.VISUAL_ID:
			return createHWPlatformInstance_3011(domainElement, containerView,
					index, persisted, preferencesHint);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPortPartEditPart.VISUAL_ID:
			return createHWPortPart_3015(domainElement, containerView, index,
					persisted, preferencesHint);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.ActuatorInstanceEditPart.VISUAL_ID:
			return createActuatorInstance_3013(domainElement, containerView,
					index, persisted, preferencesHint);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.SensorInstanceEditPart.VISUAL_ID:
			return createSensorInstance_3014(domainElement, containerView,
					index, persisted, preferencesHint);
		}
		// can't happen, provided #provides(CreateNodeViewOperation) is correct
		return null;
	}

	/**
	 * @generated
	 */
	public Edge createEdge(IAdaptable semanticAdapter, View containerView,
			String semanticHint, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		IElementType elementType = getSemanticElementType(semanticAdapter);
		String elementTypeHint = ((IHintedType) elementType).getSemanticHint();
		switch (de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
				.getVisualID(elementTypeHint)) {
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.DelegationEditPart.VISUAL_ID:
			return createDelegation_4001(getSemanticElement(semanticAdapter),
					containerView, index, persisted, preferencesHint);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.LinkEditPart.VISUAL_ID:
			return createLink_4002(getSemanticElement(semanticAdapter),
					containerView, index, persisted, preferencesHint);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPortInstanceConnectedMediaEditPart.VISUAL_ID:
			return createHWPortInstanceConnectedMedia_4006(containerView,
					index, persisted, preferencesHint);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.CommunicationMediaConnectedBridgesEditPart.VISUAL_ID:
			return createCommunicationMediaConnectedBridges_4004(containerView,
					index, persisted, preferencesHint);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.Link2EditPart.VISUAL_ID:
			return createLink_4005(getSemanticElement(semanticAdapter),
					containerView, index, persisted, preferencesHint);
		case de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPortPartConnectedMediaEditPart.VISUAL_ID:
			return createHWPortPartConnectedMedia_4007(containerView, index,
					persisted, preferencesHint);
		}
		// can never happen, provided #provides(CreateEdgeViewOperation) is correct
		return null;
	}

	/**
	 * @generated
	 */
	public Node createHWPlatformInstance_2001(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
				.getType(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceEditPart.VISUAL_ID));
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
		Node label5034 = createLabel(
				node,
				de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
						.getType(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceNameEditPart.VISUAL_ID));
		createCompartment(
				node,
				de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
						.getType(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceHWPlatformCompartmentEditPart.VISUAL_ID),
				false, false, false, false);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createStructuredResourceInstance_3001(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
				.getType(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.StructuredResourceInstanceEditPart.VISUAL_ID));
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
		Node label5026 = createLabel(
				node,
				de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
						.getType(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.StructuredResourceInstanceNameEditPart.VISUAL_ID));
		Node label5027 = createLabel(
				node,
				de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
						.getType(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID));
		Node label5028 = createLabel(
				node,
				de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
						.getType(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID));
		createCompartment(
				node,
				de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
						.getType(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.StructuredResourceInstanceStructuredResourceCompartmentEditPart.VISUAL_ID),
				true, false, false, false);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createCacheInstance_3002(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
				.getType(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.CacheInstanceEditPart.VISUAL_ID));
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
		Node label5001 = createLabel(
				node,
				de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
						.getType(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.CacheInstanceNameEditPart.VISUAL_ID));
		Node label5002 = createLabel(
				node,
				de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
						.getType(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID));
		Node label5003 = createLabel(
				node,
				de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
						.getType(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel4EditPart.VISUAL_ID));
		Node label5004 = createLabel(
				node,
				de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
						.getType(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel5EditPart.VISUAL_ID));
		return node;
	}

	/**
	 * @generated
	 */
	public Node createProgrammableLogicDeviceInstance_3003(
			EObject domainElement, View containerView, int index,
			boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
				.getType(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.ProgrammableLogicDeviceInstanceEditPart.VISUAL_ID));
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
		Node label5005 = createLabel(
				node,
				de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
						.getType(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.ProgrammableLogicDeviceInstanceNameEditPart.VISUAL_ID));
		Node label5006 = createLabel(
				node,
				de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
						.getType(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel6EditPart.VISUAL_ID));
		Node label5007 = createLabel(
				node,
				de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
						.getType(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel7EditPart.VISUAL_ID));
		Node label5008 = createLabel(
				node,
				de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
						.getType(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel8EditPart.VISUAL_ID));
		return node;
	}

	/**
	 * @generated
	 */
	public Node createProcessorInstance_3004(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
				.getType(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.ProcessorInstanceEditPart.VISUAL_ID));
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
		Node label5009 = createLabel(
				node,
				de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
						.getType(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.ProcessorInstanceNameEditPart.VISUAL_ID));
		Node label5010 = createLabel(
				node,
				de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
						.getType(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel9EditPart.VISUAL_ID));
		Node label5011 = createLabel(
				node,
				de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
						.getType(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel10EditPart.VISUAL_ID));
		Node label5012 = createLabel(
				node,
				de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
						.getType(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel11EditPart.VISUAL_ID));
		Node label5013 = createLabel(
				node,
				de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
						.getType(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel12EditPart.VISUAL_ID));
		return node;
	}

	/**
	 * @generated
	 */
	public Node createStorageMemoryInstance_3005(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
				.getType(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.StorageMemoryInstanceEditPart.VISUAL_ID));
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
		Node label5014 = createLabel(
				node,
				de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
						.getType(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.StorageMemoryInstanceNameEditPart.VISUAL_ID));
		Node label5015 = createLabel(
				node,
				de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
						.getType(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel13EditPart.VISUAL_ID));
		Node label5016 = createLabel(
				node,
				de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
						.getType(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel14EditPart.VISUAL_ID));
		Node label5017 = createLabel(
				node,
				de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
						.getType(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel15EditPart.VISUAL_ID));
		Node label5018 = createLabel(
				node,
				de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
						.getType(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel16EditPart.VISUAL_ID));
		return node;
	}

	/**
	 * @generated
	 */
	public Node createProcessingMemoryInstance_3006(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
				.getType(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.ProcessingMemoryInstanceEditPart.VISUAL_ID));
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
		Node label5019 = createLabel(
				node,
				de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
						.getType(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.ProcessingMemoryInstanceNameEditPart.VISUAL_ID));
		Node label5020 = createLabel(
				node,
				de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
						.getType(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel17EditPart.VISUAL_ID));
		Node label5021 = createLabel(
				node,
				de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
						.getType(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel18EditPart.VISUAL_ID));
		Node label5022 = createLabel(
				node,
				de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
						.getType(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel19EditPart.VISUAL_ID));
		Node label5023 = createLabel(
				node,
				de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
						.getType(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel20EditPart.VISUAL_ID));
		return node;
	}

	/**
	 * @generated
	 */
	public Node createBusPortInstance_3007(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
				.getType(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.BusPortInstanceEditPart.VISUAL_ID));
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
		Node label5024 = createLabel(
				node,
				de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
						.getType(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPortLabelEditPart.VISUAL_ID));
		label5024.setLayoutConstraint(NotationFactory.eINSTANCE
				.createLocation());
		Location location5024 = (Location) label5024.getLayoutConstraint();
		location5024.setX(0);
		location5024.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createLinkPortInstance_3008(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
				.getType(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.LinkPortInstanceEditPart.VISUAL_ID));
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
		Node label5025 = createLabel(
				node,
				de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
						.getType(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPortLabel2EditPart.VISUAL_ID));
		label5025.setLayoutConstraint(NotationFactory.eINSTANCE
				.createLocation());
		Location location5025 = (Location) label5025.getLayoutConstraint();
		location5025.setX(0);
		location5025.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createBus_3009(EObject domainElement, View containerView,
			int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
				.getType(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.BusEditPart.VISUAL_ID));
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
		Node label5029 = createLabel(
				node,
				de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
						.getType(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel21EditPart.VISUAL_ID));
		Node label5030 = createLabel(
				node,
				de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
						.getType(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel22EditPart.VISUAL_ID));
		return node;
	}

	/**
	 * @generated
	 */
	public Node createBridge_3010(EObject domainElement, View containerView,
			int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
				.getType(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.BridgeEditPart.VISUAL_ID));
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
		Node label5031 = createLabel(
				node,
				de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
						.getType(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel23EditPart.VISUAL_ID));
		return node;
	}

	/**
	 * @generated
	 */
	public Node createHWPlatformInstance_3011(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
				.getType(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPlatformInstance2EditPart.VISUAL_ID));
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
		Node label5033 = createLabel(
				node,
				de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
						.getType(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceName2EditPart.VISUAL_ID));
		createCompartment(
				node,
				de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
						.getType(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceHWPlatformCompartment2EditPart.VISUAL_ID),
				false, false, false, false);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createHWPortPart_3015(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
				.getType(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPortPartEditPart.VISUAL_ID));
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
		Node label5041 = createLabel(
				node,
				de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
						.getType(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPortLabel3EditPart.VISUAL_ID));
		label5041.setLayoutConstraint(NotationFactory.eINSTANCE
				.createLocation());
		Location location5041 = (Location) label5041.getLayoutConstraint();
		location5041.setX(0);
		location5041.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createActuatorInstance_3013(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
				.getType(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.ActuatorInstanceEditPart.VISUAL_ID));
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
		Node label5035 = createLabel(
				node,
				de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
						.getType(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.ActuatorInstanceNameEditPart.VISUAL_ID));
		Node label5036 = createLabel(
				node,
				de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
						.getType(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel24EditPart.VISUAL_ID));
		Node label5037 = createLabel(
				node,
				de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
						.getType(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel25EditPart.VISUAL_ID));
		return node;
	}

	/**
	 * @generated
	 */
	public Node createSensorInstance_3014(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
				.getType(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.SensorInstanceEditPart.VISUAL_ID));
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
		Node label5038 = createLabel(
				node,
				de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
						.getType(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.SensorInstanceNameEditPart.VISUAL_ID));
		Node label5039 = createLabel(
				node,
				de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
						.getType(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel26EditPart.VISUAL_ID));
		Node label5040 = createLabel(
				node,
				de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
						.getType(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel27EditPart.VISUAL_ID));
		return node;
	}

	/**
	 * @generated
	 */
	public Edge createDelegation_4001(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
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
		edge.setType(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
				.getType(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.DelegationEditPart.VISUAL_ID));
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

	/**
	 * @generated
	 */
	public Edge createLink_4002(EObject domainElement, View containerView,
			int index, boolean persisted, PreferencesHint preferencesHint) {
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
		edge.setType(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
				.getType(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.LinkEditPart.VISUAL_ID));
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
		Node label6001 = createLabel(
				edge,
				de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
						.getType(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel28EditPart.VISUAL_ID));
		label6001.setLayoutConstraint(NotationFactory.eINSTANCE
				.createLocation());
		Location location6001 = (Location) label6001.getLayoutConstraint();
		location6001.setX(5);
		location6001.setY(5);
		return edge;
	}

	/**
	 * @generated
	 */
	public Edge createHWPortInstanceConnectedMedia_4006(View containerView,
			int index, boolean persisted, PreferencesHint preferencesHint) {
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
		edge.setType(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
				.getType(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPortInstanceConnectedMediaEditPart.VISUAL_ID));
		edge.setElement(null);
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

	/**
	 * @generated
	 */
	public Edge createCommunicationMediaConnectedBridges_4004(
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
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
		edge.setType(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
				.getType(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.CommunicationMediaConnectedBridgesEditPart.VISUAL_ID));
		edge.setElement(null);
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

	/**
	 * @generated
	 */
	public Edge createLink_4005(EObject domainElement, View containerView,
			int index, boolean persisted, PreferencesHint preferencesHint) {
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
		edge.setType(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
				.getType(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.Link2EditPart.VISUAL_ID));
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
		Node label6002 = createLabel(
				edge,
				de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
						.getType(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.WrappingLabel29EditPart.VISUAL_ID));
		label6002.setLayoutConstraint(NotationFactory.eINSTANCE
				.createLocation());
		Location location6002 = (Location) label6002.getLayoutConstraint();
		location6002.setX(5);
		location6002.setY(5);
		return edge;
	}

	/**
	 * @generated
	 */
	public Edge createHWPortPartConnectedMedia_4007(View containerView,
			int index, boolean persisted, PreferencesHint preferencesHint) {
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
		edge.setType(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
				.getType(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPortPartConnectedMediaEditPart.VISUAL_ID));
		edge.setElement(null);
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

	/**
	 * @generated
	 */
	private void stampShortcut(View containerView, Node target) {
		if (!de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceConfigurationEditPart.MODEL_ID
				.equals(de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
						.getModelID(containerView))) {
			EAnnotation shortcutAnnotation = EcoreFactory.eINSTANCE
					.createEAnnotation();
			shortcutAnnotation.setSource("Shortcut"); //$NON-NLS-1$
			shortcutAnnotation
					.getDetails()
					.put("modelID", de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceConfigurationEditPart.MODEL_ID); //$NON-NLS-1$
			target.getEAnnotations().add(shortcutAnnotation);
		}
	}

	/**
	 * @generated
	 */
	private Node createLabel(View owner, String hint) {
		DecorationNode rv = NotationFactory.eINSTANCE.createDecorationNode();
		rv.setType(hint);
		ViewUtil.insertChildView(owner, rv, ViewUtil.APPEND, true);
		return rv;
	}

	/**
	 * @generated
	 */
	private Node createCompartment(View owner, String hint,
			boolean canCollapse, boolean hasTitle, boolean canSort,
			boolean canFilter) {
		//SemanticListCompartment rv = NotationFactory.eINSTANCE.createSemanticListCompartment();
		//rv.setShowTitle(showTitle);
		//rv.setCollapsed(isCollapsed);
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

	/**
	 * @generated
	 */
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

	/**
	 * @generated
	 */
	private IElementType getSemanticElementType(IAdaptable semanticAdapter) {
		if (semanticAdapter == null) {
			return null;
		}
		return (IElementType) semanticAdapter.getAdapter(IElementType.class);
	}
}
