package de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.navigator;

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
public class StructuredcomponentNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.StructuredcomponentDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.StructuredcomponentDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.navigator.StructuredcomponentNavigatorItem
				&& !isOwnView(((de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.navigator.StructuredcomponentNavigatorItem) element)
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
		if (element instanceof de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.navigator.StructuredcomponentNavigatorGroup) {
			de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.navigator.StructuredcomponentNavigatorGroup group = (de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.navigator.StructuredcomponentNavigatorGroup) element;
			return de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.StructuredcomponentDiagramEditorPlugin
					.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.navigator.StructuredcomponentNavigatorItem) {
			de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.navigator.StructuredcomponentNavigatorItem navigatorItem = (de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.navigator.StructuredcomponentNavigatorItem) element;
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
		switch (de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.PortEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///de/uni_paderborn/fujaba/muml/model/component?Port", de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.providers.MumlinstanceElementTypes.Port_3004); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.ComponentPartEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///de/uni_paderborn/fujaba/muml/model/component?ComponentPart", de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.providers.MumlinstanceElementTypes.ComponentPart_3005); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.StructuredComponentEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///de/uni_paderborn/fujaba/muml/model/component?StructuredComponent", de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.providers.MumlinstanceElementTypes.StructuredComponent_2002); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.Port2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///de/uni_paderborn/fujaba/muml/model/component?Port", de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.providers.MumlinstanceElementTypes.Port_3006); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.AssemblyEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///de/uni_paderborn/fujaba/muml/model/component?Assembly", de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.providers.MumlinstanceElementTypes.Assembly_4004); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.StructuredComponentDiagramEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http:///de/uni_paderborn/fujaba/umlrt/modelinstance?ModelElementCategory", de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.providers.MumlinstanceElementTypes.ModelElementCategory_1000); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.DelegationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///de/uni_paderborn/fujaba/muml/model/component?Delegation", de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.providers.MumlinstanceElementTypes.Delegation_4003); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.StructuredcomponentDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.providers.MumlinstanceElementTypes
						.isKnownElementType(elementType)) {
			image = de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.providers.MumlinstanceElementTypes
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
		if (element instanceof de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.navigator.StructuredcomponentNavigatorGroup) {
			de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.navigator.StructuredcomponentNavigatorGroup group = (de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.navigator.StructuredcomponentNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.navigator.StructuredcomponentNavigatorItem) {
			de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.navigator.StructuredcomponentNavigatorItem navigatorItem = (de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.navigator.StructuredcomponentNavigatorItem) element;
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
		switch (de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.PortEditPart.VISUAL_ID:
			return getPort_3004Text(view);
		case de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.ComponentPartEditPart.VISUAL_ID:
			return getComponentPart_3005Text(view);
		case de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.StructuredComponentEditPart.VISUAL_ID:
			return getStructuredComponent_2002Text(view);
		case de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.Port2EditPart.VISUAL_ID:
			return getPort_3006Text(view);
		case de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.AssemblyEditPart.VISUAL_ID:
			return getAssembly_4004Text(view);
		case de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.StructuredComponentDiagramEditPart.VISUAL_ID:
			return getModelElementCategory_1000Text(view);
		case de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.DelegationEditPart.VISUAL_ID:
			return getDelegation_4003Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getPort_3004Text(View view) {
		de.uni_paderborn.fujaba.muml.model.component.Port domainModelElement = (de.uni_paderborn.fujaba.muml.model.component.Port) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.StructuredcomponentDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 3004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getComponentPart_3005Text(View view) {
		IParser parser = de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.providers.StructuredcomponentParserProvider
				.getParser(
						de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.providers.MumlinstanceElementTypes.ComponentPart_3005,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceVisualIDRegistry
								.getType(de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.ComponentPartNameComponentNameDeriveEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.StructuredcomponentDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStructuredComponent_2002Text(View view) {
		IParser parser = de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.providers.StructuredcomponentParserProvider
				.getParser(
						de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.providers.MumlinstanceElementTypes.StructuredComponent_2002,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceVisualIDRegistry
								.getType(de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.StructuredComponentNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.StructuredcomponentDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPort_3006Text(View view) {
		de.uni_paderborn.fujaba.muml.model.component.Port domainModelElement = (de.uni_paderborn.fujaba.muml.model.component.Port) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.StructuredcomponentDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 3006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAssembly_4004Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getModelElementCategory_1000Text(View view) {
		de.uni_paderborn.fujaba.modelinstance.ModelElementCategory domainModelElement = (de.uni_paderborn.fujaba.modelinstance.ModelElementCategory) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.StructuredcomponentDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDelegation_4003Text(View view) {
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
		return de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.edit.parts.StructuredComponentDiagramEditPart.MODEL_ID
				.equals(de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.MumlinstanceVisualIDRegistry
						.getModelID(view));
	}

}
