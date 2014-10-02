package de.uni_paderborn.fujaba.muml.verification.uppaal.job;

import java.util.Arrays;
import java.util.Iterator;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.storydriven.core.NamedElement;

import de.uni_paderborn.fujaba.muml.verification.uppaal.results.PropertyResultRepository;
import de.uni_paderborn.fujaba.muml.constraint.VerifiableElement;
import de.uni_paderborn.fujaba.muml.constraint.VerificationConstraintRepository;
import de.uni_paderborn.fujaba.muml.verification.uppaal.job.interfaces.VerificationOptionsProvider;
import de.uni_paderborn.fujaba.muml.verification.uppaal.job.interfaces.VerificationPropertyChoiceProvider;
import de.uni_paderborn.fujaba.muml.verification.uppaal.job.interfaces.VerificationPropertyResultAcceptor;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Property;
import de.uni_paderborn.fujaba.muml.verification.uppaal.options.Options;

public class VerifyForResultsJob extends SynchronousJob {
	
	protected VerificationOptionsProvider optionsProvider;
	protected VerificationPropertyChoiceProvider propertyChoiceProvider;
	protected VerificationPropertyResultAcceptor propertyResultAcceptor;
	protected VerifiableElement verifiableElement;
	protected IStatus status = Status.OK_STATUS;
	
	public VerifyForResultsJob(VerifiableElement verifiableElement, VerificationOptionsProvider optionsProvider, VerificationPropertyChoiceProvider propertyChoiceProvider, VerificationPropertyResultAcceptor propertyResultAcceptor) {
		super("Verifying "+((NamedElement) verifiableElement).getName());
		this.verifiableElement = verifiableElement;
		this.optionsProvider = optionsProvider;
		this.propertyChoiceProvider = propertyChoiceProvider;
		this.propertyResultAcceptor = propertyResultAcceptor;
	}
		
	@Override
	protected IStatus run(IProgressMonitor monitor) {
		
		try {
			SubMonitor subMonitor = SubMonitor.convert(monitor, this.getName(), 100);
			
			//Clone model, mark verifiable element, etc.
			PrepareModelJob prepareJob = new PrepareModelJob(verifiableElement);
			status = prepareJob.execute(subMonitor.newChild(10));
			if (!status.isOK())
				return status;
			verifiableElement = prepareJob.getClonedVerifiableElement();
			ModelExtent mainInputExtent = prepareJob.getClonedExtent();
			
			//Prepare other necessary information (typically: show verification wizard)
			if (!propertyChoiceProvider.preparePropertyChoiceProvider(verifiableElement))
				return Status.CANCEL_STATUS;
			if (!optionsProvider.prepareOptionsProvider(verifiableElement))
				return Status.CANCEL_STATUS;
			
			//Remove the properties that are not supposed to be verified
			Iterator<VerificationConstraintRepository> repoIt = verifiableElement.getVerificationConstraintRepositories().iterator();
			while (repoIt.hasNext()) {
				//Remove constraints not chosen
				de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.PropertyRepository repo = (de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.PropertyRepository) repoIt.next();
				Iterator<Property> it = repo.getProperties().iterator();
				while (it.hasNext()) {
					Property property = it.next();
					if (!propertyChoiceProvider.isChosen(property))
						it.remove();
				}
			}
			
			//Start the verification job
			TransformationJob verifyJob = new TransformationJob("Running verification process", URI.createPlatformPluginURI("/de.uni_paderborn.fujaba.muml.verification.uppaal.transformation/transforms/VerifiableElement2Results.qvto", true));
			ModelExtent resultExtent = new BasicModelExtent();
			ModelExtent optionsExtent = new BasicModelExtent(Arrays.asList(new Options[] {optionsProvider.getOptions()}));
			verifyJob.setTransformationParameters(mainInputExtent, optionsExtent, resultExtent);
			status = verifyJob.execute(subMonitor.newChild(90));
			if (!status.isOK())
				return status;
			
			//Show results
			subMonitor.subTask("Showing Results");
			propertyResultAcceptor.acceptResult((PropertyResultRepository) resultExtent.getContents().get(0));
			
			return status;
		}
		finally {
			monitor.done();
		}
	}
}
