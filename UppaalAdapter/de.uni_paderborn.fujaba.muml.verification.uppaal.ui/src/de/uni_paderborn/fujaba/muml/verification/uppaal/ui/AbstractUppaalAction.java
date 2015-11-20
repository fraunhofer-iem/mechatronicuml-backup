package de.uni_paderborn.fujaba.muml.verification.uppaal.ui;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import de.uni_paderborn.fujaba.muml.constraint.VerifiableElement;
import de.uni_paderborn.fujaba.muml.pattern.AbstractCoordinationPattern;
import de.uni_paderborn.fujaba.muml.pattern.diagram.custom.export.wizard.PatternVerificationWizard;
import de.uni_paderborn.fujaba.muml.protocol.CoordinationProtocol;

public abstract class AbstractUppaalAction extends AbstractHandler {
	
	protected VerifiableElement verifiableElement;	
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Shell shell = HandlerUtil.getActiveWorkbenchWindow(event).getShell();
		IStructuredSelection selection = (IStructuredSelection)HandlerUtil.getCurrentSelection(event);
		
		Object selectedElement = selection.getFirstElement();
		
		if(selectedElement instanceof IAdaptable) {
			IAdaptable adaptable = (IAdaptable) selectedElement;
			verifiableElement = (VerifiableElement) adaptable.getAdapter(VerifiableElement.class);
		}
		if (selectedElement instanceof VerifiableElement) {
			verifiableElement = (VerifiableElement)selectedElement;
		}
		if(verifiableElement == null) {
			 // this code should not be reached since the command should only be visible on AbstractCoordinationSpecifications, but just to be sure!
			 return CommandResult.newErrorCommandResult("No verifiable element selected!");
		}
		EditingDomain editingDomain = AdapterFactoryEditingDomain
				.getEditingDomainFor(verifiableElement);			
		
		return executeJobSpecific(event,shell,selection,editingDomain);
	}
	
	protected CoordinationProtocol convertAbstractCoordinationPatternToCoordinationProtocol(ExecutionEvent event) {
		IWorkbenchWindow workbenchWindow = HandlerUtil.getActiveWorkbenchWindow(event);	
		IStructuredSelection selection = (IStructuredSelection)HandlerUtil.getCurrentSelection(event);
		PatternVerificationWizard patternWizard = new PatternVerificationWizard();
		patternWizard.init(workbenchWindow.getWorkbench(), selection, (AbstractCoordinationPattern)verifiableElement);
		WizardDialog wizardDialog = new WizardDialog(HandlerUtil.getActiveShell(event), patternWizard);
		wizardDialog.open();
		patternWizard.getTransformedCoordinationProtocolFromCoordinationPattern();
		return (CoordinationProtocol) patternWizard.getTransformedCoordinationProtocolFromCoordinationPattern();
	}
	
	protected abstract Object executeJobSpecific(ExecutionEvent event, Shell shell, ISelection selection, EditingDomain editingDomain);

}