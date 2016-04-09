/*
 * <copyright>
 * Copyright (c) 2013 Software Engineering Group, Heinz Nixdorf Institute, University of Paderborn, Germany.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Software Engineering Group - initial API and implementation
 * </copyright>
 */
package org.muml.pim.realtimestatechart.diagram.navigator;

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
import org.muml.pim.realtimestatechart.EntryPoint;
import org.muml.pim.realtimestatechart.ExitPoint;
import org.muml.pim.realtimestatechart.RealtimeStatechart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.ClockConstraintEditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.DoEventEditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.EntryEventEditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.EntryPointEditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.ExitEventEditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.ExitPointEditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.ModelElementCategoryEditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.RealtimeStatechart2EditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.RealtimeStatechartEditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.RealtimeStatechartNameEditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.RegionEditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.RegionNameEditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.StateEditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.StateNameEditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.SynchronizationChannelEditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.TransitionEditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.WrappingLabel2EditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.WrappingLabel3EditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.WrappingLabel4EditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.WrappingLabel5EditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.WrappingLabel6EditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.WrappingLabel8EditPart;
import org.muml.pim.realtimestatechart.diagram.part.MumlVisualIDRegistry;
import org.muml.pim.realtimestatechart.diagram.part.RealtimestatechartDiagramEditorPlugin;
import org.muml.pim.realtimestatechart.diagram.providers.MumlElementTypes;
import org.muml.pim.realtimestatechart.diagram.providers.MumlParserProvider;

/**
 * @generated
 */
