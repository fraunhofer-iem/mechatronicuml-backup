/*
 * <copyright>
 * Copyright (c) 2013 Software Engineering Group, Heinz Nixdorf Institute, University of Paderborn, Germany.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Software Engineering Group - initial API and implementation
 * </copyright>
 */
package org.muml.pim.componentinstanceconfiguration.diagram.navigator;

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
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.AssemblyConnectorInstanceEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.AtomicComponentInstance2EditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.AtomicComponentInstanceEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ComponentInstanceConfigurationDiagramEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ComponentInstanceConfigurationEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstance2EditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstanceEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstanceName2EditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstanceNameEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.CoordinationProtocolInstance2EditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.CoordinationProtocolInstanceEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.CoordinationProtocolInstancePortInstancesEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DelegationConnectorInstanceEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstance2EditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstanceEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstanceName2EditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstanceNameEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstance2EditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstance3EditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstanceEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstanceName3EditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstanceNameEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.HybridPortInstance2EditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.HybridPortInstanceEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.HybridPortInstanceName2EditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.HybridPortInstanceNameEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.StructuredComponentInstance2EditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.StructuredComponentInstanceEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.WrappingLabel2EditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.WrappingLabel3EditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.WrappingLabel4EditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.WrappingLabel5EditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.WrappingLabel6EditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.WrappingLabelEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin;
import org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry;
import org.muml.pim.componentinstanceconfiguration.diagram.providers.MumlElementTypes;
import org.muml.pim.componentinstanceconfiguration.diagram.providers.MumlParserProvider;
import org.muml.pim.instance.AssemblyConnectorInstance;
import org.muml.pim.instance.ComponentInstanceConfiguration;
import org.muml.pim.instance.DelegationConnectorInstance;
import org.muml.pim.instance.DiscreteSinglePortInstance;

/**
 * @generated
 */
public class ComponentinstanceconfigurationNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		ComponentinstanceconfigurationDiagramEditorPlugin.getInstance().getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		ComponentinstanceconfigurationDiagramEditorPlugin.getInstance().getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof ComponentinstanceconfigurationNavigatorItem
				&& !isOwnView(((ComponentinstanceconfigurationNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof ComponentinstanceconfigurationNavigatorGroup) {
			ComponentinstanceconfigurationNavigatorGroup group = (ComponentinstanceconfigurationNavigatorGroup) element;
			return ComponentinstanceconfigurationDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof ComponentinstanceconfigurationNavigatorItem) {
			ComponentinstanceconfigurationNavigatorItem navigatorItem = (ComponentinstanceconfigurationNavigatorItem) element;
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
		switch (MumlVisualIDRegistry.getVisualID(view)) {
		case ComponentInstanceConfigurationDiagramEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?http://www.muml.org/pim/instance/1.0.0?ComponentInstanceConfiguration", //$NON-NLS-1$
					MumlElementTypes.ComponentInstanceConfiguration_1000);
		case StructuredComponentInstanceEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.muml.org/pim/instance/1.0.0?StructuredComponentInstance", //$NON-NLS-1$
					MumlElementTypes.StructuredComponentInstance_2015);
		case AtomicComponentInstanceEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.muml.org/pim/instance/1.0.0?AtomicComponentInstance", //$NON-NLS-1$
					MumlElementTypes.AtomicComponentInstance_2016);
		case HybridPortInstanceEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.muml.org/pim/instance/1.0.0?HybridPortInstance", //$NON-NLS-1$
					MumlElementTypes.HybridPortInstance_2021);
		case DiscreteSinglePortInstanceEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.muml.org/pim/instance/1.0.0?DiscreteSinglePortInstance", //$NON-NLS-1$
					MumlElementTypes.DiscreteSinglePortInstance_2022);
		case DiscreteMultiPortInstanceEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.muml.org/pim/instance/1.0.0?DiscreteMultiPortInstance", //$NON-NLS-1$
					MumlElementTypes.DiscreteMultiPortInstance_2023);
		case ContinuousPortInstanceEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.muml.org/pim/instance/1.0.0?ContinuousPortInstance", //$NON-NLS-1$
					MumlElementTypes.ContinuousPortInstance_2024);
		case CoordinationProtocolInstanceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.muml.org/pim/instance/1.0.0?CoordinationProtocolInstance", //$NON-NLS-1$
					MumlElementTypes.CoordinationProtocolInstance_2025);
		case ComponentInstanceConfigurationEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.muml.org/pim/instance/1.0.0?ComponentInstanceConfiguration", //$NON-NLS-1$
					MumlElementTypes.ComponentInstanceConfiguration_3023);
		case AtomicComponentInstance2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.muml.org/pim/instance/1.0.0?AtomicComponentInstance", //$NON-NLS-1$
					MumlElementTypes.AtomicComponentInstance_3024);
		case StructuredComponentInstance2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.muml.org/pim/instance/1.0.0?StructuredComponentInstance", //$NON-NLS-1$
					MumlElementTypes.StructuredComponentInstance_3025);
		case DiscreteSinglePortInstance2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.muml.org/pim/instance/1.0.0?DiscreteSinglePortInstance", //$NON-NLS-1$
					MumlElementTypes.DiscreteSinglePortInstance_3026);
		case HybridPortInstance2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.muml.org/pim/instance/1.0.0?HybridPortInstance", //$NON-NLS-1$
					MumlElementTypes.HybridPortInstance_3031);
		case DiscreteSinglePortInstance3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.muml.org/pim/instance/1.0.0?DiscreteSinglePortInstance", //$NON-NLS-1$
					MumlElementTypes.DiscreteSinglePortInstance_3032);
		case DiscreteMultiPortInstance2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.muml.org/pim/instance/1.0.0?DiscreteMultiPortInstance", //$NON-NLS-1$
					MumlElementTypes.DiscreteMultiPortInstance_3033);
		case ContinuousPortInstance2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.muml.org/pim/instance/1.0.0?ContinuousPortInstance", //$NON-NLS-1$
					MumlElementTypes.ContinuousPortInstance_3034);
		case CoordinationProtocolInstance2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.muml.org/pim/instance/1.0.0?CoordinationProtocolInstance", //$NON-NLS-1$
					MumlElementTypes.CoordinationProtocolInstance_3035);
		case AssemblyConnectorInstanceEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.muml.org/pim/instance/1.0.0?AssemblyConnectorInstance", //$NON-NLS-1$
					MumlElementTypes.AssemblyConnectorInstance_4001);
		case DelegationConnectorInstanceEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.muml.org/pim/instance/1.0.0?DelegationConnectorInstance", //$NON-NLS-1$
					MumlElementTypes.DelegationConnectorInstance_4002);
		case CoordinationProtocolInstancePortInstancesEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.muml.org/pim/instance/1.0.0?CoordinationProtocolInstance?portInstances", //$NON-NLS-1$
					MumlElementTypes.CoordinationProtocolInstancePortInstances_4003);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = ComponentinstanceconfigurationDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && MumlElementTypes.isKnownElementType(elementType)) {
			image = MumlElementTypes.getImage(elementType);
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
		if (element instanceof ComponentinstanceconfigurationNavigatorGroup) {
			ComponentinstanceconfigurationNavigatorGroup group = (ComponentinstanceconfigurationNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof ComponentinstanceconfigurationNavigatorItem) {
			ComponentinstanceconfigurationNavigatorItem navigatorItem = (ComponentinstanceconfigurationNavigatorItem) element;
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
		switch (MumlVisualIDRegistry.getVisualID(view)) {
		case ComponentInstanceConfigurationDiagramEditPart.VISUAL_ID:
			return getComponentInstanceConfiguration_1000Text(view);
		case StructuredComponentInstanceEditPart.VISUAL_ID:
			return getStructuredComponentInstance_2015Text(view);
		case AtomicComponentInstanceEditPart.VISUAL_ID:
			return getAtomicComponentInstance_2016Text(view);
		case HybridPortInstanceEditPart.VISUAL_ID:
			return getHybridPortInstance_2021Text(view);
		case DiscreteSinglePortInstanceEditPart.VISUAL_ID:
			return getDiscreteSinglePortInstance_2022Text(view);
		case DiscreteMultiPortInstanceEditPart.VISUAL_ID:
			return getDiscreteMultiPortInstance_2023Text(view);
		case ContinuousPortInstanceEditPart.VISUAL_ID:
			return getContinuousPortInstance_2024Text(view);
		case CoordinationProtocolInstanceEditPart.VISUAL_ID:
			return getCoordinationProtocolInstance_2025Text(view);
		case ComponentInstanceConfigurationEditPart.VISUAL_ID:
			return getComponentInstanceConfiguration_3023Text(view);
		case AtomicComponentInstance2EditPart.VISUAL_ID:
			return getAtomicComponentInstance_3024Text(view);
		case StructuredComponentInstance2EditPart.VISUAL_ID:
			return getStructuredComponentInstance_3025Text(view);
		case DiscreteSinglePortInstance2EditPart.VISUAL_ID:
			return getDiscreteSinglePortInstance_3026Text(view);
		case HybridPortInstance2EditPart.VISUAL_ID:
			return getHybridPortInstance_3031Text(view);
		case DiscreteSinglePortInstance3EditPart.VISUAL_ID:
			return getDiscreteSinglePortInstance_3032Text(view);
		case DiscreteMultiPortInstance2EditPart.VISUAL_ID:
			return getDiscreteMultiPortInstance_3033Text(view);
		case ContinuousPortInstance2EditPart.VISUAL_ID:
			return getContinuousPortInstance_3034Text(view);
		case CoordinationProtocolInstance2EditPart.VISUAL_ID:
			return getCoordinationProtocolInstance_3035Text(view);
		case AssemblyConnectorInstanceEditPart.VISUAL_ID:
			return getAssemblyConnectorInstance_4001Text(view);
		case DelegationConnectorInstanceEditPart.VISUAL_ID:
			return getDelegationConnectorInstance_4002Text(view);
		case CoordinationProtocolInstancePortInstancesEditPart.VISUAL_ID:
			return getCoordinationProtocolInstancePortInstances_4003Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getComponentInstanceConfiguration_1000Text(View view) {
		ComponentInstanceConfiguration domainModelElement = (ComponentInstanceConfiguration) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			ComponentinstanceconfigurationDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStructuredComponentInstance_2015Text(View view) {
		IParser parser = MumlParserProvider.getParser(MumlElementTypes.StructuredComponentInstance_2015,
				view.getElement() != null ? view.getElement() : view,
				MumlVisualIDRegistry.getType(WrappingLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComponentinstanceconfigurationDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5026); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAtomicComponentInstance_2016Text(View view) {
		IParser parser = MumlParserProvider.getParser(MumlElementTypes.AtomicComponentInstance_2016,
				view.getElement() != null ? view.getElement() : view,
				MumlVisualIDRegistry.getType(WrappingLabel2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComponentinstanceconfigurationDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5027); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getHybridPortInstance_2021Text(View view) {
		IParser parser = MumlParserProvider.getParser(MumlElementTypes.HybridPortInstance_2021,
				view.getElement() != null ? view.getElement() : view,
				MumlVisualIDRegistry.getType(HybridPortInstanceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComponentinstanceconfigurationDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5039); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDiscreteSinglePortInstance_2022Text(View view) {
		IParser parser = MumlParserProvider.getParser(MumlElementTypes.DiscreteSinglePortInstance_2022,
				view.getElement() != null ? view.getElement() : view,
				MumlVisualIDRegistry.getType(DiscreteSinglePortInstanceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComponentinstanceconfigurationDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5040); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDiscreteMultiPortInstance_2023Text(View view) {
		IParser parser = MumlParserProvider.getParser(MumlElementTypes.DiscreteMultiPortInstance_2023,
				view.getElement() != null ? view.getElement() : view,
				MumlVisualIDRegistry.getType(DiscreteMultiPortInstanceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComponentinstanceconfigurationDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5041); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getContinuousPortInstance_2024Text(View view) {
		IParser parser = MumlParserProvider.getParser(MumlElementTypes.ContinuousPortInstance_2024,
				view.getElement() != null ? view.getElement() : view,
				MumlVisualIDRegistry.getType(ContinuousPortInstanceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComponentinstanceconfigurationDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5042); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCoordinationProtocolInstance_2025Text(View view) {
		IParser parser = MumlParserProvider.getParser(MumlElementTypes.CoordinationProtocolInstance_2025,
				view.getElement() != null ? view.getElement() : view,
				MumlVisualIDRegistry.getType(WrappingLabel5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComponentinstanceconfigurationDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5048); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getComponentInstanceConfiguration_3023Text(View view) {
		ComponentInstanceConfiguration domainModelElement = (ComponentInstanceConfiguration) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			ComponentinstanceconfigurationDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 3023); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAtomicComponentInstance_3024Text(View view) {
		IParser parser = MumlParserProvider.getParser(MumlElementTypes.AtomicComponentInstance_3024,
				view.getElement() != null ? view.getElement() : view,
				MumlVisualIDRegistry.getType(WrappingLabel3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComponentinstanceconfigurationDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5028); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStructuredComponentInstance_3025Text(View view) {
		IParser parser = MumlParserProvider.getParser(MumlElementTypes.StructuredComponentInstance_3025,
				view.getElement() != null ? view.getElement() : view,
				MumlVisualIDRegistry.getType(WrappingLabel4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComponentinstanceconfigurationDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5029); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDiscreteSinglePortInstance_3026Text(View view) {
		DiscreteSinglePortInstance domainModelElement = (DiscreteSinglePortInstance) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			ComponentinstanceconfigurationDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 3026); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getHybridPortInstance_3031Text(View view) {
		IParser parser = MumlParserProvider.getParser(MumlElementTypes.HybridPortInstance_3031,
				view.getElement() != null ? view.getElement() : view,
				MumlVisualIDRegistry.getType(HybridPortInstanceName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComponentinstanceconfigurationDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5043); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDiscreteSinglePortInstance_3032Text(View view) {
		IParser parser = MumlParserProvider.getParser(MumlElementTypes.DiscreteSinglePortInstance_3032,
				view.getElement() != null ? view.getElement() : view,
				MumlVisualIDRegistry.getType(DiscreteSinglePortInstanceName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComponentinstanceconfigurationDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5044); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDiscreteMultiPortInstance_3033Text(View view) {
		IParser parser = MumlParserProvider.getParser(MumlElementTypes.DiscreteMultiPortInstance_3033,
				view.getElement() != null ? view.getElement() : view,
				MumlVisualIDRegistry.getType(DiscreteMultiPortInstanceName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComponentinstanceconfigurationDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5045); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getContinuousPortInstance_3034Text(View view) {
		IParser parser = MumlParserProvider.getParser(MumlElementTypes.ContinuousPortInstance_3034,
				view.getElement() != null ? view.getElement() : view,
				MumlVisualIDRegistry.getType(ContinuousPortInstanceName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComponentinstanceconfigurationDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5046); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCoordinationProtocolInstance_3035Text(View view) {
		IParser parser = MumlParserProvider.getParser(MumlElementTypes.CoordinationProtocolInstance_3035,
				view.getElement() != null ? view.getElement() : view,
				MumlVisualIDRegistry.getType(WrappingLabel6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComponentinstanceconfigurationDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5047); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAssemblyConnectorInstance_4001Text(View view) {
		AssemblyConnectorInstance domainModelElement = (AssemblyConnectorInstance) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getComment();
		} else {
			ComponentinstanceconfigurationDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 4001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDelegationConnectorInstance_4002Text(View view) {
		DelegationConnectorInstance domainModelElement = (DelegationConnectorInstance) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getComment();
		} else {
			ComponentinstanceconfigurationDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 4002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCoordinationProtocolInstancePortInstances_4003Text(View view) {
		return ""; //$NON-NLS-1$
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
		return ComponentInstanceConfigurationDiagramEditPart.MODEL_ID.equals(MumlVisualIDRegistry.getModelID(view));
	}

}
