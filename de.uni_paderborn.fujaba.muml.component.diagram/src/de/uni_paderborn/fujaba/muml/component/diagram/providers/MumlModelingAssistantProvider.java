package de.uni_paderborn.fujaba.muml.component.diagram.providers;

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
		if (editPart instanceof de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.ModelElementCategoryEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(de.uni_paderborn.fujaba.muml.component.diagram.providers.MumlElementTypes.AtomicComponent_2006);
			types.add(de.uni_paderborn.fujaba.muml.component.diagram.providers.MumlElementTypes.StaticStructuredComponent_2005);
			return types;
		}
		if (editPart instanceof de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.AtomicComponentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(3);
			types.add(de.uni_paderborn.fujaba.muml.component.diagram.providers.MumlElementTypes.DiscretePort_3010);
			types.add(de.uni_paderborn.fujaba.muml.component.diagram.providers.MumlElementTypes.ContinuousPort_3011);
			types.add(de.uni_paderborn.fujaba.muml.component.diagram.providers.MumlElementTypes.HybridPort_3013);
			return types;
		}
		if (editPart instanceof de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.StaticStructuredComponentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(de.uni_paderborn.fujaba.muml.component.diagram.providers.MumlElementTypes.DiscretePort_3010);
			types.add(de.uni_paderborn.fujaba.muml.component.diagram.providers.MumlElementTypes.ContinuousPort_3011);
			return types;
		}
		if (editPart instanceof de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.ComponentPartEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(de.uni_paderborn.fujaba.muml.component.diagram.providers.MumlElementTypes.PortPart_3022);
			return types;
		}
		if (editPart instanceof de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.StaticStructuredComponentComponentCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(de.uni_paderborn.fujaba.muml.component.diagram.providers.MumlElementTypes.ComponentPart_3012);
			types.add(de.uni_paderborn.fujaba.muml.component.diagram.providers.MumlElementTypes.CoordinationProtocolOccurrence_3016);
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
		if (sourceEditPart instanceof de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.DiscretePortEditPart) {
			return ((de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.DiscretePortEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.ContinuousPortEditPart) {
			return ((de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.ContinuousPortEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.HybridPortEditPart) {
			return ((de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.HybridPortEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.PortPartEditPart) {
			return ((de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.PortPartEditPart) sourceEditPart)
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
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.DiscretePortEditPart) {
			return ((de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.DiscretePortEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.ContinuousPortEditPart) {
			return ((de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.ContinuousPortEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.HybridPortEditPart) {
			return ((de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.HybridPortEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.PortPartEditPart) {
			return ((de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.PortPartEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.CoordinationProtocolEditPart) {
			return ((de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.CoordinationProtocolEditPart) targetEditPart)
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
		if (sourceEditPart instanceof de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.DiscretePortEditPart) {
			return ((de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.DiscretePortEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.ContinuousPortEditPart) {
			return ((de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.ContinuousPortEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.HybridPortEditPart) {
			return ((de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.HybridPortEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.PortPartEditPart) {
			return ((de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.PortPartEditPart) sourceEditPart)
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
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.DiscretePortEditPart) {
			return ((de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.DiscretePortEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.ContinuousPortEditPart) {
			return ((de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.ContinuousPortEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.HybridPortEditPart) {
			return ((de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.HybridPortEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.PortPartEditPart) {
			return ((de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.PortPartEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.CoordinationProtocolEditPart) {
			return ((de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.CoordinationProtocolEditPart) targetEditPart)
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
		if (sourceEditPart instanceof de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.DiscretePortEditPart) {
			return ((de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.DiscretePortEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.ContinuousPortEditPart) {
			return ((de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.ContinuousPortEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.HybridPortEditPart) {
			return ((de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.HybridPortEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.PortPartEditPart) {
			return ((de.uni_paderborn.fujaba.muml.component.diagram.edit.parts.PortPartEditPart) sourceEditPart)
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
				de.uni_paderborn.fujaba.muml.component.diagram.part.ComponentDiagramEditorPlugin
						.getInstance().getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				shell, labelProvider);
		dialog.setMessage(de.uni_paderborn.fujaba.muml.component.diagram.part.Messages.MumlModelingAssistantProviderMessage);
		dialog.setTitle(de.uni_paderborn.fujaba.muml.component.diagram.part.Messages.MumlModelingAssistantProviderTitle);
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}
