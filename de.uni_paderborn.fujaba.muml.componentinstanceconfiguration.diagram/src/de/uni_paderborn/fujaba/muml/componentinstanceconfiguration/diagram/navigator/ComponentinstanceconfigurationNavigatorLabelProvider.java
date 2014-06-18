package de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class ComponentinstanceconfigurationNavigatorLabelProvider extends
		LabelProvider implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorItem
				&& !isOwnView(((de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorItem) element)
						.getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorGroup) {
			de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorGroup group = (de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorGroup) element;
			return de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
					.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorItem) {
			de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorItem navigatorItem = (de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.ComponentInstanceConfigurationDiagramEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://www.fujaba.de/muml/instance/0.4.0?ComponentInstanceConfiguration", de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.ComponentInstanceConfiguration_1000); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.StructuredComponentInstanceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.fujaba.de/muml/instance/0.4.0?StructuredComponentInstance", de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.StructuredComponentInstance_2015); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.AtomicComponentInstanceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.fujaba.de/muml/instance/0.4.0?AtomicComponentInstance", de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.AtomicComponentInstance_2016); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.HybridPortInstanceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.fujaba.de/muml/instance/0.4.0?HybridPortInstance", de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.HybridPortInstance_2021); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstanceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.fujaba.de/muml/instance/0.4.0?DiscreteSinglePortInstance", de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.DiscreteSinglePortInstance_2022); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstanceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.fujaba.de/muml/instance/0.4.0?DiscreteMultiPortInstance", de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.DiscreteMultiPortInstance_2023); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstanceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.fujaba.de/muml/instance/0.4.0?ContinuousPortInstance", de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.ContinuousPortInstance_2024); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.CoordinationProtocolInstanceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.fujaba.de/muml/instance/0.4.0?CoordinationProtocolInstance", de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.CoordinationProtocolInstance_2025); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.ComponentInstanceConfigurationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.fujaba.de/muml/instance/0.4.0?ComponentInstanceConfiguration", de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.ComponentInstanceConfiguration_3023); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.AtomicComponentInstance2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.fujaba.de/muml/instance/0.4.0?AtomicComponentInstance", de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.AtomicComponentInstance_3024); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.StructuredComponentInstance2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.fujaba.de/muml/instance/0.4.0?StructuredComponentInstance", de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.StructuredComponentInstance_3025); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstance2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.fujaba.de/muml/instance/0.4.0?DiscreteSinglePortInstance", de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.DiscreteSinglePortInstance_3026); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.HybridPortInstance2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.fujaba.de/muml/instance/0.4.0?HybridPortInstance", de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.HybridPortInstance_3031); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstance3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.fujaba.de/muml/instance/0.4.0?DiscreteSinglePortInstance", de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.DiscreteSinglePortInstance_3032); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstance2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.fujaba.de/muml/instance/0.4.0?DiscreteMultiPortInstance", de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.DiscreteMultiPortInstance_3033); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstance2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.fujaba.de/muml/instance/0.4.0?ContinuousPortInstance", de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.ContinuousPortInstance_3034); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.CoordinationProtocolInstance2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.fujaba.de/muml/instance/0.4.0?CoordinationProtocolInstance", de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.CoordinationProtocolInstance_3035); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.AssemblyConnectorInstanceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.fujaba.de/muml/instance/0.4.0?AssemblyConnectorInstance", de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.AssemblyConnectorInstance_4001); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.DelegationConnectorInstanceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.fujaba.de/muml/instance/0.4.0?DelegationConnectorInstance", de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.DelegationConnectorInstance_4002); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.CoordinationProtocolInstancePortInstancesEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.fujaba.de/muml/instance/0.4.0?CoordinationProtocolInstance?portInstances", de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.CoordinationProtocolInstancePortInstances_4003); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes
						.isKnownElementType(elementType)) {
			image = de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes
					.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorGroup) {
			de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorGroup group = (de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorItem) {
			de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorItem navigatorItem = (de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.ComponentInstanceConfigurationDiagramEditPart.VISUAL_ID:
			return getComponentInstanceConfiguration_1000Text(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.StructuredComponentInstanceEditPart.VISUAL_ID:
			return getStructuredComponentInstance_2015Text(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.AtomicComponentInstanceEditPart.VISUAL_ID:
			return getAtomicComponentInstance_2016Text(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.HybridPortInstanceEditPart.VISUAL_ID:
			return getHybridPortInstance_2021Text(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstanceEditPart.VISUAL_ID:
			return getDiscreteSinglePortInstance_2022Text(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstanceEditPart.VISUAL_ID:
			return getDiscreteMultiPortInstance_2023Text(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstanceEditPart.VISUAL_ID:
			return getContinuousPortInstance_2024Text(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.CoordinationProtocolInstanceEditPart.VISUAL_ID:
			return getCoordinationProtocolInstance_2025Text(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.ComponentInstanceConfigurationEditPart.VISUAL_ID:
			return getComponentInstanceConfiguration_3023Text(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.AtomicComponentInstance2EditPart.VISUAL_ID:
			return getAtomicComponentInstance_3024Text(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.StructuredComponentInstance2EditPart.VISUAL_ID:
			return getStructuredComponentInstance_3025Text(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstance2EditPart.VISUAL_ID:
			return getDiscreteSinglePortInstance_3026Text(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.HybridPortInstance2EditPart.VISUAL_ID:
			return getHybridPortInstance_3031Text(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstance3EditPart.VISUAL_ID:
			return getDiscreteSinglePortInstance_3032Text(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstance2EditPart.VISUAL_ID:
			return getDiscreteMultiPortInstance_3033Text(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstance2EditPart.VISUAL_ID:
			return getContinuousPortInstance_3034Text(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.CoordinationProtocolInstance2EditPart.VISUAL_ID:
			return getCoordinationProtocolInstance_3035Text(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.AssemblyConnectorInstanceEditPart.VISUAL_ID:
			return getAssemblyConnectorInstance_4001Text(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.DelegationConnectorInstanceEditPart.VISUAL_ID:
			return getDelegationConnectorInstance_4002Text(view);
		case de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.CoordinationProtocolInstancePortInstancesEditPart.VISUAL_ID:
			return getCoordinationProtocolInstancePortInstances_4003Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getDiscreteMultiPortInstance_3033Text(View view) {
		IParser parser = de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlParserProvider
				.getParser(
						de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.DiscreteMultiPortInstance_3033,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
								.getType(de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstanceName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5045); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDiscreteSinglePortInstance_3032Text(View view) {
		IParser parser = de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlParserProvider
				.getParser(
						de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.DiscreteSinglePortInstance_3032,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
								.getType(de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstanceName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5044); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAtomicComponentInstance_2016Text(View view) {
		IParser parser = de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlParserProvider
				.getParser(
						de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.AtomicComponentInstance_2016,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
								.getType(de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5027); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getHybridPortInstance_2021Text(View view) {
		IParser parser = de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlParserProvider
				.getParser(
						de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.HybridPortInstance_2021,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
								.getType(de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.HybridPortInstanceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5039); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDelegationConnectorInstance_4002Text(View view) {
		de.uni_paderborn.fujaba.muml.instance.DelegationConnectorInstance domainModelElement = (de.uni_paderborn.fujaba.muml.instance.DelegationConnectorInstance) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getComment();
		} else {
			de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 4002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCoordinationProtocolInstancePortInstances_4003Text(
			View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getAtomicComponentInstance_3024Text(View view) {
		IParser parser = de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlParserProvider
				.getParser(
						de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.AtomicComponentInstance_3024,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
								.getType(de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5028); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getContinuousPortInstance_2024Text(View view) {
		IParser parser = de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlParserProvider
				.getParser(
						de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.ContinuousPortInstance_2024,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
								.getType(de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstanceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5042); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCoordinationProtocolInstance_2025Text(View view) {
		IParser parser = de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlParserProvider
				.getParser(
						de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.CoordinationProtocolInstance_2025,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
								.getType(de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.WrappingLabel5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5048); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAssemblyConnectorInstance_4001Text(View view) {
		de.uni_paderborn.fujaba.muml.instance.AssemblyConnectorInstance domainModelElement = (de.uni_paderborn.fujaba.muml.instance.AssemblyConnectorInstance) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getComment();
		} else {
			de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 4001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDiscreteMultiPortInstance_2023Text(View view) {
		IParser parser = de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlParserProvider
				.getParser(
						de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.DiscreteMultiPortInstance_2023,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
								.getType(de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstanceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5041); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getComponentInstanceConfiguration_3023Text(View view) {
		de.uni_paderborn.fujaba.muml.instance.ComponentInstanceConfiguration domainModelElement = (de.uni_paderborn.fujaba.muml.instance.ComponentInstanceConfiguration) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 3023); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDiscreteSinglePortInstance_2022Text(View view) {
		IParser parser = de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlParserProvider
				.getParser(
						de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.DiscreteSinglePortInstance_2022,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
								.getType(de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstanceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5040); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getHybridPortInstance_3031Text(View view) {
		IParser parser = de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlParserProvider
				.getParser(
						de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.HybridPortInstance_3031,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
								.getType(de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.HybridPortInstanceName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5043); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStructuredComponentInstance_2015Text(View view) {
		IParser parser = de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlParserProvider
				.getParser(
						de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.StructuredComponentInstance_2015,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
								.getType(de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5026); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDiscreteSinglePortInstance_3026Text(View view) {
		de.uni_paderborn.fujaba.muml.instance.DiscreteSinglePortInstance domainModelElement = (de.uni_paderborn.fujaba.muml.instance.DiscreteSinglePortInstance) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 3026); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStructuredComponentInstance_3025Text(View view) {
		IParser parser = de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlParserProvider
				.getParser(
						de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.StructuredComponentInstance_3025,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
								.getType(de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.WrappingLabel4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5029); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getContinuousPortInstance_3034Text(View view) {
		IParser parser = de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlParserProvider
				.getParser(
						de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.ContinuousPortInstance_3034,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
								.getType(de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstanceName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5046); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCoordinationProtocolInstance_3035Text(View view) {
		IParser parser = de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlParserProvider
				.getParser(
						de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.providers.MumlElementTypes.CoordinationProtocolInstance_3035,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
								.getType(de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.WrappingLabel6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5047); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getComponentInstanceConfiguration_1000Text(View view) {
		de.uni_paderborn.fujaba.muml.instance.ComponentInstanceConfiguration domainModelElement = (de.uni_paderborn.fujaba.muml.instance.ComponentInstanceConfiguration) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.edit.parts.ComponentInstanceConfigurationDiagramEditPart.MODEL_ID
				.equals(de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
						.getModelID(view));
	}

}
