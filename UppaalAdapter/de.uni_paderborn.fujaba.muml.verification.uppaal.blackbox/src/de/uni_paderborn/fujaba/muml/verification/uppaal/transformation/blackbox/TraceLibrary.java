package de.uni_paderborn.fujaba.muml.verification.uppaal.transformation.blackbox;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;

import de.uni_paderborn.fujaba.muml.verification.uppaal.job.TransformationJob;
import de.uni_paderborn.fujaba.muml.verification.uppaal.job.VerifyTAJob;
import de.uni_paderborn.fujaba.muml.verification.uppaal.options.Options;
import de.uni_paderborn.uppaal.NTA;
import de.uni_paderborn.uppaal.requirements.PropertyRepository;
import de.uni_paderborn.uppaal.trace.diagnosticTrace.TraceRepository;

public class TraceLibrary {

	public TraceLibrary() {}
	
	public TraceRepository verifyta(NTA nta, PropertyRepository properties, Options options) {
		
		assert nta != null && properties != null;
		
		VerifyTAJob uppaalJob = new VerifyTAJob(nta, properties, options);
		
		IProgressMonitor monitor = TransformationJob.getProgressMonitor();
		if (monitor == null)
			monitor = new NullProgressMonitor();
		
		uppaalJob.execute(monitor);
		
		return uppaalJob.getTraceRepository();
		
	}
	
}
