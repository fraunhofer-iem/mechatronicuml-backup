package org.muml.uppaal.adapter.blackbox;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.m2m.qvt.oml.blackbox.java.Operation;
import org.eclipse.m2m.qvt.oml.util.IContext;
import org.muml.uppaal.NTA;
import org.muml.uppaal.job.VerifyTAOperation;
import org.muml.uppaal.options.Options;
import org.muml.uppaal.requirements.PropertyRepository;
import org.muml.uppaal.trace.diagnostictrace.TraceRepository;

public class TraceLibrary {

	public TraceLibrary() {}
	
	@Operation(withExecutionContext=true)
	public TraceRepository verifyta(IContext context, NTA nta, PropertyRepository properties, Options options) throws CoreException {
		
		assert nta != null && properties != null;
		
		VerifyTAOperation verifyta = new VerifyTAOperation(nta, properties, options);
		
		IProgressMonitor monitor = context.getProgressMonitor();
		if (monitor == null)
			monitor = new NullProgressMonitor();
		
		try {
			verifyta.run(monitor);
				
			return verifyta.getTraceRepository();
		}
		catch(OperationCanceledException e) {
			// avoid error propagation by QVTo, just cancel execution
			monitor.setCanceled(true);
			
			return null;
		}
	}
}
