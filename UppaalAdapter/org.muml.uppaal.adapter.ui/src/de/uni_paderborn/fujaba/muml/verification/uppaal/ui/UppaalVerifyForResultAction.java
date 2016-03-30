package de.uni_paderborn.fujaba.muml.verification.uppaal.ui;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.Shell;
import org.muml.pim.pattern.AbstractCoordinationPattern;

import de.uni_paderborn.fujaba.muml.verification.uppaal.job.VerifyForResultsJob;

public class UppaalVerifyForResultAction extends AbstractUppaalAction {

	@Override
	public Object executeJobSpecific(ExecutionEvent event, Shell shell, ISelection selection,
			EditingDomain editingDomain) {
		// Schedule the verification job
		if(verifiableElement instanceof AbstractCoordinationPattern)
			verifiableElement = convertAbstractCoordinationPatternToCoordinationProtocol(event);
		
		UppaalVerifyForResultWizard wizard = new UppaalVerifyForResultWizard();
		Job job = new VerifyForResultsJob(verifiableElement, wizard, wizard, new PropertiesResultWizard());
		job.setUser(true);
		job.schedule();

		return CommandResult.newOKCommandResult();
	}
}
