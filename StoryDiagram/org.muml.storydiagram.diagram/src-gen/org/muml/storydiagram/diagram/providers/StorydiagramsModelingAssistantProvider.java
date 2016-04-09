package org.muml.storydiagram.diagram.providers;

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
import org.muml.storydiagram.diagram.edit.parts.ActivityCallNodeEditPart;
import org.muml.storydiagram.diagram.edit.parts.ActivityEditPart;
import org.muml.storydiagram.diagram.edit.parts.ActivityFinalNodeEditPart;
import org.muml.storydiagram.diagram.edit.parts.CollectionVariableEditPart;
import org.muml.storydiagram.diagram.edit.parts.FlowFinalNodeEditPart;
import org.muml.storydiagram.diagram.edit.parts.InitialNodeEditPart;
import org.muml.storydiagram.diagram.edit.parts.JunctionNodeEditPart;
import org.muml.storydiagram.diagram.edit.parts.MatchingPatternEditPart;
import org.muml.storydiagram.diagram.edit.parts.MatchingPatternStoryPatternContentCompartmentEditPart;
import org.muml.storydiagram.diagram.edit.parts.MatchingStoryNodeEditPart;
import org.muml.storydiagram.diagram.edit.parts.MatchingStoryNodeStoryNodePatternCompartmentEditPart;
import org.muml.storydiagram.diagram.edit.parts.ModifyingStoryNodeEditPart;
import org.muml.storydiagram.diagram.edit.parts.ModifyingStoryNodeStoryNodePatternCompartmentEditPart;
import org.muml.storydiagram.diagram.edit.parts.ObjectVariableEditPart;
import org.muml.storydiagram.diagram.edit.parts.StatementNodeEditPart;
import org.muml.storydiagram.diagram.edit.parts.StoryPatternEditPart;
import org.muml.storydiagram.diagram.edit.parts.StoryPatternStoryPatternContentCompartmentEditPart;
import org.muml.storydiagram.diagram.part.Messages;
import org.muml.storydiagram.diagram.part.StorydiagramsDiagramEditorPlugin;

/**
 * @generated
 */
public class StorydiagramsModelingAssistantProvider extends ModelingAssistantProvider {

	/**
	 * @generated
	 */
	public EObject selectExistingElementForSource(IAdaptable target, IElementType relationshipType) {
		return selectExistingElement(target, getTypesForSource(target, relationshipType));
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForTarget(IAdaptable source, IElementType relationshipType) {
		return selectExistingElement(source, getTypesForTarget(source, relationshipType));
	}

	/**
	 * @generated
	 */
	protected EObject selectExistingElement(IAdaptable host, Collection types) {
		if (types.isEmpty()) {
			return null;
		}
		IGraphicalEditPart editPart = (IGraphicalEditPart) host.getAdapter(IGraphicalEditPart.class);
		if (editPart == null) {
			return null;
		}
		Diagram diagram = (Diagram) editPart.getRoot().getContents().getModel();
		HashSet<EObject> elements = new HashSet<EObject>();
		for (Iterator<EObject> it = diagram.getElement().eAllContents(); it.hasNext();) {
			EObject element = it.next();
			if (isApplicableElement(element, types)) {
				elements.add(element);
			}
		}
		if (elements.isEmpty()) {
			return null;
		}
		return selectElement((EObject[]) elements.toArray(new EObject[elements.size()]));
	}

	/**
	 * @generated
	 */
	protected boolean isApplicableElement(EObject element, Collection types) {
		IElementType type = ElementTypeRegistry.getInstance().getElementType(element);
		return types.contains(type);
	}

	/**
	 * @generated
	 */
	protected EObject selectElement(EObject[] elements) {
		Shell shell = Display.getCurrent().getActiveShell();
		ILabelProvider labelProvider = new AdapterFactoryLabelProvider(
				StorydiagramsDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(shell, labelProvider);
		dialog.setMessage(Messages.StorydiagramsModelingAssistantProviderMessage);
		dialog.setTitle(Messages.StorydiagramsModelingAssistantProviderTitle);
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}
