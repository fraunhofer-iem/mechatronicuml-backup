package de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.navigator;

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
public class MumlNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.navigator.MumlNavigatorItem
				&& !isOwnView(((de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.navigator.MumlNavigatorItem) element)
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
		if (element instanceof de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.navigator.MumlNavigatorGroup) {
			de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.navigator.MumlNavigatorGroup group = (de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.navigator.MumlNavigatorGroup) element;
			return de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
					.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.navigator.MumlNavigatorItem) {
			de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.navigator.MumlNavigatorItem navigatorItem = (de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.navigator.MumlNavigatorItem) element;
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
		switch (de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.RealtimeStatechartEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.fujaba.de/muml/realtimestatechart/0.3.17?RealtimeStatechart", de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.providers.MumlElementTypes.RealtimeStatechart_2007); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.ExitPointEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.fujaba.de/muml/realtimestatechart/0.3.17?ExitPoint", de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.providers.MumlElementTypes.ExitPoint_3041); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.RealtimeStatechart2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.fujaba.de/muml/realtimestatechart/0.3.17?RealtimeStatechart", de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.providers.MumlElementTypes.RealtimeStatechart_3039); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.EntryPointEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.fujaba.de/muml/realtimestatechart/0.3.17?EntryPoint", de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.providers.MumlElementTypes.EntryPoint_3040); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.StateEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.fujaba.de/muml/realtimestatechart/0.3.17?State", de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.providers.MumlElementTypes.State_3032); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.RegionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.fujaba.de/muml/realtimestatechart/0.3.17?Region", de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.providers.MumlElementTypes.Region_3038); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.ModelElementCategoryEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://www.fujaba.de/muml/realtimestatechart/0.3.17?RealtimeStatechart", de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.providers.MumlElementTypes.RealtimeStatechart_1000); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.SynchronizationChannelEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.fujaba.de/muml/realtimestatechart/0.3.17?SynchronizationChannel", de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.providers.MumlElementTypes.SynchronizationChannel_3037); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.ClockConstraintEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.fujaba.de/muml/realtimestatechart/0.3.17?ClockConstraint", de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.providers.MumlElementTypes.ClockConstraint_3036); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.TransitionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.fujaba.de/muml/realtimestatechart/0.3.17?Transition", de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.providers.MumlElementTypes.Transition_4003); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.ExitEventEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.fujaba.de/muml/realtimestatechart/0.3.17?ExitEvent", de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.providers.MumlElementTypes.ExitEvent_3035); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.EntryEventEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.fujaba.de/muml/realtimestatechart/0.3.17?EntryEvent", de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.providers.MumlElementTypes.EntryEvent_3033); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.DoEventEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.fujaba.de/muml/realtimestatechart/0.3.17?DoEvent", de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.providers.MumlElementTypes.DoEvent_3034); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.providers.MumlElementTypes
						.isKnownElementType(elementType)) {
			image = de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.providers.MumlElementTypes
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
		if (element instanceof de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.navigator.MumlNavigatorGroup) {
			de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.navigator.MumlNavigatorGroup group = (de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.navigator.MumlNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.navigator.MumlNavigatorItem) {
			de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.navigator.MumlNavigatorItem navigatorItem = (de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.navigator.MumlNavigatorItem) element;
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
		switch (de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.RealtimeStatechartEditPart.VISUAL_ID:
			return getRealtimeStatechart_2007Text(view);
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.ExitPointEditPart.VISUAL_ID:
			return getExitPoint_3041Text(view);
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.RealtimeStatechart2EditPart.VISUAL_ID:
			return getRealtimeStatechart_3039Text(view);
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.EntryPointEditPart.VISUAL_ID:
			return getEntryPoint_3040Text(view);
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.StateEditPart.VISUAL_ID:
			return getState_3032Text(view);
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.RegionEditPart.VISUAL_ID:
			return getRegion_3038Text(view);
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.ModelElementCategoryEditPart.VISUAL_ID:
			return getRealtimeStatechart_1000Text(view);
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.SynchronizationChannelEditPart.VISUAL_ID:
			return getSynchronizationChannel_3037Text(view);
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.ClockConstraintEditPart.VISUAL_ID:
			return getClockConstraint_3036Text(view);
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.TransitionEditPart.VISUAL_ID:
			return getTransition_4003Text(view);
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.ExitEventEditPart.VISUAL_ID:
			return getExitEvent_3035Text(view);
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.EntryEventEditPart.VISUAL_ID:
			return getEntryEvent_3033Text(view);
		case de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.DoEventEditPart.VISUAL_ID:
			return getDoEvent_3034Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getExitEvent_3035Text(View view) {
		IParser parser = de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.providers.MumlParserProvider
				.getParser(
						de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.providers.MumlElementTypes.ExitEvent_3035,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlVisualIDRegistry
								.getType(de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.WrappingLabel4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5052); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDoEvent_3034Text(View view) {
		IParser parser = de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.providers.MumlParserProvider
				.getParser(
						de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.providers.MumlElementTypes.DoEvent_3034,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlVisualIDRegistry
								.getType(de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5051); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEntryEvent_3033Text(View view) {
		IParser parser = de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.providers.MumlParserProvider
				.getParser(
						de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.providers.MumlElementTypes.EntryEvent_3033,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlVisualIDRegistry
								.getType(de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5050); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRealtimeStatechart_1000Text(View view) {
		de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart domainModelElement = (de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRegion_3038Text(View view) {
		IParser parser = de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.providers.MumlParserProvider
				.getParser(
						de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.providers.MumlElementTypes.Region_3038,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlVisualIDRegistry
								.getType(de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.RegionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5055); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExitPoint_3041Text(View view) {
		IParser parser = de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.providers.MumlParserProvider
				.getParser(
						de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.providers.MumlElementTypes.ExitPoint_3041,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlVisualIDRegistry
								.getType(de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.ExitPointNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5059); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getClockConstraint_3036Text(View view) {
		IParser parser = de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.providers.MumlParserProvider
				.getParser(
						de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.providers.MumlElementTypes.ClockConstraint_3036,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlVisualIDRegistry
								.getType(de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.WrappingLabel5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5053); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTransition_4003Text(View view) {
		IParser parser = de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.providers.MumlParserProvider
				.getParser(
						de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.providers.MumlElementTypes.Transition_4003,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlVisualIDRegistry
								.getType(de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.WrappingLabel8EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 6005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEntryPoint_3040Text(View view) {
		IParser parser = de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.providers.MumlParserProvider
				.getParser(
						de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.providers.MumlElementTypes.EntryPoint_3040,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlVisualIDRegistry
								.getType(de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.EntryPointNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5058); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSynchronizationChannel_3037Text(View view) {
		IParser parser = de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.providers.MumlParserProvider
				.getParser(
						de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.providers.MumlElementTypes.SynchronizationChannel_3037,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlVisualIDRegistry
								.getType(de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.WrappingLabel6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5054); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getState_3032Text(View view) {
		IParser parser = de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.providers.MumlParserProvider
				.getParser(
						de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.providers.MumlElementTypes.State_3032,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlVisualIDRegistry
								.getType(de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.StateNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5060); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRealtimeStatechart_2007Text(View view) {
		IParser parser = de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.providers.MumlParserProvider
				.getParser(
						de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.providers.MumlElementTypes.RealtimeStatechart_2007,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlVisualIDRegistry
								.getType(de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.RealtimeStatechartNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5061); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRealtimeStatechart_3039Text(View view) {
		de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart domainModelElement = (de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 3039); //$NON-NLS-1$
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
		return de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.ModelElementCategoryEditPart.MODEL_ID
				.equals(de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlVisualIDRegistry
						.getModelID(view));
	}

}
