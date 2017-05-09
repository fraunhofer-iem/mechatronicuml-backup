package org.muml.uppaal.adapter.job;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.muml.core.NamedElement;
import org.muml.core.common.blackbox.SaveXMIConfiguration;
import org.muml.pim.constraint.VerifiableElement;
import org.muml.pim.constraint.VerificationConstraintRepository;
import org.muml.uppaal.adapter.job.interfaces.VerificationOptionsProvider;
import org.muml.uppaal.adapter.job.interfaces.VerificationPropertyChoiceProvider;
import org.muml.uppaal.adapter.job.interfaces.VerificationPropertyResultAcceptor;
import org.muml.uppaal.adapter.job.operations.Muml2TraceOperation;
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
	protected boolean storeIntermediateModels;

	public VerifyForResultsJob(final VerifiableElement verifiableElement, VerificationOptionsProvider optionsProvider,
			VerificationPropertyChoiceProvider propertyChoiceProvider,
			VerificationPropertyResultAcceptor propertyResultAcceptor) {
		super("Verifying " + ((NamedElement) verifiableElement).getName());
		this.verifiableElement = verifiableElement;
		this.optionsProvider = optionsProvider;

		this.propertyChoiceProvider = propertyChoiceProvider;
		this.propertyResultAcceptor = propertyResultAcceptor;
		if (org.muml.uppaal.adapter.log.UppaalAdapterLogPlugin.getDefault().shouldDoStatisticalEvaluation()) {
			this.addJobChangeListener(new JobChangeAdapter() {
				@Override
				public void done(IJobChangeEvent event) {
					if (!event.getResult().isOK()) {
						org.muml.uppaal.adapter.log.UppaalAdapterLogPlugin.getDefault().setRestartRunnable(null);
					}
					String elementName = (verifiableElement instanceof NamedElement)
							? ((NamedElement) verifiableElement).getName() : "";
					org.muml.uppaal.adapter.log.UppaalAdapterLogPlugin.getDefault().evaluationDone(elementName, null,
							false);
				}
			});
		}
	}

	public boolean isStoreIntermediateModels() {
		return storeIntermediateModels;
	}

	public void setStoreIntermediateModels(boolean storeIntermediateModels) {
		this.storeIntermediateModels = storeIntermediateModels;
	}

	@Override
	protected IStatus run(IProgressMonitor monitor) {
		ResourceSet storeIntermediateModelsResourceSet = null;
		if (storeIntermediateModels) {
			storeIntermediateModelsResourceSet = new ResourceSetImpl();
		}
		ModelExtent reachabilityResultExtent = null;
		SaveXMIConfiguration.Options options = new SaveXMIConfiguration.Options();
		options.saveDirectly = false;
		options.resourceSet = storeIntermediateModelsResourceSet;
		SaveXMIConfiguration.pushOptions(options);
		try {
			SubMonitor subMonitor = SubMonitor.convert(monitor, this.getName(), 100);

			// Clone model, mark verifiable element, etc.
			// if
			// (org.muml.uppaal.adapter.log.UppaalAdapterLogPlugin.getDefault().shouldDoStatisticalEvaluation())
			// {
			// org.muml.uppaal.adapter.log.UppaalAdapterLogPlugin.getDefault().logInfo("Startup:
			// Clone model, mark verifiable element, etc.");
			// }
			PrepareModelOperation prepareOperation = new PrepareModelOperation(verifiableElement);
			try {
				prepareOperation.run(subMonitor.split(10, SubMonitor.SUPPRESS_NONE));
			} catch (CoreException e) {
				return e.getStatus();
			}
			verifiableElement = prepareOperation.getClonedVerifiableElement();
			ModelExtent mainInputExtent = prepareOperation.getClonedExtent();


			// Prepare other necessary information (typically: show verification
			// wizard)
			// if
			// (org.muml.uppaal.adapter.log.UppaalAdapterLogPlugin.getDefault().shouldDoStatisticalEvaluation())
			// {
			// org.muml.uppaal.adapter.log.UppaalAdapterLogPlugin.getDefault().logInfo("Startup:
			// Prepare other necessary information (typically: show verification
			// wizard)");
			// }
			if (!propertyChoiceProvider.preparePropertyChoiceProvider(verifiableElement))
				return Status.CANCEL_STATUS;
			if (!optionsProvider.prepareOptionsProvider(verifiableElement))
				return Status.CANCEL_STATUS;

			// Remove the properties that are not supposed to be verified
			// if
			// (org.muml.uppaal.adapter.log.UppaalAdapterLogPlugin.getDefault().shouldDoStatisticalEvaluation())
			// {
			// org.muml.uppaal.adapter.log.UppaalAdapterLogPlugin.getDefault().logInfo("Startup:
			// Remove the properties that are not supposed to be verified");
			// }
			Iterator<VerificationConstraintRepository> repoIt = verifiableElement
					.getVerificationConstraintRepositories().iterator();
			while (repoIt.hasNext()) {
				// Remove constraints not chosen
				org.muml.uppaal.adapter.mtctl.PropertyRepository repo = (org.muml.uppaal.adapter.mtctl.PropertyRepository) repoIt
						.next();
				Iterator<Property> it = repo.getProperties().iterator();
				while (it.hasNext()) {
					Property property = it.next();
					if (!propertyChoiceProvider.isChosen(property))
						it.remove();
				}
			}

			// if
			// (org.muml.uppaal.adapter.log.UppaalAdapterLogPlugin.getDefault().shouldDoStatisticalEvaluation())
			// {
			// org.muml.uppaal.adapter.log.UppaalAdapterLogPlugin.getDefault().logInfo("Startup:
			// set input and output extents for verification job");
			// }
			// set input and output extents for verification job
			TransformationOperation verifyOperation = new TransformationOperation("Running verification process",
					URI.createPlatformPluginURI(
							"/org.muml.uppaal.adapter.transformation/transforms/VerifiableElement2Results.qvto", true));
			ModelExtent resultExtent = new BasicModelExtent();
			ModelExtent uppaalModelExtent = new BasicModelExtent();
			ModelExtent uppaalReqModelExtent = new BasicModelExtent();
			ModelExtent optionsExtent = new BasicModelExtent(
					Arrays.asList(new Options[] { optionsProvider.getOptions() }));
			verifyOperation.setTransformationParameters(mainInputExtent, optionsExtent, resultExtent, uppaalModelExtent,
					uppaalReqModelExtent);

			// if
			// (org.muml.uppaal.adapter.log.UppaalAdapterLogPlugin.getDefault().shouldDoStatisticalEvaluation())
			// {
			// org.muml.uppaal.adapter.log.UppaalAdapterLogPlugin.getDefault().logInfo("Startup:
			// Set config properties");
			// }
			// Set config properties
			Map<String, Object> configProperties = new HashMap<String, Object>();
			configProperties.put(TransformationOperation.CONFIG_STORE_INTERMEDIATE_MODELS, storeIntermediateModels);
			verifyOperation.setTransformationConfigProperties(configProperties);

			// Run verification job
			try {
				verifyOperation.run(subMonitor.split(90, SubMonitor.SUPPRESS_NONE));
			} catch (CoreException e) {
				return e.getStatus();
			}

			if (org.muml.uppaal.adapter.log.UppaalAdapterLogPlugin.getDefault().shouldDoStatisticalEvaluation()) {
				org.muml.uppaal.adapter.log.UppaalAdapterLogPlugin.getDefault().logInfo("Results Presentation");
			}

			// Show results
			subMonitor.subTask("Showing Results");
			if (!org.muml.uppaal.adapter.log.UppaalAdapterLogPlugin.getDefault().shouldDoStatisticalEvaluation()) {
				propertyResultAcceptor.acceptResult((PropertyResultRepository) resultExtent.getContents().get(0));
			}

			//
			// Store uppaal models if requested
			//
			if (storeIntermediateModels) {
				Muml2TraceOperation.storeIntermediateModels(storeIntermediateModelsResourceSet, reachabilityResultExtent, subMonitor, uppaalModelExtent, uppaalReqModelExtent, verifiableElement);
			}

		} catch (CoreException e) {
			e.printStackTrace();
			
		} finally {
			
			if (storeIntermediateModels) {
		
				for (Resource resource : storeIntermediateModelsResourceSet.getResources()) {
					try {
						resource.save(Collections.EMPTY_MAP);
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				
				try {
					ResourcesPlugin.getWorkspace().getRoot().refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
				} catch (CoreException e) {
					e.printStackTrace();
				}
			}
			
			SaveXMIConfiguration.popOptions();
			monitor.done();
		}
		return Status.OK_STATUS;
	}
}
