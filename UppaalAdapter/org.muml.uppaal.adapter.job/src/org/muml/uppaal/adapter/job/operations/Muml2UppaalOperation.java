package org.muml.uppaal.adapter.job.operations;

import java.util.Arrays;

import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.muml.pim.constraint.VerifiableElement;
import org.muml.uppaal.NTA;
import org.muml.uppaal.adapter.job.interfaces.VerificationOptionsProvider;
import org.muml.uppaal.adapter.options.Options;
import org.muml.uppaal.requirements.PropertyRepository;
import org.muml.uppaal.requirements.impl.RequirementsFactoryImpl;

public class Muml2UppaalOperation implements IWorkspaceRunnable {
	
	private VerifiableElement verifiableElement;
	private NTA nta;
	private PropertyRepository propertyRepository;
	private VerificationOptionsProvider optionsProvider;
	
	public Muml2UppaalOperation(VerifiableElement verifiableElement, VerificationOptionsProvider optionsProvider) {
		this.verifiableElement = verifiableElement;
		this.optionsProvider = optionsProvider;
	}
		
	@Override
	public void run(IProgressMonitor monitor) throws CoreException {
			
		try {
			SubMonitor subMonitor = SubMonitor.convert(monitor, "MUML to UPPAAL Transformation", 100);
			
			//Clone model, mark verifiable element, etc.
			PrepareModelOperation prepareOperation = new PrepareModelOperation(verifiableElement);
			prepareOperation.run(subMonitor.newChild(10));
			
			verifiableElement = prepareOperation.getClonedVerifiableElement();
			ModelExtent mainInputExtent = prepareOperation.getClonedExtent();
			
			//Prepare other necessary information (typically: show verification wizard)
			if (!optionsProvider.prepareOptionsProvider(verifiableElement))
				throw new OperationCanceledException();
			
			//Start the verification job
			TransformationOperation verifyOperation = new TransformationOperation("Running verification process", URI.createPlatformPluginURI("/org.muml.uppaal.adapter.transformation/transforms/VerifiableElement2UPPAAL.qvto", true));
			ModelExtent uppaalModelExtent = new BasicModelExtent();
			ModelExtent uppaalReqModelExtent = new BasicModelExtent();
			ModelExtent optionsExtent = new BasicModelExtent(Arrays.asList(new Options[] {optionsProvider.getOptions()}));
			verifyOperation.setTransformationParameters(mainInputExtent, optionsExtent, uppaalModelExtent, uppaalReqModelExtent, new BasicModelExtent(), new BasicModelExtent(), new BasicModelExtent());
			verifyOperation.run(subMonitor.newChild(90));
			
			//Make results available
			if (uppaalModelExtent.getContents().size() != 0)
				nta = (NTA) uppaalModelExtent.getContents().get(0);
			if (uppaalReqModelExtent.getContents().size() != 0)
				propertyRepository = (PropertyRepository) uppaalReqModelExtent.getContents().get(0);
			else
				propertyRepository = RequirementsFactoryImpl.eINSTANCE.createPropertyRepository();		
		}
		finally {
			monitor.done();
		}
	};
	
	public NTA getNTA() {
		return nta;
	}
	
	public PropertyRepository getPropertyRepository() {
		return propertyRepository;
	}
	
}
