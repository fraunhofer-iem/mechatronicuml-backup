package org.muml.pim.ui.contextmenu.handlers.component;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.muml.pim.component.AtomicComponent;
import org.muml.pim.component.ComponentKind;
import org.muml.pim.component.ComponentPackage;

public class CreateCompRTSCCopyRolePropertiesHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		EditingDomain editingDomain = null;

		ISelection selection = HandlerUtil.getCurrentSelection(event);

		List<AtomicComponent> objects = new ArrayList<AtomicComponent>();

		org.eclipse.emf.ecore.resource.Resource ecoreResource = null;
		for (Object selectedElement : ((IStructuredSelection) selection).toArray()) {
			EObject object = null;
			if (selectedElement instanceof IAdaptable) {
				IAdaptable adaptable = (IAdaptable) selectedElement;
				selectedElement = adaptable.getAdapter(EObject.class);
			}
			if (selectedElement instanceof EObject) {
				object = (EObject) selectedElement;
			}
			if (object != null && ComponentPackage.Literals.ATOMIC_COMPONENT.isSuperTypeOf(object.eClass())
					&& ((AtomicComponent) object).getComponentKind() == ComponentKind.SOFTWARE_COMPONENT) {
				if (ecoreResource == null) {
					ecoreResource = object.eResource();
				} else if (ecoreResource != object.eResource()) {
					continue;
				}
				objects.add((AtomicComponent) object);
			}
		}

		if (!objects.isEmpty() && editingDomain == null) {
			editingDomain = AdapterFactoryEditingDomain.getEditingDomainFor(objects.get(0));
			for (AtomicComponent component : objects) {
				AtomicComponent atomicComponent = (AtomicComponent) component;
				CopyRolePropertiesToPortHandler.copyRolePropertiesToPort(atomicComponent, window.getShell(),
						editingDomain);

			}

		}

		return null;
	}

}
