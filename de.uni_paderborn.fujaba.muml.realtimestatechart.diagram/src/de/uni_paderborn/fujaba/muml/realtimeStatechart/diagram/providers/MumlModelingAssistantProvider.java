package de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.modelingassistant.ModelingAssistantProvider;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

/**
 * @generated
 */
public class MumlModelingAssistantProvider extends ModelingAssistantProvider {

	/**
	 * @generated
	 */
	public List getTypesForPopupBar(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.ModelElementCategoryEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes.RealtimeStatechart_2007);
			return types;
		}
		if (editPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(8);
			types.add(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes.EntryPoint_3040);
			types.add(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes.ExitPoint_3041);
			types.add(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes.EntryEvent_3033);
			types.add(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes.DoEvent_3034);
			types.add(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes.ExitEvent_3035);
			types.add(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes.Region_3038);
			types.add(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes.SynchronizationChannel_3037);
			types.add(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes.ClockConstraint_3036);
			return types;
		}
		if (editPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.RegionEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes.RealtimeStatechart_3039);
			return types;
		}
		if (editPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.RealtimeStatechartStatechartContentsCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes.State_3032);
			return types;
		}
		if (editPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.RealtimeStatechartStatechartContentsCompartment2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.MumlElementTypes.State_3032);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateEditPart) {
			return ((de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.EntryPointEditPart) {
			return ((de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.EntryPointEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.ExitPointEditPart) {
			return ((de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.ExitPointEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateEditPart) {
			return ((de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.EntryPointEditPart) {
			return ((de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.EntryPointEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.ExitPointEditPart) {
			return ((de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.ExitPointEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateEditPart) {
			return ((de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.EntryPointEditPart) {
			return ((de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.EntryPointEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.ExitPointEditPart) {
			return ((de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.ExitPointEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateEditPart) {
			return ((de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.EntryPointEditPart) {
			return ((de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.EntryPointEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.ExitPointEditPart) {
			return ((de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.ExitPointEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateEditPart) {
			return ((de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.StateEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.EntryPointEditPart) {
			return ((de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.EntryPointEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.ExitPointEditPart) {
			return ((de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.edit.parts.ExitPointEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForSource(IAdaptable target,
			IElementType relationshipType) {
		return selectExistingElement(target,
				getTypesForSource(target, relationshipType));
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForTarget(IAdaptable source,
			IElementType relationshipType) {
		return selectExistingElement(source,
				getTypesForTarget(source, relationshipType));
	}

	/**
	 * @generated
	 */
	protected EObject selectExistingElement(IAdaptable host, Collection types) {
		if (types.isEmpty()) {
			return null;
		}
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart == null) {
			return null;
		}
		Diagram diagram = (Diagram) editPart.getRoot().getContents().getModel();
		HashSet<EObject> elements = new HashSet<EObject>();
		for (Iterator<EObject> it = diagram.getElement().eAllContents(); it
				.hasNext();) {
			EObject element = it.next();
			if (isApplicableElement(element, types)) {
				elements.add(element);
			}
		}
		if (elements.isEmpty()) {
			return null;
		}
		return selectElement((EObject[]) elements.toArray(new EObject[elements
				.size()]));
	}

	/**
	 * @generated
	 */
	protected boolean isApplicableElement(EObject element, Collection types) {
		IElementType type = ElementTypeRegistry.getInstance().getElementType(
				element);
		return types.contains(type);
	}

	/**
	 * @generated
	 */
	protected EObject selectElement(EObject[] elements) {
		Shell shell = Display.getCurrent().getActiveShell();
		ILabelProvider labelProvider = new AdapterFactoryLabelProvider(
				de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
						.getInstance().getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				shell, labelProvider);
		dialog.setMessage(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.Messages.MumlModelingAssistantProviderMessage);
		dialog.setTitle(de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.part.Messages.MumlModelingAssistantProviderTitle);
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}
