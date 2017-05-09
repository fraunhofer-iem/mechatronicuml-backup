package org.muml.uppaal.adapter.job.operations;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.muml.core.NamedElement;
import org.muml.core.common.blackbox.SaveXMIConfiguration;
import org.muml.pim.constraint.VerifiableElement;
import org.muml.pim.constraint.VerificationConstraintRepository;
import org.muml.pim.instance.ComponentInstanceConfiguration;
import org.muml.uppaal.NTA;
import org.muml.uppaal.adapter.extension.verificationextension.VerificationExtensionPackage;
import org.muml.uppaal.adapter.job.interfaces.VerificationOptionsProvider;
import org.muml.uppaal.adapter.job.interfaces.VerificationPropertyChoiceProvider;
import org.muml.uppaal.adapter.mtctl.Property;
import org.muml.uppaal.adapter.mtctl.quantifiers.TemporalQuantifierExpr;
import org.muml.uppaal.job.UppaalXMLSynthesisOperation;
import org.muml.uppaal.options.Options;
import org.muml.uppaal.requirements.PropertyRepository;
import org.muml.uppaal.requirements.impl.RequirementsFactoryImpl;
import org.muml.verification.core.reachanalysis.reachabilitygraph.rtsc.ZoneGraph;

public class Muml2TraceOperation implements IWorkspaceRunnable {
	
	private VerifiableElement verifiableElement;
	private ZoneGraph trace;
	protected VerificationOptionsProvider optionsProvider;
	protected VerificationPropertyChoiceProvider propertyChoiceProvider;
	private Property property;
	private boolean storeIntermediateModels;

	
	public Muml2TraceOperation(VerifiableElement verifiableElement, VerificationOptionsProvider optionsProvider, VerificationPropertyChoiceProvider propertyChoiceProvider, boolean storeIntermediateModels) {
		this.verifiableElement = verifiableElement;
		this.optionsProvider = optionsProvider;
		this.propertyChoiceProvider = propertyChoiceProvider;
		this.storeIntermediateModels = storeIntermediateModels;
	}

