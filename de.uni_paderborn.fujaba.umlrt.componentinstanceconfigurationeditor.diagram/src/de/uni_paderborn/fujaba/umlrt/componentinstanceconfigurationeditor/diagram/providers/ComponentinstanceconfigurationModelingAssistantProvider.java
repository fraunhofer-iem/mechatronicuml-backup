package de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.providers;

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
public class ComponentinstanceconfigurationModelingAssistantProvider extends
		ModelingAssistantProvider {

	/**
	 * @generated
	 */
	public List getTypesForPopupBar(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart instanceof de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.edit.parts.ComponentInstanceConfigurationDiagramEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.providers.ComponentinstanceconfigurationElementTypes.ComponentInstance_2003);
			return types;
		}
		if (editPart instanceof de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.edit.parts.ComponentInstanceEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.providers.ComponentinstanceconfigurationElementTypes.PortInstance_3001);
			return types;
		}
		if (editPart instanceof de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.edit.parts.ComponentInstance2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.providers.ComponentinstanceconfigurationElementTypes.PortInstance_3004);
			return types;
		}
		if (editPart instanceof de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.edit.parts.ComponentInstanceComponentCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.providers.ComponentinstanceconfigurationElementTypes.ComponentInstance_3003);
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
		if (sourceEditPart instanceof de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.edit.parts.PortInstanceEditPart) {
			return ((de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.edit.parts.PortInstanceEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.edit.parts.PortInstance2EditPart) {
			return ((de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.edit.parts.PortInstance2EditPart) sourceEditPart)
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
		if (targetEditPart instanceof de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.edit.parts.PortInstanceEditPart) {
			return ((de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.edit.parts.PortInstanceEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.edit.parts.PortInstance2EditPart) {
			return ((de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.edit.parts.PortInstance2EditPart) targetEditPart)
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
		if (sourceEditPart instanceof de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.edit.parts.PortInstanceEditPart) {
			return ((de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.edit.parts.PortInstanceEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.edit.parts.PortInstance2EditPart) {
			return ((de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.edit.parts.PortInstance2EditPart) sourceEditPart)
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
		if (targetEditPart instanceof de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.edit.parts.PortInstanceEditPart) {
			return ((de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.edit.parts.PortInstanceEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.edit.parts.PortInstance2EditPart) {
			return ((de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.edit.parts.PortInstance2EditPart) targetEditPart)
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
		if (sourceEditPart instanceof de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.edit.parts.PortInstanceEditPart) {
			return ((de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.edit.parts.PortInstanceEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.edit.parts.PortInstance2EditPart) {
			return ((de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.edit.parts.PortInstance2EditPart) sourceEditPart)
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
				de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
						.getInstance().getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				shell, labelProvider);
		dialog.setMessage(de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.part.Messages.ComponentinstanceconfigurationModelingAssistantProviderMessage);
		dialog.setTitle(de.uni_paderborn.fujaba.umlrt.componentinstanceconfigurationeditor.diagram.part.Messages.ComponentinstanceconfigurationModelingAssistantProviderTitle);
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}
