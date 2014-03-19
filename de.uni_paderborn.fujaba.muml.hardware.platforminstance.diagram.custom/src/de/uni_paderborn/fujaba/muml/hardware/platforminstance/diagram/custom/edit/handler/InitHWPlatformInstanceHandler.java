package de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.custom.edit.handler;

import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

import de.uni_paderborn.fujaba.muml.hardware.platforminstance.HWPlatformInstanceConfiguration;
import de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.custom.wizard.PlatformInstanceWizard;
import de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceConfigurationEditPart;



public class InitHWPlatformInstanceHandler extends AbstractHandler {

	public InitHWPlatformInstanceHandler() {
	}

	
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil
				.getActiveWorkbenchWindowChecked(event);

		// get and process current selection
		ISelection selection = HandlerUtil.getCurrentSelection(event);

		// collect all StaticStructureComponents from the selection
		Iterator iter = ((IStructuredSelection) selection).iterator();
		while (iter.hasNext()) {
			GraphicalEditPart editPart = (GraphicalEditPart) iter.next();

			if (editPart instanceof HWPlatformInstanceConfigurationEditPart) {
				HWPlatformInstanceConfiguration hwplatformInstanceConfig = (HWPlatformInstanceConfiguration) ((View) editPart.getModel())
						.getElement();
			
				// Create wizard
				INewWizard wizard = new PlatformInstanceWizard(hwplatformInstanceConfig, editPart.getEditingDomain());
				wizard.init(PlatformUI.getWorkbench(), (IStructuredSelection) selection);

				// Open wizard dialog
				WizardDialog dialog = new WizardDialog(window.getShell(), wizard);
				dialog.open();
				}
			}
		
		return null;

	}
	
	

		
	}


