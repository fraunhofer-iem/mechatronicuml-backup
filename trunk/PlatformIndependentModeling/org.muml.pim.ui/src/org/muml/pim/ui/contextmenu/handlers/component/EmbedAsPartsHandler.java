package org.muml.pim.ui.contextmenu.handlers.component;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.NotEnabledException;
import org.eclipse.core.commands.NotHandledException;
import org.eclipse.core.commands.common.NotDefinedException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchSite;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.commands.ICommandService;
import org.eclipse.ui.handlers.HandlerUtil;
import org.muml.pim.component.Component;
import org.muml.pim.component.ComponentPackage;

public class EmbedAsPartsHandler extends AbstractHandler {
	public static final String COMMAND_ID_OF_COMPONENT_DIAGRAM_EMBEDASPART_HANDER = "org.muml.pim.component.diagram.custom.embedAsParts.editorcmd";

	public EmbedAsPartsHandler() {
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		// get and process current selection
		IWorkbenchWindow window = HandlerUtil
				.getActiveWorkbenchWindowChecked(event);
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		IWorkbenchSite edit = HandlerUtil.getActiveSite(event);
		ICommandService service = (ICommandService) edit
				.getService(ICommandService.class);

		EditingDomain editingDomain = null;

		List<Component> objects = new ArrayList<Component>();

		org.eclipse.emf.ecore.resource.Resource ecoreResource = null;
		for (Object selectedElement : ((IStructuredSelection) selection)
				.toArray()) {
			EObject object = null;
			/**
			 * If the graphical editor is installed, we explicitly call the
			 * graphical command, which creates a new view
			 */

			org.eclipse.core.commands.Command graphicalCommand = service
					.getCommand(COMMAND_ID_OF_COMPONENT_DIAGRAM_EMBEDASPART_HANDER);
			if (selectedElement instanceof GraphicalEditPart
					&& graphicalCommand != null) {

				try {
					return graphicalCommand.executeWithChecks(event);
				} catch (NotDefinedException | NotEnabledException
						| NotHandledException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (selectedElement instanceof IAdaptable) {
				IAdaptable adaptable = (IAdaptable) selectedElement;
				selectedElement = adaptable.getAdapter(EObject.class);
			}
			if (selectedElement instanceof EObject) {
				object = (EObject) selectedElement;
			}
			if (object != null
					&& ComponentPackage.Literals.COMPONENT.isSuperTypeOf(object
							.eClass())) {
				if (ecoreResource == null) {
					ecoreResource = object.eResource();
				} else if (ecoreResource != object.eResource()) {
					continue;
				}
				objects.add((Component) object);
			}
		}

		if (!objects.isEmpty() && editingDomain == null) {
			editingDomain = AdapterFactoryEditingDomain
					.getEditingDomainFor(objects.get(0));
			EmbedAsPartsCommand command = new EmbedAsPartsCommand(
					editingDomain, objects);
			editingDomain.getCommandStack().execute(command);
		}

		return null;

	}

}
