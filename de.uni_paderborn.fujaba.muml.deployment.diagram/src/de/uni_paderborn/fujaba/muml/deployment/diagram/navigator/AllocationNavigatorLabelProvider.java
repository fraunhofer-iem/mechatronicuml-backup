package de.uni_paderborn.fujaba.muml.deployment.diagram.navigator;

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
public class AllocationNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		de.uni_paderborn.fujaba.muml.deployment.diagram.part.AllocationDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		de.uni_paderborn.fujaba.muml.deployment.diagram.part.AllocationDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof de.uni_paderborn.fujaba.muml.deployment.diagram.navigator.AllocationNavigatorItem
				&& !isOwnView(((de.uni_paderborn.fujaba.muml.deployment.diagram.navigator.AllocationNavigatorItem) element)
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
		if (element instanceof de.uni_paderborn.fujaba.muml.deployment.diagram.navigator.AllocationNavigatorGroup) {
			de.uni_paderborn.fujaba.muml.deployment.diagram.navigator.AllocationNavigatorGroup group = (de.uni_paderborn.fujaba.muml.deployment.diagram.navigator.AllocationNavigatorGroup) element;
			return de.uni_paderborn.fujaba.muml.deployment.diagram.part.AllocationDiagramEditorPlugin
					.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof de.uni_paderborn.fujaba.muml.deployment.diagram.navigator.AllocationNavigatorItem) {
			de.uni_paderborn.fujaba.muml.deployment.diagram.navigator.AllocationNavigatorItem navigatorItem = (de.uni_paderborn.fujaba.muml.deployment.diagram.navigator.AllocationNavigatorItem) element;
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
		switch (de.uni_paderborn.fujaba.muml.deployment.diagram.part.AllocationVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.CommunicationLinkEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.fujaba.de/muml/deployment/0.3.11?CommunicationLink", de.uni_paderborn.fujaba.muml.deployment.diagram.providers.AllocationElementTypes.CommunicationLink_4003); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.HardwarePortEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.fujaba.de/muml/deployment/0.3.11?HardwarePort", de.uni_paderborn.fujaba.muml.deployment.diagram.providers.AllocationElementTypes.HardwarePort_3003); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.DeploymentEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://www.fujaba.de/muml/deployment/0.3.11?Deployment", de.uni_paderborn.fujaba.muml.deployment.diagram.providers.AllocationElementTypes.Deployment_1000); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.HardwareNodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.fujaba.de/muml/deployment/0.3.11?HardwareNode", de.uni_paderborn.fujaba.muml.deployment.diagram.providers.AllocationElementTypes.HardwareNode_2003); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = de.uni_paderborn.fujaba.muml.deployment.diagram.part.AllocationDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& de.uni_paderborn.fujaba.muml.deployment.diagram.providers.AllocationElementTypes
						.isKnownElementType(elementType)) {
			image = de.uni_paderborn.fujaba.muml.deployment.diagram.providers.AllocationElementTypes
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
		if (element instanceof de.uni_paderborn.fujaba.muml.deployment.diagram.navigator.AllocationNavigatorGroup) {
			de.uni_paderborn.fujaba.muml.deployment.diagram.navigator.AllocationNavigatorGroup group = (de.uni_paderborn.fujaba.muml.deployment.diagram.navigator.AllocationNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof de.uni_paderborn.fujaba.muml.deployment.diagram.navigator.AllocationNavigatorItem) {
			de.uni_paderborn.fujaba.muml.deployment.diagram.navigator.AllocationNavigatorItem navigatorItem = (de.uni_paderborn.fujaba.muml.deployment.diagram.navigator.AllocationNavigatorItem) element;
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
		switch (de.uni_paderborn.fujaba.muml.deployment.diagram.part.AllocationVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.CommunicationLinkEditPart.VISUAL_ID:
			return getCommunicationLink_4003Text(view);
		case de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.HardwarePortEditPart.VISUAL_ID:
			return getHardwarePort_3003Text(view);
		case de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.DeploymentEditPart.VISUAL_ID:
			return getDeployment_1000Text(view);
		case de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.HardwareNodeEditPart.VISUAL_ID:
			return getHardwareNode_2003Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getHardwarePort_3003Text(View view) {
		IParser parser = de.uni_paderborn.fujaba.muml.deployment.diagram.providers.AllocationParserProvider
				.getParser(
						de.uni_paderborn.fujaba.muml.deployment.diagram.providers.AllocationElementTypes.HardwarePort_3003,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.muml.deployment.diagram.part.AllocationVisualIDRegistry
								.getType(de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.HardwarePortNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.muml.deployment.diagram.part.AllocationDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDeployment_1000Text(View view) {
		de.uni_paderborn.fujaba.muml.psm.deployment.Deployment domainModelElement = (de.uni_paderborn.fujaba.muml.psm.deployment.Deployment) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			de.uni_paderborn.fujaba.muml.deployment.diagram.part.AllocationDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCommunicationLink_4003Text(View view) {
		de.uni_paderborn.fujaba.muml.psm.deployment.CommunicationLink domainModelElement = (de.uni_paderborn.fujaba.muml.psm.deployment.CommunicationLink) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getComment();
		} else {
			de.uni_paderborn.fujaba.muml.deployment.diagram.part.AllocationDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 4003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getHardwareNode_2003Text(View view) {
		IParser parser = de.uni_paderborn.fujaba.muml.deployment.diagram.providers.AllocationParserProvider
				.getParser(
						de.uni_paderborn.fujaba.muml.deployment.diagram.providers.AllocationElementTypes.HardwareNode_2003,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.muml.deployment.diagram.part.AllocationVisualIDRegistry
								.getType(de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.HardwareNodeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.muml.deployment.diagram.part.AllocationDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5006); //$NON-NLS-1$
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
		return de.uni_paderborn.fujaba.muml.deployment.diagram.edit.parts.DeploymentEditPart.MODEL_ID
				.equals(de.uni_paderborn.fujaba.muml.deployment.diagram.part.AllocationVisualIDRegistry
						.getModelID(view));
	}

}
