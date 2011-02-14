package structuredcomponenteditor.diagram.navigator;

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

import structuredcomponenteditor.diagram.edit.parts.AssemblyEditPart;
import structuredcomponenteditor.diagram.edit.parts.ComponentPartEditPart;
import structuredcomponenteditor.diagram.edit.parts.DelegationEditPart;
import structuredcomponenteditor.diagram.edit.parts.Port2EditPart;
import structuredcomponenteditor.diagram.edit.parts.PortEditPart;
import structuredcomponenteditor.diagram.edit.parts.StructuredComponentDiagramEditPart;
import structuredcomponenteditor.diagram.edit.parts.StructuredComponentEditPart;
import structuredcomponenteditor.diagram.edit.parts.StructuredComponentNameEditPart;
import structuredcomponenteditor.diagram.part.StructuredcomponentDiagramEditorPlugin;
import structuredcomponenteditor.diagram.part.StructuredcomponentVisualIDRegistry;
import structuredcomponenteditor.diagram.providers.StructuredcomponentElementTypes;
import structuredcomponenteditor.diagram.providers.StructuredcomponentParserProvider;

/**
 * @generated
 */
public class StructuredcomponentNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		StructuredcomponentDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		StructuredcomponentDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof StructuredcomponentNavigatorItem
				&& !isOwnView(((StructuredcomponentNavigatorItem) element)
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
		if (element instanceof StructuredcomponentNavigatorGroup) {
			StructuredcomponentNavigatorGroup group = (StructuredcomponentNavigatorGroup) element;
			return StructuredcomponentDiagramEditorPlugin.getInstance()
					.getBundledImage(group.getIcon());
		}

		if (element instanceof StructuredcomponentNavigatorItem) {
			StructuredcomponentNavigatorItem navigatorItem = (StructuredcomponentNavigatorItem) element;
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
		switch (StructuredcomponentVisualIDRegistry.getVisualID(view)) {
		case ComponentPartEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///de/uni_paderborn/fujaba/umlrt/emf/model/component?ComponentPart", StructuredcomponentElementTypes.ComponentPart_3002); //$NON-NLS-1$
		case StructuredComponentDiagramEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://structuredcomponenteditor?StructuredComponentDiagram", StructuredcomponentElementTypes.StructuredComponentDiagram_1000); //$NON-NLS-1$
		case StructuredComponentEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///de/uni_paderborn/fujaba/umlrt/emf/model/component?StructuredComponent", StructuredcomponentElementTypes.StructuredComponent_2001); //$NON-NLS-1$
		case Port2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///de/uni_paderborn/fujaba/umlrt/emf/model/component?Port", StructuredcomponentElementTypes.Port_3003); //$NON-NLS-1$
		case PortEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///de/uni_paderborn/fujaba/umlrt/emf/model/component?Port", StructuredcomponentElementTypes.Port_3001); //$NON-NLS-1$
		case AssemblyEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///de/uni_paderborn/fujaba/umlrt/emf/model/component?Assembly", StructuredcomponentElementTypes.Assembly_4002); //$NON-NLS-1$
		case DelegationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///de/uni_paderborn/fujaba/umlrt/emf/model/component?Delegation", StructuredcomponentElementTypes.Delegation_4001); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = StructuredcomponentDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& StructuredcomponentElementTypes
						.isKnownElementType(elementType)) {
			image = StructuredcomponentElementTypes.getImage(elementType);
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
		if (element instanceof StructuredcomponentNavigatorGroup) {
			StructuredcomponentNavigatorGroup group = (StructuredcomponentNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof StructuredcomponentNavigatorItem) {
			StructuredcomponentNavigatorItem navigatorItem = (StructuredcomponentNavigatorItem) element;
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
		switch (StructuredcomponentVisualIDRegistry.getVisualID(view)) {
		case ComponentPartEditPart.VISUAL_ID:
			return getComponentPart_3002Text(view);
		case StructuredComponentDiagramEditPart.VISUAL_ID:
			return getStructuredComponentDiagram_1000Text(view);
		case StructuredComponentEditPart.VISUAL_ID:
			return getStructuredComponent_2001Text(view);
		case Port2EditPart.VISUAL_ID:
			return getPort_3003Text(view);
		case PortEditPart.VISUAL_ID:
			return getPort_3001Text(view);
		case AssemblyEditPart.VISUAL_ID:
			return getAssembly_4002Text(view);
		case DelegationEditPart.VISUAL_ID:
			return getDelegation_4001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getComponentPart_3002Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getStructuredComponentDiagram_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getStructuredComponent_2001Text(View view) {
		IParser parser = StructuredcomponentParserProvider.getParser(
				StructuredcomponentElementTypes.StructuredComponent_2001, view
						.getElement() != null ? view.getElement() : view,
				StructuredcomponentVisualIDRegistry
						.getType(StructuredComponentNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			StructuredcomponentDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPort_3003Text(View view) {
		de.uni_paderborn.fujaba.umlrt.model.component.Port domainModelElement = (de.uni_paderborn.fujaba.umlrt.model.component.Port) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			StructuredcomponentDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPort_3001Text(View view) {
		de.uni_paderborn.fujaba.umlrt.model.component.Port domainModelElement = (de.uni_paderborn.fujaba.umlrt.model.component.Port) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			StructuredcomponentDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAssembly_4002Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getDelegation_4001Text(View view) {
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
		return StructuredComponentDiagramEditPart.MODEL_ID
				.equals(StructuredcomponentVisualIDRegistry.getModelID(view));
	}

}
