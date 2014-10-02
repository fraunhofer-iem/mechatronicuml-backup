package de.uni_paderborn.fujaba.muml.verification.uppaal.job;

import java.util.Arrays;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ModelExtent;

import de.uni_paderborn.fujaba.muml.constraint.VerifiableElement;
import de.uni_paderborn.fujaba.muml.verification.uppaal.job.interfaces.VerificationOptionsProvider;
import de.uni_paderborn.fujaba.muml.verification.uppaal.options.Options;
import de.uni_paderborn.uppaal.NTA;
import de.uni_paderborn.uppaal.requirements.PropertyRepository;
import de.uni_paderborn.uppaal.requirements.impl.RequirementsFactoryImpl;

public class Muml2UppaalJob extends SynchronousJob {
	
	private VerifiableElement verifiableElement;
	private NTA nta;
	private PropertyRepository propertyRepository;
	private VerificationOptionsProvider optionsProvider;
	
	public Muml2UppaalJob(VerifiableElement verifiableElement, VerificationOptionsProvider optionsProvider) {
		super("MUML to UPPAAL Transformation");
		this.verifiableElement = verifiableElement;
		this.optionsProvider = optionsProvider;
	}
		
	@Override
	protected IStatus run(IProgressMonitor monitor) {
		IStatus status;
		
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
			if (!optionsProvider.prepareOptionsProvider(verifiableElement))
				return Status.CANCEL_STATUS;
			
			//Start the verification job
			TransformationJob verifyJob = new TransformationJob("Running verification process", URI.createPlatformPluginURI("/de.uni_paderborn.fujaba.muml.verification.uppaal.transformation/transforms/VerifiableElement2UPPAAL.qvto", true));
			ModelExtent uppaalModelExtent = new BasicModelExtent();
			ModelExtent uppaalReqModelExtent = new BasicModelExtent();
			ModelExtent optionsExtent = new BasicModelExtent(Arrays.asList(new Options[] {optionsProvider.getOptions()}));
			verifyJob.setTransformationParameters(mainInputExtent, optionsExtent, uppaalModelExtent, uppaalReqModelExtent, new BasicModelExtent(), new BasicModelExtent(), new BasicModelExtent());
			status = verifyJob.execute(subMonitor.newChild(90));
			
			//Make results available
			if (uppaalModelExtent.getContents().size() != 0)
				nta = (NTA) uppaalModelExtent.getContents().get(0);
			if (uppaalReqModelExtent.getContents().size() != 0)
				propertyRepository = (PropertyRepository) uppaalReqModelExtent.getContents().get(0);
			else
				propertyRepository = RequirementsFactoryImpl.eINSTANCE.createPropertyRepository();
			
			if (!status.isOK())
				return status;
			
			if (monitor.isCanceled()) 
				return Status.CANCEL_STATUS;
			
			return Status.OK_STATUS;
		
		}
		finally {
			monitor.done();
		}
	};
	
	public NTA getNTA() {
		try {
			join();
		} catch (InterruptedException e) {
			return null;
		}
		
		return nta;
		
	}
	
	public PropertyRepository getPropertyRepository() {
		try {
			join();
		} catch (InterruptedException e) {
			return null;
		}
		
		return propertyRepository;
	}
	
}
