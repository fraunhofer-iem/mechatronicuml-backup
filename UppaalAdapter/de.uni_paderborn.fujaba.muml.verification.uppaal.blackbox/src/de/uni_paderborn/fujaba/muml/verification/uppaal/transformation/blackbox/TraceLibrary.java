package de.uni_paderborn.fujaba.muml.verification.uppaal.transformation.blackbox;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.m2m.qvt.oml.blackbox.java.Operation;
import org.eclipse.m2m.qvt.oml.util.IContext;

import de.uni_paderborn.fujaba.muml.verification.uppaal.options.Options;
import de.uni_paderborn.uppaal.NTA;
import de.uni_paderborn.uppaal.job.VerifyTAOperation;
import de.uni_paderborn.uppaal.requirements.PropertyRepository;
import de.uni_paderborn.uppaal.trace.diagnosticTrace.TraceRepository;

public class TraceLibrary {

	public TraceLibrary() {}
	
	@Operation(withExecutionContext=true)
	public TraceRepository verifyta(IContext context, NTA nta, PropertyRepository properties, Options options) throws CoreException {
		
		assert nta != null && properties != null;
		
		VerifyTAOperation verifyta = new VerifyTAOperation(nta, properties, options);
		
		IProgressMonitor monitor = context.getProgressMonitor();
		if (monitor == null)
			monitor = new NullProgressMonitor();
		
		// TODO run in workspace?
		verifyta.run(monitor);
		
		//ResourcesPlugin.getWorkspace().run(verifyta, monitor);
		
		//IStatus status = uppaalJob.execute(monitor);
		
//		if (!status.isOK()) {
//			// propagate failure to QVTo by throwing an exception
//			throw new CoreException(status);
//		}
		
		return verifyta.getTraceRepository();
		
	}
	
}
