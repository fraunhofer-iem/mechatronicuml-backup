package de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.custom.edit.handler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

import de.uni_paderborn.fujaba.common.edit.commands.StoringExecuteQvtoTransformationCommand;
import de.uni_paderborn.fujaba.muml.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.component.DiscretePort;
import de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPlatform;
import de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage;
import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstanceConfiguration;
import de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.custom.part.Activator;
import de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.custom.wizard.PlatformInstanceWizard;
import de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceConfigurationEditPart;

public class InitHWPlatformInstanceHandler extends AbstractHandler {

	public Object execute(ExecutionEvent event) throws ExecutionException {

		EditingDomain editingDomain = null;

		ISelection selection = HandlerUtil.getCurrentSelection(event);

		List<HWPlatform> objects = new ArrayList<HWPlatform>();

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
			if (object != null && HwplatformPackage.Literals.HW_PLATFORM.isSuperTypeOf(object.eClass())) {
				if (ecoreResource == null) {
					ecoreResource = object.eResource();
				} else if (ecoreResource != object.eResource()) {
					continue;
				}
				objects.add((HWPlatform) object);
			}
		}

		if (!objects.isEmpty() && editingDomain == null) {
			editingDomain = AdapterFactoryEditingDomain.getEditingDomainFor(objects.get(0));
			ModelExtent inputExtent = new BasicModelExtent(objects);
			ModelExtent outputExtent = new BasicModelExtent();
			final TransformationExecutor transformationExecutor = Activator.getDefault().getTransformationExecutor();

			StoringExecuteQvtoTransformationCommand command = new StoringExecuteQvtoTransformationCommand(
					transformationExecutor, inputExtent, outputExtent);

			if (command.canExecute()) {
				editingDomain.getCommandStack().execute(command);
			}

			if (!command.hasChanged() && editingDomain.getCommandStack().canUndo()) {
				editingDomain.getCommandStack().undo();
			}
		}

		return null;

	}

}
