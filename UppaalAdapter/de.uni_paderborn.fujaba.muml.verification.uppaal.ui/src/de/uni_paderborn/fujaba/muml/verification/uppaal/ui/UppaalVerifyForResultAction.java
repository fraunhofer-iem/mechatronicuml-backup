package de.uni_paderborn.fujaba.muml.verification.uppaal.ui;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import de.uni_paderborn.fujaba.muml.constraint.VerifiableElement;
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
	
		//Schedule the verification job
		UppaalVerifyForResultWizard wizard = new UppaalVerifyForResultWizard();
		Job job = new VerifyForResultsJob(verifiableElement, wizard, wizard, new PropertiesResultWizard());
		job.setUser(true);
		job.schedule();
		
		return CommandResult.newOKCommandResult();
	}
}
