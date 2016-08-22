package org.muml.uppaal.adapter.job;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.muml.core.NamedElement;
import org.muml.pim.constraint.VerifiableElement;
import org.muml.pim.constraint.VerificationConstraintRepository;
import org.muml.uppaal.adapter.job.interfaces.VerificationOptionsProvider;
import org.muml.uppaal.adapter.job.interfaces.VerificationPropertyChoiceProvider;
import org.muml.uppaal.adapter.job.interfaces.VerificationPropertyResultAcceptor;
import org.muml.uppaal.adapter.job.operations.PrepareModelOperation;
import org.muml.uppaal.adapter.job.operations.TransformationOperation;
import org.muml.uppaal.adapter.mtctl.Property;
import org.muml.uppaal.adapter.results.PropertyResultRepository;
import org.muml.uppaal.options.Options;

public class VerifyForResultsJob extends Job {
	
	protected VerificationOptionsProvider optionsProvider;
	protected VerificationPropertyChoiceProvider propertyChoiceProvider;
	protected VerificationPropertyResultAcceptor propertyResultAcceptor;
	protected VerifiableElement verifiableElement;
	private boolean storeIntermediateModels;
	

	public VerifyForResultsJob(VerifiableElement verifiableElement, VerificationOptionsProvider optionsProvider, VerificationPropertyChoiceProvider propertyChoiceProvider, VerificationPropertyResultAcceptor propertyResultAcceptor) {
		super("Verifying "+((NamedElement) verifiableElement).getName());
		this.verifiableElement = verifiableElement;
		this.optionsProvider = optionsProvider;
		this.propertyChoiceProvider = propertyChoiceProvider;
		this.propertyResultAcceptor = propertyResultAcceptor;
	}

	public boolean isStoreIntermediateModels() {
		return storeIntermediateModels;
	}

	public void setStoreIntermediateModels(boolean storeIntermediateModels) {
		this.storeIntermediateModels = storeIntermediateModels;
	}
	
	@Override
	protected IStatus run(IProgressMonitor monitor) {
		
		try {
			SubMonitor subMonitor = SubMonitor.convert(monitor, this.getName(), 100);
			
			//Clone model, mark verifiable element, etc.
			PrepareModelOperation prepareOperation = new PrepareModelOperation(verifiableElement);
			try {
				prepareOperation.run(subMonitor.newChild(10));
			}
			catch(CoreException e) {
				return e.getStatus();
			}
			
			verifiableElement = prepareOperation.getClonedVerifiableElement();
			ModelExtent mainInputExtent = prepareOperation.getClonedExtent();
			
			//Prepare other necessary information (typically: show verification wizard)
			if (!propertyChoiceProvider.preparePropertyChoiceProvider(verifiableElement))
				return Status.CANCEL_STATUS;
			if (!optionsProvider.prepareOptionsProvider(verifiableElement))
				return Status.CANCEL_STATUS;
			
			//Remove the properties that are not supposed to be verified
			Iterator<VerificationConstraintRepository> repoIt = verifiableElement.getVerificationConstraintRepositories().iterator();
			while (repoIt.hasNext()) {
				//Remove constraints not chosen
				org.muml.uppaal.adapter.mtctl.PropertyRepository repo = (org.muml.uppaal.adapter.mtctl.PropertyRepository) repoIt.next();
				Iterator<Property> it = repo.getProperties().iterator();
				while (it.hasNext()) {
					Property property = it.next();
					if (!propertyChoiceProvider.isChosen(property))
						it.remove();
				}
			}
			
			// set input and output extents for verification job
			TransformationOperation verifyOperation = new TransformationOperation("Running verification process", URI.createPlatformPluginURI("/org.muml.uppaal.adapter.transformation/transforms/VerifiableElement2Results.qvto", true));
			ModelExtent resultExtent = new BasicModelExtent();
			ModelExtent optionsExtent = new BasicModelExtent(Arrays.asList(new Options[] {optionsProvider.getOptions()}));
			verifyOperation.setTransformationParameters(mainInputExtent, optionsExtent, resultExtent);
			
			// Set config properties
			Map<String, Object> configProperties = new HashMap<String, Object>();
			configProperties.put(TransformationOperation.CONFIG_STORE_INTERMEDIATE_MODELS, storeIntermediateModels);
			verifyOperation.setTransformationConfigProperties(configProperties);
			
			// Run verification job
			try {
				verifyOperation.run(subMonitor.newChild(90));
			}
			catch(CoreException e) {
				return e.getStatus();
			}
						
			//Show results
			subMonitor.subTask("Showing Results");
			propertyResultAcceptor.acceptResult((PropertyResultRepository) resultExtent.getContents().get(0));
			
			return Status.OK_STATUS;
		}
		finally {
			monitor.done();
		}
	}
}
