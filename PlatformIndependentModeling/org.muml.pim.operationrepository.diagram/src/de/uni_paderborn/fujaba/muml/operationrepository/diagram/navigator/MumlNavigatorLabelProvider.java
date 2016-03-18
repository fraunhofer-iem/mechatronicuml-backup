package de.uni_paderborn.fujaba.muml.operationrepository.diagram.navigator;

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
		de.uni_paderborn.fujaba.muml.operationrepository.diagram.part.OperationRepositoryDiagramEditorPlugin
				.getInstance().getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		de.uni_paderborn.fujaba.muml.operationrepository.diagram.part.OperationRepositoryDiagramEditorPlugin
				.getInstance().getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof de.uni_paderborn.fujaba.muml.operationrepository.diagram.navigator.MumlNavigatorItem
				&& !isOwnView(
						((de.uni_paderborn.fujaba.muml.operationrepository.diagram.navigator.MumlNavigatorItem) element)
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
		if (element instanceof de.uni_paderborn.fujaba.muml.operationrepository.diagram.navigator.MumlNavigatorGroup) {
			de.uni_paderborn.fujaba.muml.operationrepository.diagram.navigator.MumlNavigatorGroup group = (de.uni_paderborn.fujaba.muml.operationrepository.diagram.navigator.MumlNavigatorGroup) element;
			return de.uni_paderborn.fujaba.muml.operationrepository.diagram.part.OperationRepositoryDiagramEditorPlugin
					.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof de.uni_paderborn.fujaba.muml.operationrepository.diagram.navigator.MumlNavigatorItem) {
			de.uni_paderborn.fujaba.muml.operationrepository.diagram.navigator.MumlNavigatorItem navigatorItem = (de.uni_paderborn.fujaba.muml.operationrepository.diagram.navigator.MumlNavigatorItem) element;
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
		switch (de.uni_paderborn.fujaba.muml.operationrepository.diagram.part.MumlVisualIDRegistry.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.operationrepository.diagram.edit.parts.ModelElementCategoryEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?http://www.fujaba.de/modelinstance/0.4.0?ModelElementCategory", //$NON-NLS-1$
					de.uni_paderborn.fujaba.muml.operationrepository.diagram.providers.MumlElementTypes.ModelElementCategory_1000);
		case de.uni_paderborn.fujaba.muml.operationrepository.diagram.edit.parts.OperationRepositoryEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.fujaba.de/muml/behavior/0.4.0?OperationRepository", //$NON-NLS-1$
					de.uni_paderborn.fujaba.muml.operationrepository.diagram.providers.MumlElementTypes.OperationRepository_2001);
		case de.uni_paderborn.fujaba.muml.operationrepository.diagram.edit.parts.OperationEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.fujaba.de/muml/behavior/0.4.0?Operation", //$NON-NLS-1$
					de.uni_paderborn.fujaba.muml.operationrepository.diagram.providers.MumlElementTypes.Operation_3001);
		case de.uni_paderborn.fujaba.muml.operationrepository.diagram.edit.parts.ParameterEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.fujaba.de/muml/behavior/0.4.0?Parameter", //$NON-NLS-1$
					de.uni_paderborn.fujaba.muml.operationrepository.diagram.providers.MumlElementTypes.Parameter_3002);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = de.uni_paderborn.fujaba.muml.operationrepository.diagram.part.OperationRepositoryDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& de.uni_paderborn.fujaba.muml.operationrepository.diagram.providers.MumlElementTypes
						.isKnownElementType(elementType)) {
			image = de.uni_paderborn.fujaba.muml.operationrepository.diagram.providers.MumlElementTypes
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
		if (element instanceof de.uni_paderborn.fujaba.muml.operationrepository.diagram.navigator.MumlNavigatorGroup) {
			de.uni_paderborn.fujaba.muml.operationrepository.diagram.navigator.MumlNavigatorGroup group = (de.uni_paderborn.fujaba.muml.operationrepository.diagram.navigator.MumlNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof de.uni_paderborn.fujaba.muml.operationrepository.diagram.navigator.MumlNavigatorItem) {
			de.uni_paderborn.fujaba.muml.operationrepository.diagram.navigator.MumlNavigatorItem navigatorItem = (de.uni_paderborn.fujaba.muml.operationrepository.diagram.navigator.MumlNavigatorItem) element;
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
		switch (de.uni_paderborn.fujaba.muml.operationrepository.diagram.part.MumlVisualIDRegistry.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.operationrepository.diagram.edit.parts.ModelElementCategoryEditPart.VISUAL_ID:
			return getModelElementCategory_1000Text(view);
		case de.uni_paderborn.fujaba.muml.operationrepository.diagram.edit.parts.OperationRepositoryEditPart.VISUAL_ID:
			return getOperationRepository_2001Text(view);
		case de.uni_paderborn.fujaba.muml.operationrepository.diagram.edit.parts.OperationEditPart.VISUAL_ID:
			return getOperation_3001Text(view);
		case de.uni_paderborn.fujaba.muml.operationrepository.diagram.edit.parts.ParameterEditPart.VISUAL_ID:
			return getParameter_3002Text(view);
		}
		return getUnknownElementText(view);
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
			de.uni_paderborn.fujaba.muml.operationrepository.diagram.part.OperationRepositoryDiagramEditorPlugin
					.getInstance().logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOperationRepository_2001Text(View view) {
		IParser parser = de.uni_paderborn.fujaba.muml.operationrepository.diagram.providers.MumlParserProvider
				.getParser(
						de.uni_paderborn.fujaba.muml.operationrepository.diagram.providers.MumlElementTypes.OperationRepository_2001,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.muml.operationrepository.diagram.part.MumlVisualIDRegistry.getType(
								de.uni_paderborn.fujaba.muml.operationrepository.diagram.edit.parts.OperationRepositoryNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.muml.operationrepository.diagram.part.OperationRepositoryDiagramEditorPlugin
					.getInstance().logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOperation_3001Text(View view) {
		IParser parser = de.uni_paderborn.fujaba.muml.operationrepository.diagram.providers.MumlParserProvider
				.getParser(
						de.uni_paderborn.fujaba.muml.operationrepository.diagram.providers.MumlElementTypes.Operation_3001,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.muml.operationrepository.diagram.part.MumlVisualIDRegistry.getType(
								de.uni_paderborn.fujaba.muml.operationrepository.diagram.edit.parts.OperationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.muml.operationrepository.diagram.part.OperationRepositoryDiagramEditorPlugin
					.getInstance().logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getParameter_3002Text(View view) {
		IParser parser = de.uni_paderborn.fujaba.muml.operationrepository.diagram.providers.MumlParserProvider
				.getParser(
						de.uni_paderborn.fujaba.muml.operationrepository.diagram.providers.MumlElementTypes.Parameter_3002,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.muml.operationrepository.diagram.part.MumlVisualIDRegistry.getType(
								de.uni_paderborn.fujaba.muml.operationrepository.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.muml.operationrepository.diagram.part.OperationRepositoryDiagramEditorPlugin
					.getInstance().logError("Parser was not found for label " + 5001); //$NON-NLS-1$
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
		return de.uni_paderborn.fujaba.muml.operationrepository.diagram.edit.parts.ModelElementCategoryEditPart.MODEL_ID
				.equals(de.uni_paderborn.fujaba.muml.operationrepository.diagram.part.MumlVisualIDRegistry
						.getModelID(view));
	}

}
