package org.muml.cbs.jobs;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.edit.command.ChangeCommand;
import org.eclipse.m2m.qvt.oml.ExecutionContext;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;

public class TransformationChangeCommand extends ChangeCommand {

	private TransformationExecutor executor;
	private ExecutionContext context;
	private ModelExtent inoutExtent;
	private Diagnostic diagnostic;
	

	public TransformationChangeCommand(Notifier notifier, TransformationExecutor executor, ExecutionContext context, ModelExtent inoutExtent) {
		super(notifier);
		this.executor = executor; 
		this.context = context;
		this.inoutExtent = inoutExtent;
	}

	@Override
	protected void doExecute() {
		diagnostic = executor.execute(context, inoutExtent);
	}
	
	public Diagnostic getDiagnostic() {
		return diagnostic;
	}

}
