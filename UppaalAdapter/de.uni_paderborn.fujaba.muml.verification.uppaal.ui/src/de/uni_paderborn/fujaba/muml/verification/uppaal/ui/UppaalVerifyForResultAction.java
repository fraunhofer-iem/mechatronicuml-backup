package de.uni_paderborn.fujaba.muml.verification.uppaal.ui;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import de.uni_paderborn.fujaba.muml.constraint.VerifiableElement;
import de.uni_paderborn.fujaba.muml.pattern.CoordinationPattern;
import de.uni_paderborn.fujaba.muml.pattern.diagram.custom.export.wizard.PatternVerificationWizard;
import de.uni_paderborn.fujaba.muml.verification.uppaal.job.VerifyForResultsJob;

public class UppaalVerifyForResultAction extends AbstractHandler {

	private VerifiableElement verifiableElement;

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		//Get selected protocol
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		GraphicalEditPart editPart = ((GraphicalEditPart) ((IStructuredSelection) selection).getFirstElement());
		assert ((View) editPart.getModel()).getElement() instanceof VerifiableElement;
		verifiableElement = (VerifiableElement) ((View) editPart.getModel()).getElement();
	
		// if the verifiableElement is a CoordinationPattern, the pattern has to be transformed to a protocol first. This is done by the patternWizard
		if(verifiableElement instanceof CoordinationPattern)
		{
			IWorkbenchWindow workbenchWindow = HandlerUtil.getActiveWorkbenchWindow(event);			
			PatternVerificationWizard patternWizard = new PatternVerificationWizard();
			patternWizard.init(workbenchWindow.getWorkbench(), (IStructuredSelection)selection);
			WizardDialog wizardDialog = new WizardDialog(HandlerUtil.getActiveShell(event), patternWizard);
			wizardDialog.open();
			verifiableElement = patternWizard.getTransformedCoordinationProtocolFromCoordinationPattern();
//			try {
			//	verifiableElement.eResource().save(Collections.emptyMap() );
			//} catch (IOException e) {
				// TODO Auto-generated catch block
			//	e.printStackTrace();
		//	}
		}
		
		//Schedule the verification job
		UppaalVerifyForResultWizard wizard = new UppaalVerifyForResultWizard();
		Job job = new VerifyForResultsJob(verifiableElement, wizard, wizard, new PropertiesResultWizard());
		job.setUser(true);
		job.schedule();
		
		return CommandResult.newOKCommandResult();
	}
}
