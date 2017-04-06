package org.muml.uppaal.adapter.job;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.muml.core.NamedElement;
import org.muml.pim.constraint.VerifiableElement;
import org.muml.pim.constraint.VerificationConstraintRepository;
import org.muml.uppaal.NTA;
import org.muml.uppaal.adapter.job.interfaces.VerificationOptionsProvider;
import org.muml.uppaal.adapter.job.interfaces.VerificationPropertyChoiceProvider;
import org.muml.uppaal.adapter.job.interfaces.VerificationPropertyResultAcceptor;
import org.muml.uppaal.adapter.job.operations.PrepareModelOperation;
import org.muml.uppaal.adapter.job.operations.TransformationOperation;
import org.muml.uppaal.adapter.mtctl.Property;
import org.muml.uppaal.adapter.results.PropertyResultRepository;
import org.muml.uppaal.job.UppaalXMLSynthesisOperation;
import org.muml.uppaal.options.Options;
import org.muml.uppaal.requirements.PropertyRepository;
import org.muml.uppaal.requirements.impl.RequirementsFactoryImpl;

public class VerifyForResultsJob extends Job {
	
	protected VerificationOptionsProvider optionsProvider;
	protected VerificationPropertyChoiceProvider propertyChoiceProvider;
	protected VerificationPropertyResultAcceptor propertyResultAcceptor;
	protected VerifiableElement verifiableElement;
	private boolean storeIntermediateModels;

	public VerifyForResultsJob(final VerifiableElement verifiableElement, VerificationOptionsProvider optionsProvider, VerificationPropertyChoiceProvider propertyChoiceProvider, VerificationPropertyResultAcceptor propertyResultAcceptor) {
		super("Verifying "+((NamedElement) verifiableElement).getName());
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
					String elementName = (verifiableElement instanceof NamedElement) ? ((NamedElement) verifiableElement).getName() : "";
					org.muml.uppaal.adapter.log.UppaalAdapterLogPlugin.getDefault().evaluationDone(elementName, null, false);
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
		try {
			SubMonitor subMonitor = SubMonitor.convert(monitor, this.getName(), 100);
			
			//Clone model, mark verifiable element, etc.
			PrepareModelOperation prepareOperation = new PrepareModelOperation(verifiableElement);
			try {
				prepareOperation.run(subMonitor.split(10, SubMonitor.SUPPRESS_NONE));
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
			ModelExtent uppaalModelExtent = new BasicModelExtent();
			ModelExtent uppaalReqModelExtent = new BasicModelExtent();
			ModelExtent optionsExtent = new BasicModelExtent(Arrays.asList(new Options[] {optionsProvider.getOptions()}));
			verifyOperation.setTransformationParameters(mainInputExtent, optionsExtent, resultExtent, uppaalModelExtent, uppaalReqModelExtent);
			
			// Set config properties
			Map<String, Object> configProperties = new HashMap<String, Object>();
			configProperties.put(TransformationOperation.CONFIG_STORE_INTERMEDIATE_MODELS, storeIntermediateModels);
			verifyOperation.setTransformationConfigProperties(configProperties);
			
			// Run verification job
			try {
				verifyOperation.run(subMonitor.split(90, SubMonitor.SUPPRESS_NONE));
			}
			catch(CoreException e) {
				return e.getStatus();
			}
						
			//Show results
			subMonitor.subTask("Showing Results");
			if (!org.muml.uppaal.adapter.log.UppaalAdapterLogPlugin.getDefault().shouldDoStatisticalEvaluation()) {
				propertyResultAcceptor.acceptResult((PropertyResultRepository) resultExtent.getContents().get(0));
			}
			
			
			// 
			// Store uppaal models if requested
			//
			if (storeIntermediateModels) {
				NTA nta = null;
				PropertyRepository propertyRepository;
				if (uppaalModelExtent.getContents().size() != 0)
					nta = (NTA) uppaalModelExtent.getContents().get(0);
				if (uppaalReqModelExtent.getContents().size() != 0)
					propertyRepository = (PropertyRepository) uppaalReqModelExtent.getContents().get(0);
				else
					propertyRepository = RequirementsFactoryImpl.eINSTANCE.createPropertyRepository();		
				
				IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject("intermediate_models");
				try {
					if (!project.exists()) {
						project.create(new NullProgressMonitor());
					}
					if (!project.isOpen()) {
						project.open(new NullProgressMonitor());
					}
				} catch (CoreException e) {
				}
				IPath targetPath = project.getFullPath();
				URI uri = URI.createPlatformResourceURI(targetPath.append(((NamedElement) verifiableElement).getName())
						.addFileExtension("uppaal").toPortableString(), true);
				URI propertyUri = URI
						.createPlatformResourceURI(targetPath.append(((NamedElement) verifiableElement).getName())
								.addFileExtension("requirements").toPortableString(), true);
	
				{
					subMonitor.subTask("Save NTA");
	
					Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
					Map<String, Object> m = reg.getExtensionToFactoryMap();
					m.put("uppaal", new XMIResourceFactoryImpl());
	
					// Obtain a new resource set
					ResourceSet resSet = new ResourceSetImpl();
	
					// Create a resource
					Resource resource = resSet.createResource(uri);
					// Get the first model element and cast it to the right type, in
					// my
					// example everything is hierarchical included in this first
					// node
					resource.getContents().add(nta);
	
					// Now save the content.
					try {
						resource.save(Collections.EMPTY_MAP);
					} catch (IOException e) {
						return BasicDiagnostic.toIStatus(BasicDiagnostic.toDiagnostic(e));
					}
	
					subMonitor.worked(15);
				}
	
				{
					subMonitor.subTask("Save Properties");
	
					Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
					Map<String, Object> m = reg.getExtensionToFactoryMap();
					m.put("requirements", new XMIResourceFactoryImpl());
	
					// Obtain a new resource set
					ResourceSet resSet = new ResourceSetImpl();
	
					// Create a resource
					Resource resource = resSet.createResource(propertyUri);
					// Get the first model element and cast it to the right type, in
					// my
					// example everything is hierarchical included in this first
					// node
					resource.getContents().add(propertyRepository);
	
					// Now save the content.
					try {
						resource.save(Collections.EMPTY_MAP);
					} catch (IOException e) {
						return BasicDiagnostic.toIStatus(BasicDiagnostic.toDiagnostic(e));
					}
	
					subMonitor.worked(15);
				}
				
				String fullPath = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString() + "/intermediate_models";
				final IPath path = new Path(fullPath);
				IWorkspaceRunnable xmlSynthesis = new UppaalXMLSynthesisOperation(nta, propertyRepository, path, true);
	
				try {
					xmlSynthesis.run(subMonitor.newChild(30));
				} catch (CoreException e) {
					return e.getStatus();
				}
				
				try {
					ResourcesPlugin.getWorkspace().getRoot().refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
		    	} catch (CoreException e) {
		    		return e.getStatus();
		    	}
	
			}
			
			return Status.OK_STATUS;
		}
		finally {
			monitor.done();
		}
	}
}

