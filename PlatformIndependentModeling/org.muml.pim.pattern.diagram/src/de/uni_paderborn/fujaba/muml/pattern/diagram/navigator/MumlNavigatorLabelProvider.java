package de.uni_paderborn.fujaba.muml.pattern.diagram.navigator;

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
public class MumlNavigatorLabelProvider extends LabelProvider implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlDiagramEditorPlugin.getInstance().getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlDiagramEditorPlugin.getInstance().getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof de.uni_paderborn.fujaba.muml.pattern.diagram.navigator.MumlNavigatorItem && !isOwnView(
				((de.uni_paderborn.fujaba.muml.pattern.diagram.navigator.MumlNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof de.uni_paderborn.fujaba.muml.pattern.diagram.navigator.MumlNavigatorGroup) {
			de.uni_paderborn.fujaba.muml.pattern.diagram.navigator.MumlNavigatorGroup group = (de.uni_paderborn.fujaba.muml.pattern.diagram.navigator.MumlNavigatorGroup) element;
			return de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlDiagramEditorPlugin.getInstance()
					.getBundledImage(group.getIcon());
		}

		if (element instanceof de.uni_paderborn.fujaba.muml.pattern.diagram.navigator.MumlNavigatorItem) {
			de.uni_paderborn.fujaba.muml.pattern.diagram.navigator.MumlNavigatorItem navigatorItem = (de.uni_paderborn.fujaba.muml.pattern.diagram.navigator.MumlNavigatorItem) element;
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
		switch (de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlVisualIDRegistry.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.ModelElementCategoryEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?http://www.fujaba.de/modelinstance/0.4.0?ModelElementCategory", //$NON-NLS-1$
					de.uni_paderborn.fujaba.muml.pattern.diagram.providers.MumlElementTypes.ModelElementCategory_1000);
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.CoordinationPatternEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.fujaba.de/muml/pattern/0.3.18?CoordinationPattern", //$NON-NLS-1$
					de.uni_paderborn.fujaba.muml.pattern.diagram.providers.MumlElementTypes.CoordinationPattern_2001);
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.CoordinationPatternVariantEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.fujaba.de/muml/pattern/0.3.18?CoordinationPatternVariant", //$NON-NLS-1$
					de.uni_paderborn.fujaba.muml.pattern.diagram.providers.MumlElementTypes.CoordinationPatternVariant_2002);
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.RoleEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.fujaba.de/muml/protocol/0.4.0?Role", //$NON-NLS-1$
					de.uni_paderborn.fujaba.muml.pattern.diagram.providers.MumlElementTypes.Role_3002);
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.CoordinationPattern2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.fujaba.de/muml/pattern/0.3.18?CoordinationPattern", //$NON-NLS-1$
					de.uni_paderborn.fujaba.muml.pattern.diagram.providers.MumlElementTypes.CoordinationPattern_3003);
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.MessageBufferEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.fujaba.de/muml/connector/0.4.0?MessageBuffer", //$NON-NLS-1$
					de.uni_paderborn.fujaba.muml.pattern.diagram.providers.MumlElementTypes.MessageBuffer_3004);
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.MessageTypeEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.fujaba.de/muml/msgtype/0.4.0?MessageType", //$NON-NLS-1$
					de.uni_paderborn.fujaba.muml.pattern.diagram.providers.MumlElementTypes.MessageType_3005);
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.ParameterEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.fujaba.de/muml/behavior/0.4.0?Parameter", //$NON-NLS-1$
					de.uni_paderborn.fujaba.muml.pattern.diagram.providers.MumlElementTypes.Parameter_3006);
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.ConnectorQualityOfServiceAssumptionsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.fujaba.de/muml/protocol/0.4.0?ConnectorQualityOfServiceAssumptions", //$NON-NLS-1$
					de.uni_paderborn.fujaba.muml.pattern.diagram.providers.MumlElementTypes.ConnectorQualityOfServiceAssumptions_3007);
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.CoordinationPatternVariant2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.fujaba.de/muml/pattern/0.3.18?CoordinationPatternVariant", //$NON-NLS-1$
					de.uni_paderborn.fujaba.muml.pattern.diagram.providers.MumlElementTypes.CoordinationPatternVariant_3008);
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.fujaba.de/muml/protocol/0.4.0?RoleConnector", //$NON-NLS-1$
					de.uni_paderborn.fujaba.muml.pattern.diagram.providers.MumlElementTypes.RoleConnector_4001);
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.AbstractCoordinationSpecificationRolesEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.fujaba.de/muml/protocol/0.4.0?AbstractCoordinationSpecification?roles", //$NON-NLS-1$
					de.uni_paderborn.fujaba.muml.pattern.diagram.providers.MumlElementTypes.AbstractCoordinationSpecificationRoles_4002);
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.DiscreteInteractionEndpointReceiverMessageBufferEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.fujaba.de/muml/connector/0.4.0?DiscreteInteractionEndpoint?receiverMessageBuffer", //$NON-NLS-1$
					de.uni_paderborn.fujaba.muml.pattern.diagram.providers.MumlElementTypes.DiscreteInteractionEndpointReceiverMessageBuffer_4003);
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.RoleConnectorConnectorQualityOfServiceAssumptionsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.fujaba.de/muml/protocol/0.4.0?RoleConnector?connectorQualityOfServiceAssumptions", //$NON-NLS-1$
					de.uni_paderborn.fujaba.muml.pattern.diagram.providers.MumlElementTypes.RoleConnectorConnectorQualityOfServiceAssumptions_4004);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& de.uni_paderborn.fujaba.muml.pattern.diagram.providers.MumlElementTypes
						.isKnownElementType(elementType)) {
			image = de.uni_paderborn.fujaba.muml.pattern.diagram.providers.MumlElementTypes.getImage(elementType);
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
		if (element instanceof de.uni_paderborn.fujaba.muml.pattern.diagram.navigator.MumlNavigatorGroup) {
			de.uni_paderborn.fujaba.muml.pattern.diagram.navigator.MumlNavigatorGroup group = (de.uni_paderborn.fujaba.muml.pattern.diagram.navigator.MumlNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof de.uni_paderborn.fujaba.muml.pattern.diagram.navigator.MumlNavigatorItem) {
			de.uni_paderborn.fujaba.muml.pattern.diagram.navigator.MumlNavigatorItem navigatorItem = (de.uni_paderborn.fujaba.muml.pattern.diagram.navigator.MumlNavigatorItem) element;
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
		switch (de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlVisualIDRegistry.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.ModelElementCategoryEditPart.VISUAL_ID:
			return getModelElementCategory_1000Text(view);
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.CoordinationPatternEditPart.VISUAL_ID:
			return getCoordinationPattern_2001Text(view);
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.CoordinationPatternVariantEditPart.VISUAL_ID:
			return getCoordinationPatternVariant_2002Text(view);
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.RoleEditPart.VISUAL_ID:
			return getRole_3002Text(view);
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.CoordinationPattern2EditPart.VISUAL_ID:
			return getCoordinationPattern_3003Text(view);
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.MessageBufferEditPart.VISUAL_ID:
			return getMessageBuffer_3004Text(view);
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.MessageTypeEditPart.VISUAL_ID:
			return getMessageType_3005Text(view);
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.ParameterEditPart.VISUAL_ID:
			return getParameter_3006Text(view);
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.ConnectorQualityOfServiceAssumptionsEditPart.VISUAL_ID:
			return getConnectorQualityOfServiceAssumptions_3007Text(view);
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.CoordinationPatternVariant2EditPart.VISUAL_ID:
			return getCoordinationPatternVariant_3008Text(view);
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID:
			return getRoleConnector_4001Text(view);
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.AbstractCoordinationSpecificationRolesEditPart.VISUAL_ID:
			return getAbstractCoordinationSpecificationRoles_4002Text(view);
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.DiscreteInteractionEndpointReceiverMessageBufferEditPart.VISUAL_ID:
			return getDiscreteInteractionEndpointReceiverMessageBuffer_4003Text(view);
		case de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.RoleConnectorConnectorQualityOfServiceAssumptionsEditPart.VISUAL_ID:
			return getRoleConnectorConnectorQualityOfServiceAssumptions_4004Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getModelElementCategory_1000Text(View view) {
		org.muml.core.modelinstance.ModelElementCategory domainModelElement = (org.muml.core.modelinstance.ModelElementCategory) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCoordinationPattern_2001Text(View view) {
		de.uni_paderborn.fujaba.muml.pattern.CoordinationPattern domainModelElement = (de.uni_paderborn.fujaba.muml.pattern.CoordinationPattern) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 2001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCoordinationPatternVariant_2002Text(View view) {
		de.uni_paderborn.fujaba.muml.pattern.CoordinationPatternVariant domainModelElement = (de.uni_paderborn.fujaba.muml.pattern.CoordinationPatternVariant) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 2002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRole_3002Text(View view) {
		IParser parser = de.uni_paderborn.fujaba.muml.pattern.diagram.providers.CoordinationPatternParserProvider
				.getParser(de.uni_paderborn.fujaba.muml.pattern.diagram.providers.MumlElementTypes.Role_3002,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlVisualIDRegistry.getType(
								de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.RoleNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCoordinationPattern_3003Text(View view) {
		IParser parser = de.uni_paderborn.fujaba.muml.pattern.diagram.providers.CoordinationPatternParserProvider
				.getParser(
						de.uni_paderborn.fujaba.muml.pattern.diagram.providers.MumlElementTypes.CoordinationPattern_3003,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlVisualIDRegistry.getType(
								de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.CoordinationPatternNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMessageBuffer_3004Text(View view) {
		IParser parser = de.uni_paderborn.fujaba.muml.pattern.diagram.providers.CoordinationPatternParserProvider
				.getParser(de.uni_paderborn.fujaba.muml.pattern.diagram.providers.MumlElementTypes.MessageBuffer_3004,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlVisualIDRegistry.getType(
								de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.MessageBufferNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMessageType_3005Text(View view) {
		IParser parser = de.uni_paderborn.fujaba.muml.pattern.diagram.providers.CoordinationPatternParserProvider
				.getParser(de.uni_paderborn.fujaba.muml.pattern.diagram.providers.MumlElementTypes.MessageType_3005,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlVisualIDRegistry.getType(
								de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.MessageTypeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getParameter_3006Text(View view) {
		IParser parser = de.uni_paderborn.fujaba.muml.pattern.diagram.providers.CoordinationPatternParserProvider
				.getParser(de.uni_paderborn.fujaba.muml.pattern.diagram.providers.MumlElementTypes.Parameter_3006,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlVisualIDRegistry.getType(
								de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getConnectorQualityOfServiceAssumptions_3007Text(View view) {
		IParser parser = de.uni_paderborn.fujaba.muml.pattern.diagram.providers.CoordinationPatternParserProvider
				.getParser(
						de.uni_paderborn.fujaba.muml.pattern.diagram.providers.MumlElementTypes.ConnectorQualityOfServiceAssumptions_3007,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlVisualIDRegistry.getType(
								de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCoordinationPatternVariant_3008Text(View view) {
		IParser parser = de.uni_paderborn.fujaba.muml.pattern.diagram.providers.CoordinationPatternParserProvider
				.getParser(
						de.uni_paderborn.fujaba.muml.pattern.diagram.providers.MumlElementTypes.CoordinationPatternVariant_3008,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlVisualIDRegistry.getType(
								de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.CoordinationPatternVariantNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRoleConnector_4001Text(View view) {
		de.uni_paderborn.fujaba.muml.protocol.RoleConnector domainModelElement = (de.uni_paderborn.fujaba.muml.protocol.RoleConnector) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getComment();
		} else {
			de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 4001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAbstractCoordinationSpecificationRoles_4002Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getDiscreteInteractionEndpointReceiverMessageBuffer_4003Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getRoleConnectorConnectorQualityOfServiceAssumptions_4004Text(View view) {
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
		return de.uni_paderborn.fujaba.muml.pattern.diagram.edit.parts.ModelElementCategoryEditPart.MODEL_ID
				.equals(de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlVisualIDRegistry.getModelID(view));
	}

}
