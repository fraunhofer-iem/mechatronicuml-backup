package de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.navigator;

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
		de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorItem
				&& !isOwnView(((de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorItem) element)
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
		if (element instanceof de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorGroup) {
			de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorGroup group = (de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorGroup) element;
			return de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
					.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorItem) {
			de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorItem navigatorItem = (de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorItem) element;
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
		switch (de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.edit.parts.AssemblyInstanceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///de/uni_paderborn/fujaba/umlrt/model/instance?AssemblyInstance", de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.providers.ComponentinstanceconfigurationElementTypes.AssemblyInstance_4001); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.edit.parts.ComponentInstanceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///de/uni_paderborn/fujaba/umlrt/model/instance?ComponentInstance", de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.providers.ComponentinstanceconfigurationElementTypes.ComponentInstance_2002); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.edit.parts.ComponentInstanceConfigurationDiagramEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http:///de/uni_paderborn/fujaba/umlrt/componentinstanceconfiguration?ComponentInstanceConfiguration", de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.providers.ComponentinstanceconfigurationElementTypes.ComponentInstanceConfiguration_1000); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.edit.parts.ComponentInstance2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///de/uni_paderborn/fujaba/umlrt/model/instance?ComponentInstance", de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.providers.ComponentinstanceconfigurationElementTypes.ComponentInstance_3003); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.edit.parts.DelegationInstanceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///de/uni_paderborn/fujaba/umlrt/model/instance?DelegationInstance", de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.providers.ComponentinstanceconfigurationElementTypes.DelegationInstance_4002); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.edit.parts.PortInstanceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///de/uni_paderborn/fujaba/umlrt/model/instance?PortInstance", de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.providers.ComponentinstanceconfigurationElementTypes.PortInstance_3001); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.providers.ComponentinstanceconfigurationElementTypes
						.isKnownElementType(elementType)) {
			image = de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.providers.ComponentinstanceconfigurationElementTypes
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
		if (element instanceof de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorGroup) {
			de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorGroup group = (de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorItem) {
			de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorItem navigatorItem = (de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.navigator.ComponentinstanceconfigurationNavigatorItem) element;
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
		switch (de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.edit.parts.AssemblyInstanceEditPart.VISUAL_ID:
			return getAssemblyInstance_4001Text(view);
		case de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.edit.parts.ComponentInstanceEditPart.VISUAL_ID:
			return getComponentInstance_2002Text(view);
		case de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.edit.parts.ComponentInstanceConfigurationDiagramEditPart.VISUAL_ID:
			return getComponentInstanceConfiguration_1000Text(view);
		case de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.edit.parts.ComponentInstance2EditPart.VISUAL_ID:
			return getComponentInstance_3003Text(view);
		case de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.edit.parts.DelegationInstanceEditPart.VISUAL_ID:
			return getDelegationInstance_4002Text(view);
		case de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.edit.parts.PortInstanceEditPart.VISUAL_ID:
			return getPortInstance_3001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getAssemblyInstance_4001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getComponentInstanceConfiguration_1000Text(View view) {
		de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.ComponentInstanceConfiguration domainModelElement = (de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.ComponentInstanceConfiguration) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDelegationInstance_4002Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getComponentInstance_2002Text(View view) {
		IParser parser = de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.providers.ComponentinstanceconfigurationParserProvider
				.getParser(
						de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.providers.ComponentinstanceconfigurationElementTypes.ComponentInstance_2002,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationVisualIDRegistry
								.getType(de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.edit.parts.ComponentInstanceNameComponentNameDeriveEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getComponentInstance_3003Text(View view) {
		IParser parser = de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.providers.ComponentinstanceconfigurationParserProvider
				.getParser(
						de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.providers.ComponentinstanceconfigurationElementTypes.ComponentInstance_3003,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationVisualIDRegistry
								.getType(de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.edit.parts.ComponentInstanceNameComponentNameDerive2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPortInstance_3001Text(View view) {
		de.uni_paderborn.fujaba.umlrt.model.instance.PortInstance domainModelElement = (de.uni_paderborn.fujaba.umlrt.model.instance.PortInstance) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 3001); //$NON-NLS-1$
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
		return de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.edit.parts.ComponentInstanceConfigurationDiagramEditPart.MODEL_ID
				.equals(de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationVisualIDRegistry
						.getModelID(view));
	}

}
