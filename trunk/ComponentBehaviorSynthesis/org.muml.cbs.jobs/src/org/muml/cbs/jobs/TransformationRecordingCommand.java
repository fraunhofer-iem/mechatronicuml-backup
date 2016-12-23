package org.muml.cbs.jobs;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.m2m.qvt.oml.ExecutionContext;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;

public class TransformationRecordingCommand extends RecordingCommand {

	private TransformationExecutor executor;
	private ExecutionContext context;
	private ModelExtent inoutExtent;
	private Diagnostic diagnostic;
	

	public TransformationRecordingCommand(TransactionalEditingDomain domain,
			String label, String description, TransformationExecutor executor, ExecutionContext context, ModelExtent inoutExtent) {
		super(domain, label, description);
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
