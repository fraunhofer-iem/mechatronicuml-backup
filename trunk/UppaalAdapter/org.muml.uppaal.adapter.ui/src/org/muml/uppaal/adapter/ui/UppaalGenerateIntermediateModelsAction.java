package org.muml.uppaal.adapter.ui;

import org.muml.uppaal.adapter.job.VerifyForResultsJob;

public class UppaalGenerateIntermediateModelsAction extends UppaalVerifyForResultAction {

	protected VerifyForResultsJob createJob() {
		VerifyForResultsJob job = super.createJob();
		job.setStoreIntermediateModels(true);
		return job;
	}

}
