package org.muml.pim.operationrepository.diagram.navigator;

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
import org.muml.pim.operationrepository.diagram.edit.parts.ModelElementCategoryEditPart;
import org.muml.pim.operationrepository.diagram.edit.parts.OperationEditPart;
import org.muml.pim.operationrepository.diagram.edit.parts.OperationNameEditPart;
import org.muml.pim.operationrepository.diagram.edit.parts.OperationRepositoryEditPart;
import org.muml.pim.operationrepository.diagram.edit.parts.OperationRepositoryNameEditPart;
import org.muml.pim.operationrepository.diagram.edit.parts.ParameterEditPart;
import org.muml.pim.operationrepository.diagram.edit.parts.WrappingLabel2EditPart;
import org.muml.pim.operationrepository.diagram.part.MumlVisualIDRegistry;
import org.muml.pim.operationrepository.diagram.part.OperationRepositoryDiagramEditorPlugin;
import org.muml.pim.operationrepository.diagram.providers.MumlElementTypes;
import org.muml.pim.operationrepository.diagram.providers.MumlParserProvider;

/**
 * @generated
 */
public class MumlNavigatorLabelProvider extends LabelProvider implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		OperationRepositoryDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		OperationRepositoryDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
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
			return OperationRepositoryDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
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
		case OperationRepositoryEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.muml.org/pim/behavior/1.0.0?OperationRepository", //$NON-NLS-1$
					MumlElementTypes.OperationRepository_2001);
		case OperationEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.muml.org/pim/behavior/1.0.0?Operation", //$NON-NLS-1$
					MumlElementTypes.Operation_3001);
		case ParameterEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.muml.org/pim/behavior/1.0.0?Parameter", //$NON-NLS-1$
					MumlElementTypes.Parameter_3002);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = OperationRepositoryDiagramEditorPlugin.getInstance().getImageRegistry();
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
		case OperationRepositoryEditPart.VISUAL_ID:
			return getOperationRepository_2001Text(view);
		case OperationEditPart.VISUAL_ID:
			return getOperation_3001Text(view);
		case ParameterEditPart.VISUAL_ID:
			return getParameter_3002Text(view);
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
			OperationRepositoryDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOperationRepository_2001Text(View view) {
		IParser parser = MumlParserProvider.getParser(MumlElementTypes.OperationRepository_2001,
				view.getElement() != null ? view.getElement() : view,
				MumlVisualIDRegistry.getType(OperationRepositoryNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			OperationRepositoryDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOperation_3001Text(View view) {
		IParser parser = MumlParserProvider.getParser(MumlElementTypes.Operation_3001,
				view.getElement() != null ? view.getElement() : view,
				MumlVisualIDRegistry.getType(OperationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			OperationRepositoryDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getParameter_3002Text(View view) {
		IParser parser = MumlParserProvider.getParser(MumlElementTypes.Parameter_3002,
				view.getElement() != null ? view.getElement() : view,
				MumlVisualIDRegistry.getType(WrappingLabel2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			OperationRepositoryDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5001); //$NON-NLS-1$
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
		return ModelElementCategoryEditPart.MODEL_ID.equals(MumlVisualIDRegistry.getModelID(view));
	}

}
