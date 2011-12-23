package de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.navigator;

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

import de.fujaba.modelinstance.ModelElementCategory;

/**
 * @generated
 */
public class AtomiccomponentNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.AtomiccomponentDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.AtomiccomponentDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.navigator.AtomiccomponentNavigatorItem
				&& !isOwnView(((de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.navigator.AtomiccomponentNavigatorItem) element)
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
		if (element instanceof de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.navigator.AtomiccomponentNavigatorGroup) {
			de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.navigator.AtomiccomponentNavigatorGroup group = (de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.navigator.AtomiccomponentNavigatorGroup) element;
			return de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.AtomiccomponentDiagramEditorPlugin
					.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.navigator.AtomiccomponentNavigatorItem) {
			de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.navigator.AtomiccomponentNavigatorItem navigatorItem = (de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.navigator.AtomiccomponentNavigatorItem) element;
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
		switch (de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.MumlVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.edit.parts.AtomicComponentDiagramEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://de.fujaba.modelinstance?ModelElementCategory", de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.providers.MumlElementTypes.ModelElementCategory_1000); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.edit.parts.AtomicComponentEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///de/uni_paderborn/fujaba/muml/model/component?AtomicComponent", de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.providers.MumlElementTypes.AtomicComponent_2002); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.edit.parts.HybridPortEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///de/uni_paderborn/fujaba/muml/model/component?HybridPort", de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.providers.MumlElementTypes.HybridPort_3004); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.edit.parts.DiscretePortEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///de/uni_paderborn/fujaba/muml/model/component?DiscretePort", de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.providers.MumlElementTypes.DiscretePort_3002); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.edit.parts.ContinuousPortEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///de/uni_paderborn/fujaba/muml/model/component?ContinuousPort", de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.providers.MumlElementTypes.ContinuousPort_3003); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.AtomiccomponentDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.providers.MumlElementTypes
						.isKnownElementType(elementType)) {
			image = de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.providers.MumlElementTypes
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
		if (element instanceof de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.navigator.AtomiccomponentNavigatorGroup) {
			de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.navigator.AtomiccomponentNavigatorGroup group = (de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.navigator.AtomiccomponentNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.navigator.AtomiccomponentNavigatorItem) {
			de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.navigator.AtomiccomponentNavigatorItem navigatorItem = (de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.navigator.AtomiccomponentNavigatorItem) element;
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
		switch (de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.MumlVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.edit.parts.AtomicComponentDiagramEditPart.VISUAL_ID:
			return getModelElementCategory_1000Text(view);
		case de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.edit.parts.AtomicComponentEditPart.VISUAL_ID:
			return getAtomicComponent_2002Text(view);
		case de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.edit.parts.HybridPortEditPart.VISUAL_ID:
			return getHybridPort_3004Text(view);
		case de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.edit.parts.DiscretePortEditPart.VISUAL_ID:
			return getDiscretePort_3002Text(view);
		case de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.edit.parts.ContinuousPortEditPart.VISUAL_ID:
			return getContinuousPort_3003Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getModelElementCategory_1000Text(View view) {
		ModelElementCategory domainModelElement = (ModelElementCategory) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.AtomiccomponentDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAtomicComponent_2002Text(View view) {
		IParser parser = de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.providers.AtomiccomponentParserProvider
				.getParser(
						de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.providers.MumlElementTypes.AtomicComponent_2002,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.MumlVisualIDRegistry
								.getType(de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.edit.parts.AtomicComponentNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.AtomiccomponentDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDiscretePort_3002Text(View view) {
		IParser parser = de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.providers.AtomiccomponentParserProvider
				.getParser(
						de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.providers.MumlElementTypes.DiscretePort_3002,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.MumlVisualIDRegistry
								.getType(de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.edit.parts.DiscretePortNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.AtomiccomponentDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getContinuousPort_3003Text(View view) {
		IParser parser = de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.providers.AtomiccomponentParserProvider
				.getParser(
						de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.providers.MumlElementTypes.ContinuousPort_3003,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.MumlVisualIDRegistry
								.getType(de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.edit.parts.ContinuousPortNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.AtomiccomponentDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getHybridPort_3004Text(View view) {
		IParser parser = de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.providers.AtomiccomponentParserProvider
				.getParser(
						de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.providers.MumlElementTypes.HybridPort_3004,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.MumlVisualIDRegistry
								.getType(de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.edit.parts.HybridPortNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.AtomiccomponentDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5003); //$NON-NLS-1$
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
		return de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.edit.parts.AtomicComponentDiagramEditPart.MODEL_ID
				.equals(de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.MumlVisualIDRegistry
						.getModelID(view));
	}

}
