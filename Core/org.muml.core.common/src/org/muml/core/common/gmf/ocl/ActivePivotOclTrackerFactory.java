package org.muml.core.common.gmf.ocl;

import org.eclipse.gmf.tooling.runtime.ocl.tracker.OclTracker;
import org.eclipse.gmf.tooling.runtime.ocl.tracker.OclTrackerFactory;

public class ActivePivotOclTrackerFactory implements OclTrackerFactory {

	@Override
	public OclTracker createOclTracker(String expressionBody, boolean cached) {
		return new ActivePivotOclTracker(expressionBody, cached);
	}

	@Override
	public Type getImplementationType() {
		// as in org.eclipse.gmf.tooling.runtime.impl.ocl.tracker.activeocl.ActiveOclTrackerFactory
		return Type.DEFAULT_GMFT;
	}

}
