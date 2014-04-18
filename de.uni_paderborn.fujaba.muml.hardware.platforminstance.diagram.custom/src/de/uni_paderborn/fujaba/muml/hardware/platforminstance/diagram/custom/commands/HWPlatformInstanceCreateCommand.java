package de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.custom.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.PlatformUI;

import de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.custom.wizard.PlatformInstanceWizard;

/**
 * @generated
 */
public class HWPlatformInstanceCreateCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	public HWPlatformInstanceCreateCommand(CreateElementRequest req) {
		super(req.getLabel(), null, req);
	}

	/**
	 * FIXME: replace with setElementToEdit()
	 * @generated
	 */
	protected EObject getElementToEdit() {
		EObject container = ((CreateElementRequest) getRequest())
				.getContainer();
		if (container instanceof View) {
			container = ((View) container).getElement();
		}
		return container;
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		return true;

	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
	//	de.uni_paderborn.fujaba.muml.hardware.platforminstance.HWPlatformInstance newElement = de.uni_paderborn.fujaba.muml.hardware.platforminstance.PlatforminstanceFactory.eINSTANCE
	//			.createHWPlatformInstance();

		de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstanceConfiguration owner = (de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstanceConfiguration) getElementToEdit();
		owner.getHwplatformInstances();
		
		// Create wizard
		INewWizard wizard = new PlatformInstanceWizard(owner, TransactionUtil.getEditingDomain(owner));
		wizard.init(PlatformUI.getWorkbench(),null);

		// Open wizard dialog
		WizardDialog dialog = new WizardDialog(Display.getDefault().getActiveShell(), wizard);
		if(dialog.open()==Window.OK){
			return CommandResult.newOKCommandResult();
		}
		else{
			return CommandResult.newCancelledCommandResult();
		}
		
		
	//	doConfigure(newElement, monitor, info);

//		((CreateElementRequest) getRequest()).setNewElement(newElement);
		
	}

}
