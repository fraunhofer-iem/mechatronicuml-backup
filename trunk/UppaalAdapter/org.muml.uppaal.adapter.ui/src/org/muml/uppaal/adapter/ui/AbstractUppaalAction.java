package org.muml.uppaal.adapter.ui;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.muml.pim.constraint.VerifiableElement;
import org.muml.pim.pattern.AbstractCoordinationPattern;
import org.muml.pim.pattern.diagram.custom.export.wizard.PatternVerificationWizard;
import org.muml.pim.protocol.AbstractCoordinationSpecification;
import org.muml.pim.protocol.CoordinationProtocol;
import org.muml.pim.protocol.Role;
import org.muml.pim.realtimestatechart.RealtimeStatechart;

public abstract class AbstractUppaalAction extends AbstractHandler {

	protected VerifiableElement verifiableElement;

	@Override
	public Object execute(final ExecutionEvent event) throws ExecutionException {
		if (org.muml.uppaal.adapter.log.UppaalAdapterLogPlugin.getDefault().shouldDoStatisticalEvaluation()) {
			org.muml.uppaal.adapter.log.UppaalAdapterLogPlugin.getDefault().startEvaluationIteration();
			org.muml.uppaal.adapter.log.UppaalAdapterLogPlugin.getDefault().logInfo("Started Uppaal Action.");
			org.muml.uppaal.adapter.log.UppaalAdapterLogPlugin.getDefault().setRestartRunnable(new Runnable() {
				@Override
				public void run() {
					try {
						execute(event);
					} catch (ExecutionException e) {
						e.printStackTrace();
					}
				}			
			});
		}
		
		Shell shell = HandlerUtil.getActiveWorkbenchWindow(event).getShell();
		IStructuredSelection selection = (IStructuredSelection) HandlerUtil.getCurrentSelection(event);

		Object selectedElement = selection.getFirstElement();

		if (selectedElement instanceof IAdaptable) {
			IAdaptable adaptable = (IAdaptable) selectedElement;
			verifiableElement = (VerifiableElement) adaptable.getAdapter(VerifiableElement.class);
		}
		if (selectedElement instanceof VerifiableElement) {
			verifiableElement = (VerifiableElement) selectedElement;
		}
		if (verifiableElement == null) {
			// this code should not be reached since the command should only be
			// visible on AbstractCoordinationSpecifications, but just to be
			// sure!
			return CommandResult.newErrorCommandResult("No verifiable element selected!");
		}
		if (verifiableElement instanceof AbstractCoordinationSpecification) {
			for (Role role : ((AbstractCoordinationSpecification) verifiableElement).getRoles()) {
				if (role.getBehavior() instanceof RealtimeStatechart
						&& ((RealtimeStatechart) role.getBehavior()).isUsesOneToManyCommunicationSchemata()) {
					ErrorDialog dialog = new ErrorDialog(shell, "ERROR when starting the Uppaal model checking", null,
							new org.eclipse.core.runtime.Status(IStatus.ERROR,
									"org.muml.uppaal.adapter.ui",
									"Disassemble the One2Many Schemata of RealtimeStatecharts before the Uppaal Model Checking!"),
							IStatus.ERROR);
					dialog.open();
					return CommandResult.newErrorCommandResult(
							"Disassemble the One2Many Schemata of RealtimeStatecharts before the Uppaal Model Checking!");
				}
			}
		}
		EditingDomain editingDomain = AdapterFactoryEditingDomain.getEditingDomainFor(verifiableElement);

		return executeJobSpecific(event, shell, selection, editingDomain);
	}

	protected CoordinationProtocol convertAbstractCoordinationPatternToCoordinationProtocol(ExecutionEvent event) {
		IWorkbenchWindow workbenchWindow = HandlerUtil.getActiveWorkbenchWindow(event);
		IStructuredSelection selection = (IStructuredSelection) HandlerUtil.getCurrentSelection(event);
		PatternVerificationWizard patternWizard = new PatternVerificationWizard();
		patternWizard.init(workbenchWindow.getWorkbench(), selection, (AbstractCoordinationPattern) verifiableElement);
		WizardDialog wizardDialog = new WizardDialog(HandlerUtil.getActiveShell(event), patternWizard);
		wizardDialog.open();
		patternWizard.getTransformedCoordinationProtocolFromCoordinationPattern();
		return (CoordinationProtocol) patternWizard.getTransformedCoordinationProtocolFromCoordinationPattern();
	}

	protected abstract Object executeJobSpecific(ExecutionEvent event, Shell shell, ISelection selection,
			EditingDomain editingDomain);

}