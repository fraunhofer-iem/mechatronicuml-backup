package org.muml.pim.pattern.diagram.navigator;

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
import org.muml.core.modelinstance.ModelElementCategory;
import org.muml.pim.pattern.CoordinationPattern;
import org.muml.pim.pattern.CoordinationPatternVariant;
import org.muml.pim.pattern.diagram.edit.parts.AbstractCoordinationSpecificationRolesEditPart;
import org.muml.pim.pattern.diagram.edit.parts.ConnectorQualityOfServiceAssumptionsEditPart;
import org.muml.pim.pattern.diagram.edit.parts.CoordinationPattern2EditPart;
import org.muml.pim.pattern.diagram.edit.parts.CoordinationPatternEditPart;
import org.muml.pim.pattern.diagram.edit.parts.CoordinationPatternNameEditPart;
import org.muml.pim.pattern.diagram.edit.parts.CoordinationPatternVariant2EditPart;
import org.muml.pim.pattern.diagram.edit.parts.CoordinationPatternVariantEditPart;
import org.muml.pim.pattern.diagram.edit.parts.CoordinationPatternVariantNameEditPart;
import org.muml.pim.pattern.diagram.edit.parts.DiscreteInteractionEndpointReceiverMessageBufferEditPart;
import org.muml.pim.pattern.diagram.edit.parts.MessageBufferEditPart;
import org.muml.pim.pattern.diagram.edit.parts.MessageBufferNameEditPart;
import org.muml.pim.pattern.diagram.edit.parts.MessageTypeEditPart;
import org.muml.pim.pattern.diagram.edit.parts.MessageTypeNameEditPart;
import org.muml.pim.pattern.diagram.edit.parts.ModelElementCategoryEditPart;
import org.muml.pim.pattern.diagram.edit.parts.ParameterEditPart;
import org.muml.pim.pattern.diagram.edit.parts.RoleConnectorConnectorQualityOfServiceAssumptionsEditPart;
import org.muml.pim.pattern.diagram.edit.parts.RoleConnectorEditPart;
import org.muml.pim.pattern.diagram.edit.parts.RoleEditPart;
import org.muml.pim.pattern.diagram.edit.parts.RoleNameEditPart;
import org.muml.pim.pattern.diagram.edit.parts.WrappingLabel2EditPart;
import org.muml.pim.pattern.diagram.edit.parts.WrappingLabel3EditPart;
import org.muml.pim.pattern.diagram.part.MumlDiagramEditorPlugin;
import org.muml.pim.pattern.diagram.part.MumlVisualIDRegistry;
import org.muml.pim.pattern.diagram.providers.CoordinationPatternParserProvider;
import org.muml.pim.pattern.diagram.providers.MumlElementTypes;
import org.muml.pim.protocol.RoleConnector;

/**
 * @generated
 */
