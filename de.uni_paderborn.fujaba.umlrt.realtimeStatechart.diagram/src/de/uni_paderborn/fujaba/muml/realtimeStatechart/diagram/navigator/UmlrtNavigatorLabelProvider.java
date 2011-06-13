package de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.navigator;

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
public class UmlrtNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.navigator.UmlrtNavigatorItem
				&& !isOwnView(((de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.navigator.UmlrtNavigatorItem) element)
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
		if (element instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.navigator.UmlrtNavigatorGroup) {
			de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.navigator.UmlrtNavigatorGroup group = (de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.navigator.UmlrtNavigatorGroup) element;
			return de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
					.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.navigator.UmlrtNavigatorItem) {
			de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.navigator.UmlrtNavigatorItem navigatorItem = (de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.navigator.UmlrtNavigatorItem) element;
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
		switch (de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///de/uni_paderborn/fujaba/muml/model/realtimestatechart?State", de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.UmlrtElementTypes.State_2001); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.EEActionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///de/uni_paderborn/fujaba/muml/model/realtimestatechart?EntryOrExitEvent", de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.UmlrtElementTypes.EntryOrExitEvent_3001); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.DoActionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///de/uni_paderborn/fujaba/muml/model/realtimestatechart?EntryOrExitEvent", de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.UmlrtElementTypes.EntryOrExitEvent_3003); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.SynchroChannelEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///de/uni_paderborn/fujaba/muml/model/realtimestatechart?ClockConstraint", de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.UmlrtElementTypes.ClockConstraint_3004); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.TransitionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///de/uni_paderborn/fujaba/muml/model/realtimestatechart?Transition", de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.UmlrtElementTypes.Transition_4001); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.EEAction2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///de/uni_paderborn/fujaba/muml/model/realtimestatechart?SynchronizationChannel", de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.UmlrtElementTypes.SynchronizationChannel_3005); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.TimeInvariantEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///de/uni_paderborn/fujaba/muml/model/realtimestatechart?Region", de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.UmlrtElementTypes.Region_3006); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.SynchroChannel2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///de/uni_paderborn/fujaba/muml/model/realtimestatechart?DoEvent", de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.UmlrtElementTypes.DoEvent_3002); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.InitialStateEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///de/uni_paderborn/fujaba/muml/model/realtimestatechart?Clock", de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.UmlrtElementTypes.Clock_2002); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.FujabaRealtimeStatechartEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http:///de/uni_paderborn/fujaba/muml/model/realtimestatechart?FujabaRealtimeStatechart", de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.UmlrtElementTypes.FujabaRealtimeStatechart_1000); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.UmlrtElementTypes
						.isKnownElementType(elementType)) {
			image = de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.UmlrtElementTypes
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
		if (element instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.navigator.UmlrtNavigatorGroup) {
			de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.navigator.UmlrtNavigatorGroup group = (de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.navigator.UmlrtNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.navigator.UmlrtNavigatorItem) {
			de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.navigator.UmlrtNavigatorItem navigatorItem = (de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.navigator.UmlrtNavigatorItem) element;
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
		switch (de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateEditPart.VISUAL_ID:
			return getState_2001Text(view);
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.EEActionEditPart.VISUAL_ID:
			return getEntryOrExitEvent_3001Text(view);
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.DoActionEditPart.VISUAL_ID:
			return getEntryOrExitEvent_3003Text(view);
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.SynchroChannelEditPart.VISUAL_ID:
			return getClockConstraint_3004Text(view);
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.TransitionEditPart.VISUAL_ID:
			return getTransition_4001Text(view);
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.EEAction2EditPart.VISUAL_ID:
			return getSynchronizationChannel_3005Text(view);
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.TimeInvariantEditPart.VISUAL_ID:
			return getRegion_3006Text(view);
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.SynchroChannel2EditPart.VISUAL_ID:
			return getDoEvent_3002Text(view);
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.InitialStateEditPart.VISUAL_ID:
			return getClock_2002Text(view);
		case de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.FujabaRealtimeStatechartEditPart.VISUAL_ID:
			return getFujabaRealtimeStatechart_1000Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getClockConstraint_3004Text(View view) {
		IParser parser = de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.UmlrtParserProvider
				.getParser(
						de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.UmlrtElementTypes.ClockConstraint_3004,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtVisualIDRegistry
								.getType(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getClock_2002Text(View view) {
		IParser parser = de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.UmlrtParserProvider
				.getParser(
						de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.UmlrtElementTypes.Clock_2002,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtVisualIDRegistry
								.getType(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.ClockNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFujabaRealtimeStatechart_1000Text(View view) {
		de.uni_paderborn.fujaba.muml.model.realtimestatechart.FujabaRealtimeStatechart domainModelElement = (de.uni_paderborn.fujaba.muml.model.realtimestatechart.FujabaRealtimeStatechart) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getState_2001Text(View view) {
		IParser parser = de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.UmlrtParserProvider
				.getParser(
						de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.UmlrtElementTypes.State_2001,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtVisualIDRegistry
								.getType(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEntryOrExitEvent_3001Text(View view) {
		de.uni_paderborn.fujaba.muml.model.realtimestatechart.EntryOrExitEvent domainModelElement = (de.uni_paderborn.fujaba.muml.model.realtimestatechart.EntryOrExitEvent) view
				.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getKind());
		} else {
			de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 3001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEntryOrExitEvent_3003Text(View view) {
		de.uni_paderborn.fujaba.muml.model.realtimestatechart.EntryOrExitEvent domainModelElement = (de.uni_paderborn.fujaba.muml.model.realtimestatechart.EntryOrExitEvent) view
				.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getKind());
		} else {
			de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 3003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSynchronizationChannel_3005Text(View view) {
		IParser parser = de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.UmlrtParserProvider
				.getParser(
						de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.UmlrtElementTypes.SynchronizationChannel_3005,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtVisualIDRegistry
								.getType(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRegion_3006Text(View view) {
		de.uni_paderborn.fujaba.muml.model.realtimestatechart.Region domainModelElement = (de.uni_paderborn.fujaba.muml.model.realtimestatechart.Region) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 3006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDoEvent_3002Text(View view) {
		de.uni_paderborn.fujaba.muml.model.realtimestatechart.DoEvent domainModelElement = (de.uni_paderborn.fujaba.muml.model.realtimestatechart.DoEvent) view
				.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getKind());
		} else {
			de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 3002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTransition_4001Text(View view) {
		IParser parser = de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.UmlrtParserProvider
				.getParser(
						de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.UmlrtElementTypes.Transition_4001,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtVisualIDRegistry
								.getType(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.TransitionPriorityEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 6001); //$NON-NLS-1$
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
		return de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.FujabaRealtimeStatechartEditPart.MODEL_ID
				.equals(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.UmlrtVisualIDRegistry
						.getModelID(view));
	}

}