	public void run(IProgressMonitor monitor) throws CoreException {
		ResourceSet storeIntermediateModelsResourceSet = null;
		if (storeIntermediateModels) {
			storeIntermediateModelsResourceSet = new ResourceSetImpl();
		}
		ModelExtent reachabilityResultExtent;
		SaveXMIConfiguration.Options options = new SaveXMIConfiguration.Options();
		options.saveDirectly = false;
		options.resourceSet = storeIntermediateModelsResourceSet;
		SaveXMIConfiguration.pushOptions(options);
		try {
			SubMonitor subMonitor = SubMonitor.convert(monitor, "MUML to Trace Transformation", 100);
			
			//Clone model, mark verifiable element, etc.
			PrepareModelOperation prepareOperation = new PrepareModelOperation(verifiableElement);
			prepareOperation.run(subMonitor.newChild(10));
			verifiableElement = prepareOperation.getClonedVerifiableElement();
			ModelExtent clonedModel = prepareOperation.getClonedExtent();
			
			//Get verification options
			if (!optionsProvider.prepareOptionsProvider(verifiableElement))
				throw new OperationCanceledException();
			
			//Create CIC, run mtctl normalizations and split normalization to figure out which properties can be verified
			TransformationOperation verifiableElement2VerifiableCICOperation = new TransformationOperation("Creating equivalent CIC and splitting properties", URI.createPlatformPluginURI("/org.muml.uppaal.adapter.transformation/transforms/VerifiableElement2VerifiableCIC.qvto", true));
			//input, options, out propertySplitModel, out staticallyNormalized, out muml_cic
			ModelExtent verifiableCicExtent = new BasicModelExtent();
			ModelExtent optionsExtent = new BasicModelExtent(Arrays.asList(new Options[] {optionsProvider.getOptions()}));
			verifiableElement2VerifiableCICOperation.setTransformationParameters(clonedModel, optionsExtent, verifiableCicExtent, new BasicModelExtent(), new BasicModelExtent());
			verifiableElement2VerifiableCICOperation.run(subMonitor.newChild(20));
			
			//Find the new element to verify (now a CIC)
			EObject newCICtoVerify = null;
			for (EObject root : verifiableCicExtent.getContents()) {
				EObject obj = null;
				TreeIterator<EObject> it = root.eAllContents();
				while (it.hasNext()) {
					obj = it.next();
					if (obj instanceof VerifiableElement && ((VerifiableElement) obj).getExtension(VerificationExtensionPackage.eINSTANCE.getElementToVerifyExtension()) != null) {
						newCICtoVerify = obj;
						break;
					}
				}
			}
			assert newCICtoVerify != null && newCICtoVerify instanceof ComponentInstanceConfiguration;
			verifiableElement = (VerifiableElement) newCICtoVerify;
			
			//Get property choice for the CIC
			if (!propertyChoiceProvider.preparePropertyChoiceProvider(verifiableElement))
				throw new OperationCanceledException();
			
			//Remove the properties that are not supposed to be verified
			Iterator<VerificationConstraintRepository> repoIt = verifiableElement.getVerificationConstraintRepositories().iterator();
			int propertyCount = 0;
			Property lastProperty = null;
			while (repoIt.hasNext()) {
				//Remove constraints not chosen
				org.muml.uppaal.adapter.mtctl.PropertyRepository repo = (org.muml.uppaal.adapter.mtctl.PropertyRepository) repoIt.next();
				Iterator<Property> it = repo.getProperties().iterator();
				while (it.hasNext()) {
					Property property = it.next();
					if (!propertyChoiceProvider.isChosen(property))
						it.remove();
					else {
						propertyCount++;
						lastProperty = property;
					}
				}
				if (repo.getProperties().isEmpty())
					repoIt.remove();
			}
			
			if (propertyCount != 1 || !(lastProperty.getExpression() instanceof TemporalQuantifierExpr)) {
				throw new CoreException(new Status(Status.ERROR, "org.muml.uppaal.adapter.job", "Please select exactly one simple property verifiable with Uppaal"));
			}
			this.property = lastProperty;
			//Verify the resulting CIC with the one property
			TransformationOperation mainTransformation = new TransformationOperation("MUML to Trace Transformation", URI.createPlatformPluginURI("/org.muml.uppaal.adapter.transformation/transforms/VerifiableElement2Trace.qvto", true));
			

			// Set config properties
			Map<String, Object> configProperties = new HashMap<String, Object>();
			configProperties.put(TransformationOperation.CONFIG_STORE_INTERMEDIATE_MODELS, storeIntermediateModels);
			mainTransformation.setTransformationConfigProperties(configProperties);
			
			
			reachabilityResultExtent = new BasicModelExtent();
			ModelExtent uppaalModelExtent = new BasicModelExtent();
			ModelExtent uppaalReqModelExtent = new BasicModelExtent();
			
			mainTransformation.setTransformationParameters(verifiableCicExtent, optionsExtent, reachabilityResultExtent, uppaalModelExtent, uppaalReqModelExtent);
			mainTransformation.run(subMonitor.newChild(70));

			//Finished
			trace = (ZoneGraph) reachabilityResultExtent.getContents().get(0);
						
			
			
			// 
			// Store intermediate models if requested
			//
			if (storeIntermediateModels) {
				storeIntermediateModels(storeIntermediateModelsResourceSet, reachabilityResultExtent, subMonitor, uppaalModelExtent, uppaalReqModelExtent, verifiableElement);
			}
			
			if (monitor.isCanceled()) {
				throw new OperationCanceledException();
			}
		}
		finally {

			for (Resource resource : storeIntermediateModelsResourceSet.getResources()) {
				try {
					resource.save(Collections.EMPTY_MAP);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			ResourcesPlugin.getWorkspace().getRoot().refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
			
			SaveXMIConfiguration.popOptions();
			monitor.done();
		}
			
	}

	public static void storeIntermediateModels(ResourceSet resSet, ModelExtent reachabilityResultExtent, SubMonitor subMonitor,
			ModelExtent uppaalModelExtent, ModelExtent uppaalReqModelExtent, VerifiableElement verifiableElement) throws CoreException {
		

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
		
		{
			subMonitor.subTask("Save NTA");
			URI uri = URI.createPlatformResourceURI(targetPath.append(((NamedElement) verifiableElement).getName())
					.addFileExtension("uppaal").toPortableString(), true);
			
			Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
			Map<String, Object> m = reg.getExtensionToFactoryMap();
			m.put("uppaal", new XMIResourceFactoryImpl());

			Resource resource = resSet.createResource(uri);
			resource.getContents().add(nta);

			subMonitor.worked(15);
		}

		{
			subMonitor.subTask("Save Properties");
			URI propertyUri = URI
					.createPlatformResourceURI(targetPath.append(((NamedElement) verifiableElement).getName())
							.addFileExtension("requirements").toPortableString(), true);

			Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
			Map<String, Object> m = reg.getExtensionToFactoryMap();
			m.put("requirements", new XMIResourceFactoryImpl());


			Resource resource = resSet.createResource(propertyUri);
			resource.getContents().add(propertyRepository);

			subMonitor.worked(15);
		}
		
		if (reachabilityResultExtent != null)
		{
			List<Resource> problematicResources = new ArrayList<Resource>();
			subMonitor.subTask("Save Proxies");
			for (EObject e : reachabilityResultExtent.getContents()) {	
				Iterator<?> it = EcoreUtil.getAllContents(e, false);
				while (it.hasNext()) {
					EObject e2 = (EObject) it.next();
					for (EReference ref : e2.eClass().getEAllReferences()) {
						// Safely get reference value
						Object values = null;
						try {
							values = e2.eGet(ref);
						} catch (Exception x) {
						}
						if (values != null) {
							if (!ref.isMany()) {
								values = Collections.singletonList(values); 
							}
						
							for (Object value : (Collection<?>) values) {
								if (value instanceof EObject) {
									EObject eValue = (EObject) value;
									Resource eResource = eValue.eResource();
									if (eResource != null) {
										URI uri = eResource.getURI();
										if (uri != null && !uri.isPlatform()) {
											if (!problematicResources.contains(eResource)) {
												problematicResources.add(eResource);
											}
										}
									}
								}							
							}
						}
					}
				}						
			}
			
			int i = 1;
			for (Resource problematicResource : problematicResources) {
				Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
				Map<String, Object> m = reg.getExtensionToFactoryMap();
				m.put("muml", new XMIResourceFactoryImpl());

				// Create a resource
				Resource resource = resSet.createResource(URI.createPlatformResourceURI(targetPath.append("11_externals" + i + ".muml").toPortableString(), true));
				resource.getContents().addAll(problematicResource.getContents());

				i++;
			}
		}
		
		if (reachabilityResultExtent != null)
		{
			subMonitor.subTask("Save Output");

			Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
			Map<String, Object> m = reg.getExtensionToFactoryMap();
			m.put("muml", new XMIResourceFactoryImpl());

			// Create a resource
			Resource resource = resSet.createResource(URI.createPlatformResourceURI(targetPath.append("12_output.muml").toPortableString(), true));
			resource.getContents().addAll(reachabilityResultExtent.getContents());
			subMonitor.worked(15);
		
		}
		

		String fullPath = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString() + "/intermediate_models";
		final IPath path = new Path(fullPath);
		IWorkspaceRunnable xmlSynthesis = new UppaalXMLSynthesisOperation(nta, propertyRepository, path, true);

		xmlSynthesis.run(subMonitor.newChild(30));
	};
	
	
	
	public Property getProperty() { return property; }
	public ZoneGraph getTrace() {		
		return trace;
	}
	
}