public class MumlNavigatorLabelProvider extends LabelProvider implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		RealtimestatechartDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		RealtimestatechartDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
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
			return RealtimestatechartDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
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
			return getImage("Navigator?Diagram?http://www.muml.org/pim/realtimestatechart/1.0.0?RealtimeStatechart", //$NON-NLS-1$
					MumlElementTypes.RealtimeStatechart_1000);
		case RealtimeStatechartEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.muml.org/pim/realtimestatechart/1.0.0?RealtimeStatechart", //$NON-NLS-1$
					MumlElementTypes.RealtimeStatechart_2007);
		case StateEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.muml.org/pim/realtimestatechart/1.0.0?State", //$NON-NLS-1$
					MumlElementTypes.State_3032);
		case EntryEventEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.muml.org/pim/realtimestatechart/1.0.0?EntryEvent", //$NON-NLS-1$
					MumlElementTypes.EntryEvent_3033);
		case DoEventEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.muml.org/pim/realtimestatechart/1.0.0?DoEvent", //$NON-NLS-1$
					MumlElementTypes.DoEvent_3034);
		case ExitEventEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.muml.org/pim/realtimestatechart/1.0.0?ExitEvent", //$NON-NLS-1$
					MumlElementTypes.ExitEvent_3035);
		case ClockConstraintEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.muml.org/pim/realtimestatechart/1.0.0?ClockConstraint", //$NON-NLS-1$
					MumlElementTypes.ClockConstraint_3036);
		case SynchronizationChannelEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.muml.org/pim/realtimestatechart/1.0.0?SynchronizationChannel", //$NON-NLS-1$
					MumlElementTypes.SynchronizationChannel_3037);
		case EntryPointEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.muml.org/pim/realtimestatechart/1.0.0?EntryPoint", //$NON-NLS-1$
					MumlElementTypes.EntryPoint_3040);
		case ExitPointEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.muml.org/pim/realtimestatechart/1.0.0?ExitPoint", //$NON-NLS-1$
					MumlElementTypes.ExitPoint_3041);
		case RegionEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.muml.org/pim/realtimestatechart/1.0.0?Region", //$NON-NLS-1$
					MumlElementTypes.Region_3042);
		case RealtimeStatechart2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.muml.org/pim/realtimestatechart/1.0.0?RealtimeStatechart", //$NON-NLS-1$
					MumlElementTypes.RealtimeStatechart_3043);
		case TransitionEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.muml.org/pim/realtimestatechart/1.0.0?Transition", //$NON-NLS-1$
					MumlElementTypes.Transition_4003);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = RealtimestatechartDiagramEditorPlugin.getInstance().getImageRegistry();
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
			return getRealtimeStatechart_1000Text(view);
		case RealtimeStatechartEditPart.VISUAL_ID:
			return getRealtimeStatechart_2007Text(view);
		case StateEditPart.VISUAL_ID:
			return getState_3032Text(view);
		case EntryEventEditPart.VISUAL_ID:
			return getEntryEvent_3033Text(view);
		case DoEventEditPart.VISUAL_ID:
			return getDoEvent_3034Text(view);
		case ExitEventEditPart.VISUAL_ID:
			return getExitEvent_3035Text(view);
		case ClockConstraintEditPart.VISUAL_ID:
			return getClockConstraint_3036Text(view);
		case SynchronizationChannelEditPart.VISUAL_ID:
			return getSynchronizationChannel_3037Text(view);
		case EntryPointEditPart.VISUAL_ID:
			return getEntryPoint_3040Text(view);
		case ExitPointEditPart.VISUAL_ID:
			return getExitPoint_3041Text(view);
		case RegionEditPart.VISUAL_ID:
			return getRegion_3042Text(view);
		case RealtimeStatechart2EditPart.VISUAL_ID:
			return getRealtimeStatechart_3043Text(view);
		case TransitionEditPart.VISUAL_ID:
			return getTransition_4003Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getRealtimeStatechart_1000Text(View view) {
		RealtimeStatechart domainModelElement = (RealtimeStatechart) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			RealtimestatechartDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRealtimeStatechart_2007Text(View view) {
		IParser parser = MumlParserProvider.getParser(MumlElementTypes.RealtimeStatechart_2007,
				view.getElement() != null ? view.getElement() : view,
				MumlVisualIDRegistry.getType(RealtimeStatechartNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RealtimestatechartDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5061); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getState_3032Text(View view) {
		IParser parser = MumlParserProvider.getParser(MumlElementTypes.State_3032,
				view.getElement() != null ? view.getElement() : view,
				MumlVisualIDRegistry.getType(StateNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RealtimestatechartDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5060); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEntryEvent_3033Text(View view) {
		IParser parser = MumlParserProvider.getParser(MumlElementTypes.EntryEvent_3033,
				view.getElement() != null ? view.getElement() : view,
				MumlVisualIDRegistry.getType(WrappingLabel2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RealtimestatechartDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5050); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDoEvent_3034Text(View view) {
		IParser parser = MumlParserProvider.getParser(MumlElementTypes.DoEvent_3034,
				view.getElement() != null ? view.getElement() : view,
				MumlVisualIDRegistry.getType(WrappingLabel3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RealtimestatechartDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5051); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExitEvent_3035Text(View view) {
		IParser parser = MumlParserProvider.getParser(MumlElementTypes.ExitEvent_3035,
				view.getElement() != null ? view.getElement() : view,
				MumlVisualIDRegistry.getType(WrappingLabel4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RealtimestatechartDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5052); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getClockConstraint_3036Text(View view) {
		IParser parser = MumlParserProvider.getParser(MumlElementTypes.ClockConstraint_3036,
				view.getElement() != null ? view.getElement() : view,
				MumlVisualIDRegistry.getType(WrappingLabel5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RealtimestatechartDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5053); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSynchronizationChannel_3037Text(View view) {
		IParser parser = MumlParserProvider.getParser(MumlElementTypes.SynchronizationChannel_3037,
				view.getElement() != null ? view.getElement() : view,
				MumlVisualIDRegistry.getType(WrappingLabel6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RealtimestatechartDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5054); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEntryPoint_3040Text(View view) {
		EntryPoint domainModelElement = (EntryPoint) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			RealtimestatechartDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 3040); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExitPoint_3041Text(View view) {
		ExitPoint domainModelElement = (ExitPoint) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			RealtimestatechartDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 3041); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRegion_3042Text(View view) {
		IParser parser = MumlParserProvider.getParser(MumlElementTypes.Region_3042,
				view.getElement() != null ? view.getElement() : view,
				MumlVisualIDRegistry.getType(RegionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RealtimestatechartDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5063); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRealtimeStatechart_3043Text(View view) {
		RealtimeStatechart domainModelElement = (RealtimeStatechart) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			RealtimestatechartDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 3043); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTransition_4003Text(View view) {
		IParser parser = MumlParserProvider.getParser(MumlElementTypes.Transition_4003,
				view.getElement() != null ? view.getElement() : view,
				MumlVisualIDRegistry.getType(WrappingLabel8EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RealtimestatechartDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6005); //$NON-NLS-1$
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
