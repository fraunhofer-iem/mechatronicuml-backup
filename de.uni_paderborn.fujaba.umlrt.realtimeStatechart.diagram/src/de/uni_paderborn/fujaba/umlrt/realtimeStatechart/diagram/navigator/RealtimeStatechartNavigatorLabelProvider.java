package de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.navigator;

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
public class RealtimeStatechartNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.navigator.RealtimeStatechartNavigatorItem
				&& !isOwnView(((de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.navigator.RealtimeStatechartNavigatorItem) element)
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
		if (element instanceof de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.navigator.RealtimeStatechartNavigatorGroup) {
			de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.navigator.RealtimeStatechartNavigatorGroup group = (de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.navigator.RealtimeStatechartNavigatorGroup) element;
			return de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartDiagramEditorPlugin
					.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.navigator.RealtimeStatechartNavigatorItem) {
			de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.navigator.RealtimeStatechartNavigatorItem navigatorItem = (de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.navigator.RealtimeStatechartNavigatorItem) element;
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
		switch (de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.HistoryStateEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///de/uni_paderborn/fujaba/umlrt/model/realtimestatechart?HistoryState", de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.providers.RealtimeStatechartElementTypes.HistoryState_2011); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.RealtimeStatechartEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://statechart?RealtimeStatechart", de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.providers.RealtimeStatechartElementTypes.RealtimeStatechart_1000); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.StateEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///de/uni_paderborn/fujaba/umlrt/model/realtimestatechart?State", de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.providers.RealtimeStatechartElementTypes.State_2008); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.EntryEventEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///de/uni_paderborn/fujaba/umlrt/model/realtimestatechart?EntryEvent", de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.providers.RealtimeStatechartElementTypes.EntryEvent_3005); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///de/uni_paderborn/fujaba/umlrt/model/realtimestatechart?Transition", de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.providers.RealtimeStatechartElementTypes.Transition_4001); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.FinalStateEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///de/uni_paderborn/fujaba/umlrt/model/realtimestatechart?FinalState", de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.providers.RealtimeStatechartElementTypes.FinalState_2010); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.DoEventEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///de/uni_paderborn/fujaba/umlrt/model/realtimestatechart?DoEvent", de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.providers.RealtimeStatechartElementTypes.DoEvent_3002); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.InitialStateEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///de/uni_paderborn/fujaba/umlrt/model/realtimestatechart?InitialState", de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.providers.RealtimeStatechartElementTypes.InitialState_2009); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.ExitEventEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///de/uni_paderborn/fujaba/umlrt/model/realtimestatechart?ExitEvent", de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.providers.RealtimeStatechartElementTypes.ExitEvent_3006); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.providers.RealtimeStatechartElementTypes
						.isKnownElementType(elementType)) {
			image = de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.providers.RealtimeStatechartElementTypes
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
		if (element instanceof de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.navigator.RealtimeStatechartNavigatorGroup) {
			de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.navigator.RealtimeStatechartNavigatorGroup group = (de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.navigator.RealtimeStatechartNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.navigator.RealtimeStatechartNavigatorItem) {
			de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.navigator.RealtimeStatechartNavigatorItem navigatorItem = (de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.navigator.RealtimeStatechartNavigatorItem) element;
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
		switch (de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.HistoryStateEditPart.VISUAL_ID:
			return getHistoryState_2011Text(view);
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.RealtimeStatechartEditPart.VISUAL_ID:
			return getRealtimeStatechart_1000Text(view);
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.StateEditPart.VISUAL_ID:
			return getState_2008Text(view);
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.EntryEventEditPart.VISUAL_ID:
			return getEntryEvent_3005Text(view);
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionEditPart.VISUAL_ID:
			return getTransition_4001Text(view);
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.FinalStateEditPart.VISUAL_ID:
			return getFinalState_2010Text(view);
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.DoEventEditPart.VISUAL_ID:
			return getDoEvent_3002Text(view);
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.InitialStateEditPart.VISUAL_ID:
			return getInitialState_2009Text(view);
		case de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.ExitEventEditPart.VISUAL_ID:
			return getExitEvent_3006Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getFinalState_2010Text(View view) {
		de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FinalState domainModelElement = (de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FinalState) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDoEvent_3002Text(View view) {
		IParser parser = de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.providers.RealtimeStatechartParserProvider
				.getParser(
						de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.providers.RealtimeStatechartElementTypes.DoEvent_3002,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartVisualIDRegistry
								.getType(de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.DoEventPeriodLowerPeriodUpperEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRealtimeStatechart_1000Text(View view) {
		de.uni_paderborn.fujaba.umlrt.realtimeStatechart.RealtimeStatechart domainModelElement = (de.uni_paderborn.fujaba.umlrt.realtimeStatechart.RealtimeStatechart) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getHistoryState_2011Text(View view) {
		de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.HistoryState domainModelElement = (de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.HistoryState) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTransition_4001Text(View view) {
		IParser parser = de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.providers.RealtimeStatechartParserProvider
				.getParser(
						de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.providers.RealtimeStatechartElementTypes.Transition_4001,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartVisualIDRegistry
								.getType(de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.TransitionPriorityEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getState_2008Text(View view) {
		IParser parser = de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.providers.RealtimeStatechartParserProvider
				.getParser(
						de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.providers.RealtimeStatechartElementTypes.State_2008,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartVisualIDRegistry
								.getType(de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.StateNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEntryEvent_3005Text(View view) {
		IParser parser = de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.providers.RealtimeStatechartParserProvider
				.getParser(
						de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.providers.RealtimeStatechartElementTypes.EntryEvent_3005,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartVisualIDRegistry
								.getType(de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.EntryEventActionExprEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInitialState_2009Text(View view) {
		de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.InitialState domainModelElement = (de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.InitialState) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExitEvent_3006Text(View view) {
		IParser parser = de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.providers.RealtimeStatechartParserProvider
				.getParser(
						de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.providers.RealtimeStatechartElementTypes.ExitEvent_3006,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartVisualIDRegistry
								.getType(de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.ExitEventActionExprEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5011); //$NON-NLS-1$
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
		return de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.edit.parts.RealtimeStatechartEditPart.MODEL_ID
				.equals(de.uni_paderborn.fujaba.umlrt.realtimeStatechart.diagram.part.RealtimeStatechartVisualIDRegistry
						.getModelID(view));
	}

}