public class MumlNavigatorLabelProvider extends LabelProvider implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		MumlDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		MumlDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof MumlNavigatorItem && !isOwnView(((MumlNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof MumlNavigatorGroup) {
			MumlNavigatorGroup group = (MumlNavigatorGroup) element;
			return MumlDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof MumlNavigatorItem) {
			MumlNavigatorItem navigatorItem = (MumlNavigatorItem) element;
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
		case ModelElementCategoryEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?http://www.muml.org/modelinstance/1.0.0?ModelElementCategory", //$NON-NLS-1$
					MumlElementTypes.ModelElementCategory_1000);
		case CoordinationPatternEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.muml.org/pim/pattern/1.0.0?CoordinationPattern", //$NON-NLS-1$
					MumlElementTypes.CoordinationPattern_2001);
		case CoordinationPatternVariantEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.muml.org/pim/pattern/1.0.0?CoordinationPatternVariant", //$NON-NLS-1$
					MumlElementTypes.CoordinationPatternVariant_2002);
		case RoleEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.muml.org/pim/protocol/1.0.0?Role", MumlElementTypes.Role_3002); //$NON-NLS-1$
		case CoordinationPattern2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.muml.org/pim/pattern/1.0.0?CoordinationPattern", //$NON-NLS-1$
					MumlElementTypes.CoordinationPattern_3003);
		case MessageBufferEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.muml.org/pim/connector/1.0.0?MessageBuffer", //$NON-NLS-1$
					MumlElementTypes.MessageBuffer_3004);
		case MessageTypeEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.muml.org/pim/msgtype/1.0.0?MessageType", //$NON-NLS-1$
					MumlElementTypes.MessageType_3005);
		case ParameterEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.muml.org/pim/behavior/1.0.0?Parameter", //$NON-NLS-1$
					MumlElementTypes.Parameter_3006);
		case ConnectorQualityOfServiceAssumptionsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.muml.org/pim/protocol/1.0.0?ConnectorQualityOfServiceAssumptions", //$NON-NLS-1$
					MumlElementTypes.ConnectorQualityOfServiceAssumptions_3007);
		case CoordinationPatternVariant2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.muml.org/pim/pattern/1.0.0?CoordinationPatternVariant", //$NON-NLS-1$
					MumlElementTypes.CoordinationPatternVariant_3008);
		case RoleConnectorEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.muml.org/pim/protocol/1.0.0?RoleConnector", //$NON-NLS-1$
					MumlElementTypes.RoleConnector_4001);
		case AbstractCoordinationSpecificationRolesEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.muml.org/pim/protocol/1.0.0?AbstractCoordinationSpecification?roles", //$NON-NLS-1$
					MumlElementTypes.AbstractCoordinationSpecificationRoles_4002);
		case DiscreteInteractionEndpointReceiverMessageBufferEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.muml.org/pim/connector/1.0.0?DiscreteInteractionEndpoint?receiverMessageBuffer", //$NON-NLS-1$
					MumlElementTypes.DiscreteInteractionEndpointReceiverMessageBuffer_4003);
		case RoleConnectorConnectorQualityOfServiceAssumptionsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.muml.org/pim/protocol/1.0.0?RoleConnector?connectorQualityOfServiceAssumptions", //$NON-NLS-1$
					MumlElementTypes.RoleConnectorConnectorQualityOfServiceAssumptions_4004);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = MumlDiagramEditorPlugin.getInstance().getImageRegistry();
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
		if (element instanceof MumlNavigatorGroup) {
			MumlNavigatorGroup group = (MumlNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof MumlNavigatorItem) {
			MumlNavigatorItem navigatorItem = (MumlNavigatorItem) element;
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
		case ModelElementCategoryEditPart.VISUAL_ID:
			return getModelElementCategory_1000Text(view);
		case CoordinationPatternEditPart.VISUAL_ID:
			return getCoordinationPattern_2001Text(view);
		case CoordinationPatternVariantEditPart.VISUAL_ID:
			return getCoordinationPatternVariant_2002Text(view);
		case RoleEditPart.VISUAL_ID:
			return getRole_3002Text(view);
		case CoordinationPattern2EditPart.VISUAL_ID:
			return getCoordinationPattern_3003Text(view);
		case MessageBufferEditPart.VISUAL_ID:
			return getMessageBuffer_3004Text(view);
		case MessageTypeEditPart.VISUAL_ID:
			return getMessageType_3005Text(view);
		case ParameterEditPart.VISUAL_ID:
			return getParameter_3006Text(view);
		case ConnectorQualityOfServiceAssumptionsEditPart.VISUAL_ID:
			return getConnectorQualityOfServiceAssumptions_3007Text(view);
		case CoordinationPatternVariant2EditPart.VISUAL_ID:
			return getCoordinationPatternVariant_3008Text(view);
		case RoleConnectorEditPart.VISUAL_ID:
			return getRoleConnector_4001Text(view);
		case AbstractCoordinationSpecificationRolesEditPart.VISUAL_ID:
			return getAbstractCoordinationSpecificationRoles_4002Text(view);
		case DiscreteInteractionEndpointReceiverMessageBufferEditPart.VISUAL_ID:
			return getDiscreteInteractionEndpointReceiverMessageBuffer_4003Text(view);
		case RoleConnectorConnectorQualityOfServiceAssumptionsEditPart.VISUAL_ID:
			return getRoleConnectorConnectorQualityOfServiceAssumptions_4004Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getModelElementCategory_1000Text(View view) {
		ModelElementCategory domainModelElement = (ModelElementCategory) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			MumlDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCoordinationPattern_2001Text(View view) {
		CoordinationPattern domainModelElement = (CoordinationPattern) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			MumlDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 2001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCoordinationPatternVariant_2002Text(View view) {
		CoordinationPatternVariant domainModelElement = (CoordinationPatternVariant) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			MumlDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 2002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRole_3002Text(View view) {
		IParser parser = CoordinationPatternParserProvider.getParser(MumlElementTypes.Role_3002,
				view.getElement() != null ? view.getElement() : view,
				MumlVisualIDRegistry.getType(RoleNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MumlDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCoordinationPattern_3003Text(View view) {
		IParser parser = CoordinationPatternParserProvider.getParser(MumlElementTypes.CoordinationPattern_3003,
				view.getElement() != null ? view.getElement() : view,
				MumlVisualIDRegistry.getType(CoordinationPatternNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MumlDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMessageBuffer_3004Text(View view) {
		IParser parser = CoordinationPatternParserProvider.getParser(MumlElementTypes.MessageBuffer_3004,
				view.getElement() != null ? view.getElement() : view,
				MumlVisualIDRegistry.getType(MessageBufferNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MumlDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMessageType_3005Text(View view) {
		IParser parser = CoordinationPatternParserProvider.getParser(MumlElementTypes.MessageType_3005,
				view.getElement() != null ? view.getElement() : view,
				MumlVisualIDRegistry.getType(MessageTypeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MumlDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getParameter_3006Text(View view) {
		IParser parser = CoordinationPatternParserProvider.getParser(MumlElementTypes.Parameter_3006,
				view.getElement() != null ? view.getElement() : view,
				MumlVisualIDRegistry.getType(WrappingLabel2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MumlDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getConnectorQualityOfServiceAssumptions_3007Text(View view) {
		IParser parser = CoordinationPatternParserProvider.getParser(
				MumlElementTypes.ConnectorQualityOfServiceAssumptions_3007,
				view.getElement() != null ? view.getElement() : view,
				MumlVisualIDRegistry.getType(WrappingLabel3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MumlDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCoordinationPatternVariant_3008Text(View view) {
		IParser parser = CoordinationPatternParserProvider.getParser(MumlElementTypes.CoordinationPatternVariant_3008,
				view.getElement() != null ? view.getElement() : view,
				MumlVisualIDRegistry.getType(CoordinationPatternVariantNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MumlDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRoleConnector_4001Text(View view) {
		RoleConnector domainModelElement = (RoleConnector) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getComment();
		} else {
			MumlDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 4001); //$NON-NLS-1$
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
		return ModelElementCategoryEditPart.MODEL_ID.equals(MumlVisualIDRegistry.getModelID(view));
	}

}
